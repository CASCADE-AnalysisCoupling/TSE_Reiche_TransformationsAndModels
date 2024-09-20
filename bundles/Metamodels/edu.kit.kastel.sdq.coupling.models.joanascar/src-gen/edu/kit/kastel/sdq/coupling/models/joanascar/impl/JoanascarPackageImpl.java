/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar.impl;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Field_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Flow;
import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarFactory;
import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Sink;
import edu.kit.kastel.sdq.coupling.models.joanascar.Source;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.joanascar.SystemElement_SCAR;

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
	private EClass systemElement_SCAREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameter_SCAREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass field_SCAREClass = null;

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
	private EClass entryPoint_SCAREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkEClass = null;

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
	public EReference getSourceCodeAnalysisResult_Flows() {
		return (EReference) sourceCodeAnalysisResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemElement_SCAR() {
		return systemElement_SCAREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter_SCAR() {
		return parameter_SCAREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_SCAR_ParameterIndex() {
		return (EAttribute) parameter_SCAREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_SCAR_ParameterType() {
		return (EAttribute) parameter_SCAREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_SCAR_MethodName() {
		return (EAttribute) parameter_SCAREClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_SCAR_FullyQualifiedClassName() {
		return (EAttribute) parameter_SCAREClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField_SCAR() {
		return field_SCAREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_SCAR_FieldName() {
		return (EAttribute) field_SCAREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_SCAR_FullyQualifiedClassName() {
		return (EAttribute) field_SCAREClass.getEStructuralFeatures().get(1);
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
	public EClass getEntryPoint_SCAR() {
		return entryPoint_SCAREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPoint_SCAR_Tag() {
		return (EAttribute) entryPoint_SCAREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_EntryPoint() {
		return (EReference) flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Source() {
		return (EReference) flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Sink() {
		return (EReference) flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_SystemElement() {
		return (EReference) sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_SourceLevel() {
		return (EReference) sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSink() {
		return sinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSink_SinkLevel() {
		return (EReference) sinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSink_SystemElement() {
		return (EReference) sinkEClass.getEStructuralFeatures().get(1);
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
		createEReference(sourceCodeAnalysisResultEClass, SOURCE_CODE_ANALYSIS_RESULT__FLOWS);

		systemElement_SCAREClass = createEClass(SYSTEM_ELEMENT_SCAR);

		parameter_SCAREClass = createEClass(PARAMETER_SCAR);
		createEAttribute(parameter_SCAREClass, PARAMETER_SCAR__PARAMETER_INDEX);
		createEAttribute(parameter_SCAREClass, PARAMETER_SCAR__PARAMETER_TYPE);
		createEAttribute(parameter_SCAREClass, PARAMETER_SCAR__METHOD_NAME);
		createEAttribute(parameter_SCAREClass, PARAMETER_SCAR__FULLY_QUALIFIED_CLASS_NAME);

		field_SCAREClass = createEClass(FIELD_SCAR);
		createEAttribute(field_SCAREClass, FIELD_SCAR__FIELD_NAME);
		createEAttribute(field_SCAREClass, FIELD_SCAR__FULLY_QUALIFIED_CLASS_NAME);

		level_SCAREClass = createEClass(LEVEL_SCAR);

		entryPoint_SCAREClass = createEClass(ENTRY_POINT_SCAR);
		createEAttribute(entryPoint_SCAREClass, ENTRY_POINT_SCAR__TAG);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__ENTRY_POINT);
		createEReference(flowEClass, FLOW__SOURCE);
		createEReference(flowEClass, FLOW__SINK);

		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__SYSTEM_ELEMENT);
		createEReference(sourceEClass, SOURCE__SOURCE_LEVEL);

		sinkEClass = createEClass(SINK);
		createEReference(sinkEClass, SINK__SINK_LEVEL);
		createEReference(sinkEClass, SINK__SYSTEM_ELEMENT);
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
		ETypeParameter sourceEClass_T = addETypeParameter(sourceEClass, "T");
		ETypeParameter sinkEClass_T = addETypeParameter(sinkEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSystemElement_SCAR());
		sourceEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getSystemElement_SCAR());
		sinkEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		parameter_SCAREClass.getESuperTypes().add(this.getSystemElement_SCAR());
		field_SCAREClass.getESuperTypes().add(this.getSystemElement_SCAR());
		level_SCAREClass.getESuperTypes().add(theIdentifierPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(sourceCodeAnalysisResultEClass, SourceCodeAnalysisResult.class, "SourceCodeAnalysisResult",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceCodeAnalysisResult_SystemElements(), this.getSystemElement_SCAR(), null,
				"systemElements", null, 0, -1, SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_EntryPoints(), this.getEntryPoint_SCAR(), null, "entryPoints", null,
				0, -1, SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_Levels(), this.getLevel_SCAR(), null, "levels", null, 0, -1,
				SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_Flows(), this.getFlow(), null, "flows", null, 0, -1,
				SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemElement_SCAREClass, SystemElement_SCAR.class, "SystemElement_SCAR", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameter_SCAREClass, Parameter_SCAR.class, "Parameter_SCAR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_SCAR_ParameterIndex(), ecorePackage.getEInt(), "parameterIndex", null, 1, 1,
				Parameter_SCAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_SCAR_ParameterType(), ecorePackage.getEString(), "parameterType", null, 1, 1,
				Parameter_SCAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_SCAR_MethodName(), ecorePackage.getEString(), "methodName", null, 1, 1,
				Parameter_SCAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_SCAR_FullyQualifiedClassName(), ecorePackage.getEString(),
				"fullyQualifiedClassName", null, 1, 1, Parameter_SCAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(field_SCAREClass, Field_SCAR.class, "Field_SCAR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_SCAR_FieldName(), ecorePackage.getEString(), "fieldName", null, 1, 1, Field_SCAR.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_SCAR_FullyQualifiedClassName(), ecorePackage.getEString(), "fullyQualifiedClassName",
				null, 1, 1, Field_SCAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(level_SCAREClass, Level_SCAR.class, "Level_SCAR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryPoint_SCAREClass, EntryPoint_SCAR.class, "EntryPoint_SCAR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryPoint_SCAR_Tag(), ecorePackage.getEString(), "tag", null, 1, 1, EntryPoint_SCAR.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_EntryPoint(), this.getEntryPoint_SCAR(), null, "entryPoint", null, 1, 1, Flow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getSource());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getFlow_Source(), g1, null, "source", null, 1, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getSink());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getFlow_Sink(), g1, null, "sink", null, 1, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(sourceEClass_T);
		initEReference(getSource_SystemElement(), g1, null, "systemElement", null, 1, 1, Source.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSource_SourceLevel(), this.getLevel_SCAR(), null, "sourceLevel", null, 1, 1, Source.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sinkEClass, Sink.class, "Sink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSink_SinkLevel(), this.getLevel_SCAR(), null, "sinkLevel", null, 1, 1, Sink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(sinkEClass_T);
		initEReference(getSink_SystemElement(), g1, null, "systemElement", null, 1, 1, Sink.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JoanascarPackageImpl
