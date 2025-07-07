/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar.impl;

import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Source;
import edu.kit.kastel.sdq.coupling.models.joanascar.SystemElement_SCAR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceImpl#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceImpl#getSourceLevel <em>Source Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl<T extends SystemElement_SCAR> extends MinimalEObjectImpl.Container implements Source<T> {
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
	 * The cached value of the '{@link #getSourceLevel() <em>Source Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLevel()
	 * @generated
	 * @ordered
	 */
	protected Level_SCAR sourceLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanascarPackage.Literals.SOURCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoanascarPackage.SOURCE__SYSTEM_ELEMENT,
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
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.SOURCE__SYSTEM_ELEMENT,
					oldSystemElement, systemElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_SCAR getSourceLevel() {
		if (sourceLevel != null && sourceLevel.eIsProxy()) {
			InternalEObject oldSourceLevel = (InternalEObject) sourceLevel;
			sourceLevel = (Level_SCAR) eResolveProxy(oldSourceLevel);
			if (sourceLevel != oldSourceLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoanascarPackage.SOURCE__SOURCE_LEVEL,
							oldSourceLevel, sourceLevel));
			}
		}
		return sourceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_SCAR basicGetSourceLevel() {
		return sourceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLevel(Level_SCAR newSourceLevel) {
		Level_SCAR oldSourceLevel = sourceLevel;
		sourceLevel = newSourceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.SOURCE__SOURCE_LEVEL, oldSourceLevel,
					sourceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanascarPackage.SOURCE__SYSTEM_ELEMENT:
			if (resolve)
				return getSystemElement();
			return basicGetSystemElement();
		case JoanascarPackage.SOURCE__SOURCE_LEVEL:
			if (resolve)
				return getSourceLevel();
			return basicGetSourceLevel();
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
		case JoanascarPackage.SOURCE__SYSTEM_ELEMENT:
			setSystemElement((T) newValue);
			return;
		case JoanascarPackage.SOURCE__SOURCE_LEVEL:
			setSourceLevel((Level_SCAR) newValue);
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
		case JoanascarPackage.SOURCE__SYSTEM_ELEMENT:
			setSystemElement((T) null);
			return;
		case JoanascarPackage.SOURCE__SOURCE_LEVEL:
			setSourceLevel((Level_SCAR) null);
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
		case JoanascarPackage.SOURCE__SYSTEM_ELEMENT:
			return systemElement != null;
		case JoanascarPackage.SOURCE__SOURCE_LEVEL:
			return sourceLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceImpl
