/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Level Correspondence Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues#getSecurityLevel_ResolvedImplementationValues <em>Security Level Resolved Implementation Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getSecurityLevelCorrespondence_ResolvedImplementationValues()
 * @model
 * @generated
 */
public interface SecurityLevelCorrespondence_ResolvedImplementationValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Level Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Code QL</em>' reference.
	 * @see #setSecurityLevel_CodeQL(SecurityLevel)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getSecurityLevelCorrespondence_ResolvedImplementationValues_SecurityLevel_CodeQL()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel getSecurityLevel_CodeQL();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level Code QL</em>' reference.
	 * @see #getSecurityLevel_CodeQL()
	 * @generated
	 */
	void setSecurityLevel_CodeQL(SecurityLevel value);

	/**
	 * Returns the value of the '<em><b>Security Level Resolved Implementation Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Resolved Implementation Values</em>' reference.
	 * @see #setSecurityLevel_ResolvedImplementationValues(SecurityLevel_ResolvedImplementationValues)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#getSecurityLevelCorrespondence_ResolvedImplementationValues_SecurityLevel_ResolvedImplementationValues()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel_ResolvedImplementationValues getSecurityLevel_ResolvedImplementationValues();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues#getSecurityLevel_ResolvedImplementationValues <em>Security Level Resolved Implementation Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level Resolved Implementation Values</em>' reference.
	 * @see #getSecurityLevel_ResolvedImplementationValues()
	 * @generated
	 */
	void setSecurityLevel_ResolvedImplementationValues(SecurityLevel_ResolvedImplementationValues value);

} // SecurityLevelCorrespondence_ResolvedImplementationValues
