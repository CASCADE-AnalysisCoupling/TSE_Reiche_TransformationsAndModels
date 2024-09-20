/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.provider;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Correspondences_CodeQLScarItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correspondences_CodeQLScarItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(
					CodeqlscarcorrespondencesPackage.Literals.CORRESPONDENCES_CODE_QL_SCAR__SYSTEM_ELEMENT_CORRESPONDENCES);
			childrenFeatures.add(
					CodeqlscarcorrespondencesPackage.Literals.CORRESPONDENCES_CODE_QL_SCAR__SECURITY_LEVEL_CORRESPONDENCES);
			childrenFeatures.add(
					CodeqlscarcorrespondencesPackage.Literals.CORRESPONDENCES_CODE_QL_SCAR__CONFIGURATION_CORRESPONDENCES);
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
	 * This returns Correspondences_CodeQLScar.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Correspondences_CodeQLScar"));
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
		return getString("_UI_Correspondences_CodeQLScar_type");
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

		switch (notification.getFeatureID(Correspondences_CodeQLScar.class)) {
		case CodeqlscarcorrespondencesPackage.CORRESPONDENCES_CODE_QL_SCAR__SYSTEM_ELEMENT_CORRESPONDENCES:
		case CodeqlscarcorrespondencesPackage.CORRESPONDENCES_CODE_QL_SCAR__SECURITY_LEVEL_CORRESPONDENCES:
		case CodeqlscarcorrespondencesPackage.CORRESPONDENCES_CODE_QL_SCAR__CONFIGURATION_CORRESPONDENCES:
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

		newChildDescriptors.add(createChildParameter(
				CodeqlscarcorrespondencesPackage.Literals.CORRESPONDENCES_CODE_QL_SCAR__SYSTEM_ELEMENT_CORRESPONDENCES,
				CodeqlscarcorrespondencesFactory.eINSTANCE.createParameterCorrespondence()));

		newChildDescriptors.add(createChildParameter(
				CodeqlscarcorrespondencesPackage.Literals.CORRESPONDENCES_CODE_QL_SCAR__SYSTEM_ELEMENT_CORRESPONDENCES,
				CodeqlscarcorrespondencesFactory.eINSTANCE.createFieldCorrespondence()));

		newChildDescriptors.add(createChildParameter(
				CodeqlscarcorrespondencesPackage.Literals.CORRESPONDENCES_CODE_QL_SCAR__SECURITY_LEVEL_CORRESPONDENCES,
				CodeqlscarcorrespondencesFactory.eINSTANCE.createSecurityLevelCorrespondence()));

		newChildDescriptors.add(createChildParameter(
				CodeqlscarcorrespondencesPackage.Literals.CORRESPONDENCES_CODE_QL_SCAR__CONFIGURATION_CORRESPONDENCES,
				CodeqlscarcorrespondencesFactory.eINSTANCE.createConfigurationCorrespondence()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CodeqlscarcorrespondencesEditPlugin.INSTANCE;
	}

}
