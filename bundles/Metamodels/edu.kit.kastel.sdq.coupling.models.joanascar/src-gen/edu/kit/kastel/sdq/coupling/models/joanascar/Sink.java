/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.Sink#getSinkLevel <em>Sink Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.Sink#getSystemElement <em>System Element</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSink()
 * @model
 * @generated
 */
public interface Sink<T extends SystemElement_SCAR> extends EObject {
	/**
	 * Returns the value of the '<em><b>Sink Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink Level</em>' reference.
	 * @see #setSinkLevel(Level_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSink_SinkLevel()
	 * @model required="true"
	 * @generated
	 */
	Level_SCAR getSinkLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Sink#getSinkLevel <em>Sink Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink Level</em>' reference.
	 * @see #getSinkLevel()
	 * @generated
	 */
	void setSinkLevel(Level_SCAR value);

	/**
	 * Returns the value of the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Element</em>' reference.
	 * @see #setSystemElement(SystemElement_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSink_SystemElement()
	 * @model required="true"
	 * @generated
	 */
	T getSystemElement();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Sink#getSystemElement <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Element</em>' reference.
	 * @see #getSystemElement()
	 * @generated
	 */
	void setSystemElement(T value);

} // Sink
