/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getTainttrackingRoot()
 * @model
 * @generated
 */
public interface TainttrackingRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getTainttrackingRoot_Queries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getQueries();

} // TainttrackingRoot
