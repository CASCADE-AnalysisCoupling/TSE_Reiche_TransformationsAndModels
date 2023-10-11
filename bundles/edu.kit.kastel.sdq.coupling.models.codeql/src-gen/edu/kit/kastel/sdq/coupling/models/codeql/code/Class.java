/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.code;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.code.Class#getMethods <em>Methods</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.code.Class#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Entity, Type {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.code.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.code.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getClass_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // Class
