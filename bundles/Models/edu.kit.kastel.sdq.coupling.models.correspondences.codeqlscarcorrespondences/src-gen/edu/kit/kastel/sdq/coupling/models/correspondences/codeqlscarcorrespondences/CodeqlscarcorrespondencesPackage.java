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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeQLSCARCorrespondencesImpl <em>Code QLSCAR Correspondences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeQLSCARCorrespondencesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getCodeQLSCARCorrespondences()
	 * @generated
	 */
	int CODE_QLSCAR_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>System Element Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QLSCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Security Level Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QLSCAR_CORRESPONDENCES__SECURITY_LEVEL_CORRESPONDENCES = 1;

	/**
	 * The feature id for the '<em><b>Configuration Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QLSCAR_CORRESPONDENCES__CONFIGURATION_CORRESPONDENCES = 2;

	/**
	 * The number of structural features of the '<em>Code QLSCAR Correspondences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QLSCAR_CORRESPONDENCES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Code QLSCAR Correspondences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QLSCAR_CORRESPONDENCES_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Code QL Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Code QLSCAR Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE__CODE_QLSCAR_CONFIG = 1;

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
	 * The feature id for the '<em><b>Code QL Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_CORRESPONDENCE__CODE_QL_SECURITY_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Code QLSCAR Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_CORRESPONDENCE__CODE_QLSCAR_SECURITY_LEVEL = 1;

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
	 * The feature id for the '<em><b>Java Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE__JAVA_PARAMETER = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scar Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE__SCAR_PARAMETER = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Java Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CORRESPONDENCE__JAVA_FIELD = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scar Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CORRESPONDENCE__SCAR_FIELD = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 1;

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
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences <em>Code QLSCAR Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code QLSCAR Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences
	 * @generated
	 */
	EClass getCodeQLSCARCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences#getSystemElementCorrespondences <em>System Element Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Element Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences#getSystemElementCorrespondences()
	 * @see #getCodeQLSCARCorrespondences()
	 * @generated
	 */
	EReference getCodeQLSCARCorrespondences_SystemElementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences#getSecurityLevelCorrespondences <em>Security Level Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Level Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences#getSecurityLevelCorrespondences()
	 * @see #getCodeQLSCARCorrespondences()
	 * @generated
	 */
	EReference getCodeQLSCARCorrespondences_SecurityLevelCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences#getConfigurationCorrespondences <em>Configuration Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences#getConfigurationCorrespondences()
	 * @see #getCodeQLSCARCorrespondences()
	 * @generated
	 */
	EReference getCodeQLSCARCorrespondences_ConfigurationCorrespondences();

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
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getCodeQLConfig <em>Code QL Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code QL Config</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getCodeQLConfig()
	 * @see #getConfigurationCorrespondence()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_CodeQLConfig();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getCodeQLSCARConfig <em>Code QLSCAR Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code QLSCAR Config</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence#getCodeQLSCARConfig()
	 * @see #getConfigurationCorrespondence()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_CodeQLSCARConfig();

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
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getCodeQLSecurityLevel <em>Code QL Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code QL Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getCodeQLSecurityLevel()
	 * @see #getSecurityLevelCorrespondence()
	 * @generated
	 */
	EReference getSecurityLevelCorrespondence_CodeQLSecurityLevel();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getCodeQLSCARSecurityLevel <em>Code QLSCAR Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code QLSCAR Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence#getCodeQLSCARSecurityLevel()
	 * @see #getSecurityLevelCorrespondence()
	 * @generated
	 */
	EReference getSecurityLevelCorrespondence_CodeQLSCARSecurityLevel();

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
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getJavaParameter <em>Java Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getJavaParameter()
	 * @see #getParameterCorrespondence()
	 * @generated
	 */
	EReference getParameterCorrespondence_JavaParameter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getScarParameter <em>Scar Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scar Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence#getScarParameter()
	 * @see #getParameterCorrespondence()
	 * @generated
	 */
	EReference getParameterCorrespondence_ScarParameter();

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
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getJavaField <em>Java Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Field</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getJavaField()
	 * @see #getFieldCorrespondence()
	 * @generated
	 */
	EReference getFieldCorrespondence_JavaField();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getScarField <em>Scar Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scar Field</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence#getScarField()
	 * @see #getFieldCorrespondence()
	 * @generated
	 */
	EReference getFieldCorrespondence_ScarField();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeQLSCARCorrespondencesImpl <em>Code QLSCAR Correspondences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeQLSCARCorrespondencesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeqlscarcorrespondencesPackageImpl#getCodeQLSCARCorrespondences()
		 * @generated
		 */
		EClass CODE_QLSCAR_CORRESPONDENCES = eINSTANCE.getCodeQLSCARCorrespondences();

		/**
		 * The meta object literal for the '<em><b>System Element Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_QLSCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES = eINSTANCE
				.getCodeQLSCARCorrespondences_SystemElementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Security Level Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_QLSCAR_CORRESPONDENCES__SECURITY_LEVEL_CORRESPONDENCES = eINSTANCE
				.getCodeQLSCARCorrespondences_SecurityLevelCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Configuration Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_QLSCAR_CORRESPONDENCES__CONFIGURATION_CORRESPONDENCES = eINSTANCE
				.getCodeQLSCARCorrespondences_ConfigurationCorrespondences();

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
		 * The meta object literal for the '<em><b>Code QL Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG = eINSTANCE
				.getConfigurationCorrespondence_CodeQLConfig();

		/**
		 * The meta object literal for the '<em><b>Code QLSCAR Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE__CODE_QLSCAR_CONFIG = eINSTANCE
				.getConfigurationCorrespondence_CodeQLSCARConfig();

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
		 * The meta object literal for the '<em><b>Code QL Security Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_LEVEL_CORRESPONDENCE__CODE_QL_SECURITY_LEVEL = eINSTANCE
				.getSecurityLevelCorrespondence_CodeQLSecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Code QLSCAR Security Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_LEVEL_CORRESPONDENCE__CODE_QLSCAR_SECURITY_LEVEL = eINSTANCE
				.getSecurityLevelCorrespondence_CodeQLSCARSecurityLevel();

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
		 * The meta object literal for the '<em><b>Java Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE__JAVA_PARAMETER = eINSTANCE.getParameterCorrespondence_JavaParameter();

		/**
		 * The meta object literal for the '<em><b>Scar Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE__SCAR_PARAMETER = eINSTANCE.getParameterCorrespondence_ScarParameter();

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
		 * The meta object literal for the '<em><b>Java Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_CORRESPONDENCE__JAVA_FIELD = eINSTANCE.getFieldCorrespondence_JavaField();

		/**
		 * The meta object literal for the '<em><b>Scar Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_CORRESPONDENCE__SCAR_FIELD = eINSTANCE.getFieldCorrespondence_ScarField();

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
