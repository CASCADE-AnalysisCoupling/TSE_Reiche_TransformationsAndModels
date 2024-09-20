/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage
 * @generated
 */
public interface CodeqlscarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeqlscarFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source Code Analysis Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Code Analysis Result</em>'.
	 * @generated
	 */
	SourceCodeAnalysisResult createSourceCodeAnalysisResult();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	Result createResult();

	/**
	 * Returns a new object of class '<em>Result Entry Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Entry Element</em>'.
	 * @generated
	 */
	<T extends SystemElement> ResultEntryElement<T> createResultEntryElement();

	/**
	 * Returns a new object of class '<em>Rule Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Id</em>'.
	 * @generated
	 */
	RuleId createRuleId();

	/**
	 * Returns a new object of class '<em>Parameter SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter SCAR</em>'.
	 * @generated
	 */
	Parameter_SCAR createParameter_SCAR();

	/**
	 * Returns a new object of class '<em>Field SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field SCAR</em>'.
	 * @generated
	 */
	Field_SCAR createField_SCAR();

	/**
	 * Returns a new object of class '<em>Security Level SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Level SCAR</em>'.
	 * @generated
	 */
	SecurityLevel_SCAR createSecurityLevel_SCAR();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodeqlscarPackage getCodeqlscarPackage();

} //CodeqlscarFactory
