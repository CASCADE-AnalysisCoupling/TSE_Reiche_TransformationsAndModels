/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl;

import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowAnnotationImpl#getDataTargets <em>Data Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationFlowAnnotationImpl extends MinimalEObjectImpl.Container implements InformationFlowAnnotation {
	/**
	 * The cached value of the '{@link #getDataTargets() <em>Data Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<DataIdentifying> dataTargets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessanalysisannotationsPackage.Literals.INFORMATION_FLOW_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataIdentifying> getDataTargets() {
		if (dataTargets == null) {
			dataTargets = new EObjectResolvingEList<DataIdentifying>(DataIdentifying.class, this,
					AccessanalysisannotationsPackage.INFORMATION_FLOW_ANNOTATION__DATA_TARGETS);
		}
		return dataTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_ANNOTATION__DATA_TARGETS:
			return getDataTargets();
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
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_ANNOTATION__DATA_TARGETS:
			getDataTargets().clear();
			getDataTargets().addAll((Collection<? extends DataIdentifying>) newValue);
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
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_ANNOTATION__DATA_TARGETS:
			getDataTargets().clear();
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
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_ANNOTATION__DATA_TARGETS:
			return dataTargets != null && !dataTargets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InformationFlowAnnotationImpl
