package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension;

import edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions.AllowedConditionsProvider;

public record AnalysisConfiguration(String usageModelPath, String allocationModelPath, String nodeCharacteristicsModelPath, String parameterAnnotationsModelPath, String modelProjectName, AllowedConditionsProvider allowedConditionsProvider) {

}
