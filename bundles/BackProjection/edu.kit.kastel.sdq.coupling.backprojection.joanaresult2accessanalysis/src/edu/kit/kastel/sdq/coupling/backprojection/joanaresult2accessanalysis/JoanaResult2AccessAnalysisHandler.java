package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis;

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

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		InputModels input = InputModels.createModelsFromFiles(InputModels.JAVA_MODEL_PATH, InputModels.JOANA_MODEL_PATH,
				InputModels.PCMJAVACORRESPONDENCE_MODE_PATH, InputModels.JOANA_RESULT_FILE_PATH,
				InputModels.REPOSITORY_PATH, InputModels.CONFIDENTIALITY_SPECIFICATION_PATH);
		
		JOANAOutputReader outputReader = new JOANAOutputReader(input.getJavaRoot(), input.getJoanaRoot());
		
		
		SourceCodeAnalysisResult scar = outputReader.readJOANAOutput(input.getJoanaResult());
		ResultingSpecificationExtractor extractor = new NaivePowerSetLatticeResultingSpecificationExtractor();
		ResultingSpecification resultingSpec = extractor.calculateResultingSpecification(scar);
		Backprojector backprojector = new Backprojector(input.getRepository(), input.getCorrespondenceRoot(), input.getConfidentiality(), input.getProfile());
		backprojector.project(resultingSpec);
		
		input.updateConfidentialityModel(InputModels.CONFIDENTIALITY_SPECIFICATION_PATH);
		
		return true;
	}

}
