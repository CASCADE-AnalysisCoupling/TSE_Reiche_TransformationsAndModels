package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.elementidentifications.Correspondences;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.AccessAnalysis2CodeQLModelsGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileOutput;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.CodeQLTainttrackingCodeGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;

public class AccessAnalysis2CodeQLHandler {

	private final String FILE_ENDING = "ql";
	private final String FOLDER_PATH = "/home/frederik/CodingLocation/CodeQL/java";
	private final String FILE_NAME = "LabeledTaintTracking";
	
	public void handle() {
		
		Repository repository = null;;
		ProfileApplication repositoryProfileApplication = null;
		Correspondences correspondences = new Correspondences();
		ConfidentialitySpecification confidentialitySpec = null;
		
		AccessAnalysis2CodeQLModelsGenerator modelsGenerator = new AccessAnalysis2CodeQLModelsGenerator();
		CodeQLRoot root = modelsGenerator.generateCodeQLModels(correspondences, repository, repositoryProfileApplication, confidentialitySpec);
		
		CodeQLTainttrackingTemplate tainttrackingCodeGenerator = new CodeQLTainttrackingCodeGenerator(root.getCodeRoot(), root.getDataFlowRoot().getConfigurations().get(0));
		
		
		String tainttrackingContent = tainttrackingCodeGenerator.generate();
		
		FileToGenerate fileToGenerate = new FileToGenerate(tainttrackingContent, FOLDER_PATH, FILE_NAME, FILE_ENDING);
		
		FileOutput.writeToFile(fileToGenerate);
		
	}
	
}
