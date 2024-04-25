/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar.impl;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarFactory;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElementIdentification;

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
	private EClass resultEntryEClass = null;

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
	private EClass configurationID_SCAREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemElementIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldIdentificationEClass = null;

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
	public EReference getSourceCodeAnalysisResult_Configurations() {
		return (EReference) sourceCodeAnalysisResultEClass.getEStructuralFeatures().get(3);
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
	public EReference getResultEntry_Source() {
		return (EReference) resultEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultEntry_Sink() {
		return (EReference) resultEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultEntry_Config() {
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
	public EReference getResultEntryElement_SecurityLevel() {
		return (EReference) resultEntryElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationID_SCAR() {
		return configurationID_SCAREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationID_SCAR_Id() {
		return (EAttribute) configurationID_SCAREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemElementIdentification() {
		return systemElementIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterIdentification() {
		return parameterIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentification_ParameterName() {
		return (EAttribute) parameterIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentification_ParameterType() {
		return (EAttribute) parameterIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentification_MethodName() {
		return (EAttribute) parameterIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentification_FullyQualifiedClassName() {
		return (EAttribute) parameterIdentificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldIdentification() {
		return fieldIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldIdentification_FieldName() {
		return (EAttribute) fieldIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldIdentification_Type() {
		return (EAttribute) fieldIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldIdentification_FullyQualifiedClassName() {
		return (EAttribute) fieldIdentificationEClass.getEStructuralFeatures().get(2);
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
		createEReference(sourceCodeAnalysisResultEClass, SOURCE_CODE_ANALYSIS_RESULT__CONFIGURATIONS);

		resultEntryEClass = createEClass(RESULT_ENTRY);
		createEReference(resultEntryEClass, RESULT_ENTRY__SOURCE);
		createEReference(resultEntryEClass, RESULT_ENTRY__SINK);
		createEReference(resultEntryEClass, RESULT_ENTRY__CONFIG);

		resultEntryElementEClass = createEClass(RESULT_ENTRY_ELEMENT);
		createEReference(resultEntryElementEClass, RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT);
		createEReference(resultEntryElementEClass, RESULT_ENTRY_ELEMENT__SECURITY_LEVEL);

		configurationID_SCAREClass = createEClass(CONFIGURATION_ID_SCAR);
		createEAttribute(configurationID_SCAREClass, CONFIGURATION_ID_SCAR__ID);

		systemElementIdentificationEClass = createEClass(SYSTEM_ELEMENT_IDENTIFICATION);

		parameterIdentificationEClass = createEClass(PARAMETER_IDENTIFICATION);
		createEAttribute(parameterIdentificationEClass, PARAMETER_IDENTIFICATION__PARAMETER_NAME);
		createEAttribute(parameterIdentificationEClass, PARAMETER_IDENTIFICATION__PARAMETER_TYPE);
		createEAttribute(parameterIdentificationEClass, PARAMETER_IDENTIFICATION__METHOD_NAME);
		createEAttribute(parameterIdentificationEClass, PARAMETER_IDENTIFICATION__FULLY_QUALIFIED_CLASS_NAME);

		fieldIdentificationEClass = createEClass(FIELD_IDENTIFICATION);
		createEAttribute(fieldIdentificationEClass, FIELD_IDENTIFICATION__FIELD_NAME);
		createEAttribute(fieldIdentificationEClass, FIELD_IDENTIFICATION__TYPE);
		createEAttribute(fieldIdentificationEClass, FIELD_IDENTIFICATION__FULLY_QUALIFIED_CLASS_NAME);

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
		EGenericType g1 = createEGenericType(this.getSystemElementIdentification());
		resultEntryElementEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		parameterIdentificationEClass.getESuperTypes().add(this.getSystemElementIdentification());
		fieldIdentificationEClass.getESuperTypes().add(this.getSystemElementIdentification());
		securityLevel_SCAREClass.getESuperTypes().add(theIdentifierPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(sourceCodeAnalysisResultEClass, SourceCodeAnalysisResult.class, "SourceCodeAnalysisResult",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceCodeAnalysisResult_SystemElementIdentifications(),
				this.getSystemElementIdentification(), null, "systemElementIdentifications", null, 0, -1,
				SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_SecurityLevels(), this.getSecurityLevel_SCAR(), null,
				"securityLevels", null, 0, -1, SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_ResultEntries(), this.getResultEntry(), null, "resultEntries", null,
				0, -1, SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceCodeAnalysisResult_Configurations(), this.getConfigurationID_SCAR(), null,
				"configurations", null, 0, -1, SourceCodeAnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEntryEClass, ResultEntry.class, "ResultEntry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
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
		initEReference(getResultEntry_Config(), this.getConfigurationID_SCAR(), null, "config", null, 1, 1,
				ResultEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEntryElementEClass, ResultEntryElement.class, "ResultEntryElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(resultEntryElementEClass_T);
		initEReference(getResultEntryElement_SystemElement(), g1, null, "systemElement", null, 1, 1,
				ResultEntryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultEntryElement_SecurityLevel(), this.getSecurityLevel_SCAR(), null, "securityLevel", null,
				1, 1, ResultEntryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationID_SCAREClass, ConfigurationID_SCAR.class, "ConfigurationID_SCAR", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationID_SCAR_Id(), ecorePackage.getEString(), "id", null, 1, 1,
				ConfigurationID_SCAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemElementIdentificationEClass, SystemElementIdentification.class, "SystemElementIdentification",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterIdentificationEClass, ParameterIdentification.class, "ParameterIdentification",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterIdentification_ParameterName(), ecorePackage.getEString(), "parameterName", null, 1,
				1, ParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentification_ParameterType(), ecorePackage.getEString(), "parameterType", null, 1,
				1, ParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentification_MethodName(), ecorePackage.getEString(), "methodName", null, 1, 1,
				ParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentification_FullyQualifiedClassName(), ecorePackage.getEString(),
				"fullyQualifiedClassName", null, 1, 1, ParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldIdentificationEClass, FieldIdentification.class, "FieldIdentification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldIdentification_FieldName(), ecorePackage.getEString(), "fieldName", null, 1, 1,
				FieldIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldIdentification_Type(), ecorePackage.getEString(), "type", null, 1, 1,
				FieldIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldIdentification_FullyQualifiedClassName(), ecorePackage.getEString(),
				"fullyQualifiedClassName", null, 1, 1, FieldIdentification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityLevel_SCAREClass, SecurityLevel_SCAR.class, "SecurityLevel_SCAR", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeqlscarPackageImpl
