package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.AccessAnalysis2CodeQL4TravelPlannerHandler;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.AccessAnalysis2CodeQLAlignment;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.OutputModels;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.testpaths.TravelPlannerPaths;
import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;


public class AccessAnalysis2CodeQLModelsGenerator {

	private JavaRoot javaRoot;
	private TainttrackingRoot tainttrackingRoot;

	
	public OutputModels generateCodeQLModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ProfileApplication repositoryProfileApplication, ConfidentialitySpecification spec, String basePackageName) {
		
		PCM2JavaStructuralGenerator structuralGenerator = new PCM2JavaStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel(basePackageName);
		

		AccessAnalysis2CodeQLSecurityGenerator securityGenerator = null;
		
		//TODO Should be handled by injection/dynamic binding, same as paths
		if(AccessAnalysis2CodeQLAlignment.caseStudy.equals(JPMailPaths.CASE_STUDY_NAME)) {
			securityGenerator = new AccessAnalysis2CodeQLSecurityGenerator4HighLow(spec, correspondences);	
		} else if(AccessAnalysis2CodeQLAlignment.caseStudy.equals(TravelPlannerPaths.CASE_STUDY_NAME)) {
			securityGenerator = new AccessAnalysis2CodeQLSecurityGenerator4FullDynamicLevels(spec, correspondences);	
		}
		
		securityGenerator.generateCodeQLConfiguration(repositoryProfileApplication.getStereotypeApplications());
		javaRoot = structuralGenerator.getRoot();
		tainttrackingRoot = securityGenerator.getRoot(); 
		
		return new OutputModels(javaRoot, tainttrackingRoot , correspondences);
	}

	public JavaRoot getJavaRoot() {
		return javaRoot;
	}

	public TainttrackingRoot getTainttrackingRoot() {
		return tainttrackingRoot;
	}
}
