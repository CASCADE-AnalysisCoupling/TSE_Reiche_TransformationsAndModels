package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection;


import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.utils.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;

public class BackprojectionFactory {

	private BackprojectionFactory() {};
	
	public static Backprojector create(String policyStyle, ParameterAnnotations parameterAnnotations, CorrespondencesResolver resolver) {
		Backprojector backprojector;
		
		switch (policyStyle) {
		case "HighLow": {
			backprojector = new Backprojector4HighLow(parameterAnnotations, resolver);
			break;
		} 
		case "Disjunctive": {
			backprojector = new Backprojector4AccessAnalysis(parameterAnnotations, resolver);
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
