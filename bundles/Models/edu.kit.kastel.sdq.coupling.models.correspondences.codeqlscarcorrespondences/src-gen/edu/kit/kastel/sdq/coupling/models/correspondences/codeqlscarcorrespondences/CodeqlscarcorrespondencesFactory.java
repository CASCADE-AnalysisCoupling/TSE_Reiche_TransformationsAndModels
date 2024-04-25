/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage
 * @generated
 */
public interface CodeqlscarcorrespondencesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeqlscarcorrespondencesFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Code QLSCAR Correspondences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code QLSCAR Correspondences</em>'.
	 * @generated
	 */
	CodeQLSCARCorrespondences createCodeQLSCARCorrespondences();

	/**
	 * Returns a new object of class '<em>Configuration Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Correspondence</em>'.
	 * @generated
	 */
	ConfigurationCorrespondence createConfigurationCorrespondence();

	/**
	 * Returns a new object of class '<em>Security Level Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Level Correspondence</em>'.
	 * @generated
	 */
	SecurityLevelCorrespondence createSecurityLevelCorrespondence();

	/**
	 * Returns a new object of class '<em>Parameter Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Correspondence</em>'.
	 * @generated
	 */
	ParameterCorrespondence createParameterCorrespondence();

	/**
	 * Returns a new object of class '<em>Field Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Correspondence</em>'.
	 * @generated
	 */
	FieldCorrespondence createFieldCorrespondence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodeqlscarcorrespondencesPackage getCodeqlscarcorrespondencesPackage();

} //CodeqlscarcorrespondencesFactory
