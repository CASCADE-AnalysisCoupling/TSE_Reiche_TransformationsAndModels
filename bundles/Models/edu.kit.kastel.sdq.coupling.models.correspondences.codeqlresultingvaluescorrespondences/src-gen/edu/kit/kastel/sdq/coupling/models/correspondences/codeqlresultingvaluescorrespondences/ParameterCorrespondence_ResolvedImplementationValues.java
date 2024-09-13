/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Correspondence Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues#getParameter_SCAR <em>Parameter SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues#getParameter_ResolvedImplementationValues <em>Parameter Resolved Implementation Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getParameterCorrespondence_ResolvedImplementationValues()
 * @model
 * @generated
 */
public interface ParameterCorrespondence_ResolvedImplementationValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter SCAR</em>' reference.
	 * @see #setParameter_SCAR(Parameter_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getParameterCorrespondence_ResolvedImplementationValues_Parameter_SCAR()
	 * @model required="true"
	 * @generated
	 */
	Parameter_SCAR getParameter_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues#getParameter_SCAR <em>Parameter SCAR</em>}' reference.
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
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getParameterCorrespondence_ResolvedImplementationValues_Parameter_ResolvedImplementationValues()
	 * @model required="true"
	 * @generated
	 */
	Parameter_ResolvedImplementationValues getParameter_ResolvedImplementationValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues#getParameter_ResolvedImplementationValues <em>Parameter Resolved Implementation Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Resolved Implementation Values</em>' reference.
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	void setParameter_ResolvedImplementationValues(Parameter_ResolvedImplementationValues value);

} // ParameterCorrespondence_ResolvedImplementationValues
