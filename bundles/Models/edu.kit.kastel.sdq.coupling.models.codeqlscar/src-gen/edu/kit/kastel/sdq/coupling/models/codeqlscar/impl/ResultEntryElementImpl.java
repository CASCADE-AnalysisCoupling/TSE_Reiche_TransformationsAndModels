/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar.impl;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElementIdentification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Entry Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultEntryElementImpl#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultEntryElementImpl#getSecurityLevel <em>Security Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultEntryElementImpl<T extends SystemElementIdentification> extends MinimalEObjectImpl.Container
		implements ResultEntryElement<T> {
	/**
	 * The cached value of the '{@link #getSystemElement() <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElement()
	 * @generated
	 * @ordered
	 */
	protected T systemElement;

	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel_SCAR securityLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultEntryElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlscarPackage.Literals.RESULT_ENTRY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getSystemElement() {
		if (systemElement != null && systemElement.eIsProxy()) {
			InternalEObject oldSystemElement = (InternalEObject) systemElement;
			systemElement = (T) eResolveProxy(oldSystemElement);
			if (systemElement != oldSystemElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT, oldSystemElement, systemElement));
			}
		}
		return systemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetSystemElement() {
		return systemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemElement(T newSystemElement) {
		T oldSystemElement = systemElement;
		systemElement = newSystemElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT, oldSystemElement, systemElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_SCAR getSecurityLevel() {
		if (securityLevel != null && securityLevel.eIsProxy()) {
			InternalEObject oldSecurityLevel = (InternalEObject) securityLevel;
			securityLevel = (SecurityLevel_SCAR) eResolveProxy(oldSecurityLevel);
			if (securityLevel != oldSecurityLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
			}
		}
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_SCAR basicGetSecurityLevel() {
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel(SecurityLevel_SCAR newSecurityLevel) {
		SecurityLevel_SCAR oldSecurityLevel = securityLevel;
		securityLevel = newSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT:
			if (resolve)
				return getSystemElement();
			return basicGetSystemElement();
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SECURITY_LEVEL:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT:
			setSystemElement((T) newValue);
			return;
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SECURITY_LEVEL:
			setSecurityLevel((SecurityLevel_SCAR) newValue);
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
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT:
			setSystemElement((T) null);
			return;
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SECURITY_LEVEL:
			setSecurityLevel((SecurityLevel_SCAR) null);
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
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT:
			return systemElement != null;
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT__SECURITY_LEVEL:
			return securityLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultEntryElementImpl
