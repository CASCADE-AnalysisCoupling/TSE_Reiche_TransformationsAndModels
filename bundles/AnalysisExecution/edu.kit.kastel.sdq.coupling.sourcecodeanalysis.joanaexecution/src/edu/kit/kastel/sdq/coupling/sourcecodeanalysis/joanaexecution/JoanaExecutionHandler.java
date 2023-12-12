package edu.kit.kastel.sdq.coupling.sourcecodeanalysis.joanaexecution;

import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class JoanaExecutionHandler extends AbstractHandler {

	private final static String JAVA8_RUNTIME_PATH = Path.of("/usr/lib/jvm/java-1.8.0-openjdk-amd64/bin/java")
			.toAbsolutePath().toString();
	private final static String JAVA8_COMPILER_PATH = Path.of("/usr/lib/jvm/java-1.8.0-openjdk-amd64/bin/javac")
			.toAbsolutePath().toString();
	private final static String ACCESS_ANALYSIS_TRAVELPLANNER_PROJECT_PATH_JOANA = Path.of(
			"/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner/Code/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.code.joana4accessanalysis")
			.toAbsolutePath().toString();
	private final static String ACCESS_ANALYSIS_TRAVELPLANNER_PATH_BASE_PACKAGE_PATH = Path
			.of(String.format("%s/%s", ACCESS_ANALYSIS_TRAVELPLANNER_PROJECT_PATH_JOANA,
					"/src/edu/kit/kastel/sdq/coupling/casestudy/travelplanner"))
			.toAbsolutePath().toString();
	private final static String JOANA_PATH = Path
			.of("/home/frederik/Arbeitsplatz/git/tools/joana/dist/joana.ui.ifc.wala.cli.jar").toAbsolutePath()
			.toString();
	private final static String ENTRY_POINT_IDS_FILE_PATH = Path
			.of(String.format("%s/%s", ACCESS_ANALYSIS_TRAVELPLANNER_PROJECT_PATH_JOANA, "/entryPointIDs.txt"))
			.toAbsolutePath().toString();
	private final static String OUTPUT_DIRECTORY = Path.of(
			"/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner/SCAR/JOANA")
			.toAbsolutePath().toString();
	private final static String RUN_TEMPLATE = "run %s --out=%s/%s";
	private final static String ENABLE_INTERFACE_FLOWS = "sdgOptions enableUninitializedFieldTypes";
	private final static String CLASS_PATH_TEMPLATE = "classPath %s";
	private final static String OUTPUT_FILE_NAME_TEMPLATE = "output%s.txt";
	private static String tmpDirectoryLocation = "";
	private final static String OUTPUT_NAME = "joanaResult";
	private final static String FLOW_FOUND_INDICATOR = "found_flows: true";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		executeJOANA(ACCESS_ANALYSIS_TRAVELPLANNER_PATH_BASE_PACKAGE_PATH, ENTRY_POINT_IDS_FILE_PATH, OUTPUT_DIRECTORY, JAVA8_COMPILER_PATH, JAVA8_RUNTIME_PATH, JOANA_PATH);
	
		return true;
	}
	
	private void executeJOANA(String projectCodeBasePackageLocation, String entryPointIDsFileLocation, String outputDirectoryLocation, String javaCompilerLocation, String javaRuntimeLocation, String joanaJarLocation) {
		compileJOANACode(projectCodeBasePackageLocation);

		Collection<String> entryPointIDs = getEntryPointIDs(Path.of(entryPointIDsFileLocation).toFile());
		executeJOANA(entryPointIDs, javaRuntimeLocation, joanaJarLocation);

		String combinedResult = combineResults(entryPointIDs, tmpDirectoryLocation);
		
		FileToGenerate file = new FileToGenerate(combinedResult, outputDirectoryLocation, OUTPUT_NAME, "txt");
		file.write();
		System.out.println("Done");
		Path.of(tmpDirectoryLocation).toFile().delete();
	}

	private static void executeJOANA(Collection<String> entryPointIDs, String javaRuntimeLocation, String joanaJarLocation) {

		try {
			Path tmp = Files.createTempDirectory("joanaResults");
			tmpDirectoryLocation = tmp.toAbsolutePath().toString();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String entryPointID : entryPointIDs) {

			List<String> executionCommand = new ArrayList<String>();

			executionCommand.add(javaRuntimeLocation);
			executionCommand.add("-jar");
			executionCommand.add(joanaJarLocation);
			executionCommand.add(String.format(CLASS_PATH_TEMPLATE, ACCESS_ANALYSIS_TRAVELPLANNER_PROJECT_PATH_JOANA));
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

	private static void compileJOANACode(String baseDirectoryLocation) {

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

		buildCommand.add(JAVA8_COMPILER_PATH);
		buildCommand.add("-cp");
		buildCommand.add(JOANA_PATH);
		buildCommand.addAll(javaFilePaths);

		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command(buildCommand);
		try {
			Process pr = processBuilder.start();
			pr.waitFor();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
