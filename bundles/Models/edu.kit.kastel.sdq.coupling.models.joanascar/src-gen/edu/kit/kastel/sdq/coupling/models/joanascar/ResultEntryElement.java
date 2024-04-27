/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Entry Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getResultEntryElement()
 * @model
 * @generated
 */
public interface ResultEntryElement<T extends SystemElementIdentifiying_JOANASCAR> extends EObject {
	/**
	 * Returns the value of the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Element</em>' reference.
	 * @see #setSystemElement(SystemElementIdentifiying_JOANASCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getResultEntryElement_SystemElement()
	 * @model required="true"
	 * @generated
	 */
	T getSystemElement();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement#getSystemElement <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Element</em>' reference.
	 * @see #getSystemElement()
	 * @generated
	 */
	void setSystemElement(T value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(Level_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getResultEntryElement_Level()
	 * @model required="true"
	 * @generated
	 */
	Level_SCAR getLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level_SCAR value);

} // ResultEntryElement
