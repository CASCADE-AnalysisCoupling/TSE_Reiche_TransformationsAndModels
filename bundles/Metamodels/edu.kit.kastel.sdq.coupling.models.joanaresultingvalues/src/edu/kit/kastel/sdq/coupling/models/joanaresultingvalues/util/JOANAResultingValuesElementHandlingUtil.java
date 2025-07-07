package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util;

import java.util.Optional;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues;


public class JOANAResultingValuesElementHandlingUtil {
	public static Level_ResolvedImplementationValues getOrCreateAndAddSecurityLevelByName(String securityLevelName, ResolvedImplementationValues resultingValues) {

		Optional<Level_ResolvedImplementationValues> potentialSecurityLevel =  getPotentialSecurityLevelByName(securityLevelName, resultingValues);
		
		if(potentialSecurityLevel.isPresent()) {
			return potentialSecurityLevel.get();
		}
		
		Level_ResolvedImplementationValues securityLevel = JOANAResultingValuesModelGenerationUtil.createSecurityLevel(securityLevelName);
	
		addSecurityLevelToResultingvaluesByName(securityLevel, resultingValues);
		
		
		return securityLevel;
	}
	
	public static Optional<Level_ResolvedImplementationValues> getPotentialSecurityLevelByName(String securityLevelName, ResolvedImplementationValues resultingValues){
		return resultingValues.getLevels().stream().filter(level -> level.getName().equals(securityLevelName)).findFirst();
	}
	
	public static void addSecuritylevelToResultingValues(Level_ResolvedImplementationValues securityLevel, ResolvedImplementationValues resultingValues) {
		if(!resultingValues.getLevels().contains(securityLevel)) {
			resultingValues.getLevels().add(securityLevel);
		}
	}
	
	public static void addSecurityLevelToResultingvaluesByName(Level_ResolvedImplementationValues securityLevel, ResolvedImplementationValues resultingValues) {
		if(!resultingValues.getLevels().stream().anyMatch(level -> level.getName().equals(securityLevel.getName()))) {
			resultingValues.getLevels().add(securityLevel);
		}
	}
	
	public static void addEntryPointById(EntryPoint_ResolvedImplementationValues entryPoint, ResolvedImplementationValues resultingValues) {
		if(!resultingValues.getEntryPoints().stream().anyMatch(ep -> ep.getTag().equals(entryPoint.getTag()))) {
			resultingValues.getEntryPoints().add(entryPoint);
		}
	}
	
	public static Parameter_ResolvedImplementationValues getOrCreateAndAddParameter(int parameterIndex, String type, String methodName, String fullyQualifiedClassName, ResolvedImplementationValues resultingValues) {

		Optional<Parameter_ResolvedImplementationValues> potentialParameter =  getPotentialParameterByContent(parameterIndex, type, methodName, fullyQualifiedClassName, resultingValues);
		
		if(potentialParameter.isPresent()) {
			return potentialParameter.get();
		}
		
		Parameter_ResolvedImplementationValues parameter = JOANAResultingValuesModelGenerationUtil.createParameterIdentification(parameterIndex, type, methodName, fullyQualifiedClassName);
	
		addParameterToResultingvaluesByContent(parameter, resultingValues);
		
		
		return parameter;
	}
	
	public static Optional<Parameter_ResolvedImplementationValues> getPotentialParameterByContent(int parameterIndex, String type, String methodName, String fullyQualifiedClassName, ResolvedImplementationValues resultingValues) {
		return resultingValues.getSystemElements().stream().filter(param -> {return param.getParameterIndex() == parameterIndex && param.getParameterType().equals(type) && param.getMethodName().equals(methodName) && param.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addParameterToResultingvaluesByContent(Parameter_ResolvedImplementationValues parameter, ResolvedImplementationValues resultingValues) {
		if(getPotentialParameterByContent(parameter.getParameterIndex(), parameter.getParameterType(), parameter.getMethodName(), parameter.getFullyQualifiedClassName(), resultingValues).isEmpty()) {
			resultingValues.getSystemElements().add(parameter);
		}
	}
	
	public static EntryPoint_ResolvedImplementationValues getOrCreateAndAddEntryPointById(String tag, ResolvedImplementationValues resultingValues) {
			Optional<EntryPoint_ResolvedImplementationValues> potentialEntryPoint =  getPotentialEntryPointByID(tag, resultingValues);
		
		if(potentialEntryPoint.isPresent()) {
			return potentialEntryPoint.get();
		}
		
		EntryPoint_ResolvedImplementationValues parameter = JOANAResultingValuesModelGenerationUtil.createEntryPoint(tag);
	
		addEntryPointToResultingvaluesByID(parameter, resultingValues);
		
		
		return parameter;
	}

	private static Optional<EntryPoint_ResolvedImplementationValues> getPotentialEntryPointByID(String tag,
			ResolvedImplementationValues resultingValues) {
		
		return resultingValues.getEntryPoints().stream().filter(entryPoint -> entryPoint.getTag().equals(tag)).findFirst();	
	
	}
	
	public static void addEntryPointToResultingvaluesByID(EntryPoint_ResolvedImplementationValues entryPoint, ResolvedImplementationValues resultingValues) {
		if(getPotentialEntryPointByID(entryPoint.getTag(), resultingValues).isEmpty()) {
			resultingValues.getEntryPoints().add(entryPoint);
		}
	}
}
