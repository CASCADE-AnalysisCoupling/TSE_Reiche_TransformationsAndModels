/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar.impl;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarFactory;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Result;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElement;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

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
public class CodeqlscarPackageImpl extends EPackageImpl implements CodeqlscarPackage {
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
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEntryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemElementEClass = null;

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
	private EClass securityLevel_SCAREClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodeqlscarPackageImpl() {
		super(eNS_URI, CodeqlscarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodeqlscarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodeqlscarPackage init() {
		if (isInited)
			return (CodeqlscarPackage) EPackage.Registry.INSTANCE.getEPackage(CodeqlscarPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCodeqlscarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CodeqlscarPackageImpl theCodeqlscarPackage = registeredCodeqlscarPackage instanceof CodeqlscarPackageImpl
				? (CodeqlscarPackageImpl) registeredCodeqlscarPackage
				: new CodeqlscarPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCodeqlscarPackage.createPackageContents();

		// Initialize created meta-data
		theCodeqlscarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodeqlscarPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodeqlscarPackage.eNS_URI, theCodeqlscarPackage);
		return theCodeqlscarPackage;
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
	public EReference getSourceCodeAnalysisResult_SystemElementIdentifications() {
		return (EReference) sourceCodeAnalysisResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceCodeAnalysisResult_SecurityLevels() {
		return (EReference) sourceCodeAnalysisResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceCodeAnalysisResult_ResultEntries() {
		return (EReference) sourceCodeAnalysisResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceCodeAnalysisResult_RuleIds() {
		return (EReference) sourceCodeAnalysisResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_Source() {
		return (EReference) resultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_Sink() {
		return (EReference) resultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_RuleId() {
		return (EReference) resultEClass.getEStructuralFeatures().get(2);
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
	public EReference getResultEntryElement_SecurityLevel() {
		return (EReference) resultEntryElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleId() {
		return ruleIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleId_Id() {
		return (EAttribute) ruleIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemElement() {
		return systemElementEClass;
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
	public EAttribute getParameter_SCAR_ParameterName() {
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
	public EAttribute getField_SCAR_Type() {
		return (EAttribute) field_SCAREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_SCAR_FullyQualifiedClassName() {
		return (EAttribute) field_SCAREClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityLevel_SCAR() {
		return securityLevel_SCAREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlscarFactory getCodeqlscarFactory() {
		return (CodeqlscarFactory) getEFactoryInstance();
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
		createEReference(sourceCodeAnalysisResultEClass, SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENT_IDENTIFICATIONS);
		createEReference(sourceCodeAnalysisResultEClass, SOURCE_CODE_ANALYSIS_RESULT__SECURITY_LEVELS);
		createEReference(sourceCodeAnalysisResultEClass, SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES);
		createEReference(sourceCodeAnalysisResultEClass, SOURCE_CODE_ANALYSIS_RESULT__RULE_IDS);

		resultEClass = createEClass(RESULT);
		createEReference(resultEClass, RESULT__SOURCE);
		createEReference(resultEClass, RESULT__SINK);
		createEReference(resultEClass, RESULT__RULE_ID);

		resultEntryElementEClass = createEClass(RESULT_ENTRY_ELEMENT);
		createEReference(resultEntryElementEClass, RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT);
		createEReference(resultEntryElementEClass, RESULT_ENTRY_ELEMENT__SECURITY_LEVEL);

		ruleIdEClass = createEClass(RULE_ID);
		createEAttribute(ruleIdEClass, RULE_ID__ID);

		systemElementEClass = createEClass(SYSTEM_ELEMENT);

		parameter_SCAREClass = createEClass(PARAMETER_SCAR);
		createEAttribute(parameter_SCAREClass, PARAMETER_SCAR__PARAMETER_NAME);
		createEAttribute(parameter_SCAREClass, PARAMETER_SCAR__PARAMETER_TYPE);
		createEAttribute(parameter_SCAREClass, PARAMETER_SCAR__METHOD_NAME);
		createEAttribute(parameter_SCAREClass, PARAMETER_SCAR__FULLY_QUALIFIED_CLASS_NAME);

		field_SCAREClass = createEClass(FIELD_SCAR);
		createEAttribute(field_SCAREClass, FIELD_SCAR__FIELD_NAME);
		createEAttribute(field_SCAREClass, FIELD_SCAR__TYPE);
		createEAttribute(field_SCAREClass, FIELD_SCAR__FULLY_QUALIFIED_CLASS_NAME);

		securityLevel_SCAREClass = createEClass(SECURITY_LEVEL_SCAR);
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
		EGenericType g1 = createEGenericType(this.getSystemElement());
		resultEntryElementEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		parameter_SCAREClass.getESuperTypes().add(this.getSystemElement());
		field_SCAREClass.getESuperTypes().add(this.getSystemElement());
		securityLevel_SCAREClass.getESuperTypes().add(theIdentifierPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(sourceCodeAnalysisResultEClass, SourceCodeAnalysisResult.class, "SourceCodeAnalysisResult",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceCodeAnalysisResult_SystemElementIdentifications(), this.getSystemElement(), null,
				"systemElementIdentifications", null, 0, -1, SourceCodeAnalysisResult.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_SecurityLevels(), this.getSecurityLevel_SCAR(), null,
				"securityLevels", null, 0, -1, SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_ResultEntries(), this.getResult(), null, "resultEntries", null, 0,
				-1, SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_RuleIds(), this.getRuleId(), null, "ruleIds", null, 0, -1,
				SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getResultEntryElement());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getResult_Source(), g1, null, "source", null, 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getResultEntryElement());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getResult_Sink(), g1, null, "sink", null, 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_RuleId(), this.getRuleId(), null, "ruleId", null, 1, 1, Result.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(resultEntryElementEClass, ResultEntryElement.class, "ResultEntryElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(resultEntryElementEClass_T);
		initEReference(getResultEntryElement_SystemElement(), g1, null, "systemElement", null, 1, 1,
				ResultEntryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultEntryElement_SecurityLevel(), this.getSecurityLevel_SCAR(), null, "securityLevel", null,
				1, 1, ResultEntryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleIdEClass, RuleId.class, "RuleId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleId_Id(), ecorePackage.getEString(), "id", null, 1, 1, RuleId.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemElementEClass, SystemElement.class, "SystemElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameter_SCAREClass, Parameter_SCAR.class, "Parameter_SCAR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_SCAR_ParameterName(), ecorePackage.getEString(), "parameterName", null, 1, 1,
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
		initEAttribute(getField_SCAR_Type(), ecorePackage.getEString(), "type", null, 1, 1, Field_SCAR.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_SCAR_FullyQualifiedClassName(), ecorePackage.getEString(), "fullyQualifiedClassName",
				null, 1, 1, Field_SCAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityLevel_SCAREClass, SecurityLevel_SCAR.class, "SecurityLevel_SCAR", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeqlscarPackageImpl
