/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ConfigurationCorrespondenceImpl#getCodeQLConfig <em>Code QL Config</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ConfigurationCorrespondenceImpl#getCodeQLSCARConfig <em>Code QLSCAR Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationCorrespondenceImpl extends MinimalEObjectImpl.Container
		implements ConfigurationCorrespondence {
	/**
	 * The cached value of the '{@link #getCodeQLConfig() <em>Code QL Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeQLConfig()
	 * @generated
	 * @ordered
	 */
	protected Configuration codeQLConfig;

	/**
	 * The cached value of the '{@link #getCodeQLSCARConfig() <em>Code QLSCAR Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeQLSCARConfig()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationID_SCAR codeQLSCARConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlscarcorrespondencesPackage.Literals.CONFIGURATION_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getCodeQLConfig() {
		if (codeQLConfig != null && codeQLConfig.eIsProxy()) {
			InternalEObject oldCodeQLConfig = (InternalEObject) codeQLConfig;
			codeQLConfig = (Configuration) eResolveProxy(oldCodeQLConfig);
			if (codeQLConfig != oldCodeQLConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG,
							oldCodeQLConfig, codeQLConfig));
			}
		}
		return codeQLConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetCodeQLConfig() {
		return codeQLConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeQLConfig(Configuration newCodeQLConfig) {
		Configuration oldCodeQLConfig = codeQLConfig;
		codeQLConfig = newCodeQLConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG, oldCodeQLConfig,
					codeQLConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationID_SCAR getCodeQLSCARConfig() {
		if (codeQLSCARConfig != null && codeQLSCARConfig.eIsProxy()) {
			InternalEObject oldCodeQLSCARConfig = (InternalEObject) codeQLSCARConfig;
			codeQLSCARConfig = (ConfigurationID_SCAR) eResolveProxy(oldCodeQLSCARConfig);
			if (codeQLSCARConfig != oldCodeQLSCARConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QLSCAR_CONFIG,
							oldCodeQLSCARConfig, codeQLSCARConfig));
			}
		}
		return codeQLSCARConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationID_SCAR basicGetCodeQLSCARConfig() {
		return codeQLSCARConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeQLSCARConfig(ConfigurationID_SCAR newCodeQLSCARConfig) {
		ConfigurationID_SCAR oldCodeQLSCARConfig = codeQLSCARConfig;
		codeQLSCARConfig = newCodeQLSCARConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QLSCAR_CONFIG,
					oldCodeQLSCARConfig, codeQLSCARConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG:
			if (resolve)
				return getCodeQLConfig();
			return basicGetCodeQLConfig();
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QLSCAR_CONFIG:
			if (resolve)
				return getCodeQLSCARConfig();
			return basicGetCodeQLSCARConfig();
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
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG:
			setCodeQLConfig((Configuration) newValue);
			return;
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QLSCAR_CONFIG:
			setCodeQLSCARConfig((ConfigurationID_SCAR) newValue);
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
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG:
			setCodeQLConfig((Configuration) null);
			return;
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QLSCAR_CONFIG:
			setCodeQLSCARConfig((ConfigurationID_SCAR) null);
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
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG:
			return codeQLConfig != null;
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CODE_QLSCAR_CONFIG:
			return codeQLSCARConfig != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationCorrespondenceImpl
