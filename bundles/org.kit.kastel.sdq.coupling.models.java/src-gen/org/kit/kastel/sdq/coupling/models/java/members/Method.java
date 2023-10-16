/**
 */
package org.kit.kastel.sdq.coupling.models.java.members;

import org.eclipse.emf.common.util.EList;

import org.kit.kastel.sdq.coupling.models.identifier.Entity;

import org.kit.kastel.sdq.coupling.models.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.members.Method#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.members.Method#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.kit.kastel.sdq.coupling.models.java.members.MembersPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Entity {
	/**
	 * Returns the value of the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returntype</em>' reference.
	 * @see #setReturntype(Type)
	 * @see org.kit.kastel.sdq.coupling.models.java.members.MembersPackage#getMethod_Returntype()
	 * @model
	 * @generated
	 */
	Type getReturntype();

	/**
	 * Sets the value of the '{@link org.kit.kastel.sdq.coupling.models.java.members.Method#getReturntype <em>Returntype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returntype</em>' reference.
	 * @see #getReturntype()
	 * @generated
	 */
	void setReturntype(Type value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.kit.kastel.sdq.coupling.models.java.members.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.kit.kastel.sdq.coupling.models.java.members.MembersPackage#getMethod_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Method
