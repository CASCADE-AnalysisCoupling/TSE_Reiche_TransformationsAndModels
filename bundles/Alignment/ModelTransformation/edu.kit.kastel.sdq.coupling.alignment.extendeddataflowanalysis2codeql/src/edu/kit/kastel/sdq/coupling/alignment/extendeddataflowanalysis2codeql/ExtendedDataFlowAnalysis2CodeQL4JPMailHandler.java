package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.testpaths.JPMailPaths;


public class ExtendedDataFlowAnalysis2CodeQL4JPMailHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		String repositoryPath = JPMailPaths.REPOSITORY_PATH;
		String parameterAnnotationModelPath = JPMailPaths.PARAMETER_ANNOTATION_MODEL_PATH;
		String datadictionaryModelPath = JPMailPaths.DATA_DICTIONARY_MODEL_PATH;
		String codeBasePackageName = JPMailPaths.CODE_BASE_PACKAGE_NAME;
		String javaModelPath = JPMailPaths.JAVA_MODEL_PATH;
		String codeQLModelPath = JPMailPaths.CODEQL_MODEL_PATH;
		String correspondenceModelPath = JPMailPaths.PCMJAVACORRESPONDENCE_MODE_PATH;
		String codeQLQueryFolderPath = JPMailPaths.CODEQL_QUERY_FOLDER_PATH;

		ExtendedDataFlowAnalysis2CodeQLAlignment alignment = new ExtendedDataFlowAnalysis2CodeQLAlignment(
				repositoryPath, parameterAnnotationModelPath, datadictionaryModelPath, codeBasePackageName,
				javaModelPath, codeQLModelPath, correspondenceModelPath, codeQLQueryFolderPath,
				JPMailPaths.CASE_STUDY_NAME);
		alignment.performAlignment();

		return true;
	}

}
