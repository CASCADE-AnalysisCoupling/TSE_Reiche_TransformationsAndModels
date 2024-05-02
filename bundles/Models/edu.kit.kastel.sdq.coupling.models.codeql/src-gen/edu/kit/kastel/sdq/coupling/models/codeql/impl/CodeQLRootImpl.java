/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getTainttrackingRoot() <em>Tainttracking Root</em>}' containment reference.
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
	public TainttrackingRoot getTainttrackingRoot() {
		return tainttrackingRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTainttrackingRoot(TainttrackingRoot newTainttrackingRoot, NotificationChain msgs) {
		TainttrackingRoot oldTainttrackingRoot = tainttrackingRoot;
		tainttrackingRoot = newTainttrackingRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT, oldTainttrackingRoot, newTainttrackingRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTainttrackingRoot(TainttrackingRoot newTainttrackingRoot) {
		if (newTainttrackingRoot != tainttrackingRoot) {
			NotificationChain msgs = null;
			if (tainttrackingRoot != null)
				msgs = ((InternalEObject)tainttrackingRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT, null, msgs);
			if (newTainttrackingRoot != null)
				msgs = ((InternalEObject)newTainttrackingRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT, null, msgs);
			msgs = basicSetTainttrackingRoot(newTainttrackingRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT, newTainttrackingRoot, newTainttrackingRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT:
				return basicSetTainttrackingRoot(null, msgs);
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
			case CodeqlPackage.CODE_QL_ROOT__TAINTTRACKING_ROOT:
				return getTainttrackingRoot();
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
				setTainttrackingRoot((TainttrackingRoot)newValue);
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
				setTainttrackingRoot((TainttrackingRoot)null);
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
