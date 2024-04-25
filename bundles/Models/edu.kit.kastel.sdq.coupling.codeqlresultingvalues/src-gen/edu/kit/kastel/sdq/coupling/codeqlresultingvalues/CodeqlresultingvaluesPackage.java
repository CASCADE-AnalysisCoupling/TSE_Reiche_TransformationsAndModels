/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesFactory
 * @model kind="package"
 * @generated
 */
public interface CodeqlresultingvaluesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codeqlresultingvalues";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codeqlresultingvalues";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codeqlresultingvalues";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeqlresultingvaluesPackage eINSTANCE = edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeQLResultingValuesImpl <em>Code QL Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeQLResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getCodeQLResultingValues()
	 * @generated
	 */
	int CODE_QL_RESULTING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Resulting Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QL_RESULTING_VALUES__RESULTING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QL_RESULTING_VALUES__SECURITY_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>System Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QL_RESULTING_VALUES__SYSTEM_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QL_RESULTING_VALUES__CONFIGURATIONS = 3;

	/**
	 * The number of structural features of the '<em>Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QL_RESULTING_VALUES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QL_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ParameterIdentificiation_CodeQLResultingValuesImpl <em>Parameter Identificiation Code QL Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ParameterIdentificiation_CodeQLResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getParameterIdentificiation_CodeQLResultingValues()
	 * @generated
	 */
	int PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__METHOD_NAME = 2;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME = 3;

	/**
	 * The number of structural features of the '<em>Parameter Identificiation Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter Identificiation Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResultingValueImpl <em>Resulting Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResultingValueImpl
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getResultingValue()
	 * @generated
	 */
	int RESULTING_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Resulting Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTING_VALUE__RESULTING_SECURITY_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTING_VALUE__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTING_VALUE__CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>Resulting Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTING_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resulting Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTING_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.SecurityLevel_ResultingValuesImpl <em>Security Level Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.SecurityLevel_ResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getSecurityLevel_ResultingValues()
	 * @generated
	 */
	int SECURITY_LEVEL_RESULTING_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_RESULTING_VALUES__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_RESULTING_VALUES__NAME = IdentifierPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Security Level Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_RESULTING_VALUES_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Level Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_RESULTING_VALUES_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ConfigurationID_ResultingValuesImpl <em>Configuration ID Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ConfigurationID_ResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getConfigurationID_ResultingValues()
	 * @generated
	 */
	int CONFIGURATION_ID_RESULTING_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ID_RESULTING_VALUES__ID = 0;

	/**
	 * The number of structural features of the '<em>Configuration ID Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ID_RESULTING_VALUES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration ID Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ID_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues <em>Code QL Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code QL Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues
	 * @generated
	 */
	EClass getCodeQLResultingValues();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getResultingValues <em>Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getResultingValues()
	 * @see #getCodeQLResultingValues()
	 * @generated
	 */
	EReference getCodeQLResultingValues_ResultingValues();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getSecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getSecurityLevel()
	 * @see #getCodeQLResultingValues()
	 * @generated
	 */
	EReference getCodeQLResultingValues_SecurityLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getSystemElements <em>System Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Elements</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getSystemElements()
	 * @see #getCodeQLResultingValues()
	 * @generated
	 */
	EReference getCodeQLResultingValues_SystemElements();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getConfigurations()
	 * @see #getCodeQLResultingValues()
	 * @generated
	 */
	EReference getCodeQLResultingValues_Configurations();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues <em>Parameter Identificiation Code QL Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Identificiation Code QL Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues
	 * @generated
	 */
	EClass getParameterIdentificiation_CodeQLResultingValues();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues#getParameterName()
	 * @see #getParameterIdentificiation_CodeQLResultingValues()
	 * @generated
	 */
	EAttribute getParameterIdentificiation_CodeQLResultingValues_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues#getParameterType()
	 * @see #getParameterIdentificiation_CodeQLResultingValues()
	 * @generated
	 */
	EAttribute getParameterIdentificiation_CodeQLResultingValues_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues#getMethodName()
	 * @see #getParameterIdentificiation_CodeQLResultingValues()
	 * @generated
	 */
	EAttribute getParameterIdentificiation_CodeQLResultingValues_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues#getFullyQualifiedClassName()
	 * @see #getParameterIdentificiation_CodeQLResultingValues()
	 * @generated
	 */
	EAttribute getParameterIdentificiation_CodeQLResultingValues_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue <em>Resulting Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resulting Value</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue
	 * @generated
	 */
	EClass getResultingValue();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getResultingSecurityLevel <em>Resulting Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resulting Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getResultingSecurityLevel()
	 * @see #getResultingValue()
	 * @generated
	 */
	EReference getResultingValue_ResultingSecurityLevel();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getParameter()
	 * @see #getResultingValue()
	 * @generated
	 */
	EReference getResultingValue_Parameter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getConfiguration()
	 * @see #getResultingValue()
	 * @generated
	 */
	EReference getResultingValue_Configuration();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues <em>Security Level Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Level Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues
	 * @generated
	 */
	EClass getSecurityLevel_ResultingValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues <em>Configuration ID Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration ID Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues
	 * @generated
	 */
	EClass getConfigurationID_ResultingValues();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues#getId()
	 * @see #getConfigurationID_ResultingValues()
	 * @generated
	 */
	EAttribute getConfigurationID_ResultingValues_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeqlresultingvaluesFactory getCodeqlresultingvaluesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeQLResultingValuesImpl <em>Code QL Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeQLResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getCodeQLResultingValues()
		 * @generated
		 */
		EClass CODE_QL_RESULTING_VALUES = eINSTANCE.getCodeQLResultingValues();

		/**
		 * The meta object literal for the '<em><b>Resulting Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_QL_RESULTING_VALUES__RESULTING_VALUES = eINSTANCE.getCodeQLResultingValues_ResultingValues();

		/**
		 * The meta object literal for the '<em><b>Security Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_QL_RESULTING_VALUES__SECURITY_LEVEL = eINSTANCE.getCodeQLResultingValues_SecurityLevel();

		/**
		 * The meta object literal for the '<em><b>System Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_QL_RESULTING_VALUES__SYSTEM_ELEMENTS = eINSTANCE.getCodeQLResultingValues_SystemElements();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_QL_RESULTING_VALUES__CONFIGURATIONS = eINSTANCE.getCodeQLResultingValues_Configurations();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ParameterIdentificiation_CodeQLResultingValuesImpl <em>Parameter Identificiation Code QL Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ParameterIdentificiation_CodeQLResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getParameterIdentificiation_CodeQLResultingValues()
		 * @generated
		 */
		EClass PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES = eINSTANCE
				.getParameterIdentificiation_CodeQLResultingValues();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_NAME = eINSTANCE
				.getParameterIdentificiation_CodeQLResultingValues_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_TYPE = eINSTANCE
				.getParameterIdentificiation_CodeQLResultingValues_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__METHOD_NAME = eINSTANCE
				.getParameterIdentificiation_CodeQLResultingValues_MethodName();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE
				.getParameterIdentificiation_CodeQLResultingValues_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResultingValueImpl <em>Resulting Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResultingValueImpl
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getResultingValue()
		 * @generated
		 */
		EClass RESULTING_VALUE = eINSTANCE.getResultingValue();

		/**
		 * The meta object literal for the '<em><b>Resulting Security Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTING_VALUE__RESULTING_SECURITY_LEVEL = eINSTANCE.getResultingValue_ResultingSecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTING_VALUE__PARAMETER = eINSTANCE.getResultingValue_Parameter();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTING_VALUE__CONFIGURATION = eINSTANCE.getResultingValue_Configuration();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.SecurityLevel_ResultingValuesImpl <em>Security Level Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.SecurityLevel_ResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getSecurityLevel_ResultingValues()
		 * @generated
		 */
		EClass SECURITY_LEVEL_RESULTING_VALUES = eINSTANCE.getSecurityLevel_ResultingValues();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ConfigurationID_ResultingValuesImpl <em>Configuration ID Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ConfigurationID_ResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getConfigurationID_ResultingValues()
		 * @generated
		 */
		EClass CONFIGURATION_ID_RESULTING_VALUES = eINSTANCE.getConfigurationID_ResultingValues();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_ID_RESULTING_VALUES__ID = eINSTANCE.getConfigurationID_ResultingValues_Id();

	}

} //CodeqlresultingvaluesPackage
