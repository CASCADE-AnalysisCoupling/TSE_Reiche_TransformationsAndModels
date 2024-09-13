package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils;


import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesFactory;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;


public class CodeQLResultingValuesModelGenerationUtil {

	public static RuleId_ResolvedImplementationValue createConfiguration(String id) {
		RuleId_ResolvedImplementationValue config = CodeqlresultingvaluesFactory.eINSTANCE.createRuleId_ResolvedImplementationValue();
		config.setId(id);
		return config;
	}
	
	public static SecurityLevel_ResolvedImplementationValues createSecurityLevel(String name) {
		SecurityLevel_ResolvedImplementationValues level = CodeqlresultingvaluesFactory.eINSTANCE.createSecurityLevel_ResolvedImplementationValues();
		level.setName(name);
		return level;
	}
	
	public static Parameter_ResolvedImplementationValues createParameter(String parameterName, String type, String methodName, String fullyQualifiedClassName) {
		Parameter_ResolvedImplementationValues ident = CodeqlresultingvaluesFactory.eINSTANCE.createParameter_ResolvedImplementationValues();
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		ident.setMethodName(methodName);
		ident.setParameterName(parameterName);
		ident.setParameterType(type);
		return ident;
	}
		
	public static ResolvedImplementationValue createResultingValue(Parameter_ResolvedImplementationValues systemElement, SecurityLevel_ResolvedImplementationValues securityLevel, RuleId_ResolvedImplementationValue config){
		ResolvedImplementationValue resultingValue = CodeqlresultingvaluesFactory.eINSTANCE.createResolvedImplementationValue();
		resultingValue.setParameter(systemElement);
		resultingValue.setResultingSecurityLevel(securityLevel);
		resultingValue.setRuleId(config);
		return resultingValue;
	}

	
	public static ResolvedImplementationValues createResultingValues() {
		return CodeqlresultingvaluesFactory.eINSTANCE.createResolvedImplementationValues();
	}
	
	
	
	
}
