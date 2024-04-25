/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage
 * @generated
 */
public interface CodeqlresultingvaluesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeqlresultingvaluesFactory eINSTANCE = edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Code QL Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code QL Resulting Values</em>'.
	 * @generated
	 */
	CodeQLResultingValues createCodeQLResultingValues();

	/**
	 * Returns a new object of class '<em>Parameter Identificiation Code QL Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Identificiation Code QL Resulting Values</em>'.
	 * @generated
	 */
	ParameterIdentificiation_CodeQLResultingValues createParameterIdentificiation_CodeQLResultingValues();

	/**
	 * Returns a new object of class '<em>Resulting Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resulting Value</em>'.
	 * @generated
	 */
	ResultingValue createResultingValue();

	/**
	 * Returns a new object of class '<em>Security Level Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Level Resulting Values</em>'.
	 * @generated
	 */
	SecurityLevel_ResultingValues createSecurityLevel_ResultingValues();

	/**
	 * Returns a new object of class '<em>Configuration ID Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration ID Resulting Values</em>'.
	 * @generated
	 */
	ConfigurationID_ResultingValues createConfigurationID_ResultingValues();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodeqlresultingvaluesPackage getCodeqlresultingvaluesPackage();

} //CodeqlresultingvaluesFactory
