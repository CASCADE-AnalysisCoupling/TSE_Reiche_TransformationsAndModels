/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar.util;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.*;

import edu.kit.kastel.sdq.coupling.models.identifier.Entity;
import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;
import edu.kit.kastel.sdq.coupling.models.identifier.NamedElement;

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
 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage
 * @generated
 */
public class CodeqlscarSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodeqlscarPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlscarSwitch() {
		if (modelPackage == null) {
			modelPackage = CodeqlscarPackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT: {
			SourceCodeAnalysisResult sourceCodeAnalysisResult = (SourceCodeAnalysisResult) theEObject;
			T1 result = caseSourceCodeAnalysisResult(sourceCodeAnalysisResult);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.RESULT_ENTRY: {
			ResultEntry resultEntry = (ResultEntry) theEObject;
			T1 result = caseResultEntry(resultEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT: {
			ResultEntryElement<?> resultEntryElement = (ResultEntryElement<?>) theEObject;
			T1 result = caseResultEntryElement(resultEntryElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.CONFIGURATION_ID_SCAR: {
			ConfigurationID_SCAR configurationID_SCAR = (ConfigurationID_SCAR) theEObject;
			T1 result = caseConfigurationID_SCAR(configurationID_SCAR);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.SYSTEM_ELEMENT_IDENTIFICATION: {
			SystemElementIdentification systemElementIdentification = (SystemElementIdentification) theEObject;
			T1 result = caseSystemElementIdentification(systemElementIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.PARAMETER_IDENTIFICATION: {
			ParameterIdentification parameterIdentification = (ParameterIdentification) theEObject;
			T1 result = caseParameterIdentification(parameterIdentification);
			if (result == null)
				result = caseSystemElementIdentification(parameterIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.FIELD_IDENTIFICATION: {
			FieldIdentification fieldIdentification = (FieldIdentification) theEObject;
			T1 result = caseFieldIdentification(fieldIdentification);
			if (result == null)
				result = caseSystemElementIdentification(fieldIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.SECURITY_LEVEL_SCAR: {
			SecurityLevel_SCAR securityLevel_SCAR = (SecurityLevel_SCAR) theEObject;
			T1 result = caseSecurityLevel_SCAR(securityLevel_SCAR);
			if (result == null)
				result = caseEntity(securityLevel_SCAR);
			if (result == null)
				result = caseIdentifiedElement(securityLevel_SCAR);
			if (result == null)
				result = caseNamedElement(securityLevel_SCAR);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Code Analysis Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Code Analysis Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSourceCodeAnalysisResult(SourceCodeAnalysisResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResultEntry(ResultEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Entry Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Entry Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SystemElementIdentification> T1 caseResultEntryElement(ResultEntryElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration ID SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration ID SCAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConfigurationID_SCAR(ConfigurationID_SCAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Element Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Element Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSystemElementIdentification(SystemElementIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameterIdentification(ParameterIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFieldIdentification(FieldIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Level SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Level SCAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSecurityLevel_SCAR(SecurityLevel_SCAR object) {
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
	public T1 caseIdentifiedElement(IdentifiedElement object) {
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
	public T1 caseNamedElement(NamedElement object) {
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
	public T1 caseEntity(Entity object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //CodeqlscarSwitch
