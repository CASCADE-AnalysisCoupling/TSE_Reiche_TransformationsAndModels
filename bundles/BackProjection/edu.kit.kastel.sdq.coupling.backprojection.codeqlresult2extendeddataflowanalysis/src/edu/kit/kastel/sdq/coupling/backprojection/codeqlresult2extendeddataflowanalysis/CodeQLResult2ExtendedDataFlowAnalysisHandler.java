package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.backprojection.Backproject;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.models.InputModels;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.scarparser.CodeQLSarifOutput2SCARParser;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.CodeQLResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.NaivePowerSetLatticeResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationExtractor;

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

		
		CodeQLResultingSpecificationExtractor extractor = new CodeQLResultingSpecificationExtractor(new NaivePowerSetLatticeResultingSpecificationExtractor(input.getTainttrackingRoot().getConfigurations().get(0)));
		ResultingSpecification resultingSpecification = extractor.extract(input.getTainttrackingRoot(), input.getJavaRoot(), input.getCodeQLResult());
		Backproject backprojector = new Backprojector(input.getRepository(), input.getCorrespondenceRoot(), input.getExtensionRoot(), input.getTainttrackingRoot().getConfigurations().get(0), input.getDataDictionary());
		backprojector.project(resultingSpecification);
		input.updateExtensionModel(InputModels.EXTENSION_PARAMETER_ANNOTATION_MODEL_PATH);

		return true;
	}

}
