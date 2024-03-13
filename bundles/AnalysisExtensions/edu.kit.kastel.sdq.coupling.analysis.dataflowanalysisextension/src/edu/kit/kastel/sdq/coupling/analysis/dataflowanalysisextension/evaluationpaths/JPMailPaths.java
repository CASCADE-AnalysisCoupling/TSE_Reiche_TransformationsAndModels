package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.evaluationpaths;

import java.nio.file.Paths;

public class JPMailPaths {
	public static String CASE_STUDY = "JPMail";
	public static String POLICY_STYLE = "HighLow";
	
	public static String MODEL_PROJECT_NAME = "edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow";

	private static final String BASE_PATH = Paths.get(
			"/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow/models")
			.toAbsolutePath().toString();
	public static final String USAGE_MODEL_PATH = Paths.get(BASE_PATH, "jpmail.usagemodel").toAbsolutePath()
			.toString();
	public static final String ALLOCATION_MODEL_PATH = Paths.get(BASE_PATH, "jpmail.allocation")
			.toAbsolutePath().toString();
	public static final String NODECHARACTERISTICS_MODEL_PATH = Paths
			.get(BASE_PATH, "jpmail.nodecharacteristics").toAbsolutePath().toString();
	public static final String PARAMETER_ANNOTATION_MODEL_PATH = Paths
			.get(BASE_PATH, "jpmail.parameterannotation").toAbsolutePath().toString();
	
}
