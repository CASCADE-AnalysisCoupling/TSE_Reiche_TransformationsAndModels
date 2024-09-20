/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

import edu.kit.kastel.sdq.coupling.models.java.members.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Identifying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.FieldIdentifying#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getFieldIdentifying()
 * @model
 * @generated
 */
public interface FieldIdentifying extends SystemElementIdentifying {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getFieldIdentifying_Field()
	 * @model required="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joana.FieldIdentifying#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // FieldIdentifying
