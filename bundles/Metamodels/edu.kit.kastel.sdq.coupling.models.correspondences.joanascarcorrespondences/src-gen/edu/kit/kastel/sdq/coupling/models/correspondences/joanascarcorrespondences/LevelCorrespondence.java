/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences;

import edu.kit.kastel.sdq.coupling.models.joana.Level;

import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence#getLevel_JOANA <em>Level JOANA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence#getLevel_SCAR <em>Level SCAR</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getLevelCorrespondence()
 * @model
 * @generated
 */
public interface LevelCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Level JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level JOANA</em>' reference.
	 * @see #setLevel_JOANA(Level)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getLevelCorrespondence_Level_JOANA()
	 * @model required="true"
	 * @generated
	 */
	Level getLevel_JOANA();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence#getLevel_JOANA <em>Level JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level JOANA</em>' reference.
	 * @see #getLevel_JOANA()
	 * @generated
	 */
	void setLevel_JOANA(Level value);

	/**
	 * Returns the value of the '<em><b>Level SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level SCAR</em>' reference.
	 * @see #setLevel_SCAR(Level_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getLevelCorrespondence_Level_SCAR()
	 * @model required="true"
	 * @generated
	 */
	Level_SCAR getLevel_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence#getLevel_SCAR <em>Level SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level SCAR</em>' reference.
	 * @see #getLevel_SCAR()
	 * @generated
	 */
	void setLevel_SCAR(Level_SCAR value);

} // LevelCorrespondence
