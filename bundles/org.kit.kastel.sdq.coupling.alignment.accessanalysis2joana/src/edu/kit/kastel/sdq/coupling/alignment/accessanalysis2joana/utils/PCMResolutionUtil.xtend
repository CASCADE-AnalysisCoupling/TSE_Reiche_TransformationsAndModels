package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils

import org.palladiosimulator.pcm.repository.BasicComponent
import org.palladiosimulator.pcm.repository.RepositoryComponent
import java.util.Collection
import org.palladiosimulator.pcm.repository.OperationProvidedRole
import org.palladiosimulator.pcm.repository.ProvidedRole
import org.palladiosimulator.pcm.repository.CompositeDataType
import org.palladiosimulator.pcm.repository.PrimitiveDataType
import org.palladiosimulator.pcm.repository.DataType
import org.palladiosimulator.pcm.repository.CollectionDataType
import org.palladiosimulator.pcm.repository.OperationInterface
import org.palladiosimulator.pcm.repository.Interface

class PCMResolutionUtil {
	static def Collection<BasicComponent> filterBasicComponents(Collection<RepositoryComponent> components){
		return components.filter(BasicComponent).toList;
	}
	
	static def Collection<OperationProvidedRole> filterOperationProvidedRoles(Collection<ProvidedRole> roles){
		return roles.filter(OperationProvidedRole).toList;
	}
	
	static def Collection<OperationProvidedRole> getOperationProvidedRolesForComponent(BasicComponent component){
		return filterOperationProvidedRoles(component.providedRoles_InterfaceProvidingEntity)
	}
	
	static def Collection<CompositeDataType> filterCompositeDataTypes(Collection<DataType> datatypes){
		return datatypes.filter(CompositeDataType).toList;
	}
	
	static def Collection<PrimitiveDataType> filterPrimitiveDataTypes(Collection<DataType> datatypes){
		return datatypes.filter(PrimitiveDataType).toList;
	}
	
	static def Collection<CollectionDataType> filterCollectionDataTypes(Collection<DataType> datatypes){
		return datatypes.filter(CollectionDataType).toList;
	}
	
	static def Collection<OperationInterface> filterOperationInterfaces(Collection<Interface> interfaces){
		return interfaces.filter(OperationInterface).toList;	
	}
}
