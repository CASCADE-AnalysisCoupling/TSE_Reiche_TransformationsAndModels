/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification;

import edu.kit.kastel.sdq.coupling.models.identifier.impl.IdentifiedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Parameter Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterIdentificationImpl#getProvidedOperation <em>Provided Operation</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterIdentificationImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedParameterIdentificationImpl extends IdentifiedElementImpl
		implements ProvidedParameterIdentification {
	/**
	 * The cached value of the '{@link #getProvidedOperation() <em>Provided Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedOperation()
	 * @generated
	 * @ordered
	 */
	protected ProvidedOperationIdentification providedOperation;

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
		return DataflowanalysisextensionPackage.Literals.PROVIDED_PARAMETER_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedOperationIdentification getProvidedOperation() {
		return providedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedOperation(ProvidedOperationIdentification newProvidedOperation,
			NotificationChain msgs) {
		ProvidedOperationIdentification oldProvidedOperation = providedOperation;
		providedOperation = newProvidedOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION,
					oldProvidedOperation, newProvidedOperation);
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
	public void setProvidedOperation(ProvidedOperationIdentification newProvidedOperation) {
		if (newProvidedOperation != providedOperation) {
			NotificationChain msgs = null;
			if (providedOperation != null)
				msgs = ((InternalEObject) providedOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION, null,
						msgs);
			if (newProvidedOperation != null)
				msgs = ((InternalEObject) newProvidedOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION, null,
						msgs);
			msgs = basicSetProvidedOperation(newProvidedOperation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION,
					newProvidedOperation, newProvidedOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (Parameter) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER, oldParameter,
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
					DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER, oldParameter,
					parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION:
			return basicSetProvidedOperation(null, msgs);
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
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION:
			return getProvidedOperation();
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER:
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
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION:
			setProvidedOperation((ProvidedOperationIdentification) newValue);
			return;
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER:
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
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION:
			setProvidedOperation((ProvidedOperationIdentification) null);
			return;
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER:
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
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION:
			return providedOperation != null;
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER:
			return parameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedParameterIdentificationImpl
