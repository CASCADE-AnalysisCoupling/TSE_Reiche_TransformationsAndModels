/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.code.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage;
import edu.kit.kastel.sdq.coupling.models.codeql.code.VariableAccess;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class VariableAccessImpl extends ExpressionImpl implements VariableAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.VARIABLE_ACCESS;
	}

} //VariableAccessImpl
