package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils;

import org.kit.kastel.sdq.coupling.models.java.JavaFactory;
import org.kit.kastel.sdq.coupling.models.java.JavaRoot;
import org.kit.kastel.sdq.coupling.models.java.Package;
import org.kit.kastel.sdq.coupling.models.java.members.Field;
import org.kit.kastel.sdq.coupling.models.java.members.MembersFactory;
import org.kit.kastel.sdq.coupling.models.java.members.Method;
import org.kit.kastel.sdq.coupling.models.java.members.Parameter;
import org.kit.kastel.sdq.coupling.models.java.types.TypesFactory;
import org.kit.kastel.sdq.coupling.models.java.types.Class;
import org.kit.kastel.sdq.coupling.models.java.types.CollectionType;
import org.kit.kastel.sdq.coupling.models.java.types.PrimitiveType;
import org.kit.kastel.sdq.coupling.models.java.types.PrimitiveTypeKinds;
import org.kit.kastel.sdq.coupling.models.java.types.Type;

public class JavaModelGenerationUtil {
	
	public static JavaRoot generateJavaRoot() {
		return JavaFactory.eINSTANCE.createJavaRoot();
	}
	
	public static Class generateClass() {
		return  TypesFactory.eINSTANCE.createClass();
	}
	
	public static Method generateMethod() {
		return MembersFactory.eINSTANCE.createMethod();
	}
	
	public static Parameter generateParameter() {
		return MembersFactory.eINSTANCE.createParameter();
	}
	
	public static PrimitiveType generatePrimitiveType() {
		return TypesFactory.eINSTANCE.createPrimitiveType();
	}
	
	public static Field generateField() {
		return MembersFactory.eINSTANCE.createField();
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
	
	public static PrimitiveType generatePrimitiveType(String typeName, PrimitiveTypeKinds kind) {
		PrimitiveType type = TypesFactory.eINSTANCE.createPrimitiveType();
		type.setKind(kind);
		type.setName(typeName);
		return type;
	}
	
	public static Package generatePackage(String packageName) {
		Package pkg = JavaFactory.eINSTANCE.createPackage();
		pkg.setName(packageName);
		return pkg;
	}
	
	public static CollectionType generateCollectionType(Type type) {
		CollectionType colType = TypesFactory.eINSTANCE.createCollectionType();
		colType.setType(type);
		type.setName(String.format("Collection<<%s>>", type.getName()));
		return colType;
	}
	
}
