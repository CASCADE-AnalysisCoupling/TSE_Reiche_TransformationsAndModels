package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.testpaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JOANATravelPlannerPaths {
	
	private static final String REPOSITORY_MODEL_NAME = "travelplanner";
	private static final String CONFIDENTIALITY_SPEC_MODEL_NAME= "travelplanner";
	private static final String ADVERSARIES_MODEL_NAME= "travelplanner";
	
	private static final String REPOSITORY_FILE_ENDING = "repository";
	private static final String CONFIDENTIALITY_SPECIFICATION_FILE_ENDING = "confidentiality";
	private static final String ADVERSARIES_FILE_ENDING = "adversary";
	
	public static final String USER_SPECIFIC_REPO_PATH = Path.of("C:/Users/legua/eclipse/Current_MT_2020-12/repos/").toAbsolutePath().toString();
	public static final String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner";
	
	private static final String PATH_PATTERN = "%s/%s.%s";
	private static final String ACCESS_ANALYSIS_RESULT_FILE_NAME = "AccessAnalysisResultWithJOANA4TravelPlanner";
	
	private static final String MODELS_PATH_APPENDIX = "joana";
	public static final String MODELS_BASE_PATH = String.format("%s.%s", "Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.accessanalysis", MODELS_PATH_APPENDIX);
	private static final String BASE_PATH = Paths.get(String.format("%s/%s/%s", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, MODELS_BASE_PATH)).toAbsolutePath().toString();
	public static final String REPOSITORY_PATH = Paths.get(String.format(PATH_PATTERN, BASE_PATH, REPOSITORY_MODEL_NAME, REPOSITORY_FILE_ENDING)).toAbsolutePath().toString();
	public static final String CONFIDENTIALITY_SPECIFICATION_PATH = Paths.get(String.format(PATH_PATTERN, BASE_PATH, CONFIDENTIALITY_SPEC_MODEL_NAME, CONFIDENTIALITY_SPECIFICATION_FILE_ENDING)).toAbsolutePath().toString();
	public static final String ADVERSARIES_PATH = Paths.get(String.format(PATH_PATTERN, BASE_PATH, ADVERSARIES_MODEL_NAME, ADVERSARIES_FILE_ENDING)).toAbsolutePath().toString();
	
	public static final String ID_MAPPINGS_PATH = Paths.get(String.format("%s/src-gen/mappings.txt", BASE_PATH)).toAbsolutePath().toString();
	public static final String ACCESS_ANALYSIS_RESULT_PATH = Paths.get(String.format("%s/%s/AAR/%s", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, ACCESS_ANALYSIS_RESULT_FILE_NAME)).toAbsolutePath().toString();
}
