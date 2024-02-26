package edu.kit.kastel.sdq.coupling.models.joana.supporting.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.Sets;

import edu.kit.kastel.sdq.coupling.models.joana.Level;


public class JOANAFlowUtil {
	public static boolean allowedFlowConditionConjunctive(boolean highConjunctive, Collection<Level> potentiallyFrom, Collection<Level> potentiallyTo) {
		if(highConjunctive) {
			return allowedFlowWhenHighConjuntive(potentiallyFrom, potentiallyTo);
		} else {
			return allowedFlowWhenHighDisjunctive(potentiallyFrom, potentiallyTo); 
		}
	}
	
		//Allowed Flow Condition when "AB" requires rights for "A" and "B" 
		private static boolean allowedFlowWhenHighConjuntive(Collection<Level> potentiallyFrom, Collection<Level> potentiallyTo) {
			return potentiallyFrom.size() +1 == potentiallyTo.size() && potentiallyTo.containsAll(potentiallyFrom);
		}
		
		//Allowed Flow Condition when "AB" requires rights for "A" or "B" (approach of Häring)
		private static boolean allowedFlowWhenHighDisjunctive(Collection<Level> potentiallyFrom, Collection<Level> potentiallyTo) {
			return potentiallyFrom.size() -1 == potentiallyTo.size() && potentiallyFrom.containsAll(potentiallyTo);	
		}
		
		public static String combineLevelNames(String sublevelDelimiter, Collection<Level> Levels) {
			List<String> LevelNames = Levels.stream().map(Level -> Level.getName()).collect(Collectors.toList());
			
			return String.join(sublevelDelimiter, LevelNames);
		}
		
		public static Level findCombinedLevelForSeperateLevels(String sublevelDelimiter, Collection<Level> seperateLevels, Collection<Level> combinedLevels) {
			for(Level combined : combinedLevels) {
				String combinedNameOfSeparateLevels = JOANANamingUtil.combineLevelNames(seperateLevels, sublevelDelimiter);
				
				if(combined.getName().equals(combinedNameOfSeparateLevels)) {
					return combined;
				}
			}
			
			return null;
		}
	
		
		public static List<Level> sortLevels(Collection<Level> levels){
			return levels.stream().sorted(Comparator.comparing(Level::getName)).collect(Collectors.toList());
		}
		
		private Set<List<Level>> generatePowerSetWithSortedLevelsFromBasicLevels(Set<Level> basicLevels) {
			Set<Set<Level>> powerSetLevels = Sets.powerSet(basicLevels);
			Set<List<Level>> powerSetWithSortedLevels = new HashSet<List<Level>>();

			for (Set<Level> set : powerSetLevels) {
				if (!set.isEmpty()) {
					powerSetWithSortedLevels.add(JOANANamingUtil.sortLevels(set));
				}
			}

			return powerSetWithSortedLevels;
		}
}
