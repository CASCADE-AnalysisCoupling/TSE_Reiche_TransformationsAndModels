package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.iterative;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.Joana2AccessAnalysisResultIntegration;

public class IterativeJoana2AccessAnalysisAdapter implements ExecutableProcessingStepAdapter {

	/**
	 * args[0]: OK message, <br>
	 * args[1]: NotOK message, <br>
	 * args[2]: javaModelLocation, <br>
	 * args[3]: joanaModelLocation, <br>
	 * args[4]: correspondenceModelLocation, <br>
	 * args[5]: joanaResultLocation, <br>
	 * args[6]: repositoryModelLocation, <br>
	 * args[7]: confidentialitySpecificationLocation, <br>
	 * args[8]: policyStyle, <br>
	 * args[9]: originBackupLocation, <br>
	 */
	@Override
	public Result executeAdapter(String[] args) {

		Result result = new OKResult(args[0]);

		try {
			Joana2AccessAnalysisResultIntegration integration = new Joana2AccessAnalysisResultIntegration(args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9]);
			integration.integrate(new IterativeResultingSpecificationResolutionFactory(), new IterativeBackprojectionFactory());
		} catch (Exception e) {
			result = new NotOKResult(args[1] + "\n" + e.getMessage());
		}

		return result;
	}
}
