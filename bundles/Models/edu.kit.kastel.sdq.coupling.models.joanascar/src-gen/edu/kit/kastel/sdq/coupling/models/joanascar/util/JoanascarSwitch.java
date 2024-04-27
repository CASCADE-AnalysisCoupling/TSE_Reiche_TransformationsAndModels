/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar.util;

import edu.kit.kastel.sdq.coupling.models.identifier.Entity;
import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;
import edu.kit.kastel.sdq.coupling.models.identifier.NamedElement;

import edu.kit.kastel.sdq.coupling.models.joanascar.*;

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
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage
 * @generated
 */
public class JoanascarSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JoanascarPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanascarSwitch() {
		if (modelPackage == null) {
			modelPackage = JoanascarPackage.eINSTANCE;
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
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT: {
			SourceCodeAnalysisResult sourceCodeAnalysisResult = (SourceCodeAnalysisResult) theEObject;
			T1 result = caseSourceCodeAnalysisResult(sourceCodeAnalysisResult);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR: {
			SystemElementIdentifiying_JOANASCAR systemElementIdentifiying_JOANASCAR = (SystemElementIdentifiying_JOANASCAR) theEObject;
			T1 result = caseSystemElementIdentifiying_JOANASCAR(systemElementIdentifiying_JOANASCAR);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.PARAMETER_IDENTIFYING: {
			ParameterIdentifying parameterIdentifying = (ParameterIdentifying) theEObject;
			T1 result = caseParameterIdentifying(parameterIdentifying);
			if (result == null)
				result = caseSystemElementIdentifiying_JOANASCAR(parameterIdentifying);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.FIELD_IDENTIFYING: {
			FieldIdentifying fieldIdentifying = (FieldIdentifying) theEObject;
			T1 result = caseFieldIdentifying(fieldIdentifying);
			if (result == null)
				result = caseSystemElementIdentifiying_JOANASCAR(fieldIdentifying);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.LEVEL_SCAR: {
			Level_SCAR level_SCAR = (Level_SCAR) theEObject;
			T1 result = caseLevel_SCAR(level_SCAR);
			if (result == null)
				result = caseEntity(level_SCAR);
			if (result == null)
				result = caseIdentifiedElement(level_SCAR);
			if (result == null)
				result = caseNamedElement(level_SCAR);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.ENTRY_POINT_IDENTIFYING: {
			EntryPointIdentifying entryPointIdentifying = (EntryPointIdentifying) theEObject;
			T1 result = caseEntryPointIdentifying(entryPointIdentifying);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.RESULT_ENTRY: {
			ResultEntry resultEntry = (ResultEntry) theEObject;
			T1 result = caseResultEntry(resultEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.RESULT_ENTRY_ELEMENT: {
			ResultEntryElement<?> resultEntryElement = (ResultEntryElement<?>) theEObject;
			T1 result = caseResultEntryElement(resultEntryElement);
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
	 * Returns the result of interpreting the object as an instance of '<em>System Element Identifiying JOANASCAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Element Identifiying JOANASCAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSystemElementIdentifiying_JOANASCAR(SystemElementIdentifiying_JOANASCAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Identifying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Identifying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameterIdentifying(ParameterIdentifying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Identifying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Identifying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFieldIdentifying(FieldIdentifying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level SCAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLevel_SCAR(Level_SCAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point Identifying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point Identifying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntryPointIdentifying(EntryPointIdentifying object) {
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
	public <T extends SystemElementIdentifiying_JOANASCAR> T1 caseResultEntryElement(ResultEntryElement<T> object) {
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

} //JoanascarSwitch
