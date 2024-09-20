package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.testpaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JPMailTestPaths {
	
	private static final String JOANA_MODEL_FILE_ENDING = "joana";
	private static final String JAVA_MODEL_FILE_ENDING = "java";
	private static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	private static final String CONFIDENTIALITY_SPECIFICATION_FILE_ENDING = "confidentiality";
	private static final String REPOSITORY_FILE_ENDING = "repository";
	private static final String JOANA_RESULT_FILE_ENDING = "txt";
	
	//Input Models Names For Testing
	
	private static final String JAVA_MODEL_NAME = "java4accessanalysis";
	private static final String JOANA_MODEL_NAME = "joana4accessanalysis";
	private static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "pcmjava4accessanalysis";
	private static final String JOANA_RESULT_FILE_NAME = "joanaResult4AccessAnalysis";
	private static final String REPOSITORY_MODEL_NAME = "jpmail";
	private static final String CONFIDENTIALITY_SPEC_MODEL_NAME = "jpmail";
	
	//Paths for testing
	private static final String ARCHITECUTRAL_MODEL_ORIGIN_SAVE_DIRECTORY_ENDING = ".origin";

	
	public static final String USER_SPECIFIC_REPO_PATH = Path.of("/home/frederik/Arbeitsplatz/git/Diss/casestudies")
			.toAbsolutePath().toString();
	public static final String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/JPMail";
	private static final String MODEL_FILE_PATH_TEMPLATE = "%s/%s/Models/%s/%s.%s";
	private static final String SCAR_PATH_TEMPLATE = "%s/%s/SCAR/JOANA/%s.%s";
	
	private static final String JOANA_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.joana4accessanalysis";
	public static final String ACCESS_ANALYSIS_PROJECT_NAME = "edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.accessanalysis";
	public static final String JAVA_MODEL_PATH = Paths
			.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
					JOANA_MODELS_BASEFOLDER, JAVA_MODEL_NAME, JAVA_MODEL_FILE_ENDING))
			.toAbsolutePath().toString();
	public static final String JOANA_MODEL_PATH = Paths
			.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
					JOANA_MODELS_BASEFOLDER, JOANA_MODEL_NAME, JOANA_MODEL_FILE_ENDING))
			.toAbsolutePath().toString();
	public static final String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format(MODEL_FILE_PATH_TEMPLATE,
			USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, JOANA_MODELS_BASEFOLDER,
			PCMJAVACORRESPONDENCE_MODEL_NAME, PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String JOANA_RESULT_FILE_PATH = Paths.get(String.format(SCAR_PATH_TEMPLATE,
			USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, JOANA_RESULT_FILE_NAME, JOANA_RESULT_FILE_ENDING))
			.toAbsolutePath().toString();

	
	public static final String ACCESS_ANALYSIS_PROJECT_FOLDER = String.format("%s/%s/Models/%s",
			USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, ACCESS_ANALYSIS_PROJECT_NAME);
	public static final String REPOSITORY_MODEL_PATH = Paths
			.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
					ACCESS_ANALYSIS_PROJECT_NAME, REPOSITORY_MODEL_NAME, REPOSITORY_FILE_ENDING))
			.toAbsolutePath().toString();
	public static final String CONFIDENTIALITY_SPECIFICATION_MODEL_PATH = Paths
			.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
					ACCESS_ANALYSIS_PROJECT_NAME, CONFIDENTIALITY_SPEC_MODEL_NAME,
					CONFIDENTIALITY_SPECIFICATION_FILE_ENDING))
			.toAbsolutePath().toString();
		
	public static final String ORIGIN_BACKUP_PATH = Paths.get(String.format("%s/%s/Models/%s.origin", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,ACCESS_ANALYSIS_PROJECT_NAME)).toAbsolutePath().toString();
	
	public static final String POLICY_STYLE = "HighLow";
}
