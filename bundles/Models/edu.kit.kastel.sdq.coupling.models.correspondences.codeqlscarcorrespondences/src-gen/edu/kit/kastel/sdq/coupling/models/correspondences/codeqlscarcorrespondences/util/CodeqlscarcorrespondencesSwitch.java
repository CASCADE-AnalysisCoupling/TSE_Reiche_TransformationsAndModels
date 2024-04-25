/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.util;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.*;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage
 * @generated
 */
public class CodeqlscarcorrespondencesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodeqlscarcorrespondencesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlscarcorrespondencesSwitch() {
		if (modelPackage == null) {
			modelPackage = CodeqlscarcorrespondencesPackage.eINSTANCE;
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
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES: {
			CodeQLSCARCorrespondences codeQLSCARCorrespondences = (CodeQLSCARCorrespondences) theEObject;
			T result = caseCodeQLSCARCorrespondences(codeQLSCARCorrespondences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE: {
			ConfigurationCorrespondence configurationCorrespondence = (ConfigurationCorrespondence) theEObject;
			T result = caseConfigurationCorrespondence(configurationCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE: {
			SecurityLevelCorrespondence securityLevelCorrespondence = (SecurityLevelCorrespondence) theEObject;
			T result = caseSecurityLevelCorrespondence(securityLevelCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE: {
			ParameterCorrespondence parameterCorrespondence = (ParameterCorrespondence) theEObject;
			T result = caseParameterCorrespondence(parameterCorrespondence);
			if (result == null)
				result = caseSystemElementCorrespondence(parameterCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE: {
			FieldCorrespondence fieldCorrespondence = (FieldCorrespondence) theEObject;
			T result = caseFieldCorrespondence(fieldCorrespondence);
			if (result == null)
				result = caseSystemElementCorrespondence(fieldCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CodeqlscarcorrespondencesPackage.SYSTEM_ELEMENT_CORRESPONDENCE: {
			SystemElementCorrespondence systemElementCorrespondence = (SystemElementCorrespondence) theEObject;
			T result = caseSystemElementCorrespondence(systemElementCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code QLSCAR Correspondences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code QLSCAR Correspondences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeQLSCARCorrespondences(CodeQLSCARCorrespondences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationCorrespondence(ConfigurationCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Level Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Level Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityLevelCorrespondence(SecurityLevelCorrespondence object) {
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

} //CodeqlscarcorrespondencesSwitch
