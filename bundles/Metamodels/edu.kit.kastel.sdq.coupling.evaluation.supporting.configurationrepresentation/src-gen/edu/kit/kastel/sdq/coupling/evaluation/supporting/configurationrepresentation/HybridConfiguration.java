/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration#getAdditionalInputs <em>Additional Inputs</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration#getMainConfigurationElement <em>Main Configuration Element</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage#getHybridConfiguration()
 * @model
 * @generated
 */
public interface HybridConfiguration extends Configuration {
	/**
	 * Returns the value of the '<em><b>Additional Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Inputs</em>' reference list.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage#getHybridConfiguration_AdditionalInputs()
	 * @model required="true"
	 * @generated
	 */
	EList<EObject> getAdditionalInputs();

	/**
	 * Returns the value of the '<em><b>Main Configuration Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Configuration Element</em>' reference.
	 * @see #setMainConfigurationElement(EObject)
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage#getHybridConfiguration_MainConfigurationElement()
	 * @model required="true"
	 * @generated
	 */
	EObject getMainConfigurationElement();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration#getMainConfigurationElement <em>Main Configuration Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Configuration Element</em>' reference.
	 * @see #getMainConfigurationElement()
	 * @generated
	 */
	void setMainConfigurationElement(EObject value);

} // HybridConfiguration
