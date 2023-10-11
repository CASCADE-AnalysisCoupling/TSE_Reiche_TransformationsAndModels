/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.code.MethodAccess#getAccessingMethod <em>Accessing Method</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getMethodAccess()
 * @model
 * @generated
 */
public interface MethodAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Accessing Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessing Method</em>' reference.
	 * @see #setAccessingMethod(Method)
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getMethodAccess_AccessingMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getAccessingMethod();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeql.code.MethodAccess#getAccessingMethod <em>Accessing Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessing Method</em>' reference.
	 * @see #getAccessingMethod()
	 * @generated
	 */
	void setAccessingMethod(Method value);

} // MethodAccess
