/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Level Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getSecurityLevel_SCAR <em>Security Level SCAR</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getSecurityLevelCorrespondence()
 * @model
 * @generated
 */
public interface SecurityLevelCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Level Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Code QL</em>' reference.
	 * @see #setSecurityLevel_CodeQL(SecurityLevel)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getSecurityLevelCorrespondence_SecurityLevel_CodeQL()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel getSecurityLevel_CodeQL();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level Code QL</em>' reference.
	 * @see #getSecurityLevel_CodeQL()
	 * @generated
	 */
	void setSecurityLevel_CodeQL(SecurityLevel value);

	/**
	 * Returns the value of the '<em><b>Security Level SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level SCAR</em>' reference.
	 * @see #setSecurityLevel_SCAR(SecurityLevel_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getSecurityLevelCorrespondence_SecurityLevel_SCAR()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel_SCAR getSecurityLevel_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getSecurityLevel_SCAR <em>Security Level SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level SCAR</em>' reference.
	 * @see #getSecurityLevel_SCAR()
	 * @generated
	 */
	void setSecurityLevel_SCAR(SecurityLevel_SCAR value);

} // SecurityLevelCorrespondence
