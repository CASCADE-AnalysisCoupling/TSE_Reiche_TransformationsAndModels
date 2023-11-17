/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.repository.CompositeDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Data Type2 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.CompositeDataType2ClassImpl#getCompositeDataType <em>Composite Data Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.CompositeDataType2ClassImpl#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeDataType2ClassImpl extends MinimalEObjectImpl.Container implements CompositeDataType2Class {
	/**
	 * The cached value of the '{@link #getCompositeDataType() <em>Composite Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeDataType()
	 * @generated
	 * @ordered
	 */
	protected CompositeDataType compositeDataType;

	/**
	 * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClass()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.kastel.sdq.coupling.models.java.types.Class javaClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeDataType2ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmjavacorrespondencePackage.Literals.COMPOSITE_DATA_TYPE2_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDataType getCompositeDataType() {
		if (compositeDataType != null && ((EObject) compositeDataType).eIsProxy()) {
			InternalEObject oldCompositeDataType = (InternalEObject) compositeDataType;
			compositeDataType = (CompositeDataType) eResolveProxy(oldCompositeDataType);
			if (compositeDataType != oldCompositeDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__COMPOSITE_DATA_TYPE,
							oldCompositeDataType, compositeDataType));
			}
		}
		return compositeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDataType basicGetCompositeDataType() {
		return compositeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeDataType(CompositeDataType newCompositeDataType) {
		CompositeDataType oldCompositeDataType = compositeDataType;
		compositeDataType = newCompositeDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__COMPOSITE_DATA_TYPE, oldCompositeDataType,
					compositeDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.kastel.sdq.coupling.models.java.types.Class getJavaClass() {
		if (javaClass != null && javaClass.eIsProxy()) {
			InternalEObject oldJavaClass = (InternalEObject) javaClass;
			javaClass = (edu.kit.kastel.sdq.coupling.models.java.types.Class) eResolveProxy(oldJavaClass);
			if (javaClass != oldJavaClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__JAVA_CLASS, oldJavaClass,
							javaClass));
			}
		}
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.kastel.sdq.coupling.models.java.types.Class basicGetJavaClass() {
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaClass(edu.kit.kastel.sdq.coupling.models.java.types.Class newJavaClass) {
		edu.kit.kastel.sdq.coupling.models.java.types.Class oldJavaClass = javaClass;
		javaClass = newJavaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__JAVA_CLASS, oldJavaClass, javaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__COMPOSITE_DATA_TYPE:
			if (resolve)
				return getCompositeDataType();
			return basicGetCompositeDataType();
		case PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__JAVA_CLASS:
			if (resolve)
				return getJavaClass();
			return basicGetJavaClass();
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
		case PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__COMPOSITE_DATA_TYPE:
			setCompositeDataType((CompositeDataType) newValue);
			return;
		case PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__JAVA_CLASS:
			setJavaClass((edu.kit.kastel.sdq.coupling.models.java.types.Class) newValue);
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
		case PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__COMPOSITE_DATA_TYPE:
			setCompositeDataType((CompositeDataType) null);
			return;
		case PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__JAVA_CLASS:
			setJavaClass((edu.kit.kastel.sdq.coupling.models.java.types.Class) null);
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
		case PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__COMPOSITE_DATA_TYPE:
			return compositeDataType != null;
		case PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS__JAVA_CLASS:
			return javaClass != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeDataType2ClassImpl
