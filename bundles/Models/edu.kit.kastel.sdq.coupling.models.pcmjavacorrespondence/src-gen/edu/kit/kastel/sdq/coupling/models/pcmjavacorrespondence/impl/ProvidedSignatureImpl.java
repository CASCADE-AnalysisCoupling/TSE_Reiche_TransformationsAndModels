/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedSignatureImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedSignatureImpl#getProvidedSignature <em>Provided Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedSignatureImpl extends MinimalEObjectImpl.Container implements ProvidedSignature {
	/**
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected OperationProvidedRole providedRole;

	/**
	 * The cached value of the '{@link #getProvidedSignature() <em>Provided Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedSignature()
	 * @generated
	 * @ordered
	 */
	protected OperationSignature providedSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmjavacorrespondencePackage.Literals.PROVIDED_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole getProvidedRole() {
		if (providedRole != null && ((EObject) providedRole).eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject) providedRole;
			providedRole = (OperationProvidedRole) eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_ROLE, oldProvidedRole,
							providedRole));
			}
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole basicGetProvidedRole() {
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedRole(OperationProvidedRole newProvidedRole) {
		OperationProvidedRole oldProvidedRole = providedRole;
		providedRole = newProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_ROLE, oldProvidedRole, providedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature getProvidedSignature() {
		if (providedSignature != null && ((EObject) providedSignature).eIsProxy()) {
			InternalEObject oldProvidedSignature = (InternalEObject) providedSignature;
			providedSignature = (OperationSignature) eResolveProxy(oldProvidedSignature);
			if (providedSignature != oldProvidedSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_SIGNATURE, oldProvidedSignature,
							providedSignature));
			}
		}
		return providedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature basicGetProvidedSignature() {
		return providedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedSignature(OperationSignature newProvidedSignature) {
		OperationSignature oldProvidedSignature = providedSignature;
		providedSignature = newProvidedSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_SIGNATURE, oldProvidedSignature,
					providedSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_ROLE:
			if (resolve)
				return getProvidedRole();
			return basicGetProvidedRole();
		case PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_SIGNATURE:
			if (resolve)
				return getProvidedSignature();
			return basicGetProvidedSignature();
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
		case PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_ROLE:
			setProvidedRole((OperationProvidedRole) newValue);
			return;
		case PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_SIGNATURE:
			setProvidedSignature((OperationSignature) newValue);
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
		case PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_ROLE:
			setProvidedRole((OperationProvidedRole) null);
			return;
		case PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_SIGNATURE:
			setProvidedSignature((OperationSignature) null);
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
		case PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_ROLE:
			return providedRole != null;
		case PcmjavacorrespondencePackage.PROVIDED_SIGNATURE__PROVIDED_SIGNATURE:
			return providedSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedSignatureImpl
