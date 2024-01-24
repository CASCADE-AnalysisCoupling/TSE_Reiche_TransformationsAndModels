package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.adapter;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.JoanaResult2AccessAnalysisHandler;

public class JoanaResult2AccessAnalysisAdapter implements ExecutableProcessingStepAdapter {

	/**
	 * args[0]: OK message, <br>
	 * args[1]: NotOK message, <br>
	 * args[2]: javaModelPath, <br>
	 * args[3]: joanaModelPath, <br>
	 * args[4]: pcmJavaCorrespondenceModelPath, <br>
	 * args[5]: joanaResultFilePath, <br>
	 * args[6]: repositoryPath, <br>
	 * args[7]: confidentialitySpecificationPath, <br>
	 */
	@Override
	public Result executeAdapter(String[] args) {

		Result result = new OKResult(args[0]);

		try {
			JoanaResult2AccessAnalysisHandler handler = new JoanaResult2AccessAnalysisHandler();
			handler.executeBackprojection(args[2], args[3], args[4], args[5], args[6], args[7]);
		} catch (Exception e) {
			result = new NotOKResult(args[1] + "\n" + e.getMessage());
		}

		return result;
	}

}