package edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfacodeql.adapter;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.ExtendedDataFlowAnalysis2CodeQLAlignment;

public class EDFA2CodeQLAdapter implements ExecutableProcessingStepAdapter{

	/**
	 * args[0]: OK message, <br>
	 * args[1]: NotOK message, <br>
	 * args[2]: repositoryPath<br>
	 * args[3]: parameterAnnotationModelPath<br>
	 * args[4]: dataDictionaryModelPath<br>
	 * args[5]: codeBasePackageName<br>
	 * args[6]: javaModelPath<br>
	 * args[7]: codeQLModelPath<br>
	 * args[8]: pcmCorrespondenceModelPath<br>
	 * args[9]: codeQLQueryFolderPath<br>
	 * args[10]: policyStyle<br>
	 * args[11]: edfaCodeQLCorrespondenceModelPath<br>
	 */
	@Override
	public Result executeAdapter(String[] args) {

		Result result = new OKResult(args[0]);
		
		try {
			ExtendedDataFlowAnalysis2CodeQLAlignment alignment = new ExtendedDataFlowAnalysis2CodeQLAlignment(args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11]);
			alignment.performAlignment();
		} catch (Exception e) {
			result = new NotOKResult(args[1] + "\n" + e.getMessage());
		}
		
		return result;
	}
}
