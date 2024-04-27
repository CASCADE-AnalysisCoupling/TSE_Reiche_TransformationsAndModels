/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;

import edu.kit.kastel.scbs.confidentiality.data.DataPackage;

import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;

import edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessanalysisjoanacorrespondencesPackageImpl extends EPackageImpl
		implements AccessanalysisjoanacorrespondencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correspondences_AccessAnalysisJOANAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetLevelCorrespondenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccessanalysisjoanacorrespondencesPackageImpl() {
		super(eNS_URI, AccessanalysisjoanacorrespondencesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AccessanalysisjoanacorrespondencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccessanalysisjoanacorrespondencesPackage init() {
		if (isInited)
			return (AccessanalysisjoanacorrespondencesPackage) EPackage.Registry.INSTANCE
					.getEPackage(AccessanalysisjoanacorrespondencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAccessanalysisjoanacorrespondencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AccessanalysisjoanacorrespondencesPackageImpl theAccessanalysisjoanacorrespondencesPackage = registeredAccessanalysisjoanacorrespondencesPackage instanceof AccessanalysisjoanacorrespondencesPackageImpl
				? (AccessanalysisjoanacorrespondencesPackageImpl) registeredAccessanalysisjoanacorrespondencesPackage
				: new AccessanalysisjoanacorrespondencesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ConfidentialityPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		JoanaPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAccessanalysisjoanacorrespondencesPackage.createPackageContents();

		// Initialize created meta-data
		theAccessanalysisjoanacorrespondencesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccessanalysisjoanacorrespondencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccessanalysisjoanacorrespondencesPackage.eNS_URI,
				theAccessanalysisjoanacorrespondencesPackage);
		return theAccessanalysisjoanacorrespondencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrespondences_AccessAnalysisJOANA() {
		return correspondences_AccessAnalysisJOANAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_AccessAnalysisJOANA_EntryPointCorrespondences() {
		return (EReference) correspondences_AccessAnalysisJOANAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_AccessAnalysisJOANA_DataSetLevelCorrespondences() {
		return (EReference) correspondences_AccessAnalysisJOANAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointCorrespondence() {
		return entryPointCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPointCorrespondence_AccessAnalysisConfig() {
		return (EReference) entryPointCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPointCorrespondence_EntryPoint() {
		return (EReference) entryPointCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetLevelCorrespondence() {
		return dataSetLevelCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetLevelCorrespondence_DataSets() {
		return (EReference) dataSetLevelCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetLevelCorrespondence_Level() {
		return (EReference) dataSetLevelCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessanalysisjoanacorrespondencesFactory getAccessanalysisjoanacorrespondencesFactory() {
		return (AccessanalysisjoanacorrespondencesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		correspondences_AccessAnalysisJOANAEClass = createEClass(CORRESPONDENCES_ACCESS_ANALYSIS_JOANA);
		createEReference(correspondences_AccessAnalysisJOANAEClass,
				CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__ENTRY_POINT_CORRESPONDENCES);
		createEReference(correspondences_AccessAnalysisJOANAEClass,
				CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__DATA_SET_LEVEL_CORRESPONDENCES);

		entryPointCorrespondenceEClass = createEClass(ENTRY_POINT_CORRESPONDENCE);
		createEReference(entryPointCorrespondenceEClass, ENTRY_POINT_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG);
		createEReference(entryPointCorrespondenceEClass, ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT);

		dataSetLevelCorrespondenceEClass = createEClass(DATA_SET_LEVEL_CORRESPONDENCE);
		createEReference(dataSetLevelCorrespondenceEClass, DATA_SET_LEVEL_CORRESPONDENCE__DATA_SETS);
		createEReference(dataSetLevelCorrespondenceEClass, DATA_SET_LEVEL_CORRESPONDENCE__LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConfidentialityPackage theConfidentialityPackage = (ConfidentialityPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConfidentialityPackage.eNS_URI);
		JoanaPackage theJoanaPackage = (JoanaPackage) EPackage.Registry.INSTANCE.getEPackage(JoanaPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage) EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(correspondences_AccessAnalysisJOANAEClass, Correspondences_AccessAnalysisJOANA.class,
				"Correspondences_AccessAnalysisJOANA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrespondences_AccessAnalysisJOANA_EntryPointCorrespondences(),
				this.getEntryPointCorrespondence(), null, "entryPointCorrespondences", null, 0, -1,
				Correspondences_AccessAnalysisJOANA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_AccessAnalysisJOANA_DataSetLevelCorrespondences(),
				this.getDataSetLevelCorrespondence(), null, "dataSetLevelCorrespondences", null, 0, -1,
				Correspondences_AccessAnalysisJOANA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryPointCorrespondenceEClass, EntryPointCorrespondence.class, "EntryPointCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryPointCorrespondence_AccessAnalysisConfig(),
				theConfidentialityPackage.getConfidentialitySpecification(), null, "AccessAnalysisConfig", null, 1, 1,
				EntryPointCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryPointCorrespondence_EntryPoint(), theJoanaPackage.getEntryPoint(), null, "entryPoint",
				null, 1, 1, EntryPointCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSetLevelCorrespondenceEClass, DataSetLevelCorrespondence.class, "DataSetLevelCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSetLevelCorrespondence_DataSets(), theDataPackage.getDataSet(), null, "dataSets", null, 1,
				-1, DataSetLevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSetLevelCorrespondence_Level(), theJoanaPackage.getLevel(), null, "level", null, 1, 1,
				DataSetLevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AccessanalysisjoanacorrespondencesPackageImpl
