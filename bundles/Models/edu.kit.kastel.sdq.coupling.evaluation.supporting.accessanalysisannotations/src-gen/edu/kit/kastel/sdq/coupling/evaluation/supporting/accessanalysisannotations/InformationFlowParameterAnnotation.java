/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations;

import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow Parameter Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowParameterAnnotation#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage#getInformationFlowParameterAnnotation()
 * @model
 * @generated
 */
public interface InformationFlowParameterAnnotation extends InformationFlowOperationSignatureAnnotation {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage#getInformationFlowParameterAnnotation_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowParameterAnnotation#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // InformationFlowParameterAnnotation
