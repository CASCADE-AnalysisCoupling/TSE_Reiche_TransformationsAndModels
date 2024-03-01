package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

public class ResultingSpecificationResolutionFactory {

	public static ResultingSpecificationResolution generateResultingSpecificationResolution(String policyStyle, Configuration config) {
		
		ResultingSpecificationResolution resolution;
		
		switch (policyStyle) {
		case "HighLow": {
			resolution = new ResultingSpecificationResolution4HighLow(config);
			break;
		} 
		case "Disjunctive": {
			resolution = new ResultingSpecificationResolution4AccessAnalysis(config);
			break;
		} 
		case "Conjunctive": {
			resolution = new ResultingSpecificationResolution4ConjunctivePowerset(config);
			break;
		}
		default:
			throw new IllegalArgumentException("Extractor not implemented for policy style " + policyStyle);
		}
		
		return resolution;
	}
	
	
}
