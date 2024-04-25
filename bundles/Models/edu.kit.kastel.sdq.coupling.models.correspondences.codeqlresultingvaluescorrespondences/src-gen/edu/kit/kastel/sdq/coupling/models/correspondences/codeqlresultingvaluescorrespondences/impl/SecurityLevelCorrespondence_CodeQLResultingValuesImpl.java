/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Level Correspondence Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.SecurityLevelCorrespondence_CodeQLResultingValuesImpl#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.SecurityLevelCorrespondence_CodeQLResultingValuesImpl#getSecurityLevel_CodeQLResultingValues <em>Security Level Code QL Resulting Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityLevelCorrespondence_CodeQLResultingValuesImpl extends MinimalEObjectImpl.Container
		implements SecurityLevelCorrespondence_CodeQLResultingValues {
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
	 * The cached value of the '{@link #getSecurityLevel_CodeQLResultingValues() <em>Security Level Code QL Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel_CodeQLResultingValues()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel_ResultingValues securityLevel_CodeQLResultingValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevelCorrespondence_CodeQLResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluescorrespondencesPackage.Literals.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES;
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
							CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL,
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
					CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL,
					oldSecurityLevel_CodeQL, securityLevel_CodeQL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_ResultingValues getSecurityLevel_CodeQLResultingValues() {
		if (securityLevel_CodeQLResultingValues != null && securityLevel_CodeQLResultingValues.eIsProxy()) {
			InternalEObject oldSecurityLevel_CodeQLResultingValues = (InternalEObject) securityLevel_CodeQLResultingValues;
			securityLevel_CodeQLResultingValues = (SecurityLevel_ResultingValues) eResolveProxy(
					oldSecurityLevel_CodeQLResultingValues);
			if (securityLevel_CodeQLResultingValues != oldSecurityLevel_CodeQLResultingValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL_RESULTING_VALUES,
							oldSecurityLevel_CodeQLResultingValues, securityLevel_CodeQLResultingValues));
			}
		}
		return securityLevel_CodeQLResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_ResultingValues basicGetSecurityLevel_CodeQLResultingValues() {
		return securityLevel_CodeQLResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel_CodeQLResultingValues(
			SecurityLevel_ResultingValues newSecurityLevel_CodeQLResultingValues) {
		SecurityLevel_ResultingValues oldSecurityLevel_CodeQLResultingValues = securityLevel_CodeQLResultingValues;
		securityLevel_CodeQLResultingValues = newSecurityLevel_CodeQLResultingValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL_RESULTING_VALUES,
					oldSecurityLevel_CodeQLResultingValues, securityLevel_CodeQLResultingValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL:
			if (resolve)
				return getSecurityLevel_CodeQL();
			return basicGetSecurityLevel_CodeQL();
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL_RESULTING_VALUES:
			if (resolve)
				return getSecurityLevel_CodeQLResultingValues();
			return basicGetSecurityLevel_CodeQLResultingValues();
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
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL:
			setSecurityLevel_CodeQL((SecurityLevel) newValue);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL_RESULTING_VALUES:
			setSecurityLevel_CodeQLResultingValues((SecurityLevel_ResultingValues) newValue);
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
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL:
			setSecurityLevel_CodeQL((SecurityLevel) null);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL_RESULTING_VALUES:
			setSecurityLevel_CodeQLResultingValues((SecurityLevel_ResultingValues) null);
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
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL:
			return securityLevel_CodeQL != null;
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL_RESULTING_VALUES:
			return securityLevel_CodeQLResultingValues != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityLevelCorrespondence_CodeQLResultingValuesImpl
