package edu.kit.kastel.sdq.coupling.models.codeqlscar.utils;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarFactory;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Result;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;

public class CodeQLSCARModelGenerationUtil {
	
	public static RuleId createRuleId(String id) {
		RuleId config = CodeqlscarFactory.eINSTANCE.createRuleId();
		config.setId(id);
		return config;
	}
	
	public static SecurityLevel_SCAR createSecurityLevel(String name) {
		SecurityLevel_SCAR level = CodeqlscarFactory.eINSTANCE.createSecurityLevel_SCAR();
		level.setName(name);
		return level;
	}
	
	public static Parameter_SCAR createParameter(String parameterName, String type, String methodName, String fullyQualifiedClassName) {
		Parameter_SCAR ident = CodeqlscarFactory.eINSTANCE.createParameter_SCAR();
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		ident.setMethodName(methodName);
		ident.setParameterName(parameterName);
		ident.setParameterType(type);
		return ident;
	}
	
	public static Field_SCAR createField(String fieldName, String type, String fullyQualifiedClassName) {
		Field_SCAR ident = CodeqlscarFactory.eINSTANCE.createField_SCAR();
		ident.setFieldName(fieldName);
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		ident.setType(type);
		return ident;
	}
	
	public static ResultEntryElement<Field_SCAR> createResultEntryElement(Field_SCAR systemElement, SecurityLevel_SCAR securityLevel){
		ResultEntryElement<Field_SCAR> resultEntryElement = CodeqlscarFactory.eINSTANCE.createResultEntryElement();
		resultEntryElement.setSystemElement(systemElement);
		resultEntryElement.setSecurityLevel(securityLevel);
		return resultEntryElement;
	}
	
	public static ResultEntryElement<Parameter_SCAR> createResultEntryElement(Parameter_SCAR systemElement, SecurityLevel_SCAR securityLevel){
		ResultEntryElement<Parameter_SCAR> resultEntryElement = CodeqlscarFactory.eINSTANCE.createResultEntryElement();
		resultEntryElement.setSystemElement(systemElement);
		resultEntryElement.setSecurityLevel(securityLevel);
		return resultEntryElement;
	}
	
	public static Result createResultEntry(RuleId ruleId, ResultEntryElement<?> source, ResultEntryElement<?> sink) {
		Result resultEntry = CodeqlscarFactory.eINSTANCE.createResult();
		resultEntry.setRuleId(ruleId);
		resultEntry.setSink(sink);
		resultEntry.setSource(source);
		return resultEntry;
	}
	
	public static SourceCodeAnalysisResult createSourceCodeAnalysisResult() {
		return CodeqlscarFactory.eINSTANCE.createSourceCodeAnalysisResult();
	}
}
