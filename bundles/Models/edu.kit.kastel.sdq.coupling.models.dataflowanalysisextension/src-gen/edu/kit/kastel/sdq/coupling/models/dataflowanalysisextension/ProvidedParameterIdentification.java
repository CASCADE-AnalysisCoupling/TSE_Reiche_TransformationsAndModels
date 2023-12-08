/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;

import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Parameter Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification#getProvidedOperation <em>Provided Operation</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getProvidedParameterIdentification()
 * @model
 * @generated
 */
public interface ProvidedParameterIdentification extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Provided Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Operation</em>' containment reference.
	 * @see #setProvidedOperation(ProvidedOperationIdentification)
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getProvidedParameterIdentification_ProvidedOperation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProvidedOperationIdentification getProvidedOperation();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification#getProvidedOperation <em>Provided Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Operation</em>' containment reference.
	 * @see #getProvidedOperation()
	 * @generated
	 */
	void setProvidedOperation(ProvidedOperationIdentification value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getProvidedParameterIdentification_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ProvidedParameterIdentification
