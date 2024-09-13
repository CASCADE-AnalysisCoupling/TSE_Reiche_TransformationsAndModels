/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.models.joana.Level;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Correspondence Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues#getLevel_JOANA <em>Level JOANA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues#getLevel_ResolvedImplementationValues <em>Level Resolved Implementation Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getLevelCorrespondence_ResolvedImplementationValues()
 * @model
 * @generated
 */
public interface LevelCorrespondence_ResolvedImplementationValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Level JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level JOANA</em>' reference.
	 * @see #setLevel_JOANA(Level)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getLevelCorrespondence_ResolvedImplementationValues_Level_JOANA()
	 * @model required="true"
	 * @generated
	 */
	Level getLevel_JOANA();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues#getLevel_JOANA <em>Level JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level JOANA</em>' reference.
	 * @see #getLevel_JOANA()
	 * @generated
	 */
	void setLevel_JOANA(Level value);

	/**
	 * Returns the value of the '<em><b>Level Resolved Implementation Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Resolved Implementation Values</em>' reference.
	 * @see #setLevel_ResolvedImplementationValues(Level_ResolvedImplementationValues)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getLevelCorrespondence_ResolvedImplementationValues_Level_ResolvedImplementationValues()
	 * @model required="true"
	 * @generated
	 */
	Level_ResolvedImplementationValues getLevel_ResolvedImplementationValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues#getLevel_ResolvedImplementationValues <em>Level Resolved Implementation Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Resolved Implementation Values</em>' reference.
	 * @see #getLevel_ResolvedImplementationValues()
	 * @generated
	 */
	void setLevel_ResolvedImplementationValues(Level_ResolvedImplementationValues value);

} // LevelCorrespondence_ResolvedImplementationValues
