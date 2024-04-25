package edu.kit.kastel.sdq.coupling.models.codeqlscar.utils;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarFactory;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElementIdentification;

public class CodeQLSCARModelGenerationUtil {
	
	public static ConfigurationID_SCAR createConfiguration(String id) {
		ConfigurationID_SCAR config = CodeqlscarFactory.eINSTANCE.createConfigurationID_SCAR();
		config.setId(id);
		return config;
	}
	
	public static SecurityLevel_SCAR createSecurityLevel(String name) {
		SecurityLevel_SCAR level = CodeqlscarFactory.eINSTANCE.createSecurityLevel_SCAR();
		level.setName(name);
		return level;
	}
	
	public static ParameterIdentification createParameterIdentification(String parameterName, String type, String methodName, String fullyQualifiedClassName) {
		ParameterIdentification ident = CodeqlscarFactory.eINSTANCE.createParameterIdentification();
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		ident.setMethodName(methodName);
		ident.setParameterName(parameterName);
		ident.setParameterType(type);
		return ident;
	}
	
	public static FieldIdentification createFieldIdentification(String fieldName, String type, String fullyQualifiedClassName) {
		FieldIdentification ident = CodeqlscarFactory.eINSTANCE.createFieldIdentification();
		ident.setFieldName(fieldName);
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		ident.setType(type);
		return ident;
	}
	
	public static ResultEntryElement<FieldIdentification> createResultEntryElement(FieldIdentification systemElement, SecurityLevel_SCAR securityLevel){
		ResultEntryElement<FieldIdentification> resultEntryElement = CodeqlscarFactory.eINSTANCE.createResultEntryElement();
		resultEntryElement.setSystemElement(systemElement);
		resultEntryElement.setSecurityLevel(securityLevel);
		return resultEntryElement;
	}
	
	public static ResultEntryElement<ParameterIdentification> createResultEntryElement(ParameterIdentification systemElement, SecurityLevel_SCAR securityLevel){
		ResultEntryElement<ParameterIdentification> resultEntryElement = CodeqlscarFactory.eINSTANCE.createResultEntryElement();
		resultEntryElement.setSystemElement(systemElement);
		resultEntryElement.setSecurityLevel(securityLevel);
		return resultEntryElement;
	}
	
	public static ResultEntry createResultEntry(ConfigurationID_SCAR config, ResultEntryElement<?> source, ResultEntryElement<?> sink) {
		ResultEntry resultEntry = CodeqlscarFactory.eINSTANCE.createResultEntry();
		resultEntry.setConfig(config);
		resultEntry.setSink(sink);
		resultEntry.setSource(source);
		return resultEntry;
	}
	
	public static SourceCodeAnalysisResult createSourceCodeAnalysisResult() {
		return CodeqlscarFactory.eINSTANCE.createSourceCodeAnalysisResult();
	}
}
