/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametert Identifying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.ParametertIdentifying#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getParametertIdentifying()
 * @model
 * @generated
 */
public interface ParametertIdentifying extends SystemElementIdentifying {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage#getParametertIdentifying_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joana.ParametertIdentifying#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParametertIdentifying
