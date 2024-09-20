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
	 * Returns a new object of class '<em>Resolved Implementation Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolved Implementation Values</em>'.
	 * @generated
	 */
	ResolvedImplementationValues createResolvedImplementationValues();

	/**
	 * Returns a new object of class '<em>Parameter Resolved Implementation Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Resolved Implementation Values</em>'.
	 * @generated
	 */
	Parameter_ResolvedImplementationValues createParameter_ResolvedImplementationValues();

	/**
	 * Returns a new object of class '<em>Level Resolved Implementation Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level Resolved Implementation Values</em>'.
	 * @generated
	 */
	Level_ResolvedImplementationValues createLevel_ResolvedImplementationValues();

	/**
	 * Returns a new object of class '<em>Entry Point Resolved Implementation Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point Resolved Implementation Values</em>'.
	 * @generated
	 */
	EntryPoint_ResolvedImplementationValues createEntryPoint_ResolvedImplementationValues();

	/**
	 * Returns a new object of class '<em>Resolved Implementation Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolved Implementation Value</em>'.
	 * @generated
	 */
	ResolvedImplementationValue createResolvedImplementationValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JoanaresultingvaluesPackage getJoanaresultingvaluesPackage();

} //JoanaresultingvaluesFactory
