/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations#getInformationFlowAnnotations <em>Information Flow Annotations</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage#getAnnotations()
 * @model
 * @generated
 */
public interface Annotations extends EObject {
	/**
	 * Returns the value of the '<em><b>Information Flow Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Flow Annotations</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage#getAnnotations_InformationFlowAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<InformationFlowAnnotation> getInformationFlowAnnotations();

} // Annotations
