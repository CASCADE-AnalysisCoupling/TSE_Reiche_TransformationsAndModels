/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.code;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.code.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.code.Method#getReturns <em>Returns</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.code.Method#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Entity {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.code.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Returns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returns</em>' reference.
	 * @see #setReturns(Type)
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getMethod_Returns()
	 * @model
	 * @generated
	 */
	Type getReturns();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeql.code.Method#getReturns <em>Returns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returns</em>' reference.
	 * @see #getReturns()
	 * @generated
	 */
	void setReturns(Type value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.code.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage#getMethod_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // Method
