package edu.kit.kastel.sdq.coupling.sourcecodeanalysis.joanaexecution;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.kit.kastel.sdq.coupling.sourcecodeanalysis.joanaexecution.filehandling.FileToGenerate;

public class JoanaExecution{

	private final static String RUN_TEMPLATE = "run %s --out=%s/%s";
	private final static String ENABLE_INTERFACE_FLOWS = "sdgOptions enableUninitializedFieldTypes";
	private final static String CLASS_PATH_TEMPLATE = "classPath %s";
	private final static String OUTPUT_FILE_NAME_TEMPLATE = "output%s.txt";
	private static String tmpDirectoryLocation = "";
	private final static String FLOW_FOUND_INDICATOR = "found_flows: true";

	public static void main(String[] args) {
		
		//ARGS: MAKE CLI, now static for eval:
		// [0]: Base ProjectPath
		// [0]: Source Code base package path
		// [1]: Path to EntryPoints
		// [2]: Output Directory
		// [3]: Java-Compiler Path
		// [4]: Java-Runtime Path
		// [5]: JOANA CLI Path
		
		
		
//		String analysisProjectPath = Path.of(args[0]).toAbsolutePath().toString();
//		String joanaSourceCodeBasePackagePath = Path.of(args[1]).toAbsolutePath().toString();
//		String entryPointsFilePath = Path.of(args[2]).toAbsolutePath().toString();
//		String outputFilePath = Path.of(args[3]).toAbsolutePath().toString();
//		String javaCompilerPath = Path.of(args[4]).toAbsolutePath().toString();
//		String javaRuntimePath = Path.of(args[5]).toAbsolutePath().toString();
//		String joanaCLIPath = Path.of(args[6]).toAbsolutePath().toString();
		
		
		String analysisProjectPath = args[0];
		String joanaSourceCodeBasePackagePath = args[1];
		String entryPointsFilePath = args[2];
		String outputFilePath = args[3];
		String javaCompilerPath = args[4];
		String javaRuntimePath = args[5];
		String joanaCLIPath = args[6];
		
		execute(analysisProjectPath, joanaSourceCodeBasePackagePath, entryPointsFilePath, outputFilePath, javaCompilerPath, javaRuntimePath, joanaCLIPath);
	}
	
