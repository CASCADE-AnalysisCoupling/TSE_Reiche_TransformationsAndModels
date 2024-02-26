package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.TravelPlannerPaths;

public class ExtendedDataFlowAnalysis2JOANAHandler extends AbstractHandler {

	
	public static final String CASE_STUDY = JPMailPaths.CASE_STUDY_NAME;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		String repositoryPath = "";
		String parameterAnnotationModelPath = "";
		String datadictionaryModelPath = "";
		String javaCodeBasePath = "";
		String codeBasePackageName = "";
		String javaModelPath = "";
		String joanaModelPath = "";
		String correspondenceModelPath = "";


		if (CASE_STUDY.equals(JPMailPaths.CASE_STUDY_NAME)) {
			repositoryPath = JPMailPaths.REPOSITORY_PATH;
			parameterAnnotationModelPath = JPMailPaths.PARAMETER_ANNOTATION_MODEL_PATH;
			datadictionaryModelPath = JPMailPaths.DATA_DICTIONARY_MODEL_PATH;
			javaCodeBasePath = JPMailPaths.JAVA_CODE_BASE_PATH;
			codeBasePackageName = JPMailPaths.CODE_BASE_PACKAGE_NAME;
			javaModelPath = JPMailPaths.JAVA_MODEL_PATH;
			joanaModelPath = JPMailPaths.JOANA_MODEL_PATH;
			correspondenceModelPath = JPMailPaths.PCMJAVACORRESPONDENCE_MODE_PATH;

		} else if (CASE_STUDY.equals(TravelPlannerPaths.CASE_STUDY_NAME)) {
			repositoryPath = TravelPlannerPaths.REPOSITORY_PATH;
			parameterAnnotationModelPath = TravelPlannerPaths.PARAMETER_ANNOTATION_MODEL_PATH;
			datadictionaryModelPath = TravelPlannerPaths.DATA_DICTIONARY_MODEL_PATH;
			javaCodeBasePath = TravelPlannerPaths.JAVA_CODE_BASE_PATH;
			codeBasePackageName = TravelPlannerPaths.CODE_BASE_PACKAGE_NAME;
			javaModelPath = TravelPlannerPaths.JAVA_MODEL_PATH;
			joanaModelPath = TravelPlannerPaths.JOANA_MODEL_PATH;
			correspondenceModelPath = TravelPlannerPaths.PCMJAVACORRESPONDENCE_MODE_PATH;
		}

		ExtendedDataFlowAnalysis2JOANAAlignment alignment = new ExtendedDataFlowAnalysis2JOANAAlignment(repositoryPath, parameterAnnotationModelPath, datadictionaryModelPath, javaCodeBasePath, codeBasePackageName, javaModelPath, joanaModelPath, correspondenceModelPath);

		alignment.performAlignment();

		return true;
	}

}
