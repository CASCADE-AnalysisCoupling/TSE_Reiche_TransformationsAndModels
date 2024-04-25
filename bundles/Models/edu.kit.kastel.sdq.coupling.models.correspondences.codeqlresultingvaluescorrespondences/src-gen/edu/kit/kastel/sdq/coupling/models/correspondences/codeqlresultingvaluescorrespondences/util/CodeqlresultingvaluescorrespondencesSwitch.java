/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.util;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.*;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage
 * @generated
 */
public class CodeqlresultingvaluescorrespondencesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodeqlresultingvaluescorrespondencesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlresultingvaluescorrespondencesSwitch() {
		if (modelPackage == null) {
			modelPackage = CodeqlresultingvaluescorrespondencesPackage.eINSTANCE;
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES: {
			Correspondences_CodeQLResultingValues correspondences_CodeQLResultingValues = (Correspondences_CodeQLResultingValues) theEObject;
			T result = caseCorrespondences_CodeQLResultingValues(correspondences_CodeQLResultingValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES: {
			SecurityLevelCorrespondence_CodeQLResultingValues securityLevelCorrespondence_CodeQLResultingValues = (SecurityLevelCorrespondence_CodeQLResultingValues) theEObject;
			T result = caseSecurityLevelCorrespondence_CodeQLResultingValues(
					securityLevelCorrespondence_CodeQLResultingValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES: {
			ConfigurationCorrespondence_CodeQLResultingValues configurationCorrespondence_CodeQLResultingValues = (ConfigurationCorrespondence_CodeQLResultingValues) theEObject;
			T result = caseConfigurationCorrespondence_CodeQLResultingValues(
					configurationCorrespondence_CodeQLResultingValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES: {
			ParameterCorrespondence_CodeQLResultingValues parameterCorrespondence_CodeQLResultingValues = (ParameterCorrespondence_CodeQLResultingValues) theEObject;
			T result = caseParameterCorrespondence_CodeQLResultingValues(parameterCorrespondence_CodeQLResultingValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correspondences Code QL Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correspondences Code QL Resulting Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrespondences_CodeQLResultingValues(Correspondences_CodeQLResultingValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Level Correspondence Code QL Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Level Correspondence Code QL Resulting Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityLevelCorrespondence_CodeQLResultingValues(
			SecurityLevelCorrespondence_CodeQLResultingValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Correspondence Code QL Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Correspondence Code QL Resulting Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationCorrespondence_CodeQLResultingValues(
			ConfigurationCorrespondence_CodeQLResultingValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Correspondence Code QL Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Correspondence Code QL Resulting Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterCorrespondence_CodeQLResultingValues(ParameterCorrespondence_CodeQLResultingValues object) {
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

} //CodeqlresultingvaluescorrespondencesSwitch
