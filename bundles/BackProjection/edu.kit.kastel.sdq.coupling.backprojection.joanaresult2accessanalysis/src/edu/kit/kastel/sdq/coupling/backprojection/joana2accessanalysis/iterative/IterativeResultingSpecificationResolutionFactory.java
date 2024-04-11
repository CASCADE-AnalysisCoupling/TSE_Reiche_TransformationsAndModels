package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.iterative;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolutionFactory;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;

public class IterativeResultingSpecificationResolutionFactory extends ResultingSpecificationResolutionFactory {

public ResultingSpecificationResolution generateResultingSpecificationResolution(String policyStyle, EntryPoint config) {
		return new IterativeResultingSpecificationResolution4AccessAnalysis(config);
	}
	

	public ResultingSpecificationResolution generateResultingSpecificationResolution(String policyStyle) {
		return new IterativeResultingSpecificationResolution4AccessAnalysis();
	}
}
