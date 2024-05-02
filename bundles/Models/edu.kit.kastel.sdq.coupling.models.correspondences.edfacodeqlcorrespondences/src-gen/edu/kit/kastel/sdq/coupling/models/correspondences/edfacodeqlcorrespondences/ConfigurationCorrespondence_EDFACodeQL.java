/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Correspondence EDFA Code QL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL#getConfiguration_CodeQL <em>Configuration Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL#getConfiguration_EDFA <em>Configuration EDFA</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage#getConfigurationCorrespondence_EDFACodeQL()
 * @model
 * @generated
 */
public interface ConfigurationCorrespondence_EDFACodeQL extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Code QL</em>' reference.
	 * @see #setConfiguration_CodeQL(Configuration)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage#getConfigurationCorrespondence_EDFACodeQL_Configuration_CodeQL()
	 * @model required="true"
	 * @generated
	 */
	Configuration getConfiguration_CodeQL();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL#getConfiguration_CodeQL <em>Configuration Code QL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Code QL</em>' reference.
	 * @see #getConfiguration_CodeQL()
	 * @generated
	 */
	void setConfiguration_CodeQL(Configuration value);

	/**
	 * Returns the value of the '<em><b>Configuration EDFA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration EDFA</em>' reference.
	 * @see #setConfiguration_EDFA(ParameterAnnotations)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage#getConfigurationCorrespondence_EDFACodeQL_Configuration_EDFA()
	 * @model required="true"
	 * @generated
	 */
	ParameterAnnotations getConfiguration_EDFA();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL#getConfiguration_EDFA <em>Configuration EDFA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration EDFA</em>' reference.
	 * @see #getConfiguration_EDFA()
	 * @generated
	 */
	void setConfiguration_EDFA(ParameterAnnotations value);

} // ConfigurationCorrespondence_EDFACodeQL
