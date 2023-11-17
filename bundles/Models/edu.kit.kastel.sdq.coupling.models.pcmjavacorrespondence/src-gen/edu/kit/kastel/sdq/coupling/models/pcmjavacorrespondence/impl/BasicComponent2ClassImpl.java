/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.repository.BasicComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Component2 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.BasicComponent2ClassImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.BasicComponent2ClassImpl#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicComponent2ClassImpl extends MinimalEObjectImpl.Container implements BasicComponent2Class {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected BasicComponent component;

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
	protected BasicComponent2ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmjavacorrespondencePackage.Literals.BASIC_COMPONENT2_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponent getComponent() {
		if (component != null && ((EObject) component).eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (BasicComponent) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(BasicComponent newComponent) {
		BasicComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__COMPONENT, oldComponent, component));
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
							PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__JAVA_CLASS, oldJavaClass, javaClass));
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
					PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__JAVA_CLASS, oldJavaClass, javaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__JAVA_CLASS:
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
		case PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__COMPONENT:
			setComponent((BasicComponent) newValue);
			return;
		case PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__JAVA_CLASS:
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
		case PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__COMPONENT:
			setComponent((BasicComponent) null);
			return;
		case PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__JAVA_CLASS:
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
		case PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__COMPONENT:
			return component != null;
		case PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS__JAVA_CLASS:
			return javaClass != null;
		}
		return super.eIsSet(featureID);
	}

} //BasicComponent2ClassImpl
