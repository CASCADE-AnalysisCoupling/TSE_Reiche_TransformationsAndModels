/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.SingleElementConfiguration#getConfigurationElement <em>Configuration Element</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage#getSingleElementConfiguration()
 * @model
 * @generated
 */
public interface SingleElementConfiguration extends Configuration {
	/**
	 * Returns the value of the '<em><b>Configuration Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Element</em>' reference.
	 * @see #setConfigurationElement(EObject)
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage#getSingleElementConfiguration_ConfigurationElement()
	 * @model required="true"
	 * @generated
	 */
	EObject getConfigurationElement();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.SingleElementConfiguration#getConfigurationElement <em>Configuration Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Element</em>' reference.
	 * @see #getConfigurationElement()
	 * @generated
	 */
	void setConfigurationElement(EObject value);

} // SingleElementConfiguration
