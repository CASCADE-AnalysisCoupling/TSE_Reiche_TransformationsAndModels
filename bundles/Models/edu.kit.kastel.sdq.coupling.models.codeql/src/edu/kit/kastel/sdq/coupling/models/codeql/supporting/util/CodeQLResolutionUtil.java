package edu.kit.kastel.sdq.coupling.models.codeql.supporting.util;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class CodeQLResolutionUtil {
	public static SecurityLevel lookupLevel(String levelName, Configuration config) {
		return config.getAppliedSecurityLevel().stream().filter(secLevel -> secLevel.getName().equals(levelName))
				.findFirst().get();
	}
}
