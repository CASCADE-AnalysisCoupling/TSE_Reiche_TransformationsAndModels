/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesFactory;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;

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
	private EClass resolvedImplementationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityLevel_ResolvedImplementationValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleId_ResolvedImplementationValueEClass = null;

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
	public EClass getResolvedImplementationValues() {
		return resolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValues_ResultingValues() {
		return (EReference) resolvedImplementationValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValues_SecurityLevel() {
		return (EReference) resolvedImplementationValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValues_SystemElements() {
		return (EReference) resolvedImplementationValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValues_Configurations() {
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
	public EAttribute getParameter_ResolvedImplementationValues_ParameterName() {
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
	public EClass getResolvedImplementationValue() {
		return resolvedImplementationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValue_ResultingSecurityLevel() {
		return (EReference) resolvedImplementationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValue_Parameter() {
		return (EReference) resolvedImplementationValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedImplementationValue_RuleId() {
		return (EReference) resolvedImplementationValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityLevel_ResolvedImplementationValues() {
		return securityLevel_ResolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleId_ResolvedImplementationValue() {
		return ruleId_ResolvedImplementationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleId_ResolvedImplementationValue_Id() {
		return (EAttribute) ruleId_ResolvedImplementationValueEClass.getEStructuralFeatures().get(0);
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
		resolvedImplementationValuesEClass = createEClass(RESOLVED_IMPLEMENTATION_VALUES);
		createEReference(resolvedImplementationValuesEClass, RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES);
		createEReference(resolvedImplementationValuesEClass, RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL);
		createEReference(resolvedImplementationValuesEClass, RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS);
		createEReference(resolvedImplementationValuesEClass, RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATIONS);

		parameter_ResolvedImplementationValuesEClass = createEClass(PARAMETER_RESOLVED_IMPLEMENTATION_VALUES);
		createEAttribute(parameter_ResolvedImplementationValuesEClass,
				PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_NAME);
		createEAttribute(parameter_ResolvedImplementationValuesEClass,
				PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE);
		createEAttribute(parameter_ResolvedImplementationValuesEClass,
				PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME);
		createEAttribute(parameter_ResolvedImplementationValuesEClass,
				PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME);

		resolvedImplementationValueEClass = createEClass(RESOLVED_IMPLEMENTATION_VALUE);
		createEReference(resolvedImplementationValueEClass, RESOLVED_IMPLEMENTATION_VALUE__RESULTING_SECURITY_LEVEL);
		createEReference(resolvedImplementationValueEClass, RESOLVED_IMPLEMENTATION_VALUE__PARAMETER);
		createEReference(resolvedImplementationValueEClass, RESOLVED_IMPLEMENTATION_VALUE__RULE_ID);

		securityLevel_ResolvedImplementationValuesEClass = createEClass(SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES);

		ruleId_ResolvedImplementationValueEClass = createEClass(RULE_ID_RESOLVED_IMPLEMENTATION_VALUE);
		createEAttribute(ruleId_ResolvedImplementationValueEClass, RULE_ID_RESOLVED_IMPLEMENTATION_VALUE__ID);
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
		securityLevel_ResolvedImplementationValuesEClass.getESuperTypes().add(theIdentifierPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(resolvedImplementationValuesEClass, ResolvedImplementationValues.class,
				"ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolvedImplementationValues_ResultingValues(), this.getResolvedImplementationValue(), null,
				"resultingValues", null, 0, -1, ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedImplementationValues_SecurityLevel(),
				this.getSecurityLevel_ResolvedImplementationValues(), null, "securityLevel", null, 0, -1,
				ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedImplementationValues_SystemElements(),
				this.getParameter_ResolvedImplementationValues(), null, "systemElements", null, 0, -1,
				ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedImplementationValues_Configurations(), this.getRuleId_ResolvedImplementationValue(),
				null, "configurations", null, 0, -1, ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameter_ResolvedImplementationValuesEClass, Parameter_ResolvedImplementationValues.class,
				"Parameter_ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_ResolvedImplementationValues_ParameterName(), ecorePackage.getEString(),
				"ParameterName", null, 1, 1, Parameter_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
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

		initEClass(resolvedImplementationValueEClass, ResolvedImplementationValue.class, "ResolvedImplementationValue",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolvedImplementationValue_ResultingSecurityLevel(),
				this.getSecurityLevel_ResolvedImplementationValues(), null, "resultingSecurityLevel", null, 1, 1,
				ResolvedImplementationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedImplementationValue_Parameter(), this.getParameter_ResolvedImplementationValues(),
				null, "parameter", null, 1, 1, ResolvedImplementationValue.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedImplementationValue_RuleId(), this.getRuleId_ResolvedImplementationValue(), null,
				"ruleId", null, 1, 1, ResolvedImplementationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityLevel_ResolvedImplementationValuesEClass, SecurityLevel_ResolvedImplementationValues.class,
				"SecurityLevel_ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleId_ResolvedImplementationValueEClass, RuleId_ResolvedImplementationValue.class,
				"RuleId_ResolvedImplementationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleId_ResolvedImplementationValue_Id(), ecorePackage.getEString(), "id", null, 1, 1,
				RuleId_ResolvedImplementationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeqlresultingvaluesPackageImpl
