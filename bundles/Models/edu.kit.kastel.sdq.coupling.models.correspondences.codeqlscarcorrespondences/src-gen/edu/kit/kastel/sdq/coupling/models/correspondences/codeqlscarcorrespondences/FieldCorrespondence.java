/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR;

import edu.kit.kastel.sdq.coupling.models.java.members.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getField_Java <em>Field Java</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getField_SCAR <em>Field SCAR</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getFieldCorrespondence()
 * @model
 * @generated
 */
public interface FieldCorrespondence extends SystemElementCorrespondence {
	/**
	 * Returns the value of the '<em><b>Field Java</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Java</em>' reference.
	 * @see #setField_Java(Field)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getFieldCorrespondence_Field_Java()
	 * @model required="true"
	 * @generated
	 */
	Field getField_Java();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getField_Java <em>Field Java</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Java</em>' reference.
	 * @see #getField_Java()
	 * @generated
	 */
	void setField_Java(Field value);

	/**
	 * Returns the value of the '<em><b>Field SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field SCAR</em>' reference.
	 * @see #setField_SCAR(Field_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getFieldCorrespondence_Field_SCAR()
	 * @model required="true"
	 * @generated
	 */
	Field_SCAR getField_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getField_SCAR <em>Field SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field SCAR</em>' reference.
	 * @see #getField_SCAR()
	 * @generated
	 */
	void setField_SCAR(Field_SCAR value);

} // FieldCorrespondence
