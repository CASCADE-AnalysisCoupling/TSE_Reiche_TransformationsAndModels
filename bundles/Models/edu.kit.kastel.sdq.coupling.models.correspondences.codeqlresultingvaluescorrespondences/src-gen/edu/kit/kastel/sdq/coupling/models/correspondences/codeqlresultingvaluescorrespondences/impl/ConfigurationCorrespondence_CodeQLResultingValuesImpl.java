/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Correspondence Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ConfigurationCorrespondence_CodeQLResultingValuesImpl#getConfiguration_SCAR <em>Configuration SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ConfigurationCorrespondence_CodeQLResultingValuesImpl#getConfiguration_ResultingValues <em>Configuration Resulting Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationCorrespondence_CodeQLResultingValuesImpl extends MinimalEObjectImpl.Container
		implements ConfigurationCorrespondence_CodeQLResultingValues {
	/**
	 * The cached value of the '{@link #getConfiguration_SCAR() <em>Configuration SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_SCAR()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationID_SCAR configuration_SCAR;

	/**
	 * The cached value of the '{@link #getConfiguration_ResultingValues() <em>Configuration Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_ResultingValues()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationID_ResultingValues configuration_ResultingValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationCorrespondence_CodeQLResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluescorrespondencesPackage.Literals.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationID_SCAR getConfiguration_SCAR() {
		if (configuration_SCAR != null && configuration_SCAR.eIsProxy()) {
			InternalEObject oldConfiguration_SCAR = (InternalEObject) configuration_SCAR;
			configuration_SCAR = (ConfigurationID_SCAR) eResolveProxy(oldConfiguration_SCAR);
			if (configuration_SCAR != oldConfiguration_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_SCAR,
							oldConfiguration_SCAR, configuration_SCAR));
			}
		}
		return configuration_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationID_SCAR basicGetConfiguration_SCAR() {
		return configuration_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration_SCAR(ConfigurationID_SCAR newConfiguration_SCAR) {
		ConfigurationID_SCAR oldConfiguration_SCAR = configuration_SCAR;
		configuration_SCAR = newConfiguration_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_SCAR,
					oldConfiguration_SCAR, configuration_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationID_ResultingValues getConfiguration_ResultingValues() {
		if (configuration_ResultingValues != null && configuration_ResultingValues.eIsProxy()) {
			InternalEObject oldConfiguration_ResultingValues = (InternalEObject) configuration_ResultingValues;
			configuration_ResultingValues = (ConfigurationID_ResultingValues) eResolveProxy(
					oldConfiguration_ResultingValues);
			if (configuration_ResultingValues != oldConfiguration_ResultingValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_RESULTING_VALUES,
							oldConfiguration_ResultingValues, configuration_ResultingValues));
			}
		}
		return configuration_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationID_ResultingValues basicGetConfiguration_ResultingValues() {
		return configuration_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration_ResultingValues(ConfigurationID_ResultingValues newConfiguration_ResultingValues) {
		ConfigurationID_ResultingValues oldConfiguration_ResultingValues = configuration_ResultingValues;
		configuration_ResultingValues = newConfiguration_ResultingValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_RESULTING_VALUES,
					oldConfiguration_ResultingValues, configuration_ResultingValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_SCAR:
			if (resolve)
				return getConfiguration_SCAR();
			return basicGetConfiguration_SCAR();
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_RESULTING_VALUES:
			if (resolve)
				return getConfiguration_ResultingValues();
			return basicGetConfiguration_ResultingValues();
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
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_SCAR:
			setConfiguration_SCAR((ConfigurationID_SCAR) newValue);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_RESULTING_VALUES:
			setConfiguration_ResultingValues((ConfigurationID_ResultingValues) newValue);
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
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_SCAR:
			setConfiguration_SCAR((ConfigurationID_SCAR) null);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_RESULTING_VALUES:
			setConfiguration_ResultingValues((ConfigurationID_ResultingValues) null);
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
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_SCAR:
			return configuration_SCAR != null;
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES__CONFIGURATION_RESULTING_VALUES:
			return configuration_ResultingValues != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationCorrespondence_CodeQLResultingValuesImpl
