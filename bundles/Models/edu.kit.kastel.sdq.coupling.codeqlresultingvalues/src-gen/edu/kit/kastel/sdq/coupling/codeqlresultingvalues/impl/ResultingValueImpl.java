/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResultingValueImpl#getResultingSecurityLevel <em>Resulting Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResultingValueImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResultingValueImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultingValueImpl extends MinimalEObjectImpl.Container implements ResultingValue {
	/**
	 * The cached value of the '{@link #getResultingSecurityLevel() <em>Resulting Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultingSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel_ResultingValues resultingSecurityLevel;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected ParameterIdentificiation_CodeQLResultingValues parameter;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationID_ResultingValues configuration;

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
		return CodeqlresultingvaluesPackage.Literals.RESULTING_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_ResultingValues getResultingSecurityLevel() {
		if (resultingSecurityLevel != null && resultingSecurityLevel.eIsProxy()) {
			InternalEObject oldResultingSecurityLevel = (InternalEObject) resultingSecurityLevel;
			resultingSecurityLevel = (SecurityLevel_ResultingValues) eResolveProxy(oldResultingSecurityLevel);
			if (resultingSecurityLevel != oldResultingSecurityLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluesPackage.RESULTING_VALUE__RESULTING_SECURITY_LEVEL,
							oldResultingSecurityLevel, resultingSecurityLevel));
			}
		}
		return resultingSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_ResultingValues basicGetResultingSecurityLevel() {
		return resultingSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultingSecurityLevel(SecurityLevel_ResultingValues newResultingSecurityLevel) {
		SecurityLevel_ResultingValues oldResultingSecurityLevel = resultingSecurityLevel;
		resultingSecurityLevel = newResultingSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluesPackage.RESULTING_VALUE__RESULTING_SECURITY_LEVEL, oldResultingSecurityLevel,
					resultingSecurityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentificiation_CodeQLResultingValues getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (ParameterIdentificiation_CodeQLResultingValues) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluesPackage.RESULTING_VALUE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentificiation_CodeQLResultingValues basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(ParameterIdentificiation_CodeQLResultingValues newParameter) {
		ParameterIdentificiation_CodeQLResultingValues oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluesPackage.RESULTING_VALUE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationID_ResultingValues getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject) configuration;
			configuration = (ConfigurationID_ResultingValues) eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION, oldConfiguration,
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
	public ConfigurationID_ResultingValues basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(ConfigurationID_ResultingValues newConfiguration) {
		ConfigurationID_ResultingValues oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__RESULTING_SECURITY_LEVEL:
			if (resolve)
				return getResultingSecurityLevel();
			return basicGetResultingSecurityLevel();
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION:
			if (resolve)
				return getConfiguration();
			return basicGetConfiguration();
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
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__RESULTING_SECURITY_LEVEL:
			setResultingSecurityLevel((SecurityLevel_ResultingValues) newValue);
			return;
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__PARAMETER:
			setParameter((ParameterIdentificiation_CodeQLResultingValues) newValue);
			return;
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION:
			setConfiguration((ConfigurationID_ResultingValues) newValue);
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
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__RESULTING_SECURITY_LEVEL:
			setResultingSecurityLevel((SecurityLevel_ResultingValues) null);
			return;
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__PARAMETER:
			setParameter((ParameterIdentificiation_CodeQLResultingValues) null);
			return;
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION:
			setConfiguration((ConfigurationID_ResultingValues) null);
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
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__RESULTING_SECURITY_LEVEL:
			return resultingSecurityLevel != null;
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__PARAMETER:
			return parameter != null;
		case CodeqlresultingvaluesPackage.RESULTING_VALUE__CONFIGURATION:
			return configuration != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultingValueImpl
