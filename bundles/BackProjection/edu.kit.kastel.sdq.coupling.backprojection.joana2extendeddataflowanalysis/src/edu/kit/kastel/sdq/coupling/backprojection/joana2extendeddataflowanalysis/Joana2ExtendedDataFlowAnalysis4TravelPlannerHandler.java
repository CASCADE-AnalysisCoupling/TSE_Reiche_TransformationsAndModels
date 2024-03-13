package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.testpaths.TravelPlannerTestPaths;

public class Joana2ExtendedDataFlowAnalysis4TravelPlannerHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Joana2ExtendedDataFlowAnalysisResultIntegration integration = new Joana2ExtendedDataFlowAnalysisResultIntegration(
				TravelPlannerTestPaths.JAVA_MODEL_PATH, TravelPlannerTestPaths.JOANA_MODEL_PATH,
				TravelPlannerTestPaths.PCMJAVACORRESPONDENCE_MODE_PATH, TravelPlannerTestPaths.CODEQL_RESULT_FILE_PATH,
				TravelPlannerTestPaths.REPOSITORY_MODEL_PATH, TravelPlannerTestPaths.ORIGIN_BACKUP_PATH,
				TravelPlannerTestPaths.PARAMETER_ANNOTATION_MODEL_PATH,
				TravelPlannerTestPaths.DATA_DICTIONARY_MODEL_PATH, TravelPlannerTestPaths.POLICY_STYLE);

		integration.integrate();

		return true;
	}

}
