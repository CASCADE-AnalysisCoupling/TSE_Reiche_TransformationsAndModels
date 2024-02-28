package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.testpaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JPMailPaths {

	private static final String JOANA_MODEL_FILE_ENDING = "joana";
	private static final String JAVA_MODEL_FILE_ENDING = "java";
	private static final String JAVA_MODEL_NAME = "java4accessanalysis";
	private static final String JOANA_MODEL_NAME = "joana4accessanalysis";
	private static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	private static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "joanajava4accessanalysis";
	
	private static final String REPOSITORY_FILE_ENDING = "repository";
	private static final String CONFIDENTIALITY_SPECIFICATION_FILE_ENDING = "confidentiality";
	
	private static final String REPOSITORY_MODEL_NAME = "jpmail";
	private static final String CONFIDENTIALITY_SPEC_MODEL_NAME= "jpmail";
	private static final String PATH_PATTERN = "%s/%s.%s";
	
	public static final String CASE_STUDY_NAME = "jpmail";
	
	//Input
	public static final String USER_SPECIFIC_REPO_PATH = Path.of("/home/frederik/Arbeitsplatz/git/Diss/casestudies").toAbsolutePath().toString();
	public static final String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/JPMail";
	public static final String PCM_MODEL_BASE_PATH = "Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.accessanalysis";
	private static final String BASE_PATH = Paths.get(String.format("%s/%s/%s", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, PCM_MODEL_BASE_PATH)).toAbsolutePath().toString();
	public static final String REPOSITORY_PATH = Paths.get(String.format(PATH_PATTERN, BASE_PATH, REPOSITORY_MODEL_NAME, REPOSITORY_FILE_ENDING)).toAbsolutePath().toString();
	public static final String CONFIDENTIALITY_SPECIFICATION_PATH = Paths.get(String.format(PATH_PATTERN, BASE_PATH, CONFIDENTIALITY_SPEC_MODEL_NAME, CONFIDENTIALITY_SPECIFICATION_FILE_ENDING)).toAbsolutePath().toString();
	
	//Output
	private static final String MODEL_PATH_TEMPLATE = "%s/%s/Models/%s/%s.%s";
	private static final String JOANA_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.jpmail.joana4accessanalysis";
	public static final String JAVA_MODEL_PATH = Paths.get(String.format(MODEL_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, JOANA_MODELS_BASEFOLDER, JAVA_MODEL_NAME, JAVA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String JOANA_MODEL_PATH = Paths.get(String.format(MODEL_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, JOANA_MODELS_BASEFOLDER, JOANA_MODEL_NAME, JOANA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format(MODEL_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, JOANA_MODELS_BASEFOLDER, PCMJAVACORRESPONDENCE_MODEL_NAME, PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	
	private static final String JOANA_EVAL_CODE_FOLDER_NAME = "edu.kit.kastel.sdq.coupling.casestudy.jpmail.code.joana4accessanalysis";
	public static final String JAVA_CODE_BASE_PATH = Paths.get(String.format("%s/%s/Code/%s/", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, JOANA_EVAL_CODE_FOLDER_NAME)).toAbsolutePath().toString();
	public static final String CODE_BASE_PACKAGE_NAME = "edu.kit.kastel.sdq.coupling.casestudy.jpmail";
}
