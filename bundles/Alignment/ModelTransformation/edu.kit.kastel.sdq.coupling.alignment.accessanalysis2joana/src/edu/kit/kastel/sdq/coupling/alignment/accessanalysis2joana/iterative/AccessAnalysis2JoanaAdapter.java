package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.AccessAnalysis2JOANAAlignment;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.Creator4SG4FullDynamicLevels;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.Creator4SG4HighLow;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.SecurityGeneratorCreator;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.testpaths.TravelPlannerPaths;

public class AccessAnalysis2JoanaAdapter implements ExecutableProcessingStepAdapter {

	/**
	 * args[0]: OK message, <br>
	 * args[1]: NotOK message, <br>
	 * args[2]: repositoryPath<br>
	 * args[3]: confidentialityModelPath<br>
	 * args[4]: javaCodeBasePath<br>
	 * args[5]: codeBasePackageName<br>
	 * args[6]: javaModelPath<br>
	 * args[7]: joanaModelPath<br>
	 * args[8]: correspondenceModelPath<br>
	 * args[9]: caseStudyName TODO change to PolicyStyle or sth. else for disj/conj
	 */

	@Override
	public Result executeAdapter(String[] args) {

		Result result = new OKResult(args[0]);

		try {
			SecurityGeneratorCreator sgc = null;
			switch (args[9]) {
			case "Disjunctive":
				sgc = new Creator4SG4FullDynamicLevels();
				break;
			case "HighLow":
				sgc = new Creator4SG4HighLow();
				break;
			default:
				sgc = null;
			}

			if (sgc == null) {
				throw new IllegalArgumentException("Casestudy type '" + args[9] + "' couldn't be found.");
			}

			AccessAnalysis2JOANAAlignment alignment = new AccessAnalysis2JOANAAlignment(args[2], args[3], args[4],
					args[5], args[6], args[7], args[8], args[9], sgc);
			alignment.performAlignment();
		} catch (Exception e) {
			result = new NotOKResult(args[1] + "\n" + e.getMessage());
		}

		return result;
	}
}