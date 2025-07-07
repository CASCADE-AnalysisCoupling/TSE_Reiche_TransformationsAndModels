package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util;


import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesFactory;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues;


public class JOANAResultingValuesModelGenerationUtil {

	public static EntryPoint_ResolvedImplementationValues createEntryPoint(String tag) {
		EntryPoint_ResolvedImplementationValues entryPoint = JoanaresultingvaluesFactory.eINSTANCE.createEntryPoint_ResolvedImplementationValues();
		entryPoint.setTag(tag);
		return entryPoint;
	}
	
	public static Level_ResolvedImplementationValues createSecurityLevel(String name) {
		Level_ResolvedImplementationValues level = JoanaresultingvaluesFactory.eINSTANCE.createLevel_ResolvedImplementationValues();
		level.setName(name);
		return level;
	}
	
	public static Parameter_ResolvedImplementationValues createParameterIdentification(int parameterIndex, String type, String methodName, String fullyQualifiedClassName) {
		Parameter_ResolvedImplementationValues parameter = JoanaresultingvaluesFactory.eINSTANCE.createParameter_ResolvedImplementationValues();
		parameter.setFullyQualifiedClassName(fullyQualifiedClassName);
		parameter.setMethodName(methodName);
		parameter.setParameterIndex(parameterIndex);
		parameter.setParameterType(type);
		return parameter;
	}
		
	public static ResolvedImplementationValue createResultingValue(Parameter_ResolvedImplementationValues systemElement, Level_ResolvedImplementationValues securityLevel, EntryPoint_ResolvedImplementationValues config){
		ResolvedImplementationValue resolvedImplementationValue = JoanaresultingvaluesFactory.eINSTANCE.createResolvedImplementationValue();
		resolvedImplementationValue.setSystemElement(systemElement);
		resolvedImplementationValue.setLevel(securityLevel);
		resolvedImplementationValue.setConfiguration(config);
		return resolvedImplementationValue;
	}

	
	public static ResolvedImplementationValues createResultingValues() {
		return JoanaresultingvaluesFactory.eINSTANCE.createResolvedImplementationValues();
	}
	
	
}
