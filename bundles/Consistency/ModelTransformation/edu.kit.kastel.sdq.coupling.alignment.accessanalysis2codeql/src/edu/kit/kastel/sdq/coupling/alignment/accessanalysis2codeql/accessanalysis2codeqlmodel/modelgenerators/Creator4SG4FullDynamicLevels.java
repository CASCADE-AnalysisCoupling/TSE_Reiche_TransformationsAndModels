package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class Creator4SG4FullDynamicLevels implements SecurityGeneratorCreator {

	@Override
	public AccessAnalysis2CodeQLSecurityGenerator createSecurityGenerator(PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification accessAnalysisSpec) {
		return new AccessAnalysis2CodeQLSecurityGenerator4FullDynamicLevels(accessAnalysisSpec, correspondences);
	}

}
