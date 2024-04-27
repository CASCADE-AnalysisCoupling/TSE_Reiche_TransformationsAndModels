/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar.impl;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarFactory;
import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.joanascar.SystemElementIdentifiying_JOANASCAR;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoanascarPackageImpl extends EPackageImpl implements JoanascarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceCodeAnalysisResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemElementIdentifiying_JOANASCAREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterIdentifyingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldIdentifyingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass level_SCAREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointIdentifyingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEntryElementEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JoanascarPackageImpl() {
		super(eNS_URI, JoanascarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JoanascarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JoanascarPackage init() {
		if (isInited)
			return (JoanascarPackage) EPackage.Registry.INSTANCE.getEPackage(JoanascarPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJoanascarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JoanascarPackageImpl theJoanascarPackage = registeredJoanascarPackage instanceof JoanascarPackageImpl
				? (JoanascarPackageImpl) registeredJoanascarPackage
				: new JoanascarPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJoanascarPackage.createPackageContents();

		// Initialize created meta-data
		theJoanascarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJoanascarPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JoanascarPackage.eNS_URI, theJoanascarPackage);
		return theJoanascarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceCodeAnalysisResult() {
		return sourceCodeAnalysisResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceCodeAnalysisResult_SystemElements() {
		return (EReference) sourceCodeAnalysisResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceCodeAnalysisResult_EntryPoints() {
		return (EReference) sourceCodeAnalysisResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceCodeAnalysisResult_Levels() {
		return (EReference) sourceCodeAnalysisResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceCodeAnalysisResult_ResultEntries() {
		return (EReference) sourceCodeAnalysisResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemElementIdentifiying_JOANASCAR() {
		return systemElementIdentifiying_JOANASCAREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterIdentifying() {
		return parameterIdentifyingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentifying_ParameterIndex() {
		return (EAttribute) parameterIdentifyingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentifying_ParameterType() {
		return (EAttribute) parameterIdentifyingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentifying_MethodName() {
		return (EAttribute) parameterIdentifyingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentifying_FullyQualifiedClassName() {
		return (EAttribute) parameterIdentifyingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldIdentifying() {
		return fieldIdentifyingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldIdentifying_FieldName() {
		return (EAttribute) fieldIdentifyingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldIdentifying_FullyQualifiedClassName() {
		return (EAttribute) fieldIdentifyingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevel_SCAR() {
		return level_SCAREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointIdentifying() {
		return entryPointIdentifyingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPointIdentifying_Tag() {
		return (EAttribute) entryPointIdentifyingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultEntry() {
		return resultEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultEntry_EntryPoint() {
		return (EReference) resultEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultEntry_Source() {
		return (EReference) resultEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultEntry_Sink() {
		return (EReference) resultEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultEntryElement() {
		return resultEntryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultEntryElement_SystemElement() {
		return (EReference) resultEntryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultEntryElement_Level() {
		return (EReference) resultEntryElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanascarFactory getJoanascarFactory() {
		return (JoanascarFactory) getEFactoryInstance();
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
		sourceCodeAnalysisResultEClass = createEClass(SOURCE_CODE_ANALYSIS_RESULT);
		createEReference(sourceCodeAnalysisResultEClass, SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENTS);
		createEReference(sourceCodeAnalysisResultEClass, SOURCE_CODE_ANALYSIS_RESULT__ENTRY_POINTS);
		createEReference(sourceCodeAnalysisResultEClass, SOURCE_CODE_ANALYSIS_RESULT__LEVELS);
		createEReference(sourceCodeAnalysisResultEClass, SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES);

		systemElementIdentifiying_JOANASCAREClass = createEClass(SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR);

		parameterIdentifyingEClass = createEClass(PARAMETER_IDENTIFYING);
		createEAttribute(parameterIdentifyingEClass, PARAMETER_IDENTIFYING__PARAMETER_INDEX);
		createEAttribute(parameterIdentifyingEClass, PARAMETER_IDENTIFYING__PARAMETER_TYPE);
		createEAttribute(parameterIdentifyingEClass, PARAMETER_IDENTIFYING__METHOD_NAME);
		createEAttribute(parameterIdentifyingEClass, PARAMETER_IDENTIFYING__FULLY_QUALIFIED_CLASS_NAME);

		fieldIdentifyingEClass = createEClass(FIELD_IDENTIFYING);
		createEAttribute(fieldIdentifyingEClass, FIELD_IDENTIFYING__FIELD_NAME);
		createEAttribute(fieldIdentifyingEClass, FIELD_IDENTIFYING__FULLY_QUALIFIED_CLASS_NAME);

		level_SCAREClass = createEClass(LEVEL_SCAR);

		entryPointIdentifyingEClass = createEClass(ENTRY_POINT_IDENTIFYING);
		createEAttribute(entryPointIdentifyingEClass, ENTRY_POINT_IDENTIFYING__TAG);

		resultEntryEClass = createEClass(RESULT_ENTRY);
		createEReference(resultEntryEClass, RESULT_ENTRY__ENTRY_POINT);
		createEReference(resultEntryEClass, RESULT_ENTRY__SOURCE);
		createEReference(resultEntryEClass, RESULT_ENTRY__SINK);

		resultEntryElementEClass = createEClass(RESULT_ENTRY_ELEMENT);
		createEReference(resultEntryElementEClass, RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT);
		createEReference(resultEntryElementEClass, RESULT_ENTRY_ELEMENT__LEVEL);
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
		ETypeParameter resultEntryElementEClass_T = addETypeParameter(resultEntryElementEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSystemElementIdentifiying_JOANASCAR());
		resultEntryElementEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		parameterIdentifyingEClass.getESuperTypes().add(this.getSystemElementIdentifiying_JOANASCAR());
		fieldIdentifyingEClass.getESuperTypes().add(this.getSystemElementIdentifiying_JOANASCAR());
		level_SCAREClass.getESuperTypes().add(theIdentifierPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(sourceCodeAnalysisResultEClass, SourceCodeAnalysisResult.class, "SourceCodeAnalysisResult",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceCodeAnalysisResult_SystemElements(), this.getSystemElementIdentifiying_JOANASCAR(),
				null, "systemElements", null, 0, -1, SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_EntryPoints(), this.getEntryPointIdentifying(), null, "entryPoints",
				null, 0, -1, SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_Levels(), this.getLevel_SCAR(), null, "levels", null, 0, -1,
				SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_ResultEntries(), this.getResultEntry(), null, "resultEntries", null,
				0, -1, SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemElementIdentifiying_JOANASCAREClass, SystemElementIdentifiying_JOANASCAR.class,
				"SystemElementIdentifiying_JOANASCAR", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterIdentifyingEClass, ParameterIdentifying.class, "ParameterIdentifying", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterIdentifying_ParameterIndex(), ecorePackage.getEInt(), "parameterIndex", null, 1, 1,
				ParameterIdentifying.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentifying_ParameterType(), ecorePackage.getEString(), "parameterType", null, 1, 1,
				ParameterIdentifying.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentifying_MethodName(), ecorePackage.getEString(), "methodName", null, 1, 1,
				ParameterIdentifying.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentifying_FullyQualifiedClassName(), ecorePackage.getEString(),
				"fullyQualifiedClassName", null, 1, 1, ParameterIdentifying.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldIdentifyingEClass, FieldIdentifying.class, "FieldIdentifying", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldIdentifying_FieldName(), ecorePackage.getEString(), "fieldName", null, 1, 1,
				FieldIdentifying.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldIdentifying_FullyQualifiedClassName(), ecorePackage.getEString(),
				"fullyQualifiedClassName", null, 1, 1, FieldIdentifying.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(level_SCAREClass, Level_SCAR.class, "Level_SCAR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryPointIdentifyingEClass, EntryPointIdentifying.class, "EntryPointIdentifying", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryPointIdentifying_Tag(), ecorePackage.getEString(), "tag", null, 1, 1,
				EntryPointIdentifying.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEntryEClass, ResultEntry.class, "ResultEntry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultEntry_EntryPoint(), this.getEntryPointIdentifying(), null, "entryPoint", null, 1, 1,
				ResultEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getResultEntryElement());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getResultEntry_Source(), g1, null, "source", null, 1, 1, ResultEntry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		g1 = createEGenericType(this.getResultEntryElement());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getResultEntry_Sink(), g1, null, "sink", null, 1, 1, ResultEntry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(resultEntryElementEClass, ResultEntryElement.class, "ResultEntryElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(resultEntryElementEClass_T);
		initEReference(getResultEntryElement_SystemElement(), g1, null, "systemElement", null, 1, 1,
				ResultEntryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultEntryElement_Level(), this.getLevel_SCAR(), null, "level", null, 1, 1,
				ResultEntryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JoanascarPackageImpl
