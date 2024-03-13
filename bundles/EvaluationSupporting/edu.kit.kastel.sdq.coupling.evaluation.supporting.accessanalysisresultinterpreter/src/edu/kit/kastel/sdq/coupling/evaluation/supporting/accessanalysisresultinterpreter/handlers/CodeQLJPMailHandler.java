package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.Interpreter;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.testpaths.CodeQLJPMailPaths;

public class CodeQLJPMailHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Interpreter interpreter = new Interpreter();
		interpreter.interpret(CodeQLJPMailPaths.REPOSITORY_PATH, CodeQLJPMailPaths.ID_MAPPINGS_PATH,
				CodeQLJPMailPaths.ACCESS_ANALYSIS_RESULT_PATH, CodeQLJPMailPaths.ADVERSARIES_PATH,
				CodeQLJPMailPaths.CONFIDENTIALITY_SPECIFICATION_PATH);
		return true;
	}

}
