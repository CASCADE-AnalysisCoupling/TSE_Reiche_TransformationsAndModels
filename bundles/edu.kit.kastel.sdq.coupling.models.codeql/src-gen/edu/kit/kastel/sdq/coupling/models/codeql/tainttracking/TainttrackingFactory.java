/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage
 * @generated
 */
public interface TainttrackingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TainttrackingFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Node</em>'.
	 * @generated
	 */
	ExpressionNode createExpressionNode();

	/**
	 * Returns a new object of class '<em>Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Node</em>'.
	 * @generated
	 */
	ParameterNode createParameterNode();

	/**
	 * Returns a new object of class '<em>Security Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Level</em>'.
	 * @generated
	 */
	SecurityLevel createSecurityLevel();

	/**
	 * Returns a new object of class '<em>Data Flow Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow Root</em>'.
	 * @generated
	 */
	DataFlowRoot createDataFlowRoot();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Security Level Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Level Annotation</em>'.
	 * @generated
	 */
	SecurityLevelAnnotation createSecurityLevelAnnotation();

	/**
	 * Returns a new object of class '<em>Parameter Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Annotation</em>'.
	 * @generated
	 */
	ParameterAnnotation createParameterAnnotation();

	/**
	 * Returns a new object of class '<em>Allowed Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allowed Flow</em>'.
	 * @generated
	 */
	AllowedFlow createAllowedFlow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TainttrackingPackage getTainttrackingPackage();

} //TainttrackingFactory
