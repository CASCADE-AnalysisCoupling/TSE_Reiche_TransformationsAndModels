/**
 */
package org.kit.kastel.sdq.coupling.models.java.types;

import org.eclipse.emf.common.util.EList;

import org.kit.kastel.sdq.coupling.models.java.members.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.types.Class#getField <em>Field</em>}</li>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.types.Class#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see org.kit.kastel.sdq.coupling.models.java.types.TypesPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ClassOrInterfaceType {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference list.
	 * The list contents are of type {@link org.kit.kastel.sdq.coupling.models.java.members.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference list.
	 * @see org.kit.kastel.sdq.coupling.models.java.types.TypesPackage#getClass_Field()
	 * @model
	 * @generated
	 */
	EList<Field> getField();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link org.kit.kastel.sdq.coupling.models.java.types.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see org.kit.kastel.sdq.coupling.models.java.types.TypesPackage#getClass_Implements()
	 * @model
	 * @generated
	 */
	EList<Interface> getImplements();

} // Class
