/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;

import edu.kit.kastel.scbs.confidentiality.data.DataPackage;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage;

import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondenceFactory;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.Correspondences_AccessAnalysisCodeQL;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;

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
public class AccessanalysiscodeqlcorrespondencePackageImpl extends EPackageImpl
		implements AccessanalysiscodeqlcorrespondencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correspondences_AccessAnalysisCodeQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetSecurityLevelCorrespondenceEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccessanalysiscodeqlcorrespondencePackageImpl() {
		super(eNS_URI, AccessanalysiscodeqlcorrespondenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AccessanalysiscodeqlcorrespondencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccessanalysiscodeqlcorrespondencePackage init() {
		if (isInited)
			return (AccessanalysiscodeqlcorrespondencePackage) EPackage.Registry.INSTANCE
					.getEPackage(AccessanalysiscodeqlcorrespondencePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAccessanalysiscodeqlcorrespondencePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AccessanalysiscodeqlcorrespondencePackageImpl theAccessanalysiscodeqlcorrespondencePackage = registeredAccessanalysiscodeqlcorrespondencePackage instanceof AccessanalysiscodeqlcorrespondencePackageImpl
				? (AccessanalysiscodeqlcorrespondencePackageImpl) registeredAccessanalysiscodeqlcorrespondencePackage
				: new AccessanalysiscodeqlcorrespondencePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CodeqlPackage.eINSTANCE.eClass();
		ConfidentialityPackage.eINSTANCE.eClass();
		ConfigurationrepresentationPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAccessanalysiscodeqlcorrespondencePackage.createPackageContents();

		// Initialize created meta-data
		theAccessanalysiscodeqlcorrespondencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccessanalysiscodeqlcorrespondencePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccessanalysiscodeqlcorrespondencePackage.eNS_URI,
				theAccessanalysiscodeqlcorrespondencePackage);
		return theAccessanalysiscodeqlcorrespondencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrespondences_AccessAnalysisCodeQL() {
		return correspondences_AccessAnalysisCodeQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_AccessAnalysisCodeQL_ConfigurationCorrespondences_AccessAnalysisCodeQL() {
		return (EReference) correspondences_AccessAnalysisCodeQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_AccessAnalysisCodeQL_DataSetSecurityLevelCorrespondence() {
		return (EReference) correspondences_AccessAnalysisCodeQLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationCorrespondence() {
		return configurationCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationCorrespondence_CodeQLConfig() {
		return (EReference) configurationCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationCorrespondence_AccessAnalysisConfig() {
		return (EReference) configurationCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetSecurityLevelCorrespondence() {
		return dataSetSecurityLevelCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetSecurityLevelCorrespondence_DataSets() {
		return (EReference) dataSetSecurityLevelCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetSecurityLevelCorrespondence_SecurityLevel() {
		return (EReference) dataSetSecurityLevelCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessanalysiscodeqlcorrespondenceFactory getAccessanalysiscodeqlcorrespondenceFactory() {
		return (AccessanalysiscodeqlcorrespondenceFactory) getEFactoryInstance();
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
		correspondences_AccessAnalysisCodeQLEClass = createEClass(CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL);
		createEReference(correspondences_AccessAnalysisCodeQLEClass,
				CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL__CONFIGURATION_CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL);
		createEReference(correspondences_AccessAnalysisCodeQLEClass,
				CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL__DATA_SET_SECURITY_LEVEL_CORRESPONDENCE);

		configurationCorrespondenceEClass = createEClass(CONFIGURATION_CORRESPONDENCE);
		createEReference(configurationCorrespondenceEClass, CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG);
		createEReference(configurationCorrespondenceEClass, CONFIGURATION_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG);

		dataSetSecurityLevelCorrespondenceEClass = createEClass(DATA_SET_SECURITY_LEVEL_CORRESPONDENCE);
		createEReference(dataSetSecurityLevelCorrespondenceEClass, DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__DATA_SETS);
		createEReference(dataSetSecurityLevelCorrespondenceEClass,
				DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL);
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
		ConfigurationrepresentationPackage theConfigurationrepresentationPackage = (ConfigurationrepresentationPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationrepresentationPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage) EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		TainttrackingPackage theTainttrackingPackage = (TainttrackingPackage) EPackage.Registry.INSTANCE
				.getEPackage(TainttrackingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(correspondences_AccessAnalysisCodeQLEClass, Correspondences_AccessAnalysisCodeQL.class,
				"Correspondences_AccessAnalysisCodeQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrespondences_AccessAnalysisCodeQL_ConfigurationCorrespondences_AccessAnalysisCodeQL(),
				this.getConfigurationCorrespondence(), null, "configurationCorrespondences_AccessAnalysisCodeQL", null,
				0, -1, Correspondences_AccessAnalysisCodeQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_AccessAnalysisCodeQL_DataSetSecurityLevelCorrespondence(),
				this.getDataSetSecurityLevelCorrespondence(), null, "dataSetSecurityLevelCorrespondence", null, 0, -1,
				Correspondences_AccessAnalysisCodeQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationCorrespondenceEClass, ConfigurationCorrespondence.class, "ConfigurationCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationCorrespondence_CodeQLConfig(),
				theConfigurationrepresentationPackage.getHybridConfiguration(), null, "CodeQLConfig", null, 1, 1,
				ConfigurationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationCorrespondence_AccessAnalysisConfig(),
				theConfigurationrepresentationPackage.getFullyImplicitConfiguration(), null, "AccessAnalysisConfig",
				null, 1, 1, ConfigurationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSetSecurityLevelCorrespondenceEClass, DataSetSecurityLevelCorrespondence.class,
				"DataSetSecurityLevelCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSetSecurityLevelCorrespondence_DataSets(), theDataPackage.getDataSet(), null, "dataSets",
				null, 1, -1, DataSetSecurityLevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSetSecurityLevelCorrespondence_SecurityLevel(),
				theTainttrackingPackage.getSecurityLevel(), null, "securityLevel", null, 1, 1,
				DataSetSecurityLevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AccessanalysiscodeqlcorrespondencePackageImpl
