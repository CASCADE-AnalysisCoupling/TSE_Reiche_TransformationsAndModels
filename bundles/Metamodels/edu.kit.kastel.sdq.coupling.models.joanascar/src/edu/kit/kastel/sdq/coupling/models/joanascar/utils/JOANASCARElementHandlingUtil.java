package edu.kit.kastel.sdq.coupling.models.joanascar.utils;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Field_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.SystemElement_SCAR;

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
	
	public static EntryPoint_SCAR getOrCreateAndAddEntryPointByTag(String tag, SourceCodeAnalysisResult scar) {

		Optional<EntryPoint_SCAR> potentialEntryPoint =  getPotentialEntryPointByTag(tag, scar);
		
		if(potentialEntryPoint.isPresent()) {
			return potentialEntryPoint.get();
		}
		
		EntryPoint_SCAR entryPoint = JOANASCARModelGenerationUtil.createEntryPointIdentifiying(tag);
	
		addEntryPointByTag(entryPoint, scar);
		
		
		return entryPoint;
	}
	
	public static Optional<EntryPoint_SCAR> getPotentialEntryPointByTag(String tag, SourceCodeAnalysisResult scar){
		return scar.getEntryPoints().stream().filter(entryPoint -> entryPoint.getTag().equals(tag)).findFirst();
	}
	
	public static void addEntryPointByTag(EntryPoint_SCAR entryPoint, SourceCodeAnalysisResult scar) {
		if(!scar.getEntryPoints().stream().anyMatch(ep -> ep.getTag().equals(entryPoint.getTag()))) {
			scar.getEntryPoints().add(entryPoint);
		}
	}
	
	public static Parameter_SCAR getOrCreateAndAddParameter(int parameterIndex, String type, String methodName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {

		Optional<Parameter_SCAR> potentialParameter =  getPotentialParameterByContent(parameterIndex, type, methodName, fullyQualifiedClassName, scar);
		
		if(potentialParameter.isPresent()) {
			return potentialParameter.get();
		}
		
		Parameter_SCAR parameter = JOANASCARModelGenerationUtil.createParameterIdentification(parameterIndex, type, methodName, fullyQualifiedClassName);
	
		addParameterToScarByContent(parameter, scar);
		
		
		return parameter;
	}
	
	public static Optional<Parameter_SCAR> getPotentialParameterByContent(int parameterIndex, String type, String methodName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {
		return getParameterIdentifications(scar.getSystemElements()).stream().filter(param -> {return param.getParameterIndex() == parameterIndex && param.getParameterType().equals(type) && param.getMethodName().equals(methodName) && param.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addParameterToScarByContent(Parameter_SCAR parameter, SourceCodeAnalysisResult scar) {
		if(getPotentialParameterByContent(parameter.getParameterIndex(), parameter.getParameterType(), parameter.getMethodName(), parameter.getFullyQualifiedClassName(), scar).isEmpty()) {
			scar.getSystemElements().add(parameter);
		}
	}
	
	private static Collection<Parameter_SCAR> getParameterIdentifications(Collection<SystemElement_SCAR> systemElements){
		return systemElements.stream().filter(Parameter_SCAR.class::isInstance).map(Parameter_SCAR.class::cast).collect(Collectors.toList());
	}
	
	public static Field_SCAR getOrCreateAndAddField(String fieldName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {

		Optional<Field_SCAR> potentialField =  getPotentialFieldByContent(fieldName, fullyQualifiedClassName, scar);
		
		if(potentialField.isPresent()) {
			return potentialField.get();
		}
		
		Field_SCAR field = JOANASCARModelGenerationUtil.createFieldIdentification(fieldName, fullyQualifiedClassName);
	
		addFieldToScarByContent(field, scar);
		
		
		return field;
	}
	
	public static Optional<Field_SCAR> getPotentialFieldByContent(String fieldName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {
		return getFieldIdentifyings(scar.getSystemElements()).stream().filter(field -> {return field.getFieldName().equals(fieldName) && field.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addFieldToScarByContent(Field_SCAR field, SourceCodeAnalysisResult scar) {
		if(getPotentialFieldByContent(field.getFieldName(), field.getFullyQualifiedClassName(), scar).isEmpty()) {
			scar.getSystemElements().add(field);
		}
	}
	
	private static Collection<Field_SCAR> getFieldIdentifyings(Collection<SystemElement_SCAR> systemElements){
		return systemElements.stream().filter(Field_SCAR.class::isInstance).map(Field_SCAR.class::cast).collect(Collectors.toList());
	}
}
