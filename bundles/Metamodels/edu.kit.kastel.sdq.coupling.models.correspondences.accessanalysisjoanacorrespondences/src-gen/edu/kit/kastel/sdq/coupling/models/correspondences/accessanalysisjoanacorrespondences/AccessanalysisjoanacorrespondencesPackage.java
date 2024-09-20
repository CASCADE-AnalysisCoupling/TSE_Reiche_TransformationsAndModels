/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesFactory
 * @model kind="package"
 * @generated
 */
public interface AccessanalysisjoanacorrespondencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accessanalysisjoanacorrespondences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/accessanalysisjoanacorrespondences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accessanalysisjoanacorrespondences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessanalysisjoanacorrespondencesPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.AccessanalysisjoanacorrespondencesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.Correspondences_AccessAnalysisJOANAImpl <em>Correspondences Access Analysis JOANA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.Correspondences_AccessAnalysisJOANAImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.AccessanalysisjoanacorrespondencesPackageImpl#getCorrespondences_AccessAnalysisJOANA()
	 * @generated
	 */
	int CORRESPONDENCES_ACCESS_ANALYSIS_JOANA = 0;

	/**
	 * The feature id for the '<em><b>Entry Point Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__ENTRY_POINT_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Data Set Level Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__DATA_SET_LEVEL_CORRESPONDENCES = 1;

	/**
	 * The number of structural features of the '<em>Correspondences Access Analysis JOANA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_ACCESS_ANALYSIS_JOANA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Correspondences Access Analysis JOANA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_ACCESS_ANALYSIS_JOANA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.EntryPointCorrespondenceImpl <em>Entry Point Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.EntryPointCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.AccessanalysisjoanacorrespondencesPackageImpl#getEntryPointCorrespondence()
	 * @generated
	 */
	int ENTRY_POINT_CORRESPONDENCE = 1;

	/**
	 * The feature id for the '<em><b>Access Analysis Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT = 1;

	/**
	 * The number of structural features of the '<em>Entry Point Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry Point Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.DataSetLevelCorrespondenceImpl <em>Data Set Level Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.DataSetLevelCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.AccessanalysisjoanacorrespondencesPackageImpl#getDataSetLevelCorrespondence()
	 * @generated
	 */
	int DATA_SET_LEVEL_CORRESPONDENCE = 2;

	/**
	 * The feature id for the '<em><b>Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_LEVEL_CORRESPONDENCE__DATA_SETS = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_LEVEL_CORRESPONDENCE__LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Data Set Level Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_LEVEL_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Set Level Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_LEVEL_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA <em>Correspondences Access Analysis JOANA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondences Access Analysis JOANA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA
	 * @generated
	 */
	EClass getCorrespondences_AccessAnalysisJOANA();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA#getEntryPointCorrespondences <em>Entry Point Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Point Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA#getEntryPointCorrespondences()
	 * @see #getCorrespondences_AccessAnalysisJOANA()
	 * @generated
	 */
	EReference getCorrespondences_AccessAnalysisJOANA_EntryPointCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA#getDataSetLevelCorrespondences <em>Data Set Level Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Set Level Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA#getDataSetLevelCorrespondences()
	 * @see #getCorrespondences_AccessAnalysisJOANA()
	 * @generated
	 */
	EReference getCorrespondences_AccessAnalysisJOANA_DataSetLevelCorrespondences();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence <em>Entry Point Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence
	 * @generated
	 */
	EClass getEntryPointCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence#getAccessAnalysisConfig <em>Access Analysis Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Analysis Config</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence#getAccessAnalysisConfig()
	 * @see #getEntryPointCorrespondence()
	 * @generated
	 */
	EReference getEntryPointCorrespondence_AccessAnalysisConfig();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Point</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence#getEntryPoint()
	 * @see #getEntryPointCorrespondence()
	 * @generated
	 */
	EReference getEntryPointCorrespondence_EntryPoint();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence <em>Data Set Level Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set Level Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence
	 * @generated
	 */
	EClass getDataSetLevelCorrespondence();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence#getDataSets <em>Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Sets</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence#getDataSets()
	 * @see #getDataSetLevelCorrespondence()
	 * @generated
	 */
	EReference getDataSetLevelCorrespondence_DataSets();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence#getLevel()
	 * @see #getDataSetLevelCorrespondence()
	 * @generated
	 */
	EReference getDataSetLevelCorrespondence_Level();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccessanalysisjoanacorrespondencesFactory getAccessanalysisjoanacorrespondencesFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.Correspondences_AccessAnalysisJOANAImpl <em>Correspondences Access Analysis JOANA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.Correspondences_AccessAnalysisJOANAImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.AccessanalysisjoanacorrespondencesPackageImpl#getCorrespondences_AccessAnalysisJOANA()
		 * @generated
		 */
		EClass CORRESPONDENCES_ACCESS_ANALYSIS_JOANA = eINSTANCE.getCorrespondences_AccessAnalysisJOANA();

		/**
		 * The meta object literal for the '<em><b>Entry Point Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__ENTRY_POINT_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_AccessAnalysisJOANA_EntryPointCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Data Set Level Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__DATA_SET_LEVEL_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_AccessAnalysisJOANA_DataSetLevelCorrespondences();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.EntryPointCorrespondenceImpl <em>Entry Point Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.EntryPointCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.AccessanalysisjoanacorrespondencesPackageImpl#getEntryPointCorrespondence()
		 * @generated
		 */
		EClass ENTRY_POINT_CORRESPONDENCE = eINSTANCE.getEntryPointCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Access Analysis Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG = eINSTANCE
				.getEntryPointCorrespondence_AccessAnalysisConfig();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT = eINSTANCE.getEntryPointCorrespondence_EntryPoint();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.DataSetLevelCorrespondenceImpl <em>Data Set Level Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.DataSetLevelCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.AccessanalysisjoanacorrespondencesPackageImpl#getDataSetLevelCorrespondence()
		 * @generated
		 */
		EClass DATA_SET_LEVEL_CORRESPONDENCE = eINSTANCE.getDataSetLevelCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET_LEVEL_CORRESPONDENCE__DATA_SETS = eINSTANCE.getDataSetLevelCorrespondence_DataSets();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET_LEVEL_CORRESPONDENCE__LEVEL = eINSTANCE.getDataSetLevelCorrespondence_Level();

	}

} //AccessanalysisjoanacorrespondencesPackage
