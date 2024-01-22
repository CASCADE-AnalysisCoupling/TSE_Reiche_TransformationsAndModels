package edu.kit.kastel.sdq.coupling.models.java.supporting.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import edu.kit.kastel.sdq.coupling.models.java.types.CollectionType;
import edu.kit.kastel.sdq.coupling.models.java.types.PrimitiveType;
import edu.kit.kastel.sdq.coupling.models.java.types.PrimitiveTypeKinds;
import edu.kit.kastel.sdq.coupling.models.java.types.Type;
import edu.kit.kastel.sdq.coupling.models.java.types.Class;

public class JavaResolutionUtil {

	public static Collection<Class> filterClassesFromTypes(Collection<Type> types){
		return types.stream().filter(type -> type instanceof Class).map(type -> (Class)type).collect(Collectors.toList());
	}
	

	public static Collection<Class> filterClassesFromClassOrInterfaceTypes(Collection<ClassOrInterfaceType> types){
		return types.stream().filter(type -> type instanceof Class).map(type -> (Class)type).collect(Collectors.toList());
	}
	
	public static Collection<CollectionType> filterCollectionType(Collection<Type> types){
		return types.stream().filter(type -> type instanceof CollectionType).map(type -> (CollectionType)type).collect(Collectors.toList());
	}
	
	public static Collection<PrimitiveType> filterPrimitiveTypes(Collection<Type> types){
		return types.stream().filter(type -> type instanceof PrimitiveType).map(type -> (PrimitiveType)type).collect(Collectors.toList());
	}
	
	private static Collection<ClassOrInterfaceType> getAllClassOrInterfaceTypes(Package pkg, Set<ClassOrInterfaceType> currentCollection){
		currentCollection.addAll(pkg.getClassorinterface());
		
		for(Package subpkg : pkg.getSubpackage()){
			currentCollection.addAll(getAllClassOrInterfaceTypes(subpkg, currentCollection));
		}
		
		return currentCollection;
	} 
	
	public static Method getMethodOfClassByName(Class clazz, String methodName) {
		return clazz.getMethod().stream().filter(method -> method.getName().equals(methodName)).findFirst().get();
	}
	
	public static Method getMethodContainingParameter(JavaRoot root, Parameter p){
		Set<ClassOrInterfaceType> types = new HashSet<ClassOrInterfaceType>();
		getAllClassOrInterfaceTypes(root.getPackage(), types);
		Collection<Class> classes = JavaResolutionUtil.filterClassesFromClassOrInterfaceTypes(types);
		
		for (Class clazz : classes) {
			var method = getMethodContainingParameter(clazz.getMethod(), p);
			if(method != null){
				return method; 
			}
		}
		
		return null;
	}
	
//	private static Collection<Method> gatherMethods(Collection<ClassOrInterfaceType> types){
//		return types.stream().map(coi -> coi.getMethod()).flatMap(List::Stream).collect(Collectors.toList());
//	}
	
	private static Method getMethodContainingParameter(Collection<Method> methods, Parameter toSearch){
		return methods.stream().filter(method-> method.getParameter().contains(toSearch)).findFirst().orElse(null);
	}
	
	public static Collection<ClassOrInterfaceType> getAllClassOrInterfaceTypes(JavaRoot root){
		Set<ClassOrInterfaceType> classOrInterfaceTypes = new HashSet<ClassOrInterfaceType>();
		return getAllClassOrInterfaceTypes(root.getPackage(), classOrInterfaceTypes);
	}
	
	public static List<Package> getPackagePathToClassOrInterface(JavaRoot root, ClassOrInterfaceType searchedClassOrInterface){
		List<Package> packagePath = new ArrayList<Package>();
		
		getPackagePathToClassOrInterfaceRecursive(packagePath, searchedClassOrInterface, root.getPackage());
	
		
		Collections.reverse(packagePath);
		
	
		return packagePath;
	}
	
	private static void getPackagePathToClassOrInterfaceRecursive(Collection<Package> currentPackages, ClassOrInterfaceType searchedClassOrInterface, Package currentPackage) {
		
		for(ClassOrInterfaceType classOrInterface : currentPackage.getClassorinterface()) {
			if(classOrInterface.equals(searchedClassOrInterface)) {
				currentPackages.add(currentPackage);
				return;
			}
		}
		
		for(Package subPackage : currentPackage.getSubpackage()) {
			int sizeBefore = currentPackages.size();
			getPackagePathToClassOrInterfaceRecursive(currentPackages, searchedClassOrInterface, subPackage);
			int sizeAfter = currentPackages.size();
			
			if(sizeBefore != sizeAfter) {
				currentPackages.add(currentPackage);
				return;
			}
		}
	}
	
	
	public static String createFullyQualifiedPath(Collection<Package> packagePath, ClassOrInterfaceType typeOrInterface){
		String packageQualifier = creatyFullPackagePathFromParts(packagePath);
		
		return String.format("%s.%s", packageQualifier, typeOrInterface.getName());
	}
	
	public static String creatyFullPackagePathFromParts(Collection<Package> packagePath) {
		return packagePath.stream().map(Package::getName).collect(Collectors.joining("."));
	}
	
	public static String createFullyQualifiedPath(JavaRoot root, ClassOrInterfaceType typeOrInterface) {
		return createFullyQualifiedPath(getPackagePathToClassOrInterface(root, typeOrInterface), typeOrInterface);
	}
	
