/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resulting Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getResultingSecurityLevel <em>Resulting Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getParameter <em>Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResultingValue()
 * @model
 * @generated
 */
public interface ResultingValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Resulting Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Security Level</em>' reference.
	 * @see #setResultingSecurityLevel(SecurityLevel_ResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResultingValue_ResultingSecurityLevel()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel_ResultingValues getResultingSecurityLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getResultingSecurityLevel <em>Resulting Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resulting Security Level</em>' reference.
	 * @see #getResultingSecurityLevel()
	 * @generated
	 */
	void setResultingSecurityLevel(SecurityLevel_ResultingValues value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterIdentificiation_CodeQLResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResultingValue_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterIdentificiation_CodeQLResultingValues getParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterIdentificiation_CodeQLResultingValues value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(ConfigurationID_ResultingValues)
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResultingValue_Configuration()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationID_ResultingValues getConfiguration();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationID_ResultingValues value);

} // ResultingValue