	private static void execute(String projectLocation, String projectCodeBasePackageLocation, String entryPointIDsFileLocation, String outputFileLocation, String javaCompilerLocation, String javaRuntimeLocation, String joanaJarLocation) {
		compileJOANACode(projectCodeBasePackageLocation, javaCompilerLocation, joanaJarLocation);

		Collection<String> entryPointIDs = getEntryPointIDs(Path.of(entryPointIDsFileLocation).toFile());
		executeJOANA(projectLocation, entryPointIDs, javaRuntimeLocation, joanaJarLocation);

		String combinedResult = combineResults(entryPointIDs, tmpDirectoryLocation);
		
		FileToGenerate file = new FileToGenerate(combinedResult, outputFileLocation);
		file.write();
		
		//Cleanup after collecting results
		try {
			deleteClassFilesRecursively(Path.of(projectCodeBasePackageLocation).toAbsolutePath().toFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
		Path.of(tmpDirectoryLocation).toFile().delete();
	}

	private static void executeJOANA(String projectLocation, Collection<String> entryPointIDs, String javaRuntimeLocation, String joanaJarLocation) {

		try {
			Path tmp = Files.createTempDirectory("joanaResults");
			tmpDirectoryLocation = tmp.toAbsolutePath().toString();
			tmpDirectoryLocation = tmpDirectoryLocation.replaceAll(Pattern.quote("\\"), Matcher.quoteReplacement("\\\\"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String entryPointID : entryPointIDs) {
			System.out.println("Executing JOANA for EntryPoint " + entryPointID);
			List<String> executionCommand = new ArrayList<String>();

			executionCommand.add(javaRuntimeLocation);
			executionCommand.add("-jar");
			executionCommand.add(joanaJarLocation);
			executionCommand.add(String.format(CLASS_PATH_TEMPLATE, projectLocation));
			executionCommand.add(ENABLE_INTERFACE_FLOWS);

			String outputFileName = String.format(OUTPUT_FILE_NAME_TEMPLATE, entryPointID);

			executionCommand
					.add(String.format(RUN_TEMPLATE, entryPointID.trim(), tmpDirectoryLocation, outputFileName));

			ProcessBuilder processBuilder = new ProcessBuilder(executionCommand);

			try {
				Process pr = processBuilder.start();
				pr.waitFor();
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static String generateTempJOANAOutputFileName(String entryPointID) {
		return String.format(OUTPUT_FILE_NAME_TEMPLATE, entryPointID);
	}

	private static String generatePathToTempJOANAOutputFile(String tempDirectoryPath, String entryPointID) {
		return String.format("%s/%s", tempDirectoryPath, generateTempJOANAOutputFileName(entryPointID));
	}

	private static Collection<String> getEntryPointIDs(File entryPointIDsFile) {
		Collection<String> entryPointIDs = new ArrayList<String>();
		String entryPointIDsFileContent = "";

		try {
			entryPointIDsFileContent = Files.readString(entryPointIDsFile.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(entryPointIDsFileContent);

		while (scanner.hasNext()) {
			String id = scanner.nextLine();
			entryPointIDs.add(id.strip());
		}

		scanner.close();

		return entryPointIDs;
	}

	private static String combineResults(Collection<String> entryPointIDs, String tmpDirectoryLocation) {

		String combined = "";

		for (String entryPointID : entryPointIDs) {

			String fileLocation = generatePathToTempJOANAOutputFile(tmpDirectoryLocation, entryPointID);

			Path pathToFile = Path.of(fileLocation).toAbsolutePath();

			String fileContent = "";
			if (pathToFile.toFile().exists()) {
				try {
					fileContent = Files.readString(pathToFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (fileContent.contains(FLOW_FOUND_INDICATOR)) {
					if (combined.isBlank()) {
						combined = fileContent;
					} else {
						combined = String.join(System.lineSeparator(), combined, fileContent);
					}
				}

				pathToFile.toFile().delete();

			}
		}

		return combined;

	}

	private static void compileJOANACode(String baseDirectoryLocation, String javaCompilerPath, String joanaCLIPath) {

		File baseDirectory = Path.of(baseDirectoryLocation).toFile();

		if (baseDirectory.isDirectory()) {
			try {
				deleteClassFilesRecursively(baseDirectory);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Collection<String> javaFilePaths = javaFilePaths(baseDirectory.toPath().toAbsolutePath());

		List<String> buildCommand = new ArrayList<String>();

		buildCommand.add(javaCompilerPath);
		buildCommand.add("-cp");
		buildCommand.add(joanaCLIPath);
		buildCommand.addAll(javaFilePaths);

		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command(buildCommand);
		try {
			Process pr = processBuilder.inheritIO().start();
			pr.waitFor();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Compiled Project");
	}

	private static void deleteClassFilesRecursively(File baseDirectory) throws IOException {

		try (Stream<Path> stream = Files.walk(baseDirectory.toPath())) {
			stream.filter(Files::isRegularFile).map(path -> path.toFile())
					.filter(file -> file.getPath().endsWith(".class")).forEach(file -> {
						file.delete();
					});
		}
	}

	private static Collection<String> javaFilePaths(Path baseDirectory) {

		Collection<String> filePaths = new ArrayList<String>();
		Collection<File> files = new ArrayList<File>();
		try {
			files = Files.walk(baseDirectory).filter(Files::isRegularFile).map(Path::toFile)
					.collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		files.stream().forEach(file -> {
			filePaths.add(file.getAbsolutePath());
		});

		return filePaths;
	}

}
