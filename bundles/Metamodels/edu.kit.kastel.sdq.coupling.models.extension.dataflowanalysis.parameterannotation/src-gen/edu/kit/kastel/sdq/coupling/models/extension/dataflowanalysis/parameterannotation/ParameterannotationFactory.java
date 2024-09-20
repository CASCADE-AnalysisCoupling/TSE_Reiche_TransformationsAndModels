/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage
 * @generated
 */
public interface ParameterannotationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterannotationFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationFactoryImpl
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
	 * Returns a new object of class '<em>General Operation Parameter Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Operation Parameter Identification</em>'.
	 * @generated
	 */
	GeneralOperationParameterIdentification createGeneralOperationParameterIdentification();

	/**
	 * Returns a new object of class '<em>Provided Operation Parameter Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Operation Parameter Identification</em>'.
	 * @generated
	 */
	ProvidedOperationParameterIdentification createProvidedOperationParameterIdentification();

	/**
	 * Returns a new object of class '<em>Parameter Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Annotation</em>'.
	 * @generated
	 */
	ParameterAnnotation createParameterAnnotation();

	/**
	 * Returns a new object of class '<em>Parameter Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Annotations</em>'.
	 * @generated
	 */
	ParameterAnnotations createParameterAnnotations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParameterannotationPackage getParameterannotationPackage();

} //ParameterannotationFactory
