/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues;

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
 * An implementation of the model object '<em><b>Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValuesImpl#getSystemElements <em>System Elements</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValuesImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValuesImpl#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValuesImpl#getResultingValues <em>Resulting Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolvedImplementationValuesImpl extends MinimalEObjectImpl.Container
		implements ResolvedImplementationValues {
	/**
	 * The cached value of the '{@link #getSystemElements() <em>System Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter_ResolvedImplementationValues> systemElements;

	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<Level_ResolvedImplementationValues> levels;

	/**
	 * The cached value of the '{@link #getEntryPoints() <em>Entry Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryPoint_ResolvedImplementationValues> entryPoints;

	/**
	 * The cached value of the '{@link #getResultingValues() <em>Resulting Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultingValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ResolvedImplementationValue> resultingValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolvedImplementationValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaresultingvaluesPackage.Literals.RESOLVED_IMPLEMENTATION_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter_ResolvedImplementationValues> getSystemElements() {
		if (systemElements == null) {
			systemElements = new EObjectContainmentEList<Parameter_ResolvedImplementationValues>(
					Parameter_ResolvedImplementationValues.class, this,
					JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS);
		}
		return systemElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Level_ResolvedImplementationValues> getLevels() {
		if (levels == null) {
			levels = new EObjectContainmentEList<Level_ResolvedImplementationValues>(
					Level_ResolvedImplementationValues.class, this,
					JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__LEVELS);
		}
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryPoint_ResolvedImplementationValues> getEntryPoints() {
		if (entryPoints == null) {
			entryPoints = new EObjectContainmentEList<EntryPoint_ResolvedImplementationValues>(
					EntryPoint_ResolvedImplementationValues.class, this,
					JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINTS);
		}
		return entryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResolvedImplementationValue> getResultingValues() {
		if (resultingValues == null) {
			resultingValues = new EObjectContainmentEList<ResolvedImplementationValue>(
					ResolvedImplementationValue.class, this,
					JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES);
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
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS:
			return ((InternalEList<?>) getSystemElements()).basicRemove(otherEnd, msgs);
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__LEVELS:
			return ((InternalEList<?>) getLevels()).basicRemove(otherEnd, msgs);
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINTS:
			return ((InternalEList<?>) getEntryPoints()).basicRemove(otherEnd, msgs);
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES:
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
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS:
			return getSystemElements();
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__LEVELS:
			return getLevels();
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINTS:
			return getEntryPoints();
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES:
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
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS:
			getSystemElements().clear();
			getSystemElements().addAll((Collection<? extends Parameter_ResolvedImplementationValues>) newValue);
			return;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__LEVELS:
			getLevels().clear();
			getLevels().addAll((Collection<? extends Level_ResolvedImplementationValues>) newValue);
			return;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINTS:
			getEntryPoints().clear();
			getEntryPoints().addAll((Collection<? extends EntryPoint_ResolvedImplementationValues>) newValue);
			return;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES:
			getResultingValues().clear();
			getResultingValues().addAll((Collection<? extends ResolvedImplementationValue>) newValue);
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
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS:
			getSystemElements().clear();
			return;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__LEVELS:
			getLevels().clear();
			return;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINTS:
			getEntryPoints().clear();
			return;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES:
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
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS:
			return systemElements != null && !systemElements.isEmpty();
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__LEVELS:
			return levels != null && !levels.isEmpty();
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINTS:
			return entryPoints != null && !entryPoints.isEmpty();
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES:
			return resultingValues != null && !resultingValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResolvedImplementationValuesImpl
