package edu.kit.kastel.sdq.coupling.models.joana.supporting.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class JOANANamingUtil {
	
	public static String combineLevelNames(Collection<Level> securityLevels, String sublevelDelimiter) {
		List<String> securityLevelNames = securityLevels.stream().map(Level::getName)
				.collect(Collectors.toList());

		return String.join(sublevelDelimiter, securityLevelNames);
	}
	
	public static List<Level> sortLevels(Collection<Level> levels) {
		return levels.stream().sorted(Comparator.comparing(Level::getName)).collect(Collectors.toList());
	}
}
