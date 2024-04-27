package edu.kit.kastel.sdq.coupling.models.joanascar.utils;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarFactory;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;

public class JOANASCARModelGenerationUtil {

	public static EntryPointIdentifying createEntryPointIdentifiying(String tag) {
		EntryPointIdentifying entryPoint = JoanascarFactory.eINSTANCE.createEntryPointIdentifying();
		entryPoint.setTag(tag);
		return entryPoint;
	}
	
	public static Level_SCAR createSecurityLevel(String name) {
		Level_SCAR level = JoanascarFactory.eINSTANCE.createLevel_SCAR();
		level.setName(name);
		return level;
	}
	
	public static ParameterIdentifying createParameterIdentification(int parameterIndex, String type, String methodName, String fullyQualifiedClassName) {
		ParameterIdentifying ident = JoanascarFactory.eINSTANCE.createParameterIdentifying();
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		ident.setMethodName(methodName);
		ident.setParameterIndex(parameterIndex);
		ident.setParameterType(type);
		return ident;
	}
	
	public static FieldIdentifying createFieldIdentification(String fieldName, String fullyQualifiedClassName) {
		FieldIdentifying ident = JoanascarFactory.eINSTANCE.createFieldIdentifying();
		ident.setFieldName(fieldName);
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		return ident;
	}
	
	public static ResultEntryElement<FieldIdentifying> createResultEntryElement(FieldIdentifying systemElement, Level_SCAR securityLevel){
		ResultEntryElement<FieldIdentifying> resultEntryElement = JoanascarFactory.eINSTANCE.createResultEntryElement();
		resultEntryElement.setSystemElement(systemElement);
		resultEntryElement.setLevel(securityLevel);
		return resultEntryElement;
	}
	
	public static ResultEntryElement<ParameterIdentifying> createResultEntryElement(ParameterIdentifying systemElement, Level_SCAR securityLevel){
		ResultEntryElement<ParameterIdentifying> resultEntryElement = JoanascarFactory.eINSTANCE.createResultEntryElement();
		resultEntryElement.setSystemElement(systemElement);
		resultEntryElement.setLevel(securityLevel);
		return resultEntryElement;
	}
	
	public static ResultEntry createResultEntry(EntryPointIdentifying entryPoint, ResultEntryElement<?> source, ResultEntryElement<?> sink) {
		ResultEntry resultEntry = JoanascarFactory.eINSTANCE.createResultEntry();
		resultEntry.setEntryPoint(entryPoint);
		resultEntry.setSink(sink);
		resultEntry.setSource(source);
		return resultEntry;
	}
	
	public static SourceCodeAnalysisResult createSourceCodeAnalysisResult() {
		return JoanascarFactory.eINSTANCE.createSourceCodeAnalysisResult();
	}
}
