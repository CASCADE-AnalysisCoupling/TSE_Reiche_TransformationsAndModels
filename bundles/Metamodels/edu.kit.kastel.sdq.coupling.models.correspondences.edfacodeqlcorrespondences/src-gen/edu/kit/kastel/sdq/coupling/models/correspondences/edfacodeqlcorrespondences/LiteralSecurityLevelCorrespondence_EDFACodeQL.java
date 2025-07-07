/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Security Level Correspondence EDFA Code QL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL#getLiterals_EDFA <em>Literals EDFA</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage#getLiteralSecurityLevelCorrespondence_EDFACodeQL()
 * @model
 * @generated
 */
public interface LiteralSecurityLevelCorrespondence_EDFACodeQL extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Level Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Code QL</em>' reference.
	 * @see #setSecurityLevel_CodeQL(SecurityLevel)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage#getLiteralSecurityLevelCorrespondence_EDFACodeQL_SecurityLevel_CodeQL()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel getSecurityLevel_CodeQL();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level Code QL</em>' reference.
	 * @see #getSecurityLevel_CodeQL()
	 * @generated
	 */
	void setSecurityLevel_CodeQL(SecurityLevel value);

	/**
	 * Returns the value of the '<em><b>Literals EDFA</b></em>' reference list.
	 * The list contents are of type {@link org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals EDFA</em>' reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage#getLiteralSecurityLevelCorrespondence_EDFACodeQL_Literals_EDFA()
	 * @model required="true"
	 * @generated
	 */
	EList<Literal> getLiterals_EDFA();

} // LiteralSecurityLevelCorrespondence_EDFACodeQL
