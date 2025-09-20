package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.modelgenerators;

import java.util.Collection;
import java.util.HashSet;

import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.ExtendedDataFlowAnalysis2JOANAAlignment;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.OutputModels;
import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.utils.ConfigurationrepresentationUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class ExtendedDataFlowAnalysis2JOANAModelsGenerator {
	private JavaRoot javaRoot;
	private JOANARoot joanaRoot;
	private Correspondences_EDFAJOANA edfaJoanaCorrespondences;

	public OutputModels generateJOANAModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ParameterAnnotations extensionRoot, PCMDataDictionary dictionary, String basePackageName) {
		
		PCM2JavaStructuralGenerator structuralGenerator = new PCM2JavaStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel(basePackageName);
		
		
		ExtendedDataFlowAnalysis2JOANASecurityGenerator securityGenerator = null;
		//TODO Should be handled by injection/dynamic binding, same as paths
		if(ExtendedDataFlowAnalysis2JOANAAlignment.policyStyle.equals("HighLow")) {
			securityGenerator = new ExtendedDataFlowAnalysis2JOANASecurityGenerator4HighLow(extensionRoot, correspondences, dictionary);	
		} else if(ExtendedDataFlowAnalysis2JOANAAlignment.policyStyle.equals("Disjunctive")) {
			securityGenerator = new ExtendedDataFlowAnalysis2JOANASecurityGenerator4FullDynamicLevels(extensionRoot, correspondences, dictionary);	
		} else {
			throw new RuntimeException("Unsupported Policy Style: %s".formatted(ExtendedDataFlowAnalysis2JOANAAlignment.policyStyle));
		}
			
		Collection<EObject> edfa_Roots = new HashSet<EObject>();
		
		edfa_Roots.add(repo);
		edfa_Roots.add(extensionRoot);
		edfa_Roots.add(dictionary);
		
		FullyImplicitConfiguration edfa_configuration = ConfigurationrepresentationUtil.generadeFullyImplicitConfiguration(edfa_Roots);
		Configurations edfa_configurations = ConfigurationrepresentationUtil.generateConfigurations();
		edfa_configurations.getConfigurations().add(edfa_configuration);
		
		javaRoot = structuralGenerator.getRoot();
		
		joanaRoot = securityGenerator.generateJOANASpecification(javaRoot, edfa_configuration);
		
		edfaJoanaCorrespondences = securityGenerator.getEdfaJoanaCorrespondences();
		
		return new OutputModels(javaRoot, joanaRoot, correspondences, edfaJoanaCorrespondences, edfa_configurations, securityGenerator.getJoana_Configurations());
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

	public Correspondences_EDFAJOANA getEDFACodeQLCorrespondences() {
		return edfaJoanaCorrespondences;
	}
}
