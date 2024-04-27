/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resulting Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResultingValueImpl#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResultingValueImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResultingValueImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultingValueImpl extends MinimalEObjectImpl.Container implements ResultingValue {
	/**
	 * The cached value of the '{@link #getSystemElement() <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElement()
	 * @generated
	 * @ordered
	 */
	protected ParameterIdentification_JOANAResultingValues systemElement;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EntryPointIdentification_ResultingValues configuration;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level_ResultingValues level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultingValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaresultingvaluesPackage.Literals.RESULTING_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentification_JOANAResultingValues getSystemElement() {
		if (systemElement != null && systemElement.eIsProxy()) {
			InternalEObject oldSystemElement = (InternalEObject) systemElement;
			systemElement = (ParameterIdentification_JOANAResultingValues) eResolveProxy(oldSystemElement);
			if (systemElement != oldSystemElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluesPackage.RESULTING_VALUE__SYSTEM_ELEMENT, oldSystemElement,
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
	public ParameterIdentification_JOANAResultingValues basicGetSystemElement() {
		return systemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemElement(ParameterIdentification_JOANAResultingValues newSystemElement) {
		ParameterIdentification_JOANAResultingValues oldSystemElement = systemElement;
		systemElement = newSystemElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluesPackage.RESULTING_VALUE__SYSTEM_ELEMENT, oldSystemElement, systemElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointIdentification_ResultingValues getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject) configuration;
			configuration = (EntryPointIdentification_ResultingValues) eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION, oldConfiguration,
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
	public EntryPointIdentification_ResultingValues basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(EntryPointIdentification_ResultingValues newConfiguration) {
		EntryPointIdentification_ResultingValues oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_ResultingValues getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject) level;
			level = (Level_ResultingValues) eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaresultingvaluesPackage.RESULTING_VALUE__LEVEL, oldLevel, level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_ResultingValues basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Level_ResultingValues newLevel) {
		Level_ResultingValues oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaresultingvaluesPackage.RESULTING_VALUE__LEVEL,
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
		case JoanaresultingvaluesPackage.RESULTING_VALUE__SYSTEM_ELEMENT:
			if (resolve)
				return getSystemElement();
			return basicGetSystemElement();
		case JoanaresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION:
			if (resolve)
				return getConfiguration();
			return basicGetConfiguration();
		case JoanaresultingvaluesPackage.RESULTING_VALUE__LEVEL:
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
		case JoanaresultingvaluesPackage.RESULTING_VALUE__SYSTEM_ELEMENT:
			setSystemElement((ParameterIdentification_JOANAResultingValues) newValue);
			return;
		case JoanaresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION:
			setConfiguration((EntryPointIdentification_ResultingValues) newValue);
			return;
		case JoanaresultingvaluesPackage.RESULTING_VALUE__LEVEL:
			setLevel((Level_ResultingValues) newValue);
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
		case JoanaresultingvaluesPackage.RESULTING_VALUE__SYSTEM_ELEMENT:
			setSystemElement((ParameterIdentification_JOANAResultingValues) null);
			return;
		case JoanaresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION:
			setConfiguration((EntryPointIdentification_ResultingValues) null);
			return;
		case JoanaresultingvaluesPackage.RESULTING_VALUE__LEVEL:
			setLevel((Level_ResultingValues) null);
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
		case JoanaresultingvaluesPackage.RESULTING_VALUE__SYSTEM_ELEMENT:
			return systemElement != null;
		case JoanaresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION:
			return configuration != null;
		case JoanaresultingvaluesPackage.RESULTING_VALUE__LEVEL:
			return level != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultingValueImpl
