package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.analysisoutputreader.JOANAOutputReader;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.resultingspecificationresolution.AccessAnalysisFittetPowerSetResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.resultingspecificationresolution.NaivePowerSetLatticeResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.resultingspecificationresolution.ResultingSpecificationExtractor;

public class JoanaResult2AccessAnalysisHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Models input = Models.createModelsFromFiles(Models.JAVA_MODEL_PATH, Models.JOANA_MODEL_PATH,
				Models.PCMJAVACORRESPONDENCE_MODE_PATH, Models.JOANA_RESULT_FILE_PATH,
				Models.REPOSITORY_MODEL_PATH, Models.CONFIDENTIALITY_SPECIFICATION_MODEL_PATH);
		
		JOANAOutputReader outputReader = new JOANAOutputReader(input.getJavaRoot(), input.getJoanaRoot());
		
		
		SourceCodeAnalysisResult scar = outputReader.readJOANAOutput(input.getJoanaResult());
		
		ResultingSpecificationExtractor extractor = new AccessAnalysisFittetPowerSetResultingSpecificationExtractor();
		ResultingSpecification resultingSpec = extractor.calculateResultingSpecification(scar);
		
		Backprojector backprojector = new Backprojector(input.getRepository(), input.getCorrespondenceRoot(), input.getConfidentiality(), input.getProfile());
		backprojector.project(resultingSpec);
		
		input.updateConfidentialityModel(Models.CONFIDENTIALITY_SPECIFICATION_MODEL_PATH);
		
		return true;
	}

}
