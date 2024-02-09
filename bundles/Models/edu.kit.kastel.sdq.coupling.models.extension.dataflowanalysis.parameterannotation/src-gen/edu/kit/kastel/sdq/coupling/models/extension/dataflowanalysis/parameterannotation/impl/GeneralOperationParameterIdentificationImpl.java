/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Operation Parameter Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.GeneralOperationParameterIdentificationImpl#getOperationSignature <em>Operation Signature</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.GeneralOperationParameterIdentificationImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralOperationParameterIdentificationImpl extends MinimalEObjectImpl.Container
		implements GeneralOperationParameterIdentification {
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
	protected GeneralOperationParameterIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParameterannotationPackage.Literals.GENERAL_OPERATION_PARAMETER_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationSignature getOperationSignature() {
		if (operationSignature != null && operationSignature.eIsProxy()) {
			InternalEObject oldOperationSignature = (InternalEObject) operationSignature;
			operationSignature = (OperationSignature) eResolveProxy(oldOperationSignature);
			if (operationSignature != oldOperationSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE,
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
	@Override
	public void setOperationSignature(OperationSignature newOperationSignature) {
		OperationSignature oldOperationSignature = operationSignature;
		operationSignature = newOperationSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE,
					oldOperationSignature, operationSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (Parameter) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER,
							oldParameter, parameter));
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
	@Override
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER, oldParameter,
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
		case ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE:
			if (resolve)
				return getOperationSignature();
			return basicGetOperationSignature();
		case ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER:
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
		case ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE:
			setOperationSignature((OperationSignature) newValue);
			return;
		case ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER:
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
		case ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE:
			setOperationSignature((OperationSignature) null);
			return;
		case ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER:
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
		case ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE:
			return operationSignature != null;
		case ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER:
			return parameter != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralOperationParameterIdentificationImpl
