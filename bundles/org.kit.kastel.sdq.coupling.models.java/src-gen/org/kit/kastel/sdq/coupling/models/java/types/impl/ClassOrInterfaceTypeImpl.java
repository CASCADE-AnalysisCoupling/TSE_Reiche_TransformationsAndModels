/**
 */
package org.kit.kastel.sdq.coupling.models.java.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kit.kastel.sdq.coupling.models.java.members.Method;

import org.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import org.kit.kastel.sdq.coupling.models.java.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Or Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.types.impl.ClassOrInterfaceTypeImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassOrInterfaceTypeImpl extends ReferenceTypeImpl implements ClassOrInterfaceType {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> method;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassOrInterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.CLASS_OR_INTERFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Method> getMethod() {
		if (method == null) {
			method = new EObjectResolvingEList<Method>(Method.class, this,
					TypesPackage.CLASS_OR_INTERFACE_TYPE__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TypesPackage.CLASS_OR_INTERFACE_TYPE__METHOD:
			return getMethod();
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
		case TypesPackage.CLASS_OR_INTERFACE_TYPE__METHOD:
			getMethod().clear();
			getMethod().addAll((Collection<? extends Method>) newValue);
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
		case TypesPackage.CLASS_OR_INTERFACE_TYPE__METHOD:
			getMethod().clear();
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
		case TypesPackage.CLASS_OR_INTERFACE_TYPE__METHOD:
			return method != null && !method.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassOrInterfaceTypeImpl
