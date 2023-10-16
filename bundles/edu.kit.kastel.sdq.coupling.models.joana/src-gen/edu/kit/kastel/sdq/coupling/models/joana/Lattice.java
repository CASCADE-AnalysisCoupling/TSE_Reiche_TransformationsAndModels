/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lattice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.Lattice#getMayFlow <em>May Flow</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getLattice()
 * @model
 * @generated
 */
public interface Lattice extends EObject {
	/**
	 * Returns the value of the '<em><b>May Flow</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joana.MayFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Flow</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getLattice_MayFlow()
	 * @model containment="true"
	 * @generated
	 */
	EList<MayFlow> getMayFlow();

} // Lattice
