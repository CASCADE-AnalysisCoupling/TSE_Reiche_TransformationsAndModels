/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage
 * @generated
 */
public interface JoanaresultingvaluesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanaresultingvaluesFactory eINSTANCE = edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>JOANA Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JOANA Resulting Values</em>'.
	 * @generated
	 */
	JOANAResultingValues createJOANAResultingValues();

	/**
	 * Returns a new object of class '<em>Parameter Identification JOANA Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Identification JOANA Resulting Values</em>'.
	 * @generated
	 */
	ParameterIdentification_JOANAResultingValues createParameterIdentification_JOANAResultingValues();

	/**
	 * Returns a new object of class '<em>Level Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level Resulting Values</em>'.
	 * @generated
	 */
	Level_ResultingValues createLevel_ResultingValues();

	/**
	 * Returns a new object of class '<em>Entry Point Identification Resulting Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point Identification Resulting Values</em>'.
	 * @generated
	 */
	EntryPointIdentification_ResultingValues createEntryPointIdentification_ResultingValues();

	/**
	 * Returns a new object of class '<em>Resulting Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resulting Value</em>'.
	 * @generated
	 */
	ResultingValue createResultingValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JoanaresultingvaluesPackage getJoanaresultingvaluesPackage();

} //JoanaresultingvaluesFactory
