/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.HybridConfigurationImpl#getAdditionalInputs <em>Additional Inputs</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.HybridConfigurationImpl#getMainConfigurationElement <em>Main Configuration Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HybridConfigurationImpl extends ConfigurationImpl implements HybridConfiguration {
	/**
	 * The cached value of the '{@link #getAdditionalInputs() <em>Additional Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> additionalInputs;

	/**
	 * The cached value of the '{@link #getMainConfigurationElement() <em>Main Configuration Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainConfigurationElement()
	 * @generated
	 * @ordered
	 */
	protected EObject mainConfigurationElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationrepresentationPackage.Literals.HYBRID_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAdditionalInputs() {
		if (additionalInputs == null) {
			additionalInputs = new EObjectResolvingEList<EObject>(EObject.class, this,
					ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS);
		}
		return additionalInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMainConfigurationElement() {
		if (mainConfigurationElement != null && mainConfigurationElement.eIsProxy()) {
			InternalEObject oldMainConfigurationElement = (InternalEObject) mainConfigurationElement;
			mainConfigurationElement = eResolveProxy(oldMainConfigurationElement);
			if (mainConfigurationElement != oldMainConfigurationElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT,
							oldMainConfigurationElement, mainConfigurationElement));
			}
		}
		return mainConfigurationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetMainConfigurationElement() {
		return mainConfigurationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainConfigurationElement(EObject newMainConfigurationElement) {
		EObject oldMainConfigurationElement = mainConfigurationElement;
		mainConfigurationElement = newMainConfigurationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT,
					oldMainConfigurationElement, mainConfigurationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS:
			return getAdditionalInputs();
		case ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT:
			if (resolve)
				return getMainConfigurationElement();
			return basicGetMainConfigurationElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS:
			getAdditionalInputs().clear();
			getAdditionalInputs().addAll((Collection<? extends EObject>) newValue);
			return;
		case ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT:
			setMainConfigurationElement((EObject) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS:
			getAdditionalInputs().clear();
			return;
		case ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT:
			setMainConfigurationElement((EObject) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__ADDITIONAL_INPUTS:
			return additionalInputs != null && !additionalInputs.isEmpty();
		case ConfigurationrepresentationPackage.HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT:
			return mainConfigurationElement != null;
		}
		return super.eIsSet(featureID);
	}

} //HybridConfigurationImpl
