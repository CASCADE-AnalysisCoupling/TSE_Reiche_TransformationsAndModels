package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions;

public class AllowedConditionsProviderFactory {

	public AllowedConditionsProvider create(String policyStyle) {
		
		switch (policyStyle) {
		case "HighLow": {
			return new HighLowConditionProviderJPMail();
		}
		case "Disjunctive" : {
			return new DisjunctiveAllowedConditionsProvider();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + policyStyle);
		}
		
	}
	
}
