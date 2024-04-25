package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils;


import java.util.Collection;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SystemElementCorrespondence;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

public class CodeQLSCARCorrespondenceUtil {

	public static CodeQLSCARCorrespondences createCodeQLSCARCorrespondences() {
		return CodeqlscarcorrespondencesFactory.eINSTANCE.createCodeQLSCARCorrespondences();
	}
	
	public static FieldCorrespondence createCorrespondence(Field field_JAVA, FieldIdentification field_SCAR) {
		FieldCorrespondence corr = CodeqlscarcorrespondencesFactory.eINSTANCE.createFieldCorrespondence();
		corr.setJavaField(field_JAVA);
		corr.setScarField(field_SCAR);
		return corr;
	}
	
	public static ParameterCorrespondence createCorrespondence(Parameter parameter_JAVA, ParameterIdentification parameter_SCAR) {
		ParameterCorrespondence corr = CodeqlscarcorrespondencesFactory.eINSTANCE.createParameterCorrespondence();
		corr.setJavaParameter(parameter_JAVA);
		corr.setScarParameter(parameter_SCAR);
		return corr;
	}
	
	public static SecurityLevelCorrespondence createCorrespondence(SecurityLevel securityLevel_CodeQL, SecurityLevel_SCAR securityLevel_SCAR) {
		SecurityLevelCorrespondence corr = CodeqlscarcorrespondencesFactory.eINSTANCE.createSecurityLevelCorrespondence();
		corr.setCodeQLSecurityLevel(securityLevel_CodeQL);
		corr.setCodeQLSCARSecurityLevel(securityLevel_SCAR);
		return corr;
	}
	
	public static ConfigurationCorrespondence createCorrespondence(Configuration config_CodeQL, ConfigurationID_SCAR config_SCAR) {
		ConfigurationCorrespondence corr = CodeqlscarcorrespondencesFactory.eINSTANCE.createConfigurationCorrespondence();
		corr.setCodeQLConfig(config_CodeQL);
		corr.setCodeQLSCARConfig(config_SCAR);
		return corr;
	}
	
	
	
	public static boolean correspondenceExists(Field field, CodeQLSCARCorrespondences correspondences) {
		return getFieldCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> correspondence.getJavaField().equals(field));
	}
	
	public static boolean correspondenceExists(FieldIdentification field, CodeQLSCARCorrespondences correspondences) {
		return getFieldCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> correspondence.getScarField().equals(field));
	}

	public static boolean correspondenceExists(Parameter parameter, CodeQLSCARCorrespondences correspondences) {
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> correspondence.getJavaParameter().equals(parameter));
	}
	
	public static boolean correspondenceExists(ParameterIdentification parameter, CodeQLSCARCorrespondences correspondences) {
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> correspondence.getScarParameter().equals(parameter));
	}
	
	public static boolean correspondenceExists(SecurityLevel securityLevel, CodeQLSCARCorrespondences correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream().anyMatch(correspondence -> correspondence.getCodeQLSecurityLevel().equals(securityLevel));
	}
	
	public static boolean correspondenceExists(Configuration config, CodeQLSCARCorrespondences correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> correspondence.getCodeQLConfig().equals(config));
	}
	
	public static boolean correspondenceExists(ConfigurationID_SCAR config, CodeQLSCARCorrespondences correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> correspondence.getCodeQLSCARConfig().getId().equals(config.getId()));
	}
	
	public static boolean correspondenceExists(SecurityLevel_SCAR securityLevel, CodeQLSCARCorrespondences correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream().anyMatch(correspondence -> correspondence.getCodeQLSCARSecurityLevel().equals(securityLevel));
	}
	
	public static boolean correspondenceExists(SecurityLevel securityLevel, SecurityLevel_SCAR securityLevelScar, CodeQLSCARCorrespondences correspondences){
		return correspondences.getSecurityLevelCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getCodeQLSCARSecurityLevel().equals(securityLevelScar) && correspondence.getCodeQLSecurityLevel().equals(securityLevel);});
	}
	
	public static boolean correspondenceExists(Field field, FieldIdentification fieldScar, CodeQLSCARCorrespondences correspondences){
		return getFieldCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> {return correspondence.getScarField().equals(fieldScar) && correspondence.getJavaField().equals(field);});
	}
	
	public static boolean correspondenceExists(Parameter parameter, ParameterIdentification parameterScar, CodeQLSCARCorrespondences correspondences){
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> {return correspondence.getScarParameter().equals(parameterScar) && correspondence.getJavaParameter().equals(parameter);});
	}
	
	public static boolean correspondenceExists(Configuration config, ConfigurationID_SCAR configScar, CodeQLSCARCorrespondences correspondences){
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getCodeQLSCARConfig().getId().equals(configScar.getId()) && correspondence.getCodeQLConfig().equals(config);});
	}
	
	
	
	public static Collection<FieldCorrespondence> getFieldCorrespondences(Collection<SystemElementCorrespondence> systemElementCorrespondences){
		return systemElementCorrespondences.stream().filter(FieldCorrespondence.class::isInstance).map(FieldCorrespondence.class::cast).collect(Collectors.toList());
	}
	
	public static Collection<ParameterCorrespondence> getParameterCorrespondences(Collection<SystemElementCorrespondence> systemElementCorrespondences){
		return systemElementCorrespondences.stream().filter(ParameterCorrespondence.class::isInstance).map(ParameterCorrespondence.class::cast).collect(Collectors.toList());
	}
	
	public static void createAndAddIfCorrespondenceNotExists(SecurityLevel securityLevel, SecurityLevel_SCAR securityLevelScar, CodeQLSCARCorrespondences correspondences) {
		if(!correspondenceExists(securityLevel,securityLevelScar, correspondences)) {
			correspondences.getSecurityLevelCorrespondences().add(createCorrespondence(securityLevel, securityLevelScar));
		}
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Field field, FieldIdentification fieldScar, CodeQLSCARCorrespondences correspondences) {
		if(!correspondenceExists(field, fieldScar, correspondences)) {
			correspondences.getSystemElementCorrespondences().add(createCorrespondence(field, fieldScar));
		}
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Parameter parameter, ParameterIdentification parameterScar, CodeQLSCARCorrespondences correspondences) {
		if(!correspondenceExists(parameter, parameterScar, correspondences)) {
			correspondences.getSystemElementCorrespondences().add(createCorrespondence(parameter, parameterScar));
		}
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Configuration config, ConfigurationID_SCAR configScar, CodeQLSCARCorrespondences correspondences) {
		if(!correspondenceExists(config, configScar, correspondences)) {
			correspondences.getConfigurationCorrespondences().add(createCorrespondence(config, configScar));
		}
	}
	
	public static Configuration getCorresponding(ConfigurationID_SCAR config, CodeQLSCARCorrespondences correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().filter(correspondence -> correspondence.getCodeQLSCARConfig().equals(config)).findFirst().get().getCodeQLConfig();
	}

	public static Parameter getCorresponding(ParameterIdentification parameter_SCAR,
			CodeQLSCARCorrespondences correspondences) {
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream().filter(correspondence -> correspondence.getScarParameter().equals(parameter_SCAR)).findFirst().get().getJavaParameter();
	}
	
	
}
