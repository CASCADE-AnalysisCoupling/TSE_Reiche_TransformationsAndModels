package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.evaluationpaths;

import java.nio.file.Paths;

public class TravelPlannerPaths {

	
	public static String CASE_STUDY = "TravelPlanner";
	
	public static String MODEL_PROJECT_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow";

	private static final String BASE_PATH = Paths.get(
			"/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow/models")
			.toAbsolutePath().toString();
	public static final String USAGE_MODEL_PATH = Paths.get(BASE_PATH, "travelplanner.usagemodel").toAbsolutePath()
			.toString();
	public static final String ALLOCATION_MODEL_PATH = Paths.get(BASE_PATH, "travelplanner.allocation")
			.toAbsolutePath().toString();
	public static final String NODECHARACTERISTICS_MODEL_PATH = Paths
			.get(BASE_PATH, "travelplanner.nodecharacteristics").toAbsolutePath().toString();
	public static final String PARAMETER_ANNOTATION_MODEL_PATH = Paths
			.get(BASE_PATH, "travelplanner.parameterannotation").toAbsolutePath().toString();
	
	private TravelPlannerPaths() {
		
	}
	
	
	
}
