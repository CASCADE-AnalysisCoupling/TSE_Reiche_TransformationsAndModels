/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Node;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingRootImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingRootImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TainttrackingRootImpl extends MinimalEObjectImpl.Container implements TainttrackingRoot {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TainttrackingRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TainttrackingPackage.Literals.TAINTTRACKING_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<Node>(Node.class, this, TainttrackingPackage.TAINTTRACKING_ROOT__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectResolvingEList<Configuration>(Configuration.class, this,
					TainttrackingPackage.TAINTTRACKING_ROOT__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TainttrackingPackage.TAINTTRACKING_ROOT__NODES:
			return getNodes();
		case TainttrackingPackage.TAINTTRACKING_ROOT__CONFIGURATIONS:
			return getConfigurations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TainttrackingPackage.TAINTTRACKING_ROOT__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends Node>) newValue);
			return;
		case TainttrackingPackage.TAINTTRACKING_ROOT__CONFIGURATIONS:
			getConfigurations().clear();
			getConfigurations().addAll((Collection<? extends Configuration>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TainttrackingPackage.TAINTTRACKING_ROOT__NODES:
			getNodes().clear();
			return;
		case TainttrackingPackage.TAINTTRACKING_ROOT__CONFIGURATIONS:
			getConfigurations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TainttrackingPackage.TAINTTRACKING_ROOT__NODES:
			return nodes != null && !nodes.isEmpty();
		case TainttrackingPackage.TAINTTRACKING_ROOT__CONFIGURATIONS:
			return configurations != null && !configurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TainttrackingRootImpl
