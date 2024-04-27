package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util;

import java.util.Optional;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;



public class JOANAResultingValuesElementHandlingUtil {
	public static Level_ResultingValues getOrCreateAndAddSecurityLevelByName(String securityLevelName, JOANAResultingValues resultingValues) {

		Optional<Level_ResultingValues> potentialSecurityLevel =  getPotentialSecurityLevelByName(securityLevelName, resultingValues);
		
		if(potentialSecurityLevel.isPresent()) {
			return potentialSecurityLevel.get();
		}
		
		Level_ResultingValues securityLevel = JOANAResultingValuesModelGenerationUtil.createSecurityLevel(securityLevelName);
	
		addSecurityLevelToResultingvaluesByName(securityLevel, resultingValues);
		
		
		return securityLevel;
	}
	
	public static Optional<Level_ResultingValues> getPotentialSecurityLevelByName(String securityLevelName, JOANAResultingValues resultingValues){
		return resultingValues.getLevels().stream().filter(level -> level.getName().equals(securityLevelName)).findFirst();
	}
	
	public static void addSecuritylevelToResultingValues(Level_ResultingValues securityLevel, JOANAResultingValues resultingValues) {
		if(!resultingValues.getLevels().contains(securityLevel)) {
			resultingValues.getLevels().add(securityLevel);
		}
	}
	
	public static void addSecurityLevelToResultingvaluesByName(Level_ResultingValues securityLevel, JOANAResultingValues resultingValues) {
		if(!resultingValues.getLevels().stream().anyMatch(level -> level.getName().equals(securityLevel.getName()))) {
			resultingValues.getLevels().add(securityLevel);
		}
	}
	
	public static void addEntryPointById(EntryPointIdentification_ResultingValues entryPoint, JOANAResultingValues resultingValues) {
		if(!resultingValues.getEntryPoints().stream().anyMatch(ep -> ep.getTag().equals(entryPoint.getTag()))) {
			resultingValues.getEntryPoints().add(entryPoint);
		}
	}
	
	public static ParameterIdentification_JOANAResultingValues getOrCreateAndAddParameter(int parameterIndex, String type, String methodName, String fullyQualifiedClassName, JOANAResultingValues resultingValues) {

		Optional<ParameterIdentification_JOANAResultingValues> potentialParameter =  getPotentialParameterByContent(parameterIndex, type, methodName, fullyQualifiedClassName, resultingValues);
		
		if(potentialParameter.isPresent()) {
			return potentialParameter.get();
		}
		
		ParameterIdentification_JOANAResultingValues parameter = JOANAResultingValuesModelGenerationUtil.createParameterIdentification(parameterIndex, type, methodName, fullyQualifiedClassName);
	
		addParameterToResultingvaluesByContent(parameter, resultingValues);
		
		
		return parameter;
	}
	
	public static Optional<ParameterIdentification_JOANAResultingValues> getPotentialParameterByContent(int parameterIndex, String type, String methodName, String fullyQualifiedClassName, JOANAResultingValues resultingValues) {
		return resultingValues.getSystemElements().stream().filter(param -> {return param.getParameterIndex() == parameterIndex && param.getParameterType().equals(type) && param.getMethodName().equals(methodName) && param.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addParameterToResultingvaluesByContent(ParameterIdentification_JOANAResultingValues parameter, JOANAResultingValues resultingValues) {
		if(getPotentialParameterByContent(parameter.getParameterIndex(), parameter.getParameterType(), parameter.getMethodName(), parameter.getFullyQualifiedClassName(), resultingValues).isEmpty()) {
			resultingValues.getSystemElements().add(parameter);
		}
	}
	
	public static EntryPointIdentification_ResultingValues getOrCreateAndAddEntryPointById(String tag, JOANAResultingValues resultingValues) {
			Optional<EntryPointIdentification_ResultingValues> potentialEntryPoint =  getPotentialEntryPointByID(tag, resultingValues);
		
		if(potentialEntryPoint.isPresent()) {
			return potentialEntryPoint.get();
		}
		
		EntryPointIdentification_ResultingValues parameter = JOANAResultingValuesModelGenerationUtil.createEntryPoint(tag);
	
		addEntryPointToResultingvaluesByID(parameter, resultingValues);
		
		
		return parameter;
	}

	private static Optional<EntryPointIdentification_ResultingValues> getPotentialEntryPointByID(String tag,
			JOANAResultingValues resultingValues) {
		
		return resultingValues.getEntryPoints().stream().filter(entryPoint -> entryPoint.getTag().equals(tag)).findFirst();	
	
	}
	
	public static void addEntryPointToResultingvaluesByID(EntryPointIdentification_ResultingValues entryPoint, JOANAResultingValues resultingValues) {
		if(getPotentialEntryPointByID(entryPoint.getTag(), resultingValues).isEmpty()) {
			resultingValues.getEntryPoints().add(entryPoint);
		}
	}
}
