package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.backprojection.Backproject;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.models.InputModels;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.resultingspecificationresolution.NaivePowerSetLatticeResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.resultingspecificationresolution.ResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.scarparser.CodeQLSarifParser;

public class CodeQLResult2ExtendedDataFlowAnalysisHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		InputModels input = InputModels.createModelsFromFiles(InputModels.JAVA_MODEL_PATH,
				InputModels.CODEQL_MODEL_PATH, 
				InputModels.PCMJAVACORRESPONDENCE_MODE_PATH,
				InputModels.CODEQL_RESULT_FILE_PATH, 
				InputModels.REPOSITORY_PATH,
				InputModels.EXTENSION_PARAMETER_ANNOTATION_MODEL_PATH,
				InputModels.DATA_DICTIONARY_MODEL_PATH);

		CodeQLSarifParser sarifReader = new CodeQLSarifParser(input.getTainttrackingRoot(), input.getJavaRoot());
		SourceCodeAnalysisResult scar = sarifReader.interpretCodeQLSarif(input.getCodeQLResult());
		ResultingSpecificationExtractor extractor = new NaivePowerSetLatticeResultingSpecificationExtractor(
				input.getTainttrackingRoot().getConfigurations().get(0));
		ResultingSpecification resultingSpecification = extractor.calculateResultingSpecification(scar);
		//Backproject backprojector = new Backprojector(input.getRepository(), input.getCorrespondenceRoot(), input.getConfidentiality(), input.getProfile(), input.getTainttrackingRoot().getConfigurations().get(0));
		
		//backprojector.project(resultingSpecification);
		//input.updateConfidentialityModel(InputModels.CONFIDENTIALITY_SPECIFICATION_PATH);
		return true;
	}

}
