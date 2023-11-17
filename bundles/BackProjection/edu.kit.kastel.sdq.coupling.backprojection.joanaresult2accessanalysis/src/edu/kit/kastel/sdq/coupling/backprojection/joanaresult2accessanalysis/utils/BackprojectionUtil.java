package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class BackprojectionUtil {
	public static Collection<Level> splitLevelIntoBasicLevels(Level level, EntryPoint entryPoint) {
		Collection<Level> basicLevels = new HashSet<Level>();

		Collection<String> splitLevelBasicLevelNames = Arrays.asList(level.getName().split(";"));

		splitLevelBasicLevelNames.forEach(name -> {
			basicLevels.add(lookupLevel(name, entryPoint));
		});

		return basicLevels;
	}

	public static Level lookupLevel(String levelName, EntryPoint entryPoint) {
		return entryPoint.getLevel().stream().filter(secLevel -> secLevel.getName().equals(levelName))
				.findFirst().get();
	}
}
