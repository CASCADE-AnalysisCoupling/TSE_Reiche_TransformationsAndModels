/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getCodeQLConfig <em>Code QL Config</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getCodeQLSCARConfig <em>Code QLSCAR Config</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getConfigurationCorrespondence()
 * @model
 * @generated
 */
public interface ConfigurationCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Code QL Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code QL Config</em>' reference.
	 * @see #setCodeQLConfig(Configuration)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getConfigurationCorrespondence_CodeQLConfig()
	 * @model required="true"
	 * @generated
	 */
	Configuration getCodeQLConfig();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getCodeQLConfig <em>Code QL Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code QL Config</em>' reference.
	 * @see #getCodeQLConfig()
	 * @generated
	 */
	void setCodeQLConfig(Configuration value);

	/**
	 * Returns the value of the '<em><b>Code QLSCAR Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code QLSCAR Config</em>' reference.
	 * @see #setCodeQLSCARConfig(ConfigurationID_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getConfigurationCorrespondence_CodeQLSCARConfig()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationID_SCAR getCodeQLSCARConfig();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getCodeQLSCARConfig <em>Code QLSCAR Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code QLSCAR Config</em>' reference.
	 * @see #getCodeQLSCARConfig()
	 * @generated
	 */
	void setCodeQLSCARConfig(ConfigurationID_SCAR value);

} // ConfigurationCorrespondence
