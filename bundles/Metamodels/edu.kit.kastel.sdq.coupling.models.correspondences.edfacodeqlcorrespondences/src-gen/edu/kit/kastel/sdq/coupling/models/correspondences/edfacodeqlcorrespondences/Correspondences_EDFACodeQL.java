/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondences EDFA Code QL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL#getLiteralSecurityLevelCorrespondences <em>Literal Security Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL#getConfigurationCorrespondences <em>Configuration Correspondences</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage#getCorrespondences_EDFACodeQL()
 * @model
 * @generated
 */
public interface Correspondences_EDFACodeQL extends EObject {
	/**
	 * Returns the value of the '<em><b>Literal Security Level Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Security Level Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage#getCorrespondences_EDFACodeQL_LiteralSecurityLevelCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiteralSecurityLevelCorrespondence_EDFACodeQL> getLiteralSecurityLevelCorrespondences();

	/**
	 * Returns the value of the '<em><b>Configuration Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage#getCorrespondences_EDFACodeQL_ConfigurationCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationCorrespondence_EDFACodeQL> getConfigurationCorrespondences();

} // Correspondences_EDFACodeQL
