/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getSystemElements <em>System Elements</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getLevels <em>Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getResultingValues <em>Resulting Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResolvedImplementationValues()
 * @model
 * @generated
 */
public interface ResolvedImplementationValues extends EObject {
	/**
	 * Returns the value of the '<em><b>System Elements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Elements</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResolvedImplementationValues_SystemElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter_ResolvedImplementationValues> getSystemElements();

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResolvedImplementationValues_Levels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Level_ResolvedImplementationValues> getLevels();

	/**
	 * Returns the value of the '<em><b>Entry Points</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Points</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResolvedImplementationValues_EntryPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntryPoint_ResolvedImplementationValues> getEntryPoints();

	/**
	 * Returns the value of the '<em><b>Resulting Values</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Values</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#getResolvedImplementationValues_ResultingValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResolvedImplementationValue> getResultingValues();

} // ResolvedImplementationValues
