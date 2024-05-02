/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlFactory;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl;

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
public class CodeqlPackageImpl extends EPackageImpl implements CodeqlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeQLRootEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodeqlPackageImpl() {
		super(eNS_URI, CodeqlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodeqlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodeqlPackage init() {
		if (isInited) return (CodeqlPackage)EPackage.Registry.INSTANCE.getEPackage(CodeqlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCodeqlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CodeqlPackageImpl theCodeqlPackage = registeredCodeqlPackage instanceof CodeqlPackageImpl ? (CodeqlPackageImpl)registeredCodeqlPackage : new CodeqlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TainttrackingPackage.eNS_URI);
		TainttrackingPackageImpl theTainttrackingPackage = (TainttrackingPackageImpl)(registeredPackage instanceof TainttrackingPackageImpl ? registeredPackage : TainttrackingPackage.eINSTANCE);

		// Create package meta-data objects
		theCodeqlPackage.createPackageContents();
		theTainttrackingPackage.createPackageContents();

		// Initialize created meta-data
		theCodeqlPackage.initializePackageContents();
		theTainttrackingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodeqlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodeqlPackage.eNS_URI, theCodeqlPackage);
		return theCodeqlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeQLRoot() {
		return codeQLRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeQLRoot_TainttrackingRoot() {
		return (EReference)codeQLRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlFactory getCodeqlFactory() {
		return (CodeqlFactory)getEFactoryInstance();
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
		codeQLRootEClass = createEClass(CODE_QL_ROOT);
		createEReference(codeQLRootEClass, CODE_QL_ROOT__TAINTTRACKING_ROOT);
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
		TainttrackingPackage theTainttrackingPackage = (TainttrackingPackage)EPackage.Registry.INSTANCE.getEPackage(TainttrackingPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTainttrackingPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(codeQLRootEClass, CodeQLRoot.class, "CodeQLRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeQLRoot_TainttrackingRoot(), theTainttrackingPackage.getTainttrackingRoot(), null, "tainttrackingRoot", null, 1, 1, CodeQLRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeqlPackageImpl
