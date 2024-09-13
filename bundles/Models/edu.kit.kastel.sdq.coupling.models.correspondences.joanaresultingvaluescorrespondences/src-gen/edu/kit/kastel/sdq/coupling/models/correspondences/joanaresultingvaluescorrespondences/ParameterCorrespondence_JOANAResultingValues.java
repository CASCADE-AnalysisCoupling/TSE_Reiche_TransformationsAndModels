/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;

import edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_ResolvedImplementationValues <em>Parameter Resolved Implementation Values</em>}</li>
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
	 * @see #setParameter_SCAR(Parameter_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getParameterCorrespondence_JOANAResultingValues_Parameter_SCAR()
	 * @model required="true"
	 * @generated
	 */
	Parameter_SCAR getParameter_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_SCAR <em>Parameter SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter SCAR</em>' reference.
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	void setParameter_SCAR(Parameter_SCAR value);

	/**
	 * Returns the value of the '<em><b>Parameter Resolved Implementation Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Resolved Implementation Values</em>' reference.
	 * @see #setParameter_ResolvedImplementationValues(Parameter_ResolvedImplementationValues)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#getParameterCorrespondence_JOANAResultingValues_Parameter_ResolvedImplementationValues()
	 * @model required="true"
	 * @generated
	 */
	Parameter_ResolvedImplementationValues getParameter_ResolvedImplementationValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_ResolvedImplementationValues <em>Parameter Resolved Implementation Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Resolved Implementation Values</em>' reference.
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	void setParameter_ResolvedImplementationValues(Parameter_ResolvedImplementationValues value);

} // ParameterCorrespondence_JOANAResultingValues
