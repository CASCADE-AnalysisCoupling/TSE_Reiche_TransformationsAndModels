/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesFactory
 * @model kind="package"
 * @generated
 */
public interface CodeqlresultingvaluescorrespondencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codeqlresultingvaluescorrespondences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codeqlresultingvaluescorrespondences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codeqlresultingvaluescorrespondences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeqlresultingvaluescorrespondencesPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.CodeqlresultingvaluescorrespondencesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.Correspondences_CodeQLResultingValuesImpl <em>Correspondences Code QL Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.Correspondences_CodeQLResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.CodeqlresultingvaluescorrespondencesPackageImpl#getCorrespondences_CodeQLResultingValues()
	 * @generated
	 */
	int CORRESPONDENCES_CODE_QL_RESULTING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Security Level Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Configuration Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_CODE_QL_RESULTING_VALUES__CONFIGURATION_CORRESPONDENCES = 1;

	/**
	 * The feature id for the '<em><b>Parameter Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_CODE_QL_RESULTING_VALUES__PARAMETER_CORRESPONDENCES = 2;

	/**
	 * The number of structural features of the '<em>Correspondences Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_CODE_QL_RESULTING_VALUES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Correspondences Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_CODE_QL_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.SecurityLevelCorrespondence_CodeQLResultingValuesImpl <em>Security Level Correspondence Code QL Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.SecurityLevelCorrespondence_CodeQLResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.CodeqlresultingvaluescorrespondencesPackageImpl#getSecurityLevelCorrespondence_CodeQLResultingValues()
	 * @generated
	 */
	int SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Security Level Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL = 0;

	/**
	 * The feature id for the '<em><b>Security Level Code QL Resulting Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL_RESULTING_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Security Level Correspondence Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Level Correspondence Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ConfigurationCorrespondence_CodeQLResultingValuesImpl <em>Configuration Correspondence Code QL Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ConfigurationCorrespondence_CodeQLResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.CodeqlresultingvaluescorrespondencesPackageImpl#getConfigurationCorrespondence_CodeQLResultingValues()
	 * @generated
	 */
	int CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Configuration SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_SCAR = 0;

	/**
	 * The feature id for the '<em><b>Configuration Resulting Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_RESULTING_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Configuration Correspondence Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuration Correspondence Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ParameterCorrespondence_CodeQLResultingValuesImpl <em>Parameter Correspondence Code QL Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ParameterCorrespondence_CodeQLResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.CodeqlresultingvaluescorrespondencesPackageImpl#getParameterCorrespondence_CodeQLResultingValues()
	 * @generated
	 */
	int PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Parameter SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_SCAR = 0;

	/**
	 * The feature id for the '<em><b>Parameter Resulting Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_RESULTING_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Parameter Correspondence Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Correspondence Code QL Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues <em>Correspondences Code QL Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondences Code QL Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues
	 * @generated
	 */
	EClass getCorrespondences_CodeQLResultingValues();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues#getSecurityLevelCorrespondences <em>Security Level Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Level Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues#getSecurityLevelCorrespondences()
	 * @see #getCorrespondences_CodeQLResultingValues()
	 * @generated
	 */
	EReference getCorrespondences_CodeQLResultingValues_SecurityLevelCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues#getConfigurationCorrespondences <em>Configuration Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues#getConfigurationCorrespondences()
	 * @see #getCorrespondences_CodeQLResultingValues()
	 * @generated
	 */
	EReference getCorrespondences_CodeQLResultingValues_ConfigurationCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues#getParameterCorrespondences <em>Parameter Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues#getParameterCorrespondences()
	 * @see #getCorrespondences_CodeQLResultingValues()
	 * @generated
	 */
	EReference getCorrespondences_CodeQLResultingValues_ParameterCorrespondences();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues <em>Security Level Correspondence Code QL Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Level Correspondence Code QL Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues
	 * @generated
	 */
	EClass getSecurityLevelCorrespondence_CodeQLResultingValues();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Level Code QL</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues#getSecurityLevel_CodeQL()
	 * @see #getSecurityLevelCorrespondence_CodeQLResultingValues()
	 * @generated
	 */
	EReference getSecurityLevelCorrespondence_CodeQLResultingValues_SecurityLevel_CodeQL();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues#getSecurityLevel_CodeQLResultingValues <em>Security Level Code QL Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Level Code QL Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues#getSecurityLevel_CodeQLResultingValues()
	 * @see #getSecurityLevelCorrespondence_CodeQLResultingValues()
	 * @generated
	 */
	EReference getSecurityLevelCorrespondence_CodeQLResultingValues_SecurityLevel_CodeQLResultingValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues <em>Configuration Correspondence Code QL Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Correspondence Code QL Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues
	 * @generated
	 */
	EClass getConfigurationCorrespondence_CodeQLResultingValues();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues#getConfiguration_SCAR <em>Configuration SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues#getConfiguration_SCAR()
	 * @see #getConfigurationCorrespondence_CodeQLResultingValues()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_CodeQLResultingValues_Configuration_SCAR();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues#getConfiguration_ResultingValues <em>Configuration Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues#getConfiguration_ResultingValues()
	 * @see #getConfigurationCorrespondence_CodeQLResultingValues()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_CodeQLResultingValues_Configuration_ResultingValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues <em>Parameter Correspondence Code QL Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Correspondence Code QL Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues
	 * @generated
	 */
	EClass getParameterCorrespondence_CodeQLResultingValues();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues#getParameter_SCAR <em>Parameter SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues#getParameter_SCAR()
	 * @see #getParameterCorrespondence_CodeQLResultingValues()
	 * @generated
	 */
	EReference getParameterCorrespondence_CodeQLResultingValues_Parameter_SCAR();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues#getParameter_ResultingValues <em>Parameter Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues#getParameter_ResultingValues()
	 * @see #getParameterCorrespondence_CodeQLResultingValues()
	 * @generated
	 */
	EReference getParameterCorrespondence_CodeQLResultingValues_Parameter_ResultingValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeqlresultingvaluescorrespondencesFactory getCodeqlresultingvaluescorrespondencesFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.Correspondences_CodeQLResultingValuesImpl <em>Correspondences Code QL Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.Correspondences_CodeQLResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.CodeqlresultingvaluescorrespondencesPackageImpl#getCorrespondences_CodeQLResultingValues()
		 * @generated
		 */
		EClass CORRESPONDENCES_CODE_QL_RESULTING_VALUES = eINSTANCE.getCorrespondences_CodeQLResultingValues();

		/**
		 * The meta object literal for the '<em><b>Security Level Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_CodeQLResultingValues_SecurityLevelCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Configuration Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_CODE_QL_RESULTING_VALUES__CONFIGURATION_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_CodeQLResultingValues_ConfigurationCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Parameter Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_CODE_QL_RESULTING_VALUES__PARAMETER_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_CodeQLResultingValues_ParameterCorrespondences();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.SecurityLevelCorrespondence_CodeQLResultingValuesImpl <em>Security Level Correspondence Code QL Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.SecurityLevelCorrespondence_CodeQLResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.CodeqlresultingvaluescorrespondencesPackageImpl#getSecurityLevelCorrespondence_CodeQLResultingValues()
		 * @generated
		 */
		EClass SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES = eINSTANCE
				.getSecurityLevelCorrespondence_CodeQLResultingValues();

		/**
		 * The meta object literal for the '<em><b>Security Level Code QL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL = eINSTANCE
				.getSecurityLevelCorrespondence_CodeQLResultingValues_SecurityLevel_CodeQL();

		/**
		 * The meta object literal for the '<em><b>Security Level Code QL Resulting Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL_RESULTING_VALUES = eINSTANCE
				.getSecurityLevelCorrespondence_CodeQLResultingValues_SecurityLevel_CodeQLResultingValues();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ConfigurationCorrespondence_CodeQLResultingValuesImpl <em>Configuration Correspondence Code QL Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ConfigurationCorrespondence_CodeQLResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.CodeqlresultingvaluescorrespondencesPackageImpl#getConfigurationCorrespondence_CodeQLResultingValues()
		 * @generated
		 */
		EClass CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES = eINSTANCE
				.getConfigurationCorrespondence_CodeQLResultingValues();

		/**
		 * The meta object literal for the '<em><b>Configuration SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_SCAR = eINSTANCE
				.getConfigurationCorrespondence_CodeQLResultingValues_Configuration_SCAR();

		/**
		 * The meta object literal for the '<em><b>Configuration Resulting Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_RESULTING_VALUES = eINSTANCE
				.getConfigurationCorrespondence_CodeQLResultingValues_Configuration_ResultingValues();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ParameterCorrespondence_CodeQLResultingValuesImpl <em>Parameter Correspondence Code QL Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ParameterCorrespondence_CodeQLResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.CodeqlresultingvaluescorrespondencesPackageImpl#getParameterCorrespondence_CodeQLResultingValues()
		 * @generated
		 */
		EClass PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES = eINSTANCE
				.getParameterCorrespondence_CodeQLResultingValues();

		/**
		 * The meta object literal for the '<em><b>Parameter SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_SCAR = eINSTANCE
				.getParameterCorrespondence_CodeQLResultingValues_Parameter_SCAR();

		/**
		 * The meta object literal for the '<em><b>Parameter Resulting Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_RESULTING_VALUES = eINSTANCE
				.getParameterCorrespondence_CodeQLResultingValues_Parameter_ResultingValues();

	}

} //CodeqlresultingvaluescorrespondencesPackage
