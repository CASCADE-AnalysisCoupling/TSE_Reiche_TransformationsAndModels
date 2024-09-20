/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.provider;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Parameter_ResolvedImplementationValuesItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_ResolvedImplementationValuesItemProvider(AdapterFactory adapterFactory) {
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

			addParameterNamePropertyDescriptor(object);
			addParameterTypePropertyDescriptor(object);
			addMethodNamePropertyDescriptor(object);
			addFullyQualifiedClassNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parameter Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Parameter_ResolvedImplementationValues_ParameterName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Parameter_ResolvedImplementationValues_ParameterName_feature",
						"_UI_Parameter_ResolvedImplementationValues_type"),
				CodeqlresultingvaluesPackage.Literals.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Parameter Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Parameter_ResolvedImplementationValues_parameterType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Parameter_ResolvedImplementationValues_parameterType_feature",
						"_UI_Parameter_ResolvedImplementationValues_type"),
				CodeqlresultingvaluesPackage.Literals.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Method Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Parameter_ResolvedImplementationValues_methodName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Parameter_ResolvedImplementationValues_methodName_feature",
						"_UI_Parameter_ResolvedImplementationValues_type"),
				CodeqlresultingvaluesPackage.Literals.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fully Qualified Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFullyQualifiedClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Parameter_ResolvedImplementationValues_fullyQualifiedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Parameter_ResolvedImplementationValues_fullyQualifiedClassName_feature",
						"_UI_Parameter_ResolvedImplementationValues_type"),
				CodeqlresultingvaluesPackage.Literals.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Parameter_ResolvedImplementationValues.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Parameter_ResolvedImplementationValues"));
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
		String label = ((Parameter_ResolvedImplementationValues) object).getParameterName();
		return label == null || label.length() == 0 ? getString("_UI_Parameter_ResolvedImplementationValues_type")
				: getString("_UI_Parameter_ResolvedImplementationValues_type") + " " + label;
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

		switch (notification.getFeatureID(Parameter_ResolvedImplementationValues.class)) {
		case CodeqlresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_NAME:
		case CodeqlresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE:
		case CodeqlresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME:
		case CodeqlresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CodeqlresultingvaluesEditPlugin.INSTANCE;
	}

}
