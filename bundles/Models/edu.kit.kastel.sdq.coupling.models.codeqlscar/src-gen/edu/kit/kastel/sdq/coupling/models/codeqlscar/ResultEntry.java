/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getSource <em>Source</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getSink <em>Sink</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResultEntry()
 * @model
 * @generated
 */
public interface ResultEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ResultEntryElement)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResultEntry_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResultEntryElement<?> getSource();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getSource <em>Source</em>}' containment reference.
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
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResultEntry_Sink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResultEntryElement<?> getSink();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getSink <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' containment reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(ResultEntryElement<?> value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' reference.
	 * @see #setConfig(ConfigurationID_SCAR)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getResultEntry_Config()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationID_SCAR getConfig();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getConfig <em>Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(ConfigurationID_SCAR value);

} // ResultEntry
