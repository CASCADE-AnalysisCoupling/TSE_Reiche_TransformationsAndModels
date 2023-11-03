/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Parameter Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification#getProvidedSignature <em>Provided Signature</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getProvidedParameterIdentification()
 * @model
 * @generated
 */
public interface ProvidedParameterIdentification extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Signature</em>' reference.
	 * @see #setProvidedSignature(ProvidedSignature)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getProvidedParameterIdentification_ProvidedSignature()
	 * @model required="true"
	 * @generated
	 */
	ProvidedSignature getProvidedSignature();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification#getProvidedSignature <em>Provided Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Signature</em>' reference.
	 * @see #getProvidedSignature()
	 * @generated
	 */
	void setProvidedSignature(ProvidedSignature value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getProvidedParameterIdentification_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ProvidedParameterIdentification
