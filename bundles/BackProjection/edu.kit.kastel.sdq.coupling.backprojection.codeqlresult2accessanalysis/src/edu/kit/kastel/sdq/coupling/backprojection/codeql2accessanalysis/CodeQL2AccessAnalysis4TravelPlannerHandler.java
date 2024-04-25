package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.testpaths.TravelPlannerTestPaths;

public class CodeQL2AccessAnalysis4TravelPlannerHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

//		CodeQL2AccessAnalysisResultIntegration integration = new CodeQL2AccessAnalysisResultIntegration(
//				TravelPlannerTestPaths.POLICY_STYLE, TravelPlannerTestPaths.JAVA_MODEL_PATH,
//				TravelPlannerTestPaths.CODEQL_MODEL_PATH, TravelPlannerTestPaths.PCMJAVACORRESPONDENCE_MODE_PATH,
//				TravelPlannerTestPaths.CODEQL_RESULT_FILE_PATH, TravelPlannerTestPaths.REPOSITORY_MODEL_PATH,
//				TravelPlannerTestPaths.CONFIDENTIALITY_SPECIFICATION_MODEL_PATH,
//				TravelPlannerTestPaths.ORIGIN_BACKUP_PATH);

		
		//integration.performResultIntegration();
		return true;
	}

}
