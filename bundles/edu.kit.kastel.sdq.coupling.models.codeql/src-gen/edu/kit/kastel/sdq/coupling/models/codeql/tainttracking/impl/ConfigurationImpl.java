/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import edu.kit.kastel.sdq.coupling.models.identifier.impl.IdentifiedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ConfigurationImpl#getAppliedSecurityLevel <em>Applied Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ConfigurationImpl#getSecurityLevelAnnotations <em>Security Level Annotations</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ConfigurationImpl#getAllowedFlows <em>Allowed Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends IdentifiedElementImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getAppliedSecurityLevel() <em>Applied Security Level</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel> appliedSecurityLevel;

	/**
	 * The cached value of the '{@link #getSecurityLevelAnnotations() <em>Security Level Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevelAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevelAnnotation> securityLevelAnnotations;

	/**
	 * The cached value of the '{@link #getAllowedFlows() <em>Allowed Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AllowedFlow> allowedFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TainttrackingPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityLevel> getAppliedSecurityLevel() {
		if (appliedSecurityLevel == null) {
			appliedSecurityLevel = new EObjectResolvingEList<SecurityLevel>(SecurityLevel.class, this,
					TainttrackingPackage.CONFIGURATION__APPLIED_SECURITY_LEVEL);
		}
		return appliedSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityLevelAnnotation> getSecurityLevelAnnotations() {
		if (securityLevelAnnotations == null) {
			securityLevelAnnotations = new EObjectContainmentEList<SecurityLevelAnnotation>(
					SecurityLevelAnnotation.class, this,
					TainttrackingPackage.CONFIGURATION__SECURITY_LEVEL_ANNOTATIONS);
		}
		return securityLevelAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllowedFlow> getAllowedFlows() {
		if (allowedFlows == null) {
			allowedFlows = new EObjectContainmentEList<AllowedFlow>(AllowedFlow.class, this,
					TainttrackingPackage.CONFIGURATION__ALLOWED_FLOWS);
		}
		return allowedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TainttrackingPackage.CONFIGURATION__SECURITY_LEVEL_ANNOTATIONS:
			return ((InternalEList<?>) getSecurityLevelAnnotations()).basicRemove(otherEnd, msgs);
		case TainttrackingPackage.CONFIGURATION__ALLOWED_FLOWS:
			return ((InternalEList<?>) getAllowedFlows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TainttrackingPackage.CONFIGURATION__APPLIED_SECURITY_LEVEL:
			return getAppliedSecurityLevel();
		case TainttrackingPackage.CONFIGURATION__SECURITY_LEVEL_ANNOTATIONS:
			return getSecurityLevelAnnotations();
		case TainttrackingPackage.CONFIGURATION__ALLOWED_FLOWS:
			return getAllowedFlows();
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
		case TainttrackingPackage.CONFIGURATION__APPLIED_SECURITY_LEVEL:
			getAppliedSecurityLevel().clear();
			getAppliedSecurityLevel().addAll((Collection<? extends SecurityLevel>) newValue);
			return;
		case TainttrackingPackage.CONFIGURATION__SECURITY_LEVEL_ANNOTATIONS:
			getSecurityLevelAnnotations().clear();
			getSecurityLevelAnnotations().addAll((Collection<? extends SecurityLevelAnnotation>) newValue);
			return;
		case TainttrackingPackage.CONFIGURATION__ALLOWED_FLOWS:
			getAllowedFlows().clear();
			getAllowedFlows().addAll((Collection<? extends AllowedFlow>) newValue);
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
		case TainttrackingPackage.CONFIGURATION__APPLIED_SECURITY_LEVEL:
			getAppliedSecurityLevel().clear();
			return;
		case TainttrackingPackage.CONFIGURATION__SECURITY_LEVEL_ANNOTATIONS:
			getSecurityLevelAnnotations().clear();
			return;
		case TainttrackingPackage.CONFIGURATION__ALLOWED_FLOWS:
			getAllowedFlows().clear();
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
		case TainttrackingPackage.CONFIGURATION__APPLIED_SECURITY_LEVEL:
			return appliedSecurityLevel != null && !appliedSecurityLevel.isEmpty();
		case TainttrackingPackage.CONFIGURATION__SECURITY_LEVEL_ANNOTATIONS:
			return securityLevelAnnotations != null && !securityLevelAnnotations.isEmpty();
		case TainttrackingPackage.CONFIGURATION__ALLOWED_FLOWS:
			return allowedFlows != null && !allowedFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
