/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getConfiguration_CodeQL <em>Configuration Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getConfiguration_SCAR <em>Configuration SCAR</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getConfigurationCorrespondence()
 * @model
 * @generated
 */
public interface ConfigurationCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Code QL</em>' reference.
	 * @see #setConfiguration_CodeQL(HybridConfiguration)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getConfigurationCorrespondence_Configuration_CodeQL()
	 * @model required="true"
	 * @generated
	 */
	HybridConfiguration getConfiguration_CodeQL();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getConfiguration_CodeQL <em>Configuration Code QL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Code QL</em>' reference.
	 * @see #getConfiguration_CodeQL()
	 * @generated
	 */
	void setConfiguration_CodeQL(HybridConfiguration value);

	/**
	 * Returns the value of the '<em><b>Configuration SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration SCAR</em>' reference.
	 * @see #setConfiguration_SCAR(RuleId)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getConfigurationCorrespondence_Configuration_SCAR()
	 * @model required="true"
	 * @generated
	 */
	RuleId getConfiguration_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getConfiguration_SCAR <em>Configuration SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration SCAR</em>' reference.
	 * @see #getConfiguration_SCAR()
	 * @generated
	 */
	void setConfiguration_SCAR(RuleId value);

} // ConfigurationCorrespondence
