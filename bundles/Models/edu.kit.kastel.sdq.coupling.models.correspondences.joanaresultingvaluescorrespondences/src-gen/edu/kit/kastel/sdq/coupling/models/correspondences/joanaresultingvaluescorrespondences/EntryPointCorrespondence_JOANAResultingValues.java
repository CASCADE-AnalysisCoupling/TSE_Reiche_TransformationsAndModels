/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point Correspondence JOANA Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_SCAR <em>Entry Point SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_ResultingValues <em>Entry Point Resulting Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getEntryPointCorrespondence_JOANAResultingValues()
 * @model
 * @generated
 */
public interface EntryPointCorrespondence_JOANAResultingValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point SCAR</em>' reference.
	 * @see #setEntryPoint_SCAR(EntryPointIdentifying)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_SCAR()
	 * @model required="true"
	 * @generated
	 */
	EntryPointIdentifying getEntryPoint_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_SCAR <em>Entry Point SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point SCAR</em>' reference.
	 * @see #getEntryPoint_SCAR()
	 * @generated
	 */
	void setEntryPoint_SCAR(EntryPointIdentifying value);

	/**
	 * Returns the value of the '<em><b>Entry Point Resulting Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point Resulting Values</em>' reference.
	 * @see #setEntryPoint_ResultingValues(EntryPointIdentification_ResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_ResultingValues()
	 * @model required="true"
	 * @generated
	 */
	EntryPointIdentification_ResultingValues getEntryPoint_ResultingValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_ResultingValues <em>Entry Point Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point Resulting Values</em>' reference.
	 * @see #getEntryPoint_ResultingValues()
	 * @generated
	 */
	void setEntryPoint_ResultingValues(EntryPointIdentification_ResultingValues value);

} // EntryPointCorrespondence_JOANAResultingValues
