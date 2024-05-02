package edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfacodeql.adapter;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.CodeQL2ExtendedDataFlowAnalysisResultIntegration;

public class CodeQL2EDFAAdapter implements ExecutableProcessingStepAdapter{

	
	/**
	 * args[0]: OK message, <br>
	 * args[1]: NotOK message, <br>
	 * args[2]: javaModelLocation, <br>
	 * args[3]: codeQLModelLocation, <br>
	 * args[4]: correspondenceModelLocation, <br>
	 * args[5]: codeQLResultLocation, <br>
	 * args[6]: parameterAnnotationModelLocation, <br>
	 * args[7]: dataDictionaryLocation, <br>
	 * args[8]: originBackupLocation, <br>
	 * args[9]: repositoryModelLocation, <br>
	 * args[10]: policyStyle, <br>
	 * args[11]: scarLocation, <br>
	 * args[12]: resultingValuesLocation, <br>
	 * args[13]: edfaCodeQLCorrespondencesLocation <br>
	 * args[14]: scarCorrespondencesLocation <br>
	 * args[15]: resultingValuesCorrespondencesLocation<br>
	 */
	@Override
	public Result executeAdapter(String[] args) {
		Result result = new OKResult(args[0]);
		try {
			CodeQL2ExtendedDataFlowAnalysisResultIntegration codeql2edfa = new CodeQL2ExtendedDataFlowAnalysisResultIntegration(args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15]);
			codeql2edfa.integrate();
		} catch (Exception e) {
			result = new NotOKResult(args[1] + "\n" + e.getMessage());
		}
		
		return result;
	}
}
