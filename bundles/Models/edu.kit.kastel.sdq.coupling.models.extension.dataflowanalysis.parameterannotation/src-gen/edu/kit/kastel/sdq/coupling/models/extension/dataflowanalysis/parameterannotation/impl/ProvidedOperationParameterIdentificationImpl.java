/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Operation Parameter Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ProvidedOperationParameterIdentificationImpl#getProvidedRole <em>Provided Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedOperationParameterIdentificationImpl extends GeneralOperationParameterIdentificationImpl
		implements ProvidedOperationParameterIdentification {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedOperationParameterIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParameterannotationPackage.Literals.PROVIDED_OPERATION_PARAMETER_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationProvidedRole getProvidedRole() {
		if (providedRole != null && providedRole.eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject) providedRole;
			providedRole = (OperationProvidedRole) eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ParameterannotationPackage.PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__PROVIDED_ROLE,
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
	@Override
	public void setProvidedRole(OperationProvidedRole newProvidedRole) {
		OperationProvidedRole oldProvidedRole = providedRole;
		providedRole = newProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ParameterannotationPackage.PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__PROVIDED_ROLE,
					oldProvidedRole, providedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ParameterannotationPackage.PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__PROVIDED_ROLE:
			if (resolve)
				return getProvidedRole();
			return basicGetProvidedRole();
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
		case ParameterannotationPackage.PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__PROVIDED_ROLE:
			setProvidedRole((OperationProvidedRole) newValue);
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
		case ParameterannotationPackage.PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__PROVIDED_ROLE:
			setProvidedRole((OperationProvidedRole) null);
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
		case ParameterannotationPackage.PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__PROVIDED_ROLE:
			return providedRole != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedOperationParameterIdentificationImpl
