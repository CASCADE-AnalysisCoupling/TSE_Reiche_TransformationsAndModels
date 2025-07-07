/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ConfigurationCorrespondenceImpl#getConfiguration_CodeQL <em>Configuration Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ConfigurationCorrespondenceImpl#getConfiguration_SCAR <em>Configuration SCAR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationCorrespondenceImpl extends MinimalEObjectImpl.Container
		implements ConfigurationCorrespondence {
	/**
	 * The cached value of the '{@link #getConfiguration_CodeQL() <em>Configuration Code QL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_CodeQL()
	 * @generated
	 * @ordered
	 */
	protected HybridConfiguration configuration_CodeQL;

	/**
	 * The cached value of the '{@link #getConfiguration_SCAR() <em>Configuration SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_SCAR()
	 * @generated
	 * @ordered
	 */
	protected RuleId configuration_SCAR;

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
	public HybridConfiguration getConfiguration_CodeQL() {
		if (configuration_CodeQL != null && configuration_CodeQL.eIsProxy()) {
			InternalEObject oldConfiguration_CodeQL = (InternalEObject) configuration_CodeQL;
			configuration_CodeQL = (HybridConfiguration) eResolveProxy(oldConfiguration_CodeQL);
			if (configuration_CodeQL != oldConfiguration_CodeQL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_CODE_QL,
							oldConfiguration_CodeQL, configuration_CodeQL));
			}
		}
		return configuration_CodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridConfiguration basicGetConfiguration_CodeQL() {
		return configuration_CodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration_CodeQL(HybridConfiguration newConfiguration_CodeQL) {
		HybridConfiguration oldConfiguration_CodeQL = configuration_CodeQL;
		configuration_CodeQL = newConfiguration_CodeQL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_CODE_QL,
					oldConfiguration_CodeQL, configuration_CodeQL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleId getConfiguration_SCAR() {
		if (configuration_SCAR != null && configuration_SCAR.eIsProxy()) {
			InternalEObject oldConfiguration_SCAR = (InternalEObject) configuration_SCAR;
			configuration_SCAR = (RuleId) eResolveProxy(oldConfiguration_SCAR);
			if (configuration_SCAR != oldConfiguration_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_SCAR,
							oldConfiguration_SCAR, configuration_SCAR));
			}
		}
		return configuration_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleId basicGetConfiguration_SCAR() {
		return configuration_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration_SCAR(RuleId newConfiguration_SCAR) {
		RuleId oldConfiguration_SCAR = configuration_SCAR;
		configuration_SCAR = newConfiguration_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_SCAR,
					oldConfiguration_SCAR, configuration_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_CODE_QL:
			if (resolve)
				return getConfiguration_CodeQL();
			return basicGetConfiguration_CodeQL();
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_SCAR:
			if (resolve)
				return getConfiguration_SCAR();
			return basicGetConfiguration_SCAR();
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
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_CODE_QL:
			setConfiguration_CodeQL((HybridConfiguration) newValue);
			return;
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_SCAR:
			setConfiguration_SCAR((RuleId) newValue);
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
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_CODE_QL:
			setConfiguration_CodeQL((HybridConfiguration) null);
			return;
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_SCAR:
			setConfiguration_SCAR((RuleId) null);
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
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_CODE_QL:
			return configuration_CodeQL != null;
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_SCAR:
			return configuration_SCAR != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationCorrespondenceImpl
