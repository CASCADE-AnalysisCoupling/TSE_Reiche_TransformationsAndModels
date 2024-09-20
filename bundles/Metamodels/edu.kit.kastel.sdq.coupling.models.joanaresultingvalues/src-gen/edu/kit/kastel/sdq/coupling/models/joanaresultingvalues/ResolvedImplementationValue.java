/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Implementation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResolvedImplementationValue()
 * @model
 * @generated
 */
public interface ResolvedImplementationValue extends EObject {
	/**
	 * Returns the value of the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Element</em>' reference.
	 * @see #setSystemElement(Parameter_ResolvedImplementationValues)
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResolvedImplementationValue_SystemElement()
	 * @model required="true"
	 * @generated
	 */
	Parameter_ResolvedImplementationValues getSystemElement();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getSystemElement <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Element</em>' reference.
	 * @see #getSystemElement()
	 * @generated
	 */
	void setSystemElement(Parameter_ResolvedImplementationValues value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(EntryPoint_ResolvedImplementationValues)
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResolvedImplementationValue_Configuration()
	 * @model required="true"
	 * @generated
	 */
	EntryPoint_ResolvedImplementationValues getConfiguration();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(EntryPoint_ResolvedImplementationValues value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(Level_ResolvedImplementationValues)
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResolvedImplementationValue_Level()
	 * @model required="true"
	 * @generated
	 */
	Level_ResolvedImplementationValues getLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level_ResolvedImplementationValues value);

} // ResolvedImplementationValue
