package edu.kit.kastel.sdq.coupling.sourcecodeanalysis.codeqlexecution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CodeQLExecution {
	// codeql database create $(dBLocation) --overwrite --language=java
	// --source-root $(sourceCodePath)
	//private final static String DB_CREATION_TEMPLATE = "--overwrite --language=java --source-root %s";
	// codeql database analyze $(dBLocation) $(codeQLQuery) --sarif-category=java
	// --format=sarif-latest --rerun --output=$(outputFileName)
	private final static String ANALYSE_TEMPLATE = "--output=%s";
	private final static String OVERWRITE_COMMAND = "--overwrite";
	private final static String SOURCE_ROOT_COMMAND = "--source-root";
	private final static String LANGUAGE_SELECTION_TEMPLATE = "--language=%s";
	private final static String DATABASE_CREATION_COMMAND = "database create";
	private final static String ANALYSIS_COMMAND = "database analyze";
	private final static String SARIF_CATEGORY_TEMPLATE = "--sarif-category=%s";
	private final static String DO_NOT_USE_CACHE_COMMAND = "--rerun";
	private final static String SARIF_VERSION = "--format=sarif-latest";

	public static void main(String[] args) {

		String codeQLCLIPath = args[0];
		String dBLocation = args[1];
		String sourceCodePath = args[2];
		String codeQLQuery = args[3];
		String outputFileName = args[4];
		String language = args[5];
		String command = args[6];

		execute(codeQLCLIPath, dBLocation, sourceCodePath, codeQLQuery, outputFileName, language, command);
	}

	private static void execute(String codeQLCLIPath, String dBLocation, String sourceCodePath, String codeQLQuery,
			String outputFileName, String language, String command) {

		buildDB(codeQLCLIPath, dBLocation, sourceCodePath, language, command);

		executeCodeQL(codeQLCLIPath, dBLocation, codeQLQuery, outputFileName, language);

		System.out.println("Done");
	}

	private static void executeCodeQL(String codeQLCLIPath, String dBLocation, String codeQLQuery,
			String outputFileName, String language) {

		String appliedCodeQLLanguage = translateProgramminglanguangeToCodeQL(language); 
		
		System.out.println("Executing CodeQL");
		List<String> executionCommand = new ArrayList<String>();

		executionCommand.add(codeQLCLIPath);
		executionCommand.add(ANALYSIS_COMMAND);
		executionCommand.add(dBLocation);
		executionCommand.add(codeQLQuery);
		executionCommand.add(String.format(SARIF_CATEGORY_TEMPLATE, appliedCodeQLLanguage));
		executionCommand.add(SARIF_VERSION);
		executionCommand.add(DO_NOT_USE_CACHE_COMMAND);
		executionCommand.add(String.format(ANALYSE_TEMPLATE, outputFileName));

		System.out.println(executionCommand.toString());
		ProcessBuilder processBuilder = new ProcessBuilder(executionCommand);

		try {
			processBuilder.inheritIO();
			Process pr = processBuilder.start();
			int result = pr.waitFor();
			System.out.println(result);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void buildDB(String codeQLCLIPath, String dBLocation, String sourceCodePath, String language, String command) {
		
		String appliedCodeQLLanguage = translateProgramminglanguangeToCodeQL(language); 
		
		System.out.println("Building CodeQL Database");
		
		List<String> buildCommand = new ArrayList<String>();

		buildCommand.add(codeQLCLIPath);
		buildCommand.add(DATABASE_CREATION_COMMAND);
		buildCommand.add(dBLocation);
		buildCommand.add(OVERWRITE_COMMAND);
		buildCommand.add(String.format(LANGUAGE_SELECTION_TEMPLATE, appliedCodeQLLanguage));
		buildCommand.add(SOURCE_ROOT_COMMAND);
		buildCommand.add(sourceCodePath);

		System.out.println(buildCommand.toString());
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command(buildCommand);
		try {
			processBuilder.inheritIO();
			Process pr = processBuilder.start();
			int result = pr.waitFor();
			System.out.println(result);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Building DB for codeQL done");
	}
	
	private static String translateProgramminglanguangeToCodeQL(String language) {
		String normalizedLanguage = language.toLowerCase();
		
		switch (normalizedLanguage) {
		case "java": 
			return "java";
		case "cpp":
			return "cpp";
		case "cplusplus":
			return "cpp";
		default:
			throw new RuntimeException("Applied programming langauge not known: " + language);
		}
	}
}