/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation#getLevel <em>Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation#getSystemElementIdentification <em>System Element Identification</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getInformationFlowAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface InformationFlowAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(Level)
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getInformationFlowAnnotation_Level()
	 * @model required="true"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

	/**
	 * Returns the value of the '<em><b>System Element Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Element Identification</em>' containment reference.
	 * @see #setSystemElementIdentification(SystemElementIdentifying)
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getInformationFlowAnnotation_SystemElementIdentification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SystemElementIdentifying getSystemElementIdentification();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation#getSystemElementIdentification <em>System Element Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Element Identification</em>' containment reference.
	 * @see #getSystemElementIdentification()
	 * @generated
	 */
	void setSystemElementIdentification(SystemElementIdentifying value);

} // InformationFlowAnnotation
