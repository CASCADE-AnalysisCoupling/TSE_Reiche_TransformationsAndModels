/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage
 * @generated
 */
public interface DataflowanalysisextensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataflowanalysisextensionFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Provided Operation Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Operation Identification</em>'.
	 * @generated
	 */
	ProvidedOperationIdentification createProvidedOperationIdentification();

	/**
	 * Returns a new object of class '<em>Provided Parameter Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Parameter Identification</em>'.
	 * @generated
	 */
	ProvidedParameterIdentification createProvidedParameterIdentification();

	/**
	 * Returns a new object of class '<em>Provided Parameter Characteristic Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Parameter Characteristic Annotation</em>'.
	 * @generated
	 */
	ProvidedParameterCharacteristicAnnotation createProvidedParameterCharacteristicAnnotation();

	/**
	 * Returns a new object of class '<em>Extension Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Root</em>'.
	 * @generated
	 */
	ExtensionRoot createExtensionRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataflowanalysisextensionPackage getDataflowanalysisextensionPackage();

} //DataflowanalysisextensionFactory
