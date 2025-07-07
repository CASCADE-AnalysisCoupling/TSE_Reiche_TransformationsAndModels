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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValuesImpl <em>Resolved Implementation Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getResolvedImplementationValues()
	 * @generated
	 */
	int RESOLVED_IMPLEMENTATION_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Resulting Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>System Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATIONS = 3;

	/**
	 * The number of structural features of the '<em>Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl <em>Parameter Resolved Implementation Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME = 2;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME = 3;

	/**
	 * The number of structural features of the '<em>Parameter Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValueImpl <em>Resolved Implementation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValueImpl
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getResolvedImplementationValue()
	 * @generated
	 */
	int RESOLVED_IMPLEMENTATION_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Resulting Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUE__RESULTING_SECURITY_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUE__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUE__RULE_ID = 2;

	/**
	 * The number of structural features of the '<em>Resolved Implementation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resolved Implementation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.SecurityLevel_ResolvedImplementationValuesImpl <em>Security Level Resolved Implementation Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.SecurityLevel_ResolvedImplementationValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getSecurityLevel_ResolvedImplementationValues()
	 * @generated
	 */
	int SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES__NAME = IdentifierPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Security Level Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Level Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.RuleId_ResolvedImplementationValueImpl <em>Rule Id Resolved Implementation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.RuleId_ResolvedImplementationValueImpl
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getRuleId_ResolvedImplementationValue()
	 * @generated
	 */
	int RULE_ID_RESOLVED_IMPLEMENTATION_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ID_RESOLVED_IMPLEMENTATION_VALUE__ID = 0;

	/**
	 * The number of structural features of the '<em>Rule Id Resolved Implementation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ID_RESOLVED_IMPLEMENTATION_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule Id Resolved Implementation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ID_RESOLVED_IMPLEMENTATION_VALUE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues <em>Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues
	 * @generated
	 */
	EClass getResolvedImplementationValues();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getResultingValues <em>Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getResultingValues()
	 * @see #getResolvedImplementationValues()
	 * @generated
	 */
	EReference getResolvedImplementationValues_ResultingValues();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getSecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getSecurityLevel()
	 * @see #getResolvedImplementationValues()
	 * @generated
	 */
	EReference getResolvedImplementationValues_SecurityLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getSystemElements <em>System Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Elements</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getSystemElements()
	 * @see #getResolvedImplementationValues()
	 * @generated
	 */
	EReference getResolvedImplementationValues_SystemElements();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getConfigurations()
	 * @see #getResolvedImplementationValues()
	 * @generated
	 */
	EReference getResolvedImplementationValues_Configurations();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues <em>Parameter Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues
	 * @generated
	 */
	EClass getParameter_ResolvedImplementationValues();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues#getParameterName()
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	EAttribute getParameter_ResolvedImplementationValues_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues#getParameterType()
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	EAttribute getParameter_ResolvedImplementationValues_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues#getMethodName()
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	EAttribute getParameter_ResolvedImplementationValues_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues#getFullyQualifiedClassName()
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	EAttribute getParameter_ResolvedImplementationValues_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue <em>Resolved Implementation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolved Implementation Value</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue
	 * @generated
	 */
	EClass getResolvedImplementationValue();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getResultingSecurityLevel <em>Resulting Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resulting Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getResultingSecurityLevel()
	 * @see #getResolvedImplementationValue()
	 * @generated
	 */
	EReference getResolvedImplementationValue_ResultingSecurityLevel();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getParameter()
	 * @see #getResolvedImplementationValue()
	 * @generated
	 */
	EReference getResolvedImplementationValue_Parameter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getRuleId <em>Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule Id</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getRuleId()
	 * @see #getResolvedImplementationValue()
	 * @generated
	 */
	EReference getResolvedImplementationValue_RuleId();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues <em>Security Level Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Level Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues
	 * @generated
	 */
	EClass getSecurityLevel_ResolvedImplementationValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue <em>Rule Id Resolved Implementation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Id Resolved Implementation Value</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue
	 * @generated
	 */
	EClass getRuleId_ResolvedImplementationValue();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue#getId()
	 * @see #getRuleId_ResolvedImplementationValue()
	 * @generated
	 */
	EAttribute getRuleId_ResolvedImplementationValue_Id();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValuesImpl <em>Resolved Implementation Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getResolvedImplementationValues()
		 * @generated
		 */
		EClass RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE.getResolvedImplementationValues();

		/**
		 * The meta object literal for the '<em><b>Resulting Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES = eINSTANCE
				.getResolvedImplementationValues_ResultingValues();

		/**
		 * The meta object literal for the '<em><b>Security Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL = eINSTANCE
				.getResolvedImplementationValues_SecurityLevel();

		/**
		 * The meta object literal for the '<em><b>System Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS = eINSTANCE
				.getResolvedImplementationValues_SystemElements();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATIONS = eINSTANCE
				.getResolvedImplementationValues_Configurations();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl <em>Parameter Resolved Implementation Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getParameter_ResolvedImplementationValues()
		 * @generated
		 */
		EClass PARAMETER_RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE.getParameter_ResolvedImplementationValues();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_NAME = eINSTANCE
				.getParameter_ResolvedImplementationValues_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE = eINSTANCE
				.getParameter_ResolvedImplementationValues_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME = eINSTANCE
				.getParameter_ResolvedImplementationValues_MethodName();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE
				.getParameter_ResolvedImplementationValues_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValueImpl <em>Resolved Implementation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValueImpl
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getResolvedImplementationValue()
		 * @generated
		 */
		EClass RESOLVED_IMPLEMENTATION_VALUE = eINSTANCE.getResolvedImplementationValue();

		/**
		 * The meta object literal for the '<em><b>Resulting Security Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUE__RESULTING_SECURITY_LEVEL = eINSTANCE
				.getResolvedImplementationValue_ResultingSecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUE__PARAMETER = eINSTANCE.getResolvedImplementationValue_Parameter();

		/**
		 * The meta object literal for the '<em><b>Rule Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUE__RULE_ID = eINSTANCE.getResolvedImplementationValue_RuleId();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.SecurityLevel_ResolvedImplementationValuesImpl <em>Security Level Resolved Implementation Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.SecurityLevel_ResolvedImplementationValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getSecurityLevel_ResolvedImplementationValues()
		 * @generated
		 */
		EClass SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE
				.getSecurityLevel_ResolvedImplementationValues();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.RuleId_ResolvedImplementationValueImpl <em>Rule Id Resolved Implementation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.RuleId_ResolvedImplementationValueImpl
		 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeqlresultingvaluesPackageImpl#getRuleId_ResolvedImplementationValue()
		 * @generated
		 */
		EClass RULE_ID_RESOLVED_IMPLEMENTATION_VALUE = eINSTANCE.getRuleId_ResolvedImplementationValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ID_RESOLVED_IMPLEMENTATION_VALUE__ID = eINSTANCE.getRuleId_ResolvedImplementationValue_Id();

	}

} //CodeqlresultingvaluesPackage
