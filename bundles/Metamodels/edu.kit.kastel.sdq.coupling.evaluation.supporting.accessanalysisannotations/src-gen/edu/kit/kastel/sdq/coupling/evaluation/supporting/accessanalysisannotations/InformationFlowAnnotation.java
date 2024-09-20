/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations;

import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation#getDataTargets <em>Data Targets</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage#getInformationFlowAnnotation()
 * @model
 * @generated
 */
public interface InformationFlowAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Targets</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.data.DataIdentifying}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Targets</em>' reference list.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage#getInformationFlowAnnotation_DataTargets()
	 * @model
	 * @generated
	 */
	EList<DataIdentifying> getDataTargets();

} // InformationFlowAnnotation
