/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence;

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
 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondenceFactory
 * @model kind="package"
 * @generated
 */
public interface AccessanalysiscodeqlcorrespondencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accessanalysiscodeqlcorrespondence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/accessanalysiscodeqlcorrespondence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accessanalysiscodeqlcorrespondence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessanalysiscodeqlcorrespondencePackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessanalysiscodeqlcorrespondencePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessAnalysisCodeQLCorrespondenceRootImpl <em>Access Analysis Code QL Correspondence Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessAnalysisCodeQLCorrespondenceRootImpl
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessanalysiscodeqlcorrespondencePackageImpl#getAccessAnalysisCodeQLCorrespondenceRoot()
	 * @generated
	 */
	int ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Configuration Correspondences Access Analysis Code QL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__CONFIGURATION_CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL = 0;

	/**
	 * The feature id for the '<em><b>Data Set Security Level Correspondence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__DATA_SET_SECURITY_LEVEL_CORRESPONDENCE = 1;

	/**
	 * The number of structural features of the '<em>Access Analysis Code QL Correspondence Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Access Analysis Code QL Correspondence Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.ConfigurationCorrespondenceImpl <em>Configuration Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.ConfigurationCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessanalysiscodeqlcorrespondencePackageImpl#getConfigurationCorrespondence()
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
	 * The feature id for the '<em><b>Access Analysis Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG = 1;

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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.DataSetSecurityLevelCorrespondenceImpl <em>Data Set Security Level Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.DataSetSecurityLevelCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessanalysiscodeqlcorrespondencePackageImpl#getDataSetSecurityLevelCorrespondence()
	 * @generated
	 */
	int DATA_SET_SECURITY_LEVEL_CORRESPONDENCE = 2;

	/**
	 * The feature id for the '<em><b>Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__DATA_SETS = 0;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Data Set Security Level Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_SECURITY_LEVEL_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Set Security Level Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_SECURITY_LEVEL_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot <em>Access Analysis Code QL Correspondence Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Analysis Code QL Correspondence Root</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot
	 * @generated
	 */
	EClass getAccessAnalysisCodeQLCorrespondenceRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot#getConfigurationCorrespondences_AccessAnalysisCodeQL <em>Configuration Correspondences Access Analysis Code QL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Correspondences Access Analysis Code QL</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot#getConfigurationCorrespondences_AccessAnalysisCodeQL()
	 * @see #getAccessAnalysisCodeQLCorrespondenceRoot()
	 * @generated
	 */
	EReference getAccessAnalysisCodeQLCorrespondenceRoot_ConfigurationCorrespondences_AccessAnalysisCodeQL();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot#getDataSetSecurityLevelCorrespondence <em>Data Set Security Level Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Set Security Level Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot#getDataSetSecurityLevelCorrespondence()
	 * @see #getAccessAnalysisCodeQLCorrespondenceRoot()
	 * @generated
	 */
	EReference getAccessAnalysisCodeQLCorrespondenceRoot_DataSetSecurityLevelCorrespondence();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence <em>Configuration Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence
	 * @generated
	 */
	EClass getConfigurationCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence#getCodeQLConfig <em>Code QL Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code QL Config</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence#getCodeQLConfig()
	 * @see #getConfigurationCorrespondence()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_CodeQLConfig();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence#getAccessAnalysisConfig <em>Access Analysis Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Analysis Config</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence#getAccessAnalysisConfig()
	 * @see #getConfigurationCorrespondence()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_AccessAnalysisConfig();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence <em>Data Set Security Level Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set Security Level Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence
	 * @generated
	 */
	EClass getDataSetSecurityLevelCorrespondence();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence#getDataSets <em>Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Sets</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence#getDataSets()
	 * @see #getDataSetSecurityLevelCorrespondence()
	 * @generated
	 */
	EReference getDataSetSecurityLevelCorrespondence_DataSets();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence#getSecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence#getSecurityLevel()
	 * @see #getDataSetSecurityLevelCorrespondence()
	 * @generated
	 */
	EReference getDataSetSecurityLevelCorrespondence_SecurityLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccessanalysiscodeqlcorrespondenceFactory getAccessanalysiscodeqlcorrespondenceFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessAnalysisCodeQLCorrespondenceRootImpl <em>Access Analysis Code QL Correspondence Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessAnalysisCodeQLCorrespondenceRootImpl
		 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessanalysiscodeqlcorrespondencePackageImpl#getAccessAnalysisCodeQLCorrespondenceRoot()
		 * @generated
		 */
		EClass ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT = eINSTANCE.getAccessAnalysisCodeQLCorrespondenceRoot();

		/**
		 * The meta object literal for the '<em><b>Configuration Correspondences Access Analysis Code QL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__CONFIGURATION_CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL = eINSTANCE
				.getAccessAnalysisCodeQLCorrespondenceRoot_ConfigurationCorrespondences_AccessAnalysisCodeQL();

		/**
		 * The meta object literal for the '<em><b>Data Set Security Level Correspondence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__DATA_SET_SECURITY_LEVEL_CORRESPONDENCE = eINSTANCE
				.getAccessAnalysisCodeQLCorrespondenceRoot_DataSetSecurityLevelCorrespondence();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.ConfigurationCorrespondenceImpl <em>Configuration Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.ConfigurationCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessanalysiscodeqlcorrespondencePackageImpl#getConfigurationCorrespondence()
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
		 * The meta object literal for the '<em><b>Access Analysis Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG = eINSTANCE
				.getConfigurationCorrespondence_AccessAnalysisConfig();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.DataSetSecurityLevelCorrespondenceImpl <em>Data Set Security Level Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.DataSetSecurityLevelCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessanalysiscodeqlcorrespondencePackageImpl#getDataSetSecurityLevelCorrespondence()
		 * @generated
		 */
		EClass DATA_SET_SECURITY_LEVEL_CORRESPONDENCE = eINSTANCE.getDataSetSecurityLevelCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__DATA_SETS = eINSTANCE
				.getDataSetSecurityLevelCorrespondence_DataSets();

		/**
		 * The meta object literal for the '<em><b>Security Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL = eINSTANCE
				.getDataSetSecurityLevelCorrespondence_SecurityLevel();

	}

} //AccessanalysiscodeqlcorrespondencePackage
