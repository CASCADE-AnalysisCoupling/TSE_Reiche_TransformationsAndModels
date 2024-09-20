/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.provider;

import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage;

import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.provider.AccessanalysiscodeqlcorrespondenceEditPlugin;

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
 * This is the item provider adapter for a {@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSetSecurityLevelCorrespondenceItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetSecurityLevelCorrespondenceItemProvider(AdapterFactory adapterFactory) {
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

			addDataSetsPropertyDescriptor(object);
			addSecurityLevelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Sets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DataSetSecurityLevelCorrespondence_dataSets_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataSetSecurityLevelCorrespondence_dataSets_feature",
						"_UI_DataSetSecurityLevelCorrespondence_type"),
				AccessanalysiscodeqlcorrespondencePackage.Literals.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__DATA_SETS,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Security Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DataSetSecurityLevelCorrespondence_securityLevel_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DataSetSecurityLevelCorrespondence_securityLevel_feature",
						"_UI_DataSetSecurityLevelCorrespondence_type"),
				AccessanalysiscodeqlcorrespondencePackage.Literals.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL,
				true, false, true, null, null, null));
	}

	/**
	 * This returns DataSetSecurityLevelCorrespondence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataSetSecurityLevelCorrespondence"));
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
		return getString("_UI_DataSetSecurityLevelCorrespondence_type");
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
		return AccessanalysiscodeqlcorrespondenceEditPlugin.INSTANCE;
	}

}
