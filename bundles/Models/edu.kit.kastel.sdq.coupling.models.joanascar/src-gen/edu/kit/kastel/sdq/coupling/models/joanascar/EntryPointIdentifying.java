/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point Identifying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getEntryPointIdentifying()
 * @model
 * @generated
 */
public interface EntryPointIdentifying extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getEntryPointIdentifying_Tag()
	 * @model required="true"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

} // EntryPointIdentifying
