/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesFactory;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue;

import org.eclipse.emf.ecore.EAttribute;
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
public class JoanaresultingvaluesPackageImpl extends EPackageImpl implements JoanaresultingvaluesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joanaResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterIdentification_JOANAResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass level_ResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointIdentification_ResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultingValueEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JoanaresultingvaluesPackageImpl() {
		super(eNS_URI, JoanaresultingvaluesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JoanaresultingvaluesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JoanaresultingvaluesPackage init() {
		if (isInited)
			return (JoanaresultingvaluesPackage) EPackage.Registry.INSTANCE
					.getEPackage(JoanaresultingvaluesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJoanaresultingvaluesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JoanaresultingvaluesPackageImpl theJoanaresultingvaluesPackage = registeredJoanaresultingvaluesPackage instanceof JoanaresultingvaluesPackageImpl
				? (JoanaresultingvaluesPackageImpl) registeredJoanaresultingvaluesPackage
				: new JoanaresultingvaluesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJoanaresultingvaluesPackage.createPackageContents();

		// Initialize created meta-data
		theJoanaresultingvaluesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJoanaresultingvaluesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JoanaresultingvaluesPackage.eNS_URI, theJoanaresultingvaluesPackage);
		return theJoanaresultingvaluesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJOANAResultingValues() {
		return joanaResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJOANAResultingValues_SystemElements() {
		return (EReference) joanaResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJOANAResultingValues_Levels() {
		return (EReference) joanaResultingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJOANAResultingValues_EntryPoints() {
		return (EReference) joanaResultingValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJOANAResultingValues_ResultingValues() {
		return (EReference) joanaResultingValuesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterIdentification_JOANAResultingValues() {
		return parameterIdentification_JOANAResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentification_JOANAResultingValues_ParameterIndex() {
		return (EAttribute) parameterIdentification_JOANAResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentification_JOANAResultingValues_ParameterType() {
		return (EAttribute) parameterIdentification_JOANAResultingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentification_JOANAResultingValues_MethodName() {
		return (EAttribute) parameterIdentification_JOANAResultingValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentification_JOANAResultingValues_FullyQualifiedClassName() {
		return (EAttribute) parameterIdentification_JOANAResultingValuesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevel_ResultingValues() {
		return level_ResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointIdentification_ResultingValues() {
		return entryPointIdentification_ResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPointIdentification_ResultingValues_Tag() {
		return (EAttribute) entryPointIdentification_ResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultingValue() {
		return resultingValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultingValue_SystemElement() {
		return (EReference) resultingValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultingValue_Configuration() {
		return (EReference) resultingValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultingValue_Level() {
		return (EReference) resultingValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaresultingvaluesFactory getJoanaresultingvaluesFactory() {
		return (JoanaresultingvaluesFactory) getEFactoryInstance();
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
		joanaResultingValuesEClass = createEClass(JOANA_RESULTING_VALUES);
		createEReference(joanaResultingValuesEClass, JOANA_RESULTING_VALUES__SYSTEM_ELEMENTS);
		createEReference(joanaResultingValuesEClass, JOANA_RESULTING_VALUES__LEVELS);
		createEReference(joanaResultingValuesEClass, JOANA_RESULTING_VALUES__ENTRY_POINTS);
		createEReference(joanaResultingValuesEClass, JOANA_RESULTING_VALUES__RESULTING_VALUES);

		parameterIdentification_JOANAResultingValuesEClass = createEClass(
				PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES);
		createEAttribute(parameterIdentification_JOANAResultingValuesEClass,
				PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__PARAMETER_INDEX);
		createEAttribute(parameterIdentification_JOANAResultingValuesEClass,
				PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__PARAMETER_TYPE);
		createEAttribute(parameterIdentification_JOANAResultingValuesEClass,
				PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__METHOD_NAME);
		createEAttribute(parameterIdentification_JOANAResultingValuesEClass,
				PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME);

		level_ResultingValuesEClass = createEClass(LEVEL_RESULTING_VALUES);

		entryPointIdentification_ResultingValuesEClass = createEClass(ENTRY_POINT_IDENTIFICATION_RESULTING_VALUES);
		createEAttribute(entryPointIdentification_ResultingValuesEClass,
				ENTRY_POINT_IDENTIFICATION_RESULTING_VALUES__TAG);

		resultingValueEClass = createEClass(RESULTING_VALUE);
		createEReference(resultingValueEClass, RESULTING_VALUE__SYSTEM_ELEMENT);
		createEReference(resultingValueEClass, RESULTING_VALUE__CONFIGURATION);
		createEReference(resultingValueEClass, RESULTING_VALUE__LEVEL);
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
		level_ResultingValuesEClass.getESuperTypes().add(theIdentifierPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(joanaResultingValuesEClass, JOANAResultingValues.class, "JOANAResultingValues", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJOANAResultingValues_SystemElements(), this.getParameterIdentification_JOANAResultingValues(),
				null, "systemElements", null, 0, -1, JOANAResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJOANAResultingValues_Levels(), this.getLevel_ResultingValues(), null, "levels", null, 0, -1,
				JOANAResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJOANAResultingValues_EntryPoints(), this.getEntryPointIdentification_ResultingValues(), null,
				"entryPoints", null, 0, -1, JOANAResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJOANAResultingValues_ResultingValues(), this.getResultingValue(), null, "resultingValues",
				null, 0, -1, JOANAResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterIdentification_JOANAResultingValuesEClass,
				ParameterIdentification_JOANAResultingValues.class, "ParameterIdentification_JOANAResultingValues",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterIdentification_JOANAResultingValues_ParameterIndex(), ecorePackage.getEInt(),
				"parameterIndex", null, 1, 1, ParameterIdentification_JOANAResultingValues.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentification_JOANAResultingValues_ParameterType(), ecorePackage.getEString(),
				"parameterType", null, 1, 1, ParameterIdentification_JOANAResultingValues.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentification_JOANAResultingValues_MethodName(), ecorePackage.getEString(),
				"methodName", null, 1, 1, ParameterIdentification_JOANAResultingValues.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentification_JOANAResultingValues_FullyQualifiedClassName(),
				ecorePackage.getEString(), "fullyQualifiedClassName", null, 1, 1,
				ParameterIdentification_JOANAResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(level_ResultingValuesEClass, Level_ResultingValues.class, "Level_ResultingValues", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryPointIdentification_ResultingValuesEClass, EntryPointIdentification_ResultingValues.class,
				"EntryPointIdentification_ResultingValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryPointIdentification_ResultingValues_Tag(), ecorePackage.getEString(), "tag", null, 1, 1,
				EntryPointIdentification_ResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultingValueEClass, ResultingValue.class, "ResultingValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultingValue_SystemElement(), this.getParameterIdentification_JOANAResultingValues(), null,
				"systemElement", null, 1, 1, ResultingValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultingValue_Configuration(), this.getEntryPointIdentification_ResultingValues(), null,
				"configuration", null, 1, 1, ResultingValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultingValue_Level(), this.getLevel_ResultingValues(), null, "level", null, 1, 1,
				ResultingValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JoanaresultingvaluesPackageImpl
