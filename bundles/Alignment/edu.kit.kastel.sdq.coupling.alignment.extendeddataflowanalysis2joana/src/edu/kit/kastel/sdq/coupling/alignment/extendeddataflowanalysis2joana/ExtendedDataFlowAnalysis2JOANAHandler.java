package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.TravelPlannerPaths;

public class ExtendedDataFlowAnalysis2JOANAHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		String caseStudy = JPMailPaths.CASE_STUDY_NAME;
		ExtendedDataFlowAnalysis2JOANAAlignment alignment = null;
		if (caseStudy.equals(JPMailPaths.CASE_STUDY_NAME)) {
			alignment = new ExtendedDataFlowAnalysis2JOANAAlignment(JPMailPaths.REPOSITORY_PATH,
					JPMailPaths.PARAMETER_ANNOTATION_MODEL_PATH, JPMailPaths.DATA_DICTIONARY_MODEL_PATH,
					JPMailPaths.JAVA_CODE_BASE_PATH, JPMailPaths.CODE_BASE_PACKAGE_NAME,
					JPMailPaths.JAVA_MODEL_PATH, JPMailPaths.JOANA_MODEL_PATH,
					JPMailPaths.PCMJAVACORRESPONDENCE_MODE_PATH);

		} else if (caseStudy.equals(TravelPlannerPaths.CASE_STUDY_NAME)) {
			alignment = new ExtendedDataFlowAnalysis2JOANAAlignment(TravelPlannerPaths.REPOSITORY_PATH,
					TravelPlannerPaths.PARAMETER_ANNOTATION_MODEL_PATH, TravelPlannerPaths.DATA_DICTIONARY_MODEL_PATH,
					TravelPlannerPaths.JAVA_CODE_BASE_PATH, TravelPlannerPaths.CODE_BASE_PACKAGE_NAME,
					TravelPlannerPaths.JAVA_MODEL_PATH, TravelPlannerPaths.JOANA_MODEL_PATH,
					TravelPlannerPaths.PCMJAVACORRESPONDENCE_MODE_PATH);

		}

		alignment.performAlignment();

		return true;
	}

}
