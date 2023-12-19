package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.iterative;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.AccessAnalysis2CodeQLModelsGenerator;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.AccessAnalysis2CodeQLStructuralGenerator;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class IterativeAccessAnalysis2CodeQLModelsGenerator extends AccessAnalysis2CodeQLModelsGenerator {

	private JavaRoot javaRoot;
	private TainttrackingRoot tainttrackingRoot;
	
	@Override
	public void generateCodeQLModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ProfileApplication repositoryProfileApplication, ConfidentialitySpecification spec) {
		
		AccessAnalysis2CodeQLStructuralGenerator structuralGenerator = new AccessAnalysis2CodeQLStructuralGenerator(correspondences, repo, "GeneratedFromPCM");
		structuralGenerator.generateStructuralModel();
		
		IterativeAccessAnalysis2CodeQLSecurityGenerator securityGenerator = new IterativeAccessAnalysis2CodeQLSecurityGenerator(spec, correspondences);	
		securityGenerator.generateCodeQLConfiguration(repositoryProfileApplication.getStereotypeApplications());
		this.javaRoot = structuralGenerator.getRoot();
		this.tainttrackingRoot = securityGenerator.getRoot(); 

	}

	@Override
	public JavaRoot getJavaRoot() {
		return this.javaRoot;
	}

	@Override
	public TainttrackingRoot getTainttrackingRoot() {
		return this.tainttrackingRoot;
	}

}
