/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement#getSecurityLevel <em>Security Level</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResultEntryElement()
 * @model
 * @generated
 */
public interface ResultEntryElement<T extends SystemElementIdentification> extends EObject {
	/**
	 * Returns the value of the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Element</em>' reference.
	 * @see #setSystemElement(SystemElementIdentification)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResultEntryElement_SystemElement()
	 * @model required="true"
	 * @generated
	 */
	T getSystemElement();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement#getSystemElement <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Element</em>' reference.
	 * @see #getSystemElement()
	 * @generated
	 */
	void setSystemElement(T value);

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level</em>' reference.
	 * @see #setSecurityLevel(SecurityLevel_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResultEntryElement_SecurityLevel()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel_SCAR getSecurityLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement#getSecurityLevel <em>Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' reference.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(SecurityLevel_SCAR value);

} // ResultEntryElement
