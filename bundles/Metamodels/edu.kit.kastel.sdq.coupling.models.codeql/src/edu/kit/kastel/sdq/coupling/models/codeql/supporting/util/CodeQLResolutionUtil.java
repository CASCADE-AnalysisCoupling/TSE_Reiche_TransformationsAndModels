package edu.kit.kastel.sdq.coupling.models.codeql.supporting.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

public class CodeQLResolutionUtil {
	public static SecurityLevel lookupLevel(String levelName, Query config) {
		return config.getAppliedSecurityLevel().stream().filter(secLevel -> secLevel.getName().equals(levelName))
				.findFirst().orElseThrow(() -> new RuntimeException(String.format("Level %s not in Query %s", levelName, config.getId())));
	}
	
	public static Collection<SecurityLevel> resolveBasicLevels(SecurityLevel level, Query config, String delimiter) {
		Collection<SecurityLevel> basicSecurityLevels = new HashSet<SecurityLevel>();

		Collection<String> splitLevelBasicLevelNames = Arrays.asList(level.getName().split(delimiter));

		splitLevelBasicLevelNames.forEach(name -> {
			basicSecurityLevels.add(CodeQLResolutionUtil.lookupLevel(name, config));
		});

		return basicSecurityLevels;
	}
	
	public static SecurityLevel findLevelFromSetOfBasicLevels(Collection<SecurityLevel> levels, Query config) {
		
		String levelNameToSearch = levels.stream().sorted(Comparator.comparing(SecurityLevel::getName)).map(level -> level.getName()).collect(Collectors.joining(";"));
		Optional<SecurityLevel> calculatedLevel = config.getAppliedSecurityLevel().stream().filter(level -> level.getName().equals(levelNameToSearch)).findFirst();
		return calculatedLevel.orElseThrow(() -> new RuntimeException(String.format("Level %s not in Query %s", levelNameToSearch, config.getId())));
	}
	
	public static boolean containsSecurityLevelWithSubname(SecurityLevel level, Query config, String delimiter) {
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

	public static Collection<Parameter> getAnnotatedParameters(TainttrackingRoot codeqlRoot) {
		Set<Parameter> annotatedParameters = new HashSet<Parameter>();
		
		for(Query config : codeqlRoot.getQueries()) {
			
			Collection<Parameter> annotatedParametersInConfig = config.getSecurityLevelAnnotations().stream().filter(ParameterAnnotation.class::isInstance).map(annot -> ((ParameterAnnotation)annot).getParameter()).collect(Collectors.toSet());
			
			annotatedParameters.addAll(annotatedParametersInConfig);
		}
		
		return annotatedParameters;
	}
}
