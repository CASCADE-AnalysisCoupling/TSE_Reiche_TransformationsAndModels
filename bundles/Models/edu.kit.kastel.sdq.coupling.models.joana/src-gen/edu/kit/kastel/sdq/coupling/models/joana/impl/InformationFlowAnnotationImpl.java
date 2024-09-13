/**
 */
package edu.kit.kastel.sdq.coupling.models.joana.impl;

import edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation;
import edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.SystemElementIdentifying;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.impl.InformationFlowAnnotationImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.impl.InformationFlowAnnotationImpl#getSystemElementIdentification <em>System Element Identification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InformationFlowAnnotationImpl extends MinimalEObjectImpl.Container implements InformationFlowAnnotation {
	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level level;

	/**
	 * The cached value of the '{@link #getSystemElementIdentification() <em>System Element Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElementIdentification()
	 * @generated
	 * @ordered
	 */
	protected SystemElementIdentifying systemElementIdentification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaPackage.Literals.INFORMATION_FLOW_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject)level;
			level = (Level)eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoanaPackage.INFORMATION_FLOW_ANNOTATION__LEVEL, oldLevel, level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Level newLevel) {
		Level oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaPackage.INFORMATION_FLOW_ANNOTATION__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemElementIdentifying getSystemElementIdentification() {
		return systemElementIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemElementIdentification(SystemElementIdentifying newSystemElementIdentification, NotificationChain msgs) {
		SystemElementIdentifying oldSystemElementIdentification = systemElementIdentification;
		systemElementIdentification = newSystemElementIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoanaPackage.INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION, oldSystemElementIdentification, newSystemElementIdentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemElementIdentification(SystemElementIdentifying newSystemElementIdentification) {
		if (newSystemElementIdentification != systemElementIdentification) {
			NotificationChain msgs = null;
			if (systemElementIdentification != null)
				msgs = ((InternalEObject)systemElementIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoanaPackage.INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION, null, msgs);
			if (newSystemElementIdentification != null)
				msgs = ((InternalEObject)newSystemElementIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoanaPackage.INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION, null, msgs);
			msgs = basicSetSystemElementIdentification(newSystemElementIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaPackage.INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION, newSystemElementIdentification, newSystemElementIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JoanaPackage.INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION:
				return basicSetSystemElementIdentification(null, msgs);
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
			case JoanaPackage.INFORMATION_FLOW_ANNOTATION__LEVEL:
				if (resolve) return getLevel();
				return basicGetLevel();
			case JoanaPackage.INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION:
				return getSystemElementIdentification();
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
			case JoanaPackage.INFORMATION_FLOW_ANNOTATION__LEVEL:
				setLevel((Level)newValue);
				return;
			case JoanaPackage.INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION:
				setSystemElementIdentification((SystemElementIdentifying)newValue);
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
			case JoanaPackage.INFORMATION_FLOW_ANNOTATION__LEVEL:
				setLevel((Level)null);
				return;
			case JoanaPackage.INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION:
				setSystemElementIdentification((SystemElementIdentifying)null);
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
			case JoanaPackage.INFORMATION_FLOW_ANNOTATION__LEVEL:
				return level != null;
			case JoanaPackage.INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION:
				return systemElementIdentification != null;
		}
		return super.eIsSet(featureID);
	}

} //InformationFlowAnnotationImpl
