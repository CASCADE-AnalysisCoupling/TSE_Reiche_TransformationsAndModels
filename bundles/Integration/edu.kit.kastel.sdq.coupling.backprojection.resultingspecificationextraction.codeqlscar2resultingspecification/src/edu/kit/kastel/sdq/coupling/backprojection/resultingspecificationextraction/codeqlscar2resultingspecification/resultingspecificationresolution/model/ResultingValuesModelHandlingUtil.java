package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.model;

import java.util.Arrays;
import java.util.Collection;


public class ResultingValuesModelHandlingUtil {

	public static Collection<String> splitLevelNameIntoBasicLevels(String securityLevelName, String delimiter) {
		
		Collection<String> splitLevelBasicLevelNames = Arrays.asList(securityLevelName.split(delimiter));

		
		
		return splitLevelBasicLevelNames;
	}
	
}
