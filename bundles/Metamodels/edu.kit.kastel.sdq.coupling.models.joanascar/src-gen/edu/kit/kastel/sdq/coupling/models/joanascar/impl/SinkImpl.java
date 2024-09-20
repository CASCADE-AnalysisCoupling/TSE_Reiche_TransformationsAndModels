/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar.impl;

import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Sink;
import edu.kit.kastel.sdq.coupling.models.joanascar.SystemElement_SCAR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SinkImpl#getSinkLevel <em>Sink Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SinkImpl#getSystemElement <em>System Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SinkImpl<T extends SystemElement_SCAR> extends MinimalEObjectImpl.Container implements Sink<T> {
	/**
	 * The cached value of the '{@link #getSinkLevel() <em>Sink Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinkLevel()
	 * @generated
	 * @ordered
	 */
	protected Level_SCAR sinkLevel;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanascarPackage.Literals.SINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_SCAR getSinkLevel() {
		if (sinkLevel != null && sinkLevel.eIsProxy()) {
			InternalEObject oldSinkLevel = (InternalEObject) sinkLevel;
			sinkLevel = (Level_SCAR) eResolveProxy(oldSinkLevel);
			if (sinkLevel != oldSinkLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoanascarPackage.SINK__SINK_LEVEL,
							oldSinkLevel, sinkLevel));
			}
		}
		return sinkLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_SCAR basicGetSinkLevel() {
		return sinkLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinkLevel(Level_SCAR newSinkLevel) {
		Level_SCAR oldSinkLevel = sinkLevel;
		sinkLevel = newSinkLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.SINK__SINK_LEVEL, oldSinkLevel,
					sinkLevel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoanascarPackage.SINK__SYSTEM_ELEMENT,
							oldSystemElement, systemElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.SINK__SYSTEM_ELEMENT,
					oldSystemElement, systemElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanascarPackage.SINK__SINK_LEVEL:
			if (resolve)
				return getSinkLevel();
			return basicGetSinkLevel();
		case JoanascarPackage.SINK__SYSTEM_ELEMENT:
			if (resolve)
				return getSystemElement();
			return basicGetSystemElement();
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
		case JoanascarPackage.SINK__SINK_LEVEL:
			setSinkLevel((Level_SCAR) newValue);
			return;
		case JoanascarPackage.SINK__SYSTEM_ELEMENT:
			setSystemElement((T) newValue);
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
		case JoanascarPackage.SINK__SINK_LEVEL:
			setSinkLevel((Level_SCAR) null);
			return;
		case JoanascarPackage.SINK__SYSTEM_ELEMENT:
			setSystemElement((T) null);
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
		case JoanascarPackage.SINK__SINK_LEVEL:
			return sinkLevel != null;
		case JoanascarPackage.SINK__SYSTEM_ELEMENT:
			return systemElement != null;
		}
		return super.eIsSet(featureID);
	}

} //SinkImpl
