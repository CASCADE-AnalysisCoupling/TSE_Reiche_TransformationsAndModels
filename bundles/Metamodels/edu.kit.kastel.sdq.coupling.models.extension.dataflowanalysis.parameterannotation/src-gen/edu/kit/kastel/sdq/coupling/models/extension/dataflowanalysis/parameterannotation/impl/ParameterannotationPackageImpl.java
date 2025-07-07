/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.CharacteristicsAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationFactory;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;

import org.dataflowanalysis.pcm.extension.dictionary.DataDictionary.DataDictionaryPackage;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterizedPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterannotationPackageImpl extends EPackageImpl implements ParameterannotationPackage {
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
	private EClass providedOperationIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalOperationParameterIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedOperationParameterIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterAnnotationsEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParameterannotationPackageImpl() {
		super(eNS_URI, ParameterannotationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ParameterannotationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParameterannotationPackage init() {
		if (isInited)
			return (ParameterannotationPackage) EPackage.Registry.INSTANCE
					.getEPackage(ParameterannotationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredParameterannotationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ParameterannotationPackageImpl theParameterannotationPackage = registeredParameterannotationPackage instanceof ParameterannotationPackageImpl
				? (ParameterannotationPackageImpl) registeredParameterannotationPackage
				: new ParameterannotationPackageImpl();

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
		theParameterannotationPackage.createPackageContents();

		// Initialize created meta-data
		theParameterannotationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParameterannotationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParameterannotationPackage.eNS_URI, theParameterannotationPackage);
		return theParameterannotationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacteristicsAnnotation() {
		return characteristicsAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCharacteristicsAnnotation_Characteristics() {
		return (EReference) characteristicsAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedOperationIdentification() {
		return providedOperationIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralOperationParameterIdentification() {
		return generalOperationParameterIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralOperationParameterIdentification_OperationSignature() {
		return (EReference) generalOperationParameterIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralOperationParameterIdentification_Parameter() {
		return (EReference) generalOperationParameterIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedOperationParameterIdentification() {
		return providedOperationParameterIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedOperationParameterIdentification_ProvidedRole() {
		return (EReference) providedOperationParameterIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterAnnotation() {
		return parameterAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterAnnotation_ParameterIdentification() {
		return (EReference) parameterAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterAnnotations() {
		return parameterAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterAnnotations_Annotations() {
		return (EReference) parameterAnnotationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterannotationFactory getParameterannotationFactory() {
		return (ParameterannotationFactory) getEFactoryInstance();
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
		characteristicsAnnotationEClass = createEClass(CHARACTERISTICS_ANNOTATION);
		createEReference(characteristicsAnnotationEClass, CHARACTERISTICS_ANNOTATION__CHARACTERISTICS);

		providedOperationIdentificationEClass = createEClass(PROVIDED_OPERATION_IDENTIFICATION);

		generalOperationParameterIdentificationEClass = createEClass(GENERAL_OPERATION_PARAMETER_IDENTIFICATION);
		createEReference(generalOperationParameterIdentificationEClass,
				GENERAL_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE);
		createEReference(generalOperationParameterIdentificationEClass,
				GENERAL_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER);

		providedOperationParameterIdentificationEClass = createEClass(PROVIDED_OPERATION_PARAMETER_IDENTIFICATION);
		createEReference(providedOperationParameterIdentificationEClass,
				PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__PROVIDED_ROLE);

		parameterAnnotationEClass = createEClass(PARAMETER_ANNOTATION);
		createEReference(parameterAnnotationEClass, PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION);

		parameterAnnotationsEClass = createEClass(PARAMETER_ANNOTATIONS);
		createEReference(parameterAnnotationsEClass, PARAMETER_ANNOTATIONS__ANNOTATIONS);
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
		DataDictionaryCharacterizedPackage theDataDictionaryCharacterizedPackage = (DataDictionaryCharacterizedPackage) EPackage.Registry.INSTANCE
				.getEPackage(DataDictionaryCharacterizedPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(RepositoryPackage.eNS_URI);
		edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage theIdentifierPackage_1 = (edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage) EPackage.Registry.INSTANCE
				.getEPackage(edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		providedOperationParameterIdentificationEClass.getESuperTypes()
				.add(this.getGeneralOperationParameterIdentification());
		parameterAnnotationEClass.getESuperTypes().add(this.getCharacteristicsAnnotation());
		parameterAnnotationEClass.getESuperTypes().add(theIdentifierPackage_1.getIdentifiedElement());
		parameterAnnotationsEClass.getESuperTypes().add(theIdentifierPackage_1.getIdentifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(characteristicsAnnotationEClass, CharacteristicsAnnotation.class, "CharacteristicsAnnotation",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristicsAnnotation_Characteristics(),
				theDataDictionaryCharacterizedPackage.getEnumCharacteristic(), null, "characteristics", null, 0, -1,
				CharacteristicsAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedOperationIdentificationEClass, ProvidedOperationIdentification.class,
				"ProvidedOperationIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalOperationParameterIdentificationEClass, GeneralOperationParameterIdentification.class,
				"GeneralOperationParameterIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralOperationParameterIdentification_OperationSignature(),
				theRepositoryPackage.getOperationSignature(), null, "operationSignature", null, 1, 1,
				GeneralOperationParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralOperationParameterIdentification_Parameter(), theRepositoryPackage.getParameter(),
				null, "parameter", null, 1, 1, GeneralOperationParameterIdentification.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(providedOperationParameterIdentificationEClass, ProvidedOperationParameterIdentification.class,
				"ProvidedOperationParameterIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedOperationParameterIdentification_ProvidedRole(),
				theRepositoryPackage.getOperationProvidedRole(), null, "providedRole", null, 1, 1,
				ProvidedOperationParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterAnnotationEClass, ParameterAnnotation.class, "ParameterAnnotation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterAnnotation_ParameterIdentification(),
				this.getGeneralOperationParameterIdentification(), null, "parameterIdentification", null, 1, 1,
				ParameterAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterAnnotationsEClass, ParameterAnnotations.class, "ParameterAnnotations", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterAnnotations_Annotations(), this.getParameterAnnotation(), null, "annotations", null,
				0, -1, ParameterAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ParameterannotationPackageImpl
