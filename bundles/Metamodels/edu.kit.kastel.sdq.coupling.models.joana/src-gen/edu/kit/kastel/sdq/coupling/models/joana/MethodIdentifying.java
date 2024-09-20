/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

import edu.kit.kastel.sdq.coupling.models.java.members.Method;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Identifying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getMethodIdentifying()
 * @model
 * @generated
 */
public interface MethodIdentifying extends SystemElementIdentifying {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(Method)
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getMethodIdentifying_Method()
	 * @model required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // MethodIdentifying
