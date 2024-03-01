package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.testpaths.TravelPlannerTestPaths;

public class Joana2AccessAnalysis4TravelPlannerHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Joana2AccessAnalysisResultIntegration integration = new Joana2AccessAnalysisResultIntegration(
				TravelPlannerTestPaths.JAVA_MODEL_PATH, TravelPlannerTestPaths.JOANA_MODEL_PATH,
				TravelPlannerTestPaths.PCMJAVACORRESPONDENCE_MODE_PATH, TravelPlannerTestPaths.JOANA_RESULT_FILE_PATH,
				TravelPlannerTestPaths.REPOSITORY_MODEL_PATH,
				TravelPlannerTestPaths.CONFIDENTIALITY_SPECIFICATION_MODEL_PATH, TravelPlannerTestPaths.POLICY_STYLE, TravelPlannerTestPaths.ORIGIN_BACKUP_PATH);
		
		
		integration.integrate();
		
		return true;
	}

}
