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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SecurityLevelCorrespondenceImpl#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SecurityLevelCorrespondenceImpl#getSecurityLevel_SCAR <em>Security Level SCAR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityLevelCorrespondenceImpl extends MinimalEObjectImpl.Container
		implements SecurityLevelCorrespondence {
	/**
	 * The cached value of the '{@link #getSecurityLevel_CodeQL() <em>Security Level Code QL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel_CodeQL()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel securityLevel_CodeQL;

	/**
	 * The cached value of the '{@link #getSecurityLevel_SCAR() <em>Security Level SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel_SCAR()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel_SCAR securityLevel_SCAR;

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
	public SecurityLevel getSecurityLevel_CodeQL() {
		if (securityLevel_CodeQL != null && securityLevel_CodeQL.eIsProxy()) {
			InternalEObject oldSecurityLevel_CodeQL = (InternalEObject) securityLevel_CodeQL;
			securityLevel_CodeQL = (SecurityLevel) eResolveProxy(oldSecurityLevel_CodeQL);
			if (securityLevel_CodeQL != oldSecurityLevel_CodeQL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_CODE_QL,
							oldSecurityLevel_CodeQL, securityLevel_CodeQL));
			}
		}
		return securityLevel_CodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel basicGetSecurityLevel_CodeQL() {
		return securityLevel_CodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel_CodeQL(SecurityLevel newSecurityLevel_CodeQL) {
		SecurityLevel oldSecurityLevel_CodeQL = securityLevel_CodeQL;
		securityLevel_CodeQL = newSecurityLevel_CodeQL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_CODE_QL,
					oldSecurityLevel_CodeQL, securityLevel_CodeQL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_SCAR getSecurityLevel_SCAR() {
		if (securityLevel_SCAR != null && securityLevel_SCAR.eIsProxy()) {
			InternalEObject oldSecurityLevel_SCAR = (InternalEObject) securityLevel_SCAR;
			securityLevel_SCAR = (SecurityLevel_SCAR) eResolveProxy(oldSecurityLevel_SCAR);
			if (securityLevel_SCAR != oldSecurityLevel_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_SCAR,
							oldSecurityLevel_SCAR, securityLevel_SCAR));
			}
		}
		return securityLevel_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_SCAR basicGetSecurityLevel_SCAR() {
		return securityLevel_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel_SCAR(SecurityLevel_SCAR newSecurityLevel_SCAR) {
		SecurityLevel_SCAR oldSecurityLevel_SCAR = securityLevel_SCAR;
		securityLevel_SCAR = newSecurityLevel_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_SCAR,
					oldSecurityLevel_SCAR, securityLevel_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_CODE_QL:
			if (resolve)
				return getSecurityLevel_CodeQL();
			return basicGetSecurityLevel_CodeQL();
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_SCAR:
			if (resolve)
				return getSecurityLevel_SCAR();
			return basicGetSecurityLevel_SCAR();
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
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_CODE_QL:
			setSecurityLevel_CodeQL((SecurityLevel) newValue);
			return;
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_SCAR:
			setSecurityLevel_SCAR((SecurityLevel_SCAR) newValue);
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
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_CODE_QL:
			setSecurityLevel_CodeQL((SecurityLevel) null);
			return;
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_SCAR:
			setSecurityLevel_SCAR((SecurityLevel_SCAR) null);
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
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_CODE_QL:
			return securityLevel_CodeQL != null;
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_SCAR:
			return securityLevel_SCAR != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityLevelCorrespondenceImpl
