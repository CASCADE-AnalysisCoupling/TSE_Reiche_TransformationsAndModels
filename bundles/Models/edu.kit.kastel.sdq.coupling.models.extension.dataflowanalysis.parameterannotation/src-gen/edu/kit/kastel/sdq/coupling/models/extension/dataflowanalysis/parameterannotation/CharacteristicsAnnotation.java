/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristics Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.CharacteristicsAnnotation#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage#getCharacteristicsAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface CharacteristicsAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage#getCharacteristicsAnnotation_Characteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumCharacteristic> getCharacteristics();

} // CharacteristicsAnnotation
