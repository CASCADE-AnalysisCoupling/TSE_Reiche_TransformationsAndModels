/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Level Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation#getSecurityLevel <em>Security Level</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getSecurityLevelAnnotation()
 * @model
 * @generated
 */
public interface SecurityLevelAnnotation extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level</em>' reference.
	 * @see #setSecurityLevel(SecurityLevel)
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getSecurityLevelAnnotation_SecurityLevel()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel getSecurityLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation#getSecurityLevel <em>Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' reference.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(SecurityLevel value);

} // SecurityLevelAnnotation
