package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.testpaths.TravelPlannerPaths;


public class ExtendedDataFlowAnalysis2CodeQLHandler extends AbstractHandler {

	public static final String CASE_STUDY = JPMailPaths.CASE_STUDY_NAME;
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

	
		
		String repositoryPath = "";
		String parameterAnnotationModelPath = "";
		String datadictionaryModelPath = "";
		String codeBasePackageName = "";
		String javaModelPath = "";
		String codeQLModelPath = "";
		String correspondenceModelPath = "";
		String codeQLQueryFolderPath = "";

		if (CASE_STUDY.equals(JPMailPaths.CASE_STUDY_NAME)) {
			repositoryPath = JPMailPaths.REPOSITORY_PATH;
			parameterAnnotationModelPath = JPMailPaths.PARAMETER_ANNOTATION_MODEL_PATH;
			datadictionaryModelPath = JPMailPaths.DATA_DICTIONARY_MODEL_PATH;
			codeBasePackageName = JPMailPaths.CODE_BASE_PACKAGE_NAME;
			javaModelPath = JPMailPaths.JAVA_MODEL_PATH;
			codeQLModelPath = JPMailPaths.CODEQL_MODEL_PATH;
			correspondenceModelPath = JPMailPaths.PCMJAVACORRESPONDENCE_MODE_PATH;
			codeQLQueryFolderPath = JPMailPaths.CODEQL_QUERY_FOLDER_PATH;

		} else if (CASE_STUDY.equals(TravelPlannerPaths.CASE_STUDY_NAME)) {
			repositoryPath = TravelPlannerPaths.REPOSITORY_PATH;
			parameterAnnotationModelPath = TravelPlannerPaths.PARAMETER_ANNOTATION_MODEL_PATH;
			datadictionaryModelPath = TravelPlannerPaths.DATA_DICTIONARY_MODEL_PATH;
			codeBasePackageName = TravelPlannerPaths.CODE_BASE_PACKAGE_NAME;
			javaModelPath = TravelPlannerPaths.JAVA_MODEL_PATH;
			codeQLModelPath = TravelPlannerPaths.CODEQL_MODEL_PATH;
			correspondenceModelPath = TravelPlannerPaths.PCMJAVACORRESPONDENCE_MODE_PATH;
			codeQLQueryFolderPath = TravelPlannerPaths.CODEQL_QUERY_FOLDER_PATH;
		}

		ExtendedDataFlowAnalysis2CodeQLAlignment alignment = new ExtendedDataFlowAnalysis2CodeQLAlignment(repositoryPath, parameterAnnotationModelPath, datadictionaryModelPath, codeBasePackageName, javaModelPath, codeQLModelPath, correspondenceModelPath, codeQLQueryFolderPath);
		alignment.performAlignment();

		return true;
	}

}
