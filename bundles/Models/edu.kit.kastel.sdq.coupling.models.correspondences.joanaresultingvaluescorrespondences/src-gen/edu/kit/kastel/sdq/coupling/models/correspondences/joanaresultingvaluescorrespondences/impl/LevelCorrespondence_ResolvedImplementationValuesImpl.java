/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues;

import edu.kit.kastel.sdq.coupling.models.joana.Level;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Correspondence Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.LevelCorrespondence_ResolvedImplementationValuesImpl#getLevel_JOANA <em>Level JOANA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.LevelCorrespondence_ResolvedImplementationValuesImpl#getLevel_ResolvedImplementationValues <em>Level Resolved Implementation Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelCorrespondence_ResolvedImplementationValuesImpl extends MinimalEObjectImpl.Container
		implements LevelCorrespondence_ResolvedImplementationValues {
	/**
	 * The cached value of the '{@link #getLevel_JOANA() <em>Level JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel_JOANA()
	 * @generated
	 * @ordered
	 */
	protected Level level_JOANA;

	/**
	 * The cached value of the '{@link #getLevel_ResolvedImplementationValues() <em>Level Resolved Implementation Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel_ResolvedImplementationValues()
	 * @generated
	 * @ordered
	 */
	protected Level_ResolvedImplementationValues level_ResolvedImplementationValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelCorrespondence_ResolvedImplementationValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaresultingvaluescorrespondencesPackage.Literals.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getLevel_JOANA() {
		if (level_JOANA != null && level_JOANA.eIsProxy()) {
			InternalEObject oldLevel_JOANA = (InternalEObject) level_JOANA;
			level_JOANA = (Level) eResolveProxy(oldLevel_JOANA);
			if (level_JOANA != oldLevel_JOANA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_JOANA,
							oldLevel_JOANA, level_JOANA));
			}
		}
		return level_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetLevel_JOANA() {
		return level_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel_JOANA(Level newLevel_JOANA) {
		Level oldLevel_JOANA = level_JOANA;
		level_JOANA = newLevel_JOANA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_JOANA,
					oldLevel_JOANA, level_JOANA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_ResolvedImplementationValues getLevel_ResolvedImplementationValues() {
		if (level_ResolvedImplementationValues != null && level_ResolvedImplementationValues.eIsProxy()) {
			InternalEObject oldLevel_ResolvedImplementationValues = (InternalEObject) level_ResolvedImplementationValues;
			level_ResolvedImplementationValues = (Level_ResolvedImplementationValues) eResolveProxy(
					oldLevel_ResolvedImplementationValues);
			if (level_ResolvedImplementationValues != oldLevel_ResolvedImplementationValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_RESOLVED_IMPLEMENTATION_VALUES,
							oldLevel_ResolvedImplementationValues, level_ResolvedImplementationValues));
			}
		}
		return level_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_ResolvedImplementationValues basicGetLevel_ResolvedImplementationValues() {
		return level_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel_ResolvedImplementationValues(
			Level_ResolvedImplementationValues newLevel_ResolvedImplementationValues) {
		Level_ResolvedImplementationValues oldLevel_ResolvedImplementationValues = level_ResolvedImplementationValues;
		level_ResolvedImplementationValues = newLevel_ResolvedImplementationValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_RESOLVED_IMPLEMENTATION_VALUES,
					oldLevel_ResolvedImplementationValues, level_ResolvedImplementationValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_JOANA:
			if (resolve)
				return getLevel_JOANA();
			return basicGetLevel_JOANA();
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_RESOLVED_IMPLEMENTATION_VALUES:
			if (resolve)
				return getLevel_ResolvedImplementationValues();
			return basicGetLevel_ResolvedImplementationValues();
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
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_JOANA:
			setLevel_JOANA((Level) newValue);
			return;
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_RESOLVED_IMPLEMENTATION_VALUES:
			setLevel_ResolvedImplementationValues((Level_ResolvedImplementationValues) newValue);
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
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_JOANA:
			setLevel_JOANA((Level) null);
			return;
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_RESOLVED_IMPLEMENTATION_VALUES:
			setLevel_ResolvedImplementationValues((Level_ResolvedImplementationValues) null);
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
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_JOANA:
			return level_JOANA != null;
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_RESOLVED_IMPLEMENTATION_VALUES:
			return level_ResolvedImplementationValues != null;
		}
		return super.eIsSet(featureID);
	}

} //LevelCorrespondence_ResolvedImplementationValuesImpl
