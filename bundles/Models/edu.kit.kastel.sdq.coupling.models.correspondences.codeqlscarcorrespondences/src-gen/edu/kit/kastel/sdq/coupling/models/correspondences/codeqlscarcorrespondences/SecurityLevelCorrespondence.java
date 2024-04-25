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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getCodeQLSecurityLevel <em>Code QL Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getCodeQLSCARSecurityLevel <em>Code QLSCAR Security Level</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getSecurityLevelCorrespondence()
 * @model
 * @generated
 */
public interface SecurityLevelCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Code QL Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code QL Security Level</em>' reference.
	 * @see #setCodeQLSecurityLevel(SecurityLevel)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getSecurityLevelCorrespondence_CodeQLSecurityLevel()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel getCodeQLSecurityLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getCodeQLSecurityLevel <em>Code QL Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code QL Security Level</em>' reference.
	 * @see #getCodeQLSecurityLevel()
	 * @generated
	 */
	void setCodeQLSecurityLevel(SecurityLevel value);

	/**
	 * Returns the value of the '<em><b>Code QLSCAR Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code QLSCAR Security Level</em>' reference.
	 * @see #setCodeQLSCARSecurityLevel(SecurityLevel_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#getSecurityLevelCorrespondence_CodeQLSCARSecurityLevel()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel_SCAR getCodeQLSCARSecurityLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getCodeQLSCARSecurityLevel <em>Code QLSCAR Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code QLSCAR Security Level</em>' reference.
	 * @see #getCodeQLSCARSecurityLevel()
	 * @generated
	 */
	void setCodeQLSCARSecurityLevel(SecurityLevel_SCAR value);

} // SecurityLevelCorrespondence
