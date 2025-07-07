/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage#getConfigurations()
 * @model
 * @generated
 */
public interface Configurations extends EObject {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage#getConfigurations_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

} // Configurations
