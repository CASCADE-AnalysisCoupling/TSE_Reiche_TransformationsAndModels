/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.code.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Method;
import edu.kit.kastel.sdq.coupling.models.codeql.code.MethodAccess;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.code.impl.MethodAccessImpl#getAccessingMethod <em>Accessing Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodAccessImpl extends ExpressionImpl implements MethodAccess {
	/**
	 * The cached value of the '{@link #getAccessingMethod() <em>Accessing Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessingMethod()
	 * @generated
	 * @ordered
	 */
	protected Method accessingMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.METHOD_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method getAccessingMethod() {
		if (accessingMethod != null && accessingMethod.eIsProxy()) {
			InternalEObject oldAccessingMethod = (InternalEObject) accessingMethod;
			accessingMethod = (Method) eResolveProxy(oldAccessingMethod);
			if (accessingMethod != oldAccessingMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodePackage.METHOD_ACCESS__ACCESSING_METHOD, oldAccessingMethod, accessingMethod));
			}
		}
		return accessingMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetAccessingMethod() {
		return accessingMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessingMethod(Method newAccessingMethod) {
		Method oldAccessingMethod = accessingMethod;
		accessingMethod = newAccessingMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.METHOD_ACCESS__ACCESSING_METHOD,
					oldAccessingMethod, accessingMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodePackage.METHOD_ACCESS__ACCESSING_METHOD:
			if (resolve)
				return getAccessingMethod();
			return basicGetAccessingMethod();
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
		case CodePackage.METHOD_ACCESS__ACCESSING_METHOD:
			setAccessingMethod((Method) newValue);
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
		case CodePackage.METHOD_ACCESS__ACCESSING_METHOD:
			setAccessingMethod((Method) null);
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
		case CodePackage.METHOD_ACCESS__ACCESSING_METHOD:
			return accessingMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodAccessImpl
