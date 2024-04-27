/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue;

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
 * An implementation of the model object '<em><b>JOANA Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JOANAResultingValuesImpl#getSystemElements <em>System Elements</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JOANAResultingValuesImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JOANAResultingValuesImpl#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JOANAResultingValuesImpl#getResultingValues <em>Resulting Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JOANAResultingValuesImpl extends MinimalEObjectImpl.Container implements JOANAResultingValues {
	/**
	 * The cached value of the '{@link #getSystemElements() <em>System Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterIdentification_JOANAResultingValues> systemElements;

	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<Level_ResultingValues> levels;

	/**
	 * The cached value of the '{@link #getEntryPoints() <em>Entry Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryPointIdentification_ResultingValues> entryPoints;

	/**
	 * The cached value of the '{@link #getResultingValues() <em>Resulting Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultingValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultingValue> resultingValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JOANAResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaresultingvaluesPackage.Literals.JOANA_RESULTING_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterIdentification_JOANAResultingValues> getSystemElements() {
		if (systemElements == null) {
			systemElements = new EObjectContainmentEList<ParameterIdentification_JOANAResultingValues>(
					ParameterIdentification_JOANAResultingValues.class, this,
					JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__SYSTEM_ELEMENTS);
		}
		return systemElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Level_ResultingValues> getLevels() {
		if (levels == null) {
			levels = new EObjectContainmentEList<Level_ResultingValues>(Level_ResultingValues.class, this,
					JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__LEVELS);
		}
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryPointIdentification_ResultingValues> getEntryPoints() {
		if (entryPoints == null) {
			entryPoints = new EObjectContainmentEList<EntryPointIdentification_ResultingValues>(
					EntryPointIdentification_ResultingValues.class, this,
					JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__ENTRY_POINTS);
		}
		return entryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultingValue> getResultingValues() {
		if (resultingValues == null) {
			resultingValues = new EObjectContainmentEList<ResultingValue>(ResultingValue.class, this,
					JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__RESULTING_VALUES);
		}
		return resultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__SYSTEM_ELEMENTS:
			return ((InternalEList<?>) getSystemElements()).basicRemove(otherEnd, msgs);
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__LEVELS:
			return ((InternalEList<?>) getLevels()).basicRemove(otherEnd, msgs);
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__ENTRY_POINTS:
			return ((InternalEList<?>) getEntryPoints()).basicRemove(otherEnd, msgs);
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__RESULTING_VALUES:
			return ((InternalEList<?>) getResultingValues()).basicRemove(otherEnd, msgs);
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
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__SYSTEM_ELEMENTS:
			return getSystemElements();
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__LEVELS:
			return getLevels();
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__ENTRY_POINTS:
			return getEntryPoints();
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__RESULTING_VALUES:
			return getResultingValues();
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
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__SYSTEM_ELEMENTS:
			getSystemElements().clear();
			getSystemElements().addAll((Collection<? extends ParameterIdentification_JOANAResultingValues>) newValue);
			return;
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__LEVELS:
			getLevels().clear();
			getLevels().addAll((Collection<? extends Level_ResultingValues>) newValue);
			return;
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__ENTRY_POINTS:
			getEntryPoints().clear();
			getEntryPoints().addAll((Collection<? extends EntryPointIdentification_ResultingValues>) newValue);
			return;
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__RESULTING_VALUES:
			getResultingValues().clear();
			getResultingValues().addAll((Collection<? extends ResultingValue>) newValue);
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
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__SYSTEM_ELEMENTS:
			getSystemElements().clear();
			return;
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__LEVELS:
			getLevels().clear();
			return;
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__ENTRY_POINTS:
			getEntryPoints().clear();
			return;
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__RESULTING_VALUES:
			getResultingValues().clear();
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
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__SYSTEM_ELEMENTS:
			return systemElements != null && !systemElements.isEmpty();
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__LEVELS:
			return levels != null && !levels.isEmpty();
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__ENTRY_POINTS:
			return entryPoints != null && !entryPoints.isEmpty();
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES__RESULTING_VALUES:
			return resultingValues != null && !resultingValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JOANAResultingValuesImpl
