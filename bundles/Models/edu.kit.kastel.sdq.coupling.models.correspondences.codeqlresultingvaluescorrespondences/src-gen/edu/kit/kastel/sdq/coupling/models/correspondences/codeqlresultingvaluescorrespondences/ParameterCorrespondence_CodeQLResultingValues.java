/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Correspondence Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues#getParameter_SCAR <em>Parameter SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues#getParameter_ResultingValues <em>Parameter Resulting Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getParameterCorrespondence_CodeQLResultingValues()
 * @model
 * @generated
 */
public interface ParameterCorrespondence_CodeQLResultingValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter SCAR</em>' reference.
	 * @see #setParameter_SCAR(ParameterIdentification)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getParameterCorrespondence_CodeQLResultingValues_Parameter_SCAR()
	 * @model required="true"
	 * @generated
	 */
	ParameterIdentification getParameter_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues#getParameter_SCAR <em>Parameter SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter SCAR</em>' reference.
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	void setParameter_SCAR(ParameterIdentification value);

	/**
	 * Returns the value of the '<em><b>Parameter Resulting Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Resulting Values</em>' reference.
	 * @see #setParameter_ResultingValues(ParameterIdentificiation_CodeQLResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getParameterCorrespondence_CodeQLResultingValues_Parameter_ResultingValues()
	 * @model required="true"
	 * @generated
	 */
	ParameterIdentificiation_CodeQLResultingValues getParameter_ResultingValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues#getParameter_ResultingValues <em>Parameter Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Resulting Values</em>' reference.
	 * @see #getParameter_ResultingValues()
	 * @generated
	 */
	void setParameter_ResultingValues(ParameterIdentificiation_CodeQLResultingValues value);

} // ParameterCorrespondence_CodeQLResultingValues
