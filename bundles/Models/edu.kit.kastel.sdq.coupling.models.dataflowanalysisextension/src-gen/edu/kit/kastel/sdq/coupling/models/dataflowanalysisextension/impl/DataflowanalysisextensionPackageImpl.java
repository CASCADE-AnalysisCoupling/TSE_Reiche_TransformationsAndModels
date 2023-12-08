/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.CharacteristicsAnnotation;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionFactory;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage;

import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterizedPackage;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataflowanalysisextensionPackageImpl extends EPackageImpl implements DataflowanalysisextensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedOperationIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedParameterIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedParameterCharacteristicAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicsAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionRootEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataflowanalysisextensionPackageImpl() {
		super(eNS_URI, DataflowanalysisextensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataflowanalysisextensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataflowanalysisextensionPackage init() {
		if (isInited)
			return (DataflowanalysisextensionPackage) EPackage.Registry.INSTANCE
					.getEPackage(DataflowanalysisextensionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataflowanalysisextensionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataflowanalysisextensionPackageImpl theDataflowanalysisextensionPackage = registeredDataflowanalysisextensionPackage instanceof DataflowanalysisextensionPackageImpl
				? (DataflowanalysisextensionPackageImpl) registeredDataflowanalysisextensionPackage
				: new DataflowanalysisextensionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DataDictionaryPackage.eINSTANCE.eClass();
		DataDictionaryCharacterizedPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDataflowanalysisextensionPackage.createPackageContents();

		// Initialize created meta-data
		theDataflowanalysisextensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataflowanalysisextensionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataflowanalysisextensionPackage.eNS_URI, theDataflowanalysisextensionPackage);
		return theDataflowanalysisextensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedOperationIdentification() {
		return providedOperationIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedOperationIdentification_ProvidedRole() {
		return (EReference) providedOperationIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedOperationIdentification_OperationSignature() {
		return (EReference) providedOperationIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedParameterIdentification() {
		return providedParameterIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedParameterIdentification_ProvidedOperation() {
		return (EReference) providedParameterIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedParameterIdentification_Parameter() {
		return (EReference) providedParameterIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedParameterCharacteristicAnnotation() {
		return providedParameterCharacteristicAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedParameterCharacteristicAnnotation_ProvidedParameter() {
		return (EReference) providedParameterCharacteristicAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicsAnnotation() {
		return characteristicsAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicsAnnotation_Characteristics() {
		return (EReference) characteristicsAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionRoot() {
		return extensionRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionRoot_ProvidedParameterIdentification() {
		return (EReference) extensionRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionRoot_ParameterAnnotations() {
		return (EReference) extensionRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataflowanalysisextensionFactory getDataflowanalysisextensionFactory() {
		return (DataflowanalysisextensionFactory) getEFactoryInstance();
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
		providedOperationIdentificationEClass = createEClass(PROVIDED_OPERATION_IDENTIFICATION);
		createEReference(providedOperationIdentificationEClass, PROVIDED_OPERATION_IDENTIFICATION__PROVIDED_ROLE);
		createEReference(providedOperationIdentificationEClass, PROVIDED_OPERATION_IDENTIFICATION__OPERATION_SIGNATURE);

		providedParameterIdentificationEClass = createEClass(PROVIDED_PARAMETER_IDENTIFICATION);
		createEReference(providedParameterIdentificationEClass, PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION);
		createEReference(providedParameterIdentificationEClass, PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER);

		providedParameterCharacteristicAnnotationEClass = createEClass(PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION);
		createEReference(providedParameterCharacteristicAnnotationEClass,
				PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__PROVIDED_PARAMETER);

		characteristicsAnnotationEClass = createEClass(CHARACTERISTICS_ANNOTATION);
		createEReference(characteristicsAnnotationEClass, CHARACTERISTICS_ANNOTATION__CHARACTERISTICS);

		extensionRootEClass = createEClass(EXTENSION_ROOT);
		createEReference(extensionRootEClass, EXTENSION_ROOT__PROVIDED_PARAMETER_IDENTIFICATION);
		createEReference(extensionRootEClass, EXTENSION_ROOT__PARAMETER_ANNOTATIONS);
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
		edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage theIdentifierPackage_1 = (edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage) EPackage.Registry.INSTANCE
				.getEPackage(edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(RepositoryPackage.eNS_URI);
		DataDictionaryCharacterizedPackage theDataDictionaryCharacterizedPackage = (DataDictionaryCharacterizedPackage) EPackage.Registry.INSTANCE
				.getEPackage(DataDictionaryCharacterizedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		providedOperationIdentificationEClass.getESuperTypes().add(theIdentifierPackage_1.getIdentifiedElement());
		providedParameterIdentificationEClass.getESuperTypes().add(theIdentifierPackage_1.getIdentifiedElement());
		providedParameterCharacteristicAnnotationEClass.getESuperTypes()
				.add(theIdentifierPackage_1.getIdentifiedElement());
		providedParameterCharacteristicAnnotationEClass.getESuperTypes().add(this.getCharacteristicsAnnotation());
		characteristicsAnnotationEClass.getESuperTypes().add(theIdentifierPackage_1.getIdentifiedElement());
		extensionRootEClass.getESuperTypes().add(theIdentifierPackage_1.getIdentifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(providedOperationIdentificationEClass, ProvidedOperationIdentification.class,
				"ProvidedOperationIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedOperationIdentification_ProvidedRole(),
				theRepositoryPackage.getOperationProvidedRole(), null, "providedRole", null, 1, 1,
				ProvidedOperationIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedOperationIdentification_OperationSignature(),
				theRepositoryPackage.getOperationSignature(), null, "operationSignature", null, 1, 1,
				ProvidedOperationIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedParameterIdentificationEClass, ProvidedParameterIdentification.class,
				"ProvidedParameterIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedParameterIdentification_ProvidedOperation(),
				this.getProvidedOperationIdentification(), null, "providedOperation", null, 1, 1,
				ProvidedParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedParameterIdentification_Parameter(), theRepositoryPackage.getParameter(), null,
				"parameter", null, 1, 1, ProvidedParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedParameterCharacteristicAnnotationEClass, ProvidedParameterCharacteristicAnnotation.class,
				"ProvidedParameterCharacteristicAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedParameterCharacteristicAnnotation_ProvidedParameter(),
				this.getProvidedParameterIdentification(), null, "providedParameter", null, 1, 1,
				ProvidedParameterCharacteristicAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicsAnnotationEClass, CharacteristicsAnnotation.class, "CharacteristicsAnnotation",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristicsAnnotation_Characteristics(),
				theDataDictionaryCharacterizedPackage.getEnumCharacteristic(), null, "characteristics", null, 1, -1,
				CharacteristicsAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionRootEClass, ExtensionRoot.class, "ExtensionRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionRoot_ProvidedParameterIdentification(), this.getProvidedParameterIdentification(),
				null, "providedParameterIdentification", null, 1, -1, ExtensionRoot.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionRoot_ParameterAnnotations(), this.getProvidedParameterCharacteristicAnnotation(),
				null, "parameterAnnotations", null, 1, -1, ExtensionRoot.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DataflowanalysisextensionPackageImpl
