/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import org.eclipse.emf.ecore.EClass;

import org.kit.kastel.sdq.coupling.models.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SecurityLevelImpl extends EntityImpl implements SecurityLevel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TainttrackingPackage.Literals.SECURITY_LEVEL;
	}

} //SecurityLevelImpl
