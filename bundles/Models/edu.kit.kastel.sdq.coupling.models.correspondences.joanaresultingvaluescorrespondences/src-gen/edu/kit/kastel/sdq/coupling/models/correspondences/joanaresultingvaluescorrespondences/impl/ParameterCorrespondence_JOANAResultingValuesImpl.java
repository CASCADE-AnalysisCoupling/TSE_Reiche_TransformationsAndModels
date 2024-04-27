/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;

import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Correspondence JOANA Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.ParameterCorrespondence_JOANAResultingValuesImpl#getParameter_SCAR <em>Parameter SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.ParameterCorrespondence_JOANAResultingValuesImpl#getParameter_ResultingValues <em>Parameter Resulting Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterCorrespondence_JOANAResultingValuesImpl extends MinimalEObjectImpl.Container
		implements ParameterCorrespondence_JOANAResultingValues {
	/**
	 * The cached value of the '{@link #getParameter_SCAR() <em>Parameter SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_SCAR()
	 * @generated
	 * @ordered
	 */
	protected ParameterIdentifying parameter_SCAR;

	/**
	 * The cached value of the '{@link #getParameter_ResultingValues() <em>Parameter Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_ResultingValues()
	 * @generated
	 * @ordered
	 */
	protected ParameterIdentification_JOANAResultingValues parameter_ResultingValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterCorrespondence_JOANAResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaresultingvaluescorrespondencesPackage.Literals.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentifying getParameter_SCAR() {
		if (parameter_SCAR != null && parameter_SCAR.eIsProxy()) {
			InternalEObject oldParameter_SCAR = (InternalEObject) parameter_SCAR;
			parameter_SCAR = (ParameterIdentifying) eResolveProxy(oldParameter_SCAR);
			if (parameter_SCAR != oldParameter_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_SCAR,
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
	public ParameterIdentifying basicGetParameter_SCAR() {
		return parameter_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_SCAR(ParameterIdentifying newParameter_SCAR) {
		ParameterIdentifying oldParameter_SCAR = parameter_SCAR;
		parameter_SCAR = newParameter_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_SCAR,
					oldParameter_SCAR, parameter_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentification_JOANAResultingValues getParameter_ResultingValues() {
		if (parameter_ResultingValues != null && parameter_ResultingValues.eIsProxy()) {
			InternalEObject oldParameter_ResultingValues = (InternalEObject) parameter_ResultingValues;
			parameter_ResultingValues = (ParameterIdentification_JOANAResultingValues) eResolveProxy(
					oldParameter_ResultingValues);
			if (parameter_ResultingValues != oldParameter_ResultingValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_RESULTING_VALUES,
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
	public ParameterIdentification_JOANAResultingValues basicGetParameter_ResultingValues() {
		return parameter_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_ResultingValues(
			ParameterIdentification_JOANAResultingValues newParameter_ResultingValues) {
		ParameterIdentification_JOANAResultingValues oldParameter_ResultingValues = parameter_ResultingValues;
		parameter_ResultingValues = newParameter_ResultingValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_RESULTING_VALUES,
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
		case JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_SCAR:
			if (resolve)
				return getParameter_SCAR();
			return basicGetParameter_SCAR();
		case JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_RESULTING_VALUES:
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
		case JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_SCAR:
			setParameter_SCAR((ParameterIdentifying) newValue);
			return;
		case JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_RESULTING_VALUES:
			setParameter_ResultingValues((ParameterIdentification_JOANAResultingValues) newValue);
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
		case JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_SCAR:
			setParameter_SCAR((ParameterIdentifying) null);
			return;
		case JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_RESULTING_VALUES:
			setParameter_ResultingValues((ParameterIdentification_JOANAResultingValues) null);
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
		case JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_SCAR:
			return parameter_SCAR != null;
		case JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_RESULTING_VALUES:
			return parameter_ResultingValues != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterCorrespondence_JOANAResultingValuesImpl
