/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.util;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.*;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage
 * @generated
 */
public class DataflowanalysisextensionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataflowanalysisextensionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataflowanalysisextensionSwitch() {
		if (modelPackage == null) {
			modelPackage = DataflowanalysisextensionPackage.eINSTANCE;
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
		case DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION: {
			ProvidedOperationIdentification providedOperationIdentification = (ProvidedOperationIdentification) theEObject;
			T result = caseProvidedOperationIdentification(providedOperationIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION: {
			ProvidedParameterIdentification providedParameterIdentification = (ProvidedParameterIdentification) theEObject;
			T result = caseProvidedParameterIdentification(providedParameterIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION: {
			ProvidedParameterCharacteristicAnnotation providedParameterCharacteristicAnnotation = (ProvidedParameterCharacteristicAnnotation) theEObject;
			T result = caseProvidedParameterCharacteristicAnnotation(providedParameterCharacteristicAnnotation);
			if (result == null)
				result = caseCharacteristicsAnnotation(providedParameterCharacteristicAnnotation);
			if (result == null)
				result = caseIdentifiedElement(providedParameterCharacteristicAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DataflowanalysisextensionPackage.CHARACTERISTICS_ANNOTATION: {
			CharacteristicsAnnotation characteristicsAnnotation = (CharacteristicsAnnotation) theEObject;
			T result = caseCharacteristicsAnnotation(characteristicsAnnotation);
			if (result == null)
				result = caseIdentifiedElement(characteristicsAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DataflowanalysisextensionPackage.EXTENSION_ROOT: {
			ExtensionRoot extensionRoot = (ExtensionRoot) theEObject;
			T result = caseExtensionRoot(extensionRoot);
			if (result == null)
				result = caseIdentifiedElement(extensionRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Operation Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Operation Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedOperationIdentification(ProvidedOperationIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Parameter Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Parameter Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedParameterIdentification(ProvidedParameterIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Parameter Characteristic Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Parameter Characteristic Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedParameterCharacteristicAnnotation(ProvidedParameterCharacteristicAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristics Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristics Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicsAnnotation(CharacteristicsAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionRoot(ExtensionRoot object) {
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

} //DataflowanalysisextensionSwitch
