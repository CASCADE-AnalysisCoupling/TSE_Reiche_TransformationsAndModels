/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getSource <em>Source</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getSink <em>Sink</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getRuleId <em>Rule Id</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ResultEntryElement)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResult_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResultEntryElement<?> getSource();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ResultEntryElement<?> value);

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' containment reference.
	 * @see #setSink(ResultEntryElement)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResult_Sink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResultEntryElement<?> getSink();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getSink <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' containment reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(ResultEntryElement<?> value);

	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Id</em>' reference.
	 * @see #setRuleId(RuleId)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResult_RuleId()
	 * @model required="true"
	 * @generated
	 */
	RuleId getRuleId();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getRuleId <em>Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Id</em>' reference.
	 * @see #getRuleId()
	 * @generated
	 */
	void setRuleId(RuleId value);

} // Result
