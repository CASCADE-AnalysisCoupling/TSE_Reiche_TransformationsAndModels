/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Correspondence Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues#getConfiguration_SCAR <em>Configuration SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues#getConfiguration_ResultingValues <em>Configuration Resulting Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getConfigurationCorrespondence_CodeQLResultingValues()
 * @model
 * @generated
 */
public interface ConfigurationCorrespondence_CodeQLResultingValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration SCAR</em>' reference.
	 * @see #setConfiguration_SCAR(ConfigurationID_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getConfigurationCorrespondence_CodeQLResultingValues_Configuration_SCAR()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationID_SCAR getConfiguration_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues#getConfiguration_SCAR <em>Configuration SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration SCAR</em>' reference.
	 * @see #getConfiguration_SCAR()
	 * @generated
	 */
	void setConfiguration_SCAR(ConfigurationID_SCAR value);

	/**
	 * Returns the value of the '<em><b>Configuration Resulting Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Resulting Values</em>' reference.
	 * @see #setConfiguration_ResultingValues(ConfigurationID_ResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getConfigurationCorrespondence_CodeQLResultingValues_Configuration_ResultingValues()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationID_ResultingValues getConfiguration_ResultingValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues#getConfiguration_ResultingValues <em>Configuration Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Resulting Values</em>' reference.
	 * @see #getConfiguration_ResultingValues()
	 * @generated
	 */
	void setConfiguration_ResultingValues(ConfigurationID_ResultingValues value);

} // ConfigurationCorrespondence_CodeQLResultingValues
