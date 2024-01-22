package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative.modelgenerators;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.OutputModels;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.AccessAnalysis2JOANAModelGenerator;
import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.partitioner.blackboard.PartitionerBlackboard;

public class IterativeAccessAnalysis2JOANAModelGenerator extends AccessAnalysis2JOANAModelGenerator {

	PartitionerBlackboard blackboard;
	
	public IterativeAccessAnalysis2JOANAModelGenerator(PartitionerBlackboard blackboard) {
		this.blackboard = blackboard;
	}
	
	@Override
	public OutputModels generateJOANAModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ProfileApplication repositoryProfileApplication, ConfidentialitySpecification spec, String basePackageName) {
		PCM2JavaStructuralGenerator structuralGenerator = new PCM2JavaStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel(basePackageName);
		
		IterativeAccessAnalysis2JOANASecurityGenerator securityGenerator = new IterativeAccessAnalysis2JOANASecurityGenerator(correspondences, spec, blackboard);
		joanaRoot = securityGenerator.generateJOANASpecification(repositoryProfileApplication);
		
		javaRoot = structuralGenerator.getRoot();
		
		return new OutputModels(javaRoot, joanaRoot, correspondences);
		
	}

}
