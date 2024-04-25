/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.util;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.*;

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
 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage
 * @generated
 */
public class CodeqlresultingvaluesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodeqlresultingvaluesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlresultingvaluesSwitch() {
		if (modelPackage == null) {
			modelPackage = CodeqlresultingvaluesPackage.eINSTANCE;
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
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES: {
			CodeQLResultingValues codeQLResultingValues = (CodeQLResultingValues) theEObject;
			T result = caseCodeQLResultingValues(codeQLResultingValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES: {
			ParameterIdentificiation_CodeQLResultingValues parameterIdentificiation_CodeQLResultingValues = (ParameterIdentificiation_CodeQLResultingValues) theEObject;
			T result = caseParameterIdentificiation_CodeQLResultingValues(
					parameterIdentificiation_CodeQLResultingValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlresultingvaluesPackage.RESULTING_VALUE: {
			ResultingValue resultingValue = (ResultingValue) theEObject;
			T result = caseResultingValue(resultingValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlresultingvaluesPackage.SECURITY_LEVEL_RESULTING_VALUES: {
			SecurityLevel_ResultingValues securityLevel_ResultingValues = (SecurityLevel_ResultingValues) theEObject;
			T result = caseSecurityLevel_ResultingValues(securityLevel_ResultingValues);
			if (result == null)
				result = caseEntity(securityLevel_ResultingValues);
			if (result == null)
				result = caseIdentifiedElement(securityLevel_ResultingValues);
			if (result == null)
				result = caseNamedElement(securityLevel_ResultingValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlresultingvaluesPackage.CONFIGURATION_ID_RESULTING_VALUES: {
			ConfigurationID_ResultingValues configurationID_ResultingValues = (ConfigurationID_ResultingValues) theEObject;
			T result = caseConfigurationID_ResultingValues(configurationID_ResultingValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code QL Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code QL Resulting Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeQLResultingValues(CodeQLResultingValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Identificiation Code QL Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Identificiation Code QL Resulting Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterIdentificiation_CodeQLResultingValues(ParameterIdentificiation_CodeQLResultingValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resulting Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resulting Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultingValue(ResultingValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Level Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Level Resulting Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityLevel_ResultingValues(SecurityLevel_ResultingValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration ID Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration ID Resulting Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationID_ResultingValues(ConfigurationID_ResultingValues object) {
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

} //CodeqlresultingvaluesSwitch
