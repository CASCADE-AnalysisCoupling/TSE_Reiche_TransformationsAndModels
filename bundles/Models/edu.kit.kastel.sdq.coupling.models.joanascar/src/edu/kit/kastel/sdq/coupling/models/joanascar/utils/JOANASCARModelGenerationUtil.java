package edu.kit.kastel.sdq.coupling.models.joanascar.utils;

import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarFactory;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Sink;
import edu.kit.kastel.sdq.coupling.models.joanascar.Source;
import edu.kit.kastel.sdq.coupling.models.joanascar.Field_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Flow;
import edu.kit.kastel.sdq.coupling.models.joanascar.SystemElement_SCAR;

public class JOANASCARModelGenerationUtil {

	public static EntryPoint_SCAR createEntryPointIdentifiying(String tag) {
		EntryPoint_SCAR entryPoint = JoanascarFactory.eINSTANCE.createEntryPoint_SCAR();
		entryPoint.setTag(tag);
		return entryPoint;
	}
	
	public static Level_SCAR createSecurityLevel(String name) {
		Level_SCAR level = JoanascarFactory.eINSTANCE.createLevel_SCAR();
		level.setName(name);
		return level;
	}
	
	public static Parameter_SCAR createParameterIdentification(int parameterIndex, String type, String methodName, String fullyQualifiedClassName) {
		Parameter_SCAR ident = JoanascarFactory.eINSTANCE.createParameter_SCAR();
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		ident.setMethodName(methodName);
		ident.setParameterIndex(parameterIndex);
		ident.setParameterType(type);
		return ident;
	}
	
	public static Field_SCAR createFieldIdentification(String fieldName, String fullyQualifiedClassName) {
		Field_SCAR ident = JoanascarFactory.eINSTANCE.createField_SCAR();
		ident.setFieldName(fieldName);
		ident.setFullyQualifiedClassName(fullyQualifiedClassName);
		return ident;
	}
	
	public static Source<Field_SCAR> createSource(Field_SCAR systemElement, Level_SCAR securityLevel){
		Source<Field_SCAR> source = JoanascarFactory.eINSTANCE.createSource();
		source.setSystemElement(systemElement);
		source.setSourceLevel(securityLevel);
		return source;
	}
	
	public static Source<Parameter_SCAR> createSource(Parameter_SCAR systemElement, Level_SCAR securityLevel){
		Source<Parameter_SCAR> source = JoanascarFactory.eINSTANCE.createSource();
		source.setSystemElement(systemElement);
		source.setSourceLevel(securityLevel);
		return source;
	}
	
	public static Sink<Field_SCAR> createSink(Field_SCAR systemElement, Level_SCAR securityLevel){
		Sink<Field_SCAR> sink = JoanascarFactory.eINSTANCE.createSink();
		sink.setSystemElement(systemElement);
		sink.setSinkLevel(securityLevel);
		return sink;
	}
	
	public static Sink<Parameter_SCAR> createSink(Parameter_SCAR systemElement, Level_SCAR securityLevel){
		Sink<Parameter_SCAR> sink = JoanascarFactory.eINSTANCE.createSink();
		sink.setSystemElement(systemElement);
		sink.setSinkLevel(securityLevel);
		return sink;
	}
	
	public static Flow createResultEntry(EntryPoint_SCAR entryPoint, Source<?> source, Sink<?> sink) {
		Flow resultEntry = JoanascarFactory.eINSTANCE.createFlow();
		resultEntry.setEntryPoint(entryPoint);
		resultEntry.setSink(sink);
		resultEntry.setSource(source);
		return resultEntry;
	}
	
	public static SourceCodeAnalysisResult createSourceCodeAnalysisResult() {
		return JoanascarFactory.eINSTANCE.createSourceCodeAnalysisResult();
	}
}
