/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondences Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getSecurityLevelCorrespondences <em>Security Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getConfigurationCorrespondences <em>Configuration Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getParameterCorrespondences <em>Parameter Correspondences</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getCorrespondences_ResolvedImplementationValues()
 * @model
 * @generated
 */
public interface Correspondences_ResolvedImplementationValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Level Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getCorrespondences_ResolvedImplementationValues_SecurityLevelCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevelCorrespondence_ResolvedImplementationValues> getSecurityLevelCorrespondences();

	/**
	 * Returns the value of the '<em><b>Configuration Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_ResolvedImplementationValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getCorrespondences_ResolvedImplementationValues_ConfigurationCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationCorrespondence_ResolvedImplementationValues> getConfigurationCorrespondences();

	/**
	 * Returns the value of the '<em><b>Parameter Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getCorrespondences_ResolvedImplementationValues_ParameterCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterCorrespondence_ResolvedImplementationValues> getParameterCorrespondences();

} // Correspondences_ResolvedImplementationValues
