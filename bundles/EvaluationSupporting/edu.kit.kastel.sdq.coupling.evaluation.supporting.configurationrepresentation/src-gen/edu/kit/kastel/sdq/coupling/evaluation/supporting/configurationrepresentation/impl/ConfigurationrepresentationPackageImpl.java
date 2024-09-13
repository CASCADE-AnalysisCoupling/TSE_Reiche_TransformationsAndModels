/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configuration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationFactory;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.SingleElementConfiguration;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationrepresentationPackageImpl extends EPackageImpl implements ConfigurationrepresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullyImplicitConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleElementConfigurationEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationrepresentationPackageImpl() {
		super(eNS_URI, ConfigurationrepresentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigurationrepresentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationrepresentationPackage init() {
		if (isInited)
			return (ConfigurationrepresentationPackage) EPackage.Registry.INSTANCE
					.getEPackage(ConfigurationrepresentationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigurationrepresentationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigurationrepresentationPackageImpl theConfigurationrepresentationPackage = registeredConfigurationrepresentationPackage instanceof ConfigurationrepresentationPackageImpl
				? (ConfigurationrepresentationPackageImpl) registeredConfigurationrepresentationPackage
				: new ConfigurationrepresentationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigurationrepresentationPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationrepresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationrepresentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationrepresentationPackage.eNS_URI,
				theConfigurationrepresentationPackage);
		return theConfigurationrepresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurations() {
		return configurationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurations_Configurations() {
		return (EReference) configurationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridConfiguration() {
		return hybridConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridConfiguration_AdditionalInputs() {
		return (EReference) hybridConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridConfiguration_MainConfigurationElement() {
		return (EReference) hybridConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFullyImplicitConfiguration() {
		return fullyImplicitConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFullyImplicitConfiguration_Inputs() {
		return (EReference) fullyImplicitConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleElementConfiguration() {
		return singleElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleElementConfiguration_ConfigurationElement() {
		return (EReference) singleElementConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationrepresentationFactory getConfigurationrepresentationFactory() {
		return (ConfigurationrepresentationFactory) getEFactoryInstance();
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
		configurationsEClass = createEClass(CONFIGURATIONS);
		createEReference(configurationsEClass, CONFIGURATIONS__CONFIGURATIONS);

		configurationEClass = createEClass(CONFIGURATION);

		hybridConfigurationEClass = createEClass(HYBRID_CONFIGURATION);
		createEReference(hybridConfigurationEClass, HYBRID_CONFIGURATION__ADDITIONAL_INPUTS);
		createEReference(hybridConfigurationEClass, HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT);

		fullyImplicitConfigurationEClass = createEClass(FULLY_IMPLICIT_CONFIGURATION);
		createEReference(fullyImplicitConfigurationEClass, FULLY_IMPLICIT_CONFIGURATION__INPUTS);

		singleElementConfigurationEClass = createEClass(SINGLE_ELEMENT_CONFIGURATION);
		createEReference(singleElementConfigurationEClass, SINGLE_ELEMENT_CONFIGURATION__CONFIGURATION_ELEMENT);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
				.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configurationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifiedElement());
		hybridConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		fullyImplicitConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		singleElementConfigurationEClass.getESuperTypes().add(this.getConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationsEClass, Configurations.class, "Configurations", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurations_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1,
				Configurations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hybridConfigurationEClass, HybridConfiguration.class, "HybridConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridConfiguration_AdditionalInputs(), ecorePackage.getEObject(), null, "additionalInputs",
				null, 1, -1, HybridConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridConfiguration_MainConfigurationElement(), ecorePackage.getEObject(), null,
				"mainConfigurationElement", null, 1, 1, HybridConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fullyImplicitConfigurationEClass, FullyImplicitConfiguration.class, "FullyImplicitConfiguration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFullyImplicitConfiguration_Inputs(), ecorePackage.getEObject(), null, "inputs", null, 1, -1,
				FullyImplicitConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleElementConfigurationEClass, SingleElementConfiguration.class, "SingleElementConfiguration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleElementConfiguration_ConfigurationElement(), ecorePackage.getEObject(), null,
				"configurationElement", null, 1, 1, SingleElementConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConfigurationrepresentationPackageImpl
