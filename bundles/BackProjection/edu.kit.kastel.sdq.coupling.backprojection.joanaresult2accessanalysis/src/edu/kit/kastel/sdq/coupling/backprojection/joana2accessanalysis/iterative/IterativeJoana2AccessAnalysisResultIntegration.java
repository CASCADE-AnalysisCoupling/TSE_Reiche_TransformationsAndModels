package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.iterative;

import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.Joana2AccessAnalysisResultIntegration;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.models.Models;

public class IterativeJoana2AccessAnalysisResultIntegration extends Joana2AccessAnalysisResultIntegration {

	private String iterationDependentConfModelFileName;
	
	public IterativeJoana2AccessAnalysisResultIntegration(String javaModelLocation, String joanaModelLocation,
			String correspondenceModelLocation, String joanaResultLocation, String repositoryModelLocation,
			String confidentialitySpecificationLocation, String policyStyle, String originBackupLocation, String iterationDependentConfModelFileName) {
		super(javaModelLocation, joanaModelLocation, correspondenceModelLocation, joanaResultLocation, repositoryModelLocation,
				confidentialitySpecificationLocation, policyStyle, originBackupLocation);
		this.iterationDependentConfModelFileName = iterationDependentConfModelFileName;
	}
	
	@Override
	protected void updateConfidentialityModel(Models input) {
//		input.updateConfidentialityModel(confidentialitySpecificationLocation, confidentialitySpecificationLocation);
		input.updateConfidentialityModel(confidentialitySpecificationLocation, iterationDependentConfModelFileName);
	}

}
