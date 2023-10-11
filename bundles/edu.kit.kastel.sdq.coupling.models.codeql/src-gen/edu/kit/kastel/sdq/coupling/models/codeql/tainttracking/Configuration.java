/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration#getAppliedSecurityLevel <em>Applied Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration#getSecurityLevelAnnotations <em>Security Level Annotations</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration#getAllowedFlows <em>Allowed Flows</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Applied Security Level</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Security Level</em>' reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getConfiguration_AppliedSecurityLevel()
	 * @model
	 * @generated
	 */
	EList<SecurityLevel> getAppliedSecurityLevel();

	/**
	 * Returns the value of the '<em><b>Security Level Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Annotations</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getConfiguration_SecurityLevelAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevelAnnotation> getSecurityLevelAnnotations();

	/**
	 * Returns the value of the '<em><b>Allowed Flows</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Flows</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getConfiguration_AllowedFlows()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllowedFlow> getAllowedFlows();

} // Configuration
