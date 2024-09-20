/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar.impl;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Flow;
import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.joanascar.SystemElement_SCAR;

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
 * An implementation of the model object '<em><b>Source Code Analysis Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceCodeAnalysisResultImpl#getSystemElements <em>System Elements</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceCodeAnalysisResultImpl#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceCodeAnalysisResultImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceCodeAnalysisResultImpl#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceCodeAnalysisResultImpl extends MinimalEObjectImpl.Container implements SourceCodeAnalysisResult {
	/**
	 * The cached value of the '{@link #getSystemElements() <em>System Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemElement_SCAR> systemElements;

	/**
	 * The cached value of the '{@link #getEntryPoints() <em>Entry Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryPoint_SCAR> entryPoints;

	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<Level_SCAR> levels;

	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> flows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceCodeAnalysisResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanascarPackage.Literals.SOURCE_CODE_ANALYSIS_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemElement_SCAR> getSystemElements() {
		if (systemElements == null) {
			systemElements = new EObjectContainmentEList<SystemElement_SCAR>(SystemElement_SCAR.class, this,
					JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENTS);
		}
		return systemElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryPoint_SCAR> getEntryPoints() {
		if (entryPoints == null) {
			entryPoints = new EObjectContainmentEList<EntryPoint_SCAR>(EntryPoint_SCAR.class, this,
					JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__ENTRY_POINTS);
		}
		return entryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Level_SCAR> getLevels() {
		if (levels == null) {
			levels = new EObjectContainmentEList<Level_SCAR>(Level_SCAR.class, this,
					JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__LEVELS);
		}
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getFlows() {
		if (flows == null) {
			flows = new EObjectContainmentEList<Flow>(Flow.class, this,
					JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENTS:
			return ((InternalEList<?>) getSystemElements()).basicRemove(otherEnd, msgs);
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__ENTRY_POINTS:
			return ((InternalEList<?>) getEntryPoints()).basicRemove(otherEnd, msgs);
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__LEVELS:
			return ((InternalEList<?>) getLevels()).basicRemove(otherEnd, msgs);
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__FLOWS:
			return ((InternalEList<?>) getFlows()).basicRemove(otherEnd, msgs);
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
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENTS:
			return getSystemElements();
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__ENTRY_POINTS:
			return getEntryPoints();
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__LEVELS:
			return getLevels();
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__FLOWS:
			return getFlows();
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
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENTS:
			getSystemElements().clear();
			getSystemElements().addAll((Collection<? extends SystemElement_SCAR>) newValue);
			return;
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__ENTRY_POINTS:
			getEntryPoints().clear();
			getEntryPoints().addAll((Collection<? extends EntryPoint_SCAR>) newValue);
			return;
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__LEVELS:
			getLevels().clear();
			getLevels().addAll((Collection<? extends Level_SCAR>) newValue);
			return;
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__FLOWS:
			getFlows().clear();
			getFlows().addAll((Collection<? extends Flow>) newValue);
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
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENTS:
			getSystemElements().clear();
			return;
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__ENTRY_POINTS:
			getEntryPoints().clear();
			return;
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__LEVELS:
			getLevels().clear();
			return;
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__FLOWS:
			getFlows().clear();
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
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENTS:
			return systemElements != null && !systemElements.isEmpty();
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__ENTRY_POINTS:
			return entryPoints != null && !entryPoints.isEmpty();
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__LEVELS:
			return levels != null && !levels.isEmpty();
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT__FLOWS:
			return flows != null && !flows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceCodeAnalysisResultImpl
