package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.testpaths.JPMailTestPaths;

public class Joana2AccessAnalysis4JPMailHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Joana2AccessAnalysisResultIntegration integration = new Joana2AccessAnalysisResultIntegration(
				JPMailTestPaths.JAVA_MODEL_PATH, JPMailTestPaths.JOANA_MODEL_PATH,
				JPMailTestPaths.PCMJAVACORRESPONDENCE_MODE_PATH, JPMailTestPaths.JOANA_RESULT_FILE_PATH,
				JPMailTestPaths.REPOSITORY_MODEL_PATH,
				JPMailTestPaths.CONFIDENTIALITY_SPECIFICATION_MODEL_PATH, JPMailTestPaths.POLICY_STYLE, JPMailTestPaths.ORIGIN_BACKUP_PATH);
		
		
		integration.integrate();
		
		return true;
	}

}
