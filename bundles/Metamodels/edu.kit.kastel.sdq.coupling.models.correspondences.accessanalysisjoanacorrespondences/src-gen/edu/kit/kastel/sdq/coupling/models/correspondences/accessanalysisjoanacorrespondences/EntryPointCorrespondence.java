/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence#getAccessAnalysisConfig <em>Access Analysis Config</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence#getEntryPoint <em>Entry Point</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage#getEntryPointCorrespondence()
 * @model
 * @generated
 */
public interface EntryPointCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Analysis Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Analysis Config</em>' reference.
	 * @see #setAccessAnalysisConfig(FullyImplicitConfiguration)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage#getEntryPointCorrespondence_AccessAnalysisConfig()
	 * @model required="true"
	 * @generated
	 */
	FullyImplicitConfiguration getAccessAnalysisConfig();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence#getAccessAnalysisConfig <em>Access Analysis Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Analysis Config</em>' reference.
	 * @see #getAccessAnalysisConfig()
	 * @generated
	 */
	void setAccessAnalysisConfig(FullyImplicitConfiguration value);

	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' reference.
	 * @see #setEntryPoint(HybridConfiguration)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage#getEntryPointCorrespondence_EntryPoint()
	 * @model required="true"
	 * @generated
	 */
	HybridConfiguration getEntryPoint();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence#getEntryPoint <em>Entry Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' reference.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(HybridConfiguration value);

} // EntryPointCorrespondence
