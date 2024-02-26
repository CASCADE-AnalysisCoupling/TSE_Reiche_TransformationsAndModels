package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql;

import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.CodeQLTainttrackingCodeGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators.ExtendedDataFlowAnalysis2CodeQLModelsGenerator;
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

	private static final String CODEQL_QUERY_FILE_ENDING = "ql";
	private static final String CODEQL_QUERY_FILE_NAME = "CodeQLLabeledTainttracking4ExtendedDataflowAnalysis";
	
	public ExtendedDataFlowAnalysis2CodeQLAlignment(String repositoryPath, String parameterAnnotationModelPath,
			String datadictionaryModelPath, String codeBasePackageName, String javaModelPath,
			String codeQLModelPath, String correspondenceModelPath, String codeQLQueryFolderPath) {
		super();
		this.repositoryPath = repositoryPath;
		this.parameterAnnotationModelPath = parameterAnnotationModelPath;
		this.datadictionaryModelPath = datadictionaryModelPath;
		this.codeBasePackageName = codeBasePackageName;
		this.javaModelPath = javaModelPath;
		this.codeQLModelPath = codeQLModelPath;
		this.correspondenceModelPath = correspondenceModelPath;
		this.codeQLQueryFolderPath = codeQLQueryFolderPath;
	}

	
	public void performAlignment() {
		
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE.createPCMJavaCorrespondenceRoot();
		InputModels models = InputModels.createModelsFromFiles(repositoryPath, parameterAnnotationModelPath, datadictionaryModelPath);
		

		ExtendedDataFlowAnalysis2CodeQLModelsGenerator modelsGenerator = new ExtendedDataFlowAnalysis2CodeQLModelsGenerator();
		modelsGenerator.generateCodeQLModels(correspondences, models.getRepository(), models.getExtensionRoot(), models.getDataDictionary(), codeBasePackageName);
		CodeQLTainttrackingTemplate tainttrackingCodeGenerator = new CodeQLTainttrackingCodeGenerator(modelsGenerator.getJavaRoot(), modelsGenerator.getTainttrackingRoot().getConfigurations().get(0));
		
		OutputModels outputModels = new OutputModels(modelsGenerator.getJavaRoot(), modelsGenerator.getTainttrackingRoot(), correspondences);
		
		String tainttrackingContent = tainttrackingCodeGenerator.generate();
		
		FileToGenerate fileToGenerate = new FileToGenerate(tainttrackingContent, codeQLQueryFolderPath, CODEQL_QUERY_FILE_NAME, CODEQL_QUERY_FILE_ENDING);
		fileToGenerate.write();

		outputModels.writeToFiles(javaModelPath, codeQLModelPath, correspondenceModelPath);

	}
}
