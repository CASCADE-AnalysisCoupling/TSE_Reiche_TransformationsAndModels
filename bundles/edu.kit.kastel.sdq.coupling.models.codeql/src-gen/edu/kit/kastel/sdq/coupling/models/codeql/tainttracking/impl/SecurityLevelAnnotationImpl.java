/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.mdsd.modelingfoundations.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Level Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelAnnotationImpl#getSecurityLevel <em>Security Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityLevelAnnotationImpl extends IdentifierImpl implements SecurityLevelAnnotation {
	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel securityLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevelAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TainttrackingPackage.Literals.SECURITY_LEVEL_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel getSecurityLevel() {
		if (securityLevel != null && securityLevel.eIsProxy()) {
			InternalEObject oldSecurityLevel = (InternalEObject) securityLevel;
			securityLevel = (SecurityLevel) eResolveProxy(oldSecurityLevel);
			if (securityLevel != oldSecurityLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TainttrackingPackage.SECURITY_LEVEL_ANNOTATION__SECURITY_LEVEL, oldSecurityLevel,
							securityLevel));
			}
		}
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel basicGetSecurityLevel() {
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityLevel(SecurityLevel newSecurityLevel) {
		SecurityLevel oldSecurityLevel = securityLevel;
		securityLevel = newSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TainttrackingPackage.SECURITY_LEVEL_ANNOTATION__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TainttrackingPackage.SECURITY_LEVEL_ANNOTATION__SECURITY_LEVEL:
			if (resolve)
				return getSecurityLevel();
			return basicGetSecurityLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TainttrackingPackage.SECURITY_LEVEL_ANNOTATION__SECURITY_LEVEL:
			setSecurityLevel((SecurityLevel) newValue);
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
		case TainttrackingPackage.SECURITY_LEVEL_ANNOTATION__SECURITY_LEVEL:
			setSecurityLevel((SecurityLevel) null);
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
		case TainttrackingPackage.SECURITY_LEVEL_ANNOTATION__SECURITY_LEVEL:
			return securityLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityLevelAnnotationImpl
