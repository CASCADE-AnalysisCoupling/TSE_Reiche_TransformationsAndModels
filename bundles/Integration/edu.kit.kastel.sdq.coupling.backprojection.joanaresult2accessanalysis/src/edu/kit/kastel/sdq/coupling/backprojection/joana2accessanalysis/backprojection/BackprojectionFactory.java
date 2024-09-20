package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.util.CorrespondencesResolver;

public class BackprojectionFactory {

	public BackprojectionFactory() {};
	
	public Backprojector create(String policyStyle, CorrespondencesResolver resolver, ProfileApplication profileApplication) {
		Backprojector backprojector;
		
		switch (policyStyle) {
		case "HighLow": {
			backprojector = new Backprojector4HighLow(profileApplication, resolver);
			break;
		} 
		case "Disjunctive": {
			backprojector = new Backprojector4AccessAnalysis(profileApplication, resolver);
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
