package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

public class ResultingSpecificationResolutionFactory {

	public static ResultingSpecificationResolution generateResultingSpecificationResolution(String policyStyle) {
		
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
			resolution = new ResultingSpecificationResolution4ConjunctivePowerset();
			break;
		}
		default:
			throw new IllegalArgumentException("Extractor not implemented for policy style " + policyStyle);
		}
		
		return resolution;
	}
	
	
}
