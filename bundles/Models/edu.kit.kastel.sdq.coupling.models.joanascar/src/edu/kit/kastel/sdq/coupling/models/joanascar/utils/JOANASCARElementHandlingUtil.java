package edu.kit.kastel.sdq.coupling.models.joanascar.utils;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.joanascar.SystemElementIdentifiying_JOANASCAR;


public class JOANASCARElementHandlingUtil {
	public static Level_SCAR getOrCreateAndAddSecurityLevelByName(String securityLevelName, SourceCodeAnalysisResult scar) {

		Optional<Level_SCAR> potentialSecurityLevel =  getPotentialSecurityLevelByName(securityLevelName, scar);
		
		if(potentialSecurityLevel.isPresent()) {
			return potentialSecurityLevel.get();
		}
		
		Level_SCAR securityLevel = JOANASCARModelGenerationUtil.createSecurityLevel(securityLevelName);
	
		addSecurityLevelToScarByName(securityLevel, scar);
		
		
		return securityLevel;
	}
	
	public static Optional<Level_SCAR> getPotentialSecurityLevelByName(String securityLevelName, SourceCodeAnalysisResult scar){
		return scar.getLevels().stream().filter(level -> level.getName().equals(securityLevelName)).findFirst();
	}
	
	public static void addSecurityLevelToScarByName(Level_SCAR securityLevel, SourceCodeAnalysisResult scar) {
		if(!scar.getLevels().stream().anyMatch(level -> level.getName().equals(securityLevel.getName()))) {
			scar.getLevels().add(securityLevel);
		}
	}
	
	public static EntryPointIdentifying getOrCreateAndAddEntryPointByTag(String tag, SourceCodeAnalysisResult scar) {

		Optional<EntryPointIdentifying> potentialEntryPoint =  getPotentialEntryPointByTag(tag, scar);
		
		if(potentialEntryPoint.isPresent()) {
			return potentialEntryPoint.get();
		}
		
		EntryPointIdentifying entryPoint = JOANASCARModelGenerationUtil.createEntryPointIdentifiying(tag);
	
		addEntryPointByTag(entryPoint, scar);
		
		
		return entryPoint;
	}
	
	public static Optional<EntryPointIdentifying> getPotentialEntryPointByTag(String tag, SourceCodeAnalysisResult scar){
		return scar.getEntryPoints().stream().filter(entryPoint -> entryPoint.getTag().equals(tag)).findFirst();
	}
	
	public static void addEntryPointByTag(EntryPointIdentifying entryPoint, SourceCodeAnalysisResult scar) {
		if(!scar.getEntryPoints().stream().anyMatch(ep -> ep.getTag().equals(entryPoint.getTag()))) {
			scar.getEntryPoints().add(entryPoint);
		}
	}
	
	public static ParameterIdentifying getOrCreateAndAddParameter(int parameterIndex, String type, String methodName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {

		Optional<ParameterIdentifying> potentialParameter =  getPotentialParameterByContent(parameterIndex, type, methodName, fullyQualifiedClassName, scar);
		
		if(potentialParameter.isPresent()) {
			return potentialParameter.get();
		}
		
		ParameterIdentifying parameter = JOANASCARModelGenerationUtil.createParameterIdentification(parameterIndex, type, methodName, fullyQualifiedClassName);
	
		addParameterToScarByContent(parameter, scar);
		
		
		return parameter;
	}
	
	public static Optional<ParameterIdentifying> getPotentialParameterByContent(int parameterIndex, String type, String methodName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {
		return getParameterIdentifications(scar.getSystemElements()).stream().filter(param -> {return param.getParameterIndex() == parameterIndex && param.getParameterType().equals(type) && param.getMethodName().equals(methodName) && param.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addParameterToScarByContent(ParameterIdentifying parameter, SourceCodeAnalysisResult scar) {
		if(getPotentialParameterByContent(parameter.getParameterIndex(), parameter.getParameterType(), parameter.getMethodName(), parameter.getFullyQualifiedClassName(), scar).isEmpty()) {
			scar.getSystemElements().add(parameter);
		}
	}
	
	private static Collection<ParameterIdentifying> getParameterIdentifications(Collection<SystemElementIdentifiying_JOANASCAR> systemElements){
		return systemElements.stream().filter(ParameterIdentifying.class::isInstance).map(ParameterIdentifying.class::cast).collect(Collectors.toList());
	}
	
	public static FieldIdentifying getOrCreateAndAddField(String fieldName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {

		Optional<FieldIdentifying> potentialField =  getPotentialFieldByContent(fieldName, fullyQualifiedClassName, scar);
		
		if(potentialField.isPresent()) {
			return potentialField.get();
		}
		
		FieldIdentifying field = JOANASCARModelGenerationUtil.createFieldIdentification(fieldName, fullyQualifiedClassName);
	
		addFieldToScarByContent(field, scar);
		
		
		return field;
	}
	
	public static Optional<FieldIdentifying> getPotentialFieldByContent(String fieldName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {
		return getFieldIdentifyings(scar.getSystemElements()).stream().filter(field -> {return field.getFieldName().equals(fieldName) && field.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addFieldToScarByContent(FieldIdentifying field, SourceCodeAnalysisResult scar) {
		if(getPotentialFieldByContent(field.getFieldName(), field.getFullyQualifiedClassName(), scar).isEmpty()) {
			scar.getSystemElements().add(field);
		}
	}
	
	private static Collection<FieldIdentifying> getFieldIdentifyings(Collection<SystemElementIdentifiying_JOANASCAR> systemElements){
		return systemElements.stream().filter(FieldIdentifying.class::isInstance).map(FieldIdentifying.class::cast).collect(Collectors.toList());
	}
}
