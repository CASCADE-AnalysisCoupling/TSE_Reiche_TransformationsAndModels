/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JOANASCAR Correspondences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences#getEntryPointCorrespondences <em>Entry Point Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences#getLevelCorrespondences <em>Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences#getSystemElementCorrespondences <em>System Element Correspondences</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getJOANASCARCorrespondences()
 * @model
 * @generated
 */
public interface JOANASCARCorrespondences extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getJOANASCARCorrespondences_EntryPointCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntryPointCorrespondence> getEntryPointCorrespondences();

	/**
	 * Returns the value of the '<em><b>Level Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getJOANASCARCorrespondences_LevelCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<LevelCorrespondence> getLevelCorrespondences();

	/**
	 * Returns the value of the '<em><b>System Element Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.SystemElementCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Element Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getJOANASCARCorrespondences_SystemElementCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemElementCorrespondence> getSystemElementCorrespondences();

} // JOANASCARCorrespondences
