/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AnnotationsImpl#getInformationFlowAnnotations <em>Information Flow Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationsImpl extends MinimalEObjectImpl.Container implements Annotations {
	/**
	 * The cached value of the '{@link #getInformationFlowAnnotations() <em>Information Flow Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationFlowAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationFlowAnnotation> informationFlowAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessanalysisannotationsPackage.Literals.ANNOTATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationFlowAnnotation> getInformationFlowAnnotations() {
		if (informationFlowAnnotations == null) {
			informationFlowAnnotations = new EObjectContainmentEList<InformationFlowAnnotation>(
					InformationFlowAnnotation.class, this,
					AccessanalysisannotationsPackage.ANNOTATIONS__INFORMATION_FLOW_ANNOTATIONS);
		}
		return informationFlowAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AccessanalysisannotationsPackage.ANNOTATIONS__INFORMATION_FLOW_ANNOTATIONS:
			return ((InternalEList<?>) getInformationFlowAnnotations()).basicRemove(otherEnd, msgs);
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
		case AccessanalysisannotationsPackage.ANNOTATIONS__INFORMATION_FLOW_ANNOTATIONS:
			return getInformationFlowAnnotations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AccessanalysisannotationsPackage.ANNOTATIONS__INFORMATION_FLOW_ANNOTATIONS:
			getInformationFlowAnnotations().clear();
			getInformationFlowAnnotations().addAll((Collection<? extends InformationFlowAnnotation>) newValue);
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
		case AccessanalysisannotationsPackage.ANNOTATIONS__INFORMATION_FLOW_ANNOTATIONS:
			getInformationFlowAnnotations().clear();
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
		case AccessanalysisannotationsPackage.ANNOTATIONS__INFORMATION_FLOW_ANNOTATIONS:
			return informationFlowAnnotations != null && !informationFlowAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotationsImpl
