/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Parameter Characteristic Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation#getProvidedParameter <em>Provided Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getProvidedParameterCharacteristicAnnotation()
 * @model
 * @generated
 */
public interface ProvidedParameterCharacteristicAnnotation extends IdentifiedElement, CharacteristicsAnnotation {
	/**
	 * Returns the value of the '<em><b>Provided Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Parameter</em>' reference.
	 * @see #setProvidedParameter(ProvidedParameterIdentification)
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getProvidedParameterCharacteristicAnnotation_ProvidedParameter()
	 * @model required="true"
	 * @generated
	 */
	ProvidedParameterIdentification getProvidedParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation#getProvidedParameter <em>Provided Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Parameter</em>' reference.
	 * @see #getProvidedParameter()
	 * @generated
	 */
	void setProvidedParameter(ProvidedParameterIdentification value);

} // ProvidedParameterCharacteristicAnnotation
