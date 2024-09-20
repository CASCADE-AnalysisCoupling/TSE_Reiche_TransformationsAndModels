/**
 */
package edu.kit.kastel.sdq.coupling.models.java;

import edu.kit.kastel.sdq.coupling.models.identifier.Entity;

import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.java.Package#getSubpackage <em>Subpackage</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.java.Package#getClassorinterface <em>Classorinterface</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.java.JavaPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Entity {
	/**
	 * Returns the value of the '<em><b>Subpackage</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.java.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpackage</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.java.JavaPackage#getPackage_Subpackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getSubpackage();

	/**
	 * Returns the value of the '<em><b>Classorinterface</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classorinterface</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.java.JavaPackage#getPackage_Classorinterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassOrInterfaceType> getClassorinterface();

} // Package
