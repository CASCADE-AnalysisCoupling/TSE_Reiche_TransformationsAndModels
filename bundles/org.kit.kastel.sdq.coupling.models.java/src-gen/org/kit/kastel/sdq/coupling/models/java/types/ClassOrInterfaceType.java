/**
 */
package org.kit.kastel.sdq.coupling.models.java.types;

import org.eclipse.emf.common.util.EList;

import org.kit.kastel.sdq.coupling.models.java.members.Method;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Or Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.kit.kastel.sdq.coupling.models.java.types.TypesPackage#getClassOrInterfaceType()
 * @model abstract="true"
 * @generated
 */
public interface ClassOrInterfaceType extends ReferenceType {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link org.kit.kastel.sdq.coupling.models.java.members.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see org.kit.kastel.sdq.coupling.models.java.types.TypesPackage#getClassOrInterfaceType_Method()
	 * @model
	 * @generated
	 */
	EList<Method> getMethod();

} // ClassOrInterfaceType
