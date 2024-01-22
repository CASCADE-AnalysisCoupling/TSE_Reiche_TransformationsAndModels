package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.adapter;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.AccessAnalysis2JOANAHandler;

public class AccessAnalysis2JoanaAdapter implements ExecutableProcessingStepAdapter {
	
	/**
	 * args[0]: OK message, <br>
	 * args[1]: NotOK message, <br>
	 * args[2]: joanaEvalCodeFolderName, <br>
	 * args[3]: userSpecificRepoPath, <br>
	 * args[4]: evalRepoSpecificPath, <br>
	 * args[5]: pcmModelBasePath, <br>
	 * args[6]: joanaModelsBasefolder, <br>
	 * args[7]: basePackageName
	 */
	@Override
	public Result executeAdapter(String[] args) {

		Result result = new OKResult(args[0]);
		
		try {
			AccessAnalysis2JOANAHandler handler = new AccessAnalysis2JOANAHandler();
			handler.generate(args[2], args[3], args[4], args[5], args[6], args[7]);
		} catch (Exception e) {
			result = new NotOKResult(args[1] + "\n" + e.getMessage());
		}
		
		return result;
	}
}
