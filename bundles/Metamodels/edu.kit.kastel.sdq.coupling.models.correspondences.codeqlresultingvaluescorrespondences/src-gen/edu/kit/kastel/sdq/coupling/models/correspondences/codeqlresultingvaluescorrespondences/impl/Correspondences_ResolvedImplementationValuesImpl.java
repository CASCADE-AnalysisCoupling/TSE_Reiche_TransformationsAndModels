/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correspondences Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.Correspondences_ResolvedImplementationValuesImpl#getSecurityLevelCorrespondences <em>Security Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.Correspondences_ResolvedImplementationValuesImpl#getConfigurationCorrespondences <em>Configuration Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.Correspondences_ResolvedImplementationValuesImpl#getParameterCorrespondences <em>Parameter Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Correspondences_ResolvedImplementationValuesImpl extends MinimalEObjectImpl.Container
		implements Correspondences_ResolvedImplementationValues {
	/**
	 * The cached value of the '{@link #getSecurityLevelCorrespondences() <em>Security Level Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevelCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevelCorrespondence_ResolvedImplementationValues> securityLevelCorrespondences;

	/**
	 * The cached value of the '{@link #getConfigurationCorrespondences() <em>Configuration Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationCorrespondence_ResolvedImplementationValues> configurationCorrespondences;

	/**
	 * The cached value of the '{@link #getParameterCorrespondences() <em>Parameter Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCorrespondence_ResolvedImplementationValues> parameterCorrespondences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Correspondences_ResolvedImplementationValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluescorrespondencesPackage.Literals.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevelCorrespondence_ResolvedImplementationValues> getSecurityLevelCorrespondences() {
		if (securityLevelCorrespondences == null) {
			securityLevelCorrespondences = new EObjectContainmentEList<SecurityLevelCorrespondence_ResolvedImplementationValues>(
					SecurityLevelCorrespondence_ResolvedImplementationValues.class, this,
					CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CORRESPONDENCES);
		}
		return securityLevelCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationCorrespondence_ResolvedImplementationValues> getConfigurationCorrespondences() {
		if (configurationCorrespondences == null) {
			configurationCorrespondences = new EObjectContainmentEList<ConfigurationCorrespondence_ResolvedImplementationValues>(
					ConfigurationCorrespondence_ResolvedImplementationValues.class, this,
					CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_CORRESPONDENCES);
		}
		return configurationCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCorrespondence_ResolvedImplementationValues> getParameterCorrespondences() {
		if (parameterCorrespondences == null) {
			parameterCorrespondences = new EObjectContainmentEList<ParameterCorrespondence_ResolvedImplementationValues>(
					ParameterCorrespondence_ResolvedImplementationValues.class, this,
					CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_CORRESPONDENCES);
		}
		return parameterCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CORRESPONDENCES:
			return ((InternalEList<?>) getSecurityLevelCorrespondences()).basicRemove(otherEnd, msgs);
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_CORRESPONDENCES:
			return ((InternalEList<?>) getConfigurationCorrespondences()).basicRemove(otherEnd, msgs);
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_CORRESPONDENCES:
			return ((InternalEList<?>) getParameterCorrespondences()).basicRemove(otherEnd, msgs);
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CORRESPONDENCES:
			return getSecurityLevelCorrespondences();
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_CORRESPONDENCES:
			return getConfigurationCorrespondences();
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_CORRESPONDENCES:
			return getParameterCorrespondences();
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CORRESPONDENCES:
			getSecurityLevelCorrespondences().clear();
			getSecurityLevelCorrespondences()
					.addAll((Collection<? extends SecurityLevelCorrespondence_ResolvedImplementationValues>) newValue);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_CORRESPONDENCES:
			getConfigurationCorrespondences().clear();
			getConfigurationCorrespondences()
					.addAll((Collection<? extends ConfigurationCorrespondence_ResolvedImplementationValues>) newValue);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_CORRESPONDENCES:
			getParameterCorrespondences().clear();
			getParameterCorrespondences()
					.addAll((Collection<? extends ParameterCorrespondence_ResolvedImplementationValues>) newValue);
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CORRESPONDENCES:
			getSecurityLevelCorrespondences().clear();
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_CORRESPONDENCES:
			getConfigurationCorrespondences().clear();
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_CORRESPONDENCES:
			getParameterCorrespondences().clear();
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL_CORRESPONDENCES:
			return securityLevelCorrespondences != null && !securityLevelCorrespondences.isEmpty();
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATION_CORRESPONDENCES:
			return configurationCorrespondences != null && !configurationCorrespondences.isEmpty();
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_CORRESPONDENCES:
			return parameterCorrespondences != null && !parameterCorrespondences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Correspondences_ResolvedImplementationValuesImpl
