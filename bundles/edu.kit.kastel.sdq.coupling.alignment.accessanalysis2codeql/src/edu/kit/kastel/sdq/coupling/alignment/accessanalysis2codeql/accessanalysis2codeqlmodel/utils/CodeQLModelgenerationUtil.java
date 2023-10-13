package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils;


import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlFactory;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Class;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeFactory;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CollectionType;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Field;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Method;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Parameter;
import edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveType;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Type;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.DataFlowRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingFactory;

public class CodeQLModelgenerationUtil {

	public static Class generateClass() {
		return  CodeFactory.eINSTANCE.createClass();
	}
	
	public static Method generateMethod() {
		return CodeFactory.eINSTANCE.createMethod();
	}
	
	public static Parameter generateParameter() {
		return CodeFactory.eINSTANCE.createParameter();
	}
	
	public static PrimitiveType generatePrimitiveType() {
		return CodeFactory.eINSTANCE.createPrimitiveType();
	}
	
	public static Field generateField() {
		return CodeFactory.eINSTANCE.createField();
	}
	
	public static Class generateClass(String className) {
		Class clazz = generateClass();
		clazz.setName(className);
		return clazz;
	}
	
	public static Method generateMethod(String methodName) {
		Method method = generateMethod();
		method.setName(methodName);
		return method;
	}
	
	public static Parameter generateParameter(String parameterName) {
		Parameter param = generateParameter();
		param.setName(parameterName);
		return param;
	}
	
	public static Field generateField(String fieldName) {
		Field field = generateField();
		field.setName(fieldName);
		return field;
	}
	
	public static SecurityLevel generateSecurityLevel(String name) {
		SecurityLevel level = TainttrackingFactory.eINSTANCE.createSecurityLevel();
		level.setName(name);
		return level;
	}
	
	public static AllowedFlow generateAllowedFlow(SecurityLevel from, SecurityLevel to) {
		AllowedFlow flow = TainttrackingFactory.eINSTANCE.createAllowedFlow();
		flow.setFrom(from);
		flow.setTo(to);
		
		return flow;
	}
	
	public static ParameterAnnotation generateParameterAnnotation(Parameter parameter, SecurityLevel securityLevel) {
		ParameterAnnotation annotation = TainttrackingFactory.eINSTANCE.createParameterAnnotation();
		annotation.setParameter(parameter);
		annotation.setSecurityLevel(securityLevel);
		return annotation;
	}
	
	public static Configuration generateConfiguration() {
		return TainttrackingFactory.eINSTANCE.createConfiguration();
	}
	
	public static CodeRoot generateCodeRoot() {
		return CodeFactory.eINSTANCE.createCodeRoot();
	}
	
	public static CollectionType generateCollectionType(Type type) {
		CollectionType colType = CodeFactory.eINSTANCE.createCollectionType();
		colType.setType(type);
		colType.setName(String.format("Collection<<%s>>", type.getName()));
		return colType;
	}
	
	public static DataFlowRoot generateDataFlowRoot() {
		return TainttrackingFactory.eINSTANCE.createDataFlowRoot();
	}
	
	public static CodeQLRoot generateCodeQLRoot() {
		return CodeqlFactory.eINSTANCE.createCodeQLRoot();
	}
}
