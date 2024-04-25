/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Level Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SecurityLevelCorrespondenceImpl#getCodeQLSecurityLevel <em>Code QL Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SecurityLevelCorrespondenceImpl#getCodeQLSCARSecurityLevel <em>Code QLSCAR Security Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityLevelCorrespondenceImpl extends MinimalEObjectImpl.Container
		implements SecurityLevelCorrespondence {
	/**
	 * The cached value of the '{@link #getCodeQLSecurityLevel() <em>Code QL Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeQLSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel codeQLSecurityLevel;

	/**
	 * The cached value of the '{@link #getCodeQLSCARSecurityLevel() <em>Code QLSCAR Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeQLSCARSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel_SCAR codeQLSCARSecurityLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevelCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlscarcorrespondencesPackage.Literals.SECURITY_LEVEL_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel getCodeQLSecurityLevel() {
		if (codeQLSecurityLevel != null && codeQLSecurityLevel.eIsProxy()) {
			InternalEObject oldCodeQLSecurityLevel = (InternalEObject) codeQLSecurityLevel;
			codeQLSecurityLevel = (SecurityLevel) eResolveProxy(oldCodeQLSecurityLevel);
			if (codeQLSecurityLevel != oldCodeQLSecurityLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QL_SECURITY_LEVEL,
							oldCodeQLSecurityLevel, codeQLSecurityLevel));
			}
		}
		return codeQLSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel basicGetCodeQLSecurityLevel() {
		return codeQLSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeQLSecurityLevel(SecurityLevel newCodeQLSecurityLevel) {
		SecurityLevel oldCodeQLSecurityLevel = codeQLSecurityLevel;
		codeQLSecurityLevel = newCodeQLSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QL_SECURITY_LEVEL,
					oldCodeQLSecurityLevel, codeQLSecurityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_SCAR getCodeQLSCARSecurityLevel() {
		if (codeQLSCARSecurityLevel != null && codeQLSCARSecurityLevel.eIsProxy()) {
			InternalEObject oldCodeQLSCARSecurityLevel = (InternalEObject) codeQLSCARSecurityLevel;
			codeQLSCARSecurityLevel = (SecurityLevel_SCAR) eResolveProxy(oldCodeQLSCARSecurityLevel);
			if (codeQLSCARSecurityLevel != oldCodeQLSCARSecurityLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QLSCAR_SECURITY_LEVEL,
							oldCodeQLSCARSecurityLevel, codeQLSCARSecurityLevel));
			}
		}
		return codeQLSCARSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_SCAR basicGetCodeQLSCARSecurityLevel() {
		return codeQLSCARSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeQLSCARSecurityLevel(SecurityLevel_SCAR newCodeQLSCARSecurityLevel) {
		SecurityLevel_SCAR oldCodeQLSCARSecurityLevel = codeQLSCARSecurityLevel;
		codeQLSCARSecurityLevel = newCodeQLSCARSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QLSCAR_SECURITY_LEVEL,
					oldCodeQLSCARSecurityLevel, codeQLSCARSecurityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QL_SECURITY_LEVEL:
			if (resolve)
				return getCodeQLSecurityLevel();
			return basicGetCodeQLSecurityLevel();
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QLSCAR_SECURITY_LEVEL:
			if (resolve)
				return getCodeQLSCARSecurityLevel();
			return basicGetCodeQLSCARSecurityLevel();
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
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QL_SECURITY_LEVEL:
			setCodeQLSecurityLevel((SecurityLevel) newValue);
			return;
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QLSCAR_SECURITY_LEVEL:
			setCodeQLSCARSecurityLevel((SecurityLevel_SCAR) newValue);
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
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QL_SECURITY_LEVEL:
			setCodeQLSecurityLevel((SecurityLevel) null);
			return;
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QLSCAR_SECURITY_LEVEL:
			setCodeQLSCARSecurityLevel((SecurityLevel_SCAR) null);
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
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QL_SECURITY_LEVEL:
			return codeQLSecurityLevel != null;
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__CODE_QLSCAR_SECURITY_LEVEL:
			return codeQLSCARSecurityLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityLevelCorrespondenceImpl
