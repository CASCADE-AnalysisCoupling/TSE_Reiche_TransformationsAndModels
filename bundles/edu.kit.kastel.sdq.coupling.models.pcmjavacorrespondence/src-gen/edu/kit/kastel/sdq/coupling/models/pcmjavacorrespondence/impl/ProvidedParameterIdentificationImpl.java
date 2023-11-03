/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Parameter Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedParameterIdentificationImpl#getProvidedSignature <em>Provided Signature</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedParameterIdentificationImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedParameterIdentificationImpl extends MinimalEObjectImpl.Container
		implements ProvidedParameterIdentification {
	/**
	 * The cached value of the '{@link #getProvidedSignature() <em>Provided Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedSignature()
	 * @generated
	 * @ordered
	 */
	protected ProvidedSignature providedSignature;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedParameterIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmjavacorrespondencePackage.Literals.PROVIDED_PARAMETER_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedSignature getProvidedSignature() {
		if (providedSignature != null && providedSignature.eIsProxy()) {
			InternalEObject oldProvidedSignature = (InternalEObject) providedSignature;
			providedSignature = (ProvidedSignature) eResolveProxy(oldProvidedSignature);
			if (providedSignature != oldProvidedSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_SIGNATURE,
							oldProvidedSignature, providedSignature));
			}
		}
		return providedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedSignature basicGetProvidedSignature() {
		return providedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedSignature(ProvidedSignature newProvidedSignature) {
		ProvidedSignature oldProvidedSignature = providedSignature;
		providedSignature = newProvidedSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_SIGNATURE,
					oldProvidedSignature, providedSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && ((EObject) parameter).eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (Parameter) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER, oldParameter,
							parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER, oldParameter,
					parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_SIGNATURE:
			if (resolve)
				return getProvidedSignature();
			return basicGetProvidedSignature();
		case PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
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
		case PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_SIGNATURE:
			setProvidedSignature((ProvidedSignature) newValue);
			return;
		case PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER:
			setParameter((Parameter) newValue);
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
		case PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_SIGNATURE:
			setProvidedSignature((ProvidedSignature) null);
			return;
		case PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER:
			setParameter((Parameter) null);
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
		case PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_SIGNATURE:
			return providedSignature != null;
		case PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER:
			return parameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedParameterIdentificationImpl
