/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getResultingValues <em>Resulting Values</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getSystemElements <em>System Elements</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getCodeQLResultingValues()
 * @model
 * @generated
 */
public interface CodeQLResultingValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Resulting Values</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Values</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getCodeQLResultingValues_ResultingValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultingValue> getResultingValues();

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getCodeQLResultingValues_SecurityLevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevel_ResultingValues> getSecurityLevel();

	/**
	 * Returns the value of the '<em><b>System Elements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Elements</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getCodeQLResultingValues_SystemElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterIdentificiation_CodeQLResultingValues> getSystemElements();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getCodeQLResultingValues_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationID_ResultingValues> getConfigurations();

} // CodeQLResultingValues
