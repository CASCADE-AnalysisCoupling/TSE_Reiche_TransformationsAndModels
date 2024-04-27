/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resulting Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResultingValue()
 * @model
 * @generated
 */
public interface ResultingValue extends EObject {
	/**
	 * Returns the value of the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Element</em>' reference.
	 * @see #setSystemElement(ParameterIdentification_JOANAResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResultingValue_SystemElement()
	 * @model required="true"
	 * @generated
	 */
	ParameterIdentification_JOANAResultingValues getSystemElement();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getSystemElement <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Element</em>' reference.
	 * @see #getSystemElement()
	 * @generated
	 */
	void setSystemElement(ParameterIdentification_JOANAResultingValues value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(EntryPointIdentification_ResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResultingValue_Configuration()
	 * @model required="true"
	 * @generated
	 */
	EntryPointIdentification_ResultingValues getConfiguration();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(EntryPointIdentification_ResultingValues value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(Level_ResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResultingValue_Level()
	 * @model required="true"
	 * @generated
	 */
	Level_ResultingValues getLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level_ResultingValues value);

} // ResultingValue
