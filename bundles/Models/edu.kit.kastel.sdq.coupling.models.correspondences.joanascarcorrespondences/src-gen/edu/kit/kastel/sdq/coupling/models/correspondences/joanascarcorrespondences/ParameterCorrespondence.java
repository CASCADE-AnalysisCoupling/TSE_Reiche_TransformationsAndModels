/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence#getParameter_JAVA <em>Parameter JAVA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence#getParameter_SCAR <em>Parameter SCAR</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getParameterCorrespondence()
 * @model
 * @generated
 */
public interface ParameterCorrespondence extends SystemElementCorrespondence {
	/**
	 * Returns the value of the '<em><b>Parameter JAVA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter JAVA</em>' reference.
	 * @see #setParameter_JAVA(Parameter)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getParameterCorrespondence_Parameter_JAVA()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter_JAVA();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence#getParameter_JAVA <em>Parameter JAVA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter JAVA</em>' reference.
	 * @see #getParameter_JAVA()
	 * @generated
	 */
	void setParameter_JAVA(Parameter value);

	/**
	 * Returns the value of the '<em><b>Parameter SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter SCAR</em>' reference.
	 * @see #setParameter_SCAR(ParameterIdentifying)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getParameterCorrespondence_Parameter_SCAR()
	 * @model required="true"
	 * @generated
	 */
	ParameterIdentifying getParameter_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence#getParameter_SCAR <em>Parameter SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter SCAR</em>' reference.
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	void setParameter_SCAR(ParameterIdentifying value);

} // ParameterCorrespondence
