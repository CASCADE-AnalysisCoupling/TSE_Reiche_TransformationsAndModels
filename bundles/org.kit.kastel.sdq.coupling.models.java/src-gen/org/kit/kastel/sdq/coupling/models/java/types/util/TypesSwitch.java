/**
 */
package org.kit.kastel.sdq.coupling.models.java.types.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.kit.kastel.sdq.coupling.models.identifier.Entity;
import org.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;
import org.kit.kastel.sdq.coupling.models.identifier.NamedElement;

import org.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import org.kit.kastel.sdq.coupling.models.java.types.CollectionType;
import org.kit.kastel.sdq.coupling.models.java.types.Interface;
import org.kit.kastel.sdq.coupling.models.java.types.PrimitiveType;
import org.kit.kastel.sdq.coupling.models.java.types.ReferenceType;
import org.kit.kastel.sdq.coupling.models.java.types.Type;
import org.kit.kastel.sdq.coupling.models.java.types.TypedElement;
import org.kit.kastel.sdq.coupling.models.java.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.kit.kastel.sdq.coupling.models.java.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TypesPackage.REFERENCE_TYPE: {
			ReferenceType referenceType = (ReferenceType) theEObject;
			T result = caseReferenceType(referenceType);
			if (result == null)
				result = caseType(referenceType);
			if (result == null)
				result = caseEntity(referenceType);
			if (result == null)
				result = caseIdentifiedElement(referenceType);
			if (result == null)
				result = caseNamedElement(referenceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypesPackage.CLASS_OR_INTERFACE_TYPE: {
			ClassOrInterfaceType classOrInterfaceType = (ClassOrInterfaceType) theEObject;
			T result = caseClassOrInterfaceType(classOrInterfaceType);
			if (result == null)
				result = caseReferenceType(classOrInterfaceType);
			if (result == null)
				result = caseType(classOrInterfaceType);
			if (result == null)
				result = caseEntity(classOrInterfaceType);
			if (result == null)
				result = caseIdentifiedElement(classOrInterfaceType);
			if (result == null)
				result = caseNamedElement(classOrInterfaceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypesPackage.PRIMITIVE_TYPE: {
			PrimitiveType primitiveType = (PrimitiveType) theEObject;
			T result = casePrimitiveType(primitiveType);
			if (result == null)
				result = caseType(primitiveType);
			if (result == null)
				result = caseEntity(primitiveType);
			if (result == null)
				result = caseIdentifiedElement(primitiveType);
			if (result == null)
				result = caseNamedElement(primitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypesPackage.COLLECTION_TYPE: {
			CollectionType collectionType = (CollectionType) theEObject;
			T result = caseCollectionType(collectionType);
			if (result == null)
				result = caseType(collectionType);
			if (result == null)
				result = caseTypedElement(collectionType);
			if (result == null)
				result = caseEntity(collectionType);
			if (result == null)
				result = caseIdentifiedElement(collectionType);
			if (result == null)
				result = caseNamedElement(collectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypesPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = caseEntity(type);
			if (result == null)
				result = caseIdentifiedElement(type);
			if (result == null)
				result = caseNamedElement(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypesPackage.CLASS: {
			org.kit.kastel.sdq.coupling.models.java.types.Class class_ = (org.kit.kastel.sdq.coupling.models.java.types.Class) theEObject;
			T result = caseClass(class_);
			if (result == null)
				result = caseClassOrInterfaceType(class_);
			if (result == null)
				result = caseReferenceType(class_);
			if (result == null)
				result = caseType(class_);
			if (result == null)
				result = caseEntity(class_);
			if (result == null)
				result = caseIdentifiedElement(class_);
			if (result == null)
				result = caseNamedElement(class_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypesPackage.INTERFACE: {
			Interface interface_ = (Interface) theEObject;
			T result = caseInterface(interface_);
			if (result == null)
				result = caseClassOrInterfaceType(interface_);
			if (result == null)
				result = caseReferenceType(interface_);
			if (result == null)
				result = caseType(interface_);
			if (result == null)
				result = caseEntity(interface_);
			if (result == null)
				result = caseIdentifiedElement(interface_);
			if (result == null)
				result = caseNamedElement(interface_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TypesPackage.TYPED_ELEMENT: {
			TypedElement typedElement = (TypedElement) theEObject;
			T result = caseTypedElement(typedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Or Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Or Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassOrInterfaceType(ClassOrInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.kit.kastel.sdq.coupling.models.java.types.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TypesSwitch
