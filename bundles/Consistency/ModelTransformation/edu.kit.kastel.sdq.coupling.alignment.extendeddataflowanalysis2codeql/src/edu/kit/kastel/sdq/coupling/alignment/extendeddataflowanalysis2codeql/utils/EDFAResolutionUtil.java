package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.utils;

import java.util.Collection;
import java.util.HashSet;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class EDFAResolutionUtil {

	public static Collection<Literal> getLiteralsForBasicLevels(Collection<Literal> literals, Collection<SecurityLevel> basicLevels){
		
		Collection<Literal> fittingSets = new HashSet<Literal>();
		
		for(SecurityLevel level : basicLevels) {
			for(Literal dataSet : literals) {
				if(dataSet.getName().equals(level.getName())) {
					fittingSets.add(dataSet);
				}
			}
		}
		return fittingSets;
	}
	
}
