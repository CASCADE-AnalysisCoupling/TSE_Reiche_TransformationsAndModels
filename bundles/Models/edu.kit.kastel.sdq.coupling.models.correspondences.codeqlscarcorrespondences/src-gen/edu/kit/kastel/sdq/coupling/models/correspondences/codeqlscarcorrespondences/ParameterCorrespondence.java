/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getJavaParameter <em>Java Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getScarParameter <em>Scar Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getParameterCorrespondence()
 * @model
 * @generated
 */
public interface ParameterCorrespondence extends SystemElementCorrespondence {
	/**
	 * Returns the value of the '<em><b>Java Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Parameter</em>' reference.
	 * @see #setJavaParameter(Parameter)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getParameterCorrespondence_JavaParameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getJavaParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getJavaParameter <em>Java Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Parameter</em>' reference.
	 * @see #getJavaParameter()
	 * @generated
	 */
	void setJavaParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Scar Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scar Parameter</em>' reference.
	 * @see #setScarParameter(ParameterIdentification)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getParameterCorrespondence_ScarParameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterIdentification getScarParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getScarParameter <em>Scar Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scar Parameter</em>' reference.
	 * @see #getScarParameter()
	 * @generated
	 */
	void setScarParameter(ParameterIdentification value);

} // ParameterCorrespondence
