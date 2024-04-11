package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class BackprojectionFactory {

	public BackprojectionFactory() {};
	
	public Backprojector create(String policyStyle, Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification confidentialitySpec, ProfileApplication profileApplication) {
		Backprojector backprojector;
		
		switch (policyStyle) {
		case "HighLow": {
			backprojector = new Backprojector4HighLow(repository, correspondences, confidentialitySpec, profileApplication);
			break;
		} 
		case "Disjunctive": {
			backprojector = new Backprojector4AccessAnalysis(repository, correspondences, confidentialitySpec, profileApplication);
			break;
		} 
		case "Conjunctive": {
			throw new UnsupportedOperationException("Conjunctive Policy Style not yet supported");
		}
		default:
			throw new IllegalArgumentException("Extractor not implemented for policy style " + policyStyle);
		}
		
		return backprojector;
	}
	
	
}
