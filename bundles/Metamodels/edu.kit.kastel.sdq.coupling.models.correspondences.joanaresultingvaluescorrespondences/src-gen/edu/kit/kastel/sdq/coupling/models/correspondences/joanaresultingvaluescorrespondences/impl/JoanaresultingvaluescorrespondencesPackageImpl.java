/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;

import edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage;

import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage;

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
public class JoanaresultingvaluescorrespondencesPackageImpl extends EPackageImpl
		implements JoanaresultingvaluescorrespondencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correspondences_ResolvedImplementationValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelCorrespondence_ResolvedImplementationValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointCorrespondence_JOANAResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCorrespondence_JOANAResultingValuesEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JoanaresultingvaluescorrespondencesPackageImpl() {
		super(eNS_URI, JoanaresultingvaluescorrespondencesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JoanaresultingvaluescorrespondencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JoanaresultingvaluescorrespondencesPackage init() {
		if (isInited)
			return (JoanaresultingvaluescorrespondencesPackage) EPackage.Registry.INSTANCE
					.getEPackage(JoanaresultingvaluescorrespondencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJoanaresultingvaluescorrespondencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JoanaresultingvaluescorrespondencesPackageImpl theJoanaresultingvaluescorrespondencesPackage = registeredJoanaresultingvaluescorrespondencesPackage instanceof JoanaresultingvaluescorrespondencesPackageImpl
				? (JoanaresultingvaluescorrespondencesPackageImpl) registeredJoanaresultingvaluescorrespondencesPackage
				: new JoanaresultingvaluescorrespondencesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		JoanaPackage.eINSTANCE.eClass();
		JoanaresultingvaluesPackage.eINSTANCE.eClass();
		JoanascarPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJoanaresultingvaluescorrespondencesPackage.createPackageContents();

		// Initialize created meta-data
		theJoanaresultingvaluescorrespondencesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJoanaresultingvaluescorrespondencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JoanaresultingvaluescorrespondencesPackage.eNS_URI,
				theJoanaresultingvaluescorrespondencesPackage);
		return theJoanaresultingvaluescorrespondencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrespondences_ResolvedImplementationValues() {
		return correspondences_ResolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_ResolvedImplementationValues_LevelCorrespondences() {
		return (EReference) correspondences_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_ResolvedImplementationValues_EntryPointCorrespondences() {
		return (EReference) correspondences_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_ResolvedImplementationValues_ParameterCorrespondences() {
		return (EReference) correspondences_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelCorrespondence_ResolvedImplementationValues() {
		return levelCorrespondence_ResolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevelCorrespondence_ResolvedImplementationValues_Level_JOANA() {
		return (EReference) levelCorrespondence_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevelCorrespondence_ResolvedImplementationValues_Level_ResolvedImplementationValues() {
		return (EReference) levelCorrespondence_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointCorrespondence_JOANAResultingValues() {
		return entryPointCorrespondence_JOANAResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_SCAR() {
		return (EReference) entryPointCorrespondence_JOANAResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_ResolvedImplementationValues() {
		return (EReference) entryPointCorrespondence_JOANAResultingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCorrespondence_JOANAResultingValues() {
		return parameterCorrespondence_JOANAResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_JOANAResultingValues_Parameter_SCAR() {
		return (EReference) parameterCorrespondence_JOANAResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_JOANAResultingValues_Parameter_ResolvedImplementationValues() {
		return (EReference) parameterCorrespondence_JOANAResultingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaresultingvaluescorrespondencesFactory getJoanaresultingvaluescorrespondencesFactory() {
		return (JoanaresultingvaluescorrespondencesFactory) getEFactoryInstance();
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
		correspondences_ResolvedImplementationValuesEClass = createEClass(
				CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES);
		createEReference(correspondences_ResolvedImplementationValuesEClass,
				CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_CORRESPONDENCES);
		createEReference(correspondences_ResolvedImplementationValuesEClass,
				CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINT_CORRESPONDENCES);
		createEReference(correspondences_ResolvedImplementationValuesEClass,
				CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_CORRESPONDENCES);

		levelCorrespondence_ResolvedImplementationValuesEClass = createEClass(
				LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES);
		createEReference(levelCorrespondence_ResolvedImplementationValuesEClass,
				LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_JOANA);
		createEReference(levelCorrespondence_ResolvedImplementationValuesEClass,
				LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_RESOLVED_IMPLEMENTATION_VALUES);

		entryPointCorrespondence_JOANAResultingValuesEClass = createEClass(
				ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES);
		createEReference(entryPointCorrespondence_JOANAResultingValuesEClass,
				ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_SCAR);
		createEReference(entryPointCorrespondence_JOANAResultingValuesEClass,
				ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES);

		parameterCorrespondence_JOANAResultingValuesEClass = createEClass(
				PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES);
		createEReference(parameterCorrespondence_JOANAResultingValuesEClass,
				PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_SCAR);
		createEReference(parameterCorrespondence_JOANAResultingValuesEClass,
				PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_RESOLVED_IMPLEMENTATION_VALUES);
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
		JoanaPackage theJoanaPackage = (JoanaPackage) EPackage.Registry.INSTANCE.getEPackage(JoanaPackage.eNS_URI);
		JoanaresultingvaluesPackage theJoanaresultingvaluesPackage = (JoanaresultingvaluesPackage) EPackage.Registry.INSTANCE
				.getEPackage(JoanaresultingvaluesPackage.eNS_URI);
		JoanascarPackage theJoanascarPackage = (JoanascarPackage) EPackage.Registry.INSTANCE
				.getEPackage(JoanascarPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(correspondences_ResolvedImplementationValuesEClass,
				Correspondences_ResolvedImplementationValues.class, "Correspondences_ResolvedImplementationValues",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrespondences_ResolvedImplementationValues_LevelCorrespondences(),
				this.getLevelCorrespondence_ResolvedImplementationValues(), null, "levelCorrespondences", null, 0, -1,
				Correspondences_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_ResolvedImplementationValues_EntryPointCorrespondences(),
				this.getEntryPointCorrespondence_JOANAResultingValues(), null, "entryPointCorrespondences", null, 0, -1,
				Correspondences_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_ResolvedImplementationValues_ParameterCorrespondences(),
				this.getParameterCorrespondence_JOANAResultingValues(), null, "parameterCorrespondences", null, 0, -1,
				Correspondences_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelCorrespondence_ResolvedImplementationValuesEClass,
				LevelCorrespondence_ResolvedImplementationValues.class,
				"LevelCorrespondence_ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLevelCorrespondence_ResolvedImplementationValues_Level_JOANA(), theJoanaPackage.getLevel(),
				null, "level_JOANA", null, 1, 1, LevelCorrespondence_ResolvedImplementationValues.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLevelCorrespondence_ResolvedImplementationValues_Level_ResolvedImplementationValues(),
				theJoanaresultingvaluesPackage.getLevel_ResolvedImplementationValues(), null,
				"level_ResolvedImplementationValues", null, 1, 1,
				LevelCorrespondence_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryPointCorrespondence_JOANAResultingValuesEClass,
				EntryPointCorrespondence_JOANAResultingValues.class, "EntryPointCorrespondence_JOANAResultingValues",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_SCAR(),
				theJoanascarPackage.getEntryPoint_SCAR(), null, "entryPoint_SCAR", null, 1, 1,
				EntryPointCorrespondence_JOANAResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_ResolvedImplementationValues(),
				theJoanaresultingvaluesPackage.getEntryPoint_ResolvedImplementationValues(), null,
				"entryPoint_ResolvedImplementationValues", null, 1, 1,
				EntryPointCorrespondence_JOANAResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCorrespondence_JOANAResultingValuesEClass,
				ParameterCorrespondence_JOANAResultingValues.class, "ParameterCorrespondence_JOANAResultingValues",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCorrespondence_JOANAResultingValues_Parameter_SCAR(),
				theJoanascarPackage.getParameter_SCAR(), null, "parameter_SCAR", null, 1, 1,
				ParameterCorrespondence_JOANAResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCorrespondence_JOANAResultingValues_Parameter_ResolvedImplementationValues(),
				theJoanaresultingvaluesPackage.getParameter_ResolvedImplementationValues(), null,
				"parameter_ResolvedImplementationValues", null, 1, 1,
				ParameterCorrespondence_JOANAResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JoanaresultingvaluescorrespondencesPackageImpl
