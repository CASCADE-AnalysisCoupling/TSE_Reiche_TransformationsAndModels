/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.code.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeFactory;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CollectionType;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Field;
import edu.kit.kastel.sdq.coupling.models.codeql.code.FieldAccess;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Method;
import edu.kit.kastel.sdq.coupling.models.codeql.code.MethodAccess;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Parameter;
import edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveType;
import edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveTypeNames;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CodeFactoryImpl extends EFactoryImpl implements CodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeFactory init() {
		try {
			CodeFactory theCodeFactory = (CodeFactory) EPackage.Registry.INSTANCE.getEFactory(CodePackage.eNS_URI);
			if (theCodeFactory != null) {
				return theCodeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFactoryImpl() {
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
		case CodePackage.CLASS:
			return createClass();
		case CodePackage.METHOD:
			return createMethod();
		case CodePackage.PARAMETER:
			return createParameter();
		case CodePackage.PRIMITIVE_TYPE:
			return createPrimitiveType();
		case CodePackage.METHOD_ACCESS:
			return createMethodAccess();
		case CodePackage.FIELD_ACCESS:
			return createFieldAccess();
		case CodePackage.FIELD:
			return createField();
		case CodePackage.CODE_ROOT:
			return createCodeRoot();
		case CodePackage.COLLECTION_TYPE:
			return createCollectionType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CodePackage.PRIMITIVE_TYPE_NAMES:
			return createPrimitiveTypeNamesFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CodePackage.PRIMITIVE_TYPE_NAMES:
			return convertPrimitiveTypeNamesToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public edu.kit.kastel.sdq.coupling.models.codeql.code.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodAccess createMethodAccess() {
		MethodAccessImpl methodAccess = new MethodAccessImpl();
		return methodAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccess createFieldAccess() {
		FieldAccessImpl fieldAccess = new FieldAccessImpl();
		return fieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeRoot createCodeRoot() {
		CodeRootImpl codeRoot = new CodeRootImpl();
		return codeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeNames createPrimitiveTypeNamesFromString(EDataType eDataType, String initialValue) {
		PrimitiveTypeNames result = PrimitiveTypeNames.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeNamesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodePackage getCodePackage() {
		return (CodePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodePackage getPackage() {
		return CodePackage.eINSTANCE;
	}

} //CodeFactoryImpl
