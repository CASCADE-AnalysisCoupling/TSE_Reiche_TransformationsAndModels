/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondences Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues#getSecurityLevelCorrespondences <em>Security Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues#getConfigurationCorrespondences <em>Configuration Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues#getParameterCorrespondences <em>Parameter Correspondences</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getCorrespondences_CodeQLResultingValues()
 * @model
 * @generated
 */
public interface Correspondences_CodeQLResultingValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Level Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getCorrespondences_CodeQLResultingValues_SecurityLevelCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevelCorrespondence_CodeQLResultingValues> getSecurityLevelCorrespondences();

	/**
	 * Returns the value of the '<em><b>Configuration Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getCorrespondences_CodeQLResultingValues_ConfigurationCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationCorrespondence_CodeQLResultingValues> getConfigurationCorrespondences();

	/**
	 * Returns the value of the '<em><b>Parameter Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getCorrespondences_CodeQLResultingValues_ParameterCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterCorrespondence_CodeQLResultingValues> getParameterCorrespondences();

} // Correspondences_CodeQLResultingValues
