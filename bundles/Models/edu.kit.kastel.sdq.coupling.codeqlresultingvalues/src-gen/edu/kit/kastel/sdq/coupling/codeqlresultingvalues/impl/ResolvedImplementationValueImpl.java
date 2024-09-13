/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValueImpl#getResultingSecurityLevel <em>Resulting Security Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValueImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ResolvedImplementationValueImpl#getRuleId <em>Rule Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolvedImplementationValueImpl extends MinimalEObjectImpl.Container
		implements ResolvedImplementationValue {
	/**
	 * The cached value of the '{@link #getResultingSecurityLevel() <em>Resulting Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultingSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel_ResolvedImplementationValues resultingSecurityLevel;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter_ResolvedImplementationValues parameter;

	/**
	 * The cached value of the '{@link #getRuleId() <em>Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected RuleId_ResolvedImplementationValue ruleId;

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
		return CodeqlresultingvaluesPackage.Literals.RESOLVED_IMPLEMENTATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_ResolvedImplementationValues getResultingSecurityLevel() {
		if (resultingSecurityLevel != null && resultingSecurityLevel.eIsProxy()) {
			InternalEObject oldResultingSecurityLevel = (InternalEObject) resultingSecurityLevel;
			resultingSecurityLevel = (SecurityLevel_ResolvedImplementationValues) eResolveProxy(
					oldResultingSecurityLevel);
			if (resultingSecurityLevel != oldResultingSecurityLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RESULTING_SECURITY_LEVEL,
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
	public SecurityLevel_ResolvedImplementationValues basicGetResultingSecurityLevel() {
		return resultingSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultingSecurityLevel(SecurityLevel_ResolvedImplementationValues newResultingSecurityLevel) {
		SecurityLevel_ResolvedImplementationValues oldResultingSecurityLevel = resultingSecurityLevel;
		resultingSecurityLevel = newResultingSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RESULTING_SECURITY_LEVEL,
					oldResultingSecurityLevel, resultingSecurityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_ResolvedImplementationValues getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (Parameter_ResolvedImplementationValues) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__PARAMETER, oldParameter,
							parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_ResolvedImplementationValues basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter_ResolvedImplementationValues newParameter) {
		Parameter_ResolvedImplementationValues oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleId_ResolvedImplementationValue getRuleId() {
		if (ruleId != null && ruleId.eIsProxy()) {
			InternalEObject oldRuleId = (InternalEObject) ruleId;
			ruleId = (RuleId_ResolvedImplementationValue) eResolveProxy(oldRuleId);
			if (ruleId != oldRuleId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RULE_ID, oldRuleId, ruleId));
			}
		}
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleId_ResolvedImplementationValue basicGetRuleId() {
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleId(RuleId_ResolvedImplementationValue newRuleId) {
		RuleId_ResolvedImplementationValue oldRuleId = ruleId;
		ruleId = newRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RULE_ID, oldRuleId, ruleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RESULTING_SECURITY_LEVEL:
			if (resolve)
				return getResultingSecurityLevel();
			return basicGetResultingSecurityLevel();
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RULE_ID:
			if (resolve)
				return getRuleId();
			return basicGetRuleId();
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
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RESULTING_SECURITY_LEVEL:
			setResultingSecurityLevel((SecurityLevel_ResolvedImplementationValues) newValue);
			return;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__PARAMETER:
			setParameter((Parameter_ResolvedImplementationValues) newValue);
			return;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RULE_ID:
			setRuleId((RuleId_ResolvedImplementationValue) newValue);
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
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RESULTING_SECURITY_LEVEL:
			setResultingSecurityLevel((SecurityLevel_ResolvedImplementationValues) null);
			return;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__PARAMETER:
			setParameter((Parameter_ResolvedImplementationValues) null);
			return;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RULE_ID:
			setRuleId((RuleId_ResolvedImplementationValue) null);
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
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RESULTING_SECURITY_LEVEL:
			return resultingSecurityLevel != null;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__PARAMETER:
			return parameter != null;
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE__RULE_ID:
			return ruleId != null;
		}
		return super.eIsSet(featureID);
	}

} //ResolvedImplementationValueImpl
