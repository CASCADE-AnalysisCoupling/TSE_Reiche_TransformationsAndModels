/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage
 * @generated
 */
public interface EdfacodeqlcorrespondencesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdfacodeqlcorrespondencesFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.EdfacodeqlcorrespondencesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Correspondences EDFA Code QL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correspondences EDFA Code QL</em>'.
	 * @generated
	 */
	Correspondences_EDFACodeQL createCorrespondences_EDFACodeQL();

	/**
	 * Returns a new object of class '<em>Literal Security Level Correspondence EDFA Code QL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Security Level Correspondence EDFA Code QL</em>'.
	 * @generated
	 */
	LiteralSecurityLevelCorrespondence_EDFACodeQL createLiteralSecurityLevelCorrespondence_EDFACodeQL();

	/**
	 * Returns a new object of class '<em>Configuration Correspondence EDFA Code QL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Correspondence EDFA Code QL</em>'.
	 * @generated
	 */
	ConfigurationCorrespondence_EDFACodeQL createConfigurationCorrespondence_EDFACodeQL();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdfacodeqlcorrespondencesPackage getEdfacodeqlcorrespondencesPackage();

} //EdfacodeqlcorrespondencesFactory
