package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.testpaths;

import java.nio.file.Path;
import java.nio.file.Paths;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.InputModels;

public class JPMailPaths {
	private static final String REPOSITORY_FILE_ENDING = "repository";
	private static final String PARAMETER_ANNOTATION_MODEL_FILE_ENDING = "parameterannotation";
	private static final String DATA_DICTIONARY_FILE_ENDING = "pddc";

	private static final String REPOSITORY_FILE_NAME = "jpmail";
	private static final String PARAMETER_ANNOTATION_MODEL_NAME = "jpmail";
	private static final String DATA_DICTIONARY_FILE_NAME = "jpmail";
	
	public static final String CASE_STUDY_NAME = "jpmail";
	
	//for testing
	public static final String USER_SPECIFIC_REPO_PATH = Path.of("/home/frederik/Arbeitsplatz/git/Diss/casestudies").toAbsolutePath().toString();
	public static final String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/JPMail";
	public static final String JPMAIL_PCM_MODEL_BASE_PATH = "Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow/models/";
	private static final String MODELS_BASE_PATH = Paths.get(String.format("%s/%s/%s", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, JPMAIL_PCM_MODEL_BASE_PATH)).toAbsolutePath().toString();
	public static final String REPOSITORY_PATH = Paths.get(String.format("%s/%s.%s", MODELS_BASE_PATH, REPOSITORY_FILE_NAME, REPOSITORY_FILE_ENDING)).toAbsolutePath().toString();
	public static final String PARAMETER_ANNOTATION_MODEL_PATH = Paths.get(String.format("%s/%s.%s", MODELS_BASE_PATH, PARAMETER_ANNOTATION_MODEL_NAME , PARAMETER_ANNOTATION_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String DATA_DICTIONARY_MODEL_PATH = Paths.get(String.format("%s/%s.%s", MODELS_BASE_PATH, DATA_DICTIONARY_FILE_NAME, DATA_DICTIONARY_FILE_ENDING)).toAbsolutePath().toString();
	
	private static final String CODEQL_MODEL_FILE_ENDING = "codeql";
	private static final String JAVA_MODEL_FILE_ENDING = "java";
	private static final String JAVA_MODEL_NAME = "java4extendeddataflowanalysis";
	private static final String CODEQL_MODEL_NAME = "codeql4extendeddataflowanalysis";
	private static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	private static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "pcmjava4extendeddataflowanalysis";
	
	
	//for testing
	private static final String MODEL_PATH_TEMPLATE = "%s/%s/Models/%s/%s.%s";
	private static final String CODEQL_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.codeql4extendeddataflowanalysis";
	public static final String JAVA_MODEL_PATH = Paths.get(String.format(MODEL_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, CODEQL_MODELS_BASEFOLDER, JAVA_MODEL_NAME, JAVA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String CODEQL_MODEL_PATH = Paths.get(String.format(MODEL_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, CODEQL_MODELS_BASEFOLDER, CODEQL_MODEL_NAME, CODEQL_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format(MODEL_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, CODEQL_MODELS_BASEFOLDER, PCMJAVACORRESPONDENCE_MODEL_NAME, PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String JAVA_CODE_FILE_ENDING = "java";
	private static final String CODEQL_EVAL_CODE_FOLDER_NAME = "edu.kit.kastel.sdq.coupling.casestudy.jpmail.code.codeql4extendeddataflowanalysis";
	public static final String JAVA_CODE_BASE_PATH = Paths.get(String.format("%s/%s/Code/%s/", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, CODEQL_EVAL_CODE_FOLDER_NAME)).toAbsolutePath().toString();

	public static final String CODEQL_QUERY_FOLDER_PATH = Paths.get(String.format("%s/%s/CodeQLQuery/ExtendedDataFlowAnalysis/", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH)).toAbsolutePath().toString();


	
	public static final String CODE_BASE_PACKAGE_NAME = "edu.kit.kastel.sdq.coupling.casestudy.jpmail";
}
