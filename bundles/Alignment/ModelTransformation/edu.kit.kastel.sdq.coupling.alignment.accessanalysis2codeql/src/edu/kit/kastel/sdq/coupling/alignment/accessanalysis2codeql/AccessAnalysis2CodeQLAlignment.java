package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.AccessAnalysis2CodeQLModelsGenerator;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.SecurityGeneratorCreator;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.CodeQLTainttrackingCodeGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate;

public class AccessAnalysis2CodeQLAlignment {

	public AccessAnalysis2CodeQLAlignment(String repositoryPath, String confidentialityModelPath, String accessAnalysisConfigurations_Path,
			String codeBasePackageName, String javaModelPath, String codeQLModelPath, String codeQLConfigurations_Path, String pcmJava_correspondenceModelPath,
			String codeQLQueryFolderPath, String accessAnalysisCodeQLCorrespondenceModelPath,
			SecurityGeneratorCreator securityGeneratorCreator) {
		super();
		this.repositoryPath = repositoryPath;
		this.confidentialityModelPath = confidentialityModelPath;
		this.codeBasePackageName = codeBasePackageName;
		this.javaModelPath = javaModelPath;
		this.codeQLModelPath = codeQLModelPath;
		this.pcmJava_correspondenceModelPath = pcmJava_correspondenceModelPath;
		this.codeQLQueryFolderPath = codeQLQueryFolderPath;
		this.securityGeneratorCreator = securityGeneratorCreator;
		this.accessAnalysisCodeQLCorrespondenceModelPath = accessAnalysisCodeQLCorrespondenceModelPath;
		this.codeQL_Configurations_Path = codeQLConfigurations_Path;
		this.accessAnalysis_Configurations_Path = accessAnalysisConfigurations_Path;
	}

	private final String repositoryPath;
	private final String confidentialityModelPath;
	private final String codeBasePackageName;
	private final String javaModelPath;
	private final String codeQLModelPath;
	private final String pcmJava_correspondenceModelPath;
	private final String codeQLQueryFolderPath;
	private final String accessAnalysisCodeQLCorrespondenceModelPath;
	private final String codeQL_Configurations_Path;
	private final String accessAnalysis_Configurations_Path;

	private final SecurityGeneratorCreator securityGeneratorCreator;

	private static final String CODEQL_QUERY_FILE_ENDING = "ql";
	private static final String CODEQL_QUERY_FILE_NAME = "LabeledTaintTracking4AccessAnalysis";

	public void performAlignment() {

		InputModels models = InputModels.createModelsFromFiles(repositoryPath, confidentialityModelPath);
		Repository repo = models.getRepository();
		ProfileApplication profile = models.getProfile();
		ConfidentialitySpecification spec = models.getConfidentiality();

		AccessAnalysis2CodeQLModelsGenerator modelsGenerator = new AccessAnalysis2CodeQLModelsGenerator(
				securityGeneratorCreator);

		OutputModels outputModels = modelsGenerator.generateCodeQLModels(repo, profile, spec, codeBasePackageName);
		CodeQLTainttrackingTemplate tainttrackingCodeGenerator = new CodeQLTainttrackingCodeGenerator(
				modelsGenerator.getJavaRoot(), modelsGenerator.getTainttrackingRoot().getQueries().get(0));

		String tainttrackingContent = tainttrackingCodeGenerator.generate();

		FileToGenerate fileToGenerate = new FileToGenerate(tainttrackingContent, codeQLQueryFolderPath,
				CODEQL_QUERY_FILE_NAME, CODEQL_QUERY_FILE_ENDING);
		fileToGenerate.write();

		outputModels.writeToFiles(javaModelPath, codeQLModelPath, pcmJava_correspondenceModelPath,
				accessAnalysisCodeQLCorrespondenceModelPath, codeQL_Configurations_Path,
				accessAnalysis_Configurations_Path);

		System.out.println("Done Alignment Access Analysis 2 CodeQL");
	}
}
