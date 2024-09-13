/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getParameter_Java <em>Parameter Java</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getParameter_SCAR <em>Parameter SCAR</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getParameterCorrespondence()
 * @model
 * @generated
 */
public interface ParameterCorrespondence extends SystemElementCorrespondence {
	/**
	 * Returns the value of the '<em><b>Parameter Java</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Java</em>' reference.
	 * @see #setParameter_Java(Parameter)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getParameterCorrespondence_Parameter_Java()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter_Java();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getParameter_Java <em>Parameter Java</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Java</em>' reference.
	 * @see #getParameter_Java()
	 * @generated
	 */
	void setParameter_Java(Parameter value);

	/**
	 * Returns the value of the '<em><b>Parameter SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter SCAR</em>' reference.
	 * @see #setParameter_SCAR(Parameter_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getParameterCorrespondence_Parameter_SCAR()
	 * @model required="true"
	 * @generated
	 */
	Parameter_SCAR getParameter_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getParameter_SCAR <em>Parameter SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter SCAR</em>' reference.
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	void setParameter_SCAR(Parameter_SCAR value);

} // ParameterCorrespondence
