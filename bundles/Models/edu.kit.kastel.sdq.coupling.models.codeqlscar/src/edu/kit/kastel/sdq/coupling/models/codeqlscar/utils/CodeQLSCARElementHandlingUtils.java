package edu.kit.kastel.sdq.coupling.models.codeqlscar.utils;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElement;

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
	
	public static void addConfigById(RuleId ruleIds, SourceCodeAnalysisResult scar) {
		if(!scar.getRuleIds().stream().anyMatch(cfg -> cfg.getId().equals(ruleIds.getId()))) {
			scar.getRuleIds().add(ruleIds);
		}
	}
	
	public static Parameter_SCAR getOrCreateAndAddParameter(String parameterName, String type, String methodName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {

		Optional<Parameter_SCAR> potentialParameter =  getPotentialParameterByContent(parameterName, type, methodName, fullyQualifiedClassName, scar);
		
		if(potentialParameter.isPresent()) {
			return potentialParameter.get();
		}
		
		Parameter_SCAR parameter = CodeQLSCARModelGenerationUtil.createParameter(parameterName, type, methodName, fullyQualifiedClassName);
	
		addParameterToScarByContent(parameter, scar);
		
		
		return parameter;
	}
	
	public static Optional<Parameter_SCAR> getPotentialParameterByContent(String parameterName, String type, String methodName, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {
		return getParameterIdentifications(scar.getSystemElementIdentifications()).stream().filter(param -> {return param.getParameterName().equals(parameterName) && param.getParameterType().equals(type) && param.getMethodName().equals(methodName) && param.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addParameterToScarByContent(Parameter_SCAR parameter, SourceCodeAnalysisResult scar) {
		if(getPotentialParameterByContent(parameter.getParameterName(), parameter.getParameterType(), parameter.getMethodName(), parameter.getFullyQualifiedClassName(), scar).isEmpty()) {
			scar.getSystemElementIdentifications().add(parameter);
		}
	}
	
	private static Collection<Parameter_SCAR> getParameterIdentifications(Collection<SystemElement> systemElements){
		return systemElements.stream().filter(Parameter_SCAR.class::isInstance).map(Parameter_SCAR.class::cast).collect(Collectors.toList());
	}
	
	public static Field_SCAR getOrCreateAndAddField(String fieldName, String type, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {

		Optional<Field_SCAR> potentialField =  getPotentialFieldByContent(fieldName, type, fullyQualifiedClassName, scar);
		
		if(potentialField.isPresent()) {
			return potentialField.get();
		}
		
		Field_SCAR field = CodeQLSCARModelGenerationUtil.createField(fieldName, type ,fullyQualifiedClassName);
	
		addFieldToScarByContent(field, scar);
		
		
		return field;
	}
	
	public static Optional<Field_SCAR> getPotentialFieldByContent(String fieldName, String type, String fullyQualifiedClassName, SourceCodeAnalysisResult scar) {
		return getFieldIdentifications(scar.getSystemElementIdentifications()).stream().filter(field -> {return field.getFieldName().equals(fieldName) && field.getType().equals(type) && field.getFullyQualifiedClassName().equals(fullyQualifiedClassName);}).findFirst();
	}
	
	public static void addFieldToScarByContent(Field_SCAR field, SourceCodeAnalysisResult scar) {
		if(getPotentialFieldByContent(field.getFieldName(), field.getType(), field.getFullyQualifiedClassName(), scar).isEmpty()) {
			scar.getSystemElementIdentifications().add(field);
		}
	}
	
	private static Collection<Field_SCAR> getFieldIdentifications(Collection<SystemElement> systemElements){
		return systemElements.stream().filter(Field_SCAR.class::isInstance).map(Field_SCAR.class::cast).collect(Collectors.toList());
	}
	
}
