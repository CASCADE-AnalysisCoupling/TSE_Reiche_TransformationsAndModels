package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

import java.util.Collection;
import java.util.HashSet;

import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.ExtendedDataFlowAnalysis2CodeQLAlignment;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.OutputModels;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.testpaths.TravelPlannerPaths;
import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.utils.ConfigurationrepresentationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;


public class ExtendedDataFlowAnalysis2CodeQLModelsGenerator {

	private JavaRoot javaRoot;
	private TainttrackingRoot tainttrackingRoot;
	private Correspondences_EDFACodeQL edfaCodeQLCorrespondences;
	
	public OutputModels generateCodeQLModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ParameterAnnotations extensionRoot, PCMDataDictionary dictionary, String basePackageName) {
		
		PCM2JavaStructuralGenerator structuralGenerator = new PCM2JavaStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel(basePackageName);
		
		ExtendedDataFlowAnalysis2CodeQLSecurityGenerator securityGenerator = null;
		
		if(ExtendedDataFlowAnalysis2CodeQLAlignment.policyStyle.equals("HighLow")) {
			securityGenerator = new ExtendedDataFlowAnalysis2CodeQLSecurityGenerator4HighLow(extensionRoot, correspondences, dictionary);	
		} else if(ExtendedDataFlowAnalysis2CodeQLAlignment.policyStyle.equals("Disjunctive")) {
			securityGenerator = new ExtendedDataFlowAnalysis2CodeQLSecurityGenerator4FullDynamicLevels(extensionRoot, correspondences, dictionary);	
		} else {
			throw new RuntimeException("Not Supported PolicyStyle %s".formatted("ExtendedDataFlowAnalysis2CodeQLAlignment.policyStyle"));
		}
		
		Collection<EObject> edfa_Roots = new HashSet<EObject>();
		
		edfa_Roots.add(repo);
		edfa_Roots.add(extensionRoot);
		edfa_Roots.add(dictionary);
		
		FullyImplicitConfiguration edfa_configuration = ConfigurationrepresentationUtil.generadeFullyImplicitConfiguration(edfa_Roots);
		Configurations edfa_configurations = ConfigurationrepresentationUtil.generateConfigurations();
		edfa_configurations.getConfigurations().add(edfa_configuration);
		
		javaRoot = structuralGenerator.getRoot();
		securityGenerator.generateCodeQLConfiguration(javaRoot, edfa_configuration);
	
		tainttrackingRoot = securityGenerator.getRoot(); 
		edfaCodeQLCorrespondences = securityGenerator.getEDFACodeQLCorrespondences();
		
		return new OutputModels(javaRoot, tainttrackingRoot, correspondences, edfaCodeQLCorrespondences, edfa_configurations, securityGenerator.getCodeQL_Configurations());
	}

	public JavaRoot getJavaRoot() {
		return javaRoot;
	}

	public TainttrackingRoot getTainttrackingRoot() {
		return tainttrackingRoot;
	}
	
	public Correspondences_EDFACodeQL getEDFACodeQLCorrespondences() {
		return edfaCodeQLCorrespondences;
	}
}
