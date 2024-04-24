package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.AccessAnalysis2CodeQLModelsGenerator;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.SecurityGeneratorCreator;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.CodeQLTainttrackingCodeGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;

public class AccessAnalysis2CodeQLAlignment {

	public AccessAnalysis2CodeQLAlignment(String repositoryPath, String confidentialityModelPath,
			String codeBasePackageName, String javaModelPath, String codeQLModelPath,
			String correspondenceModelPath, String codeQLQueryFolderPath, String accessAnalysisCodeQLCorrespondenceModelPath, SecurityGeneratorCreator securityGeneratorCreator) {
		super();
		this.repositoryPath = repositoryPath;
		this.confidentialityModelPath = confidentialityModelPath;
		this.codeBasePackageName = codeBasePackageName;
		this.javaModelPath = javaModelPath;
		this.codeQLModelPath = codeQLModelPath;
		this.correspondenceModelPath = correspondenceModelPath;
		this.codeQLQueryFolderPath = codeQLQueryFolderPath;
		this.securityGeneratorCreator = securityGeneratorCreator;
		this.accessAnalysisCodeQLCorrespondenceModelPath = accessAnalysisCodeQLCorrespondenceModelPath;
	}

	private final String repositoryPath;
	private final String confidentialityModelPath;
	private final String codeBasePackageName;
	private final String javaModelPath;
	private final String codeQLModelPath;
	private final String correspondenceModelPath;
	private final String codeQLQueryFolderPath;
	private final String accessAnalysisCodeQLCorrespondenceModelPath;
	
	private final SecurityGeneratorCreator securityGeneratorCreator;
	
	private static final String CODEQL_QUERY_FILE_ENDING = "ql";
	private static final String CODEQL_QUERY_FILE_NAME = "LabeledTaintTracking4AccessAnalysis";
	
	public void performAlignment() {
		
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE.createPCMJavaCorrespondenceRoot();
		InputModels models = InputModels.createModelsFromFiles(repositoryPath, confidentialityModelPath);
		Repository repo = models.getRepository();
		ProfileApplication profile = models.getProfile();
		ConfidentialitySpecification spec = models.getConfidentiality();

		AccessAnalysis2CodeQLModelsGenerator modelsGenerator = new AccessAnalysis2CodeQLModelsGenerator(securityGeneratorCreator);
		
		OutputModels outputModels = modelsGenerator.generateCodeQLModels(correspondences, repo, profile, spec, codeBasePackageName);
		CodeQLTainttrackingTemplate tainttrackingCodeGenerator = new CodeQLTainttrackingCodeGenerator(modelsGenerator.getJavaRoot(), modelsGenerator.getTainttrackingRoot().getConfigurations().get(0));
		
		String tainttrackingContent = tainttrackingCodeGenerator.generate();
		
		FileToGenerate fileToGenerate = new FileToGenerate(tainttrackingContent, codeQLQueryFolderPath, CODEQL_QUERY_FILE_NAME, CODEQL_QUERY_FILE_ENDING);
		fileToGenerate.write();

		outputModels.writeToFiles(javaModelPath, codeQLModelPath, correspondenceModelPath, accessAnalysisCodeQLCorrespondenceModelPath);

		System.out.println("Done Alignment Access Analysis 2 CodeQL");
	}
}
