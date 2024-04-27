/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correspondences JOANA Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.Correspondences_JOANAResultingValuesImpl#getLevelCorrespondences <em>Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.Correspondences_JOANAResultingValuesImpl#getEntryPointCorrespondences <em>Entry Point Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.Correspondences_JOANAResultingValuesImpl#getParameterCorrespondences <em>Parameter Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Correspondences_JOANAResultingValuesImpl extends MinimalEObjectImpl.Container
		implements Correspondences_JOANAResultingValues {
	/**
	 * The cached value of the '{@link #getLevelCorrespondences() <em>Level Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<LevelCorrespondence_JOANAResultingValues> levelCorrespondences;

	/**
	 * The cached value of the '{@link #getEntryPointCorrespondences() <em>Entry Point Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPointCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryPointCorrespondence_JOANAResultingValues> entryPointCorrespondences;

	/**
	 * The cached value of the '{@link #getParameterCorrespondences() <em>Parameter Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCorrespondence_JOANAResultingValues> parameterCorrespondences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Correspondences_JOANAResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaresultingvaluescorrespondencesPackage.Literals.CORRESPONDENCES_JOANA_RESULTING_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LevelCorrespondence_JOANAResultingValues> getLevelCorrespondences() {
		if (levelCorrespondences == null) {
			levelCorrespondences = new EObjectContainmentEList<LevelCorrespondence_JOANAResultingValues>(
					LevelCorrespondence_JOANAResultingValues.class, this,
					JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__LEVEL_CORRESPONDENCES);
		}
		return levelCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryPointCorrespondence_JOANAResultingValues> getEntryPointCorrespondences() {
		if (entryPointCorrespondences == null) {
			entryPointCorrespondences = new EObjectContainmentEList<EntryPointCorrespondence_JOANAResultingValues>(
					EntryPointCorrespondence_JOANAResultingValues.class, this,
					JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__ENTRY_POINT_CORRESPONDENCES);
		}
		return entryPointCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCorrespondence_JOANAResultingValues> getParameterCorrespondences() {
		if (parameterCorrespondences == null) {
			parameterCorrespondences = new EObjectContainmentEList<ParameterCorrespondence_JOANAResultingValues>(
					ParameterCorrespondence_JOANAResultingValues.class, this,
					JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__PARAMETER_CORRESPONDENCES);
		}
		return parameterCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__LEVEL_CORRESPONDENCES:
			return ((InternalEList<?>) getLevelCorrespondences()).basicRemove(otherEnd, msgs);
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__ENTRY_POINT_CORRESPONDENCES:
			return ((InternalEList<?>) getEntryPointCorrespondences()).basicRemove(otherEnd, msgs);
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__PARAMETER_CORRESPONDENCES:
			return ((InternalEList<?>) getParameterCorrespondences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__LEVEL_CORRESPONDENCES:
			return getLevelCorrespondences();
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__ENTRY_POINT_CORRESPONDENCES:
			return getEntryPointCorrespondences();
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__PARAMETER_CORRESPONDENCES:
			return getParameterCorrespondences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__LEVEL_CORRESPONDENCES:
			getLevelCorrespondences().clear();
			getLevelCorrespondences().addAll((Collection<? extends LevelCorrespondence_JOANAResultingValues>) newValue);
			return;
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__ENTRY_POINT_CORRESPONDENCES:
			getEntryPointCorrespondences().clear();
			getEntryPointCorrespondences()
					.addAll((Collection<? extends EntryPointCorrespondence_JOANAResultingValues>) newValue);
			return;
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__PARAMETER_CORRESPONDENCES:
			getParameterCorrespondences().clear();
			getParameterCorrespondences()
					.addAll((Collection<? extends ParameterCorrespondence_JOANAResultingValues>) newValue);
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
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__LEVEL_CORRESPONDENCES:
			getLevelCorrespondences().clear();
			return;
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__ENTRY_POINT_CORRESPONDENCES:
			getEntryPointCorrespondences().clear();
			return;
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__PARAMETER_CORRESPONDENCES:
			getParameterCorrespondences().clear();
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
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__LEVEL_CORRESPONDENCES:
			return levelCorrespondences != null && !levelCorrespondences.isEmpty();
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__ENTRY_POINT_CORRESPONDENCES:
			return entryPointCorrespondences != null && !entryPointCorrespondences.isEmpty();
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_JOANA_RESULTING_VALUES__PARAMETER_CORRESPONDENCES:
			return parameterCorrespondences != null && !parameterCorrespondences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Correspondences_JOANAResultingValuesImpl
