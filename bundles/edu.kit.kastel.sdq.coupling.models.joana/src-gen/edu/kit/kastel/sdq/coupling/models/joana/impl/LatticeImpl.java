/**
 */
package edu.kit.kastel.sdq.coupling.models.joana.impl;

import edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage;
import edu.kit.kastel.sdq.coupling.models.joana.Lattice;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;

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
 * An implementation of the model object '<em><b>Lattice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.impl.LatticeImpl#getMayFlow <em>May Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatticeImpl extends MinimalEObjectImpl.Container implements Lattice {
	/**
	 * The cached value of the '{@link #getMayFlow() <em>May Flow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<MayFlow> mayFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatticeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaPackage.Literals.LATTICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MayFlow> getMayFlow() {
		if (mayFlow == null) {
			mayFlow = new EObjectContainmentEList<MayFlow>(MayFlow.class, this, JoanaPackage.LATTICE__MAY_FLOW);
		}
		return mayFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JoanaPackage.LATTICE__MAY_FLOW:
			return ((InternalEList<?>) getMayFlow()).basicRemove(otherEnd, msgs);
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
		case JoanaPackage.LATTICE__MAY_FLOW:
			return getMayFlow();
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
		case JoanaPackage.LATTICE__MAY_FLOW:
			getMayFlow().clear();
			getMayFlow().addAll((Collection<? extends MayFlow>) newValue);
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
		case JoanaPackage.LATTICE__MAY_FLOW:
			getMayFlow().clear();
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
		case JoanaPackage.LATTICE__MAY_FLOW:
			return mayFlow != null && !mayFlow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LatticeImpl
