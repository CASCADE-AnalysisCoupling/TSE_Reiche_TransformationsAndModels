package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.iterative;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.AccessAnalysis2CodeQLSecurityGenerator;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class IterativeAccessAnalysis2CodeQLSecurityGenerator extends AccessAnalysis2CodeQLSecurityGenerator {

	public IterativeAccessAnalysis2CodeQLSecurityGenerator(ConfidentialitySpecification accessAnalysisSpec,
			PCMJavaCorrespondenceRoot correspondences) {
		super(accessAnalysisSpec, correspondences);
	}

}
