package edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.labeledtaintflow;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class CodeQLLabeledTaintFlowUtil {

	public static boolean allowedFlowConditionConjunctive(boolean highConjunctive, Collection<SecurityLevel> potentiallyFrom, Collection<SecurityLevel> potentiallyTo) {
		if(highConjunctive) {
			return allowedFlowWhenHighConjuntive(potentiallyFrom, potentiallyTo);
		} else {
			return allowedFlowWhenHighDisjunctive(potentiallyFrom, potentiallyTo); 
		}
	}
	
	//Allowed Flow Condition when "AB" requires rights for "A" and "B" 
		private static boolean allowedFlowWhenHighConjuntive(Collection<SecurityLevel> potentiallyFrom, Collection<SecurityLevel> potentiallyTo) {
			return potentiallyFrom.size() +1 == potentiallyTo.size() && potentiallyTo.containsAll(potentiallyFrom);
		}
		
		//Allowed Flow Condition when "AB" requires rights for "A" or "B" (approach of Häring)
		private static boolean allowedFlowWhenHighDisjunctive(Collection<SecurityLevel> potentiallyFrom, Collection<SecurityLevel> potentiallyTo) {
			return potentiallyFrom.size() -1 == potentiallyTo.size() && potentiallyFrom.containsAll(potentiallyTo);	
		}
		
		public static String combineSecurityLevelNames(String sublevelDelimiter, Collection<SecurityLevel> securityLevels) {
			List<String> securityLevelNames = securityLevels.stream().map(securityLevel -> securityLevel.getName()).collect(Collectors.toList());
			
			return String.join(sublevelDelimiter, securityLevelNames);
		}
		
		public static SecurityLevel findCombinedLevelForSeperateLevels(String sublevelDelimiter, Collection<SecurityLevel> seperateLevels, Collection<SecurityLevel> combinedLevels) {
			for(SecurityLevel combined : combinedLevels) {
				String combinedNameOfSeparateLevels = CodeQLLabeledTaintFlowUtil.combineSecurityLevelNames(sublevelDelimiter, seperateLevels);
				
				if(combined.getName().equals(combinedNameOfSeparateLevels)) {
					return combined;
				}
			}
			
			return null;
		}
	
		
		public static List<SecurityLevel> sortSecurityLevels(Collection<SecurityLevel> levels){
			return levels.stream().sorted(Comparator.comparing(SecurityLevel::getName)).collect(Collectors.toList());
		}
		
}
