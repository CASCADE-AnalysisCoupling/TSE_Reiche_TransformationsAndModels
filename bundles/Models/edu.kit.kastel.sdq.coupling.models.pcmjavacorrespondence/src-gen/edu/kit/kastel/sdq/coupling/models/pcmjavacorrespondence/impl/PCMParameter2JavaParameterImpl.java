/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Parameter2 Java Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMParameter2JavaParameterImpl#getPcmParameterIdentification <em>Pcm Parameter Identification</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMParameter2JavaParameterImpl#getJavaParameter <em>Java Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMParameter2JavaParameterImpl extends MinimalEObjectImpl.Container implements PCMParameter2JavaParameter {
	/**
	 * The cached value of the '{@link #getPcmParameterIdentification() <em>Pcm Parameter Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmParameterIdentification()
	 * @generated
	 * @ordered
	 */
	protected ProvidedParameterIdentification pcmParameterIdentification;

	/**
	 * The cached value of the '{@link #getJavaParameter() <em>Java Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter javaParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMParameter2JavaParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmjavacorrespondencePackage.Literals.PCM_PARAMETER2_JAVA_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedParameterIdentification getPcmParameterIdentification() {
		return pcmParameterIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcmParameterIdentification(ProvidedParameterIdentification newPcmParameterIdentification, NotificationChain msgs) {
		ProvidedParameterIdentification oldPcmParameterIdentification = pcmParameterIdentification;
		pcmParameterIdentification = newPcmParameterIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION, oldPcmParameterIdentification, newPcmParameterIdentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPcmParameterIdentification(ProvidedParameterIdentification newPcmParameterIdentification) {
		if (newPcmParameterIdentification != pcmParameterIdentification) {
			NotificationChain msgs = null;
			if (pcmParameterIdentification != null)
				msgs = ((InternalEObject)pcmParameterIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION, null, msgs);
			if (newPcmParameterIdentification != null)
				msgs = ((InternalEObject)newPcmParameterIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION, null, msgs);
			msgs = basicSetPcmParameterIdentification(newPcmParameterIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION, newPcmParameterIdentification, newPcmParameterIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getJavaParameter() {
		if (javaParameter != null && javaParameter.eIsProxy()) {
			InternalEObject oldJavaParameter = (InternalEObject)javaParameter;
			javaParameter = (Parameter)eResolveProxy(oldJavaParameter);
			if (javaParameter != oldJavaParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__JAVA_PARAMETER, oldJavaParameter, javaParameter));
			}
		}
		return javaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetJavaParameter() {
		return javaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaParameter(Parameter newJavaParameter) {
		Parameter oldJavaParameter = javaParameter;
		javaParameter = newJavaParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__JAVA_PARAMETER, oldJavaParameter, javaParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION:
				return basicSetPcmParameterIdentification(null, msgs);
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
			case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION:
				return getPcmParameterIdentification();
			case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__JAVA_PARAMETER:
				if (resolve) return getJavaParameter();
				return basicGetJavaParameter();
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
			case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION:
				setPcmParameterIdentification((ProvidedParameterIdentification)newValue);
				return;
			case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__JAVA_PARAMETER:
				setJavaParameter((Parameter)newValue);
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
			case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION:
				setPcmParameterIdentification((ProvidedParameterIdentification)null);
				return;
			case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__JAVA_PARAMETER:
				setJavaParameter((Parameter)null);
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
			case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION:
				return pcmParameterIdentification != null;
			case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER__JAVA_PARAMETER:
				return javaParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //PCMParameter2JavaParameterImpl
