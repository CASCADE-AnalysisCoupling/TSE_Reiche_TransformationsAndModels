package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.TravelPlannerPaths;

public class ExtendedDataFlowAnalysis2JOANA4JPMailHandler extends AbstractHandler {

	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {


			String repositoryPath = JPMailPaths.REPOSITORY_PATH;
			String parameterAnnotationModelPath = JPMailPaths.PARAMETER_ANNOTATION_MODEL_PATH;
			String datadictionaryModelPath = JPMailPaths.DATA_DICTIONARY_MODEL_PATH;
			String javaCodeBasePath = JPMailPaths.JAVA_CODE_BASE_PATH;
			String codeBasePackageName = JPMailPaths.CODE_BASE_PACKAGE_NAME;
			String javaModelPath = JPMailPaths.JAVA_MODEL_PATH;
			String joanaModelPath = JPMailPaths.JOANA_MODEL_PATH;
			String correspondenceModelPath = JPMailPaths.PCMJAVACORRESPONDENCE_MODE_PATH;

		
		ExtendedDataFlowAnalysis2JOANAAlignment alignment = new ExtendedDataFlowAnalysis2JOANAAlignment(repositoryPath, parameterAnnotationModelPath, datadictionaryModelPath, javaCodeBasePath, codeBasePackageName, javaModelPath, joanaModelPath, correspondenceModelPath, JPMailPaths.CASE_STUDY_NAME);

		alignment.performAlignment();

		return true;
	}

}
