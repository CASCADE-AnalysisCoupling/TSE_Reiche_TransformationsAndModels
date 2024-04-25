/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Code Analysis Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getSystemElementIdentifications <em>System Element Identifications</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getSecurityLevels <em>Security Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getResultEntries <em>Result Entries</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getSourceCodeAnalysisResult()
 * @model
 * @generated
 */
public interface SourceCodeAnalysisResult extends EObject {
	/**
	 * Returns the value of the '<em><b>System Element Identifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElementIdentification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Element Identifications</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getSourceCodeAnalysisResult_SystemElementIdentifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemElementIdentification> getSystemElementIdentifications();

	/**
	 * Returns the value of the '<em><b>Security Levels</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Levels</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getSourceCodeAnalysisResult_SecurityLevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevel_SCAR> getSecurityLevels();

	/**
	 * Returns the value of the '<em><b>Result Entries</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Entries</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getSourceCodeAnalysisResult_ResultEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultEntry> getResultEntries();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getSourceCodeAnalysisResult_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationID_SCAR> getConfigurations();

} // SourceCodeAnalysisResult
