package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.AccessAnalysis2JOANASecurityGenerator;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.SecurityGeneratorCreator;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.partitioner.blackboard.PartitionerBlackboard;

public class Creator4IterativeSG implements SecurityGeneratorCreator {

	protected PartitionerBlackboard blackboard;
	
	public Creator4IterativeSG(PartitionerBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	@Override
	public AccessAnalysis2JOANASecurityGenerator createSecurityGenerator(PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification accessAnalysisSpec) {
		return new IterativeAccessAnalysis2JOANASecurityGenerator(correspondences, accessAnalysisSpec, this.blackboard);
	}

}
