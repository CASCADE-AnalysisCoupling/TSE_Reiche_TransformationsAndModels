package edu.kit.kastel.sdq.coupling.alignment.pcm2java.utils;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;

import java.util.Collection;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.PrimitiveDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.Interface;

public class PCMResolutionUtil {
	public static Collection<BasicComponent> filterBasicComponents(Collection<RepositoryComponent> components){
		return components.stream().filter(BasicComponent.class::isInstance).map(BasicComponent.class::cast).collect(Collectors.toList());
	}
	
	public static Collection<OperationProvidedRole> filterOperationProvidedRoles(Collection<ProvidedRole> roles){
		return roles.stream().filter(OperationProvidedRole.class::isInstance).map(OperationProvidedRole.class::cast).collect(Collectors.toList());
	}
	
	public static Collection<OperationProvidedRole> getOperationProvidedRolesForComponent(BasicComponent component){
		return filterOperationProvidedRoles(component.getProvidedRoles_InterfaceProvidingEntity());
	}
	
	public static Collection<CompositeDataType> filterCompositeDataTypes(Collection<DataType> datatypes){
		return datatypes.stream().filter(CompositeDataType.class::isInstance).map(CompositeDataType.class::cast).collect(Collectors.toList());
	}
	
	public static Collection<PrimitiveDataType> filterPrimitiveDataTypes(Collection<DataType> datatypes){
		return datatypes.stream().filter(PrimitiveDataType.class::isInstance).map(PrimitiveDataType.class::cast).collect(Collectors.toList());
	}
	
	public static Collection<CollectionDataType> filterCollectionDataTypes(Collection<DataType> datatypes){
		return datatypes.stream().filter(CollectionDataType.class::isInstance).map(CollectionDataType.class::cast).collect(Collectors.toList());
	}
	
	public static Collection<OperationInterface> filterOperationInterfaces(Collection<Interface> interfaces){
		return interfaces.stream().filter(OperationInterface.class::isInstance).map(OperationInterface.class::cast).collect(Collectors.toList());
	}
	
	public static Collection<OperationRequiredRole> filterOperationRequiredRoles(Collection<RequiredRole> roles){
		return roles.stream().filter(OperationRequiredRole.class::isInstance).map(OperationRequiredRole.class::cast).collect(Collectors.toList());
	}
	
	public static Collection<OperationRequiredRole> filterOperationRequiredRoles(RepositoryComponent component){
		return filterOperationRequiredRoles(component.getRequiredRoles_InterfaceRequiringEntity());
	}
}
