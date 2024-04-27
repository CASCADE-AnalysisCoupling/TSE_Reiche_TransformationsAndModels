/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_JOANAResultingValues;

import edu.kit.kastel.sdq.coupling.models.joana.Level;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Correspondence JOANA Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.LevelCorrespondence_JOANAResultingValuesImpl#getLevel_JOANA <em>Level JOANA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.LevelCorrespondence_JOANAResultingValuesImpl#getLevel_ResultingValues <em>Level Resulting Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelCorrespondence_JOANAResultingValuesImpl extends MinimalEObjectImpl.Container
		implements LevelCorrespondence_JOANAResultingValues {
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
	 * The cached value of the '{@link #getLevel_ResultingValues() <em>Level Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel_ResultingValues()
	 * @generated
	 * @ordered
	 */
	protected Level_ResultingValues level_ResultingValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelCorrespondence_JOANAResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaresultingvaluescorrespondencesPackage.Literals.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES;
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
							JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_JOANA,
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
					JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_JOANA,
					oldLevel_JOANA, level_JOANA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_ResultingValues getLevel_ResultingValues() {
		if (level_ResultingValues != null && level_ResultingValues.eIsProxy()) {
			InternalEObject oldLevel_ResultingValues = (InternalEObject) level_ResultingValues;
			level_ResultingValues = (Level_ResultingValues) eResolveProxy(oldLevel_ResultingValues);
			if (level_ResultingValues != oldLevel_ResultingValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_RESULTING_VALUES,
							oldLevel_ResultingValues, level_ResultingValues));
			}
		}
		return level_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_ResultingValues basicGetLevel_ResultingValues() {
		return level_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel_ResultingValues(Level_ResultingValues newLevel_ResultingValues) {
		Level_ResultingValues oldLevel_ResultingValues = level_ResultingValues;
		level_ResultingValues = newLevel_ResultingValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_RESULTING_VALUES,
					oldLevel_ResultingValues, level_ResultingValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_JOANA:
			if (resolve)
				return getLevel_JOANA();
			return basicGetLevel_JOANA();
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_RESULTING_VALUES:
			if (resolve)
				return getLevel_ResultingValues();
			return basicGetLevel_ResultingValues();
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
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_JOANA:
			setLevel_JOANA((Level) newValue);
			return;
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_RESULTING_VALUES:
			setLevel_ResultingValues((Level_ResultingValues) newValue);
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
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_JOANA:
			setLevel_JOANA((Level) null);
			return;
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_RESULTING_VALUES:
			setLevel_ResultingValues((Level_ResultingValues) null);
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
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_JOANA:
			return level_JOANA != null;
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_JOANA_RESULTING_VALUES__LEVEL_RESULTING_VALUES:
			return level_ResultingValues != null;
		}
		return super.eIsSet(featureID);
	}

} //LevelCorrespondence_JOANAResultingValuesImpl
