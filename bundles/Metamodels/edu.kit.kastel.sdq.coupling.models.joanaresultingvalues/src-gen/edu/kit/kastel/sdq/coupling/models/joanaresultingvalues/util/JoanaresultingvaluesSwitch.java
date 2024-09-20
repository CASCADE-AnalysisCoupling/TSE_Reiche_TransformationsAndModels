/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util;

import edu.kit.kastel.sdq.coupling.models.identifier.Entity;
import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;
import edu.kit.kastel.sdq.coupling.models.identifier.NamedElement;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.*;

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
 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage
 * @generated
 */
public class JoanaresultingvaluesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JoanaresultingvaluesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaresultingvaluesSwitch() {
		if (modelPackage == null) {
			modelPackage = JoanaresultingvaluesPackage.eINSTANCE;
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
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES: {
			ResolvedImplementationValues resolvedImplementationValues = (ResolvedImplementationValues) theEObject;
			T result = caseResolvedImplementationValues(resolvedImplementationValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES: {
			Parameter_ResolvedImplementationValues parameter_ResolvedImplementationValues = (Parameter_ResolvedImplementationValues) theEObject;
			T result = caseParameter_ResolvedImplementationValues(parameter_ResolvedImplementationValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaresultingvaluesPackage.LEVEL_RESOLVED_IMPLEMENTATION_VALUES: {
			Level_ResolvedImplementationValues level_ResolvedImplementationValues = (Level_ResolvedImplementationValues) theEObject;
			T result = caseLevel_ResolvedImplementationValues(level_ResolvedImplementationValues);
			if (result == null)
				result = caseEntity(level_ResolvedImplementationValues);
			if (result == null)
				result = caseIdentifiedElement(level_ResolvedImplementationValues);
			if (result == null)
				result = caseNamedElement(level_ResolvedImplementationValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaresultingvaluesPackage.ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES: {
			EntryPoint_ResolvedImplementationValues entryPoint_ResolvedImplementationValues = (EntryPoint_ResolvedImplementationValues) theEObject;
			T result = caseEntryPoint_ResolvedImplementationValues(entryPoint_ResolvedImplementationValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE: {
			ResolvedImplementationValue resolvedImplementationValue = (ResolvedImplementationValue) theEObject;
			T result = caseResolvedImplementationValue(resolvedImplementationValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolved Implementation Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolved Implementation Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvedImplementationValues(ResolvedImplementationValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Resolved Implementation Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Resolved Implementation Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter_ResolvedImplementationValues(Parameter_ResolvedImplementationValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Resolved Implementation Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Resolved Implementation Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevel_ResolvedImplementationValues(Level_ResolvedImplementationValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point Resolved Implementation Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point Resolved Implementation Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPoint_ResolvedImplementationValues(EntryPoint_ResolvedImplementationValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolved Implementation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolved Implementation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvedImplementationValue(ResolvedImplementationValue object) {
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

} //JoanaresultingvaluesSwitch
