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
		case CodeqlscarPackage.RESULT: {
			Result result = (Result) theEObject;
			T1 theResult = caseResult(result);
			if (theResult == null)
				theResult = defaultCase(theEObject);
			return theResult;
		}
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT: {
			ResultEntryElement<?> resultEntryElement = (ResultEntryElement<?>) theEObject;
			T1 result = caseResultEntryElement(resultEntryElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.RULE_ID: {
			RuleId ruleId = (RuleId) theEObject;
			T1 result = caseRuleId(ruleId);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.SYSTEM_ELEMENT: {
			SystemElement systemElement = (SystemElement) theEObject;
			T1 result = caseSystemElement(systemElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.PARAMETER_SCAR: {
			Parameter_SCAR parameter_SCAR = (Parameter_SCAR) theEObject;
			T1 result = caseParameter_SCAR(parameter_SCAR);
			if (result == null)
				result = caseSystemElement(parameter_SCAR);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarPackage.FIELD_SCAR: {
			Field_SCAR field_SCAR = (Field_SCAR) theEObject;
			T1 result = caseField_SCAR(field_SCAR);
			if (result == null)
				result = caseSystemElement(field_SCAR);
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
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResult(Result object) {
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
	public <T extends SystemElement> T1 caseResultEntryElement(ResultEntryElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRuleId(RuleId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSystemElement(SystemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter SCAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameter_SCAR(Parameter_SCAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field SCAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseField_SCAR(Field_SCAR object) {
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
