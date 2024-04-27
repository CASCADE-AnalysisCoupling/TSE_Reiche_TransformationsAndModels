/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;

import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Correspondence JOANA Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_SCAR <em>Parameter SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_ResultingValues <em>Parameter Resulting Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getParameterCorrespondence_JOANAResultingValues()
 * @model
 * @generated
 */
public interface ParameterCorrespondence_JOANAResultingValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter SCAR</em>' reference.
	 * @see #setParameter_SCAR(ParameterIdentifying)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getParameterCorrespondence_JOANAResultingValues_Parameter_SCAR()
	 * @model required="true"
	 * @generated
	 */
	ParameterIdentifying getParameter_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_SCAR <em>Parameter SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter SCAR</em>' reference.
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	void setParameter_SCAR(ParameterIdentifying value);

	/**
	 * Returns the value of the '<em><b>Parameter Resulting Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Resulting Values</em>' reference.
	 * @see #setParameter_ResultingValues(ParameterIdentification_JOANAResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getParameterCorrespondence_JOANAResultingValues_Parameter_ResultingValues()
	 * @model required="true"
	 * @generated
	 */
	ParameterIdentification_JOANAResultingValues getParameter_ResultingValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_ResultingValues <em>Parameter Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Resulting Values</em>' reference.
	 * @see #getParameter_ResultingValues()
	 * @generated
	 */
	void setParameter_ResultingValues(ParameterIdentification_JOANAResultingValues value);

} // ParameterCorrespondence_JOANAResultingValues
