/**
 */
package org.kit.kastel.sdq.coupling.models.java.types;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.types.PrimitiveType#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.kit.kastel.sdq.coupling.models.java.types.TypesPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kit.kastel.sdq.coupling.models.java.types.PrimitiveTypeKinds}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.kit.kastel.sdq.coupling.models.java.types.PrimitiveTypeKinds
	 * @see #setKind(PrimitiveTypeKinds)
	 * @see org.kit.kastel.sdq.coupling.models.java.types.TypesPackage#getPrimitiveType_Kind()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypeKinds getKind();

	/**
	 * Sets the value of the '{@link org.kit.kastel.sdq.coupling.models.java.types.PrimitiveType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.kit.kastel.sdq.coupling.models.java.types.PrimitiveTypeKinds
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PrimitiveTypeKinds value);

} // PrimitiveType
