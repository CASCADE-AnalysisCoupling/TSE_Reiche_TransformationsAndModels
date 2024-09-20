/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;

import edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage;

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
public class EdfajoanacorrespondencesPackageImpl extends EPackageImpl implements EdfajoanacorrespondencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correspondences_EDFAJOANAEClass = null;

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
	private EClass literalsLevelCorrespondenceEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdfajoanacorrespondencesPackageImpl() {
		super(eNS_URI, EdfajoanacorrespondencesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EdfajoanacorrespondencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EdfajoanacorrespondencesPackage init() {
		if (isInited)
			return (EdfajoanacorrespondencesPackage) EPackage.Registry.INSTANCE
					.getEPackage(EdfajoanacorrespondencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEdfajoanacorrespondencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EdfajoanacorrespondencesPackageImpl theEdfajoanacorrespondencesPackage = registeredEdfajoanacorrespondencesPackage instanceof EdfajoanacorrespondencesPackageImpl
				? (EdfajoanacorrespondencesPackageImpl) registeredEdfajoanacorrespondencesPackage
				: new EdfajoanacorrespondencesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DataDictionaryPackage.eINSTANCE.eClass();
		DataDictionaryCharacterizedPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		JoanaPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ParameterannotationPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEdfajoanacorrespondencesPackage.createPackageContents();

		// Initialize created meta-data
		theEdfajoanacorrespondencesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdfajoanacorrespondencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdfajoanacorrespondencesPackage.eNS_URI, theEdfajoanacorrespondencesPackage);
		return theEdfajoanacorrespondencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrespondences_EDFAJOANA() {
		return correspondences_EDFAJOANAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCorrespondences_EDFAJOANA_ConfigurationCorrespondences() {
		return (EReference) correspondences_EDFAJOANAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCorrespondences_EDFAJOANA_LiteralLevelCorrespondences() {
		return (EReference) correspondences_EDFAJOANAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationCorrespondence() {
		return configurationCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationCorrespondence_Configuration_EDFA() {
		return (EReference) configurationCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationCorrespondence_Configuration_JOANA() {
		return (EReference) configurationCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralsLevelCorrespondence() {
		return literalsLevelCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiteralsLevelCorrespondence_Literals_EDFA() {
		return (EReference) literalsLevelCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiteralsLevelCorrespondence_Level_JOANA() {
		return (EReference) literalsLevelCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdfajoanacorrespondencesFactory getEdfajoanacorrespondencesFactory() {
		return (EdfajoanacorrespondencesFactory) getEFactoryInstance();
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
		correspondences_EDFAJOANAEClass = createEClass(CORRESPONDENCES_EDFAJOANA);
		createEReference(correspondences_EDFAJOANAEClass, CORRESPONDENCES_EDFAJOANA__CONFIGURATION_CORRESPONDENCES);
		createEReference(correspondences_EDFAJOANAEClass, CORRESPONDENCES_EDFAJOANA__LITERAL_LEVEL_CORRESPONDENCES);

		configurationCorrespondenceEClass = createEClass(CONFIGURATION_CORRESPONDENCE);
		createEReference(configurationCorrespondenceEClass, CONFIGURATION_CORRESPONDENCE__CONFIGURATION_EDFA);
		createEReference(configurationCorrespondenceEClass, CONFIGURATION_CORRESPONDENCE__CONFIGURATION_JOANA);

		literalsLevelCorrespondenceEClass = createEClass(LITERALS_LEVEL_CORRESPONDENCE);
		createEReference(literalsLevelCorrespondenceEClass, LITERALS_LEVEL_CORRESPONDENCE__LITERALS_EDFA);
		createEReference(literalsLevelCorrespondenceEClass, LITERALS_LEVEL_CORRESPONDENCE__LEVEL_JOANA);
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
		ParameterannotationPackage theParameterannotationPackage = (ParameterannotationPackage) EPackage.Registry.INSTANCE
				.getEPackage(ParameterannotationPackage.eNS_URI);
		JoanaPackage theJoanaPackage = (JoanaPackage) EPackage.Registry.INSTANCE.getEPackage(JoanaPackage.eNS_URI);
		DataDictionaryCharacterizedPackage theDataDictionaryCharacterizedPackage = (DataDictionaryCharacterizedPackage) EPackage.Registry.INSTANCE
				.getEPackage(DataDictionaryCharacterizedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(correspondences_EDFAJOANAEClass, Correspondences_EDFAJOANA.class, "Correspondences_EDFAJOANA",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrespondences_EDFAJOANA_ConfigurationCorrespondences(),
				this.getConfigurationCorrespondence(), null, "configurationCorrespondences", null, 0, -1,
				Correspondences_EDFAJOANA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_EDFAJOANA_LiteralLevelCorrespondences(),
				this.getLiteralsLevelCorrespondence(), null, "literalLevelCorrespondences", null, 0, -1,
				Correspondences_EDFAJOANA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationCorrespondenceEClass, ConfigurationCorrespondence.class, "ConfigurationCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationCorrespondence_Configuration_EDFA(),
				theParameterannotationPackage.getParameterAnnotations(), null, "configuration_EDFA", null, 1, 1,
				ConfigurationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationCorrespondence_Configuration_JOANA(), theJoanaPackage.getEntryPoint(), null,
				"configuration_JOANA", null, 1, 1, ConfigurationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalsLevelCorrespondenceEClass, LiteralsLevelCorrespondence.class, "LiteralsLevelCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralsLevelCorrespondence_Literals_EDFA(),
				theDataDictionaryCharacterizedPackage.getLiteral(), null, "literals_EDFA", null, 1, -1,
				LiteralsLevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiteralsLevelCorrespondence_Level_JOANA(), theJoanaPackage.getLevel(), null, "level_JOANA",
				null, 1, 1, LiteralsLevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EdfajoanacorrespondencesPackageImpl
