/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesFactory;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues;

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
	private EClass resolvedImplementationValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameter_ResolvedImplementationValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass level_ResolvedImplementationValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPoint_ResolvedImplementationValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolvedImplementationValueEClass = null;

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
	public EClass getResolvedImplementationValues() {
		return resolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValues_SystemElements() {
		return (EReference) resolvedImplementationValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValues_Levels() {
		return (EReference) resolvedImplementationValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValues_EntryPoints() {
		return (EReference) resolvedImplementationValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValues_ResultingValues() {
		return (EReference) resolvedImplementationValuesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter_ResolvedImplementationValues() {
		return parameter_ResolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ResolvedImplementationValues_ParameterIndex() {
		return (EAttribute) parameter_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ResolvedImplementationValues_ParameterType() {
		return (EAttribute) parameter_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ResolvedImplementationValues_MethodName() {
		return (EAttribute) parameter_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ResolvedImplementationValues_FullyQualifiedClassName() {
		return (EAttribute) parameter_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevel_ResolvedImplementationValues() {
		return level_ResolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPoint_ResolvedImplementationValues() {
		return entryPoint_ResolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPoint_ResolvedImplementationValues_Tag() {
		return (EAttribute) entryPoint_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolvedImplementationValue() {
		return resolvedImplementationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValue_SystemElement() {
		return (EReference) resolvedImplementationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValue_Configuration() {
		return (EReference) resolvedImplementationValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValue_Level() {
		return (EReference) resolvedImplementationValueEClass.getEStructuralFeatures().get(2);
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
		resolvedImplementationValuesEClass = createEClass(RESOLVED_IMPLEMENTATION_VALUES);
		createEReference(resolvedImplementationValuesEClass, RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS);
		createEReference(resolvedImplementationValuesEClass, RESOLVED_IMPLEMENTATION_VALUES__LEVELS);
		createEReference(resolvedImplementationValuesEClass, RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINTS);
		createEReference(resolvedImplementationValuesEClass, RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES);

		parameter_ResolvedImplementationValuesEClass = createEClass(PARAMETER_RESOLVED_IMPLEMENTATION_VALUES);
		createEAttribute(parameter_ResolvedImplementationValuesEClass,
				PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_INDEX);
		createEAttribute(parameter_ResolvedImplementationValuesEClass,
				PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE);
		createEAttribute(parameter_ResolvedImplementationValuesEClass,
				PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME);
		createEAttribute(parameter_ResolvedImplementationValuesEClass,
				PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME);

		level_ResolvedImplementationValuesEClass = createEClass(LEVEL_RESOLVED_IMPLEMENTATION_VALUES);

		entryPoint_ResolvedImplementationValuesEClass = createEClass(ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES);
		createEAttribute(entryPoint_ResolvedImplementationValuesEClass,
				ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES__TAG);

		resolvedImplementationValueEClass = createEClass(RESOLVED_IMPLEMENTATION_VALUE);
		createEReference(resolvedImplementationValueEClass, RESOLVED_IMPLEMENTATION_VALUE__SYSTEM_ELEMENT);
		createEReference(resolvedImplementationValueEClass, RESOLVED_IMPLEMENTATION_VALUE__CONFIGURATION);
		createEReference(resolvedImplementationValueEClass, RESOLVED_IMPLEMENTATION_VALUE__LEVEL);
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
		level_ResolvedImplementationValuesEClass.getESuperTypes().add(theIdentifierPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(resolvedImplementationValuesEClass, ResolvedImplementationValues.class,
				"ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolvedImplementationValues_SystemElements(),
				this.getParameter_ResolvedImplementationValues(), null, "systemElements", null, 0, -1,
				ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedImplementationValues_Levels(), this.getLevel_ResolvedImplementationValues(), null,
				"levels", null, 0, -1, ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedImplementationValues_EntryPoints(), this.getEntryPoint_ResolvedImplementationValues(),
				null, "entryPoints", null, 0, -1, ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedImplementationValues_ResultingValues(), this.getResolvedImplementationValue(), null,
				"resultingValues", null, 0, -1, ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameter_ResolvedImplementationValuesEClass, Parameter_ResolvedImplementationValues.class,
				"Parameter_ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_ResolvedImplementationValues_ParameterIndex(), ecorePackage.getEInt(),
				"parameterIndex", null, 1, 1, Parameter_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ResolvedImplementationValues_ParameterType(), ecorePackage.getEString(),
				"parameterType", null, 1, 1, Parameter_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ResolvedImplementationValues_MethodName(), ecorePackage.getEString(), "methodName",
				null, 1, 1, Parameter_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ResolvedImplementationValues_FullyQualifiedClassName(), ecorePackage.getEString(),
				"fullyQualifiedClassName", null, 1, 1, Parameter_ResolvedImplementationValues.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(level_ResolvedImplementationValuesEClass, Level_ResolvedImplementationValues.class,
				"Level_ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryPoint_ResolvedImplementationValuesEClass, EntryPoint_ResolvedImplementationValues.class,
				"EntryPoint_ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryPoint_ResolvedImplementationValues_Tag(), ecorePackage.getEString(), "tag", null, 1, 1,
				EntryPoint_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolvedImplementationValueEClass, ResolvedImplementationValue.class, "ResolvedImplementationValue",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolvedImplementationValue_SystemElement(), this.getParameter_ResolvedImplementationValues(),
				null, "systemElement", null, 1, 1, ResolvedImplementationValue.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedImplementationValue_Configuration(),
				this.getEntryPoint_ResolvedImplementationValues(), null, "configuration", null, 1, 1,
				ResolvedImplementationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedImplementationValue_Level(), this.getLevel_ResolvedImplementationValues(), null,
				"level", null, 1, 1, ResolvedImplementationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JoanaresultingvaluesPackageImpl
