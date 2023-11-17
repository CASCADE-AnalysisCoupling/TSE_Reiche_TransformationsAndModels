package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot;


public class ExtendedDataFlowAnalysis2CodeQLModelsGenerator {

	private JavaRoot javaRoot;
	private TainttrackingRoot tainttrackingRoot;
	private static final String BASE_PACKAGE_NAME = "travelplannerpcm";
	
	public void generateCodeQLModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ProfileApplication repositoryProfileApplication, ExtensionRoot extensionRoot) {
		
		ExtendedDataFlowAnalysis2CodeQLStructuralGenerator structuralGenerator = new ExtendedDataFlowAnalysis2CodeQLStructuralGenerator(correspondences, repo, BASE_PACKAGE_NAME);
		structuralGenerator.generateStructuralModel();
		
		ExtendedDataFlowAnalysis2CodeQLSecurityGenerator securityGenerator = new ExtendedDataFlowAnalysis2CodeQLSecurityGenerator(extensionRoot, correspondences);	
		securityGenerator.generateCodeQLConfiguration(repositoryProfileApplication.getStereotypeApplications());
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
