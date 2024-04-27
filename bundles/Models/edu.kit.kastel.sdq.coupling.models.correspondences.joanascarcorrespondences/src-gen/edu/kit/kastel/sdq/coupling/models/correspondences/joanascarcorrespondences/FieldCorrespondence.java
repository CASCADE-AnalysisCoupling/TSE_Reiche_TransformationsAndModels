/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences;

import edu.kit.kastel.sdq.coupling.models.java.members.Field;

import edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence#getField_JAVA <em>Field JAVA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence#getField_SCAR <em>Field SCAR</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getFieldCorrespondence()
 * @model
 * @generated
 */
public interface FieldCorrespondence extends SystemElementCorrespondence {
	/**
	 * Returns the value of the '<em><b>Field JAVA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field JAVA</em>' reference.
	 * @see #setField_JAVA(Field)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getFieldCorrespondence_Field_JAVA()
	 * @model required="true"
	 * @generated
	 */
	Field getField_JAVA();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence#getField_JAVA <em>Field JAVA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field JAVA</em>' reference.
	 * @see #getField_JAVA()
	 * @generated
	 */
	void setField_JAVA(Field value);

	/**
	 * Returns the value of the '<em><b>Field SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field SCAR</em>' reference.
	 * @see #setField_SCAR(FieldIdentifying)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getFieldCorrespondence_Field_SCAR()
	 * @model required="true"
	 * @generated
	 */
	FieldIdentifying getField_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence#getField_SCAR <em>Field SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field SCAR</em>' reference.
	 * @see #getField_SCAR()
	 * @generated
	 */
	void setField_SCAR(FieldIdentifying value);

} // FieldCorrespondence
