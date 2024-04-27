/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getSource <em>Source</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getSink <em>Sink</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getResultEntry()
 * @model
 * @generated
 */
public interface ResultEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' reference.
	 * @see #setEntryPoint(EntryPointIdentifying)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getResultEntry_EntryPoint()
	 * @model required="true"
	 * @generated
	 */
	EntryPointIdentifying getEntryPoint();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getEntryPoint <em>Entry Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' reference.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(EntryPointIdentifying value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ResultEntryElement)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getResultEntry_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResultEntryElement<?> getSource();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ResultEntryElement<?> value);

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' containment reference.
	 * @see #setSink(ResultEntryElement)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getResultEntry_Sink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResultEntryElement<?> getSink();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getSink <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' containment reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(ResultEntryElement<?> value);

} // ResultEntry
