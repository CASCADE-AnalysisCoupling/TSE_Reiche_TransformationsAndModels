package edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.testpaths.TravelPlannerTestPaths;

public class CodeQL2ExtendedDataFlowAnalysis4TravelPlannerHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		CodeQL2ExtendedDataFlowAnalysisResultIntegration integration = new CodeQL2ExtendedDataFlowAnalysisResultIntegration(
				TravelPlannerTestPaths.POLICY_STYLE, TravelPlannerTestPaths.JAVA_MODEL_PATH,
				TravelPlannerTestPaths.CODEQL_MODEL_PATH, TravelPlannerTestPaths.PCMJAVACORRESPONDENCE_MODE_PATH,
				TravelPlannerTestPaths.CODEQL_RESULT_FILE_PATH, TravelPlannerTestPaths.PARAMETER_ANNOTATION_MODEL_PATH,
				TravelPlannerTestPaths.DATA_DICTIONARY_MODEL_PATH, TravelPlannerTestPaths.ORIGIN_BACKUP_PATH,
				TravelPlannerTestPaths.REPOSITORY_MODEL_PATH);

		integration.integrate();

		return true;
	}

}
