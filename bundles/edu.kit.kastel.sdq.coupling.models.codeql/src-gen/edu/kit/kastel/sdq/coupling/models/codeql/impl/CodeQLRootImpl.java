/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeRoot;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.DataFlowRoot;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeQLRootImpl#getCodeRoot <em>Code Root</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeQLRootImpl#getDataFlowRoot <em>Data Flow Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeQLRootImpl extends MinimalEObjectImpl.Container implements CodeQLRoot {
	/**
	 * The cached value of the '{@link #getCodeRoot() <em>Code Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRoot()
	 * @generated
	 * @ordered
	 */
	protected CodeRoot codeRoot;

	/**
	 * The cached value of the '{@link #getDataFlowRoot() <em>Data Flow Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFlowRoot()
	 * @generated
	 * @ordered
	 */
	protected DataFlowRoot dataFlowRoot;

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
	public CodeRoot getCodeRoot() {
		if (codeRoot != null && codeRoot.eIsProxy()) {
			InternalEObject oldCodeRoot = (InternalEObject) codeRoot;
			codeRoot = (CodeRoot) eResolveProxy(oldCodeRoot);
			if (codeRoot != oldCodeRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodeqlPackage.CODE_QL_ROOT__CODE_ROOT,
							oldCodeRoot, codeRoot));
			}
		}
		return codeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeRoot basicGetCodeRoot() {
		return codeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeRoot(CodeRoot newCodeRoot) {
		CodeRoot oldCodeRoot = codeRoot;
		codeRoot = newCodeRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeqlPackage.CODE_QL_ROOT__CODE_ROOT, oldCodeRoot,
					codeRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRoot getDataFlowRoot() {
		if (dataFlowRoot != null && dataFlowRoot.eIsProxy()) {
			InternalEObject oldDataFlowRoot = (InternalEObject) dataFlowRoot;
			dataFlowRoot = (DataFlowRoot) eResolveProxy(oldDataFlowRoot);
			if (dataFlowRoot != oldDataFlowRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlPackage.CODE_QL_ROOT__DATA_FLOW_ROOT, oldDataFlowRoot, dataFlowRoot));
			}
		}
		return dataFlowRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowRoot basicGetDataFlowRoot() {
		return dataFlowRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFlowRoot(DataFlowRoot newDataFlowRoot) {
		DataFlowRoot oldDataFlowRoot = dataFlowRoot;
		dataFlowRoot = newDataFlowRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeqlPackage.CODE_QL_ROOT__DATA_FLOW_ROOT,
					oldDataFlowRoot, dataFlowRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlPackage.CODE_QL_ROOT__CODE_ROOT:
			if (resolve)
				return getCodeRoot();
			return basicGetCodeRoot();
		case CodeqlPackage.CODE_QL_ROOT__DATA_FLOW_ROOT:
			if (resolve)
				return getDataFlowRoot();
			return basicGetDataFlowRoot();
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
		case CodeqlPackage.CODE_QL_ROOT__CODE_ROOT:
			setCodeRoot((CodeRoot) newValue);
			return;
		case CodeqlPackage.CODE_QL_ROOT__DATA_FLOW_ROOT:
			setDataFlowRoot((DataFlowRoot) newValue);
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
		case CodeqlPackage.CODE_QL_ROOT__CODE_ROOT:
			setCodeRoot((CodeRoot) null);
			return;
		case CodeqlPackage.CODE_QL_ROOT__DATA_FLOW_ROOT:
			setDataFlowRoot((DataFlowRoot) null);
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
		case CodeqlPackage.CODE_QL_ROOT__CODE_ROOT:
			return codeRoot != null;
		case CodeqlPackage.CODE_QL_ROOT__DATA_FLOW_ROOT:
			return dataFlowRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeQLRootImpl
