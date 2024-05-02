/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondences EDFAJOANA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA#getConfigurationCorrespondences <em>Configuration Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA#getLiteralLevelCorrespondences <em>Literal Level Correspondences</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage#getCorrespondences_EDFAJOANA()
 * @model
 * @generated
 */
public interface Correspondences_EDFAJOANA extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage#getCorrespondences_EDFAJOANA_ConfigurationCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationCorrespondence> getConfigurationCorrespondences();

	/**
	 * Returns the value of the '<em><b>Literal Level Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Level Correspondences</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage#getCorrespondences_EDFAJOANA_LiteralLevelCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiteralsLevelCorrespondence> getLiteralLevelCorrespondences();

} // Correspondences_EDFAJOANA
