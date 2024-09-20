/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolved Implementation Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValueImpl#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValueImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValueImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolvedImplementationValueImpl extends MinimalEObjectImpl.Container
		implements ResolvedImplementationValue {
	/**
	 * The cached value of the '{@link #getSystemElement() <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElement()
	 * @generated
	 * @ordered
	 */
	protected Parameter_ResolvedImplementationValues systemElement;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint_ResolvedImplementationValues configuration;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level_ResolvedImplementationValues level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolvedImplementationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaresultingvaluesPackage.Literals.RESOLVED_IMPLEMENTATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_ResolvedImplementationValues getSystemElement() {
		if (systemElement != null && systemElement.eIsProxy()) {
			InternalEObject oldSystemElement = (InternalEObject) systemElement;
			systemElement = (Parameter_ResolvedImplementationValues) eResolveProxy(oldSystemElement);
			if (systemElement != oldSystemElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__SYSTEM_ELEMENT, oldSystemElement,
							systemElement));
			}
		}
		return systemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_ResolvedImplementationValues basicGetSystemElement() {
		return systemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemElement(Parameter_ResolvedImplementationValues newSystemElement) {
		Parameter_ResolvedImplementationValues oldSystemElement = systemElement;
		systemElement = newSystemElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__SYSTEM_ELEMENT, oldSystemElement,
					systemElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint_ResolvedImplementationValues getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject) configuration;
			configuration = (EntryPoint_ResolvedImplementationValues) eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__CONFIGURATION, oldConfiguration,
							configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint_ResolvedImplementationValues basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(EntryPoint_ResolvedImplementationValues newConfiguration) {
		EntryPoint_ResolvedImplementationValues oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__CONFIGURATION, oldConfiguration,
					configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_ResolvedImplementationValues getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject) level;
			level = (Level_ResolvedImplementationValues) eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__LEVEL, oldLevel, level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_ResolvedImplementationValues basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Level_ResolvedImplementationValues newLevel) {
		Level_ResolvedImplementationValues oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__SYSTEM_ELEMENT:
			if (resolve)
				return getSystemElement();
			return basicGetSystemElement();
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__CONFIGURATION:
			if (resolve)
				return getConfiguration();
			return basicGetConfiguration();
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__LEVEL:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__SYSTEM_ELEMENT:
			setSystemElement((Parameter_ResolvedImplementationValues) newValue);
			return;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__CONFIGURATION:
			setConfiguration((EntryPoint_ResolvedImplementationValues) newValue);
			return;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__LEVEL:
			setLevel((Level_ResolvedImplementationValues) newValue);
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
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__SYSTEM_ELEMENT:
			setSystemElement((Parameter_ResolvedImplementationValues) null);
			return;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__CONFIGURATION:
			setConfiguration((EntryPoint_ResolvedImplementationValues) null);
			return;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__LEVEL:
			setLevel((Level_ResolvedImplementationValues) null);
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
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__SYSTEM_ELEMENT:
			return systemElement != null;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__CONFIGURATION:
			return configuration != null;
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__LEVEL:
			return level != null;
		}
		return super.eIsSet(featureID);
	}

} //ResolvedImplementationValueImpl
