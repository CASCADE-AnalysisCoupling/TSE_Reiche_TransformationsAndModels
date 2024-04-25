package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils;

import java.util.Optional;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;


public class CodeQLResultingValuesElementHandlingUtils {
	
	public static SecurityLevel_ResultingValues getOrCreateAndAddSecurityLevelByName(String securityLevelName, CodeQLResultingValues resultingValues) {

		Optional<SecurityLevel_ResultingValues> potentialSecurityLevel =  getPotentialSecurityLevelByName(securityLevelName, resultingValues);
		
		if(potentialSecurityLevel.isPresent()) {
			return potentialSecurityLevel.get();
		}
		
		SecurityLevel_ResultingValues securityLevel = CodeQLResultingValuesModelGenerationUtil.createSecurityLevel(securityLevelName);
	
		addSecurityLevelToResultingvaluesByName(securityLevel, resultingValues);
		
		
		return securityLevel;
	}
	
	public static Optional<SecurityLevel_ResultingValues> getPotentialSecurityLevelByName(String securityLevelName, CodeQLResultingValues resultingValues){
		return resultingValues.getSecurityLevel().stream().filter(level -> level.getName().equals(securityLevelName)).findFirst();
	}
	
	public static void addSecuritylevelToResultingValues(SecurityLevel_ResultingValues securityLevel, CodeQLResultingValues resultingValues) {
		if(!resultingValues.getSecurityLevel().contains(securityLevel)) {
			resultingValues.getSecurityLevel().add(securityLevel);
		}
	}
	
	public static void addSecurityLevelToResultingvaluesByName(SecurityLevel_ResultingValues securityLevel, CodeQLResultingValues resultingValues) {
		if(!resultingValues.getSecurityLevel().stream().anyMatch(level -> level.getName().equals(securityLevel.getName()))) {
			resultingValues.getSecurityLevel().add(securityLevel);
		}
	}
	
	public static void addConfigById(ConfigurationID_ResultingValues config, CodeQLResultingValues resultingValues) {
		if(!resultingValues.getConfigurations().stream().anyMatch(cfg -> cfg.getId().equals(config.getId()))) {
			resultingValues.getConfigurations().add(config);
		}
	}
	
	public static ParameterIdentificiation_CodeQLResultingValues getOrCreateAndAddParameter(String parameterName, String type, String methodName, String fullyQualifiedClassName, CodeQLResultingValues resultingValues) {

		Optional<ParameterIdentificiation_CodeQLResultingValues> potentialParameter =  getPotentialParameterByContent(parameterName, type, methodName, fullyQualifiedClassName, resultingValues);
		
		if(potentialParameter.isPresent()) {
			return potentialParameter.get();
		}
		
		ParameterIdentificiation_CodeQLResultingValues parameter = CodeQLResultingValuesModelGenerationUtil.createParameterIdentification(parameterName, type, methodName, fullyQualifiedClassName);
	
		addParameterToResultingvaluesByContent(parameter, resultingValues);
		
		
		return parameter;
	}
	
	public static Optional<ParameterIdentificiation_CodeQLResultingValues> getPotentialParameterByContent(String parameterName, String type, String methodName, String fullyQualifiedClassName, CodeQLResultingValues resultingValues) {
		return resultingValues.getSystemElements().stream().filter(param -> {return param.getParameterName().equals(parameterName) && param.getParameterType().equals(type) && param.getMethodName().equals(methodName) && param.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addParameterToResultingvaluesByContent(ParameterIdentificiation_CodeQLResultingValues parameter, CodeQLResultingValues resultingValues) {
		if(getPotentialParameterByContent(parameter.getParameterName(), parameter.getParameterType(), parameter.getMethodName(), parameter.getFullyQualifiedClassName(), resultingValues).isEmpty()) {
			resultingValues.getSystemElements().add(parameter);
		}
	}
	
	public static ConfigurationID_ResultingValues getOrCreateAndAddConfigById(String configID, CodeQLResultingValues resultingValues) {
			Optional<ConfigurationID_ResultingValues> potentialConfig =  getPotentialConfigByID(configID, resultingValues);
		
		if(potentialConfig.isPresent()) {
			return potentialConfig.get();
		}
		
		ConfigurationID_ResultingValues parameter = CodeQLResultingValuesModelGenerationUtil.createConfiguration(configID);
	
		addConfigToResultingvaluesByID(parameter, resultingValues);
		
		
		return parameter;
	}

	private static Optional<ConfigurationID_ResultingValues> getPotentialConfigByID(String configID,
			CodeQLResultingValues resultingValues) {
		
		return resultingValues.getConfigurations().stream().filter(config -> config.getId().equals(configID)).findFirst();	
	
	}
	
	public static void addConfigToResultingvaluesByID(ConfigurationID_ResultingValues config, CodeQLResultingValues resultingValues) {
		if(getPotentialConfigByID(config.getId(), resultingValues).isEmpty()) {
			resultingValues.getConfigurations().add(config);
		}
	}

}
