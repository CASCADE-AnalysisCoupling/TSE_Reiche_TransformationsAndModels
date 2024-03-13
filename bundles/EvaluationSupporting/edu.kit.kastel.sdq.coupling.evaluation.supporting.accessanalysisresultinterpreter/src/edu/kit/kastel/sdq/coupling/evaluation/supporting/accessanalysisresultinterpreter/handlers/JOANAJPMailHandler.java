package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.Interpreter;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.testpaths.JOANAJPMailPaths;

public class JOANAJPMailHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Interpreter interpreter = new Interpreter();
		interpreter.interpret(JOANAJPMailPaths.REPOSITORY_PATH, JOANAJPMailPaths.ID_MAPPINGS_PATH,
				JOANAJPMailPaths.ACCESS_ANALYSIS_RESULT_PATH, JOANAJPMailPaths.ADVERSARIES_PATH,
				JOANAJPMailPaths.CONFIDENTIALITY_SPECIFICATION_PATH);
		return true;
	}

}
