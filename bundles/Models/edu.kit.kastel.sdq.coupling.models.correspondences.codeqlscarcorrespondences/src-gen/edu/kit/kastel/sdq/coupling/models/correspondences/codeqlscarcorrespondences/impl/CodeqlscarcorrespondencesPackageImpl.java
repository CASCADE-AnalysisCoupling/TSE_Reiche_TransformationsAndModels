/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SystemElementCorrespondence;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;

import edu.kit.kastel.sdq.coupling.models.java.members.MembersPackage;

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
public class CodeqlscarcorrespondencesPackageImpl extends EPackageImpl implements CodeqlscarcorrespondencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeQLSCARCorrespondencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityLevelCorrespondenceEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemElementCorrespondenceEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodeqlscarcorrespondencesPackageImpl() {
		super(eNS_URI, CodeqlscarcorrespondencesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodeqlscarcorrespondencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodeqlscarcorrespondencesPackage init() {
		if (isInited)
			return (CodeqlscarcorrespondencesPackage) EPackage.Registry.INSTANCE
					.getEPackage(CodeqlscarcorrespondencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCodeqlscarcorrespondencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CodeqlscarcorrespondencesPackageImpl theCodeqlscarcorrespondencesPackage = registeredCodeqlscarcorrespondencesPackage instanceof CodeqlscarcorrespondencesPackageImpl
				? (CodeqlscarcorrespondencesPackageImpl) registeredCodeqlscarcorrespondencesPackage
				: new CodeqlscarcorrespondencesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CodeqlPackage.eINSTANCE.eClass();
		CodeqlscarPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCodeqlscarcorrespondencesPackage.createPackageContents();

		// Initialize created meta-data
		theCodeqlscarcorrespondencesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodeqlscarcorrespondencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodeqlscarcorrespondencesPackage.eNS_URI, theCodeqlscarcorrespondencesPackage);
		return theCodeqlscarcorrespondencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeQLSCARCorrespondences() {
		return codeQLSCARCorrespondencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeQLSCARCorrespondences_SystemElementCorrespondences() {
		return (EReference) codeQLSCARCorrespondencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeQLSCARCorrespondences_SecurityLevelCorrespondences() {
		return (EReference) codeQLSCARCorrespondencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeQLSCARCorrespondences_ConfigurationCorrespondences() {
		return (EReference) codeQLSCARCorrespondencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationCorrespondence() {
		return configurationCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationCorrespondence_CodeQLConfig() {
		return (EReference) configurationCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationCorrespondence_CodeQLSCARConfig() {
		return (EReference) configurationCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityLevelCorrespondence() {
		return securityLevelCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityLevelCorrespondence_CodeQLSecurityLevel() {
		return (EReference) securityLevelCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityLevelCorrespondence_CodeQLSCARSecurityLevel() {
		return (EReference) securityLevelCorrespondenceEClass.getEStructuralFeatures().get(1);
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
	public EReference getParameterCorrespondence_JavaParameter() {
		return (EReference) parameterCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_ScarParameter() {
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
	public EReference getFieldCorrespondence_JavaField() {
		return (EReference) fieldCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldCorrespondence_ScarField() {
		return (EReference) fieldCorrespondenceEClass.getEStructuralFeatures().get(1);
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
	public CodeqlscarcorrespondencesFactory getCodeqlscarcorrespondencesFactory() {
		return (CodeqlscarcorrespondencesFactory) getEFactoryInstance();
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
		codeQLSCARCorrespondencesEClass = createEClass(CODE_QLSCAR_CORRESPONDENCES);
		createEReference(codeQLSCARCorrespondencesEClass, CODE_QLSCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES);
		createEReference(codeQLSCARCorrespondencesEClass, CODE_QLSCAR_CORRESPONDENCES__SECURITY_LEVEL_CORRESPONDENCES);
		createEReference(codeQLSCARCorrespondencesEClass, CODE_QLSCAR_CORRESPONDENCES__CONFIGURATION_CORRESPONDENCES);

		configurationCorrespondenceEClass = createEClass(CONFIGURATION_CORRESPONDENCE);
		createEReference(configurationCorrespondenceEClass, CONFIGURATION_CORRESPONDENCE__CODE_QL_CONFIG);
		createEReference(configurationCorrespondenceEClass, CONFIGURATION_CORRESPONDENCE__CODE_QLSCAR_CONFIG);

		securityLevelCorrespondenceEClass = createEClass(SECURITY_LEVEL_CORRESPONDENCE);
		createEReference(securityLevelCorrespondenceEClass, SECURITY_LEVEL_CORRESPONDENCE__CODE_QL_SECURITY_LEVEL);
		createEReference(securityLevelCorrespondenceEClass, SECURITY_LEVEL_CORRESPONDENCE__CODE_QLSCAR_SECURITY_LEVEL);

		parameterCorrespondenceEClass = createEClass(PARAMETER_CORRESPONDENCE);
		createEReference(parameterCorrespondenceEClass, PARAMETER_CORRESPONDENCE__JAVA_PARAMETER);
		createEReference(parameterCorrespondenceEClass, PARAMETER_CORRESPONDENCE__SCAR_PARAMETER);

		fieldCorrespondenceEClass = createEClass(FIELD_CORRESPONDENCE);
		createEReference(fieldCorrespondenceEClass, FIELD_CORRESPONDENCE__JAVA_FIELD);
		createEReference(fieldCorrespondenceEClass, FIELD_CORRESPONDENCE__SCAR_FIELD);

		systemElementCorrespondenceEClass = createEClass(SYSTEM_ELEMENT_CORRESPONDENCE);
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
		CodeqlscarPackage theCodeqlscarPackage = (CodeqlscarPackage) EPackage.Registry.INSTANCE
				.getEPackage(CodeqlscarPackage.eNS_URI);
		MembersPackage theMembersPackage = (MembersPackage) EPackage.Registry.INSTANCE
				.getEPackage(MembersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterCorrespondenceEClass.getESuperTypes().add(this.getSystemElementCorrespondence());
		fieldCorrespondenceEClass.getESuperTypes().add(this.getSystemElementCorrespondence());

		// Initialize classes, features, and operations; add parameters
		initEClass(codeQLSCARCorrespondencesEClass, CodeQLSCARCorrespondences.class, "CodeQLSCARCorrespondences",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeQLSCARCorrespondences_SystemElementCorrespondences(),
				this.getSystemElementCorrespondence(), null, "systemElementCorrespondences", null, 0, -1,
				CodeQLSCARCorrespondences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeQLSCARCorrespondences_SecurityLevelCorrespondences(),
				this.getSecurityLevelCorrespondence(), null, "securityLevelCorrespondences", null, 0, -1,
				CodeQLSCARCorrespondences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeQLSCARCorrespondences_ConfigurationCorrespondences(),
				this.getConfigurationCorrespondence(), null, "configurationCorrespondences", null, 0, -1,
				CodeQLSCARCorrespondences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationCorrespondenceEClass, ConfigurationCorrespondence.class, "ConfigurationCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationCorrespondence_CodeQLConfig(), theTainttrackingPackage.getConfiguration(), null,
				"codeQLConfig", null, 1, 1, ConfigurationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationCorrespondence_CodeQLSCARConfig(),
				theCodeqlscarPackage.getConfigurationID_SCAR(), null, "codeQLSCARConfig", null, 1, 1,
				ConfigurationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityLevelCorrespondenceEClass, SecurityLevelCorrespondence.class, "SecurityLevelCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityLevelCorrespondence_CodeQLSecurityLevel(), theTainttrackingPackage.getSecurityLevel(),
				null, "codeQLSecurityLevel", null, 1, 1, SecurityLevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityLevelCorrespondence_CodeQLSCARSecurityLevel(),
				theCodeqlscarPackage.getSecurityLevel_SCAR(), null, "codeQLSCARSecurityLevel", null, 1, 1,
				SecurityLevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCorrespondenceEClass, ParameterCorrespondence.class, "ParameterCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCorrespondence_JavaParameter(), theMembersPackage.getParameter(), null,
				"javaParameter", null, 1, 1, ParameterCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCorrespondence_ScarParameter(), theCodeqlscarPackage.getParameterIdentification(),
				null, "scarParameter", null, 1, 1, ParameterCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldCorrespondenceEClass, FieldCorrespondence.class, "FieldCorrespondence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldCorrespondence_JavaField(), theMembersPackage.getField(), null, "javaField", null, 1, 1,
				FieldCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldCorrespondence_ScarField(), theCodeqlscarPackage.getFieldIdentification(), null,
				"scarField", null, 1, 1, FieldCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemElementCorrespondenceEClass, SystemElementCorrespondence.class, "SystemElementCorrespondence",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeqlscarcorrespondencesPackageImpl
