package edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.testpaths.JPMailTestPaths;

public class CodeQL2ExtendedDataFlowAnalysis4JPMailHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		CodeQL2ExtendedDataFlowAnalysisResultIntegration integration = new CodeQL2ExtendedDataFlowAnalysisResultIntegration(
				JPMailTestPaths.POLICY_STYLE, JPMailTestPaths.JAVA_MODEL_PATH,
				JPMailTestPaths.CODEQL_MODEL_PATH, JPMailTestPaths.PCMJAVACORRESPONDENCE_MODE_PATH,
				JPMailTestPaths.CODEQL_RESULT_FILE_PATH, JPMailTestPaths.PARAMETER_ANNOTATION_MODEL_PATH,
				JPMailTestPaths.DATA_DICTIONARY_MODEL_PATH, JPMailTestPaths.ORIGIN_BACKUP_PATH,
				JPMailTestPaths.REPOSITORY_MODEL_PATH);

		integration.integrate();

		return true;
	}

}
