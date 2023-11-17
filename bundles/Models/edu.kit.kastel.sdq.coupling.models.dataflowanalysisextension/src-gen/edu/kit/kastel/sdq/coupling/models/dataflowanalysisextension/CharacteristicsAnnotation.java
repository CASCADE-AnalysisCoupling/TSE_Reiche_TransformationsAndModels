/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristics Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.CharacteristicsAnnotation#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getCharacteristicsAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface CharacteristicsAnnotation extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getCharacteristicsAnnotation_Characteristics()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumCharacteristic> getCharacteristics();

} // CharacteristicsAnnotation
