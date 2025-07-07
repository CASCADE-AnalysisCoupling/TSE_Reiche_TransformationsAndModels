/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence;

import edu.kit.kastel.sdq.coupling.models.java.members.Method;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Operation Signature2 Java Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod#getPcmMethod <em>Pcm Method</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod#getJavaMethod <em>Java Method</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getProvidedOperationSignature2JavaMethod()
 * @model
 * @generated
 */
public interface ProvidedOperationSignature2JavaMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Pcm Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Method</em>' containment reference.
	 * @see #setPcmMethod(ProvidedSignature)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getProvidedOperationSignature2JavaMethod_PcmMethod()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProvidedSignature getPcmMethod();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod#getPcmMethod <em>Pcm Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Method</em>' containment reference.
	 * @see #getPcmMethod()
	 * @generated
	 */
	void setPcmMethod(ProvidedSignature value);

	/**
	 * Returns the value of the '<em><b>Java Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Method</em>' reference.
	 * @see #setJavaMethod(Method)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getProvidedOperationSignature2JavaMethod_JavaMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getJavaMethod();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod#getJavaMethod <em>Java Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Method</em>' reference.
	 * @see #getJavaMethod()
	 * @generated
	 */
	void setJavaMethod(Method value);

} // ProvidedOperationSignature2JavaMethod
