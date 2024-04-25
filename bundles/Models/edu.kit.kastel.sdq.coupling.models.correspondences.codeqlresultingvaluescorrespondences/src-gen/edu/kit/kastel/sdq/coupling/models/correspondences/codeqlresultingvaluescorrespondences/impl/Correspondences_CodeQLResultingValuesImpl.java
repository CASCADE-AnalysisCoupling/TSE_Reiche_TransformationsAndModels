/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues;

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
 * An implementation of the model object '<em><b>Correspondences Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.Correspondences_CodeQLResultingValuesImpl#getSecurityLevelCorrespondences <em>Security Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.Correspondences_CodeQLResultingValuesImpl#getConfigurationCorrespondences <em>Configuration Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl.Correspondences_CodeQLResultingValuesImpl#getParameterCorrespondences <em>Parameter Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Correspondences_CodeQLResultingValuesImpl extends MinimalEObjectImpl.Container
		implements Correspondences_CodeQLResultingValues {
	/**
	 * The cached value of the '{@link #getSecurityLevelCorrespondences() <em>Security Level Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevelCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevelCorrespondence_CodeQLResultingValues> securityLevelCorrespondences;

	/**
	 * The cached value of the '{@link #getConfigurationCorrespondences() <em>Configuration Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationCorrespondence_CodeQLResultingValues> configurationCorrespondences;

	/**
	 * The cached value of the '{@link #getParameterCorrespondences() <em>Parameter Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCorrespondence_CodeQLResultingValues> parameterCorrespondences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Correspondences_CodeQLResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluescorrespondencesPackage.Literals.CORRESPONDENCES_CODE_QL_RESULTING_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevelCorrespondence_CodeQLResultingValues> getSecurityLevelCorrespondences() {
		if (securityLevelCorrespondences == null) {
			securityLevelCorrespondences = new EObjectContainmentEList<SecurityLevelCorrespondence_CodeQLResultingValues>(
					SecurityLevelCorrespondence_CodeQLResultingValues.class, this,
					CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CORRESPONDENCES);
		}
		return securityLevelCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationCorrespondence_CodeQLResultingValues> getConfigurationCorrespondences() {
		if (configurationCorrespondences == null) {
			configurationCorrespondences = new EObjectContainmentEList<ConfigurationCorrespondence_CodeQLResultingValues>(
					ConfigurationCorrespondence_CodeQLResultingValues.class, this,
					CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__CONFIGURATION_CORRESPONDENCES);
		}
		return configurationCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCorrespondence_CodeQLResultingValues> getParameterCorrespondences() {
		if (parameterCorrespondences == null) {
			parameterCorrespondences = new EObjectContainmentEList<ParameterCorrespondence_CodeQLResultingValues>(
					ParameterCorrespondence_CodeQLResultingValues.class, this,
					CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__PARAMETER_CORRESPONDENCES);
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CORRESPONDENCES:
			return ((InternalEList<?>) getSecurityLevelCorrespondences()).basicRemove(otherEnd, msgs);
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__CONFIGURATION_CORRESPONDENCES:
			return ((InternalEList<?>) getConfigurationCorrespondences()).basicRemove(otherEnd, msgs);
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__PARAMETER_CORRESPONDENCES:
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CORRESPONDENCES:
			return getSecurityLevelCorrespondences();
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__CONFIGURATION_CORRESPONDENCES:
			return getConfigurationCorrespondences();
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__PARAMETER_CORRESPONDENCES:
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CORRESPONDENCES:
			getSecurityLevelCorrespondences().clear();
			getSecurityLevelCorrespondences()
					.addAll((Collection<? extends SecurityLevelCorrespondence_CodeQLResultingValues>) newValue);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__CONFIGURATION_CORRESPONDENCES:
			getConfigurationCorrespondences().clear();
			getConfigurationCorrespondences()
					.addAll((Collection<? extends ConfigurationCorrespondence_CodeQLResultingValues>) newValue);
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__PARAMETER_CORRESPONDENCES:
			getParameterCorrespondences().clear();
			getParameterCorrespondences()
					.addAll((Collection<? extends ParameterCorrespondence_CodeQLResultingValues>) newValue);
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CORRESPONDENCES:
			getSecurityLevelCorrespondences().clear();
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__CONFIGURATION_CORRESPONDENCES:
			getConfigurationCorrespondences().clear();
			return;
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__PARAMETER_CORRESPONDENCES:
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__SECURITY_LEVEL_CORRESPONDENCES:
			return securityLevelCorrespondences != null && !securityLevelCorrespondences.isEmpty();
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__CONFIGURATION_CORRESPONDENCES:
			return configurationCorrespondences != null && !configurationCorrespondences.isEmpty();
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES__PARAMETER_CORRESPONDENCES:
			return parameterCorrespondences != null && !parameterCorrespondences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Correspondences_CodeQLResultingValuesImpl
