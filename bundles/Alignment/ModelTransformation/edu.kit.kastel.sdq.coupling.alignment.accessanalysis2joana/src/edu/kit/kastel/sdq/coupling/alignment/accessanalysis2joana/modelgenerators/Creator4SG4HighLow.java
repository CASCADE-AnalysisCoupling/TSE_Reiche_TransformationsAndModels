package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class Creator4SG4HighLow implements SecurityGeneratorCreator {

	@Override
	public AccessAnalysis2JOANASecurityGenerator createSecurityGenerator(PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification accessAnalysisSpec) {
		return new AccessAnalysis2JOANASecurityGenerator4HighLow(correspondences, accessAnalysisSpec);
	}

}
