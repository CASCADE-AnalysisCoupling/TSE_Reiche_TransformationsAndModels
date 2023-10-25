/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code QL Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot#getTainttrackingRoot <em>Tainttracking Root</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage#getCodeQLRoot()
 * @model
 * @generated
 */
public interface CodeQLRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Tainttracking Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tainttracking Root</em>' reference.
	 * @see #setTainttrackingRoot(TainttrackingRoot)
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage#getCodeQLRoot_TainttrackingRoot()
	 * @model required="true"
	 * @generated
	 */
	TainttrackingRoot getTainttrackingRoot();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot#getTainttrackingRoot <em>Tainttracking Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tainttracking Root</em>' reference.
	 * @see #getTainttrackingRoot()
	 * @generated
	 */
	void setTainttrackingRoot(TainttrackingRoot value);

} // CodeQLRoot
