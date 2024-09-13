package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.OutputModels;
import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.utils.ConfigurationrepresentationUtil;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class AccessAnalysis2JOANAModelGenerator {
	private JavaRoot javaRoot;
	private JOANARoot joanaRoot;
	private SecurityGeneratorCreator securityGeneratorCreator;
	
	public AccessAnalysis2JOANAModelGenerator(SecurityGeneratorCreator securityGeneratorCreator) {
		this.securityGeneratorCreator = securityGeneratorCreator;
	}

	public OutputModels generateJOANAModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ProfileApplication repositoryProfileApplication, ConfidentialitySpecification spec, String basePackageName) {
		PCM2JavaStructuralGenerator structuralGenerator = new PCM2JavaStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel(basePackageName);
		
		AccessAnalysis2JOANASecurityGenerator securityGenerator = securityGeneratorCreator.createSecurityGenerator(correspondences, spec);
		
		Collection<EObject> accessAnalysisRoots = new HashSet<EObject>();
		
		accessAnalysisRoots.add(repo);
		accessAnalysisRoots.add(spec);
		
		Configurations accessAnalysisConfigurations = ConfigurationrepresentationUtil.generateConfigurations();
		FullyImplicitConfiguration accessAnalysisConfiguration = ConfigurationrepresentationUtil.generadeFullyImplicitConfiguration(accessAnalysisRoots);
		
		accessAnalysisConfigurations.getConfigurations().add(accessAnalysisConfiguration);
		
		javaRoot = structuralGenerator.getRoot();
		
		joanaRoot = securityGenerator.generateJOANASpecification(repositoryProfileApplication, javaRoot, accessAnalysisConfiguration);
		
	
		
		return new OutputModels(javaRoot, joanaRoot, correspondences, securityGenerator.getAccessAnalysisJOANACorrespondences(), securityGenerator.getJoana_Configurations(), accessAnalysisConfigurations);
		
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
