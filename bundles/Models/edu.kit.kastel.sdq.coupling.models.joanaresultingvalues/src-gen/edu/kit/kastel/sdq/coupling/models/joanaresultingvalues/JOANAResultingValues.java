/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JOANA Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getSystemElements <em>System Elements</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getLevels <em>Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getResultingValues <em>Resulting Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getJOANAResultingValues()
 * @model
 * @generated
 */
public interface JOANAResultingValues extends EObject {
	/**
	 * Returns the value of the '<em><b>System Elements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Elements</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getJOANAResultingValues_SystemElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterIdentification_JOANAResultingValues> getSystemElements();

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getJOANAResultingValues_Levels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Level_ResultingValues> getLevels();

	/**
	 * Returns the value of the '<em><b>Entry Points</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Points</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getJOANAResultingValues_EntryPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntryPointIdentification_ResultingValues> getEntryPoints();

	/**
	 * Returns the value of the '<em><b>Resulting Values</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Values</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getJOANAResultingValues_ResultingValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultingValue> getResultingValues();

} // JOANAResultingValues
