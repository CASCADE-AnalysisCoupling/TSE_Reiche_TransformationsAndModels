/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;

import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.ConfigurationCorrespondenceImpl#getCodeQLConfig <em>Code QL Config</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.ConfigurationCorrespondenceImpl#getAccessAnalysisConfig <em>Access Analysis Config</em>}</li>
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
	 * The cached value of the '{@link #getAccessAnalysisConfig() <em>Access Analysis Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessAnalysisConfig()
	 * @generated
	 * @ordered
	 */
	protected ConfidentialitySpecification accessAnalysisConfig;

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
		return AccessanalysiscodeqlcorrespondencePackage.Literals.CONFIGURATION_CORRESPONDENCE;
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
							AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG,
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
					AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG,
					oldCodeQLConfig, codeQLConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialitySpecification getAccessAnalysisConfig() {
		if (accessAnalysisConfig != null && accessAnalysisConfig.eIsProxy()) {
			InternalEObject oldAccessAnalysisConfig = (InternalEObject) accessAnalysisConfig;
			accessAnalysisConfig = (ConfidentialitySpecification) eResolveProxy(oldAccessAnalysisConfig);
			if (accessAnalysisConfig != oldAccessAnalysisConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG,
							oldAccessAnalysisConfig, accessAnalysisConfig));
			}
		}
		return accessAnalysisConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialitySpecification basicGetAccessAnalysisConfig() {
		return accessAnalysisConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessAnalysisConfig(ConfidentialitySpecification newAccessAnalysisConfig) {
		ConfidentialitySpecification oldAccessAnalysisConfig = accessAnalysisConfig;
		accessAnalysisConfig = newAccessAnalysisConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG,
					oldAccessAnalysisConfig, accessAnalysisConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG:
			if (resolve)
				return getCodeQLConfig();
			return basicGetCodeQLConfig();
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG:
			if (resolve)
				return getAccessAnalysisConfig();
			return basicGetAccessAnalysisConfig();
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
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG:
			setCodeQLConfig((Configuration) newValue);
			return;
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG:
			setAccessAnalysisConfig((ConfidentialitySpecification) newValue);
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
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG:
			setCodeQLConfig((Configuration) null);
			return;
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG:
			setAccessAnalysisConfig((ConfidentialitySpecification) null);
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
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG:
			return codeQLConfig != null;
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG:
			return accessAnalysisConfig != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationCorrespondenceImpl
