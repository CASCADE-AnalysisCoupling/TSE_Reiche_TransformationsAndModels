/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getLevel <em>Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getEntryPoint()
 * @model
 * @generated
 */
public interface EntryPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joana.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getEntryPoint_Level()
	 * @model
	 * @generated
	 */
	EList<Level> getLevel();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joana.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getEntryPoint_Annotation()
	 * @model
	 * @generated
	 */
	EList<Annotation> getAnnotation();

} // EntryPoint
