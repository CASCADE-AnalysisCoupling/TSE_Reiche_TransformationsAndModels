/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JOANA Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.JOANARoot#getEntrypoint <em>Entrypoint</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getJOANARoot()
 * @model
 * @generated
 */
public interface JOANARoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getJOANARoot_Entrypoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EntryPoint> getEntrypoint();

} // JOANARoot
