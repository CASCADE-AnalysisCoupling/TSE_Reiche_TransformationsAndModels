package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative;

import edu.kit.kastel.sdq.analysiscouplingframework.iterative.IterativeExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.AccessAnalysis2JOANAAlignment;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.SecurityGeneratorCreator;
import edu.kit.kastel.sdq.partitioner.blackboard.PartitionerBlackboard;

public class IterativeAccessAnalysis2JoanaAdapter extends IterativeExecutableProcessingStepAdapter{
	
	public IterativeAccessAnalysis2JoanaAdapter(PartitionerBlackboard blackboard) {
		super(blackboard);
	}
	
	/**
	 * args[0]: OK message, <br>
	 * args[1]: NotOK message, <br>
	 * args[2]: repositoryPath<br>
	 * args[3]: confidentialityModelPath<br>
	 * args[4]: javaCodeBasePath<br>
	 * args[5]: codeBasePackageName<br>
	 * args[6]: javaModelPath<br>
	 * args[7]: joanaModelPath
	 * args[8]: correspondenceModelPath
	 * args[9]: caseStudyName
	 */
	
	@Override
	public Result executeAdapter(String[] args) {

		Result result = new OKResult(args[0]);
		
//		try {
//			SecurityGeneratorCreator sgc = new Creator4IterativeSG(super.blackboard);
//			
//			AccessAnalysis2JOANAAlignment alignment = new AccessAnalysis2JOANAAlignment(args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], sgc);
//			alignment.performAlignment();
//		} catch (Exception e) {
//			result = new NotOKResult(args[1] + "\n" + e.getMessage());
//		}
		
		return result;
	}
}