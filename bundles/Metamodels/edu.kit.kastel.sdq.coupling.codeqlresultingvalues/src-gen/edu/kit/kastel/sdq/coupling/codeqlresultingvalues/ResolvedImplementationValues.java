/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getResultingValues <em>Resulting Values</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getSystemElements <em>System Elements</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResolvedImplementationValues()
 * @model
 * @generated
 */
public interface ResolvedImplementationValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Resulting Values</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Values</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResolvedImplementationValues_ResultingValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResolvedImplementationValue> getResultingValues();

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResolvedImplementationValues_SecurityLevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevel_ResolvedImplementationValues> getSecurityLevel();

	/**
	 * Returns the value of the '<em><b>System Elements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Elements</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResolvedImplementationValues_SystemElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter_ResolvedImplementationValues> getSystemElements();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage#getResolvedImplementationValues_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleId_ResolvedImplementationValue> getConfigurations();

} // ResolvedImplementationValues
