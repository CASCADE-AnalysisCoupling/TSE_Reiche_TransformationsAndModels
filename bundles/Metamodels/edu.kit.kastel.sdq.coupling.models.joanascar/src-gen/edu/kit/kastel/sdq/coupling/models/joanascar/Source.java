/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.Source#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.Source#getSourceLevel <em>Source Level</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSource()
 * @model
 * @generated
 */
public interface Source<T extends SystemElement_SCAR> extends EObject {
	/**
	 * Returns the value of the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Element</em>' reference.
	 * @see #setSystemElement(SystemElement_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSource_SystemElement()
	 * @model required="true"
	 * @generated
	 */
	T getSystemElement();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Source#getSystemElement <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Element</em>' reference.
	 * @see #getSystemElement()
	 * @generated
	 */
	void setSystemElement(T value);

	/**
	 * Returns the value of the '<em><b>Source Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Level</em>' reference.
	 * @see #setSourceLevel(Level_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSource_SourceLevel()
	 * @model required="true"
	 * @generated
	 */
	Level_SCAR getSourceLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Source#getSourceLevel <em>Source Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Level</em>' reference.
	 * @see #getSourceLevel()
	 * @generated
	 */
	void setSourceLevel(Level_SCAR value);

} // Source
