package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils;

import java.util.Collection;
import java.util.stream.Collectors;

import org.kit.kastel.sdq.coupling.models.java.types.Type;
import org.kit.kastel.sdq.coupling.models.java.types.Class;
import org.kit.kastel.sdq.coupling.models.java.types.CollectionType;
import org.kit.kastel.sdq.coupling.models.java.types.PrimitiveType;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;

public class JavaResolutionUtil {

	public static Collection<Class> filterClassesFromTypes(Collection<Type> types){
		return types.stream().filter(type -> type instanceof Class).map(type -> (Class)type).collect(Collectors.toList());
	}
	
	public static Collection<ParameterAnnotation> filterParameterAnnotations(Collection<SecurityLevelAnnotation> annotations){
		return annotations.stream().filter(annotation -> annotation instanceof ParameterAnnotation).map(annotation -> (ParameterAnnotation)annotation).collect(Collectors.toList());
	}
	
	public static Collection<CollectionType> filterCollectionType(Collection<Type> types){
		return types.stream().filter(type -> type instanceof CollectionType).map(type -> (CollectionType)type).collect(Collectors.toList());
	}
	
	public static Collection<PrimitiveType> filterPrimitiveTypes(Collection<Type> types){
		return types.stream().filter(type -> type instanceof PrimitiveType).map(type -> (PrimitiveType)type).collect(Collectors.toList());
	}
}
