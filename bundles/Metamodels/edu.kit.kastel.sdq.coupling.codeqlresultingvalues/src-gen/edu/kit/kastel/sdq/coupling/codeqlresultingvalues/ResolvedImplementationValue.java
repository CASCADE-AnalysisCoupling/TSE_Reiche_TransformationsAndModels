/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Implementation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getResultingSecurityLevel <em>Resulting Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getParameter <em>Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getRuleId <em>Rule Id</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResolvedImplementationValue()
 * @model
 * @generated
 */
public interface ResolvedImplementationValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Resulting Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Security Level</em>' reference.
	 * @see #setResultingSecurityLevel(SecurityLevel_ResolvedImplementationValues)
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResolvedImplementationValue_ResultingSecurityLevel()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel_ResolvedImplementationValues getResultingSecurityLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getResultingSecurityLevel <em>Resulting Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resulting Security Level</em>' reference.
	 * @see #getResultingSecurityLevel()
	 * @generated
	 */
	void setResultingSecurityLevel(SecurityLevel_ResolvedImplementationValues value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter_ResolvedImplementationValues)
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResolvedImplementationValue_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter_ResolvedImplementationValues getParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter_ResolvedImplementationValues value);

	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Id</em>' reference.
	 * @see #setRuleId(RuleId_ResolvedImplementationValue)
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResolvedImplementationValue_RuleId()
	 * @model required="true"
	 * @generated
	 */
	RuleId_ResolvedImplementationValue getRuleId();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue#getRuleId <em>Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Id</em>' reference.
	 * @see #getRuleId()
	 * @generated
	 */
	void setRuleId(RuleId_ResolvedImplementationValue value);

} // ResolvedImplementationValue
