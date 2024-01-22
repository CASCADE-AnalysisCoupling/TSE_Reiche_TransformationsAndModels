package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis;

import java.nio.file.Paths;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.analysisoutputreader.JOANAOutputReader;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.InputModels;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.resultingspecificationresolution.NaivePowerSetLatticeResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.resultingspecificationresolution.ResultingSpecificationExtractor;

public class JoanaResult2AccessAnalysisHandler extends AbstractHandler {

	protected static final String MODEL_BASE_FOLDER_PATH = "/home/frederik/Arbeitsplatz/eclipse/accessanalysis/runtime-EclipseApplication/joanaTestModel";
	protected static final String JOANA_RESULT_FILE_PATH = "/home/frederik/CodingLocation/TravelPlannerHaering";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		return this.executeBackprojection(MODEL_BASE_FOLDER_PATH, JOANA_RESULT_FILE_PATH);
	}

	public boolean executeBackprojection(String modelBaseFolderPath, String joanaResultFilePath) {

		modelBaseFolderPath = Paths.get(modelBaseFolderPath).toAbsolutePath().toString();
		String javaModelPath = Paths.get(String.format("%s/%s.%s", modelBaseFolderPath, InputModels.JAVA_MODEL_NAME,
				InputModels.JAVA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
		String joanaModelPath = Paths.get(String.format("%s/%s.%s", modelBaseFolderPath, InputModels.JOANA_MODEL_NAME,
				InputModels.JOANA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
		String pcmJavaCorrespondenceModelPath = Paths.get(String.format("%s/%s.%s", modelBaseFolderPath,
				InputModels.PCMJAVACORRESPONDENCE_MODEL_NAME, InputModels.PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING))
				.toAbsolutePath().toString();
		joanaResultFilePath = Paths.get(String.format(joanaResultFilePath + "/%s.%s",
				InputModels.JOANA_RESULT_FILE_NAME, InputModels.JOANA_RESULT_FILE_ENDING)).toAbsolutePath().toString();
		String repositoryPath = Paths
				.get(String.format("%s/default.%s", modelBaseFolderPath, InputModels.REPOSITORY_FILE_ENDING))
				.toAbsolutePath().toString();
		String confidentialitySpecificationPath = Paths.get(String.format("%s/default.%s", modelBaseFolderPath,
				InputModels.CONFIDENTIALITY_SPECIFICATION_FILE_ENDING)).toAbsolutePath().toString();

		InputModels input = InputModels.createModelsFromFiles(javaModelPath, joanaModelPath,
				pcmJavaCorrespondenceModelPath, joanaResultFilePath, repositoryPath, confidentialitySpecificationPath);

		JOANAOutputReader outputReader = new JOANAOutputReader(input.getJavaRoot(), input.getJoanaRoot());

		SourceCodeAnalysisResult scar = outputReader.readJOANAOutput(input.getJoanaResult());
		ResultingSpecificationExtractor extractor = new NaivePowerSetLatticeResultingSpecificationExtractor();
		ResultingSpecification resultingSpec = extractor.calculateResultingSpecification(scar);
		Backprojector backprojector = new Backprojector(input.getRepository(), input.getCorrespondenceRoot(),
				input.getConfidentiality(), input.getProfile());
		backprojector.project(resultingSpec);

		input.updateConfidentialityModel(confidentialitySpecificationPath);

		return true;
	}

}
