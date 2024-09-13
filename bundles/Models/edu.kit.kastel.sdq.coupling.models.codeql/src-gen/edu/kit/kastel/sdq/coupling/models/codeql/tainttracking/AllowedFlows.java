/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allowed Flows</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlows#getAllowedFlows <em>Allowed Flows</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getAllowedFlows()
 * @model
 * @generated
 */
public interface AllowedFlows extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed Flows</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Flows</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getAllowedFlows_AllowedFlows()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllowedFlow> getAllowedFlows();

} // AllowedFlows
