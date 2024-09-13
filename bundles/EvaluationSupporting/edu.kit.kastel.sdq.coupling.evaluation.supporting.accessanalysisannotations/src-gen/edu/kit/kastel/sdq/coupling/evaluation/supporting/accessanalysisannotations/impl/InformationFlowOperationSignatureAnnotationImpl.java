/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowOperationSignatureAnnotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow Operation Signature Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowOperationSignatureAnnotationImpl#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InformationFlowOperationSignatureAnnotationImpl extends InformationFlowAnnotationImpl
		implements InformationFlowOperationSignatureAnnotation {
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
	protected InformationFlowOperationSignatureAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessanalysisannotationsPackage.Literals.INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature getOperationSignature() {
		if (operationSignature != null && ((EObject) operationSignature).eIsProxy()) {
			InternalEObject oldOperationSignature = (InternalEObject) operationSignature;
			operationSignature = (OperationSignature) eResolveProxy(oldOperationSignature);
			if (operationSignature != oldOperationSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AccessanalysisannotationsPackage.INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE,
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
					AccessanalysisannotationsPackage.INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE,
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
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE:
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
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE:
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
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE:
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
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE:
			return operationSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //InformationFlowOperationSignatureAnnotationImpl
