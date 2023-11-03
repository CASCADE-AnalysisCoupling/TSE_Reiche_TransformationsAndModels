/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Parameter2 Java Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter#getPcmParameterIdentification <em>Pcm Parameter Identification</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter#getJavaParameter <em>Java Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getPCMParameter2JavaParameter()
 * @model
 * @generated
 */
public interface PCMParameter2JavaParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Pcm Parameter Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Parameter Identification</em>' containment reference.
	 * @see #setPcmParameterIdentification(ProvidedParameterIdentification)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getPCMParameter2JavaParameter_PcmParameterIdentification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProvidedParameterIdentification getPcmParameterIdentification();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter#getPcmParameterIdentification <em>Pcm Parameter Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Parameter Identification</em>' containment reference.
	 * @see #getPcmParameterIdentification()
	 * @generated
	 */
	void setPcmParameterIdentification(ProvidedParameterIdentification value);

	/**
	 * Returns the value of the '<em><b>Java Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Parameter</em>' reference.
	 * @see #setJavaParameter(Parameter)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getPCMParameter2JavaParameter_JavaParameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getJavaParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter#getJavaParameter <em>Java Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Parameter</em>' reference.
	 * @see #getJavaParameter()
	 * @generated
	 */
	void setJavaParameter(Parameter value);

} // PCMParameter2JavaParameter
