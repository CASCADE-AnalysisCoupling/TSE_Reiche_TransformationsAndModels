package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.testpaths.TravelPlannerPaths;


public class AccessAnalysis2CodeQL4TravelPlannerHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	
		String repositoryPath = TravelPlannerPaths.REPOSITORY_PATH;
		String confidentialityModelPath = TravelPlannerPaths.CONFIDENTIALITY_SPECIFICATION_PATH;
		String codeBasePackageName = TravelPlannerPaths.CODE_BASE_PACKAGE_NAME;
		String javaModelPath = TravelPlannerPaths.JAVA_MODEL_PATH;
		String codeQLModelPath = TravelPlannerPaths.CODEQL_MODEL_PATH;
		String correspondenceModelPath = TravelPlannerPaths.PCMJAVACORRESPONDENCE_MODE_PATH;
		String codeQLQueryFolderPath = TravelPlannerPaths.CODEQL_QUERY_FOLDER_PATH;
		

		AccessAnalysis2CodeQLAlignment alignment = new AccessAnalysis2CodeQLAlignment(repositoryPath, confidentialityModelPath, codeBasePackageName, javaModelPath, codeQLModelPath, correspondenceModelPath, codeQLQueryFolderPath, TravelPlannerPaths.CASE_STUDY_NAME);
		alignment.performAlignment();

		return true;
	}
	
}
