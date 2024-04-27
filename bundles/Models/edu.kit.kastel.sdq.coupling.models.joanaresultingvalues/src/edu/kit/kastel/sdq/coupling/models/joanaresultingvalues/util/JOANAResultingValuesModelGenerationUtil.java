package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesFactory;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue;

public class JOANAResultingValuesModelGenerationUtil {

	public static EntryPointIdentification_ResultingValues createEntryPoint(String tag) {
		EntryPointIdentification_ResultingValues entryPoint = JoanaresultingvaluesFactory.eINSTANCE.createEntryPointIdentification_ResultingValues();
		entryPoint.setTag(tag);
		return entryPoint;
	}
	
	public static Level_ResultingValues createSecurityLevel(String name) {
		Level_ResultingValues level = JoanaresultingvaluesFactory.eINSTANCE.createLevel_ResultingValues();
		level.setName(name);
		return level;
	}
	
	public static ParameterIdentification_JOANAResultingValues createParameterIdentification(int parameterIndex, String type, String methodName, String fullyQualifiedClassName) {
		ParameterIdentification_JOANAResultingValues ident = JoanaresultingvaluesFactory.eINSTANCE.createParameterIdentification_JOANAResultingValues();
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		ident.setMethodName(methodName);
		ident.setParameterIndex(parameterIndex);
		ident.setParameterType(type);
		return ident;
	}
		
	public static ResultingValue createResultingValue(ParameterIdentification_JOANAResultingValues systemElement, Level_ResultingValues securityLevel, EntryPointIdentification_ResultingValues config){
		ResultingValue resultingValue = JoanaresultingvaluesFactory.eINSTANCE.createResultingValue();
		resultingValue.setSystemElement(systemElement);
		resultingValue.setLevel(securityLevel);
		resultingValue.setConfiguration(config);
		return resultingValue;
	}

	
	public static JOANAResultingValues createResultingValues() {
		return JoanaresultingvaluesFactory.eINSTANCE.createJOANAResultingValues();
	}
	
	
}
