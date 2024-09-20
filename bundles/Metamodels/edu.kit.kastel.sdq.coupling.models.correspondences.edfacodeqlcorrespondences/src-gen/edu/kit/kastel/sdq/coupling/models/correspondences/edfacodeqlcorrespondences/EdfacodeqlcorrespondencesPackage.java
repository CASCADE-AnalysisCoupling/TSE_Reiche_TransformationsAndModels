/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesFactory
 * @model kind="package"
 * @generated
 */
public interface EdfacodeqlcorrespondencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edfacodeqlcorrespondences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/edfacodeqlcorrespondences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edfacodeqlcorrespondences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdfacodeqlcorrespondencesPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.EdfacodeqlcorrespondencesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.Correspondences_EDFACodeQLImpl <em>Correspondences EDFA Code QL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.Correspondences_EDFACodeQLImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.EdfacodeqlcorrespondencesPackageImpl#getCorrespondences_EDFACodeQL()
	 * @generated
	 */
	int CORRESPONDENCES_EDFA_CODE_QL = 0;

	/**
	 * The feature id for the '<em><b>Literal Security Level Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_EDFA_CODE_QL__LITERAL_SECURITY_LEVEL_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Configuration Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_EDFA_CODE_QL__CONFIGURATION_CORRESPONDENCES = 1;

	/**
	 * The number of structural features of the '<em>Correspondences EDFA Code QL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_EDFA_CODE_QL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Correspondences EDFA Code QL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_EDFA_CODE_QL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.LiteralSecurityLevelCorrespondence_EDFACodeQLImpl <em>Literal Security Level Correspondence EDFA Code QL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.LiteralSecurityLevelCorrespondence_EDFACodeQLImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.EdfacodeqlcorrespondencesPackageImpl#getLiteralSecurityLevelCorrespondence_EDFACodeQL()
	 * @generated
	 */
	int LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL = 1;

	/**
	 * The feature id for the '<em><b>Security Level Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__SECURITY_LEVEL_CODE_QL = 0;

	/**
	 * The feature id for the '<em><b>Literals EDFA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__LITERALS_EDFA = 1;

	/**
	 * The number of structural features of the '<em>Literal Security Level Correspondence EDFA Code QL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Literal Security Level Correspondence EDFA Code QL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.ConfigurationCorrespondence_EDFACodeQLImpl <em>Configuration Correspondence EDFA Code QL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.ConfigurationCorrespondence_EDFACodeQLImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.EdfacodeqlcorrespondencesPackageImpl#getConfigurationCorrespondence_EDFACodeQL()
	 * @generated
	 */
	int CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL = 2;

	/**
	 * The feature id for the '<em><b>Configuration Code QL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_CODE_QL = 0;

	/**
	 * The feature id for the '<em><b>Configuration EDFA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_EDFA = 1;

	/**
	 * The number of structural features of the '<em>Configuration Correspondence EDFA Code QL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuration Correspondence EDFA Code QL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL <em>Correspondences EDFA Code QL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondences EDFA Code QL</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL
	 * @generated
	 */
	EClass getCorrespondences_EDFACodeQL();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL#getLiteralSecurityLevelCorrespondences <em>Literal Security Level Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal Security Level Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL#getLiteralSecurityLevelCorrespondences()
	 * @see #getCorrespondences_EDFACodeQL()
	 * @generated
	 */
	EReference getCorrespondences_EDFACodeQL_LiteralSecurityLevelCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL#getConfigurationCorrespondences <em>Configuration Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL#getConfigurationCorrespondences()
	 * @see #getCorrespondences_EDFACodeQL()
	 * @generated
	 */
	EReference getCorrespondences_EDFACodeQL_ConfigurationCorrespondences();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL <em>Literal Security Level Correspondence EDFA Code QL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Security Level Correspondence EDFA Code QL</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL
	 * @generated
	 */
	EClass getLiteralSecurityLevelCorrespondence_EDFACodeQL();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Level Code QL</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL#getSecurityLevel_CodeQL()
	 * @see #getLiteralSecurityLevelCorrespondence_EDFACodeQL()
	 * @generated
	 */
	EReference getLiteralSecurityLevelCorrespondence_EDFACodeQL_SecurityLevel_CodeQL();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL#getLiterals_EDFA <em>Literals EDFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Literals EDFA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL#getLiterals_EDFA()
	 * @see #getLiteralSecurityLevelCorrespondence_EDFACodeQL()
	 * @generated
	 */
	EReference getLiteralSecurityLevelCorrespondence_EDFACodeQL_Literals_EDFA();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL <em>Configuration Correspondence EDFA Code QL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Correspondence EDFA Code QL</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL
	 * @generated
	 */
	EClass getConfigurationCorrespondence_EDFACodeQL();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL#getConfiguration_CodeQL <em>Configuration Code QL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration Code QL</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL#getConfiguration_CodeQL()
	 * @see #getConfigurationCorrespondence_EDFACodeQL()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_EDFACodeQL_Configuration_CodeQL();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL#getConfiguration_EDFA <em>Configuration EDFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration EDFA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL#getConfiguration_EDFA()
	 * @see #getConfigurationCorrespondence_EDFACodeQL()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_EDFACodeQL_Configuration_EDFA();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdfacodeqlcorrespondencesFactory getEdfacodeqlcorrespondencesFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.Correspondences_EDFACodeQLImpl <em>Correspondences EDFA Code QL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.Correspondences_EDFACodeQLImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.EdfacodeqlcorrespondencesPackageImpl#getCorrespondences_EDFACodeQL()
		 * @generated
		 */
		EClass CORRESPONDENCES_EDFA_CODE_QL = eINSTANCE.getCorrespondences_EDFACodeQL();

		/**
		 * The meta object literal for the '<em><b>Literal Security Level Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_EDFA_CODE_QL__LITERAL_SECURITY_LEVEL_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_EDFACodeQL_LiteralSecurityLevelCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Configuration Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_EDFA_CODE_QL__CONFIGURATION_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_EDFACodeQL_ConfigurationCorrespondences();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.LiteralSecurityLevelCorrespondence_EDFACodeQLImpl <em>Literal Security Level Correspondence EDFA Code QL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.LiteralSecurityLevelCorrespondence_EDFACodeQLImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.EdfacodeqlcorrespondencesPackageImpl#getLiteralSecurityLevelCorrespondence_EDFACodeQL()
		 * @generated
		 */
		EClass LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL = eINSTANCE
				.getLiteralSecurityLevelCorrespondence_EDFACodeQL();

		/**
		 * The meta object literal for the '<em><b>Security Level Code QL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__SECURITY_LEVEL_CODE_QL = eINSTANCE
				.getLiteralSecurityLevelCorrespondence_EDFACodeQL_SecurityLevel_CodeQL();

		/**
		 * The meta object literal for the '<em><b>Literals EDFA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__LITERALS_EDFA = eINSTANCE
				.getLiteralSecurityLevelCorrespondence_EDFACodeQL_Literals_EDFA();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.ConfigurationCorrespondence_EDFACodeQLImpl <em>Configuration Correspondence EDFA Code QL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.ConfigurationCorrespondence_EDFACodeQLImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.EdfacodeqlcorrespondencesPackageImpl#getConfigurationCorrespondence_EDFACodeQL()
		 * @generated
		 */
		EClass CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL = eINSTANCE.getConfigurationCorrespondence_EDFACodeQL();

		/**
		 * The meta object literal for the '<em><b>Configuration Code QL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_CODE_QL = eINSTANCE
				.getConfigurationCorrespondence_EDFACodeQL_Configuration_CodeQL();

		/**
		 * The meta object literal for the '<em><b>Configuration EDFA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_EDFA = eINSTANCE
				.getConfigurationCorrespondence_EDFACodeQL_Configuration_EDFA();

	}

} //EdfacodeqlcorrespondencesPackage
