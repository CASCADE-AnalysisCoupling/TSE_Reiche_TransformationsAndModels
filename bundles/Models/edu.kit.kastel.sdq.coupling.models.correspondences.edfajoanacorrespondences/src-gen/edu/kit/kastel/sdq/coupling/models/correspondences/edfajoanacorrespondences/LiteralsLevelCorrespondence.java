/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences;

import edu.kit.kastel.sdq.coupling.models.joana.Level;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literals Level Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence#getLiterals_EDFA <em>Literals EDFA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence#getLevel_JOANA <em>Level JOANA</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage#getLiteralsLevelCorrespondence()
 * @model
 * @generated
 */
public interface LiteralsLevelCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Literals EDFA</b></em>' reference list.
	 * The list contents are of type {@link org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals EDFA</em>' reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage#getLiteralsLevelCorrespondence_Literals_EDFA()
	 * @model required="true"
	 * @generated
	 */
	EList<Literal> getLiterals_EDFA();

	/**
	 * Returns the value of the '<em><b>Level JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level JOANA</em>' reference.
	 * @see #setLevel_JOANA(Level)
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage#getLiteralsLevelCorrespondence_Level_JOANA()
	 * @model required="true"
	 * @generated
	 */
	Level getLevel_JOANA();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence#getLevel_JOANA <em>Level JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level JOANA</em>' reference.
	 * @see #getLevel_JOANA()
	 * @generated
	 */
	void setLevel_JOANA(Level value);

} // LiteralsLevelCorrespondence
