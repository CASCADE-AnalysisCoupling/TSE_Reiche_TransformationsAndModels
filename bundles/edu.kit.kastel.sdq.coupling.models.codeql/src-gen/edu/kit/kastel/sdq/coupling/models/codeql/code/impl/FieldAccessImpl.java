/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.code.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage;
import edu.kit.kastel.sdq.coupling.models.codeql.code.FieldAccess;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FieldAccessImpl extends VariableAccessImpl implements FieldAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.FIELD_ACCESS;
	}

} //FieldAccessImpl
