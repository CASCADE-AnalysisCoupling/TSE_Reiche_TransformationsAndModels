package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql;

import java.nio.file.Paths;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileOutput;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.CodeQLTainttrackingCodeGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators.ExtendedDataFlowAnalysis2CodeQLModelsGenerator;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;

public class ExtendedDataFlowAnalysis2CodeQLHandler extends AbstractHandler{
	private final String FILE_ENDING = "ql";
	private final String FOLDER_PATH = Paths.get("/home/frederik/CodingLocation/CodeQL/java").toAbsolutePath().toString();
	private final String FILE_NAME = "ExtendedDataFlowAnalysisQLTainttracking";

	
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE.createPCMJavaCorrespondenceRoot();
		InputModels models = InputModels.createModelsFromFiles(InputModels.REPOSITORY_PATH, InputModels.EXTENSION_PARAMETER_ANNOTATION_MODEL_PATH, InputModels.DATA_DICTIONARY_MODEL_PATH);
		

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
