package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql;

import java.nio.file.Paths;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
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

public class AccessAnalysis2CodeQLHandler extends AbstractHandler{

	private final String FILE_ENDING = "ql";
	private final String FOLDER_PATH = Paths.get("/home/frederik/CodingLocation/CodeQL/java").toAbsolutePath().toString();
	private final String FILE_NAME = "GeneratedLabeledTaintTracking";


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Correspondences correspondences = new Correspondences();
		AccessAnalysisModels models = AccessAnalysisModels.createModelsFromFiles(AccessAnalysisModels.REPOSITORY_PATH, AccessAnalysisModels.CONFIDENTIALITY_SPECIFICATION_PATH);
		
		Repository repo = models.getRepository();
		ProfileApplication profile = models.getProfile();
		ConfidentialitySpecification spec = models.getConfidentiality();
		AccessAnalysis2CodeQLModelsGenerator modelsGenerator = new AccessAnalysis2CodeQLModelsGenerator();
		CodeQLRoot root = modelsGenerator.generateCodeQLModels(correspondences, repo, profile, spec);
		CodeQLTainttrackingTemplate tainttrackingCodeGenerator = new CodeQLTainttrackingCodeGenerator(root.getCodeRoot(), root.getDataFlowRoot().getConfigurations().get(0));
		
		
		String tainttrackingContent = tainttrackingCodeGenerator.generate();
		
		FileToGenerate fileToGenerate = new FileToGenerate(tainttrackingContent, FOLDER_PATH, FILE_NAME, FILE_ENDING);
		
		FileOutput.writeToFile(fileToGenerate);
		return true;
	}
	
}
