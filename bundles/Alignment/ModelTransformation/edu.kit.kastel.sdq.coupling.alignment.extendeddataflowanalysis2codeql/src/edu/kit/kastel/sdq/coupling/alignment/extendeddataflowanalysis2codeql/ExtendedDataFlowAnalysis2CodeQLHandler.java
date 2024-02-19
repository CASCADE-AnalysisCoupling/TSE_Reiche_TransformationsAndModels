package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql;

import java.nio.file.Paths;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;


import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.CodeQLTainttrackingCodeGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators.ExtendedDataFlowAnalysis2CodeQLModelsGenerator;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;

public class ExtendedDataFlowAnalysis2CodeQLHandler extends AbstractHandler{
	private final String FILE_ENDING = "ql";
	private final String FOLDER_PATH = Paths.get(String.format("%s/%s/CodeQLQuery/ExtendedDataFlowAnalysis/", InputModels.USER_SPECIFIC_REPO_PATH, InputModels.EVAL_REPO_SPECIFIC_PATH)).toAbsolutePath().toString();
	private final String FILE_NAME = "CodeQLLabeledTainttracking4ExtendedDataflowAnalysis";

	
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE.createPCMJavaCorrespondenceRoot();
		InputModels models = InputModels.createModelsFromFiles(InputModels.REPOSITORY_PATH, InputModels.PARAMETER_ANNOTATION_MODEL_PATH, InputModels.DATA_DICTIONARY_MODEL_PATH);
		

		ExtendedDataFlowAnalysis2CodeQLModelsGenerator modelsGenerator = new ExtendedDataFlowAnalysis2CodeQLModelsGenerator();
		modelsGenerator.generateCodeQLModels(correspondences, models.getRepository(), models.getExtensionRoot(), models.getDataDictionary());
		CodeQLTainttrackingTemplate tainttrackingCodeGenerator = new CodeQLTainttrackingCodeGenerator(modelsGenerator.getJavaRoot(), modelsGenerator.getTainttrackingRoot().getConfigurations().get(0));
		
		OutputModels outputModels = new OutputModels(modelsGenerator.getJavaRoot(), modelsGenerator.getTainttrackingRoot(), correspondences);
		
		String tainttrackingContent = tainttrackingCodeGenerator.generate();
		
		FileToGenerate fileToGenerate = new FileToGenerate(tainttrackingContent, FOLDER_PATH, FILE_NAME, FILE_ENDING);
		fileToGenerate.write();

		outputModels.writeToFiles();
		return true;
	}
}
