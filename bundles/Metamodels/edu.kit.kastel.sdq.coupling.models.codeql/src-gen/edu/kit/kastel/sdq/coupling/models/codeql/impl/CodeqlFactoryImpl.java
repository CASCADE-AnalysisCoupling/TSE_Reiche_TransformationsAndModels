/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeqlFactoryImpl extends EFactoryImpl implements CodeqlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeqlFactory init() {
		try {
			CodeqlFactory theCodeqlFactory = (CodeqlFactory)EPackage.Registry.INSTANCE.getEFactory(CodeqlPackage.eNS_URI);
			if (theCodeqlFactory != null) {
				return theCodeqlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeqlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CodeqlPackage.CODE_QL_ROOT: return createCodeQLRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeQLRoot createCodeQLRoot() {
		CodeQLRootImpl codeQLRoot = new CodeQLRootImpl();
		return codeQLRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlPackage getCodeqlPackage() {
		return (CodeqlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodeqlPackage getPackage() {
		return CodeqlPackage.eINSTANCE;
	}

} //CodeqlFactoryImpl
