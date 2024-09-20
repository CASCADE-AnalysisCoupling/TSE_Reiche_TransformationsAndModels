/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondences Access Analysis JOANA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA#getEntryPointCorrespondences <em>Entry Point Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA#getDataSetLevelCorrespondences <em>Data Set Level Correspondences</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage#getCorrespondences_AccessAnalysisJOANA()
 * @model
 * @generated
 */
public interface Correspondences_AccessAnalysisJOANA extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage#getCorrespondences_AccessAnalysisJOANA_EntryPointCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntryPointCorrespondence> getEntryPointCorrespondences();

	/**
	 * Returns the value of the '<em><b>Data Set Level Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Level Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage#getCorrespondences_AccessAnalysisJOANA_DataSetLevelCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSetLevelCorrespondence> getDataSetLevelCorrespondences();

} // Correspondences_AccessAnalysisJOANA
