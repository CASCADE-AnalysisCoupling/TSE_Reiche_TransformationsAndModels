/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.java.types.Interface;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Interface2 Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.OperationInterface2InterfaceImpl#getPcmInterface <em>Pcm Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.OperationInterface2InterfaceImpl#getJavaInterface <em>Java Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationInterface2InterfaceImpl extends MinimalEObjectImpl.Container
		implements OperationInterface2Interface {
	/**
	 * The cached value of the '{@link #getPcmInterface() <em>Pcm Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmInterface()
	 * @generated
	 * @ordered
	 */
	protected OperationInterface pcmInterface;

	/**
	 * The cached value of the '{@link #getJavaInterface() <em>Java Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface javaInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationInterface2InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmjavacorrespondencePackage.Literals.OPERATION_INTERFACE2_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface getPcmInterface() {
		if (pcmInterface != null && ((EObject) pcmInterface).eIsProxy()) {
			InternalEObject oldPcmInterface = (InternalEObject) pcmInterface;
			pcmInterface = (OperationInterface) eResolveProxy(oldPcmInterface);
			if (pcmInterface != oldPcmInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__PCM_INTERFACE, oldPcmInterface,
							pcmInterface));
			}
		}
		return pcmInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface basicGetPcmInterface() {
		return pcmInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmInterface(OperationInterface newPcmInterface) {
		OperationInterface oldPcmInterface = pcmInterface;
		pcmInterface = newPcmInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__PCM_INTERFACE, oldPcmInterface,
					pcmInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getJavaInterface() {
		if (javaInterface != null && javaInterface.eIsProxy()) {
			InternalEObject oldJavaInterface = (InternalEObject) javaInterface;
			javaInterface = (Interface) eResolveProxy(oldJavaInterface);
			if (javaInterface != oldJavaInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__JAVA_INTERFACE,
							oldJavaInterface, javaInterface));
			}
		}
		return javaInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetJavaInterface() {
		return javaInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaInterface(Interface newJavaInterface) {
		Interface oldJavaInterface = javaInterface;
		javaInterface = newJavaInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__JAVA_INTERFACE, oldJavaInterface,
					javaInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__PCM_INTERFACE:
			if (resolve)
				return getPcmInterface();
			return basicGetPcmInterface();
		case PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__JAVA_INTERFACE:
			if (resolve)
				return getJavaInterface();
			return basicGetJavaInterface();
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
		case PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__PCM_INTERFACE:
			setPcmInterface((OperationInterface) newValue);
			return;
		case PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__JAVA_INTERFACE:
			setJavaInterface((Interface) newValue);
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
		case PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__PCM_INTERFACE:
			setPcmInterface((OperationInterface) null);
			return;
		case PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__JAVA_INTERFACE:
			setJavaInterface((Interface) null);
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
		case PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__PCM_INTERFACE:
			return pcmInterface != null;
		case PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE__JAVA_INTERFACE:
			return javaInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationInterface2InterfaceImpl
