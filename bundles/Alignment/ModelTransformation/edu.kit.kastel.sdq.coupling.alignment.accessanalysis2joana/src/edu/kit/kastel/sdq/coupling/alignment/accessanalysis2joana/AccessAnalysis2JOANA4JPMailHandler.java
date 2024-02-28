package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana;



import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.testpaths.TravelPlannerPaths;


public class AccessAnalysis2JOANA4JPMailHandler extends AbstractHandler{

	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	
		
		String repositoryPath = JPMailPaths.REPOSITORY_PATH;
		String confidentialityModelPath = JPMailPaths.CONFIDENTIALITY_SPECIFICATION_PATH;
		String javaCodeBasePath = JPMailPaths.JAVA_CODE_BASE_PATH;
		String codeBasePackageName = JPMailPaths.CODE_BASE_PACKAGE_NAME;
		String javaModelPath = JPMailPaths.JAVA_MODEL_PATH;
		String joanaModelPath = JPMailPaths.JOANA_MODEL_PATH;
		String correspondenceModelPath = JPMailPaths.PCMJAVACORRESPONDENCE_MODE_PATH;

		AccessAnalysis2JOANAAlignment alignment = new AccessAnalysis2JOANAAlignment(repositoryPath, confidentialityModelPath, javaCodeBasePath, codeBasePackageName, javaModelPath, joanaModelPath, correspondenceModelPath, TravelPlannerPaths.CASE_STUDY_NAME);

		alignment.performAlignment();

		return true;
	}
}
