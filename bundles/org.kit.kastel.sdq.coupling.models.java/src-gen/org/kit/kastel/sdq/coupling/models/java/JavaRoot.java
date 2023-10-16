/**
 */
package org.kit.kastel.sdq.coupling.models.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.kit.kastel.sdq.coupling.models.java.types.CollectionType;
import org.kit.kastel.sdq.coupling.models.java.types.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.JavaRoot#getPrimitivetypes <em>Primitivetypes</em>}</li>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.JavaRoot#getCollectiontypes <em>Collectiontypes</em>}</li>
 *   <li>{@link org.kit.kastel.sdq.coupling.models.java.JavaRoot#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see org.kit.kastel.sdq.coupling.models.java.JavaPackage#getJavaRoot()
 * @model
 * @generated
 */
public interface JavaRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Primitivetypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.kit.kastel.sdq.coupling.models.java.types.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitivetypes</em>' containment reference list.
	 * @see org.kit.kastel.sdq.coupling.models.java.JavaPackage#getJavaRoot_Primitivetypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveType> getPrimitivetypes();

	/**
	 * Returns the value of the '<em><b>Collectiontypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.kit.kastel.sdq.coupling.models.java.types.CollectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collectiontypes</em>' containment reference list.
	 * @see org.kit.kastel.sdq.coupling.models.java.JavaPackage#getJavaRoot_Collectiontypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollectionType> getCollectiontypes();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(org.kit.kastel.sdq.coupling.models.java.Package)
	 * @see org.kit.kastel.sdq.coupling.models.java.JavaPackage#getJavaRoot_Package()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.kit.kastel.sdq.coupling.models.java.Package getPackage();

	/**
	 * Sets the value of the '{@link org.kit.kastel.sdq.coupling.models.java.JavaRoot#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.kit.kastel.sdq.coupling.models.java.Package value);

} // JavaRoot
