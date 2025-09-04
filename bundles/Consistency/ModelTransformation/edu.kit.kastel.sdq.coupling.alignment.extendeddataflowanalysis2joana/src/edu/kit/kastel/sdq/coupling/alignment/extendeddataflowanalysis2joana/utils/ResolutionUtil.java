package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.utils;

import java.util.Collection;
import java.util.HashSet;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import edu.kit.kastel.sdq.coupling.models.joana.Level;


public class ResolutionUtil {
public static Collection<Literal> getLiteralsForBasicLevels(Collection<Literal> literals, Collection<Level> basicLevels){
		
		Collection<Literal> fittingSets = new HashSet<Literal>();
		
		for(Level level : basicLevels) {
			for(Literal dataSet : literals) {
				if(dataSet.getName().equals(level.getName())) {
					fittingSets.add(dataSet);
				}
			}
		}
		return fittingSets;
	}
}
