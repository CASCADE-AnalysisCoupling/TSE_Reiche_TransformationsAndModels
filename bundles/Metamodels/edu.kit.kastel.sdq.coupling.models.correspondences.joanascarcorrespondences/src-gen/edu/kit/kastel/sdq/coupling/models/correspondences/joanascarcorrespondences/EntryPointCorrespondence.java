/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence#getEntryPoint_JOANA <em>Entry Point JOANA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence#getEntryPoint_SCAR <em>Entry Point SCAR</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getEntryPointCorrespondence()
 * @model
 * @generated
 */
public interface EntryPointCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point JOANA</em>' reference.
	 * @see #setEntryPoint_JOANA(HybridConfiguration)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getEntryPointCorrespondence_EntryPoint_JOANA()
	 * @model required="true"
	 * @generated
	 */
	HybridConfiguration getEntryPoint_JOANA();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence#getEntryPoint_JOANA <em>Entry Point JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point JOANA</em>' reference.
	 * @see #getEntryPoint_JOANA()
	 * @generated
	 */
	void setEntryPoint_JOANA(HybridConfiguration value);

	/**
	 * Returns the value of the '<em><b>Entry Point SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point SCAR</em>' reference.
	 * @see #setEntryPoint_SCAR(EntryPoint_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage#getEntryPointCorrespondence_EntryPoint_SCAR()
	 * @model required="true"
	 * @generated
	 */
	EntryPoint_SCAR getEntryPoint_SCAR();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence#getEntryPoint_SCAR <em>Entry Point SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point SCAR</em>' reference.
	 * @see #getEntryPoint_SCAR()
	 * @generated
	 */
	void setEntryPoint_SCAR(EntryPoint_SCAR value);

} // EntryPointCorrespondence
