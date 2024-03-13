package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.Interpreter;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.testpaths.CodeQLTravelPlannerPaths;

public class CodeQLTravelPlannerHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Interpreter interpreter = new Interpreter();
		interpreter.interpret(CodeQLTravelPlannerPaths.REPOSITORY_PATH, CodeQLTravelPlannerPaths.ID_MAPPINGS_PATH,
				CodeQLTravelPlannerPaths.ACCESS_ANALYSIS_RESULT_PATH, CodeQLTravelPlannerPaths.ADVERSARIES_PATH,
				CodeQLTravelPlannerPaths.CONFIDENTIALITY_SPECIFICATION_PATH);
		return true;
	}

}
