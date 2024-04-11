package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution;

import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;

public class ResultingSpecificationResolutionFactory {

	public ResultingSpecificationResolution generateResultingSpecificationResolution(String policyStyle, EntryPoint config) {
		
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
			throw new UnsupportedOperationException("Conjunctive Policy Style not yet supported");
		}
		default:
			throw new IllegalArgumentException("Extractor not implemented for policy style " + policyStyle);
		}
		
		return resolution;
	}
	

	public ResultingSpecificationResolution generateResultingSpecificationResolution(String policyStyle) {
		
		ResultingSpecificationResolution resolution;
		
		switch (policyStyle) {
		case "HighLow": {
			resolution = new ResultingSpecificationResolution4HighLow();
			break;
		} 
		case "Disjunctive": {
			resolution = new ResultingSpecificationResolution4AccessAnalysis();
			break;
		} 
		case "Conjunctive": {
			throw new UnsupportedOperationException("Conjunctive Policy Style not yet supported");
		}
		default:
			throw new IllegalArgumentException("Extractor not implemented for policy style " + policyStyle);
		}
		
		return resolution;
	}
	
}
