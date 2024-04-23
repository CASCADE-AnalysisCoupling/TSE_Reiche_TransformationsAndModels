package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.Creator4SG4HighLow;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.SecurityGeneratorCreator;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.testpaths.JPMailPaths;

public class AccessAnalysis2CodeQL4JPMailHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		String repositoryPath = JPMailPaths.REPOSITORY_PATH;
		String confidentialityModelPath = JPMailPaths.CONFIDENTIALITY_SPECIFICATION_PATH;
		String codeBasePackageName = JPMailPaths.CODE_BASE_PACKAGE_NAME;
		String javaModelPath = JPMailPaths.JAVA_MODEL_PATH;
		String codeQLModelPath = JPMailPaths.CODEQL_MODEL_PATH;
		String correspondenceModelPath = JPMailPaths.PCMJAVACORRESPONDENCE_MODE_PATH;
		String codeQLQueryFolderPath = JPMailPaths.CODEQL_QUERY_FOLDER_PATH;

		SecurityGeneratorCreator sgc = new Creator4SG4HighLow();

		AccessAnalysis2CodeQLAlignment alignment = new AccessAnalysis2CodeQLAlignment(repositoryPath,
				confidentialityModelPath, codeBasePackageName, javaModelPath, codeQLModelPath, correspondenceModelPath,
				codeQLQueryFolderPath, JPMailPaths.CASE_STUDY_NAME, sgc);
		alignment.performAlignment();

		return true;
	}

}
