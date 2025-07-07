/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.util;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.*;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage
 * @generated
 */
public class EdfacodeqlcorrespondencesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdfacodeqlcorrespondencesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdfacodeqlcorrespondencesSwitch() {
		if (modelPackage == null) {
			modelPackage = EdfacodeqlcorrespondencesPackage.eINSTANCE;
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
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL: {
			Correspondences_EDFACodeQL correspondences_EDFACodeQL = (Correspondences_EDFACodeQL) theEObject;
			T result = caseCorrespondences_EDFACodeQL(correspondences_EDFACodeQL);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL: {
			LiteralSecurityLevelCorrespondence_EDFACodeQL literalSecurityLevelCorrespondence_EDFACodeQL = (LiteralSecurityLevelCorrespondence_EDFACodeQL) theEObject;
			T result = caseLiteralSecurityLevelCorrespondence_EDFACodeQL(literalSecurityLevelCorrespondence_EDFACodeQL);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL: {
			ConfigurationCorrespondence_EDFACodeQL configurationCorrespondence_EDFACodeQL = (ConfigurationCorrespondence_EDFACodeQL) theEObject;
			T result = caseConfigurationCorrespondence_EDFACodeQL(configurationCorrespondence_EDFACodeQL);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correspondences EDFA Code QL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correspondences EDFA Code QL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrespondences_EDFACodeQL(Correspondences_EDFACodeQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Security Level Correspondence EDFA Code QL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Security Level Correspondence EDFA Code QL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralSecurityLevelCorrespondence_EDFACodeQL(LiteralSecurityLevelCorrespondence_EDFACodeQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Correspondence EDFA Code QL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Correspondence EDFA Code QL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationCorrespondence_EDFACodeQL(ConfigurationCorrespondence_EDFACodeQL object) {
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

} //EdfacodeqlcorrespondencesSwitch
