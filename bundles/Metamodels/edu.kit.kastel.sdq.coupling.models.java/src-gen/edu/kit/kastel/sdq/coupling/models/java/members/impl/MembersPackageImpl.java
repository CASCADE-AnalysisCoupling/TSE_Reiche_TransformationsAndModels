/**
 */
package edu.kit.kastel.sdq.coupling.models.java.members.impl;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;

import edu.kit.kastel.sdq.coupling.models.java.impl.JavaPackageImpl;

import edu.kit.kastel.sdq.coupling.models.java.members.Annotatable;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.members.MembersFactory;
import edu.kit.kastel.sdq.coupling.models.java.members.MembersPackage;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

import edu.kit.kastel.sdq.coupling.models.java.types.TypesPackage;

import edu.kit.kastel.sdq.coupling.models.java.types.impl.TypesPackageImpl;

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
public class MembersPackageImpl extends EPackageImpl implements MembersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatableEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.java.members.MembersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MembersPackageImpl() {
		super(eNS_URI, MembersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MembersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MembersPackage init() {
		if (isInited) return (MembersPackage)EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMembersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MembersPackageImpl theMembersPackage = registeredMembersPackage instanceof MembersPackageImpl ? (MembersPackageImpl)registeredMembersPackage : new MembersPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(registeredPackage instanceof JavaPackageImpl ? registeredPackage : JavaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theMembersPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theMembersPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMembersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MembersPackage.eNS_URI, theMembersPackage);
		return theMembersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Returntype() {
		return (EReference)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Parameter() {
		return (EReference)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatable() {
		return annotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersFactory getMembersFactory() {
		return (MembersFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fieldEClass = createEClass(FIELD);

		methodEClass = createEClass(METHOD);
		createEReference(methodEClass, METHOD__RETURNTYPE);
		createEReference(methodEClass, METHOD__PARAMETER);

		parameterEClass = createEClass(PARAMETER);

		annotatableEClass = createEClass(ANNOTATABLE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fieldEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
		fieldEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		fieldEClass.getESuperTypes().add(this.getAnnotatable());
		methodEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		methodEClass.getESuperTypes().add(this.getAnnotatable());
		parameterEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		parameterEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
		parameterEClass.getESuperTypes().add(this.getAnnotatable());

		// Initialize classes, features, and operations; add parameters
		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethod_Returntype(), theTypesPackage.getType(), null, "returntype", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotatableEClass, Annotatable.class, "Annotatable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //MembersPackageImpl
