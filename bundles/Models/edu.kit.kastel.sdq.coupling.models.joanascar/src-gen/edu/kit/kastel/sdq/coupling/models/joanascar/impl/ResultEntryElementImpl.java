/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar.impl;

import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.joanascar.SystemElementIdentifiying_JOANASCAR;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryElementImpl#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryElementImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultEntryElementImpl<T extends SystemElementIdentifiying_JOANASCAR> extends MinimalEObjectImpl.Container
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
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level_SCAR level;

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
		return JoanascarPackage.Literals.RESULT_ENTRY_ELEMENT;
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
							JoanascarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT, oldSystemElement, systemElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT,
					oldSystemElement, systemElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_SCAR getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject) level;
			level = (Level_SCAR) eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanascarPackage.RESULT_ENTRY_ELEMENT__LEVEL, oldLevel, level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_SCAR basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Level_SCAR newLevel) {
		Level_SCAR oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.RESULT_ENTRY_ELEMENT__LEVEL,
					oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanascarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT:
			if (resolve)
				return getSystemElement();
			return basicGetSystemElement();
		case JoanascarPackage.RESULT_ENTRY_ELEMENT__LEVEL:
			if (resolve)
				return getLevel();
			return basicGetLevel();
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
		case JoanascarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT:
			setSystemElement((T) newValue);
			return;
		case JoanascarPackage.RESULT_ENTRY_ELEMENT__LEVEL:
			setLevel((Level_SCAR) newValue);
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
		case JoanascarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT:
			setSystemElement((T) null);
			return;
		case JoanascarPackage.RESULT_ENTRY_ELEMENT__LEVEL:
			setLevel((Level_SCAR) null);
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
		case JoanascarPackage.RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT:
			return systemElement != null;
		case JoanascarPackage.RESULT_ENTRY_ELEMENT__LEVEL:
			return level != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultEntryElementImpl
