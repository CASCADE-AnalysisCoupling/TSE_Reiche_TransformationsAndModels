package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.outputformatreader.CodeQLSarifReader;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.resultingspecificationresultion.AccessAnalysisFittetPowerSetResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.resultingspecificationresultion.NaivePowerSetLatticeResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.resultingspecificationresultion.ResultingSpecificationExtractor;

public class CodeQLResult2AccessAnalysisHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Models input = Models.createModelsFromFiles(Models.JAVA_MODEL_PATH,
				Models.CODEQL_MODEL_PATH, 
				Models.PCMJAVACORRESPONDENCE_MODE_PATH,
				Models.CODEQL_RESULT_FILE_PATH, 
				Models.REPOSITORY_MODEL_PATH,
				Models.CONFIDENTIALITY_SPECIFICATION_MODEL_PATH);

		//Input -> SCAR 
		CodeQLSarifReader sarifReader = new CodeQLSarifReader(input.getTainttrackingRoot(), input.getJavaRoot());
		SourceCodeAnalysisResult scar = sarifReader.interpretCodeQLSarif(input.getCodeQLResult());
		//Resolution: SCAR -> ResultingSpecification
		ResultingSpecificationExtractor extractor = new AccessAnalysisFittetPowerSetResultingSpecificationExtractor(
				input.getTainttrackingRoot().getConfigurations().get(0));
		ResultingSpecification resultingSpecification = extractor.calculateResultingSpecification(scar);
		
		//BackProjection ResultingSpecification -> AAM
		Backproject backprojector = new Backprojector(input.getRepository(), input.getCorrespondenceRoot(), input.getConfidentiality(), input.getProfile(), input.getTainttrackingRoot().getConfigurations().get(0));
		backprojector.project(resultingSpecification);
		input.updateConfidentialityModel(Models.CONFIDENTIALITY_SPECIFICATION_MODEL_PATH);
		
		return true;
	}

}
