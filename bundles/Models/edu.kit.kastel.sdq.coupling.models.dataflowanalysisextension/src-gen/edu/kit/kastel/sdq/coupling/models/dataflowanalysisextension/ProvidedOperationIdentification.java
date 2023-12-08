/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Operation Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getProvidedOperationIdentification()
 * @model
 * @generated
 */
public interface ProvidedOperationIdentification extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(OperationProvidedRole)
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getProvidedOperationIdentification_ProvidedRole()
	 * @model required="true"
	 * @generated
	 */
	OperationProvidedRole getProvidedRole();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(OperationProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Signature</em>' reference.
	 * @see #setOperationSignature(OperationSignature)
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getProvidedOperationIdentification_OperationSignature()
	 * @model required="true"
	 * @generated
	 */
	OperationSignature getOperationSignature();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification#getOperationSignature <em>Operation Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Signature</em>' reference.
	 * @see #getOperationSignature()
	 * @generated
	 */
	void setOperationSignature(OperationSignature value);

} // ProvidedOperationIdentification
