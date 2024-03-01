package edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.testpaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TravelPlannerTestPaths {

	private static final String CODEQL_MODEL_FILE_ENDING = "codeql";
	private static final String JAVA_MODEL_FILE_ENDING = "java";
	private static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	private static final String CODEQL_RESULT_FILE_ENDING = "sarif";
	private static final String REPOSITORY_FILE_ENDING = "repository";
	private static final String PARAMETER_ANNOTATION_MODEL_FILE_ENDING = "parameterannotation";
	private static final String DATA_DICTIONARY_FILE_ENDING = "pddc";
	
	//for testing
		private static final String REPOSITORY_MODEL_NAME = "travelplanner";
		private static final String PARAMETER_ANNOTATION_MODEL_NAME = "travelplanner";
		private static final String CODEQL_RESULT_NAME = "codeQLExtendedDataflowAnalysisOutput";
		private static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "coupling_pcmjavacorrespondencemodel";
		private static final String JAVA_MODEL_NAME = "coupling_java";
		private static final String CODEQL_MODEL_NAME = "coupling_tainttracking";
		private static final String DATA_DICTIONARY_FILE_NAME = "travelplanner";
		

		private static final String MODEL_FILE_PATH_TEMPLATE = "%s/%s/Models/%s/%s.%s";
		private static final String SCAR_PATH_TEMPLATE = "%s/%s/SCAR/CodeQL/%s.%s";
		
		public static final String USER_SPECIFIC_REPO_PATH = Path.of("/home/frederik/Arbeitsplatz/git/Diss/casestudies")
				.toAbsolutePath().toString();
		public static final String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner";
		
		
		private static final String CODEQL_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.codeql4extendeddataflowanalysis";
		
		public static final String JAVA_MODEL_PATH = Paths
				.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
						CODEQL_MODELS_BASEFOLDER, JAVA_MODEL_NAME, JAVA_MODEL_FILE_ENDING))
				.toAbsolutePath().toString();
		public static final String CODEQL_MODEL_PATH = Paths
				.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
						CODEQL_MODELS_BASEFOLDER, CODEQL_MODEL_NAME, CODEQL_MODEL_FILE_ENDING))
				.toAbsolutePath().toString();
		public static final String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format(MODEL_FILE_PATH_TEMPLATE,
				USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, CODEQL_MODELS_BASEFOLDER,
				PCMJAVACORRESPONDENCE_MODEL_NAME, PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();
		public static final String CODEQL_RESULT_FILE_PATH = Paths.get(String.format(SCAR_PATH_TEMPLATE,
				USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, CODEQL_RESULT_NAME, CODEQL_RESULT_FILE_ENDING))
				.toAbsolutePath().toString();

		public static final String EXTENDEDDATAFLOW_ANALYSIS_PROJECT_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow";
		public static final String EXTENDEDDATAFLOW_ANALYSIS_PROJECT_FOLDER = String.format("%s/%s/Models/%s",
				USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, EXTENDEDDATAFLOW_ANALYSIS_PROJECT_NAME);
		public static final String EXTENDEDDATAFLOW_ANALYSIS_MODELS_FOLDER = String.format("%s/models/",
				EXTENDEDDATAFLOW_ANALYSIS_PROJECT_FOLDER);
		
		public static final String REPOSITORY_MODEL_PATH = Paths
				.get(String.format("%s/%s.%s", EXTENDEDDATAFLOW_ANALYSIS_MODELS_FOLDER, REPOSITORY_MODEL_NAME, REPOSITORY_FILE_ENDING))
				.toAbsolutePath().toString();
		
		
		public static final String PARAMETER_ANNOTATION_MODEL_PATH = Paths
				.get(String.format("%s/%s.%s", EXTENDEDDATAFLOW_ANALYSIS_MODELS_FOLDER, PARAMETER_ANNOTATION_MODEL_NAME, PARAMETER_ANNOTATION_MODEL_FILE_ENDING))
				.toAbsolutePath().toString();
		public static final String DATA_DICTIONARY_MODEL_PATH = Paths
				.get(String.format("%s/%s.%s", EXTENDEDDATAFLOW_ANALYSIS_MODELS_FOLDER, DATA_DICTIONARY_FILE_NAME, DATA_DICTIONARY_FILE_ENDING))
				.toAbsolutePath().toString();

		public static final String ORIGIN_BACKUP_PATH = Paths.get(String.format("%s%s", EXTENDEDDATAFLOW_ANALYSIS_PROJECT_FOLDER, ".origin")).toAbsolutePath().toString();
		public static final String POLICY_STYLE = "Disjunctive";
}
