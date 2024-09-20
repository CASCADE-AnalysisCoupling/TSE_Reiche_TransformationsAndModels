/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage
 * @generated
 */
public interface AccessanalysisannotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessanalysisannotationsFactory eINSTANCE = edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Information Flow Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Flow Annotation</em>'.
	 * @generated
	 */
	InformationFlowAnnotation createInformationFlowAnnotation();

	/**
	 * Returns a new object of class '<em>Information Flow Call Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Flow Call Annotation</em>'.
	 * @generated
	 */
	InformationFlowCallAnnotation createInformationFlowCallAnnotation();

	/**
	 * Returns a new object of class '<em>Information Flow Return Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Flow Return Annotation</em>'.
	 * @generated
	 */
	InformationFlowReturnAnnotation createInformationFlowReturnAnnotation();

	/**
	 * Returns a new object of class '<em>Information Flow Parameter Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Flow Parameter Annotation</em>'.
	 * @generated
	 */
	InformationFlowParameterAnnotation createInformationFlowParameterAnnotation();

	/**
	 * Returns a new object of class '<em>Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotations</em>'.
	 * @generated
	 */
	Annotations createAnnotations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AccessanalysisannotationsPackage getAccessanalysisannotationsPackage();

} //AccessanalysisannotationsFactory
