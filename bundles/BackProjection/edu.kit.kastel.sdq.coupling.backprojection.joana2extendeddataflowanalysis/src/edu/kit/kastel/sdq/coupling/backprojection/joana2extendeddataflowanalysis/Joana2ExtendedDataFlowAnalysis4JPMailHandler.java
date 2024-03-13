package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.testpaths.JPMailTestPaths;

public class Joana2ExtendedDataFlowAnalysis4JPMailHandler  extends AbstractHandler {

	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Joana2ExtendedDataFlowAnalysisResultIntegration integration = new Joana2ExtendedDataFlowAnalysisResultIntegration(
				JPMailTestPaths.JAVA_MODEL_PATH, JPMailTestPaths.JOANA_MODEL_PATH,
				JPMailTestPaths.PCMJAVACORRESPONDENCE_MODE_PATH, JPMailTestPaths.CODEQL_RESULT_FILE_PATH,
				JPMailTestPaths.REPOSITORY_MODEL_PATH, JPMailTestPaths.ORIGIN_BACKUP_PATH,
				JPMailTestPaths.PARAMETER_ANNOTATION_MODEL_PATH,
				JPMailTestPaths.DATA_DICTIONARY_MODEL_PATH, JPMailTestPaths.POLICY_STYLE);
		
		integration.integrate();
		
		return true;
	}

}
