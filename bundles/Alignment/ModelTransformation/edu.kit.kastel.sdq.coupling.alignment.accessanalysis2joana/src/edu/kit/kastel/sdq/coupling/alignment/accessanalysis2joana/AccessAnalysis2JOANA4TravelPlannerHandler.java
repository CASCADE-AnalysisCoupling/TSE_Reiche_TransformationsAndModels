package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.Creator4SG4FullDynamicLevels;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.SecurityGeneratorCreator;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.testpaths.TravelPlannerPaths;

public class AccessAnalysis2JOANA4TravelPlannerHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		String repositoryPath = TravelPlannerPaths.REPOSITORY_PATH;
		String confidentialityModelPath = TravelPlannerPaths.CONFIDENTIALITY_SPECIFICATION_PATH;
		String javaCodeBasePath = TravelPlannerPaths.JAVA_CODE_BASE_PATH;
		String codeBasePackageName = TravelPlannerPaths.CODE_BASE_PACKAGE_NAME;
		String javaModelPath = TravelPlannerPaths.JAVA_MODEL_PATH;
		String joanaModelPath = TravelPlannerPaths.JOANA_MODEL_PATH;
		String correspondenceModelPath = TravelPlannerPaths.PCMJAVACORRESPONDENCE_MODE_PATH;
		
		SecurityGeneratorCreator sgc = new Creator4SG4FullDynamicLevels();

		AccessAnalysis2JOANAAlignment alignment = new AccessAnalysis2JOANAAlignment(repositoryPath,
				confidentialityModelPath, javaCodeBasePath, codeBasePackageName, javaModelPath, joanaModelPath,
				correspondenceModelPath, TravelPlannerPaths.CASE_STUDY_NAME, sgc);

		alignment.performAlignment();

		return true;
	}
}
