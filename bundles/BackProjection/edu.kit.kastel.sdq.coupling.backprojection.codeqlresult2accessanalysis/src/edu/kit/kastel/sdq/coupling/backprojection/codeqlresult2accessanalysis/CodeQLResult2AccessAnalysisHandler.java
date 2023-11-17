package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.InputModels;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.outputformatreader.CodeQLSarifReader;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.resultingspecificationresultion.NaivePowerSetLatticeResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.resultingspecificationresultion.ResultingSpecificationExtractor;

public class CodeQLResult2AccessAnalysisHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		InputModels input = InputModels.createModelsFromFiles(InputModels.JAVA_MODEL_PATH,
				InputModels.CODEQL_MODEL_PATH, 
				InputModels.PCMJAVACORRESPONDENCE_MODE_PATH,
				InputModels.CODEQL_RESULT_FILE_PATH, 
				InputModels.REPOSITORY_PATH,
				InputModels.CONFIDENTIALITY_SPECIFICATION_PATH);

		CodeQLSarifReader sarifReader = new CodeQLSarifReader(input.getTainttrackingRoot(), input.getJavaRoot());
		SourceCodeAnalysisResult scar = sarifReader.interpretCodeQLSarif(input.getCodeQLResult());
		ResultingSpecificationExtractor extractor = new NaivePowerSetLatticeResultingSpecificationExtractor(
				input.getTainttrackingRoot().getConfigurations().get(0));
		ResultingSpecification resultingSpecification = extractor.calculateResultingSpecification(scar);
		Backproject backprojector = new Backprojector(input.getRepository(), input.getCorrespondenceRoot(), input.getConfidentiality(), input.getProfile(), input.getTainttrackingRoot().getConfigurations().get(0));
		
		backprojector.project(resultingSpecification);
		input.updateConfidentialityModel(InputModels.CONFIDENTIALITY_SPECIFICATION_PATH);
		return true;
	}

}
