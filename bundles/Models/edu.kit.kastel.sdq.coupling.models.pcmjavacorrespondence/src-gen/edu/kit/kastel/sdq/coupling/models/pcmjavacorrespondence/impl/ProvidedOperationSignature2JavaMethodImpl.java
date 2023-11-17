/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.java.members.Method;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Operation Signature2 Java Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedOperationSignature2JavaMethodImpl#getPcmMethod <em>Pcm Method</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedOperationSignature2JavaMethodImpl#getJavaMethod <em>Java Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedOperationSignature2JavaMethodImpl extends MinimalEObjectImpl.Container
		implements ProvidedOperationSignature2JavaMethod {
	/**
	 * The cached value of the '{@link #getPcmMethod() <em>Pcm Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmMethod()
	 * @generated
	 * @ordered
	 */
	protected ProvidedSignature pcmMethod;

	/**
	 * The cached value of the '{@link #getJavaMethod() <em>Java Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaMethod()
	 * @generated
	 * @ordered
	 */
	protected Method javaMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedOperationSignature2JavaMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmjavacorrespondencePackage.Literals.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedSignature getPcmMethod() {
		return pcmMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcmMethod(ProvidedSignature newPcmMethod, NotificationChain msgs) {
		ProvidedSignature oldPcmMethod = pcmMethod;
		pcmMethod = newPcmMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD, oldPcmMethod,
					newPcmMethod);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmMethod(ProvidedSignature newPcmMethod) {
		if (newPcmMethod != pcmMethod) {
			NotificationChain msgs = null;
			if (pcmMethod != null)
				msgs = ((InternalEObject) pcmMethod).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD,
						null, msgs);
			if (newPcmMethod != null)
				msgs = ((InternalEObject) newPcmMethod).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD,
						null, msgs);
			msgs = basicSetPcmMethod(newPcmMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD, newPcmMethod,
					newPcmMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getJavaMethod() {
		if (javaMethod != null && javaMethod.eIsProxy()) {
			InternalEObject oldJavaMethod = (InternalEObject) javaMethod;
			javaMethod = (Method) eResolveProxy(oldJavaMethod);
			if (javaMethod != oldJavaMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__JAVA_METHOD,
							oldJavaMethod, javaMethod));
			}
		}
		return javaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetJavaMethod() {
		return javaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaMethod(Method newJavaMethod) {
		Method oldJavaMethod = javaMethod;
		javaMethod = newJavaMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__JAVA_METHOD, oldJavaMethod,
					javaMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD:
			return basicSetPcmMethod(null, msgs);
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
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD:
			return getPcmMethod();
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__JAVA_METHOD:
			if (resolve)
				return getJavaMethod();
			return basicGetJavaMethod();
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
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD:
			setPcmMethod((ProvidedSignature) newValue);
			return;
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__JAVA_METHOD:
			setJavaMethod((Method) newValue);
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
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD:
			setPcmMethod((ProvidedSignature) null);
			return;
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__JAVA_METHOD:
			setJavaMethod((Method) null);
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
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD:
			return pcmMethod != null;
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__JAVA_METHOD:
			return javaMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedOperationSignature2JavaMethodImpl
