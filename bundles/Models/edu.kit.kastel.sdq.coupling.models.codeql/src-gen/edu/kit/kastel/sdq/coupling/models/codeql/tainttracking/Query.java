/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query#getAppliedSecurityLevel <em>Applied Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query#getSecurityLevelAnnotations <em>Security Level Annotations</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query#getAllowedFlows <em>Allowed Flows</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Applied Security Level</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Security Level</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getQuery_AppliedSecurityLevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevel> getAppliedSecurityLevel();

	/**
	 * Returns the value of the '<em><b>Security Level Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Annotations</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getQuery_SecurityLevelAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevelAnnotation> getSecurityLevelAnnotations();

	/**
	 * Returns the value of the '<em><b>Allowed Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Flows</em>' containment reference.
	 * @see #setAllowedFlows(AllowedFlows)
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getQuery_AllowedFlows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AllowedFlows getAllowedFlows();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query#getAllowedFlows <em>Allowed Flows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Flows</em>' containment reference.
	 * @see #getAllowedFlows()
	 * @generated
	 */
	void setAllowedFlows(AllowedFlows value);

} // Query
