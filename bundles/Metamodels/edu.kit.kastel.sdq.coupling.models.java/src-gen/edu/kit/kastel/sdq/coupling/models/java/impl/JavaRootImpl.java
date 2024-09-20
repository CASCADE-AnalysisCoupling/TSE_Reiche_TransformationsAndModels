/**
 */
package edu.kit.kastel.sdq.coupling.models.java.impl;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;

import edu.kit.kastel.sdq.coupling.models.java.types.CollectionType;
import edu.kit.kastel.sdq.coupling.models.java.types.PrimitiveType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.java.impl.JavaRootImpl#getPrimitivetypes <em>Primitivetypes</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.java.impl.JavaRootImpl#getCollectiontypes <em>Collectiontypes</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.java.impl.JavaRootImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaRootImpl extends MinimalEObjectImpl.Container implements JavaRoot {
	/**
	 * The cached value of the '{@link #getPrimitivetypes() <em>Primitivetypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitivetypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveType> primitivetypes;

	/**
	 * The cached value of the '{@link #getCollectiontypes() <em>Collectiontypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectiontypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectionType> collectiontypes;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.kastel.sdq.coupling.models.java.Package package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JAVA_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveType> getPrimitivetypes() {
		if (primitivetypes == null) {
			primitivetypes = new EObjectContainmentEList<PrimitiveType>(PrimitiveType.class, this, JavaPackage.JAVA_ROOT__PRIMITIVETYPES);
		}
		return primitivetypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectionType> getCollectiontypes() {
		if (collectiontypes == null) {
			collectiontypes = new EObjectContainmentEList<CollectionType>(CollectionType.class, this, JavaPackage.JAVA_ROOT__COLLECTIONTYPES);
		}
		return collectiontypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.kastel.sdq.coupling.models.java.Package getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(edu.kit.kastel.sdq.coupling.models.java.Package newPackage, NotificationChain msgs) {
		edu.kit.kastel.sdq.coupling.models.java.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.JAVA_ROOT__PACKAGE, oldPackage, newPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(edu.kit.kastel.sdq.coupling.models.java.Package newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.JAVA_ROOT__PACKAGE, null, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.JAVA_ROOT__PACKAGE, null, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JAVA_ROOT__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.JAVA_ROOT__PRIMITIVETYPES:
				return ((InternalEList<?>)getPrimitivetypes()).basicRemove(otherEnd, msgs);
			case JavaPackage.JAVA_ROOT__COLLECTIONTYPES:
				return ((InternalEList<?>)getCollectiontypes()).basicRemove(otherEnd, msgs);
			case JavaPackage.JAVA_ROOT__PACKAGE:
				return basicSetPackage(null, msgs);
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
			case JavaPackage.JAVA_ROOT__PRIMITIVETYPES:
				return getPrimitivetypes();
			case JavaPackage.JAVA_ROOT__COLLECTIONTYPES:
				return getCollectiontypes();
			case JavaPackage.JAVA_ROOT__PACKAGE:
				return getPackage();
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
			case JavaPackage.JAVA_ROOT__PRIMITIVETYPES:
				getPrimitivetypes().clear();
				getPrimitivetypes().addAll((Collection<? extends PrimitiveType>)newValue);
				return;
			case JavaPackage.JAVA_ROOT__COLLECTIONTYPES:
				getCollectiontypes().clear();
				getCollectiontypes().addAll((Collection<? extends CollectionType>)newValue);
				return;
			case JavaPackage.JAVA_ROOT__PACKAGE:
				setPackage((edu.kit.kastel.sdq.coupling.models.java.Package)newValue);
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
			case JavaPackage.JAVA_ROOT__PRIMITIVETYPES:
				getPrimitivetypes().clear();
				return;
			case JavaPackage.JAVA_ROOT__COLLECTIONTYPES:
				getCollectiontypes().clear();
				return;
			case JavaPackage.JAVA_ROOT__PACKAGE:
				setPackage((edu.kit.kastel.sdq.coupling.models.java.Package)null);
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
			case JavaPackage.JAVA_ROOT__PRIMITIVETYPES:
				return primitivetypes != null && !primitivetypes.isEmpty();
			case JavaPackage.JAVA_ROOT__COLLECTIONTYPES:
				return collectiontypes != null && !collectiontypes.isEmpty();
			case JavaPackage.JAVA_ROOT__PACKAGE:
				return package_ != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaRootImpl
