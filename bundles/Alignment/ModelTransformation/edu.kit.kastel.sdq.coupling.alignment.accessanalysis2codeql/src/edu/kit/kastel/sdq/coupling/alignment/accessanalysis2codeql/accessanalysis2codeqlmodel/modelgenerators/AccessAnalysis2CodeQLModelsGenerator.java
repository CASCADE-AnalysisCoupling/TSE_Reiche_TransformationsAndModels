package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.OutputModels;
import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;


public class AccessAnalysis2CodeQLModelsGenerator {

	protected JavaRoot javaRoot;
	protected TainttrackingRoot tainttrackingRoot;
	protected SecurityGeneratorCreator securityGeneratorCreator;
	
	public AccessAnalysis2CodeQLModelsGenerator(SecurityGeneratorCreator securityGeneratorCreator) {
		this.securityGeneratorCreator = securityGeneratorCreator;
	}

	
	public OutputModels generateCodeQLModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ProfileApplication repositoryProfileApplication, ConfidentialitySpecification spec, String basePackageName) {
		
		PCM2JavaStructuralGenerator structuralGenerator = new PCM2JavaStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel(basePackageName);
		

		AccessAnalysis2CodeQLSecurityGenerator securityGenerator = securityGeneratorCreator.createSecurityGenerator(correspondences, spec);
		
		securityGenerator.generateCodeQLConfiguration(repositoryProfileApplication.getStereotypeApplications());
		javaRoot = structuralGenerator.getRoot();
		tainttrackingRoot = securityGenerator.getRoot(); 
		
		return new OutputModels(javaRoot, tainttrackingRoot , correspondences, securityGenerator.getSecurityCorrespondences());
	}

	public JavaRoot getJavaRoot() {
		return javaRoot;
	}

	public TainttrackingRoot getTainttrackingRoot() {
		return tainttrackingRoot;
	}
}
