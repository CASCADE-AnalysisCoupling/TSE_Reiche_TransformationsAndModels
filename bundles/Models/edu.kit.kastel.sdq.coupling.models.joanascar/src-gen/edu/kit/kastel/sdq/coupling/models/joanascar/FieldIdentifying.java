/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Identifying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getFieldIdentifying()
 * @model
 * @generated
 */
public interface FieldIdentifying extends SystemElementIdentifiying_JOANASCAR {
	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getFieldIdentifying_FieldName()
	 * @model required="true"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #setFullyQualifiedClassName(String)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getFieldIdentifying_FullyQualifiedClassName()
	 * @model required="true"
	 * @generated
	 */
	String getFullyQualifiedClassName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 */
	void setFullyQualifiedClassName(String value);

} // FieldIdentifying
