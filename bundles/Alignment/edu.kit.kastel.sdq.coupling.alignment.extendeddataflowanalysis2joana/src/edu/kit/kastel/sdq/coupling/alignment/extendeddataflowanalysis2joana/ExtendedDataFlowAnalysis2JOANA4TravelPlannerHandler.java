package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.TravelPlannerPaths;

public class ExtendedDataFlowAnalysis2JOANA4TravelPlannerHandler extends AbstractHandler {


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

			String repositoryPath = TravelPlannerPaths.REPOSITORY_PATH;
			String parameterAnnotationModelPath = TravelPlannerPaths.PARAMETER_ANNOTATION_MODEL_PATH;
			String datadictionaryModelPath = TravelPlannerPaths.DATA_DICTIONARY_MODEL_PATH;
			String javaCodeBasePath = TravelPlannerPaths.JAVA_CODE_BASE_PATH;
			String codeBasePackageName = TravelPlannerPaths.CODE_BASE_PACKAGE_NAME;
			String javaModelPath = TravelPlannerPaths.JAVA_MODEL_PATH;
			String joanaModelPath = TravelPlannerPaths.JOANA_MODEL_PATH;
			String correspondenceModelPath = TravelPlannerPaths.PCMJAVACORRESPONDENCE_MODE_PATH;
		

		ExtendedDataFlowAnalysis2JOANAAlignment alignment = new ExtendedDataFlowAnalysis2JOANAAlignment(repositoryPath, parameterAnnotationModelPath, datadictionaryModelPath, javaCodeBasePath, codeBasePackageName, javaModelPath, joanaModelPath, correspondenceModelPath, TravelPlannerPaths.CASE_STUDY_NAME);

		alignment.performAlignment();

		return true;
	}

}
