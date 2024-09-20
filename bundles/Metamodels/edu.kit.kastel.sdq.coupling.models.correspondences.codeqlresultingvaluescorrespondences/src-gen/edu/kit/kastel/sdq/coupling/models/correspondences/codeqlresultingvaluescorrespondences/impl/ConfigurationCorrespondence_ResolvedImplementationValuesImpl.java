/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_ResolvedImplementationValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Correspondence Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ConfigurationCorrespondence_ResolvedImplementationValuesImpl#getConfiguration_SCAR <em>Configuration SCAR</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.ConfigurationCorrespondence_ResolvedImplementationValuesImpl#getConfiguration_ResultingValues <em>Configuration Resulting Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationCorrespondence_ResolvedImplementationValuesImpl extends MinimalEObjectImpl.Container
		implements ConfigurationCorrespondence_ResolvedImplementationValues {
	/**
	 * The cached value of the '{@link #getConfiguration_SCAR() <em>Configuration SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_SCAR()
	 * @generated
	 * @ordered
	 */
	protected RuleId configuration_SCAR;

	/**
	 * The cached value of the '{@link #getConfiguration_ResultingValues() <em>Configuration Resulting Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_ResultingValues()
	 * @generated
	 * @ordered
	 */
	protected RuleId_ResolvedImplementationValue configuration_ResultingValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationCorrespondence_ResolvedImplementationValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluescorrespondencesPackage.Literals.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleId getConfiguration_SCAR() {
		if (configuration_SCAR != null && configuration_SCAR.eIsProxy()) {
			InternalEObject oldConfiguration_SCAR = (InternalEObject) configuration_SCAR;
			configuration_SCAR = (RuleId) eResolveProxy(oldConfiguration_SCAR);
			if (configuration_SCAR != oldConfiguration_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_SCAR,
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
	public RuleId basicGetConfiguration_SCAR() {
		return configuration_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration_SCAR(RuleId newConfiguration_SCAR) {
		RuleId oldConfiguration_SCAR = configuration_SCAR;
		configuration_SCAR = newConfiguration_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_SCAR,
					oldConfiguration_SCAR, configuration_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleId_ResolvedImplementationValue getConfiguration_ResultingValues() {
		if (configuration_ResultingValues != null && configuration_ResultingValues.eIsProxy()) {
			InternalEObject oldConfiguration_ResultingValues = (InternalEObject) configuration_ResultingValues;
			configuration_ResultingValues = (RuleId_ResolvedImplementationValue) eResolveProxy(
					oldConfiguration_ResultingValues);
			if (configuration_ResultingValues != oldConfiguration_ResultingValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_RESULTING_VALUES,
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
	public RuleId_ResolvedImplementationValue basicGetConfiguration_ResultingValues() {
		return configuration_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration_ResultingValues(RuleId_ResolvedImplementationValue newConfiguration_ResultingValues) {
		RuleId_ResolvedImplementationValue oldConfiguration_ResultingValues = configuration_ResultingValues;
		configuration_ResultingValues = newConfiguration_ResultingValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_RESULTING_VALUES,
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
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_SCAR:
			if (resolve)
				return getConfiguration_SCAR();
			return basicGetConfiguration_SCAR();
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_RESULTING_VALUES:
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
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_SCAR:
			setConfiguration_SCAR((RuleId) newValue);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_RESULTING_VALUES:
			setConfiguration_ResultingValues((RuleId_ResolvedImplementationValue) newValue);
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
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_SCAR:
			setConfiguration_SCAR((RuleId) null);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_RESULTING_VALUES:
			setConfiguration_ResultingValues((RuleId_ResolvedImplementationValue) null);
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
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_SCAR:
			return configuration_SCAR != null;
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_RESULTING_VALUES:
			return configuration_ResultingValues != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationCorrespondence_ResolvedImplementationValuesImpl
