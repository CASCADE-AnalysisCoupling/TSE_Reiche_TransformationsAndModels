package edu.kit.kastel.sdq.casestudy.framework.processingsteps.accessanalysiscodeql.adapters;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.CodeQL2AccessAnalysisResultIntegration;

public class CodeQL2AccessAnalysisAdapter implements ExecutableProcessingStepAdapter {

	/**
	 * args[0]: OK message, <br>
	 * args[1]: NotOK message, <br>
	 * args[2]: policyStyle, <br>
	 * args[3]: javaModelLocation, <br>
	 * args[4]: codeQLModelLocation, <br>
	 * args[5]: correspondenceModelLocation, <br>
	 * args[6]: resultFileLocation, <br>
	 * args[7]: repositoryModelLocation, <br>
	 * args[8]: confidentialitySpecificationLocation, <br>
	 * args[9]: originBackupLocation, <br>
	 * args[10]: scarLocation, <br>
	 * args[11]: resultingValuesLocation, <br>
	 * args[12]: accessAnalysisCorrespondencesLocation <br>
	 * args[13]: scarCorrespondencesLocation <br>
	 * args[14]: resultingValuesCorrespondencesLocation<br>
	 * args[15]: codeQL_Configurations_Location <br>
	 */
	@Override
	public Result executeAdapter(String[] args) {

		Result result = new OKResult(args[0]);

		try {
			CodeQL2AccessAnalysisResultIntegration integration = new CodeQL2AccessAnalysisResultIntegration(args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15]);
			integration.performResultIntegration();
		} catch (Exception e) {
			result = new NotOKResult(args[1] + "\n" + e.getMessage());
		}

		return result;
	}
}