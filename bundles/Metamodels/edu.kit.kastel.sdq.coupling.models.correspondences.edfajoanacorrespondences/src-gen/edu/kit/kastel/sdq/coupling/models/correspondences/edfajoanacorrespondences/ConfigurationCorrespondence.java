/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence#getConfiguration_EDFA <em>Configuration EDFA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence#getConfiguration_JOANA <em>Configuration JOANA</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage#getConfigurationCorrespondence()
 * @model
 * @generated
 */
public interface ConfigurationCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration EDFA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration EDFA</em>' reference.
	 * @see #setConfiguration_EDFA(FullyImplicitConfiguration)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage#getConfigurationCorrespondence_Configuration_EDFA()
	 * @model required="true"
	 * @generated
	 */
	FullyImplicitConfiguration getConfiguration_EDFA();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence#getConfiguration_EDFA <em>Configuration EDFA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration EDFA</em>' reference.
	 * @see #getConfiguration_EDFA()
	 * @generated
	 */
	void setConfiguration_EDFA(FullyImplicitConfiguration value);

	/**
	 * Returns the value of the '<em><b>Configuration JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration JOANA</em>' reference.
	 * @see #setConfiguration_JOANA(HybridConfiguration)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage#getConfigurationCorrespondence_Configuration_JOANA()
	 * @model required="true"
	 * @generated
	 */
	HybridConfiguration getConfiguration_JOANA();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence#getConfiguration_JOANA <em>Configuration JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration JOANA</em>' reference.
	 * @see #getConfiguration_JOANA()
	 * @generated
	 */
	void setConfiguration_JOANA(HybridConfiguration value);

} // ConfigurationCorrespondence
