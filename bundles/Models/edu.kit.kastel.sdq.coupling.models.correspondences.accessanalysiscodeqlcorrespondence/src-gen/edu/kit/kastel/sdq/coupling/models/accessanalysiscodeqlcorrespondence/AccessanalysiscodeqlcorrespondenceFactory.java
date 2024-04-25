/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage
 * @generated
 */
public interface AccessanalysiscodeqlcorrespondenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessanalysiscodeqlcorrespondenceFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessanalysiscodeqlcorrespondenceFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Access Analysis Code QL Correspondence Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Analysis Code QL Correspondence Root</em>'.
	 * @generated
	 */
	AccessAnalysisCodeQLCorrespondenceRoot createAccessAnalysisCodeQLCorrespondenceRoot();

	/**
	 * Returns a new object of class '<em>Configuration Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Correspondence</em>'.
	 * @generated
	 */
	ConfigurationCorrespondence createConfigurationCorrespondence();

	/**
	 * Returns a new object of class '<em>Data Set Security Level Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Set Security Level Correspondence</em>'.
	 * @generated
	 */
	DataSetSecurityLevelCorrespondence createDataSetSecurityLevelCorrespondence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AccessanalysiscodeqlcorrespondencePackage getAccessanalysiscodeqlcorrespondencePackage();

} //AccessanalysiscodeqlcorrespondenceFactory
