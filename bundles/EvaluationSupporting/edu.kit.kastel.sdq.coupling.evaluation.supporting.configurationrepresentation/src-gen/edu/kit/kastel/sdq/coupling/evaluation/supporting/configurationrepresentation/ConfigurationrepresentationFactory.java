/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage
 * @generated
 */
public interface ConfigurationrepresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationrepresentationFactory eINSTANCE = edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Configurations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configurations</em>'.
	 * @generated
	 */
	Configurations createConfigurations();

	/**
	 * Returns a new object of class '<em>Hybrid Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid Configuration</em>'.
	 * @generated
	 */
	HybridConfiguration createHybridConfiguration();

	/**
	 * Returns a new object of class '<em>Fully Implicit Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fully Implicit Configuration</em>'.
	 * @generated
	 */
	FullyImplicitConfiguration createFullyImplicitConfiguration();

	/**
	 * Returns a new object of class '<em>Single Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Element Configuration</em>'.
	 * @generated
	 */
	SingleElementConfiguration createSingleElementConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigurationrepresentationPackage getConfigurationrepresentationPackage();

} //ConfigurationrepresentationFactory
