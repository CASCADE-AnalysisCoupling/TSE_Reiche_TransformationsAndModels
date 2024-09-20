package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql;

import java.util.HashSet;

import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.CodeQLTainttrackingCodeGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators.ExtendedDataFlowAnalysis2CodeQLModelsGenerator;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.utils.ConfigurationrepresentationUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;

public class ExtendedDataFlowAnalysis2CodeQLAlignment {




	private final String repositoryPath;
	private final String parameterAnnotationModelPath;
	private final String datadictionaryModelPath;
	private final String codeBasePackageName;
	private final String javaModelPath;
	private final String codeQLModelPath;
	private final String correspondenceModelPath;
	private final String codeQLQueryFolderPath;
	public static String policyStyle;
	private final String edfaCodeQLCorrespondencesPath;
	private final String codeQL_Configurations_Path;
	private final String edfa_Configurations_Path;

	private static final String CODEQL_QUERY_FILE_ENDING = "ql";
	private static final String CODEQL_QUERY_FILE_NAME = "LabeledTaintTracking4ExtendedDataflowAnalysis";
	
	public ExtendedDataFlowAnalysis2CodeQLAlignment(String repositoryPath, String parameterAnnotationModelPath,
			String datadictionaryModelPath, String edfa_Configurations_Path, String codeBasePackageName, String javaModelPath,
			String codeQLModelPath, String codeQLConfigurations_Path, String correspondenceModelPath, String codeQLQueryFolderPath, String edfaCodeQLCorrespondencesPath, String policyStyle) {
		super();
		this.repositoryPath = repositoryPath;
		this.parameterAnnotationModelPath = parameterAnnotationModelPath;
		this.datadictionaryModelPath = datadictionaryModelPath;
		this.codeBasePackageName = codeBasePackageName;
		this.javaModelPath = javaModelPath;
		this.codeQLModelPath = codeQLModelPath;
		this.correspondenceModelPath = correspondenceModelPath;
		this.codeQLQueryFolderPath = codeQLQueryFolderPath;
		ExtendedDataFlowAnalysis2CodeQLAlignment.policyStyle = policyStyle;
		this.edfaCodeQLCorrespondencesPath = edfaCodeQLCorrespondencesPath;
		this.codeQL_Configurations_Path = codeQLConfigurations_Path;
		this.edfa_Configurations_Path = edfa_Configurations_Path;
	}

	
	public void performAlignment() {
		
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE.createPCMJavaCorrespondenceRoot();
		InputModels models = InputModels.createModelsFromFiles(repositoryPath, parameterAnnotationModelPath, datadictionaryModelPath);
		

		ExtendedDataFlowAnalysis2CodeQLModelsGenerator modelsGenerator = new ExtendedDataFlowAnalysis2CodeQLModelsGenerator();
		
	
		
		
		OutputModels outputModels = modelsGenerator.generateCodeQLModels(correspondences, models.getRepository(), models.getExtensionRoot(), models.getDataDictionary(), codeBasePackageName);
		CodeQLTainttrackingTemplate tainttrackingCodeGenerator = new CodeQLTainttrackingCodeGenerator(modelsGenerator.getJavaRoot(), modelsGenerator.getTainttrackingRoot().getQueries().get(0));
		
		String tainttrackingContent = tainttrackingCodeGenerator.generate();
		
		FileToGenerate fileToGenerate = new FileToGenerate(tainttrackingContent, codeQLQueryFolderPath, CODEQL_QUERY_FILE_NAME, CODEQL_QUERY_FILE_ENDING);
		fileToGenerate.write();

		outputModels.writeToFiles(javaModelPath, codeQLModelPath, correspondenceModelPath, edfaCodeQLCorrespondencesPath, codeQL_Configurations_Path, edfa_Configurations_Path);
		
		System.out.println("Done Alignment Access Analysis 2 CodeQL");
	}
}
