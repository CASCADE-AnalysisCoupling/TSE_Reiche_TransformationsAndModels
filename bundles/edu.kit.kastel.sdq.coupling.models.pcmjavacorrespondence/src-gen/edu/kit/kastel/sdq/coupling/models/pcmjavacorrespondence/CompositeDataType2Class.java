/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.CompositeDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Data Type2 Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class#getCompositeDataType <em>Composite Data Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getCompositeDataType2Class()
 * @model
 * @generated
 */
public interface CompositeDataType2Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Composite Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Data Type</em>' reference.
	 * @see #setCompositeDataType(CompositeDataType)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getCompositeDataType2Class_CompositeDataType()
	 * @model required="true"
	 * @generated
	 */
	CompositeDataType getCompositeDataType();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class#getCompositeDataType <em>Composite Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Data Type</em>' reference.
	 * @see #getCompositeDataType()
	 * @generated
	 */
	void setCompositeDataType(CompositeDataType value);

	/**
	 * Returns the value of the '<em><b>Java Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class</em>' reference.
	 * @see #setJavaClass(edu.kit.kastel.sdq.coupling.models.java.types.Class)
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getCompositeDataType2Class_JavaClass()
	 * @model required="true"
	 * @generated
	 */
	edu.kit.kastel.sdq.coupling.models.java.types.Class getJavaClass();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class#getJavaClass <em>Java Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class</em>' reference.
	 * @see #getJavaClass()
	 * @generated
	 */
	void setJavaClass(edu.kit.kastel.sdq.coupling.models.java.types.Class value);

} // CompositeDataType2Class
