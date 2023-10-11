/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveType#getPrimitiveTypeName <em>Primitive Type Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {
	/**
	 * Returns the value of the '<em><b>Primitive Type Name</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveTypeNames}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type Name</em>' attribute.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveTypeNames
	 * @see #setPrimitiveTypeName(PrimitiveTypeNames)
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getPrimitiveType_PrimitiveTypeName()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypeNames getPrimitiveTypeName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveType#getPrimitiveTypeName <em>Primitive Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type Name</em>' attribute.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveTypeNames
	 * @see #getPrimitiveTypeName()
	 * @generated
	 */
	void setPrimitiveTypeName(PrimitiveTypeNames value);

} // PrimitiveType
