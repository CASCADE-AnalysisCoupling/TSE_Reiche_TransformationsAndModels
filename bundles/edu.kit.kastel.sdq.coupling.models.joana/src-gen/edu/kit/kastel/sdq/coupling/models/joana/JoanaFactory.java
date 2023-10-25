/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage
 * @generated
 */
public interface JoanaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanaFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JOANA Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JOANA Root</em>'.
	 * @generated
	 */
	JOANARoot createJOANARoot();

	/**
	 * Returns a new object of class '<em>Information Flow Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Flow Annotation</em>'.
	 * @generated
	 */
	InformationFlowAnnotation createInformationFlowAnnotation();

	/**
	 * Returns a new object of class '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point</em>'.
	 * @generated
	 */
	EntryPoint createEntryPoint();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	Source createSource();

	/**
	 * Returns a new object of class '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink</em>'.
	 * @generated
	 */
	Sink createSink();

	/**
	 * Returns a new object of class '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level</em>'.
	 * @generated
	 */
	Level createLevel();

	/**
	 * Returns a new object of class '<em>May Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>May Flow</em>'.
	 * @generated
	 */
	MayFlow createMayFlow();

	/**
	 * Returns a new object of class '<em>Lattice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lattice</em>'.
	 * @generated
	 */
	Lattice createLattice();

	/**
	 * Returns a new object of class '<em>Parametert Identifying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametert Identifying</em>'.
	 * @generated
	 */
	ParametertIdentifying createParametertIdentifying();

	/**
	 * Returns a new object of class '<em>Method Identifying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Identifying</em>'.
	 * @generated
	 */
	MethodIdentifying createMethodIdentifying();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JoanaPackage getJoanaPackage();

} //JoanaFactory
