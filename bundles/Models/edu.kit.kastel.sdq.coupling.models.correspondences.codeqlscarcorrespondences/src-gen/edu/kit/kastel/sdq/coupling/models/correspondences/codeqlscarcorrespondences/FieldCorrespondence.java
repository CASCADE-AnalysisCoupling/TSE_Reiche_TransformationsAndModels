/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getJavaField <em>Java Field</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getScarField <em>Scar Field</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getFieldCorrespondence()
 * @model
 * @generated
 */
public interface FieldCorrespondence extends SystemElementCorrespondence {
	/**
	 * Returns the value of the '<em><b>Java Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Field</em>' reference.
	 * @see #setJavaField(Field)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getFieldCorrespondence_JavaField()
	 * @model required="true"
	 * @generated
	 */
	Field getJavaField();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getJavaField <em>Java Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Field</em>' reference.
	 * @see #getJavaField()
	 * @generated
	 */
	void setJavaField(Field value);

	/**
	 * Returns the value of the '<em><b>Scar Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scar Field</em>' reference.
	 * @see #setScarField(FieldIdentification)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getFieldCorrespondence_ScarField()
	 * @model required="true"
	 * @generated
	 */
	FieldIdentification getScarField();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getScarField <em>Scar Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scar Field</em>' reference.
	 * @see #getScarField()
	 * @generated
	 */
	void setScarField(FieldIdentification value);

} // FieldCorrespondence
