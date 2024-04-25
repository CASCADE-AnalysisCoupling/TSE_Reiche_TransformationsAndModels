/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;

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
 * An implementation of the model object '<em><b>Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeQLResultingValuesImpl#getResultingValues <em>Resulting Values</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeQLResultingValuesImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeQLResultingValuesImpl#getSystemElements <em>System Elements</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.CodeQLResultingValuesImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeQLResultingValuesImpl extends MinimalEObjectImpl.Container implements CodeQLResultingValues {
	/**
	 * The cached value of the '{@link #getResultingValues() <em>Resulting Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultingValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultingValue> resultingValues;

	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel_ResultingValues> securityLevel;

	/**
	 * The cached value of the '{@link #getSystemElements() <em>System Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterIdentificiation_CodeQLResultingValues> systemElements;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationID_ResultingValues> configurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeQLResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluesPackage.Literals.CODE_QL_RESULTING_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultingValue> getResultingValues() {
		if (resultingValues == null) {
			resultingValues = new EObjectContainmentEList<ResultingValue>(ResultingValue.class, this,
					CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__RESULTING_VALUES);
		}
		return resultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel_ResultingValues> getSecurityLevel() {
		if (securityLevel == null) {
			securityLevel = new EObjectContainmentEList<SecurityLevel_ResultingValues>(
					SecurityLevel_ResultingValues.class, this,
					CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SECURITY_LEVEL);
		}
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterIdentificiation_CodeQLResultingValues> getSystemElements() {
		if (systemElements == null) {
			systemElements = new EObjectContainmentEList<ParameterIdentificiation_CodeQLResultingValues>(
					ParameterIdentificiation_CodeQLResultingValues.class, this,
					CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SYSTEM_ELEMENTS);
		}
		return systemElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationID_ResultingValues> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<ConfigurationID_ResultingValues>(
					ConfigurationID_ResultingValues.class, this,
					CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__RESULTING_VALUES:
			return ((InternalEList<?>) getResultingValues()).basicRemove(otherEnd, msgs);
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SECURITY_LEVEL:
			return ((InternalEList<?>) getSecurityLevel()).basicRemove(otherEnd, msgs);
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SYSTEM_ELEMENTS:
			return ((InternalEList<?>) getSystemElements()).basicRemove(otherEnd, msgs);
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__CONFIGURATIONS:
			return ((InternalEList<?>) getConfigurations()).basicRemove(otherEnd, msgs);
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
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__RESULTING_VALUES:
			return getResultingValues();
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SECURITY_LEVEL:
			return getSecurityLevel();
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SYSTEM_ELEMENTS:
			return getSystemElements();
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__CONFIGURATIONS:
			return getConfigurations();
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
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__RESULTING_VALUES:
			getResultingValues().clear();
			getResultingValues().addAll((Collection<? extends ResultingValue>) newValue);
			return;
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SECURITY_LEVEL:
			getSecurityLevel().clear();
			getSecurityLevel().addAll((Collection<? extends SecurityLevel_ResultingValues>) newValue);
			return;
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SYSTEM_ELEMENTS:
			getSystemElements().clear();
			getSystemElements().addAll((Collection<? extends ParameterIdentificiation_CodeQLResultingValues>) newValue);
			return;
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__CONFIGURATIONS:
			getConfigurations().clear();
			getConfigurations().addAll((Collection<? extends ConfigurationID_ResultingValues>) newValue);
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
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__RESULTING_VALUES:
			getResultingValues().clear();
			return;
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SECURITY_LEVEL:
			getSecurityLevel().clear();
			return;
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SYSTEM_ELEMENTS:
			getSystemElements().clear();
			return;
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__CONFIGURATIONS:
			getConfigurations().clear();
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
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__RESULTING_VALUES:
			return resultingValues != null && !resultingValues.isEmpty();
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SECURITY_LEVEL:
			return securityLevel != null && !securityLevel.isEmpty();
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__SYSTEM_ELEMENTS:
			return systemElements != null && !systemElements.isEmpty();
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES__CONFIGURATIONS:
			return configurations != null && !configurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeQLResultingValuesImpl
