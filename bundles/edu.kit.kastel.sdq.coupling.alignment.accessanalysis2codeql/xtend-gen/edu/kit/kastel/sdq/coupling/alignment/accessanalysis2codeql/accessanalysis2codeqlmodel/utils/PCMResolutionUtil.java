package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils;

import com.google.common.collect.Iterables;
import java.util.Collection;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.PrimitiveDataType;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

@SuppressWarnings("all")
public class PCMResolutionUtil {
  public static Collection<BasicComponent> filterBasicComponents(final Collection<RepositoryComponent> components) {
    return IterableExtensions.<BasicComponent>toList(Iterables.<BasicComponent>filter(components, BasicComponent.class));
  }

  public static Collection<OperationProvidedRole> filterOperationProvidedRoles(final Collection<ProvidedRole> roles) {
    return IterableExtensions.<OperationProvidedRole>toList(Iterables.<OperationProvidedRole>filter(roles, OperationProvidedRole.class));
  }

  public static Collection<OperationProvidedRole> getOperationProvidedRolesForComponent(final BasicComponent component) {
    return PCMResolutionUtil.filterOperationProvidedRoles(component.getProvidedRoles_InterfaceProvidingEntity());
  }

  public static Collection<CompositeDataType> filterCompositeDataTypes(final Collection<DataType> datatypes) {
    return IterableExtensions.<CompositeDataType>toList(Iterables.<CompositeDataType>filter(datatypes, CompositeDataType.class));
  }

  public static Collection<PrimitiveDataType> filterPrimitiveDataTypes(final Collection<DataType> datatypes) {
    return IterableExtensions.<PrimitiveDataType>toList(Iterables.<PrimitiveDataType>filter(datatypes, PrimitiveDataType.class));
  }

  public static Collection<CollectionDataType> filterCollectionDataTypes(final Collection<DataType> datatypes) {
    return IterableExtensions.<CollectionDataType>toList(Iterables.<CollectionDataType>filter(datatypes, CollectionDataType.class));
  }

  public static Collection<OperationInterface> filterOperationInterfaces(final Collection<Interface> interfaces) {
    return IterableExtensions.<OperationInterface>toList(Iterables.<OperationInterface>filter(interfaces, OperationInterface.class));
  }
}
