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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot#getNodes <em>Nodes</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getTainttrackingRoot()
 * @model
 * @generated
 */
public interface TainttrackingRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getTainttrackingRoot_Nodes()
	 * @model
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getTainttrackingRoot_Configurations()
	 * @model
	 * @generated
	 */
	EList<Configuration> getConfigurations();

} // TainttrackingRoot
