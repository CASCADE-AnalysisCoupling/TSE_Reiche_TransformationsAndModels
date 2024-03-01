package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.testpaths.JPMailTestPaths;

public class CodeQL2AccessAnalysis4JPMailHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		CodeQL2AccessAnalysisResultIntegration integration = new CodeQL2AccessAnalysisResultIntegration(
				JPMailTestPaths.POLICY_STYLE, JPMailTestPaths.JAVA_MODEL_PATH,
				JPMailTestPaths.CODEQL_MODEL_PATH, JPMailTestPaths.PCMJAVACORRESPONDENCE_MODE_PATH,
				JPMailTestPaths.CODEQL_RESULT_FILE_PATH, JPMailTestPaths.REPOSITORY_MODEL_PATH,
				JPMailTestPaths.CONFIDENTIALITY_SPECIFICATION_MODEL_PATH,
				JPMailTestPaths.ORIGIN_BACKUP_PATH);

		
		integration.performResultIntegration();
		
		return true;
	}

}
