/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.provider;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationFactory;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.xtext.util.Strings;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterAnnotationItemProvider extends CharacteristicsAnnotationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterAnnotationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IdentifiedElement_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IdentifiedElement_id_feature",
								"_UI_IdentifiedElement_type"),
						IdentifierPackage.Literals.IDENTIFIED_ELEMENT__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ParameterannotationPackage.Literals.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ParameterAnnotation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParameterAnnotation"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ParameterAnnotation annotation = ((ParameterAnnotation) object);
		
		String annotatedInterfaceName = "";
		String annotatatedParameterName = "";
		String annotatedMethodName = "";
		String levels = "";
		
		if(annotation.getParameterIdentification() != null) {
			annotatedInterfaceName = annotation.getParameterIdentification().getParameter().getOperationSignature__Parameter().getInterface__OperationSignature().getEntityName();
			annotatatedParameterName = annotation.getParameterIdentification().getParameter().getParameterName();
			annotatedMethodName = annotation.getParameterIdentification().getParameter().getOperationSignature__Parameter().getEntityName();
		}
		
		if(!annotation.getCharacteristics().isEmpty()) {
			levels = Strings.concat(";", annotation.getCharacteristics().get(0).getValues().stream().map(lit -> lit.getName()).collect(Collectors.toList()));
		}
		
		String label = "%s::%s.%s : %s".formatted(annotatedInterfaceName, annotatedMethodName, annotatatedParameterName, levels);
		return label == null || label.length() == 0 ? getString("_UI_ParameterAnnotation_type")
				: getString("_UI_ParameterAnnotation_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ParameterAnnotation.class)) {
		case ParameterannotationPackage.PARAMETER_ANNOTATION__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ParameterannotationPackage.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(
				createChildParameter(ParameterannotationPackage.Literals.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION,
						ParameterannotationFactory.eINSTANCE.createGeneralOperationParameterIdentification()));

		newChildDescriptors.add(
				createChildParameter(ParameterannotationPackage.Literals.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION,
						ParameterannotationFactory.eINSTANCE.createProvidedOperationParameterIdentification()));
	}

}
