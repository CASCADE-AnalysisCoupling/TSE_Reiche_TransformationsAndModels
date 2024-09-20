/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.*;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage
 * @generated
 */
public class JoanascarcorrespondencesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JoanascarcorrespondencesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanascarcorrespondencesSwitch() {
		if (modelPackage == null) {
			modelPackage = JoanascarcorrespondencesPackage.eINSTANCE;
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
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES: {
			JOANASCARCorrespondences joanascarCorrespondences = (JOANASCARCorrespondences) theEObject;
			T result = caseJOANASCARCorrespondences(joanascarCorrespondences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE: {
			EntryPointCorrespondence entryPointCorrespondence = (EntryPointCorrespondence) theEObject;
			T result = caseEntryPointCorrespondence(entryPointCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE: {
			LevelCorrespondence levelCorrespondence = (LevelCorrespondence) theEObject;
			T result = caseLevelCorrespondence(levelCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarcorrespondencesPackage.SYSTEM_ELEMENT_CORRESPONDENCE: {
			SystemElementCorrespondence systemElementCorrespondence = (SystemElementCorrespondence) theEObject;
			T result = caseSystemElementCorrespondence(systemElementCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE: {
			ParameterCorrespondence parameterCorrespondence = (ParameterCorrespondence) theEObject;
			T result = caseParameterCorrespondence(parameterCorrespondence);
			if (result == null)
				result = caseSystemElementCorrespondence(parameterCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE: {
			FieldCorrespondence fieldCorrespondence = (FieldCorrespondence) theEObject;
			T result = caseFieldCorrespondence(fieldCorrespondence);
			if (result == null)
				result = caseSystemElementCorrespondence(fieldCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JOANASCAR Correspondences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JOANASCAR Correspondences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJOANASCARCorrespondences(JOANASCARCorrespondences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPointCorrespondence(EntryPointCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelCorrespondence(LevelCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Element Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Element Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemElementCorrespondence(SystemElementCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterCorrespondence(ParameterCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldCorrespondence(FieldCorrespondence object) {
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

} //JoanascarcorrespondencesSwitch
