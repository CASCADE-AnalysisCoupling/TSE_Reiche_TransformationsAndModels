/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage
 * @generated
 */
public interface JoanascarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanascarFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source Code Analysis Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Code Analysis Result</em>'.
	 * @generated
	 */
	SourceCodeAnalysisResult createSourceCodeAnalysisResult();

	/**
	 * Returns a new object of class '<em>Parameter SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter SCAR</em>'.
	 * @generated
	 */
	Parameter_SCAR createParameter_SCAR();

	/**
	 * Returns a new object of class '<em>Field SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field SCAR</em>'.
	 * @generated
	 */
	Field_SCAR createField_SCAR();

	/**
	 * Returns a new object of class '<em>Level SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level SCAR</em>'.
	 * @generated
	 */
	Level_SCAR createLevel_SCAR();

	/**
	 * Returns a new object of class '<em>Entry Point SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point SCAR</em>'.
	 * @generated
	 */
	EntryPoint_SCAR createEntryPoint_SCAR();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	<T extends SystemElement_SCAR> Source<T> createSource();

	/**
	 * Returns a new object of class '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink</em>'.
	 * @generated
	 */
	<T extends SystemElement_SCAR> Sink<T> createSink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JoanascarPackage getJoanascarPackage();

} //JoanascarFactory
