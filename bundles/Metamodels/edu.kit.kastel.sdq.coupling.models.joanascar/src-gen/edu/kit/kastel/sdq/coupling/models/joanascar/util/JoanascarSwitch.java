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
		case JoanascarPackage.SYSTEM_ELEMENT_SCAR: {
			SystemElement_SCAR systemElement_SCAR = (SystemElement_SCAR) theEObject;
			T1 result = caseSystemElement_SCAR(systemElement_SCAR);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.PARAMETER_SCAR: {
			Parameter_SCAR parameter_SCAR = (Parameter_SCAR) theEObject;
			T1 result = caseParameter_SCAR(parameter_SCAR);
			if (result == null)
				result = caseSystemElement_SCAR(parameter_SCAR);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.FIELD_SCAR: {
			Field_SCAR field_SCAR = (Field_SCAR) theEObject;
			T1 result = caseField_SCAR(field_SCAR);
			if (result == null)
				result = caseSystemElement_SCAR(field_SCAR);
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
		case JoanascarPackage.ENTRY_POINT_SCAR: {
			EntryPoint_SCAR entryPoint_SCAR = (EntryPoint_SCAR) theEObject;
			T1 result = caseEntryPoint_SCAR(entryPoint_SCAR);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.FLOW: {
			Flow flow = (Flow) theEObject;
			T1 result = caseFlow(flow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.SOURCE: {
			Source<?> source = (Source<?>) theEObject;
			T1 result = caseSource(source);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarPackage.SINK: {
			Sink<?> sink = (Sink<?>) theEObject;
			T1 result = caseSink(sink);
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
	 * Returns the result of interpreting the object as an instance of '<em>System Element SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Element SCAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSystemElement_SCAR(SystemElement_SCAR object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point SCAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntryPoint_SCAR(EntryPoint_SCAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SystemElement_SCAR> T1 caseSource(Source<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SystemElement_SCAR> T1 caseSink(Sink<T> object) {
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
