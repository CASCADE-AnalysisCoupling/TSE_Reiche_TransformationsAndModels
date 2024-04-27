/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point Correspondence JOANA Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.EntryPointCorrespondence_JOANAResultingValuesImpl#getEntryPoint_SCAR <em>Entry Point SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.EntryPointCorrespondence_JOANAResultingValuesImpl#getEntryPoint_ResultingValues <em>Entry Point Resulting Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryPointCorrespondence_JOANAResultingValuesImpl extends MinimalEObjectImpl.Container
		implements EntryPointCorrespondence_JOANAResultingValues {
	/**
	 * The cached value of the '{@link #getEntryPoint_SCAR() <em>Entry Point SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint_SCAR()
	 * @generated
	 * @ordered
	 */
	protected EntryPointIdentifying entryPoint_SCAR;

	/**
	 * The cached value of the '{@link #getEntryPoint_ResultingValues() <em>Entry Point Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint_ResultingValues()
	 * @generated
	 * @ordered
	 */
	protected EntryPointIdentification_ResultingValues entryPoint_ResultingValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointCorrespondence_JOANAResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaresultingvaluescorrespondencesPackage.Literals.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointIdentifying getEntryPoint_SCAR() {
		if (entryPoint_SCAR != null && entryPoint_SCAR.eIsProxy()) {
			InternalEObject oldEntryPoint_SCAR = (InternalEObject) entryPoint_SCAR;
			entryPoint_SCAR = (EntryPointIdentifying) eResolveProxy(oldEntryPoint_SCAR);
			if (entryPoint_SCAR != oldEntryPoint_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_SCAR,
							oldEntryPoint_SCAR, entryPoint_SCAR));
			}
		}
		return entryPoint_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointIdentifying basicGetEntryPoint_SCAR() {
		return entryPoint_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint_SCAR(EntryPointIdentifying newEntryPoint_SCAR) {
		EntryPointIdentifying oldEntryPoint_SCAR = entryPoint_SCAR;
		entryPoint_SCAR = newEntryPoint_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_SCAR,
					oldEntryPoint_SCAR, entryPoint_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointIdentification_ResultingValues getEntryPoint_ResultingValues() {
		if (entryPoint_ResultingValues != null && entryPoint_ResultingValues.eIsProxy()) {
			InternalEObject oldEntryPoint_ResultingValues = (InternalEObject) entryPoint_ResultingValues;
			entryPoint_ResultingValues = (EntryPointIdentification_ResultingValues) eResolveProxy(
					oldEntryPoint_ResultingValues);
			if (entryPoint_ResultingValues != oldEntryPoint_ResultingValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESULTING_VALUES,
							oldEntryPoint_ResultingValues, entryPoint_ResultingValues));
			}
		}
		return entryPoint_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointIdentification_ResultingValues basicGetEntryPoint_ResultingValues() {
		return entryPoint_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint_ResultingValues(EntryPointIdentification_ResultingValues newEntryPoint_ResultingValues) {
		EntryPointIdentification_ResultingValues oldEntryPoint_ResultingValues = entryPoint_ResultingValues;
		entryPoint_ResultingValues = newEntryPoint_ResultingValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESULTING_VALUES,
					oldEntryPoint_ResultingValues, entryPoint_ResultingValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_SCAR:
			if (resolve)
				return getEntryPoint_SCAR();
			return basicGetEntryPoint_SCAR();
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESULTING_VALUES:
			if (resolve)
				return getEntryPoint_ResultingValues();
			return basicGetEntryPoint_ResultingValues();
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
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_SCAR:
			setEntryPoint_SCAR((EntryPointIdentifying) newValue);
			return;
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESULTING_VALUES:
			setEntryPoint_ResultingValues((EntryPointIdentification_ResultingValues) newValue);
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
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_SCAR:
			setEntryPoint_SCAR((EntryPointIdentifying) null);
			return;
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESULTING_VALUES:
			setEntryPoint_ResultingValues((EntryPointIdentification_ResultingValues) null);
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
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_SCAR:
			return entryPoint_SCAR != null;
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESULTING_VALUES:
			return entryPoint_ResultingValues != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryPointCorrespondence_JOANAResultingValuesImpl
