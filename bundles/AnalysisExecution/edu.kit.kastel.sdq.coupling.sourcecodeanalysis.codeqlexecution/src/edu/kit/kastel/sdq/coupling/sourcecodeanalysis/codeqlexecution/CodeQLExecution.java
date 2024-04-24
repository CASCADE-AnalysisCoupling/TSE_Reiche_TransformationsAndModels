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

	public static void main(String[] args) {

		// codeQLCLIPath
		// dBLocation = CaseStudies\Systems\TravelPlanner\Code\edu.kit.kastel.sdq.coupling.casestudy.travelplanner.code\TravelPlannerCodeQLDB
		// sourceCodePath = Code/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.code
		// codeQLQuery = ./CodeQLQuery/AccessAnalysisLabeledTaintTracking.ql
		// outputFileName = SCAR/CodeQL/codeQLAccessAnalysisOutput.sarif
		String codeQLCLIPath = args[0];
		String dBLocation = args[1];
		String sourceCodePath = args[2];
		String codeQLQuery = args[3];
		String outputFileName = args[4];

		execute(codeQLCLIPath, dBLocation, sourceCodePath, codeQLQuery, outputFileName);
	}

	private static void execute(String codeQLCLIPath, String dBLocation, String sourceCodePath, String codeQLQuery,
			String outputFileName) {

		buildDB(codeQLCLIPath, dBLocation, sourceCodePath);

		executeCodeQL(codeQLCLIPath, dBLocation, codeQLQuery, outputFileName);

		System.out.println("Done");
	}

	private static void executeCodeQL(String codeQLCLIPath, String dBLocation, String codeQLQuery,
			String outputFileName) {

		System.out.println("Executing CodeQL");
		List<String> executionCommand = new ArrayList<String>();

		executionCommand.add(codeQLCLIPath);
		executionCommand.add("database analyze");
		executionCommand.add(dBLocation);
		executionCommand.add(codeQLQuery);
		executionCommand.add("--sarif-category=java");
		executionCommand.add("--format=sarif-latest");
		executionCommand.add("--rerun");
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

	private static void buildDB(String codeQLCLIPath, String dBLocation, String sourceCodePath) {
		List<String> buildCommand = new ArrayList<String>();

		buildCommand.add(codeQLCLIPath);
		buildCommand.add("database create");
		buildCommand.add(dBLocation);
		buildCommand.add("--overwrite");
		buildCommand.add("--language=java");
		buildCommand.add("--source-root");
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
}