	//Should be all reference types, but do not mind here
	public static Collection<Type> getAllNonPrimitiveTypes(ClassOrInterfaceType coi){
		Collection<Type> types = new HashSet<Type>();
		
		for(Method method : coi.getMethod()) {
			if(!isPrimitiveType(method.getReturntype())){
				types.add(method.getReturntype());
			}
			
			types.addAll(method.getParameter().stream().filter(param -> !isPrimitiveType(param.getType())).map(param -> param.getType()).collect(Collectors.toList()));
		}
		
		
		
		if(coi instanceof Class) {
			Class clazz = (Class) coi;
			
			types.addAll(clazz.getField().stream().filter(field -> !isPrimitiveType(field.getType())).map(field -> field.getType()).collect(Collectors.toList()));	
			types.addAll(clazz.getImplements());
		}
		
		List<CollectionType> collectionTypes = types.stream().filter(type -> type instanceof CollectionType).map(type -> (CollectionType) type).collect(Collectors.toList());
		collectionTypes.stream().forEach(colType -> {types.add(colType.getType());});
		
		
		return types;
	}
	
	private static boolean isPrimitiveType(Type type) {
		return type instanceof PrimitiveType;
	}
	
	public static String translatePrimitiveTypeKindToJavaTypeName(PrimitiveTypeKinds primitiveTypeKind) {
		String javaTypeName = "";
		switch (primitiveTypeKind.getName()) {
		case "BOOLEAN":
			javaTypeName = "boolean";
			break;
		case "BYTE":
			javaTypeName = "int";
			break;
		case "SHORT":
			javaTypeName = "short";
			break;
		case "INT":
			javaTypeName = "int";
			break;
		case "LONG":
			javaTypeName = "long";
			break;
		case "CHAR":
			javaTypeName = "char";
			break;
		case "FLOAT":
			javaTypeName = "float";
			break;
		case "DOUBLE":
			javaTypeName = "double";
			break;
		case "STRING":
			javaTypeName = "String";
			break;
		default:
			break;
		}
		
		return javaTypeName;
	}


	public static Class getClassForParameter(JavaRoot root, Parameter parameter) {
	  	Method method = getMethodContainingParameter(root, parameter);
	  	Collection<Class> allClasses = filterClassesFromClassOrInterfaceTypes(getAllClassOrInterfaceTypes(root));
	  	
	  	return allClasses.stream().filter(clazz -> clazz.getMethod().contains(method)).findFirst().get();
	}
	
	public static Type getTypeByName(JavaRoot javaRoot, String typeName) {
		
		return collectAllTypes(javaRoot).stream().filter(type -> type.getName().equals(typeName)).findFirst().get();
		
	}
	
	private static Collection<Type> collectAllTypes(JavaRoot javaRoot){
		Collection<Type> allTypes = new HashSet<Type>();
		allTypes.addAll(javaRoot.getPrimitivetypes());
		allTypes.addAll(javaRoot.getCollectiontypes());
		allTypes.addAll(getAllClassOrInterfaceTypes(javaRoot));
		
		return allTypes;
	}
	
	public static Field getFieldOfClassByName(String fieldName, Class clazz) {
		return clazz.getField().stream().filter(field -> field.getName().equals(fieldName)).findAny().get();
	}
	
	public static Class findClassRecursive(String className, Queue<String> pathComponents, JavaRoot javaRoot) {
		
		
		String javaRootPackageName = javaRoot.getPackage().getName();
		String[] javaRootPackageParts = javaRootPackageName.split("\\.");
		
		//Tests if rootPackage in java model is same as provided by CodeQL
		//Allows the definition of a basepackage in the model which is actually not the root
		for(int i = 0; i < javaRootPackageParts.length; i++) {
			if(!javaRootPackageParts[i].equals(pathComponents.remove())) {
				return null;
			}
		}
		
		return findClassRecursive(javaRoot.getPackage(), className, pathComponents);
	}
	
	private static Class findClassRecursive(Package currentPackage, String className, Queue<String> pathComponents) {
		
		Class clazz = null;
		
		for(ClassOrInterfaceType coit : currentPackage.getClassorinterface()) {
			if(coit instanceof Class && coit.getName().equals(className) && pathComponents.isEmpty()) {
				return (Class)coit;
			}
		}
		
		String nextSubpackageName = pathComponents.remove();
		
		for(Package subPackage : currentPackage.getSubpackage()) {
			
			if(subPackage.getName().equals(nextSubpackageName)) {
				clazz = findClassRecursive(subPackage, className, pathComponents);
				if(clazz != null) {
					return clazz;
				}
			}
		}
		
		return clazz;
	}
	
	public static Class findClassByFullyQualifiedPath(String fullyQualifiedClassPath, JavaRoot javaRoot){
		String[] pathToClassSplit = fullyQualifiedClassPath.split("\\.");
		int classNameLoc = pathToClassSplit.length -  1;
		Queue<String> pathComponents = new LinkedList<String>();
		for(int i = 0; i < pathToClassSplit.length - 1; i++) {
			pathComponents.add(pathToClassSplit[i]);
		}
		return JavaResolutionUtil.findClassRecursive(pathToClassSplit[classNameLoc], pathComponents, javaRoot);
		
	}
	
	public static Parameter resolveParameterWithTypeForClass(Class clazz, String methodName, String parameterName, String parameterType) {
		for(Method method : clazz.getMethod()) {
			if(method.getName().equals(methodName)) {
				for(Parameter param : method.getParameter()) {
					if(param.getName().equals(parameterName) && param.getType().getName().equals(parameterType)) {
						return param;
					}
				}
		
			}
		} 
		
		return null;
	}
	
	public static Method resolveMethodFromClassByName(Class clazz, String methodName) {
		return clazz.getMethod().stream().filter(method -> method.getName().equals(methodName)).findFirst().get();
	}

}
