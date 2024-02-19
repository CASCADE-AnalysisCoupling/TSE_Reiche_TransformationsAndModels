package edu.kit.kastel.sdq.coupling.models.codeql.supporting.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class CodeQLResolutionUtil {
	public static SecurityLevel lookupLevel(String levelName, Configuration config) {
		return config.getAppliedSecurityLevel().stream().filter(secLevel -> secLevel.getName().equals(levelName))
				.findFirst().get();
	}
	
	public static Collection<SecurityLevel> resolveBasicLevels(SecurityLevel level, Configuration config, String delimiter) {
		Collection<SecurityLevel> basicSecurityLevels = new HashSet<SecurityLevel>();

		Collection<String> splitLevelBasicLevelNames = Arrays.asList(level.getName().split(delimiter));

		splitLevelBasicLevelNames.forEach(name -> {
			basicSecurityLevels.add(CodeQLResolutionUtil.lookupLevel(name, config));
		});

		return basicSecurityLevels;
	}
	
	public static SecurityLevel findLevelFromSetOfBasicLevels(Collection<SecurityLevel> levels, Configuration config) {
		
		String levelNameToSearch = levels.stream().sorted(Comparator.comparing(SecurityLevel::getName)).map(level -> level.getName()).collect(Collectors.joining(";"));
		Optional<SecurityLevel> calculatedLevel = config.getAppliedSecurityLevel().stream().filter(level -> level.getName().equals(levelNameToSearch)).findFirst();
		return calculatedLevel.get();
	}
	
	public static boolean containsSecurityLevelWithSubname(SecurityLevel level, Configuration config, String delimiter) {
		Collection<SecurityLevel> existingBasicLevels = CodeQLResolutionUtil.resolveBasicLevels(level, config, delimiter);

		for (SecurityLevel toCheck : existingBasicLevels) {
			for (SecurityLevel checkAgainst : existingBasicLevels) {
				if (toCheck.getName().equals(checkAgainst.getName())) {
					continue;
				} else if (toCheck.getName().contains(checkAgainst.getName())) {
					return true;
				}
			}
		}
		return false;
	}
}
