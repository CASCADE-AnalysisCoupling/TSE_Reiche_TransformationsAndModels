/**
 */
package edu.kit.kastel.sdq.coupling.models.java.types;

import edu.kit.kastel.sdq.coupling.models.java.members.Method;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Or Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.java.types.TypesPackage#getClassOrInterfaceType()
 * @model abstract="true"
 * @generated
 */
public interface ClassOrInterfaceType extends ReferenceType {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.java.members.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.java.types.TypesPackage#getClassOrInterfaceType_Method()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethod();

} // ClassOrInterfaceType
