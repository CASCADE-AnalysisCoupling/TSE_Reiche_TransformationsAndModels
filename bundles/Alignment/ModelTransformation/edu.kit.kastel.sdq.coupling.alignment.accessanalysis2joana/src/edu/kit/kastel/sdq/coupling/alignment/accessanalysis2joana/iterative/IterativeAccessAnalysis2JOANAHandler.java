package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative;

import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.AccessAnalysis2JOANAHandler;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative.modelgenerators.IterativeAccessAnalysis2JOANAModelGenerator;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.AccessAnalysis2JOANAModelGenerator;
import edu.kit.kastel.sdq.partitioner.blackboard.PartitionerBlackboard;

public class IterativeAccessAnalysis2JOANAHandler extends AccessAnalysis2JOANAHandler {

	protected PartitionerBlackboard blackboard;
	
	public IterativeAccessAnalysis2JOANAHandler(PartitionerBlackboard blackboard) {
		this.blackboard = blackboard;
	}
	
	@Override
	protected AccessAnalysis2JOANAModelGenerator createAccessAnalysis2JOANAModelGenerator() {
		return new IterativeAccessAnalysis2JOANAModelGenerator(blackboard);
	}

}
