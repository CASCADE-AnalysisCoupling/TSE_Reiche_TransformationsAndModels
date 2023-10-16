/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.codeql.CodeqlPackage
 * @generated
 */
public interface CodeqlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeqlFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.codeql.impl.CodeqlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Code QL Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code QL Root</em>'.
	 * @generated
	 */
	CodeQLRoot createCodeQLRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodeqlPackage getCodeqlPackage();

} //CodeqlFactory
