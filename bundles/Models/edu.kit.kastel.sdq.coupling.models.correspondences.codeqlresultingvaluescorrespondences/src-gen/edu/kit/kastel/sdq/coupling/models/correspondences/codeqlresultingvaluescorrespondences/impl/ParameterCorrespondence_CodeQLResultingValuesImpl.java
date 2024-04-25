/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Correspondence Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ParameterCorrespondence_CodeQLResultingValuesImpl#getParameter_SCAR <em>Parameter SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ParameterCorrespondence_CodeQLResultingValuesImpl#getParameter_ResultingValues <em>Parameter Resulting Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterCorrespondence_CodeQLResultingValuesImpl extends MinimalEObjectImpl.Container
		implements ParameterCorrespondence_CodeQLResultingValues {
	/**
	 * The cached value of the '{@link #getParameter_SCAR() <em>Parameter SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_SCAR()
	 * @generated
	 * @ordered
	 */
	protected ParameterIdentification parameter_SCAR;

	/**
	 * The cached value of the '{@link #getParameter_ResultingValues() <em>Parameter Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_ResultingValues()
	 * @generated
	 * @ordered
	 */
	protected ParameterIdentificiation_CodeQLResultingValues parameter_ResultingValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterCorrespondence_CodeQLResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluescorrespondencesPackage.Literals.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentification getParameter_SCAR() {
		if (parameter_SCAR != null && parameter_SCAR.eIsProxy()) {
			InternalEObject oldParameter_SCAR = (InternalEObject) parameter_SCAR;
			parameter_SCAR = (ParameterIdentification) eResolveProxy(oldParameter_SCAR);
			if (parameter_SCAR != oldParameter_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_SCAR,
							oldParameter_SCAR, parameter_SCAR));
			}
		}
		return parameter_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentification basicGetParameter_SCAR() {
		return parameter_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_SCAR(ParameterIdentification newParameter_SCAR) {
		ParameterIdentification oldParameter_SCAR = parameter_SCAR;
		parameter_SCAR = newParameter_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_SCAR,
					oldParameter_SCAR, parameter_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentificiation_CodeQLResultingValues getParameter_ResultingValues() {
		if (parameter_ResultingValues != null && parameter_ResultingValues.eIsProxy()) {
			InternalEObject oldParameter_ResultingValues = (InternalEObject) parameter_ResultingValues;
			parameter_ResultingValues = (ParameterIdentificiation_CodeQLResultingValues) eResolveProxy(
					oldParameter_ResultingValues);
			if (parameter_ResultingValues != oldParameter_ResultingValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_RESULTING_VALUES,
							oldParameter_ResultingValues, parameter_ResultingValues));
			}
		}
		return parameter_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentificiation_CodeQLResultingValues basicGetParameter_ResultingValues() {
		return parameter_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_ResultingValues(
			ParameterIdentificiation_CodeQLResultingValues newParameter_ResultingValues) {
		ParameterIdentificiation_CodeQLResultingValues oldParameter_ResultingValues = parameter_ResultingValues;
		parameter_ResultingValues = newParameter_ResultingValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_RESULTING_VALUES,
					oldParameter_ResultingValues, parameter_ResultingValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_SCAR:
			if (resolve)
				return getParameter_SCAR();
			return basicGetParameter_SCAR();
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_RESULTING_VALUES:
			if (resolve)
				return getParameter_ResultingValues();
			return basicGetParameter_ResultingValues();
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
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_SCAR:
			setParameter_SCAR((ParameterIdentification) newValue);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_RESULTING_VALUES:
			setParameter_ResultingValues((ParameterIdentificiation_CodeQLResultingValues) newValue);
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
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_SCAR:
			setParameter_SCAR((ParameterIdentification) null);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_RESULTING_VALUES:
			setParameter_ResultingValues((ParameterIdentificiation_CodeQLResultingValues) null);
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
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_SCAR:
			return parameter_SCAR != null;
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_RESULTING_VALUES:
			return parameter_ResultingValues != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterCorrespondence_CodeQLResultingValuesImpl
