/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.util;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.*;

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
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage
 * @generated
 */
public class PcmjavacorrespondenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcmjavacorrespondencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmjavacorrespondenceSwitch() {
		if (modelPackage == null) {
			modelPackage = PcmjavacorrespondencePackage.eINSTANCE;
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
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT: {
			PCMJavaCorrespondenceRoot pcmJavaCorrespondenceRoot = (PCMJavaCorrespondenceRoot) theEObject;
			T result = casePCMJavaCorrespondenceRoot(pcmJavaCorrespondenceRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS: {
			BasicComponent2Class basicComponent2Class = (BasicComponent2Class) theEObject;
			T result = caseBasicComponent2Class(basicComponent2Class);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE: {
			OperationInterface2Interface operationInterface2Interface = (OperationInterface2Interface) theEObject;
			T result = caseOperationInterface2Interface(operationInterface2Interface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS: {
			CompositeDataType2Class compositeDataType2Class = (CompositeDataType2Class) theEObject;
			T result = caseCompositeDataType2Class(compositeDataType2Class);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD: {
			ProvidedOperationSignature2JavaMethod providedOperationSignature2JavaMethod = (ProvidedOperationSignature2JavaMethod) theEObject;
			T result = caseProvidedOperationSignature2JavaMethod(providedOperationSignature2JavaMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmjavacorrespondencePackage.PROVIDED_SIGNATURE: {
			ProvidedSignature providedSignature = (ProvidedSignature) theEObject;
			T result = caseProvidedSignature(providedSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION: {
			ProvidedParameterIdentification providedParameterIdentification = (ProvidedParameterIdentification) theEObject;
			T result = caseProvidedParameterIdentification(providedParameterIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER: {
			PCMParameter2JavaParameter pcmParameter2JavaParameter = (PCMParameter2JavaParameter) theEObject;
			T result = casePCMParameter2JavaParameter(pcmParameter2JavaParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Java Correspondence Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Java Correspondence Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMJavaCorrespondenceRoot(PCMJavaCorrespondenceRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Component2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Component2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicComponent2Class(BasicComponent2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Interface2 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Interface2 Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInterface2Interface(OperationInterface2Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Data Type2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Data Type2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeDataType2Class(CompositeDataType2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Operation Signature2 Java Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Operation Signature2 Java Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedOperationSignature2JavaMethod(ProvidedOperationSignature2JavaMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedSignature(ProvidedSignature object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>PCM Parameter2 Java Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Parameter2 Java Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMParameter2JavaParameter(PCMParameter2JavaParameter object) {
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

} //PcmjavacorrespondenceSwitch
