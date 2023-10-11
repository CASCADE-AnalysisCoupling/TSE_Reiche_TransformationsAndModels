/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql;

import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeRoot;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.DataFlowRoot;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot#getCodeRoot <em>Code Root</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot#getDataFlowRoot <em>Data Flow Root</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage#getCodeQLRoot()
 * @model
 * @generated
 */
public interface CodeQLRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Code Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Root</em>' reference.
	 * @see #setCodeRoot(CodeRoot)
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage#getCodeQLRoot_CodeRoot()
	 * @model required="true"
	 * @generated
	 */
	CodeRoot getCodeRoot();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot#getCodeRoot <em>Code Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Root</em>' reference.
	 * @see #getCodeRoot()
	 * @generated
	 */
	void setCodeRoot(CodeRoot value);

	/**
	 * Returns the value of the '<em><b>Data Flow Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flow Root</em>' reference.
	 * @see #setDataFlowRoot(DataFlowRoot)
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage#getCodeQLRoot_DataFlowRoot()
	 * @model required="true"
	 * @generated
	 */
	DataFlowRoot getDataFlowRoot();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot#getDataFlowRoot <em>Data Flow Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Flow Root</em>' reference.
	 * @see #getDataFlowRoot()
	 * @generated
	 */
	void setDataFlowRoot(DataFlowRoot value);

} // CodeQLRoot
