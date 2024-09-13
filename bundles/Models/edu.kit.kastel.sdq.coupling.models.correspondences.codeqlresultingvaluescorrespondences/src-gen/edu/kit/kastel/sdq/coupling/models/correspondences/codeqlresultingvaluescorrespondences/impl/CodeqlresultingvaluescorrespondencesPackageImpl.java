/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;

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
public class CodeqlresultingvaluescorrespondencesPackageImpl extends EPackageImpl
		implements CodeqlresultingvaluescorrespondencesPackage {
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
	private EClass securityLevelCorrespondence_ResolvedImplementationValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationCorrespondence_ResolvedImplementationValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCorrespondence_ResolvedImplementationValuesEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodeqlresultingvaluescorrespondencesPackageImpl() {
		super(eNS_URI, CodeqlresultingvaluescorrespondencesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodeqlresultingvaluescorrespondencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodeqlresultingvaluescorrespondencesPackage init() {
		if (isInited)
			return (CodeqlresultingvaluescorrespondencesPackage) EPackage.Registry.INSTANCE
					.getEPackage(CodeqlresultingvaluescorrespondencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCodeqlresultingvaluescorrespondencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CodeqlresultingvaluescorrespondencesPackageImpl theCodeqlresultingvaluescorrespondencesPackage = registeredCodeqlresultingvaluescorrespondencesPackage instanceof CodeqlresultingvaluescorrespondencesPackageImpl
				? (CodeqlresultingvaluescorrespondencesPackageImpl) registeredCodeqlresultingvaluescorrespondencesPackage
				: new CodeqlresultingvaluescorrespondencesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CodeqlPackage.eINSTANCE.eClass();
		CodeqlresultingvaluesPackage.eINSTANCE.eClass();
		CodeqlscarPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCodeqlresultingvaluescorrespondencesPackage.createPackageContents();

		// Initialize created meta-data
		theCodeqlresultingvaluescorrespondencesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodeqlresultingvaluescorrespondencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodeqlresultingvaluescorrespondencesPackage.eNS_URI,
				theCodeqlresultingvaluescorrespondencesPackage);
		return theCodeqlresultingvaluescorrespondencesPackage;
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
	public EReference getCorrespondences_ResolvedImplementationValues_SecurityLevelCorrespondences() {
		return (EReference) correspondences_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_ResolvedImplementationValues_ConfigurationCorrespondences() {
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
	public EClass getSecurityLevelCorrespondence_ResolvedImplementationValues() {
		return securityLevelCorrespondence_ResolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityLevelCorrespondence_ResolvedImplementationValues_SecurityLevel_CodeQL() {
		return (EReference) securityLevelCorrespondence_ResolvedImplementationValuesEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityLevelCorrespondence_ResolvedImplementationValues_SecurityLevel_ResolvedImplementationValues() {
		return (EReference) securityLevelCorrespondence_ResolvedImplementationValuesEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationCorrespondence_ResolvedImplementationValues() {
		return configurationCorrespondence_ResolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationCorrespondence_ResolvedImplementationValues_Configuration_SCAR() {
		return (EReference) configurationCorrespondence_ResolvedImplementationValuesEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationCorrespondence_ResolvedImplementationValues_Configuration_ResultingValues() {
		return (EReference) configurationCorrespondence_ResolvedImplementationValuesEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCorrespondence_ResolvedImplementationValues() {
		return parameterCorrespondence_ResolvedImplementationValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_ResolvedImplementationValues_Parameter_SCAR() {
		return (EReference) parameterCorrespondence_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_ResolvedImplementationValues_Parameter_ResolvedImplementationValues() {
		return (EReference) parameterCorrespondence_ResolvedImplementationValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlresultingvaluescorrespondencesFactory getCodeqlresultingvaluescorrespondencesFactory() {
		return (CodeqlresultingvaluescorrespondencesFactory) getEFactoryInstance();
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
				CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CORRESPONDENCES);
		createEReference(correspondences_ResolvedImplementationValuesEClass,
				CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_CORRESPONDENCES);
		createEReference(correspondences_ResolvedImplementationValuesEClass,
				CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_CORRESPONDENCES);

		securityLevelCorrespondence_ResolvedImplementationValuesEClass = createEClass(
				SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES);
		createEReference(securityLevelCorrespondence_ResolvedImplementationValuesEClass,
				SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CODE_QL);
		createEReference(securityLevelCorrespondence_ResolvedImplementationValuesEClass,
				SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES);

		configurationCorrespondence_ResolvedImplementationValuesEClass = createEClass(
				CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES);
		createEReference(configurationCorrespondence_ResolvedImplementationValuesEClass,
				CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_SCAR);
		createEReference(configurationCorrespondence_ResolvedImplementationValuesEClass,
				CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_RESULTING_VALUES);

		parameterCorrespondence_ResolvedImplementationValuesEClass = createEClass(
				PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES);
		createEReference(parameterCorrespondence_ResolvedImplementationValuesEClass,
				PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_SCAR);
		createEReference(parameterCorrespondence_ResolvedImplementationValuesEClass,
				PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_RESOLVED_IMPLEMENTATION_VALUES);
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
		TainttrackingPackage theTainttrackingPackage = (TainttrackingPackage) EPackage.Registry.INSTANCE
				.getEPackage(TainttrackingPackage.eNS_URI);
		CodeqlresultingvaluesPackage theCodeqlresultingvaluesPackage = (CodeqlresultingvaluesPackage) EPackage.Registry.INSTANCE
				.getEPackage(CodeqlresultingvaluesPackage.eNS_URI);
		CodeqlscarPackage theCodeqlscarPackage = (CodeqlscarPackage) EPackage.Registry.INSTANCE
				.getEPackage(CodeqlscarPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(correspondences_ResolvedImplementationValuesEClass,
				Correspondences_ResolvedImplementationValues.class, "Correspondences_ResolvedImplementationValues",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrespondences_ResolvedImplementationValues_SecurityLevelCorrespondences(),
				this.getSecurityLevelCorrespondence_ResolvedImplementationValues(), null,
				"securityLevelCorrespondences", null, 0, -1, Correspondences_ResolvedImplementationValues.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_ResolvedImplementationValues_ConfigurationCorrespondences(),
				this.getConfigurationCorrespondence_ResolvedImplementationValues(), null,
				"configurationCorrespondences", null, 0, -1, Correspondences_ResolvedImplementationValues.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_ResolvedImplementationValues_ParameterCorrespondences(),
				this.getParameterCorrespondence_ResolvedImplementationValues(), null, "parameterCorrespondences", null,
				0, -1, Correspondences_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityLevelCorrespondence_ResolvedImplementationValuesEClass,
				SecurityLevelCorrespondence_ResolvedImplementationValues.class,
				"SecurityLevelCorrespondence_ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityLevelCorrespondence_ResolvedImplementationValues_SecurityLevel_CodeQL(),
				theTainttrackingPackage.getSecurityLevel(), null, "securityLevel_CodeQL", null, 1, 1,
				SecurityLevelCorrespondence_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
				getSecurityLevelCorrespondence_ResolvedImplementationValues_SecurityLevel_ResolvedImplementationValues(),
				theCodeqlresultingvaluesPackage.getSecurityLevel_ResolvedImplementationValues(), null,
				"securityLevel_ResolvedImplementationValues", null, 1, 1,
				SecurityLevelCorrespondence_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationCorrespondence_ResolvedImplementationValuesEClass,
				ConfigurationCorrespondence_ResolvedImplementationValues.class,
				"ConfigurationCorrespondence_ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationCorrespondence_ResolvedImplementationValues_Configuration_SCAR(),
				theCodeqlscarPackage.getRuleId(), null, "configuration_SCAR", null, 1, 1,
				ConfigurationCorrespondence_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationCorrespondence_ResolvedImplementationValues_Configuration_ResultingValues(),
				theCodeqlresultingvaluesPackage.getRuleId_ResolvedImplementationValue(), null,
				"configuration_ResultingValues", null, 1, 1,
				ConfigurationCorrespondence_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCorrespondence_ResolvedImplementationValuesEClass,
				ParameterCorrespondence_ResolvedImplementationValues.class,
				"ParameterCorrespondence_ResolvedImplementationValues", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCorrespondence_ResolvedImplementationValues_Parameter_SCAR(),
				theCodeqlscarPackage.getParameter_SCAR(), null, "parameter_SCAR", null, 1, 1,
				ParameterCorrespondence_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCorrespondence_ResolvedImplementationValues_Parameter_ResolvedImplementationValues(),
				theCodeqlresultingvaluesPackage.getParameter_ResolvedImplementationValues(), null,
				"parameter_ResolvedImplementationValues", null, 1, 1,
				ParameterCorrespondence_ResolvedImplementationValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeqlresultingvaluescorrespondencesPackageImpl
