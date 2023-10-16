/**
 */
package org.kit.kastel.sdq.coupling.models.java.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kit.kastel.sdq.coupling.models.identifier.impl.EntityImpl;

import org.kit.kastel.sdq.coupling.models.java.JavaPackage;

import org.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.impl.PackageImpl#getSubpackage <em>Subpackage</em>}</li>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.impl.PackageImpl#getClassorinterface <em>Classorinterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends EntityImpl implements org.kit.kastel.sdq.coupling.models.java.Package {
	/**
	 * The cached value of the '{@link #getSubpackage() <em>Subpackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpackage()
	 * @generated
	 * @ordered
	 */
	protected EList<org.kit.kastel.sdq.coupling.models.java.Package> subpackage;

	/**
	 * The cached value of the '{@link #getClassorinterface() <em>Classorinterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassorinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassOrInterfaceType> classorinterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.kit.kastel.sdq.coupling.models.java.Package> getSubpackage() {
		if (subpackage == null) {
			subpackage = new EObjectContainmentEList<org.kit.kastel.sdq.coupling.models.java.Package>(
					org.kit.kastel.sdq.coupling.models.java.Package.class, this, JavaPackage.PACKAGE__SUBPACKAGE);
		}
		return subpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassOrInterfaceType> getClassorinterface() {
		if (classorinterface == null) {
			classorinterface = new EObjectContainmentEList<ClassOrInterfaceType>(ClassOrInterfaceType.class, this,
					JavaPackage.PACKAGE__CLASSORINTERFACE);
		}
		return classorinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaPackage.PACKAGE__SUBPACKAGE:
			return ((InternalEList<?>) getSubpackage()).basicRemove(otherEnd, msgs);
		case JavaPackage.PACKAGE__CLASSORINTERFACE:
			return ((InternalEList<?>) getClassorinterface()).basicRemove(otherEnd, msgs);
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
		case JavaPackage.PACKAGE__SUBPACKAGE:
			return getSubpackage();
		case JavaPackage.PACKAGE__CLASSORINTERFACE:
			return getClassorinterface();
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
		case JavaPackage.PACKAGE__SUBPACKAGE:
			getSubpackage().clear();
			getSubpackage().addAll((Collection<? extends org.kit.kastel.sdq.coupling.models.java.Package>) newValue);
			return;
		case JavaPackage.PACKAGE__CLASSORINTERFACE:
			getClassorinterface().clear();
			getClassorinterface().addAll((Collection<? extends ClassOrInterfaceType>) newValue);
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
		case JavaPackage.PACKAGE__SUBPACKAGE:
			getSubpackage().clear();
			return;
		case JavaPackage.PACKAGE__CLASSORINTERFACE:
			getClassorinterface().clear();
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
		case JavaPackage.PACKAGE__SUBPACKAGE:
			return subpackage != null && !subpackage.isEmpty();
		case JavaPackage.PACKAGE__CLASSORINTERFACE:
			return classorinterface != null && !classorinterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
