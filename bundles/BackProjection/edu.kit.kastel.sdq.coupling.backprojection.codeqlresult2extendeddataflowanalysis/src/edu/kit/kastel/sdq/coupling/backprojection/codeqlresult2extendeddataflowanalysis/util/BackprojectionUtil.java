package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class BackprojectionUtil {
	public static Collection<SecurityLevel> splitLevelIntoBasicLevels(SecurityLevel level, Configuration config) {
		Collection<SecurityLevel> basicSecurityLevels = new HashSet<SecurityLevel>();

		Collection<String> splitLevelBasicLevelNames = Arrays.asList(level.getName().split(";"));

		splitLevelBasicLevelNames.forEach(name -> {
			basicSecurityLevels.add(CodeQLResolutionUtil.lookupLevel(name, config));
		});

		return basicSecurityLevels;
	}

	
}
