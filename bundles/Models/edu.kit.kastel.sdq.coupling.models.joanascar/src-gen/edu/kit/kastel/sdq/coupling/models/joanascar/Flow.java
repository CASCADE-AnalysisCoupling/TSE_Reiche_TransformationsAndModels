/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getSource <em>Source</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getSink <em>Sink</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' reference.
	 * @see #setEntryPoint(EntryPoint_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getFlow_EntryPoint()
	 * @model required="true"
	 * @generated
	 */
	EntryPoint_SCAR getEntryPoint();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getEntryPoint <em>Entry Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' reference.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(EntryPoint_SCAR value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getFlow_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Source<?> getSource();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source<?> value);

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' containment reference.
	 * @see #setSink(Sink)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getFlow_Sink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sink<?> getSink();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getSink <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' containment reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(Sink<?> value);

} // Flow
