/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getParameterAnnotation()
 * @model
 * @generated
 */
public interface ParameterAnnotation extends SecurityLevelAnnotation {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getParameterAnnotation_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParameterAnnotation
