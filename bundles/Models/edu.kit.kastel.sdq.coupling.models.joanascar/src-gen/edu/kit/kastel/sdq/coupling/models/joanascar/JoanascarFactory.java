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
	 * Returns a new object of class '<em>Parameter Identifying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Identifying</em>'.
	 * @generated
	 */
	ParameterIdentifying createParameterIdentifying();

	/**
	 * Returns a new object of class '<em>Field Identifying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Identifying</em>'.
	 * @generated
	 */
	FieldIdentifying createFieldIdentifying();

	/**
	 * Returns a new object of class '<em>Level SCAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level SCAR</em>'.
	 * @generated
	 */
	Level_SCAR createLevel_SCAR();

	/**
	 * Returns a new object of class '<em>Entry Point Identifying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point Identifying</em>'.
	 * @generated
	 */
	EntryPointIdentifying createEntryPointIdentifying();

	/**
	 * Returns a new object of class '<em>Result Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Entry</em>'.
	 * @generated
	 */
	ResultEntry createResultEntry();

	/**
	 * Returns a new object of class '<em>Result Entry Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Entry Element</em>'.
	 * @generated
	 */
	<T extends SystemElementIdentifiying_JOANASCAR> ResultEntryElement<T> createResultEntryElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JoanascarPackage getJoanascarPackage();

} //JoanascarFactory
