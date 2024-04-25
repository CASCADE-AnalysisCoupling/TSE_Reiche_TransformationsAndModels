/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Level Correspondence Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues#getSecurityLevel_CodeQLResultingValues <em>Security Level Code QL Resulting Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getSecurityLevelCorrespondence_CodeQLResultingValues()
 * @model
 * @generated
 */
public interface SecurityLevelCorrespondence_CodeQLResultingValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Level Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Code QL</em>' reference.
	 * @see #setSecurityLevel_CodeQL(SecurityLevel)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getSecurityLevelCorrespondence_CodeQLResultingValues_SecurityLevel_CodeQL()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel getSecurityLevel_CodeQL();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level Code QL</em>' reference.
	 * @see #getSecurityLevel_CodeQL()
	 * @generated
	 */
	void setSecurityLevel_CodeQL(SecurityLevel value);

	/**
	 * Returns the value of the '<em><b>Security Level Code QL Resulting Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Code QL Resulting Values</em>' reference.
	 * @see #setSecurityLevel_CodeQLResultingValues(SecurityLevel_ResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getSecurityLevelCorrespondence_CodeQLResultingValues_SecurityLevel_CodeQLResultingValues()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel_ResultingValues getSecurityLevel_CodeQLResultingValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues#getSecurityLevel_CodeQLResultingValues <em>Security Level Code QL Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level Code QL Resulting Values</em>' reference.
	 * @see #getSecurityLevel_CodeQLResultingValues()
	 * @generated
	 */
	void setSecurityLevel_CodeQLResultingValues(SecurityLevel_ResultingValues value);

} // SecurityLevelCorrespondence_CodeQLResultingValues
