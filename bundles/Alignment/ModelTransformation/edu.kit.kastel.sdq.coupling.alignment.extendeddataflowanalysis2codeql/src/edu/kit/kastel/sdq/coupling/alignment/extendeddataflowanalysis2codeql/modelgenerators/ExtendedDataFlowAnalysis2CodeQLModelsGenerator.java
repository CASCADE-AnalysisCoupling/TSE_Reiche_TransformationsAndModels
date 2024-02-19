package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;


public class ExtendedDataFlowAnalysis2CodeQLModelsGenerator {

	private JavaRoot javaRoot;
	private TainttrackingRoot tainttrackingRoot;
	private static final String BASE_PACKAGE_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner";
	
	public void generateCodeQLModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ParameterAnnotations extensionRoot, PCMDataDictionary dictionary) {
		
		PCM2JavaStructuralGenerator structuralGenerator = new PCM2JavaStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel(BASE_PACKAGE_NAME);
		
		ExtendedDataFlowAnalysis2CodeQLSecurityGenerator securityGenerator = new ExtendedDataFlowAnalysis2CodeQLSecurityGenerator(extensionRoot, correspondences, dictionary);	
		securityGenerator.generateCodeQLConfiguration();
		javaRoot = structuralGenerator.getRoot();
		tainttrackingRoot = securityGenerator.getRoot(); 

	}

	public JavaRoot getJavaRoot() {
		return javaRoot;
	}

	public TainttrackingRoot getTainttrackingRoot() {
		return tainttrackingRoot;
	}
}
