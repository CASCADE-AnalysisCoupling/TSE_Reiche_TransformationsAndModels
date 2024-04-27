/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage
 * @generated
 */
public interface AccessanalysisjoanacorrespondencesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessanalysisjoanacorrespondencesFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.AccessanalysisjoanacorrespondencesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Correspondences Access Analysis JOANA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correspondences Access Analysis JOANA</em>'.
	 * @generated
	 */
	Correspondences_AccessAnalysisJOANA createCorrespondences_AccessAnalysisJOANA();

	/**
	 * Returns a new object of class '<em>Entry Point Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point Correspondence</em>'.
	 * @generated
	 */
	EntryPointCorrespondence createEntryPointCorrespondence();

	/**
	 * Returns a new object of class '<em>Data Set Level Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Set Level Correspondence</em>'.
	 * @generated
	 */
	DataSetLevelCorrespondence createDataSetLevelCorrespondence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AccessanalysisjoanacorrespondencesPackage getAccessanalysisjoanacorrespondencesPackage();

} //AccessanalysisjoanacorrespondencesFactory
