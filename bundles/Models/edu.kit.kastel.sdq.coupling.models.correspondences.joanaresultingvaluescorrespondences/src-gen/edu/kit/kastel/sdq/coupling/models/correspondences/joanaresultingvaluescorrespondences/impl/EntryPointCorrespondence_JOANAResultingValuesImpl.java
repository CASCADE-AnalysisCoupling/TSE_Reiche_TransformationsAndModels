/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.EntryPointCorrespondence_JOANAResultingValuesImpl#getEntryPoint_ResolvedImplementationValues <em>Entry Point Resolved Implementation Values</em>}</li>
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
	protected EntryPoint_SCAR entryPoint_SCAR;

	/**
	 * The cached value of the '{@link #getEntryPoint_ResolvedImplementationValues() <em>Entry Point Resolved Implementation Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint_ResolvedImplementationValues()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint_ResolvedImplementationValues entryPoint_ResolvedImplementationValues;

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
	public EntryPoint_SCAR getEntryPoint_SCAR() {
		if (entryPoint_SCAR != null && entryPoint_SCAR.eIsProxy()) {
			InternalEObject oldEntryPoint_SCAR = (InternalEObject) entryPoint_SCAR;
			entryPoint_SCAR = (EntryPoint_SCAR) eResolveProxy(oldEntryPoint_SCAR);
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
	public EntryPoint_SCAR basicGetEntryPoint_SCAR() {
		return entryPoint_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint_SCAR(EntryPoint_SCAR newEntryPoint_SCAR) {
		EntryPoint_SCAR oldEntryPoint_SCAR = entryPoint_SCAR;
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
	public EntryPoint_ResolvedImplementationValues getEntryPoint_ResolvedImplementationValues() {
		if (entryPoint_ResolvedImplementationValues != null && entryPoint_ResolvedImplementationValues.eIsProxy()) {
			InternalEObject oldEntryPoint_ResolvedImplementationValues = (InternalEObject) entryPoint_ResolvedImplementationValues;
			entryPoint_ResolvedImplementationValues = (EntryPoint_ResolvedImplementationValues) eResolveProxy(
					oldEntryPoint_ResolvedImplementationValues);
			if (entryPoint_ResolvedImplementationValues != oldEntryPoint_ResolvedImplementationValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES,
							oldEntryPoint_ResolvedImplementationValues, entryPoint_ResolvedImplementationValues));
			}
		}
		return entryPoint_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint_ResolvedImplementationValues basicGetEntryPoint_ResolvedImplementationValues() {
		return entryPoint_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint_ResolvedImplementationValues(
			EntryPoint_ResolvedImplementationValues newEntryPoint_ResolvedImplementationValues) {
		EntryPoint_ResolvedImplementationValues oldEntryPoint_ResolvedImplementationValues = entryPoint_ResolvedImplementationValues;
		entryPoint_ResolvedImplementationValues = newEntryPoint_ResolvedImplementationValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES,
					oldEntryPoint_ResolvedImplementationValues, entryPoint_ResolvedImplementationValues));
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
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES:
			if (resolve)
				return getEntryPoint_ResolvedImplementationValues();
			return basicGetEntryPoint_ResolvedImplementationValues();
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
			setEntryPoint_SCAR((EntryPoint_SCAR) newValue);
			return;
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES:
			setEntryPoint_ResolvedImplementationValues((EntryPoint_ResolvedImplementationValues) newValue);
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
			setEntryPoint_SCAR((EntryPoint_SCAR) null);
			return;
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES:
			setEntryPoint_ResolvedImplementationValues((EntryPoint_ResolvedImplementationValues) null);
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
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES:
			return entryPoint_ResolvedImplementationValues != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryPointCorrespondence_JOANAResultingValuesImpl
