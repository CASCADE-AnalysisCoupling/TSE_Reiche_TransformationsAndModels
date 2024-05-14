package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.iterative;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection.BackprojectionFactory;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class IterativeBackprojectionFactory extends BackprojectionFactory {
	
	@Override
	public Backprojector create(String policyStyle, Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification confidentialitySpec, ProfileApplication profileApplication) {
		
		return new IterativeBackprojector4AccessAnalysis(repository, correspondences, confidentialitySpec, profileApplication);
	}
}
