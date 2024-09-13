/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;

import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence;

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
	protected HybridConfiguration codeQLConfig;

	/**
	 * The cached value of the '{@link #getAccessAnalysisConfig() <em>Access Analysis Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessAnalysisConfig()
	 * @generated
	 * @ordered
	 */
	protected FullyImplicitConfiguration accessAnalysisConfig;

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
	public HybridConfiguration getCodeQLConfig() {
		if (codeQLConfig != null && codeQLConfig.eIsProxy()) {
			InternalEObject oldCodeQLConfig = (InternalEObject) codeQLConfig;
			codeQLConfig = (HybridConfiguration) eResolveProxy(oldCodeQLConfig);
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
	public HybridConfiguration basicGetCodeQLConfig() {
		return codeQLConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeQLConfig(HybridConfiguration newCodeQLConfig) {
		HybridConfiguration oldCodeQLConfig = codeQLConfig;
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
	public FullyImplicitConfiguration getAccessAnalysisConfig() {
		if (accessAnalysisConfig != null && accessAnalysisConfig.eIsProxy()) {
			InternalEObject oldAccessAnalysisConfig = (InternalEObject) accessAnalysisConfig;
			accessAnalysisConfig = (FullyImplicitConfiguration) eResolveProxy(oldAccessAnalysisConfig);
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
	public FullyImplicitConfiguration basicGetAccessAnalysisConfig() {
		return accessAnalysisConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessAnalysisConfig(FullyImplicitConfiguration newAccessAnalysisConfig) {
		FullyImplicitConfiguration oldAccessAnalysisConfig = accessAnalysisConfig;
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
			setCodeQLConfig((HybridConfiguration) newValue);
			return;
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG:
			setAccessAnalysisConfig((FullyImplicitConfiguration) newValue);
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
			setCodeQLConfig((HybridConfiguration) null);
			return;
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG:
			setAccessAnalysisConfig((FullyImplicitConfiguration) null);
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
