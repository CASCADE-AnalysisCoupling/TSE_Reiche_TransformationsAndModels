package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.ExtendedDataFlowAnalysis2CodeQLAlignment;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.testpaths.TravelPlannerPaths;
import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;


public class ExtendedDataFlowAnalysis2CodeQLModelsGenerator {

	private JavaRoot javaRoot;
	private TainttrackingRoot tainttrackingRoot;
	private Correspondences_EDFACodeQL edfaCodeQLCorrespondences;
	
	public void generateCodeQLModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ParameterAnnotations extensionRoot, PCMDataDictionary dictionary, String basePackageName) {
		
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
			
		securityGenerator.generateCodeQLConfiguration();
		javaRoot = structuralGenerator.getRoot();
		tainttrackingRoot = securityGenerator.getRoot(); 
		edfaCodeQLCorrespondences = securityGenerator.getEDFACodeQLCorrespondences();
		
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
