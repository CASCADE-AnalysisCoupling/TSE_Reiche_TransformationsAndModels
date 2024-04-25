/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesFactory;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

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
public class CodeqlresultingvaluesPackageImpl extends EPackageImpl implements CodeqlresultingvaluesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeQLResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterIdentificiation_CodeQLResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultingValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityLevel_ResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationID_ResultingValuesEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodeqlresultingvaluesPackageImpl() {
		super(eNS_URI, CodeqlresultingvaluesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodeqlresultingvaluesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodeqlresultingvaluesPackage init() {
		if (isInited)
			return (CodeqlresultingvaluesPackage) EPackage.Registry.INSTANCE
					.getEPackage(CodeqlresultingvaluesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCodeqlresultingvaluesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CodeqlresultingvaluesPackageImpl theCodeqlresultingvaluesPackage = registeredCodeqlresultingvaluesPackage instanceof CodeqlresultingvaluesPackageImpl
				? (CodeqlresultingvaluesPackageImpl) registeredCodeqlresultingvaluesPackage
				: new CodeqlresultingvaluesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCodeqlresultingvaluesPackage.createPackageContents();

		// Initialize created meta-data
		theCodeqlresultingvaluesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodeqlresultingvaluesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodeqlresultingvaluesPackage.eNS_URI, theCodeqlresultingvaluesPackage);
		return theCodeqlresultingvaluesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeQLResultingValues() {
		return codeQLResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeQLResultingValues_ResultingValues() {
		return (EReference) codeQLResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeQLResultingValues_SecurityLevel() {
		return (EReference) codeQLResultingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeQLResultingValues_SystemElements() {
		return (EReference) codeQLResultingValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeQLResultingValues_Configurations() {
		return (EReference) codeQLResultingValuesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterIdentificiation_CodeQLResultingValues() {
		return parameterIdentificiation_CodeQLResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentificiation_CodeQLResultingValues_ParameterName() {
		return (EAttribute) parameterIdentificiation_CodeQLResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentificiation_CodeQLResultingValues_ParameterType() {
		return (EAttribute) parameterIdentificiation_CodeQLResultingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentificiation_CodeQLResultingValues_MethodName() {
		return (EAttribute) parameterIdentificiation_CodeQLResultingValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterIdentificiation_CodeQLResultingValues_FullyQualifiedClassName() {
		return (EAttribute) parameterIdentificiation_CodeQLResultingValuesEClass.getEStructuralFeatures().get(3);
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
	public EReference getResultingValue_ResultingSecurityLevel() {
		return (EReference) resultingValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultingValue_Parameter() {
		return (EReference) resultingValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultingValue_Configuration() {
		return (EReference) resultingValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityLevel_ResultingValues() {
		return securityLevel_ResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationID_ResultingValues() {
		return configurationID_ResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationID_ResultingValues_Id() {
		return (EAttribute) configurationID_ResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlresultingvaluesFactory getCodeqlresultingvaluesFactory() {
		return (CodeqlresultingvaluesFactory) getEFactoryInstance();
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
		codeQLResultingValuesEClass = createEClass(CODE_QL_RESULTING_VALUES);
		createEReference(codeQLResultingValuesEClass, CODE_QL_RESULTING_VALUES__RESULTING_VALUES);
		createEReference(codeQLResultingValuesEClass, CODE_QL_RESULTING_VALUES__SECURITY_LEVEL);
		createEReference(codeQLResultingValuesEClass, CODE_QL_RESULTING_VALUES__SYSTEM_ELEMENTS);
		createEReference(codeQLResultingValuesEClass, CODE_QL_RESULTING_VALUES__CONFIGURATIONS);

		parameterIdentificiation_CodeQLResultingValuesEClass = createEClass(
				PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES);
		createEAttribute(parameterIdentificiation_CodeQLResultingValuesEClass,
				PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_NAME);
		createEAttribute(parameterIdentificiation_CodeQLResultingValuesEClass,
				PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_TYPE);
		createEAttribute(parameterIdentificiation_CodeQLResultingValuesEClass,
				PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__METHOD_NAME);
		createEAttribute(parameterIdentificiation_CodeQLResultingValuesEClass,
				PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME);

		resultingValueEClass = createEClass(RESULTING_VALUE);
		createEReference(resultingValueEClass, RESULTING_VALUE__RESULTING_SECURITY_LEVEL);
		createEReference(resultingValueEClass, RESULTING_VALUE__PARAMETER);
		createEReference(resultingValueEClass, RESULTING_VALUE__CONFIGURATION);

		securityLevel_ResultingValuesEClass = createEClass(SECURITY_LEVEL_RESULTING_VALUES);

		configurationID_ResultingValuesEClass = createEClass(CONFIGURATION_ID_RESULTING_VALUES);
		createEAttribute(configurationID_ResultingValuesEClass, CONFIGURATION_ID_RESULTING_VALUES__ID);
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
		securityLevel_ResultingValuesEClass.getESuperTypes().add(theIdentifierPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(codeQLResultingValuesEClass, CodeQLResultingValues.class, "CodeQLResultingValues", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeQLResultingValues_ResultingValues(), this.getResultingValue(), null, "resultingValues",
				null, 0, -1, CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeQLResultingValues_SecurityLevel(), this.getSecurityLevel_ResultingValues(), null,
				"securityLevel", null, 0, -1, CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeQLResultingValues_SystemElements(),
				this.getParameterIdentificiation_CodeQLResultingValues(), null, "systemElements", null, 0, -1,
				CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeQLResultingValues_Configurations(), this.getConfigurationID_ResultingValues(), null,
				"configurations", null, 0, -1, CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterIdentificiation_CodeQLResultingValuesEClass,
				ParameterIdentificiation_CodeQLResultingValues.class, "ParameterIdentificiation_CodeQLResultingValues",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterIdentificiation_CodeQLResultingValues_ParameterName(), ecorePackage.getEString(),
				"ParameterName", null, 1, 1, ParameterIdentificiation_CodeQLResultingValues.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentificiation_CodeQLResultingValues_ParameterType(), ecorePackage.getEString(),
				"parameterType", null, 1, 1, ParameterIdentificiation_CodeQLResultingValues.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentificiation_CodeQLResultingValues_MethodName(), ecorePackage.getEString(),
				"methodName", null, 1, 1, ParameterIdentificiation_CodeQLResultingValues.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterIdentificiation_CodeQLResultingValues_FullyQualifiedClassName(),
				ecorePackage.getEString(), "fullyQualifiedClassName", null, 1, 1,
				ParameterIdentificiation_CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultingValueEClass, ResultingValue.class, "ResultingValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultingValue_ResultingSecurityLevel(), this.getSecurityLevel_ResultingValues(), null,
				"resultingSecurityLevel", null, 1, 1, ResultingValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultingValue_Parameter(), this.getParameterIdentificiation_CodeQLResultingValues(), null,
				"parameter", null, 1, 1, ResultingValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultingValue_Configuration(), this.getConfigurationID_ResultingValues(), null,
				"configuration", null, 1, 1, ResultingValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityLevel_ResultingValuesEClass, SecurityLevel_ResultingValues.class,
				"SecurityLevel_ResultingValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationID_ResultingValuesEClass, ConfigurationID_ResultingValues.class,
				"ConfigurationID_ResultingValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationID_ResultingValues_Id(), ecorePackage.getEString(), "id", null, 1, 1,
				ConfigurationID_ResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeqlresultingvaluesPackageImpl
