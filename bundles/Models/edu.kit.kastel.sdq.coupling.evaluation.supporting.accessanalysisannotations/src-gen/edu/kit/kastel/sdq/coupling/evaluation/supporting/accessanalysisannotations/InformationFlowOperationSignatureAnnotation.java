/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations;

import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow Operation Signature Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowOperationSignatureAnnotation#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage#getInformationFlowOperationSignatureAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface InformationFlowOperationSignatureAnnotation extends InformationFlowAnnotation {
	/**
	 * Returns the value of the '<em><b>Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Signature</em>' reference.
	 * @see #setOperationSignature(OperationSignature)
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage#getInformationFlowOperationSignatureAnnotation_OperationSignature()
	 * @model required="true"
	 * @generated
	 */
	OperationSignature getOperationSignature();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowOperationSignatureAnnotation#getOperationSignature <em>Operation Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Signature</em>' reference.
	 * @see #getOperationSignature()
	 * @generated
	 */
	void setOperationSignature(OperationSignature value);

} // InformationFlowOperationSignatureAnnotation
