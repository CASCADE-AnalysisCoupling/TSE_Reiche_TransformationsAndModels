/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code QL Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeQLRootImpl#getTainttrackingRoot <em>Tainttracking Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeQLRootImpl extends MinimalEObjectImpl.Container implements CodeQLRoot {
	/**
	 * The cached value of the '{@link #getTainttrackingRoot() <em>Tainttracking Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTainttrackingRoot()
	 * @generated
	 * @ordered
	 */
	protected TainttrackingRoot tainttrackingRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeQLRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlPackage.Literals.CODE_QL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TainttrackingRoot getTainttrackingRoot() {
		if (tainttrackingRoot != null && tainttrackingRoot.eIsProxy()) {
			InternalEObject oldTainttrackingRoot = (InternalEObject) tainttrackingRoot;
			tainttrackingRoot = (TainttrackingRoot) eResolveProxy(oldTainttrackingRoot);
			if (tainttrackingRoot != oldTainttrackingRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT, oldTainttrackingRoot, tainttrackingRoot));
			}
		}
		return tainttrackingRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TainttrackingRoot basicGetTainttrackingRoot() {
		return tainttrackingRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTainttrackingRoot(TainttrackingRoot newTainttrackingRoot) {
		TainttrackingRoot oldTainttrackingRoot = tainttrackingRoot;
		tainttrackingRoot = newTainttrackingRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT,
					oldTainttrackingRoot, tainttrackingRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT:
			if (resolve)
				return getTainttrackingRoot();
			return basicGetTainttrackingRoot();
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
		case CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT:
			setTainttrackingRoot((TainttrackingRoot) newValue);
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
		case CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT:
			setTainttrackingRoot((TainttrackingRoot) null);
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
		case CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT:
			return tainttrackingRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeQLRootImpl
