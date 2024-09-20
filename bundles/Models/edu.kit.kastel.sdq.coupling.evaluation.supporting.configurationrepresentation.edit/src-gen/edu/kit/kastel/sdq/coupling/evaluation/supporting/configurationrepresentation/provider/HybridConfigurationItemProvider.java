/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.provider;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationFactory;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HybridConfigurationItemProvider extends ConfigurationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addAdditionalInputsPropertyDescriptor(object);
			addMainConfigurationElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Additional Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HybridConfiguration_additionalInputs_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_HybridConfiguration_additionalInputs_feature", "_UI_HybridConfiguration_type"),
						ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Main Configuration Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainConfigurationElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HybridConfiguration_mainConfigurationElement_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HybridConfiguration_mainConfigurationElement_feature", "_UI_HybridConfiguration_type"),
				ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT, true,
				false, true, null, null, null));
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
			childrenFeatures.add(ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS);
			childrenFeatures
					.add(ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT);
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
	 * This returns HybridConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HybridConfiguration"));
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
		String label = ((HybridConfiguration) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_HybridConfiguration_type")
				: getString("_UI_HybridConfiguration_type") + " " + label;
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

		newChildDescriptors.add(createChildParameter(
				ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS,
				ConfigurationrepresentationFactory.eINSTANCE.createConfigurations()));

		newChildDescriptors.add(createChildParameter(
				ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS,
				ConfigurationrepresentationFactory.eINSTANCE.createHybridConfiguration()));

		newChildDescriptors.add(createChildParameter(
				ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS,
				ConfigurationrepresentationFactory.eINSTANCE.createFullyImplicitConfiguration()));

		newChildDescriptors.add(createChildParameter(
				ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS,
				ConfigurationrepresentationFactory.eINSTANCE.createSingleElementConfiguration()));

		newChildDescriptors.add(createChildParameter(
				ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT,
				ConfigurationrepresentationFactory.eINSTANCE.createConfigurations()));

		newChildDescriptors.add(createChildParameter(
				ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT,
				ConfigurationrepresentationFactory.eINSTANCE.createHybridConfiguration()));

		newChildDescriptors.add(createChildParameter(
				ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT,
				ConfigurationrepresentationFactory.eINSTANCE.createFullyImplicitConfiguration()));

		newChildDescriptors.add(createChildParameter(
				ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT,
				ConfigurationrepresentationFactory.eINSTANCE.createSingleElementConfiguration()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS
				|| childFeature == ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
