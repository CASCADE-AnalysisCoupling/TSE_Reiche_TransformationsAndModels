package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils;

import java.util.Optional;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;



public class CodeQLResultingValuesElementHandlingUtils {
	
	public static SecurityLevel_ResolvedImplementationValues getOrCreateAndAddSecurityLevelByName(String securityLevelName, ResolvedImplementationValues resultingValues) {

		Optional<SecurityLevel_ResolvedImplementationValues> potentialSecurityLevel =  getPotentialSecurityLevelByName(securityLevelName, resultingValues);
		
		if(potentialSecurityLevel.isPresent()) {
			return potentialSecurityLevel.get();
		}
		
		SecurityLevel_ResolvedImplementationValues securityLevel = CodeQLResultingValuesModelGenerationUtil.createSecurityLevel(securityLevelName);
	
		addSecurityLevelToResultingvaluesByName(securityLevel, resultingValues);
		
		
		return securityLevel;
	}
	
	public static Optional<SecurityLevel_ResolvedImplementationValues> getPotentialSecurityLevelByName(String securityLevelName, ResolvedImplementationValues resultingValues){
		return resultingValues.getSecurityLevel().stream().filter(level -> level.getName().equals(securityLevelName)).findFirst();
	}
	
	public static void addSecuritylevelToResultingValues(SecurityLevel_ResolvedImplementationValues securityLevel, ResolvedImplementationValues resultingValues) {
		if(!resultingValues.getSecurityLevel().contains(securityLevel)) {
			resultingValues.getSecurityLevel().add(securityLevel);
		}
	}
	
	public static void addSecurityLevelToResultingvaluesByName(SecurityLevel_ResolvedImplementationValues securityLevel, ResolvedImplementationValues resultingValues) {
		if(!resultingValues.getSecurityLevel().stream().anyMatch(level -> level.getName().equals(securityLevel.getName()))) {
			resultingValues.getSecurityLevel().add(securityLevel);
		}
	}
	
	public static void addConfigById(RuleId_ResolvedImplementationValue config, ResolvedImplementationValues resultingValues) {
		if(!resultingValues.getConfigurations().stream().anyMatch(cfg -> cfg.getId().equals(config.getId()))) {
			resultingValues.getConfigurations().add(config);
		}
	}
	
	public static Parameter_ResolvedImplementationValues getOrCreateAndAddParameter(String parameterName, String type, String methodName, String fullyQualifiedClassName, ResolvedImplementationValues resultingValues) {

		Optional<Parameter_ResolvedImplementationValues> potentialParameter =  getPotentialParameterByContent(parameterName, type, methodName, fullyQualifiedClassName, resultingValues);
		
		if(potentialParameter.isPresent()) {
			return potentialParameter.get();
		}
		
		Parameter_ResolvedImplementationValues parameter = CodeQLResultingValuesModelGenerationUtil.createParameter(parameterName, type, methodName, fullyQualifiedClassName);
	
		addParameterToResultingvaluesByContent(parameter, resultingValues);
		
		
		return parameter;
	}
	
	public static Optional<Parameter_ResolvedImplementationValues> getPotentialParameterByContent(String parameterName, String type, String methodName, String fullyQualifiedClassName, ResolvedImplementationValues resultingValues) {
		return resultingValues.getSystemElements().stream().filter(param -> {return param.getParameterName().equals(parameterName) && param.getParameterType().equals(type) && param.getMethodName().equals(methodName) && param.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addParameterToResultingvaluesByContent(Parameter_ResolvedImplementationValues parameter, ResolvedImplementationValues resultingValues) {
		if(getPotentialParameterByContent(parameter.getParameterName(), parameter.getParameterType(), parameter.getMethodName(), parameter.getFullyQualifiedClassName(), resultingValues).isEmpty()) {
			resultingValues.getSystemElements().add(parameter);
		}
	}
	
	public static RuleId_ResolvedImplementationValue getOrCreateAndAddConfigById(String configID, ResolvedImplementationValues resultingValues) {
			Optional<RuleId_ResolvedImplementationValue> potentialConfig =  getPotentialConfigByID(configID, resultingValues);
		
		if(potentialConfig.isPresent()) {
			return potentialConfig.get();
		}
		
		RuleId_ResolvedImplementationValue parameter = CodeQLResultingValuesModelGenerationUtil.createConfiguration(configID);
	
		addConfigToResultingvaluesByID(parameter, resultingValues);
		
		
		return parameter;
	}

	private static Optional<RuleId_ResolvedImplementationValue> getPotentialConfigByID(String configID,
			ResolvedImplementationValues resultingValues) {
		
		return resultingValues.getConfigurations().stream().filter(config -> config.getId().equals(configID)).findFirst();	
	
	}
	
	public static void addConfigToResultingvaluesByID(RuleId_ResolvedImplementationValue config, ResolvedImplementationValues resultingValues) {
		if(getPotentialConfigByID(config.getId(), resultingValues).isEmpty()) {
			resultingValues.getConfigurations().add(config);
		}
	}

}
