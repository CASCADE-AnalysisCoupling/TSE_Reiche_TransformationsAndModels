/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Operation Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedOperationIdentificationImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedOperationIdentificationImpl#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedOperationIdentificationImpl extends MinimalEObjectImpl.Container
		implements ProvidedOperationIdentification {
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
	 * The cached value of the '{@link #getOperationSignature() <em>Operation Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSignature()
	 * @generated
	 * @ordered
	 */
	protected OperationSignature operationSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedOperationIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowanalysisextensionPackage.Literals.PROVIDED_OPERATION_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole getProvidedRole() {
		if (providedRole != null && providedRole.eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject) providedRole;
			providedRole = (OperationProvidedRole) eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__PROVIDED_ROLE,
							oldProvidedRole, providedRole));
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
					DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__PROVIDED_ROLE, oldProvidedRole,
					providedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature getOperationSignature() {
		if (operationSignature != null && operationSignature.eIsProxy()) {
			InternalEObject oldOperationSignature = (InternalEObject) operationSignature;
			operationSignature = (OperationSignature) eResolveProxy(oldOperationSignature);
			if (operationSignature != oldOperationSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__OPERATION_SIGNATURE,
							oldOperationSignature, operationSignature));
			}
		}
		return operationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature basicGetOperationSignature() {
		return operationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationSignature(OperationSignature newOperationSignature) {
		OperationSignature oldOperationSignature = operationSignature;
		operationSignature = newOperationSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__OPERATION_SIGNATURE,
					oldOperationSignature, operationSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__PROVIDED_ROLE:
			if (resolve)
				return getProvidedRole();
			return basicGetProvidedRole();
		case DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__OPERATION_SIGNATURE:
			if (resolve)
				return getOperationSignature();
			return basicGetOperationSignature();
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
		case DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__PROVIDED_ROLE:
			setProvidedRole((OperationProvidedRole) newValue);
			return;
		case DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__OPERATION_SIGNATURE:
			setOperationSignature((OperationSignature) newValue);
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
		case DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__PROVIDED_ROLE:
			setProvidedRole((OperationProvidedRole) null);
			return;
		case DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__OPERATION_SIGNATURE:
			setOperationSignature((OperationSignature) null);
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
		case DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__PROVIDED_ROLE:
			return providedRole != null;
		case DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION__OPERATION_SIGNATURE:
			return operationSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedOperationIdentificationImpl
