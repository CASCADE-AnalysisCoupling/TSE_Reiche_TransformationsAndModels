package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators;

import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.AccessAnalysis2JOANAAlignment;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.AccessAnalysis2JOANA4TravelPlannerHandler;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.OutputModels;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.testpaths.TravelPlannerPaths;
import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class AccessAnalysis2JOANAModelGenerator {
	private JavaRoot javaRoot;
	private JOANARoot joanaRoot;

	public OutputModels generateJOANAModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ProfileApplication repositoryProfileApplication, ConfidentialitySpecification spec, String basePackageName) {
		PCM2JavaStructuralGenerator structuralGenerator = new PCM2JavaStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel(basePackageName);
		
		AccessAnalysis2JOANASecurityGenerator securityGenerator = null;
		
		//TODO Should be handled by injection/dynamic binding, same as paths
		if(AccessAnalysis2JOANAAlignment.caseStudy.equals(JPMailPaths.CASE_STUDY_NAME)) {
			securityGenerator = new AccessAnalysis2JOANASecurityGenerator4HighLow(correspondences, spec);	
		} else if(AccessAnalysis2JOANAAlignment.caseStudy.equals(TravelPlannerPaths.CASE_STUDY_NAME)) {
			securityGenerator = new AccessAnalysis2JOANASecurityGenerator4FullDynamicLevels(correspondences, spec);	
		}
		
	
		joanaRoot = securityGenerator.generateJOANASpecification(repositoryProfileApplication);
		
		javaRoot = structuralGenerator.getRoot();
		
		return new OutputModels(javaRoot, joanaRoot, correspondences);
		
	}
	
	public JavaRoot getJavaRoot() {
		return javaRoot;
	}
	
	public JOANARoot getJoanaRoot() {
		return joanaRoot;
	}
	
	public String generateEntryPointIDsAsString(JOANARoot targetRoot) {
		
		StringBuilder builder = new StringBuilder();
		
		for(EntryPoint entryPoint : targetRoot.getEntrypoint()) {
			builder.append(String.format("%s %s", entryPoint.getId(), System.lineSeparator()));
		}
		
		return builder.toString();
	}
	
	public String generateEntryPointIDsAsString() {
		return generateEntryPointIDsAsString(joanaRoot);
	}
}
