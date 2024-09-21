package edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfajoana.adapter;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.Joana2ExtendedDataFlowAnalysisResultIntegration;

public class JOANA2EDFAAdapter implements ExecutableProcessingStepAdapter {

	/**
	 * args[0]: OK message, <br>
	 * args[1]: NotOK message, <br>
	 * args[2]: policyStyle, <br>
	 * args[3]: javaModelLocation, <br>
	 * args[4]: joanaModelLocation, <br>
	 * args[5]: joana_Configurations_Location <br>
	 * args[6]: pcmJavaCorrespondenceModelLocation, <br>
	 * args[7]: joanaResultLocation, <br>
	 * args[8]: repositoryModelLocation, <br>
	 * args[9]: originBackupLocation, <br>
	 * args[10]: parameterAnnotationModelLocation, <br>
	 * args[11]: dataDictionaryLocation, <br>
	 * args[12]: scarLocation, <br>
	 * args[13]: resultingValuesLocation, <br>
	 * args[14]: edfaJoanaCorrespondencesLocation <br>
	 * args[15]: scarCorrespondencesLocation <br>
	 * args[16]: resultingValuesCorrespondencesLocation<br>
	 */
	@Override
	public Result executeAdapter(String[] args) {
		Result result = new OKResult(args[0]);
		try {
			Joana2ExtendedDataFlowAnalysisResultIntegration joana2edfa = new Joana2ExtendedDataFlowAnalysisResultIntegration(
					args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11],
					args[12], args[13], args[14], args[15], args[16]);
			joana2edfa.integrate();
		} catch (Exception e) {
			result = new NotOKResult(args[1] + "\n" + e.getMessage());
		}

		return result;
	}
}
