/**
 */
package edu.kit.kastel.sdq.coupling.models.java;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.java.JavaFactory
 * @model kind="package"
 * @generated
 */
public interface JavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "java";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/java";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.java.impl.JavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.java.impl.JavaRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.java.impl.JavaRootImpl
	 * @see edu.kit.kastel.sdq.coupling.models.java.impl.JavaPackageImpl#getJavaRoot()
	 * @generated
	 */
	int JAVA_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Primitivetypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ROOT__PRIMITIVETYPES = 0;

	/**
	 * The feature id for the '<em><b>Collectiontypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ROOT__COLLECTIONTYPES = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ROOT__PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.java.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.java.impl.PackageImpl
	 * @see edu.kit.kastel.sdq.coupling.models.java.impl.JavaPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = IdentifierPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Subpackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUBPACKAGE = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classorinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASSORINTERFACE = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.java.JavaRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.java.JavaRoot
	 * @generated
	 */
	EClass getJavaRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.java.JavaRoot#getPrimitivetypes <em>Primitivetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitivetypes</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.java.JavaRoot#getPrimitivetypes()
	 * @see #getJavaRoot()
	 * @generated
	 */
	EReference getJavaRoot_Primitivetypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.java.JavaRoot#getCollectiontypes <em>Collectiontypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collectiontypes</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.java.JavaRoot#getCollectiontypes()
	 * @see #getJavaRoot()
	 * @generated
	 */
	EReference getJavaRoot_Collectiontypes();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.java.JavaRoot#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.java.JavaRoot#getPackage()
	 * @see #getJavaRoot()
	 * @generated
	 */
	EReference getJavaRoot_Package();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.java.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.java.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.java.Package#getSubpackage <em>Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpackage</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.java.Package#getSubpackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Subpackage();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.java.Package#getClassorinterface <em>Classorinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classorinterface</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.java.Package#getClassorinterface()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Classorinterface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaFactory getJavaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.java.impl.JavaRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.java.impl.JavaRootImpl
		 * @see edu.kit.kastel.sdq.coupling.models.java.impl.JavaPackageImpl#getJavaRoot()
		 * @generated
		 */
		EClass JAVA_ROOT = eINSTANCE.getJavaRoot();

		/**
		 * The meta object literal for the '<em><b>Primitivetypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ROOT__PRIMITIVETYPES = eINSTANCE.getJavaRoot_Primitivetypes();

		/**
		 * The meta object literal for the '<em><b>Collectiontypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ROOT__COLLECTIONTYPES = eINSTANCE.getJavaRoot_Collectiontypes();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ROOT__PACKAGE = eINSTANCE.getJavaRoot_Package();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.java.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.java.impl.PackageImpl
		 * @see edu.kit.kastel.sdq.coupling.models.java.impl.JavaPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Subpackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SUBPACKAGE = eINSTANCE.getPackage_Subpackage();

		/**
		 * The meta object literal for the '<em><b>Classorinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CLASSORINTERFACE = eINSTANCE.getPackage_Classorinterface();

	}

} //JavaPackage
