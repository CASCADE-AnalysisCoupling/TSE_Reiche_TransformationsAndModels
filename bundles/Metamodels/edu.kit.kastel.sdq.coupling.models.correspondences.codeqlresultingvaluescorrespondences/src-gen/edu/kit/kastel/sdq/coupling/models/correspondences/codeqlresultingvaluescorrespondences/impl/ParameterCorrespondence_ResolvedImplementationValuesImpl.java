/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Correspondence Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ParameterCorrespondence_ResolvedImplementationValuesImpl#getParameter_SCAR <em>Parameter SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ParameterCorrespondence_ResolvedImplementationValuesImpl#getParameter_ResolvedImplementationValues <em>Parameter Resolved Implementation Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterCorrespondence_ResolvedImplementationValuesImpl extends MinimalEObjectImpl.Container
		implements ParameterCorrespondence_ResolvedImplementationValues {
	/**
	 * The cached value of the '{@link #getParameter_SCAR() <em>Parameter SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_SCAR()
	 * @generated
	 * @ordered
	 */
	protected Parameter_SCAR parameter_SCAR;

	/**
	 * The cached value of the '{@link #getParameter_ResolvedImplementationValues() <em>Parameter Resolved Implementation Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 * @ordered
	 */
	protected Parameter_ResolvedImplementationValues parameter_ResolvedImplementationValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterCorrespondence_ResolvedImplementationValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluescorrespondencesPackage.Literals.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_SCAR getParameter_SCAR() {
		if (parameter_SCAR != null && parameter_SCAR.eIsProxy()) {
			InternalEObject oldParameter_SCAR = (InternalEObject) parameter_SCAR;
			parameter_SCAR = (Parameter_SCAR) eResolveProxy(oldParameter_SCAR);
			if (parameter_SCAR != oldParameter_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_SCAR,
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
	public Parameter_SCAR basicGetParameter_SCAR() {
		return parameter_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_SCAR(Parameter_SCAR newParameter_SCAR) {
		Parameter_SCAR oldParameter_SCAR = parameter_SCAR;
		parameter_SCAR = newParameter_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_SCAR,
					oldParameter_SCAR, parameter_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_ResolvedImplementationValues getParameter_ResolvedImplementationValues() {
		if (parameter_ResolvedImplementationValues != null && parameter_ResolvedImplementationValues.eIsProxy()) {
			InternalEObject oldParameter_ResolvedImplementationValues = (InternalEObject) parameter_ResolvedImplementationValues;
			parameter_ResolvedImplementationValues = (Parameter_ResolvedImplementationValues) eResolveProxy(
					oldParameter_ResolvedImplementationValues);
			if (parameter_ResolvedImplementationValues != oldParameter_ResolvedImplementationValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_RESOLVED_IMPLEMENTATION_VALUES,
							oldParameter_ResolvedImplementationValues, parameter_ResolvedImplementationValues));
			}
		}
		return parameter_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_ResolvedImplementationValues basicGetParameter_ResolvedImplementationValues() {
		return parameter_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_ResolvedImplementationValues(
			Parameter_ResolvedImplementationValues newParameter_ResolvedImplementationValues) {
		Parameter_ResolvedImplementationValues oldParameter_ResolvedImplementationValues = parameter_ResolvedImplementationValues;
		parameter_ResolvedImplementationValues = newParameter_ResolvedImplementationValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_RESOLVED_IMPLEMENTATION_VALUES,
					oldParameter_ResolvedImplementationValues, parameter_ResolvedImplementationValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_SCAR:
			if (resolve)
				return getParameter_SCAR();
			return basicGetParameter_SCAR();
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_RESOLVED_IMPLEMENTATION_VALUES:
			if (resolve)
				return getParameter_ResolvedImplementationValues();
			return basicGetParameter_ResolvedImplementationValues();
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
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_SCAR:
			setParameter_SCAR((Parameter_SCAR) newValue);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_RESOLVED_IMPLEMENTATION_VALUES:
			setParameter_ResolvedImplementationValues((Parameter_ResolvedImplementationValues) newValue);
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
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_SCAR:
			setParameter_SCAR((Parameter_SCAR) null);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_RESOLVED_IMPLEMENTATION_VALUES:
			setParameter_ResolvedImplementationValues((Parameter_ResolvedImplementationValues) null);
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
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_SCAR:
			return parameter_SCAR != null;
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_RESOLVED_IMPLEMENTATION_VALUES:
			return parameter_ResolvedImplementationValues != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterCorrespondence_ResolvedImplementationValuesImpl
