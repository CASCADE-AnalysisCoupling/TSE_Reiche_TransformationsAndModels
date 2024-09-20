/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_ResolvedImplementationValues <em>Entry Point Resolved Implementation Values</em>}</li>
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
	 * @see #setEntryPoint_SCAR(EntryPoint_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_SCAR()
	 * @model required="true"
	 * @generated
	 */
	EntryPoint_SCAR getEntryPoint_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_SCAR <em>Entry Point SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point SCAR</em>' reference.
	 * @see #getEntryPoint_SCAR()
	 * @generated
	 */
	void setEntryPoint_SCAR(EntryPoint_SCAR value);

	/**
	 * Returns the value of the '<em><b>Entry Point Resolved Implementation Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point Resolved Implementation Values</em>' reference.
	 * @see #setEntryPoint_ResolvedImplementationValues(EntryPoint_ResolvedImplementationValues)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_ResolvedImplementationValues()
	 * @model required="true"
	 * @generated
	 */
	EntryPoint_ResolvedImplementationValues getEntryPoint_ResolvedImplementationValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_ResolvedImplementationValues <em>Entry Point Resolved Implementation Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point Resolved Implementation Values</em>' reference.
	 * @see #getEntryPoint_ResolvedImplementationValues()
	 * @generated
	 */
	void setEntryPoint_ResolvedImplementationValues(EntryPoint_ResolvedImplementationValues value);

} // EntryPointCorrespondence_JOANAResultingValues
