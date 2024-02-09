/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation#getParameterIdentification <em>Parameter Identification</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage#getParameterAnnotation()
 * @model
 * @generated
 */
public interface ParameterAnnotation extends CharacteristicsAnnotation, IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Parameter Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Identification</em>' containment reference.
	 * @see #setParameterIdentification(GeneralOperationParameterIdentification)
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage#getParameterAnnotation_ParameterIdentification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneralOperationParameterIdentification getParameterIdentification();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation#getParameterIdentification <em>Parameter Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Identification</em>' containment reference.
	 * @see #getParameterIdentification()
	 * @generated
	 */
	void setParameterIdentification(GeneralOperationParameterIdentification value);

} // ParameterAnnotation
