/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlows;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

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
 * An implementation of the model object '<em><b>Allowed Flows</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowsImpl#getAllowedFlows <em>Allowed Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllowedFlowsImpl extends MinimalEObjectImpl.Container implements AllowedFlows {
	/**
	 * The cached value of the '{@link #getAllowedFlows() <em>Allowed Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AllowedFlow> allowedFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedFlowsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TainttrackingPackage.Literals.ALLOWED_FLOWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllowedFlow> getAllowedFlows() {
		if (allowedFlows == null) {
			allowedFlows = new EObjectContainmentEList<AllowedFlow>(AllowedFlow.class, this, TainttrackingPackage.ALLOWED_FLOWS__ALLOWED_FLOWS);
		}
		return allowedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TainttrackingPackage.ALLOWED_FLOWS__ALLOWED_FLOWS:
				return ((InternalEList<?>)getAllowedFlows()).basicRemove(otherEnd, msgs);
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
			case TainttrackingPackage.ALLOWED_FLOWS__ALLOWED_FLOWS:
				return getAllowedFlows();
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
			case TainttrackingPackage.ALLOWED_FLOWS__ALLOWED_FLOWS:
				getAllowedFlows().clear();
				getAllowedFlows().addAll((Collection<? extends AllowedFlow>)newValue);
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
			case TainttrackingPackage.ALLOWED_FLOWS__ALLOWED_FLOWS:
				getAllowedFlows().clear();
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
			case TainttrackingPackage.ALLOWED_FLOWS__ALLOWED_FLOWS:
				return allowedFlows != null && !allowedFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllowedFlowsImpl
