package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import org.kit.kastel.sdq.coupling.models.java.JavaRoot;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.elementidentifications.Correspondences;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.JavaModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;


public class AccessAnalysis2CodeQLModelsGenerator {

	private JavaRoot javaRoot;
	private TainttrackingRoot tainttrackingRoot;
	
	public void generateCodeQLModels(Correspondences correspondences, Repository repo, ProfileApplication repositoryProfileApplication, ConfidentialitySpecification spec) {
		
		PCM2CodeQLStructuralGenerator structuralGenerator = new PCM2CodeQLStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel("GeneratedFromPCM");
		
		PCM2CodeQLSecurityGenerator securityGenerator = new PCM2CodeQLSecurityGenerator(spec, correspondences);	
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
