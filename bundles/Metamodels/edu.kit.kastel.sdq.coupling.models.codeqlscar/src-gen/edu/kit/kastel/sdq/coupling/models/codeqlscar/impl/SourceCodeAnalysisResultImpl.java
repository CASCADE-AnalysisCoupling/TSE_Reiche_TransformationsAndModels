/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar.impl;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Result;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElement;

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
 * An implementation of the model object '<em><b>Source Code Analysis Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SourceCodeAnalysisResultImpl#getSystemElementIdentifications <em>System Element Identifications</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SourceCodeAnalysisResultImpl#getSecurityLevels <em>Security Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SourceCodeAnalysisResultImpl#getResultEntries <em>Result Entries</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SourceCodeAnalysisResultImpl#getRuleIds <em>Rule Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceCodeAnalysisResultImpl extends MinimalEObjectImpl.Container implements SourceCodeAnalysisResult {
	/**
	 * The cached value of the '{@link #getSystemElementIdentifications() <em>System Element Identifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElementIdentifications()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemElement> systemElementIdentifications;

	/**
	 * The cached value of the '{@link #getSecurityLevels() <em>Security Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel_SCAR> securityLevels;

	/**
	 * The cached value of the '{@link #getResultEntries() <em>Result Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> resultEntries;

	/**
	 * The cached value of the '{@link #getRuleIds() <em>Rule Ids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleIds()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleId> ruleIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceCodeAnalysisResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlscarPackage.Literals.SOURCE_CODE_ANALYSIS_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemElement> getSystemElementIdentifications() {
		if (systemElementIdentifications == null) {
			systemElementIdentifications = new EObjectContainmentEList<SystemElement>(SystemElement.class, this,
					CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENT_IDENTIFICATIONS);
		}
		return systemElementIdentifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel_SCAR> getSecurityLevels() {
		if (securityLevels == null) {
			securityLevels = new EObjectContainmentEList<SecurityLevel_SCAR>(SecurityLevel_SCAR.class, this,
					CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SECURITY_LEVELS);
		}
		return securityLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Result> getResultEntries() {
		if (resultEntries == null) {
			resultEntries = new EObjectContainmentEList<Result>(Result.class, this,
					CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES);
		}
		return resultEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleId> getRuleIds() {
		if (ruleIds == null) {
			ruleIds = new EObjectContainmentEList<RuleId>(RuleId.class, this,
					CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RULE_IDS);
		}
		return ruleIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENT_IDENTIFICATIONS:
			return ((InternalEList<?>) getSystemElementIdentifications()).basicRemove(otherEnd, msgs);
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SECURITY_LEVELS:
			return ((InternalEList<?>) getSecurityLevels()).basicRemove(otherEnd, msgs);
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES:
			return ((InternalEList<?>) getResultEntries()).basicRemove(otherEnd, msgs);
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RULE_IDS:
			return ((InternalEList<?>) getRuleIds()).basicRemove(otherEnd, msgs);
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
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENT_IDENTIFICATIONS:
			return getSystemElementIdentifications();
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SECURITY_LEVELS:
			return getSecurityLevels();
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES:
			return getResultEntries();
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RULE_IDS:
			return getRuleIds();
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
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENT_IDENTIFICATIONS:
			getSystemElementIdentifications().clear();
			getSystemElementIdentifications().addAll((Collection<? extends SystemElement>) newValue);
			return;
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SECURITY_LEVELS:
			getSecurityLevels().clear();
			getSecurityLevels().addAll((Collection<? extends SecurityLevel_SCAR>) newValue);
			return;
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES:
			getResultEntries().clear();
			getResultEntries().addAll((Collection<? extends Result>) newValue);
			return;
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RULE_IDS:
			getRuleIds().clear();
			getRuleIds().addAll((Collection<? extends RuleId>) newValue);
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
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENT_IDENTIFICATIONS:
			getSystemElementIdentifications().clear();
			return;
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SECURITY_LEVELS:
			getSecurityLevels().clear();
			return;
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES:
			getResultEntries().clear();
			return;
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RULE_IDS:
			getRuleIds().clear();
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
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENT_IDENTIFICATIONS:
			return systemElementIdentifications != null && !systemElementIdentifications.isEmpty();
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__SECURITY_LEVELS:
			return securityLevels != null && !securityLevels.isEmpty();
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES:
			return resultEntries != null && !resultEntries.isEmpty();
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT__RULE_IDS:
			return ruleIds != null && !ruleIds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceCodeAnalysisResultImpl
