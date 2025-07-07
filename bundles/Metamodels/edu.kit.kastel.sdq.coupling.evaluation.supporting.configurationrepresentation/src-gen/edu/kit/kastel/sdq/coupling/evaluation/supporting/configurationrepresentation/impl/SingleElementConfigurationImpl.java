/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.SingleElementConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.SingleElementConfigurationImpl#getConfigurationElement <em>Configuration Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleElementConfigurationImpl extends ConfigurationImpl implements SingleElementConfiguration {
	/**
	 * The cached value of the '{@link #getConfigurationElement() <em>Configuration Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationElement()
	 * @generated
	 * @ordered
	 */
	protected EObject configurationElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleElementConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationrepresentationPackage.Literals.SINGLE_ELEMENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getConfigurationElement() {
		if (configurationElement != null && configurationElement.eIsProxy()) {
			InternalEObject oldConfigurationElement = (InternalEObject) configurationElement;
			configurationElement = eResolveProxy(oldConfigurationElement);
			if (configurationElement != oldConfigurationElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationrepresentationPackage.SINGLE_ELEMENT_CONFIGURATION__CONFIGURATION_ELEMENT,
							oldConfigurationElement, configurationElement));
			}
		}
		return configurationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetConfigurationElement() {
		return configurationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationElement(EObject newConfigurationElement) {
		EObject oldConfigurationElement = configurationElement;
		configurationElement = newConfigurationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationrepresentationPackage.SINGLE_ELEMENT_CONFIGURATION__CONFIGURATION_ELEMENT,
					oldConfigurationElement, configurationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationrepresentationPackage.SINGLE_ELEMENT_CONFIGURATION__CONFIGURATION_ELEMENT:
			if (resolve)
				return getConfigurationElement();
			return basicGetConfigurationElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ConfigurationrepresentationPackage.SINGLE_ELEMENT_CONFIGURATION__CONFIGURATION_ELEMENT:
			setConfigurationElement((EObject) newValue);
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
		case ConfigurationrepresentationPackage.SINGLE_ELEMENT_CONFIGURATION__CONFIGURATION_ELEMENT:
			setConfigurationElement((EObject) null);
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
		case ConfigurationrepresentationPackage.SINGLE_ELEMENT_CONFIGURATION__CONFIGURATION_ELEMENT:
			return configurationElement != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleElementConfigurationImpl
