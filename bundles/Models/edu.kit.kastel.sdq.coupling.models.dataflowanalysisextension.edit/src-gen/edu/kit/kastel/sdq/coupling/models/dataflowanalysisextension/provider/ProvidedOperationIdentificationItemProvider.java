/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.provider;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification;

import edu.kit.kastel.sdq.coupling.models.identifier.provider.IdentifiedElementItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProvidedOperationIdentificationItemProvider extends IdentifiedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedOperationIdentificationItemProvider(AdapterFactory adapterFactory) {
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

			addProvidedRolePropertyDescriptor(object);
			addOperationSignaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Provided Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ProvidedOperationIdentification_providedRole_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ProvidedOperationIdentification_providedRole_feature",
								"_UI_ProvidedOperationIdentification_type"),
						DataflowanalysisextensionPackage.Literals.PROVIDED_OPERATION_IDENTIFICATION__PROVIDED_ROLE,
						true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Operation Signature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationSignaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ProvidedOperationIdentification_operationSignature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ProvidedOperationIdentification_operationSignature_feature",
						"_UI_ProvidedOperationIdentification_type"),
				DataflowanalysisextensionPackage.Literals.PROVIDED_OPERATION_IDENTIFICATION__OPERATION_SIGNATURE, true,
				false, true, null, null, null));
	}

	/**
	 * This returns ProvidedOperationIdentification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProvidedOperationIdentification"));
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
		String label = ((ProvidedOperationIdentification) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_ProvidedOperationIdentification_type")
				: getString("_UI_ProvidedOperationIdentification_type") + " " + label;
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DataflowanalysisextensionEditPlugin.INSTANCE;
	}

}
