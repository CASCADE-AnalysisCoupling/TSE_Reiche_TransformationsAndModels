/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature#getProvidedSignature <em>Provided Signature</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getProvidedSignature()
 * @model
 * @generated
 */
public interface ProvidedSignature extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(OperationProvidedRole)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getProvidedSignature_ProvidedRole()
	 * @model required="true"
	 * @generated
	 */
	OperationProvidedRole getProvidedRole();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(OperationProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Provided Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Signature</em>' reference.
	 * @see #setProvidedSignature(OperationSignature)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getProvidedSignature_ProvidedSignature()
	 * @model required="true"
	 * @generated
	 */
	OperationSignature getProvidedSignature();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature#getProvidedSignature <em>Provided Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Signature</em>' reference.
	 * @see #getProvidedSignature()
	 * @generated
	 */
	void setProvidedSignature(OperationSignature value);

} // ProvidedSignature
