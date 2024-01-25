package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.scarparser.CodeQLSarifOutput2SCARParser;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.CodeQLResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.AccessAnalysisFittetPowerSetResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationExtractor;


public class CodeQLResult2AccessAnalysisHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Models input = Models.createModelsFromFiles(Models.JAVA_MODEL_PATH,
				Models.CODEQL_MODEL_PATH, 
				Models.PCMJAVACORRESPONDENCE_MODE_PATH,
				Models.CODEQL_RESULT_FILE_PATH, 
				Models.REPOSITORY_MODEL_PATH,
				Models.CONFIDENTIALITY_SPECIFICATION_MODEL_PATH);

		//Input -> ResultingSpecification
		
		CodeQLResultingSpecificationExtractor extractor = new CodeQLResultingSpecificationExtractor(new AccessAnalysisFittetPowerSetResultingSpecificationExtractor(null));
		ResultingSpecification resultingSpecification = extractor.extract(input.getTainttrackingRoot(), input.getJavaRoot(), input.getCodeQLResult());
		
		
		
		
		//BackProjection ResultingSpecification -> AAM
		Backproject backprojector = new Backprojector(input.getRepository(), input.getCorrespondenceRoot(), input.getConfidentiality(), input.getProfile(), input.getTainttrackingRoot().getConfigurations().get(0));
		backprojector.project(resultingSpecification);
		input.updateConfidentialityModel(Models.CONFIDENTIALITY_SPECIFICATION_MODEL_PATH);
		
		return true;
	}

}
