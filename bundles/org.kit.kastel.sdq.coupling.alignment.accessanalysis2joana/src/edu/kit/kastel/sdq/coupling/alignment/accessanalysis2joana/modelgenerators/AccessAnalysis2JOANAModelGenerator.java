package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.elementidentifications.Correspondences;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;

public class AccessAnalysis2JOANAModelGenerator {
	private JavaRoot javaRoot;
	private JOANARoot joanaRoot;
	//TODO: This should be configuratble
	private final String BASE_PACKAGE_NAME = "generatedfrompcm";
	
	public void generateJOANAModels(Correspondences correspondences, Repository repo, ProfileApplication repositoryProfileApplication, ConfidentialitySpecification spec) {
		AccessAnalysis2JOANAStructuralGenerator structuralGenerator = new AccessAnalysis2JOANAStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel(BASE_PACKAGE_NAME);
		
		AccessAnalysis2JOANASecurityGenerator securityGenerator = new AccessAnalysis2JOANASecurityGenerator(correspondences, spec);
		joanaRoot = securityGenerator.generateJOANASpecification(repositoryProfileApplication);
		
		javaRoot = structuralGenerator.getRoot();
		
	}
	
	public JavaRoot getJavaRoot() {
		return javaRoot;
	}
	
	public JOANARoot getJoanaRoot() {
		return joanaRoot;
	}
}
