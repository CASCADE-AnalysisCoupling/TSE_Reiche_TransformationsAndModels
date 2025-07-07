/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesFactory
 * @model kind="package"
 * @generated
 */
public interface CodeqlscarcorrespondencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codeqlscarcorrespondences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codeqlscarcorrespondences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codeqlscarcorrespondences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeqlscarcorrespondencesPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.Correspondences_CodeQLScarImpl <em>Correspondences Code QL Scar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.Correspondences_CodeQLScarImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getCorrespondences_CodeQLScar()
	 * @generated
	 */
	int CORRESPONDENCES_CODE_QL_SCAR = 0;

	/**
	 * The feature id for the '<em><b>System Element Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_CODE_QL_SCAR__SYSTEM_ELEMENT_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Security Level Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_CODE_QL_SCAR__SECURITY_LEVEL_CORRESPONDENCES = 1;

	/**
	 * The feature id for the '<em><b>Configuration Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_CODE_QL_SCAR__CONFIGURATION_CORRESPONDENCES = 2;

	/**
	 * The number of structural features of the '<em>Correspondences Code QL Scar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_CODE_QL_SCAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Correspondences Code QL Scar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_CODE_QL_SCAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ConfigurationCorrespondenceImpl <em>Configuration Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ConfigurationCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getConfigurationCorrespondence()
	 * @generated
	 */
	int CONFIGURATION_CORRESPONDENCE = 1;

	/**
	 * The feature id for the '<em><b>Configuration Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE__CONFIGURATION_CODE_QL = 0;

	/**
	 * The feature id for the '<em><b>Configuration SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE__CONFIGURATION_SCAR = 1;

	/**
	 * The number of structural features of the '<em>Configuration Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuration Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SecurityLevelCorrespondenceImpl <em>Security Level Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SecurityLevelCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getSecurityLevelCorrespondence()
	 * @generated
	 */
	int SECURITY_LEVEL_CORRESPONDENCE = 2;

	/**
	 * The feature id for the '<em><b>Security Level Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_CODE_QL = 0;

	/**
	 * The feature id for the '<em><b>Security Level SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_SCAR = 1;

	/**
	 * The number of structural features of the '<em>Security Level Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Level Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SystemElementCorrespondenceImpl <em>System Element Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SystemElementCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getSystemElementCorrespondence()
	 * @generated
	 */
	int SYSTEM_ELEMENT_CORRESPONDENCE = 5;

	/**
	 * The number of structural features of the '<em>System Element Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Element Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ParameterCorrespondenceImpl <em>Parameter Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ParameterCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getParameterCorrespondence()
	 * @generated
	 */
	int PARAMETER_CORRESPONDENCE = 3;

	/**
	 * The feature id for the '<em><b>Parameter Java</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE__PARAMETER_JAVA = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE__PARAMETER_SCAR = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_FEATURE_COUNT = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_OPERATION_COUNT = SYSTEM_ELEMENT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.FieldCorrespondenceImpl <em>Field Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.FieldCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getFieldCorrespondence()
	 * @generated
	 */
	int FIELD_CORRESPONDENCE = 4;

	/**
	 * The feature id for the '<em><b>Field Java</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CORRESPONDENCE__FIELD_JAVA = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CORRESPONDENCE__FIELD_SCAR = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CORRESPONDENCE_FEATURE_COUNT = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CORRESPONDENCE_OPERATION_COUNT = SYSTEM_ELEMENT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar <em>Correspondences Code QL Scar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondences Code QL Scar</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar
	 * @generated
	 */
	EClass getCorrespondences_CodeQLScar();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar#getSystemElementCorrespondences <em>System Element Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Element Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar#getSystemElementCorrespondences()
	 * @see #getCorrespondences_CodeQLScar()
	 * @generated
	 */
	EReference getCorrespondences_CodeQLScar_SystemElementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar#getSecurityLevelCorrespondences <em>Security Level Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Level Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar#getSecurityLevelCorrespondences()
	 * @see #getCorrespondences_CodeQLScar()
	 * @generated
	 */
	EReference getCorrespondences_CodeQLScar_SecurityLevelCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar#getConfigurationCorrespondences <em>Configuration Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar#getConfigurationCorrespondences()
	 * @see #getCorrespondences_CodeQLScar()
	 * @generated
	 */
	EReference getCorrespondences_CodeQLScar_ConfigurationCorrespondences();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence <em>Configuration Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence
	 * @generated
	 */
	EClass getConfigurationCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getConfiguration_CodeQL <em>Configuration Code QL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration Code QL</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getConfiguration_CodeQL()
	 * @see #getConfigurationCorrespondence()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_Configuration_CodeQL();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getConfiguration_SCAR <em>Configuration SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getConfiguration_SCAR()
	 * @see #getConfigurationCorrespondence()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_Configuration_SCAR();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence <em>Security Level Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Level Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence
	 * @generated
	 */
	EClass getSecurityLevelCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Level Code QL</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getSecurityLevel_CodeQL()
	 * @see #getSecurityLevelCorrespondence()
	 * @generated
	 */
	EReference getSecurityLevelCorrespondence_SecurityLevel_CodeQL();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getSecurityLevel_SCAR <em>Security Level SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Level SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getSecurityLevel_SCAR()
	 * @see #getSecurityLevelCorrespondence()
	 * @generated
	 */
	EReference getSecurityLevelCorrespondence_SecurityLevel_SCAR();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence <em>Parameter Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence
	 * @generated
	 */
	EClass getParameterCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getParameter_Java <em>Parameter Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Java</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getParameter_Java()
	 * @see #getParameterCorrespondence()
	 * @generated
	 */
	EReference getParameterCorrespondence_Parameter_Java();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getParameter_SCAR <em>Parameter SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getParameter_SCAR()
	 * @see #getParameterCorrespondence()
	 * @generated
	 */
	EReference getParameterCorrespondence_Parameter_SCAR();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence <em>Field Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence
	 * @generated
	 */
	EClass getFieldCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getField_Java <em>Field Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Java</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getField_Java()
	 * @see #getFieldCorrespondence()
	 * @generated
	 */
	EReference getFieldCorrespondence_Field_Java();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getField_SCAR <em>Field SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getField_SCAR()
	 * @see #getFieldCorrespondence()
	 * @generated
	 */
	EReference getFieldCorrespondence_Field_SCAR();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SystemElementCorrespondence <em>System Element Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SystemElementCorrespondence
	 * @generated
	 */
	EClass getSystemElementCorrespondence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeqlscarcorrespondencesFactory getCodeqlscarcorrespondencesFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.Correspondences_CodeQLScarImpl <em>Correspondences Code QL Scar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.Correspondences_CodeQLScarImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getCorrespondences_CodeQLScar()
		 * @generated
		 */
		EClass CORRESPONDENCES_CODE_QL_SCAR = eINSTANCE.getCorrespondences_CodeQLScar();

		/**
		 * The meta object literal for the '<em><b>System Element Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_CODE_QL_SCAR__SYSTEM_ELEMENT_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_CodeQLScar_SystemElementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Security Level Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_CODE_QL_SCAR__SECURITY_LEVEL_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_CodeQLScar_SecurityLevelCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Configuration Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_CODE_QL_SCAR__CONFIGURATION_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_CodeQLScar_ConfigurationCorrespondences();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ConfigurationCorrespondenceImpl <em>Configuration Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ConfigurationCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getConfigurationCorrespondence()
		 * @generated
		 */
		EClass CONFIGURATION_CORRESPONDENCE = eINSTANCE.getConfigurationCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Configuration Code QL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE__CONFIGURATION_CODE_QL = eINSTANCE
				.getConfigurationCorrespondence_Configuration_CodeQL();

		/**
		 * The meta object literal for the '<em><b>Configuration SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE__CONFIGURATION_SCAR = eINSTANCE
				.getConfigurationCorrespondence_Configuration_SCAR();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SecurityLevelCorrespondenceImpl <em>Security Level Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SecurityLevelCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getSecurityLevelCorrespondence()
		 * @generated
		 */
		EClass SECURITY_LEVEL_CORRESPONDENCE = eINSTANCE.getSecurityLevelCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Security Level Code QL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_CODE_QL = eINSTANCE
				.getSecurityLevelCorrespondence_SecurityLevel_CodeQL();

		/**
		 * The meta object literal for the '<em><b>Security Level SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_SCAR = eINSTANCE
				.getSecurityLevelCorrespondence_SecurityLevel_SCAR();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ParameterCorrespondenceImpl <em>Parameter Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ParameterCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getParameterCorrespondence()
		 * @generated
		 */
		EClass PARAMETER_CORRESPONDENCE = eINSTANCE.getParameterCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Parameter Java</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE__PARAMETER_JAVA = eINSTANCE.getParameterCorrespondence_Parameter_Java();

		/**
		 * The meta object literal for the '<em><b>Parameter SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE__PARAMETER_SCAR = eINSTANCE.getParameterCorrespondence_Parameter_SCAR();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.FieldCorrespondenceImpl <em>Field Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.FieldCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getFieldCorrespondence()
		 * @generated
		 */
		EClass FIELD_CORRESPONDENCE = eINSTANCE.getFieldCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Field Java</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_CORRESPONDENCE__FIELD_JAVA = eINSTANCE.getFieldCorrespondence_Field_Java();

		/**
		 * The meta object literal for the '<em><b>Field SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_CORRESPONDENCE__FIELD_SCAR = eINSTANCE.getFieldCorrespondence_Field_SCAR();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SystemElementCorrespondenceImpl <em>System Element Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.SystemElementCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getSystemElementCorrespondence()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT_CORRESPONDENCE = eINSTANCE.getSystemElementCorrespondence();

	}

} //CodeqlscarcorrespondencesPackage
