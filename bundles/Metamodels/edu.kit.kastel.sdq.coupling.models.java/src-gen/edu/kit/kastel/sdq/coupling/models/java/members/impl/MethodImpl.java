/**
 */
package edu.kit.kastel.sdq.coupling.models.java.members.impl;

import edu.kit.kastel.sdq.coupling.models.identifier.impl.EntityImpl;

import edu.kit.kastel.sdq.coupling.models.java.members.MembersPackage;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

import edu.kit.kastel.sdq.coupling.models.java.types.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.java.members.impl.MethodImpl#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.java.members.impl.MethodImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends EntityImpl implements Method {
	/**
	 * The cached value of the '{@link #getReturntype() <em>Returntype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturntype()
	 * @generated
	 * @ordered
	 */
	protected Type returntype;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MembersPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturntype() {
		if (returntype != null && returntype.eIsProxy()) {
			InternalEObject oldReturntype = (InternalEObject)returntype;
			returntype = (Type)eResolveProxy(oldReturntype);
			if (returntype != oldReturntype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MembersPackage.METHOD__RETURNTYPE, oldReturntype, returntype));
			}
		}
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturntype() {
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturntype(Type newReturntype) {
		Type oldReturntype = returntype;
		returntype = newReturntype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MembersPackage.METHOD__RETURNTYPE, oldReturntype, returntype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, MembersPackage.METHOD__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MembersPackage.METHOD__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case MembersPackage.METHOD__RETURNTYPE:
				if (resolve) return getReturntype();
				return basicGetReturntype();
			case MembersPackage.METHOD__PARAMETER:
				return getParameter();
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
			case MembersPackage.METHOD__RETURNTYPE:
				setReturntype((Type)newValue);
				return;
			case MembersPackage.METHOD__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
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
			case MembersPackage.METHOD__RETURNTYPE:
				setReturntype((Type)null);
				return;
			case MembersPackage.METHOD__PARAMETER:
				getParameter().clear();
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
			case MembersPackage.METHOD__RETURNTYPE:
				return returntype != null;
			case MembersPackage.METHOD__PARAMETER:
				return parameter != null && !parameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodImpl
