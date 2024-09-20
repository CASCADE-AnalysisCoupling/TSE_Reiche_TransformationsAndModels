package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.OutputModels;
import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.utils.ConfigurationrepresentationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;


public class AccessAnalysis2CodeQLModelsGenerator {

	protected JavaRoot javaRoot;
	protected TainttrackingRoot tainttrackingRoot;
	protected SecurityGeneratorCreator securityGeneratorCreator;
	
	public AccessAnalysis2CodeQLModelsGenerator(SecurityGeneratorCreator securityGeneratorCreator) {
		this.securityGeneratorCreator = securityGeneratorCreator;
	}

	
	public OutputModels generateCodeQLModels(Repository repo, ProfileApplication repositoryProfileApplication, ConfidentialitySpecification spec, String basePackageName) {
		
		PCMJavaCorrespondenceRoot pcmJava_Correspondences = PcmjavacorrespondenceFactory.eINSTANCE.createPCMJavaCorrespondenceRoot();
		
		PCM2JavaStructuralGenerator structuralGenerator = new PCM2JavaStructuralGenerator(pcmJava_Correspondences, repo);
		structuralGenerator.generateStructuralModel(basePackageName);
		

		AccessAnalysis2CodeQLSecurityGenerator securityGenerator = securityGeneratorCreator.createSecurityGenerator(pcmJava_Correspondences, spec);
		
		Collection<EObject> accessAnalysisRoots = new HashSet<EObject>();
		
		accessAnalysisRoots.add(repo);
		accessAnalysisRoots.add(spec);
		
		Configurations accessAnalysisConfigurations = ConfigurationrepresentationUtil.generateConfigurations();
		FullyImplicitConfiguration accessAnalysisConfiguration = ConfigurationrepresentationUtil.generadeFullyImplicitConfiguration(accessAnalysisRoots);
		
		accessAnalysisConfigurations.getConfigurations().add(accessAnalysisConfiguration);
		
		javaRoot = structuralGenerator.getRoot();
		
		securityGenerator.generateCodeQLConfiguration(repositoryProfileApplication.getStereotypeApplications(), javaRoot, accessAnalysisConfiguration);
		
		tainttrackingRoot = securityGenerator.getRoot(); 
		
		return new OutputModels(javaRoot, tainttrackingRoot , pcmJava_Correspondences, securityGenerator.getSecurityCorrespondences(),securityGenerator.getCodeQLConfigurations(), accessAnalysisConfigurations);
	}

	public JavaRoot getJavaRoot() {
		return javaRoot;
	}

	public TainttrackingRoot getTainttrackingRoot() {
		return tainttrackingRoot;
	}
}
