/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot#getProvidedParameterIdentification <em>Provided Parameter Identification</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot#getParameterAnnotations <em>Parameter Annotations</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getExtensionRoot()
 * @model
 * @generated
 */
public interface ExtensionRoot extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Provided Parameter Identification</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Parameter Identification</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getExtensionRoot_ProvidedParameterIdentification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProvidedParameterIdentification> getProvidedParameterIdentification();

	/**
	 * Returns the value of the '<em><b>Parameter Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Annotations</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage#getExtensionRoot_ParameterAnnotations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProvidedParameterCharacteristicAnnotation> getParameterAnnotations();

} // ExtensionRoot
