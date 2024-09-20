/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;
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
	private EClass correspondences_CodeQLScarEClass = null;

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
		ConfigurationrepresentationPackage.eINSTANCE.eClass();
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
	public EClass getCorrespondences_CodeQLScar() {
		return correspondences_CodeQLScarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_CodeQLScar_SystemElementCorrespondences() {
		return (EReference) correspondences_CodeQLScarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_CodeQLScar_SecurityLevelCorrespondences() {
		return (EReference) correspondences_CodeQLScarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondences_CodeQLScar_ConfigurationCorrespondences() {
		return (EReference) correspondences_CodeQLScarEClass.getEStructuralFeatures().get(2);
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
	public EReference getConfigurationCorrespondence_Configuration_CodeQL() {
		return (EReference) configurationCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationCorrespondence_Configuration_SCAR() {
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
	public EReference getSecurityLevelCorrespondence_SecurityLevel_CodeQL() {
		return (EReference) securityLevelCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityLevelCorrespondence_SecurityLevel_SCAR() {
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
	public EReference getParameterCorrespondence_Parameter_Java() {
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
	public EReference getFieldCorrespondence_Field_Java() {
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
		correspondences_CodeQLScarEClass = createEClass(CORRESPONDENCES_CODE_QL_SCAR);
		createEReference(correspondences_CodeQLScarEClass,
				CORRESPONDENCES_CODE_QL_SCAR__SYSTEM_ELEMENT_CORRESPONDENCES);
		createEReference(correspondences_CodeQLScarEClass,
				CORRESPONDENCES_CODE_QL_SCAR__SECURITY_LEVEL_CORRESPONDENCES);
		createEReference(correspondences_CodeQLScarEClass, CORRESPONDENCES_CODE_QL_SCAR__CONFIGURATION_CORRESPONDENCES);

		configurationCorrespondenceEClass = createEClass(CONFIGURATION_CORRESPONDENCE);
		createEReference(configurationCorrespondenceEClass, CONFIGURATION_CORRESPONDENCE__CONFIGURATION_CODE_QL);
		createEReference(configurationCorrespondenceEClass, CONFIGURATION_CORRESPONDENCE__CONFIGURATION_SCAR);

		securityLevelCorrespondenceEClass = createEClass(SECURITY_LEVEL_CORRESPONDENCE);
		createEReference(securityLevelCorrespondenceEClass, SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_CODE_QL);
		createEReference(securityLevelCorrespondenceEClass, SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL_SCAR);

		parameterCorrespondenceEClass = createEClass(PARAMETER_CORRESPONDENCE);
		createEReference(parameterCorrespondenceEClass, PARAMETER_CORRESPONDENCE__PARAMETER_JAVA);
		createEReference(parameterCorrespondenceEClass, PARAMETER_CORRESPONDENCE__PARAMETER_SCAR);

		fieldCorrespondenceEClass = createEClass(FIELD_CORRESPONDENCE);
		createEReference(fieldCorrespondenceEClass, FIELD_CORRESPONDENCE__FIELD_JAVA);
		createEReference(fieldCorrespondenceEClass, FIELD_CORRESPONDENCE__FIELD_SCAR);

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
		ConfigurationrepresentationPackage theConfigurationrepresentationPackage = (ConfigurationrepresentationPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationrepresentationPackage.eNS_URI);
		CodeqlscarPackage theCodeqlscarPackage = (CodeqlscarPackage) EPackage.Registry.INSTANCE
				.getEPackage(CodeqlscarPackage.eNS_URI);
		TainttrackingPackage theTainttrackingPackage = (TainttrackingPackage) EPackage.Registry.INSTANCE
				.getEPackage(TainttrackingPackage.eNS_URI);
		MembersPackage theMembersPackage = (MembersPackage) EPackage.Registry.INSTANCE
				.getEPackage(MembersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterCorrespondenceEClass.getESuperTypes().add(this.getSystemElementCorrespondence());
		fieldCorrespondenceEClass.getESuperTypes().add(this.getSystemElementCorrespondence());

		// Initialize classes, features, and operations; add parameters
		initEClass(correspondences_CodeQLScarEClass, Correspondences_CodeQLScar.class, "Correspondences_CodeQLScar",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrespondences_CodeQLScar_SystemElementCorrespondences(),
				this.getSystemElementCorrespondence(), null, "systemElementCorrespondences", null, 0, -1,
				Correspondences_CodeQLScar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_CodeQLScar_SecurityLevelCorrespondences(),
				this.getSecurityLevelCorrespondence(), null, "securityLevelCorrespondences", null, 0, -1,
				Correspondences_CodeQLScar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondences_CodeQLScar_ConfigurationCorrespondences(),
				this.getConfigurationCorrespondence(), null, "configurationCorrespondences", null, 0, -1,
				Correspondences_CodeQLScar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationCorrespondenceEClass, ConfigurationCorrespondence.class, "ConfigurationCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationCorrespondence_Configuration_CodeQL(),
				theConfigurationrepresentationPackage.getHybridConfiguration(), null, "configuration_CodeQL", null, 1,
				1, ConfigurationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationCorrespondence_Configuration_SCAR(), theCodeqlscarPackage.getRuleId(), null,
				"configuration_SCAR", null, 1, 1, ConfigurationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityLevelCorrespondenceEClass, SecurityLevelCorrespondence.class, "SecurityLevelCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityLevelCorrespondence_SecurityLevel_CodeQL(),
				theTainttrackingPackage.getSecurityLevel(), null, "securityLevel_CodeQL", null, 1, 1,
				SecurityLevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityLevelCorrespondence_SecurityLevel_SCAR(),
				theCodeqlscarPackage.getSecurityLevel_SCAR(), null, "securityLevel_SCAR", null, 1, 1,
				SecurityLevelCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCorrespondenceEClass, ParameterCorrespondence.class, "ParameterCorrespondence",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCorrespondence_Parameter_Java(), theMembersPackage.getParameter(), null,
				"parameter_Java", null, 1, 1, ParameterCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCorrespondence_Parameter_SCAR(), theCodeqlscarPackage.getParameter_SCAR(), null,
				"parameter_SCAR", null, 1, 1, ParameterCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldCorrespondenceEClass, FieldCorrespondence.class, "FieldCorrespondence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldCorrespondence_Field_Java(), theMembersPackage.getField(), null, "field_Java", null, 1,
				1, FieldCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldCorrespondence_Field_SCAR(), theCodeqlscarPackage.getField_SCAR(), null, "field_SCAR",
				null, 1, 1, FieldCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemElementCorrespondenceEClass, SystemElementCorrespondence.class, "SystemElementCorrespondence",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeqlscarcorrespondencesPackageImpl
