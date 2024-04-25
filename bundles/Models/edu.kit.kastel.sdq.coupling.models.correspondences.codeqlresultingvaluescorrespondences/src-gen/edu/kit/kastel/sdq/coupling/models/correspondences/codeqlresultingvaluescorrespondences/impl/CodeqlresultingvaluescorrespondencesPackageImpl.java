/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues;

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
	private EClass correspondences_CodeQLResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityLevelCorrespondence_CodeQLResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationCorrespondence_CodeQLResultingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCorrespondence_CodeQLResultingValuesEClass = null;

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
	public EClass getCorrespondences_CodeQLResultingValues() {
		return correspondences_CodeQLResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_CodeQLResultingValues_SecurityLevelCorrespondences() {
		return (EReference) correspondences_CodeQLResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_CodeQLResultingValues_ConfigurationCorrespondences() {
		return (EReference) correspondences_CodeQLResultingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_CodeQLResultingValues_ParameterCorrespondences() {
		return (EReference) correspondences_CodeQLResultingValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityLevelCorrespondence_CodeQLResultingValues() {
		return securityLevelCorrespondence_CodeQLResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityLevelCorrespondence_CodeQLResultingValues_SecurityLevel_CodeQL() {
		return (EReference) securityLevelCorrespondence_CodeQLResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityLevelCorrespondence_CodeQLResultingValues_SecurityLevel_CodeQLResultingValues() {
		return (EReference) securityLevelCorrespondence_CodeQLResultingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationCorrespondence_CodeQLResultingValues() {
		return configurationCorrespondence_CodeQLResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationCorrespondence_CodeQLResultingValues_Configuration_SCAR() {
		return (EReference) configurationCorrespondence_CodeQLResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationCorrespondence_CodeQLResultingValues_Configuration_ResultingValues() {
		return (EReference) configurationCorrespondence_CodeQLResultingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCorrespondence_CodeQLResultingValues() {
		return parameterCorrespondence_CodeQLResultingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_CodeQLResultingValues_Parameter_SCAR() {
		return (EReference) parameterCorrespondence_CodeQLResultingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_CodeQLResultingValues_Parameter_ResultingValues() {
		return (EReference) parameterCorrespondence_CodeQLResultingValuesEClass.getEStructuralFeatures().get(1);
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
		correspondences_CodeQLResultingValuesEClass = createEClass(CORRESPONDENCES_CODE_QL_RESULTING_VALUES);
		createEReference(correspondences_CodeQLResultingValuesEClass,
				CORRESPONDENCES_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CORRESPONDENCES);
		createEReference(correspondences_CodeQLResultingValuesEClass,
				CORRESPONDENCES_CODE_QL_RESULTING_VALUES__CONFIGURATION_CORRESPONDENCES);
		createEReference(correspondences_CodeQLResultingValuesEClass,
				CORRESPONDENCES_CODE_QL_RESULTING_VALUES__PARAMETER_CORRESPONDENCES);

		securityLevelCorrespondence_CodeQLResultingValuesEClass = createEClass(
				SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES);
		createEReference(securityLevelCorrespondence_CodeQLResultingValuesEClass,
				SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL);
		createEReference(securityLevelCorrespondence_CodeQLResultingValuesEClass,
				SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CODE_QL_RESULTING_VALUES);

		configurationCorrespondence_CodeQLResultingValuesEClass = createEClass(
				CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES);
		createEReference(configurationCorrespondence_CodeQLResultingValuesEClass,
				CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_SCAR);
		createEReference(configurationCorrespondence_CodeQLResultingValuesEClass,
				CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_RESULTING_VALUES);

		parameterCorrespondence_CodeQLResultingValuesEClass = createEClass(
				PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES);
		createEReference(parameterCorrespondence_CodeQLResultingValuesEClass,
				PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_SCAR);
		createEReference(parameterCorrespondence_CodeQLResultingValuesEClass,
				PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__PARAMETER_RESULTING_VALUES);
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
		initEClass(correspondences_CodeQLResultingValuesEClass, Correspondences_CodeQLResultingValues.class,
				"Correspondences_CodeQLResultingValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrespondences_CodeQLResultingValues_SecurityLevelCorrespondences(),
				this.getSecurityLevelCorrespondence_CodeQLResultingValues(), null, "securityLevelCorrespondences", null,
				0, -1, Correspondences_CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_CodeQLResultingValues_ConfigurationCorrespondences(),
				this.getConfigurationCorrespondence_CodeQLResultingValues(), null, "configurationCorrespondences", null,
				0, -1, Correspondences_CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_CodeQLResultingValues_ParameterCorrespondences(),
				this.getParameterCorrespondence_CodeQLResultingValues(), null, "parameterCorrespondences", null, 0, -1,
				Correspondences_CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityLevelCorrespondence_CodeQLResultingValuesEClass,
				SecurityLevelCorrespondence_CodeQLResultingValues.class,
				"SecurityLevelCorrespondence_CodeQLResultingValues", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityLevelCorrespondence_CodeQLResultingValues_SecurityLevel_CodeQL(),
				theTainttrackingPackage.getSecurityLevel(), null, "securityLevel_CodeQL", null, 1, 1,
				SecurityLevelCorrespondence_CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityLevelCorrespondence_CodeQLResultingValues_SecurityLevel_CodeQLResultingValues(),
				theCodeqlresultingvaluesPackage.getSecurityLevel_ResultingValues(), null,
				"securityLevel_CodeQLResultingValues", null, 1, 1,
				SecurityLevelCorrespondence_CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationCorrespondence_CodeQLResultingValuesEClass,
				ConfigurationCorrespondence_CodeQLResultingValues.class,
				"ConfigurationCorrespondence_CodeQLResultingValues", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationCorrespondence_CodeQLResultingValues_Configuration_SCAR(),
				theCodeqlscarPackage.getConfigurationID_SCAR(), null, "configuration_SCAR", null, 1, 1,
				ConfigurationCorrespondence_CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationCorrespondence_CodeQLResultingValues_Configuration_ResultingValues(),
				theCodeqlresultingvaluesPackage.getConfigurationID_ResultingValues(), null,
				"configuration_ResultingValues", null, 1, 1, ConfigurationCorrespondence_CodeQLResultingValues.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCorrespondence_CodeQLResultingValuesEClass,
				ParameterCorrespondence_CodeQLResultingValues.class, "ParameterCorrespondence_CodeQLResultingValues",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCorrespondence_CodeQLResultingValues_Parameter_SCAR(),
				theCodeqlscarPackage.getParameterIdentification(), null, "parameter_SCAR", null, 1, 1,
				ParameterCorrespondence_CodeQLResultingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCorrespondence_CodeQLResultingValues_Parameter_ResultingValues(),
				theCodeqlresultingvaluesPackage.getParameterIdentificiation_CodeQLResultingValues(), null,
				"parameter_ResultingValues", null, 1, 1, ParameterCorrespondence_CodeQLResultingValues.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeqlresultingvaluescorrespondencesPackageImpl
