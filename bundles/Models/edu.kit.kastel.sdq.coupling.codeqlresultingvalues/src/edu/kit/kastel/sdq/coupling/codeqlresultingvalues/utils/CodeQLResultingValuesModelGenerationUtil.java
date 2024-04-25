package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesFactory;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;

public class CodeQLResultingValuesModelGenerationUtil {

	public static ConfigurationID_ResultingValues createConfiguration(String id) {
		ConfigurationID_ResultingValues config = CodeqlresultingvaluesFactory.eINSTANCE.createConfigurationID_ResultingValues();
		config.setId(id);
		return config;
	}
	
	public static SecurityLevel_ResultingValues createSecurityLevel(String name) {
		SecurityLevel_ResultingValues level = CodeqlresultingvaluesFactory.eINSTANCE.createSecurityLevel_ResultingValues();
		level.setName(name);
		return level;
	}
	
	public static ParameterIdentificiation_CodeQLResultingValues createParameterIdentification(String parameterName, String type, String methodName, String fullyQualifiedClassName) {
		ParameterIdentificiation_CodeQLResultingValues ident = CodeqlresultingvaluesFactory.eINSTANCE.createParameterIdentificiation_CodeQLResultingValues();
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		ident.setMethodName(methodName);
		ident.setParameterName(parameterName);
		ident.setParameterType(type);
		return ident;
	}
		
	public static ResultingValue createResultingValue(ParameterIdentificiation_CodeQLResultingValues systemElement, SecurityLevel_ResultingValues securityLevel, ConfigurationID_ResultingValues config){
		ResultingValue resultingValue = CodeqlresultingvaluesFactory.eINSTANCE.createResultingValue();
		resultingValue.setParameter(systemElement);
		resultingValue.setResultingSecurityLevel(securityLevel);
		resultingValue.setConfiguration(config);
		return resultingValue;
	}

	
	public static CodeQLResultingValues createResultingValues() {
		return CodeqlresultingvaluesFactory.eINSTANCE.createCodeQLResultingValues();
	}
	
	
	
	
}
