package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions;

public class AllowedConditionsProviderFactory {

	public static AllowedConditionsProvider create(String policyStyle) {
		
		switch (policyStyle) {
		case "HighLow": {
			return new HighLowAttackerConditionProvider();
		}
		case "Disjunctive" : {
			return new DisjunctiveAllowedConditionsProvider();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + policyStyle);
		}
		
	}
	
	public enum POLICY {
		HIGHLOW("HighLow"),
		DISJUNCTIVE("Disjunctive");
		
		public final String label;
		
		private POLICY(String label) {
			this.label = label;
		}
	}
	
}
