/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondences Code QL Scar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar#getSystemElementCorrespondences <em>System Element Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar#getSecurityLevelCorrespondences <em>Security Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar#getConfigurationCorrespondences <em>Configuration Correspondences</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getCorrespondences_CodeQLScar()
 * @model
 * @generated
 */
public interface Correspondences_CodeQLScar extends EObject {
	/**
	 * Returns the value of the '<em><b>System Element Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SystemElementCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Element Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getCorrespondences_CodeQLScar_SystemElementCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemElementCorrespondence> getSystemElementCorrespondences();

	/**
	 * Returns the value of the '<em><b>Security Level Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getCorrespondences_CodeQLScar_SecurityLevelCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevelCorrespondence> getSecurityLevelCorrespondences();

	/**
	 * Returns the value of the '<em><b>Configuration Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getCorrespondences_CodeQLScar_ConfigurationCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationCorrespondence> getConfigurationCorrespondences();

} // Correspondences_CodeQLScar
