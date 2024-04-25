/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence#getCodeQLConfig <em>Code QL Config</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence#getAccessAnalysisConfig <em>Access Analysis Config</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage#getConfigurationCorrespondence()
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
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage#getConfigurationCorrespondence_CodeQLConfig()
	 * @model required="true"
	 * @generated
	 */
	Configuration getCodeQLConfig();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence#getCodeQLConfig <em>Code QL Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code QL Config</em>' reference.
	 * @see #getCodeQLConfig()
	 * @generated
	 */
	void setCodeQLConfig(Configuration value);

	/**
	 * Returns the value of the '<em><b>Access Analysis Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Analysis Config</em>' reference.
	 * @see #setAccessAnalysisConfig(ConfidentialitySpecification)
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage#getConfigurationCorrespondence_AccessAnalysisConfig()
	 * @model required="true"
	 * @generated
	 */
	ConfidentialitySpecification getAccessAnalysisConfig();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence#getAccessAnalysisConfig <em>Access Analysis Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Analysis Config</em>' reference.
	 * @see #getAccessAnalysisConfig()
	 * @generated
	 */
	void setAccessAnalysisConfig(ConfidentialitySpecification value);

} // ConfigurationCorrespondence
