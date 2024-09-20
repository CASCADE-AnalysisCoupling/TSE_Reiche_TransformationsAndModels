/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondences Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getLevelCorrespondences <em>Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getEntryPointCorrespondences <em>Entry Point Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getParameterCorrespondences <em>Parameter Correspondences</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getCorrespondences_ResolvedImplementationValues()
 * @model
 * @generated
 */
public interface Correspondences_ResolvedImplementationValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Level Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getCorrespondences_ResolvedImplementationValues_LevelCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<LevelCorrespondence_ResolvedImplementationValues> getLevelCorrespondences();

	/**
	 * Returns the value of the '<em><b>Entry Point Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getCorrespondences_ResolvedImplementationValues_EntryPointCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntryPointCorrespondence_JOANAResultingValues> getEntryPointCorrespondences();

	/**
	 * Returns the value of the '<em><b>Parameter Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getCorrespondences_ResolvedImplementationValues_ParameterCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterCorrespondence_JOANAResultingValues> getParameterCorrespondences();

} // Correspondences_ResolvedImplementationValues
