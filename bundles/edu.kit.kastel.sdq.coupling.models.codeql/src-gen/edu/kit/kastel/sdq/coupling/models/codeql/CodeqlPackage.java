/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql;

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
 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeqlFactory
 * @model kind="package"
 * @generated
 */
public interface CodeqlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codeql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codeql";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codeql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeqlPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeqlPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeQLRootImpl <em>Code QL Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeQLRootImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeqlPackageImpl#getCodeQLRoot()
	 * @generated
	 */
	int CODE_QL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Code Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QL_ROOT__CODE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Data Flow Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QL_ROOT__DATA_FLOW_ROOT = 1;

	/**
	 * The number of structural features of the '<em>Code QL Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QL_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Code QL Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_QL_ROOT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot <em>Code QL Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code QL Root</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot
	 * @generated
	 */
	EClass getCodeQLRoot();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot#getCodeRoot <em>Code Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code Root</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot#getCodeRoot()
	 * @see #getCodeQLRoot()
	 * @generated
	 */
	EReference getCodeQLRoot_CodeRoot();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot#getDataFlowRoot <em>Data Flow Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Flow Root</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot#getDataFlowRoot()
	 * @see #getCodeQLRoot()
	 * @generated
	 */
	EReference getCodeQLRoot_DataFlowRoot();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeqlFactory getCodeqlFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeQLRootImpl <em>Code QL Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeQLRootImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeqlPackageImpl#getCodeQLRoot()
		 * @generated
		 */
		EClass CODE_QL_ROOT = eINSTANCE.getCodeQLRoot();

		/**
		 * The meta object literal for the '<em><b>Code Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_QL_ROOT__CODE_ROOT = eINSTANCE.getCodeQLRoot_CodeRoot();

		/**
		 * The meta object literal for the '<em><b>Data Flow Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_QL_ROOT__DATA_FLOW_ROOT = eINSTANCE.getCodeQLRoot_DataFlowRoot();

	}

} //CodeqlPackage
