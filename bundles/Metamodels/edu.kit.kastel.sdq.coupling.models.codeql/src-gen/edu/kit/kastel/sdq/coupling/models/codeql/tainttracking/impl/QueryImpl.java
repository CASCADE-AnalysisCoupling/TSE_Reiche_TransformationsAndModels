/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlows;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import edu.kit.kastel.sdq.coupling.models.identifier.impl.IdentifiedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.QueryImpl#getAppliedSecurityLevel <em>Applied Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.QueryImpl#getSecurityLevelAnnotations <em>Security Level Annotations</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.QueryImpl#getAllowedFlows <em>Allowed Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryImpl extends IdentifiedElementImpl implements Query {
	/**
	 * The cached value of the '{@link #getAppliedSecurityLevel() <em>Applied Security Level</em>}' containment reference list.
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
	 * The cached value of the '{@link #getAllowedFlows() <em>Allowed Flows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFlows()
	 * @generated
	 * @ordered
	 */
	protected AllowedFlows allowedFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TainttrackingPackage.Literals.QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel> getAppliedSecurityLevel() {
		if (appliedSecurityLevel == null) {
			appliedSecurityLevel = new EObjectContainmentEList<SecurityLevel>(SecurityLevel.class, this, TainttrackingPackage.QUERY__APPLIED_SECURITY_LEVEL);
		}
		return appliedSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevelAnnotation> getSecurityLevelAnnotations() {
		if (securityLevelAnnotations == null) {
			securityLevelAnnotations = new EObjectContainmentEList<SecurityLevelAnnotation>(SecurityLevelAnnotation.class, this, TainttrackingPackage.QUERY__SECURITY_LEVEL_ANNOTATIONS);
		}
		return securityLevelAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedFlows getAllowedFlows() {
		return allowedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedFlows(AllowedFlows newAllowedFlows, NotificationChain msgs) {
		AllowedFlows oldAllowedFlows = allowedFlows;
		allowedFlows = newAllowedFlows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TainttrackingPackage.QUERY__ALLOWED_FLOWS, oldAllowedFlows, newAllowedFlows);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedFlows(AllowedFlows newAllowedFlows) {
		if (newAllowedFlows != allowedFlows) {
			NotificationChain msgs = null;
			if (allowedFlows != null)
				msgs = ((InternalEObject)allowedFlows).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TainttrackingPackage.QUERY__ALLOWED_FLOWS, null, msgs);
			if (newAllowedFlows != null)
				msgs = ((InternalEObject)newAllowedFlows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TainttrackingPackage.QUERY__ALLOWED_FLOWS, null, msgs);
			msgs = basicSetAllowedFlows(newAllowedFlows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TainttrackingPackage.QUERY__ALLOWED_FLOWS, newAllowedFlows, newAllowedFlows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TainttrackingPackage.QUERY__APPLIED_SECURITY_LEVEL:
				return ((InternalEList<?>)getAppliedSecurityLevel()).basicRemove(otherEnd, msgs);
			case TainttrackingPackage.QUERY__SECURITY_LEVEL_ANNOTATIONS:
				return ((InternalEList<?>)getSecurityLevelAnnotations()).basicRemove(otherEnd, msgs);
			case TainttrackingPackage.QUERY__ALLOWED_FLOWS:
				return basicSetAllowedFlows(null, msgs);
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
			case TainttrackingPackage.QUERY__APPLIED_SECURITY_LEVEL:
				return getAppliedSecurityLevel();
			case TainttrackingPackage.QUERY__SECURITY_LEVEL_ANNOTATIONS:
				return getSecurityLevelAnnotations();
			case TainttrackingPackage.QUERY__ALLOWED_FLOWS:
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
			case TainttrackingPackage.QUERY__APPLIED_SECURITY_LEVEL:
				getAppliedSecurityLevel().clear();
				getAppliedSecurityLevel().addAll((Collection<? extends SecurityLevel>)newValue);
				return;
			case TainttrackingPackage.QUERY__SECURITY_LEVEL_ANNOTATIONS:
				getSecurityLevelAnnotations().clear();
				getSecurityLevelAnnotations().addAll((Collection<? extends SecurityLevelAnnotation>)newValue);
				return;
			case TainttrackingPackage.QUERY__ALLOWED_FLOWS:
				setAllowedFlows((AllowedFlows)newValue);
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
			case TainttrackingPackage.QUERY__APPLIED_SECURITY_LEVEL:
				getAppliedSecurityLevel().clear();
				return;
			case TainttrackingPackage.QUERY__SECURITY_LEVEL_ANNOTATIONS:
				getSecurityLevelAnnotations().clear();
				return;
			case TainttrackingPackage.QUERY__ALLOWED_FLOWS:
				setAllowedFlows((AllowedFlows)null);
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
			case TainttrackingPackage.QUERY__APPLIED_SECURITY_LEVEL:
				return appliedSecurityLevel != null && !appliedSecurityLevel.isEmpty();
			case TainttrackingPackage.QUERY__SECURITY_LEVEL_ANNOTATIONS:
				return securityLevelAnnotations != null && !securityLevelAnnotations.isEmpty();
			case TainttrackingPackage.QUERY__ALLOWED_FLOWS:
				return allowedFlows != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryImpl
