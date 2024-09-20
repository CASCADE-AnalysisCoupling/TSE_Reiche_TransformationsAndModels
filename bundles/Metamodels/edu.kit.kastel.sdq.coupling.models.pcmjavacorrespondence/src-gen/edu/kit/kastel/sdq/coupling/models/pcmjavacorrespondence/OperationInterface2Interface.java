/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence;

import edu.kit.kastel.sdq.coupling.models.java.types.Interface;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Interface2 Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface#getPcmInterface <em>Pcm Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface#getJavaInterface <em>Java Interface</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getOperationInterface2Interface()
 * @model
 * @generated
 */
public interface OperationInterface2Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Pcm Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Interface</em>' reference.
	 * @see #setPcmInterface(OperationInterface)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getOperationInterface2Interface_PcmInterface()
	 * @model required="true"
	 * @generated
	 */
	OperationInterface getPcmInterface();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface#getPcmInterface <em>Pcm Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Interface</em>' reference.
	 * @see #getPcmInterface()
	 * @generated
	 */
	void setPcmInterface(OperationInterface value);

	/**
	 * Returns the value of the '<em><b>Java Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Interface</em>' reference.
	 * @see #setJavaInterface(Interface)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getOperationInterface2Interface_JavaInterface()
	 * @model required="true"
	 * @generated
	 */
	Interface getJavaInterface();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface#getJavaInterface <em>Java Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Interface</em>' reference.
	 * @see #getJavaInterface()
	 * @generated
	 */
	void setJavaInterface(Interface value);

} // OperationInterface2Interface
