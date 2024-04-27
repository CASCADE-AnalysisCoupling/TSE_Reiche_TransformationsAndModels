/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.models.joana.Level;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Correspondence JOANA Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_JOANAResultingValues#getLevel_JOANA <em>Level JOANA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_JOANAResultingValues#getLevel_ResultingValues <em>Level Resulting Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getLevelCorrespondence_JOANAResultingValues()
 * @model
 * @generated
 */
public interface LevelCorrespondence_JOANAResultingValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Level JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level JOANA</em>' reference.
	 * @see #setLevel_JOANA(Level)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getLevelCorrespondence_JOANAResultingValues_Level_JOANA()
	 * @model required="true"
	 * @generated
	 */
	Level getLevel_JOANA();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_JOANAResultingValues#getLevel_JOANA <em>Level JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level JOANA</em>' reference.
	 * @see #getLevel_JOANA()
	 * @generated
	 */
	void setLevel_JOANA(Level value);

	/**
	 * Returns the value of the '<em><b>Level Resulting Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Resulting Values</em>' reference.
	 * @see #setLevel_ResultingValues(Level_ResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getLevelCorrespondence_JOANAResultingValues_Level_ResultingValues()
	 * @model required="true"
	 * @generated
	 */
	Level_ResultingValues getLevel_ResultingValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_JOANAResultingValues#getLevel_ResultingValues <em>Level Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Resulting Values</em>' reference.
	 * @see #getLevel_ResultingValues()
	 * @generated
	 */
	void setLevel_ResultingValues(Level_ResultingValues value);

} // LevelCorrespondence_JOANAResultingValues
