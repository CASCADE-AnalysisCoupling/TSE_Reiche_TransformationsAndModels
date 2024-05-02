/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage
 * @generated
 */
public interface EdfajoanacorrespondencesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdfajoanacorrespondencesFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.EdfajoanacorrespondencesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Correspondences EDFAJOANA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correspondences EDFAJOANA</em>'.
	 * @generated
	 */
	Correspondences_EDFAJOANA createCorrespondences_EDFAJOANA();

	/**
	 * Returns a new object of class '<em>Configuration Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Correspondence</em>'.
	 * @generated
	 */
	ConfigurationCorrespondence createConfigurationCorrespondence();

	/**
	 * Returns a new object of class '<em>Literals Level Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literals Level Correspondence</em>'.
	 * @generated
	 */
	LiteralsLevelCorrespondence createLiteralsLevelCorrespondence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdfajoanacorrespondencesPackage getEdfajoanacorrespondencesPackage();

} //EdfajoanacorrespondencesFactory
