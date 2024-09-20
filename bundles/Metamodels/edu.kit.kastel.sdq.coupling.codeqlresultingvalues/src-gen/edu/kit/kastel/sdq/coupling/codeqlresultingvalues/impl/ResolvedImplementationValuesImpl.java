/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;

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
 * An implementation of the model object '<em><b>Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValuesImpl#getResultingValues <em>Resulting Values</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValuesImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValuesImpl#getSystemElements <em>System Elements</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValuesImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolvedImplementationValuesImpl extends MinimalEObjectImpl.Container
		implements ResolvedImplementationValues {
	/**
	 * The cached value of the '{@link #getResultingValues() <em>Resulting Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultingValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ResolvedImplementationValue> resultingValues;

	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel_ResolvedImplementationValues> securityLevel;

	/**
	 * The cached value of the '{@link #getSystemElements() <em>System Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter_ResolvedImplementationValues> systemElements;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleId_ResolvedImplementationValue> configurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolvedImplementationValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluesPackage.Literals.RESOLVED_IMPLEMENTATION_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResolvedImplementationValue> getResultingValues() {
		if (resultingValues == null) {
			resultingValues = new EObjectContainmentEList<ResolvedImplementationValue>(
					ResolvedImplementationValue.class, this,
					CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES);
		}
		return resultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel_ResolvedImplementationValues> getSecurityLevel() {
		if (securityLevel == null) {
			securityLevel = new EObjectContainmentEList<SecurityLevel_ResolvedImplementationValues>(
					SecurityLevel_ResolvedImplementationValues.class, this,
					CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL);
		}
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter_ResolvedImplementationValues> getSystemElements() {
		if (systemElements == null) {
			systemElements = new EObjectContainmentEList<Parameter_ResolvedImplementationValues>(
					Parameter_ResolvedImplementationValues.class, this,
					CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS);
		}
		return systemElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleId_ResolvedImplementationValue> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<RuleId_ResolvedImplementationValue>(
					RuleId_ResolvedImplementationValue.class, this,
					CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATIONS);
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
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES:
			return ((InternalEList<?>) getResultingValues()).basicRemove(otherEnd, msgs);
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL:
			return ((InternalEList<?>) getSecurityLevel()).basicRemove(otherEnd, msgs);
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS:
			return ((InternalEList<?>) getSystemElements()).basicRemove(otherEnd, msgs);
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATIONS:
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
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES:
			return getResultingValues();
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL:
			return getSecurityLevel();
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS:
			return getSystemElements();
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATIONS:
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
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES:
			getResultingValues().clear();
			getResultingValues().addAll((Collection<? extends ResolvedImplementationValue>) newValue);
			return;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL:
			getSecurityLevel().clear();
			getSecurityLevel().addAll((Collection<? extends SecurityLevel_ResolvedImplementationValues>) newValue);
			return;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS:
			getSystemElements().clear();
			getSystemElements().addAll((Collection<? extends Parameter_ResolvedImplementationValues>) newValue);
			return;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATIONS:
			getConfigurations().clear();
			getConfigurations().addAll((Collection<? extends RuleId_ResolvedImplementationValue>) newValue);
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
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES:
			getResultingValues().clear();
			return;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL:
			getSecurityLevel().clear();
			return;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS:
			getSystemElements().clear();
			return;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATIONS:
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
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES:
			return resultingValues != null && !resultingValues.isEmpty();
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SECURITY_LEVEL:
			return securityLevel != null && !securityLevel.isEmpty();
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS:
			return systemElements != null && !systemElements.isEmpty();
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES__CONFIGURATIONS:
			return configurations != null && !configurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResolvedImplementationValuesImpl
