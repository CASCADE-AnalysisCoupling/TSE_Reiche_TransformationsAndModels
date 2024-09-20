/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field SCAR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getField_SCAR()
 * @model
 * @generated
 */
public interface Field_SCAR extends SystemElement {
	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getField_SCAR_FieldName()
	 * @model required="true"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getField_SCAR_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #setFullyQualifiedClassName(String)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getField_SCAR_FullyQualifiedClassName()
	 * @model required="true"
	 * @generated
	 */
	String getFullyQualifiedClassName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 */
	void setFullyQualifiedClassName(String value);

} // Field_SCAR
