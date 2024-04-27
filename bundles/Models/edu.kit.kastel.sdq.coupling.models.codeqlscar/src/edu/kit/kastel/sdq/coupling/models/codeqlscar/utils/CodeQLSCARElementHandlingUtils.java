package edu.kit.kastel.sdq.coupling.models.codeqlscar.utils;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElementIdentification;

public class CodeQLSCARElementHandlingUtils {

	public static SecurityLevel_SCAR getOrCreateAndAddSecurityLevelByName(String securityLevelName, SourceCodeAnalysisResult scar) {

		Optional<SecurityLevel_SCAR> potentialSecurityLevel =  getPotentialSecurityLevelByName(securityLevelName, scar);
		
		if(potentialSecurityLevel.isPresent()) {
			return potentialSecurityLevel.get();
		}
		
		SecurityLevel_SCAR securityLevel = CodeQLSCARModelGenerationUtil.createSecurityLevel(securityLevelName);
	
		addSecurityLevelToScarByName(securityLevel, scar);
		
		
		return securityLevel;
	}
	
	public static Optional<SecurityLevel_SCAR> getPotentialSecurityLevelByName(String securityLevelName, SourceCodeAnalysisResult scar){
		return scar.getSecurityLevels().stream().filter(level -> level.getName().equals(securityLevelName)).findFirst();
	}
	
	public static void addSecurityLevelToScarByName(SecurityLevel_SCAR securityLevel, SourceCodeAnalysisResult scar) {
		if(!scar.getSecurityLevels().stream().anyMatch(level -> level.getName().equals(securityLevel.getName()))) {
			scar.getSecurityLevels().add(securityLevel);
		}
	}
	
	public static void addConfigById(ConfigurationID_SCAR config, SourceCodeAnalysisResult scar) {
		if(!scar.getConfigurations().stream().anyMatch(cfg -> cfg.getId().equals(config.getId()))) {
			scar.getConfigurations().add(config);
		}
	}
	
	public static ParameterIdentification getOrCreateAndAddParameter(String parameterName, String type, String methodName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {

		Optional<ParameterIdentification> potentialParameter =  getPotentialParameterByContent(parameterName, type, methodName, fullyQualifiedClassName, scar);
		
		if(potentialParameter.isPresent()) {
			return potentialParameter.get();
		}
		
		ParameterIdentification parameter = CodeQLSCARModelGenerationUtil.createParameterIdentification(parameterName, type, methodName, fullyQualifiedClassName);
	
		addParameterToScarByContent(parameter, scar);
		
		
		return parameter;
	}
	
	public static Optional<ParameterIdentification> getPotentialParameterByContent(String parameterName, String type, String methodName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {
		return getParameterIdentifications(scar.getSystemElementIdentifications()).stream().filter(param -> {return param.getParameterName().equals(parameterName) && param.getParameterType().equals(type) && param.getMethodName().equals(methodName) && param.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addParameterToScarByContent(ParameterIdentification parameter, SourceCodeAnalysisResult scar) {
		if(getPotentialParameterByContent(parameter.getParameterName(), parameter.getParameterType(), parameter.getMethodName(), parameter.getFullyQualifiedClassName(), scar).isEmpty()) {
			scar.getSystemElementIdentifications().add(parameter);
		}
	}
	
	private static Collection<ParameterIdentification> getParameterIdentifications(Collection<SystemElementIdentification> systemElements){
		return systemElements.stream().filter(ParameterIdentification.class::isInstance).map(ParameterIdentification.class::cast).collect(Collectors.toList());
	}
	
	public static FieldIdentification getOrCreateAndAddField(String fieldName, String type, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {

		Optional<FieldIdentification> potentialField =  getPotentialFieldByContent(fieldName, type, fullyQualifiedClassName, scar);
		
		if(potentialField.isPresent()) {
			return potentialField.get();
		}
		
		FieldIdentification field = CodeQLSCARModelGenerationUtil.createFieldIdentification(fieldName, type ,fullyQualifiedClassName);
	
		addFieldToScarByContent(field, scar);
		
		
		return field;
	}
	
	public static Optional<FieldIdentification> getPotentialFieldByContent(String fieldName, String type, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {
		return getFieldIdentifications(scar.getSystemElementIdentifications()).stream().filter(field -> {return field.getFieldName().equals(fieldName) && field.getType().equals(type) && field.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addFieldToScarByContent(FieldIdentification field, SourceCodeAnalysisResult scar) {
		if(getPotentialFieldByContent(field.getFieldName(), field.getType(), field.getFullyQualifiedClassName(), scar).isEmpty()) {
			scar.getSystemElementIdentifications().add(field);
		}
	}
	
	private static Collection<FieldIdentification> getFieldIdentifications(Collection<SystemElementIdentification> systemElements){
		return systemElements.stream().filter(FieldIdentification.class::isInstance).map(FieldIdentification.class::cast).collect(Collectors.toList());
	}
	
}
