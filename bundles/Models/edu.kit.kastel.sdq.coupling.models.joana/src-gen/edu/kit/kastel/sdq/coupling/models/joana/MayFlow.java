/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>May Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.MayFlow#getFrom <em>From</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.MayFlow#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getMayFlow()
 * @model
 * @generated
 */
public interface MayFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Level)
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getMayFlow_From()
	 * @model required="true"
	 * @generated
	 */
	Level getFrom();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joana.MayFlow#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Level value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Level)
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getMayFlow_To()
	 * @model required="true"
	 * @generated
	 */
	Level getTo();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joana.MayFlow#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Level value);

} // MayFlow
