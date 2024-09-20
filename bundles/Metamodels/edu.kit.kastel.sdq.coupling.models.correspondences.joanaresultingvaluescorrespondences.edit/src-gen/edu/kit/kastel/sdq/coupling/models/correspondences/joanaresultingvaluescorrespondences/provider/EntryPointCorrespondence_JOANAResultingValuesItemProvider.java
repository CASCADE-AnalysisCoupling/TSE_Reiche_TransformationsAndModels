/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.provider;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryPointCorrespondence_JOANAResultingValuesItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointCorrespondence_JOANAResultingValuesItemProvider(AdapterFactory adapterFactory) {
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

			addEntryPoint_SCARPropertyDescriptor(object);
			addEntryPoint_ResolvedImplementationValuesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Entry Point SCAR feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntryPoint_SCARPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EntryPointCorrespondence_JOANAResultingValues_entryPoint_SCAR_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EntryPointCorrespondence_JOANAResultingValues_entryPoint_SCAR_feature",
						"_UI_EntryPointCorrespondence_JOANAResultingValues_type"),
				JoanaresultingvaluescorrespondencesPackage.Literals.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_SCAR,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Entry Point Resolved Implementation Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntryPoint_ResolvedImplementationValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_EntryPointCorrespondence_JOANAResultingValues_entryPoint_ResolvedImplementationValues_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EntryPointCorrespondence_JOANAResultingValues_entryPoint_ResolvedImplementationValues_feature",
						"_UI_EntryPointCorrespondence_JOANAResultingValues_type"),
				JoanaresultingvaluescorrespondencesPackage.Literals.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES,
				true, false, true, null, null, null));
	}

	/**
	 * This returns EntryPointCorrespondence_JOANAResultingValues.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/EntryPointCorrespondence_JOANAResultingValues"));
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
		return getString("_UI_EntryPointCorrespondence_JOANAResultingValues_type");
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
		return JoanaresultingvaluescorrespondencesEditPlugin.INSTANCE;
	}

}
