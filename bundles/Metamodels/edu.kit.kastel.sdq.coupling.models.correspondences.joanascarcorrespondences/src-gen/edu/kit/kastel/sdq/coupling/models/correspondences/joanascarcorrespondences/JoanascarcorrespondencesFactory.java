/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage
 * @generated
 */
public interface JoanascarcorrespondencesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanascarcorrespondencesFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>JOANASCAR Correspondences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JOANASCAR Correspondences</em>'.
	 * @generated
	 */
	JOANASCARCorrespondences createJOANASCARCorrespondences();

	/**
	 * Returns a new object of class '<em>Entry Point Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point Correspondence</em>'.
	 * @generated
	 */
	EntryPointCorrespondence createEntryPointCorrespondence();

	/**
	 * Returns a new object of class '<em>Level Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level Correspondence</em>'.
	 * @generated
	 */
	LevelCorrespondence createLevelCorrespondence();

	/**
	 * Returns a new object of class '<em>Parameter Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Correspondence</em>'.
	 * @generated
	 */
	ParameterCorrespondence createParameterCorrespondence();

	/**
	 * Returns a new object of class '<em>Field Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Correspondence</em>'.
	 * @generated
	 */
	FieldCorrespondence createFieldCorrespondence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JoanascarcorrespondencesPackage getJoanascarcorrespondencesPackage();

} //JoanascarcorrespondencesFactory
