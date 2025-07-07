/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking;

import edu.kit.kastel.sdq.coupling.models.java.members.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.FieldAnnotation#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getFieldAnnotation()
 * @model
 * @generated
 */
public interface FieldAnnotation extends SecurityLevelAnnotation {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage#getFieldAnnotation_Field()
	 * @model required="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.FieldAnnotation#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // FieldAnnotation
