/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;

import org.dataflowanalysis.pcm.extension.dictionary.DataDictionary.DataDictionaryPackage;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterizedPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdfacodeqlcorrespondencesPackageImpl extends EPackageImpl implements EdfacodeqlcorrespondencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correspondences_EDFACodeQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalSecurityLevelCorrespondence_EDFACodeQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationCorrespondence_EDFACodeQLEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdfacodeqlcorrespondencesPackageImpl() {
		super(eNS_URI, EdfacodeqlcorrespondencesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EdfacodeqlcorrespondencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EdfacodeqlcorrespondencesPackage init() {
		if (isInited)
			return (EdfacodeqlcorrespondencesPackage) EPackage.Registry.INSTANCE
					.getEPackage(EdfacodeqlcorrespondencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEdfacodeqlcorrespondencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EdfacodeqlcorrespondencesPackageImpl theEdfacodeqlcorrespondencesPackage = registeredEdfacodeqlcorrespondencesPackage instanceof EdfacodeqlcorrespondencesPackageImpl
				? (EdfacodeqlcorrespondencesPackageImpl) registeredEdfacodeqlcorrespondencesPackage
				: new EdfacodeqlcorrespondencesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CodeqlPackage.eINSTANCE.eClass();
		DataDictionaryPackage.eINSTANCE.eClass();
		DataDictionaryCharacterizedPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ParameterannotationPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEdfacodeqlcorrespondencesPackage.createPackageContents();

		// Initialize created meta-data
		theEdfacodeqlcorrespondencesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdfacodeqlcorrespondencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdfacodeqlcorrespondencesPackage.eNS_URI, theEdfacodeqlcorrespondencesPackage);
		return theEdfacodeqlcorrespondencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrespondences_EDFACodeQL() {
		return correspondences_EDFACodeQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCorrespondences_EDFACodeQL_LiteralSecurityLevelCorrespondences() {
		return (EReference) correspondences_EDFACodeQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCorrespondences_EDFACodeQL_ConfigurationCorrespondences() {
		return (EReference) correspondences_EDFACodeQLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralSecurityLevelCorrespondence_EDFACodeQL() {
		return literalSecurityLevelCorrespondence_EDFACodeQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiteralSecurityLevelCorrespondence_EDFACodeQL_SecurityLevel_CodeQL() {
		return (EReference) literalSecurityLevelCorrespondence_EDFACodeQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiteralSecurityLevelCorrespondence_EDFACodeQL_Literals_EDFA() {
		return (EReference) literalSecurityLevelCorrespondence_EDFACodeQLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationCorrespondence_EDFACodeQL() {
		return configurationCorrespondence_EDFACodeQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationCorrespondence_EDFACodeQL_Configuration_CodeQL() {
		return (EReference) configurationCorrespondence_EDFACodeQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationCorrespondence_EDFACodeQL_Configuration_EDFA() {
		return (EReference) configurationCorrespondence_EDFACodeQLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdfacodeqlcorrespondencesFactory getEdfacodeqlcorrespondencesFactory() {
		return (EdfacodeqlcorrespondencesFactory) getEFactoryInstance();
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
		correspondences_EDFACodeQLEClass = createEClass(CORRESPONDENCES_EDFA_CODE_QL);
		createEReference(correspondences_EDFACodeQLEClass,
				CORRESPONDENCES_EDFA_CODE_QL__LITERAL_SECURITY_LEVEL_CORRESPONDENCES);
		createEReference(correspondences_EDFACodeQLEClass, CORRESPONDENCES_EDFA_CODE_QL__CONFIGURATION_CORRESPONDENCES);

		literalSecurityLevelCorrespondence_EDFACodeQLEClass = createEClass(
				LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL);
		createEReference(literalSecurityLevelCorrespondence_EDFACodeQLEClass,
				LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__SECURITY_LEVEL_CODE_QL);
		createEReference(literalSecurityLevelCorrespondence_EDFACodeQLEClass,
				LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__LITERALS_EDFA);

		configurationCorrespondence_EDFACodeQLEClass = createEClass(CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL);
		createEReference(configurationCorrespondence_EDFACodeQLEClass,
				CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_CODE_QL);
		createEReference(configurationCorrespondence_EDFACodeQLEClass,
				CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_EDFA);
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
		TainttrackingPackage theTainttrackingPackage = (TainttrackingPackage) EPackage.Registry.INSTANCE
				.getEPackage(TainttrackingPackage.eNS_URI);
		DataDictionaryCharacterizedPackage theDataDictionaryCharacterizedPackage = (DataDictionaryCharacterizedPackage) EPackage.Registry.INSTANCE
				.getEPackage(DataDictionaryCharacterizedPackage.eNS_URI);
		ParameterannotationPackage theParameterannotationPackage = (ParameterannotationPackage) EPackage.Registry.INSTANCE
				.getEPackage(ParameterannotationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(correspondences_EDFACodeQLEClass, Correspondences_EDFACodeQL.class, "Correspondences_EDFACodeQL",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrespondences_EDFACodeQL_LiteralSecurityLevelCorrespondences(),
				this.getLiteralSecurityLevelCorrespondence_EDFACodeQL(), null, "literalSecurityLevelCorrespondences",
				null, 0, -1, Correspondences_EDFACodeQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_EDFACodeQL_ConfigurationCorrespondences(),
				this.getConfigurationCorrespondence_EDFACodeQL(), null, "configurationCorrespondences", null, 0, -1,
				Correspondences_EDFACodeQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalSecurityLevelCorrespondence_EDFACodeQLEClass,
				LiteralSecurityLevelCorrespondence_EDFACodeQL.class, "LiteralSecurityLevelCorrespondence_EDFACodeQL",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralSecurityLevelCorrespondence_EDFACodeQL_SecurityLevel_CodeQL(),
				theTainttrackingPackage.getSecurityLevel(), null, "securityLevel_CodeQL", null, 1, 1,
				LiteralSecurityLevelCorrespondence_EDFACodeQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiteralSecurityLevelCorrespondence_EDFACodeQL_Literals_EDFA(),
				theDataDictionaryCharacterizedPackage.getLiteral(), null, "literals_EDFA", null, 1, -1,
				LiteralSecurityLevelCorrespondence_EDFACodeQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationCorrespondence_EDFACodeQLEClass, ConfigurationCorrespondence_EDFACodeQL.class,
				"ConfigurationCorrespondence_EDFACodeQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationCorrespondence_EDFACodeQL_Configuration_CodeQL(),
				theTainttrackingPackage.getConfiguration(), null, "configuration_CodeQL", null, 1, 1,
				ConfigurationCorrespondence_EDFACodeQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationCorrespondence_EDFACodeQL_Configuration_EDFA(),
				theParameterannotationPackage.getParameterAnnotations(), null, "configuration_EDFA", null, 1, 1,
				ConfigurationCorrespondence_EDFACodeQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EdfacodeqlcorrespondencesPackageImpl
