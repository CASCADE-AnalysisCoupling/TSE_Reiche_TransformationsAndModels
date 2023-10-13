package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.elementidentifications.Correspondences;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeRoot;

public class AccessAnalysis2CodeQLModelsGenerator {

	
	
	public CodeQLRoot generateCodeQLModels(Correspondences correspondences, Repository repo, ProfileApplication repositoryProfileApplication, ConfidentialitySpecification spec) {
		
		PCM2CodeQLStructuralGenerator structuralGenerator = new PCM2CodeQLStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel();
		
		PCM2CodeQLSecurityGenerator securityGenerator = new PCM2CodeQLSecurityGenerator(spec, correspondences);	
		securityGenerator.generateCodeQLConfiguration(repositoryProfileApplication.getStereotypeApplications());
		
		CodeQLRoot root = CodeQLModelgenerationUtil.generateCodeQLRoot();
		root.setCodeRoot(structuralGenerator.getRoot());
		root.setDataFlowRoot(securityGenerator.getRoot());
		
		return root;
	}
}
