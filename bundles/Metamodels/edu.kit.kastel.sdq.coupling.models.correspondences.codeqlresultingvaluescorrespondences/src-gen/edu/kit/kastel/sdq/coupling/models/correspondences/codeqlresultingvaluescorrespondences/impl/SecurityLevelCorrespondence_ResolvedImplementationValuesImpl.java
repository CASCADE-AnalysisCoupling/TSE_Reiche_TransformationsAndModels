/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Level Correspondence Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.SecurityLevelCorrespondence_ResolvedImplementationValuesImpl#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.SecurityLevelCorrespondence_ResolvedImplementationValuesImpl#getSecurityLevel_ResolvedImplementationValues <em>Security Level Resolved Implementation Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityLevelCorrespondence_ResolvedImplementationValuesImpl extends MinimalEObjectImpl.Container
		implements SecurityLevelCorrespondence_ResolvedImplementationValues {
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
	 * The cached value of the '{@link #getSecurityLevel_ResolvedImplementationValues() <em>Security Level Resolved Implementation Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel_ResolvedImplementationValues()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel_ResolvedImplementationValues securityLevel_ResolvedImplementationValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevelCorrespondence_ResolvedImplementationValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluescorrespondencesPackage.Literals.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES;
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
							CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CODE_QL,
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
					CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CODE_QL,
					oldSecurityLevel_CodeQL, securityLevel_CodeQL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_ResolvedImplementationValues getSecurityLevel_ResolvedImplementationValues() {
		if (securityLevel_ResolvedImplementationValues != null
				&& securityLevel_ResolvedImplementationValues.eIsProxy()) {
			InternalEObject oldSecurityLevel_ResolvedImplementationValues = (InternalEObject) securityLevel_ResolvedImplementationValues;
			securityLevel_ResolvedImplementationValues = (SecurityLevel_ResolvedImplementationValues) eResolveProxy(
					oldSecurityLevel_ResolvedImplementationValues);
			if (securityLevel_ResolvedImplementationValues != oldSecurityLevel_ResolvedImplementationValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES,
							oldSecurityLevel_ResolvedImplementationValues, securityLevel_ResolvedImplementationValues));
			}
		}
		return securityLevel_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_ResolvedImplementationValues basicGetSecurityLevel_ResolvedImplementationValues() {
		return securityLevel_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel_ResolvedImplementationValues(
			SecurityLevel_ResolvedImplementationValues newSecurityLevel_ResolvedImplementationValues) {
		SecurityLevel_ResolvedImplementationValues oldSecurityLevel_ResolvedImplementationValues = securityLevel_ResolvedImplementationValues;
		securityLevel_ResolvedImplementationValues = newSecurityLevel_ResolvedImplementationValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES,
					oldSecurityLevel_ResolvedImplementationValues, securityLevel_ResolvedImplementationValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CODE_QL:
			if (resolve)
				return getSecurityLevel_CodeQL();
			return basicGetSecurityLevel_CodeQL();
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES:
			if (resolve)
				return getSecurityLevel_ResolvedImplementationValues();
			return basicGetSecurityLevel_ResolvedImplementationValues();
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
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CODE_QL:
			setSecurityLevel_CodeQL((SecurityLevel) newValue);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES:
			setSecurityLevel_ResolvedImplementationValues((SecurityLevel_ResolvedImplementationValues) newValue);
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
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CODE_QL:
			setSecurityLevel_CodeQL((SecurityLevel) null);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES:
			setSecurityLevel_ResolvedImplementationValues((SecurityLevel_ResolvedImplementationValues) null);
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
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CODE_QL:
			return securityLevel_CodeQL != null;
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES:
			return securityLevel_ResolvedImplementationValues != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityLevelCorrespondence_ResolvedImplementationValuesImpl
