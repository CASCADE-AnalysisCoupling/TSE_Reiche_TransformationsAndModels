/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getLattice <em>Lattice</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getMethodIdentification <em>Method Identification</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getEntryPoint()
 * @model
 * @generated
 */
public interface EntryPoint extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joana.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getEntryPoint_Level()
	 * @model containment="true"
	 * @generated
	 */
	EList<Level> getLevel();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getEntryPoint_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<InformationFlowAnnotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Lattice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lattice</em>' containment reference.
	 * @see #setLattice(Lattice)
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getEntryPoint_Lattice()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Lattice getLattice();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getLattice <em>Lattice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lattice</em>' containment reference.
	 * @see #getLattice()
	 * @generated
	 */
	void setLattice(Lattice value);

	/**
	 * Returns the value of the '<em><b>Method Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Identification</em>' containment reference.
	 * @see #setMethodIdentification(MethodIdentifying)
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getEntryPoint_MethodIdentification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MethodIdentifying getMethodIdentification();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getMethodIdentification <em>Method Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Identification</em>' containment reference.
	 * @see #getMethodIdentification()
	 * @generated
	 */
	void setMethodIdentification(MethodIdentifying value);

} // EntryPoint
