/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.SystemElementCorrespondence;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;

import edu.kit.kastel.sdq.coupling.models.java.members.MembersPackage;

import edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage;

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
public class JoanascarcorrespondencesPackageImpl extends EPackageImpl implements JoanascarcorrespondencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joanascarCorrespondencesEClass = null;

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
	private EClass levelCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemElementCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldCorrespondenceEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JoanascarcorrespondencesPackageImpl() {
		super(eNS_URI, JoanascarcorrespondencesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JoanascarcorrespondencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JoanascarcorrespondencesPackage init() {
		if (isInited)
			return (JoanascarcorrespondencesPackage) EPackage.Registry.INSTANCE
					.getEPackage(JoanascarcorrespondencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJoanascarcorrespondencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JoanascarcorrespondencesPackageImpl theJoanascarcorrespondencesPackage = registeredJoanascarcorrespondencesPackage instanceof JoanascarcorrespondencesPackageImpl
				? (JoanascarcorrespondencesPackageImpl) registeredJoanascarcorrespondencesPackage
				: new JoanascarcorrespondencesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		JoanaPackage.eINSTANCE.eClass();
		JoanascarPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJoanascarcorrespondencesPackage.createPackageContents();

		// Initialize created meta-data
		theJoanascarcorrespondencesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJoanascarcorrespondencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JoanascarcorrespondencesPackage.eNS_URI, theJoanascarcorrespondencesPackage);
		return theJoanascarcorrespondencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJOANASCARCorrespondences() {
		return joanascarCorrespondencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJOANASCARCorrespondences_EntryPointCorrespondences() {
		return (EReference) joanascarCorrespondencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJOANASCARCorrespondences_LevelCorrespondences() {
		return (EReference) joanascarCorrespondencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJOANASCARCorrespondences_SystemElementCorrespondences() {
		return (EReference) joanascarCorrespondencesEClass.getEStructuralFeatures().get(2);
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
	public EReference getEntryPointCorrespondence_EntryPoint_JOANA() {
		return (EReference) entryPointCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPointCorrespondence_EntryPoint_SCAR() {
		return (EReference) entryPointCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelCorrespondence() {
		return levelCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevelCorrespondence_Level_JOANA() {
		return (EReference) levelCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevelCorrespondence_Level_SCAR() {
		return (EReference) levelCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemElementCorrespondence() {
		return systemElementCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCorrespondence() {
		return parameterCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_Parameter_JAVA() {
		return (EReference) parameterCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_Parameter_SCAR() {
		return (EReference) parameterCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldCorrespondence() {
		return fieldCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldCorrespondence_Field_JAVA() {
		return (EReference) fieldCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldCorrespondence_Field_SCAR() {
		return (EReference) fieldCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanascarcorrespondencesFactory getJoanascarcorrespondencesFactory() {
		return (JoanascarcorrespondencesFactory) getEFactoryInstance();
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
		joanascarCorrespondencesEClass = createEClass(JOANASCAR_CORRESPONDENCES);
		createEReference(joanascarCorrespondencesEClass, JOANASCAR_CORRESPONDENCES__ENTRY_POINT_CORRESPONDENCES);
		createEReference(joanascarCorrespondencesEClass, JOANASCAR_CORRESPONDENCES__LEVEL_CORRESPONDENCES);
		createEReference(joanascarCorrespondencesEClass, JOANASCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES);

		entryPointCorrespondenceEClass = createEClass(ENTRY_POINT_CORRESPONDENCE);
		createEReference(entryPointCorrespondenceEClass, ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_JOANA);
		createEReference(entryPointCorrespondenceEClass, ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_SCAR);

		levelCorrespondenceEClass = createEClass(LEVEL_CORRESPONDENCE);
		createEReference(levelCorrespondenceEClass, LEVEL_CORRESPONDENCE__LEVEL_JOANA);
		createEReference(levelCorrespondenceEClass, LEVEL_CORRESPONDENCE__LEVEL_SCAR);

		systemElementCorrespondenceEClass = createEClass(SYSTEM_ELEMENT_CORRESPONDENCE);

		parameterCorrespondenceEClass = createEClass(PARAMETER_CORRESPONDENCE);
		createEReference(parameterCorrespondenceEClass, PARAMETER_CORRESPONDENCE__PARAMETER_JAVA);
		createEReference(parameterCorrespondenceEClass, PARAMETER_CORRESPONDENCE__PARAMETER_SCAR);

		fieldCorrespondenceEClass = createEClass(FIELD_CORRESPONDENCE);
		createEReference(fieldCorrespondenceEClass, FIELD_CORRESPONDENCE__FIELD_JAVA);
		createEReference(fieldCorrespondenceEClass, FIELD_CORRESPONDENCE__FIELD_SCAR);
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
		JoanascarPackage theJoanascarPackage = (JoanascarPackage) EPackage.Registry.INSTANCE
				.getEPackage(JoanascarPackage.eNS_URI);
		MembersPackage theMembersPackage = (MembersPackage) EPackage.Registry.INSTANCE
				.getEPackage(MembersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterCorrespondenceEClass.getESuperTypes().add(this.getSystemElementCorrespondence());
		fieldCorrespondenceEClass.getESuperTypes().add(this.getSystemElementCorrespondence());

		// Initialize classes, features, and operations; add parameters
		initEClass(joanascarCorrespondencesEClass, JOANASCARCorrespondences.class, "JOANASCARCorrespondences",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJOANASCARCorrespondences_EntryPointCorrespondences(), this.getEntryPointCorrespondence(),
				null, "entryPointCorrespondences", null, 0, -1, JOANASCARCorrespondences.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJOANASCARCorrespondences_LevelCorrespondences(), this.getLevelCorrespondence(), null,
				"levelCorrespondences", null, 0, -1, JOANASCARCorrespondences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJOANASCARCorrespondences_SystemElementCorrespondences(),
				this.getSystemElementCorrespondence(), null, "systemElementCorrespondences", null, 0, -1,
				JOANASCARCorrespondences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryPointCorrespondenceEClass, EntryPointCorrespondence.class, "EntryPointCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryPointCorrespondence_EntryPoint_JOANA(), theJoanaPackage.getEntryPoint(), null,
				"entryPoint_JOANA", null, 1, 1, EntryPointCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryPointCorrespondence_EntryPoint_SCAR(), theJoanascarPackage.getEntryPointIdentifying(),
				null, "entryPoint_SCAR", null, 1, 1, EntryPointCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelCorrespondenceEClass, LevelCorrespondence.class, "LevelCorrespondence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLevelCorrespondence_Level_JOANA(), theJoanaPackage.getLevel(), null, "level_JOANA", null, 1,
				1, LevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevelCorrespondence_Level_SCAR(), theJoanascarPackage.getLevel_SCAR(), null, "level_SCAR",
				null, 1, 1, LevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemElementCorrespondenceEClass, SystemElementCorrespondence.class, "SystemElementCorrespondence",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterCorrespondenceEClass, ParameterCorrespondence.class, "ParameterCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCorrespondence_Parameter_JAVA(), theMembersPackage.getParameter(), null,
				"parameter_JAVA", null, 1, 1, ParameterCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCorrespondence_Parameter_SCAR(), theJoanascarPackage.getParameterIdentifying(), null,
				"parameter_SCAR", null, 1, 1, ParameterCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldCorrespondenceEClass, FieldCorrespondence.class, "FieldCorrespondence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldCorrespondence_Field_JAVA(), theMembersPackage.getField(), null, "field_JAVA", null, 1,
				1, FieldCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldCorrespondence_Field_SCAR(), theJoanascarPackage.getFieldIdentifying(), null,
				"field_SCAR", null, 1, 1, FieldCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JoanascarcorrespondencesPackageImpl
