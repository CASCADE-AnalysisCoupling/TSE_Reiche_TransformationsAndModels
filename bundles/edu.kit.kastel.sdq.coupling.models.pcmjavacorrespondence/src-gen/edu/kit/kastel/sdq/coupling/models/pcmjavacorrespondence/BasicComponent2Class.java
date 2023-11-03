/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.BasicComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Component2 Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getBasicComponent2Class()
 * @model
 * @generated
 */
public interface BasicComponent2Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(BasicComponent)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getBasicComponent2Class_Component()
	 * @model required="true"
	 * @generated
	 */
	BasicComponent getComponent();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(BasicComponent value);

	/**
	 * Returns the value of the '<em><b>Java Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class</em>' reference.
	 * @see #setJavaClass(edu.kit.kastel.sdq.coupling.models.java.types.Class)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getBasicComponent2Class_JavaClass()
	 * @model required="true"
	 * @generated
	 */
	edu.kit.kastel.sdq.coupling.models.java.types.Class getJavaClass();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class#getJavaClass <em>Java Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class</em>' reference.
	 * @see #getJavaClass()
	 * @generated
	 */
	void setJavaClass(edu.kit.kastel.sdq.coupling.models.java.types.Class value);

} // BasicComponent2Class
