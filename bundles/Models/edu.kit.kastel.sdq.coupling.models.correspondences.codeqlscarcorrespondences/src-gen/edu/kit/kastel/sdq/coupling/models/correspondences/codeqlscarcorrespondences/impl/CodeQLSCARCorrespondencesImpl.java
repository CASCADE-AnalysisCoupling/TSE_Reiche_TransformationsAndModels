/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SystemElementCorrespondence;

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
 * An implementation of the model object '<em><b>Code QLSCAR Correspondences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeQLSCARCorrespondencesImpl#getSystemElementCorrespondences <em>System Element Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeQLSCARCorrespondencesImpl#getSecurityLevelCorrespondences <em>Security Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.CodeQLSCARCorrespondencesImpl#getConfigurationCorrespondences <em>Configuration Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeQLSCARCorrespondencesImpl extends MinimalEObjectImpl.Container implements CodeQLSCARCorrespondences {
	/**
	 * The cached value of the '{@link #getSystemElementCorrespondences() <em>System Element Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElementCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemElementCorrespondence> systemElementCorrespondences;

	/**
	 * The cached value of the '{@link #getSecurityLevelCorrespondences() <em>Security Level Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevelCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevelCorrespondence> securityLevelCorrespondences;

	/**
	 * The cached value of the '{@link #getConfigurationCorrespondences() <em>Configuration Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationCorrespondence> configurationCorrespondences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeQLSCARCorrespondencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlscarcorrespondencesPackage.Literals.CODE_QLSCAR_CORRESPONDENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemElementCorrespondence> getSystemElementCorrespondences() {
		if (systemElementCorrespondences == null) {
			systemElementCorrespondences = new EObjectContainmentEList<SystemElementCorrespondence>(
					SystemElementCorrespondence.class, this,
					CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES);
		}
		return systemElementCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevelCorrespondence> getSecurityLevelCorrespondences() {
		if (securityLevelCorrespondences == null) {
			securityLevelCorrespondences = new EObjectContainmentEList<SecurityLevelCorrespondence>(
					SecurityLevelCorrespondence.class, this,
					CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SECURITY_LEVEL_CORRESPONDENCES);
		}
		return securityLevelCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationCorrespondence> getConfigurationCorrespondences() {
		if (configurationCorrespondences == null) {
			configurationCorrespondences = new EObjectContainmentEList<ConfigurationCorrespondence>(
					ConfigurationCorrespondence.class, this,
					CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__CONFIGURATION_CORRESPONDENCES);
		}
		return configurationCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES:
			return ((InternalEList<?>) getSystemElementCorrespondences()).basicRemove(otherEnd, msgs);
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SECURITY_LEVEL_CORRESPONDENCES:
			return ((InternalEList<?>) getSecurityLevelCorrespondences()).basicRemove(otherEnd, msgs);
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__CONFIGURATION_CORRESPONDENCES:
			return ((InternalEList<?>) getConfigurationCorrespondences()).basicRemove(otherEnd, msgs);
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
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES:
			return getSystemElementCorrespondences();
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SECURITY_LEVEL_CORRESPONDENCES:
			return getSecurityLevelCorrespondences();
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__CONFIGURATION_CORRESPONDENCES:
			return getConfigurationCorrespondences();
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
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES:
			getSystemElementCorrespondences().clear();
			getSystemElementCorrespondences().addAll((Collection<? extends SystemElementCorrespondence>) newValue);
			return;
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SECURITY_LEVEL_CORRESPONDENCES:
			getSecurityLevelCorrespondences().clear();
			getSecurityLevelCorrespondences().addAll((Collection<? extends SecurityLevelCorrespondence>) newValue);
			return;
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__CONFIGURATION_CORRESPONDENCES:
			getConfigurationCorrespondences().clear();
			getConfigurationCorrespondences().addAll((Collection<? extends ConfigurationCorrespondence>) newValue);
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
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES:
			getSystemElementCorrespondences().clear();
			return;
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SECURITY_LEVEL_CORRESPONDENCES:
			getSecurityLevelCorrespondences().clear();
			return;
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__CONFIGURATION_CORRESPONDENCES:
			getConfigurationCorrespondences().clear();
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
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES:
			return systemElementCorrespondences != null && !systemElementCorrespondences.isEmpty();
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__SECURITY_LEVEL_CORRESPONDENCES:
			return securityLevelCorrespondences != null && !securityLevelCorrespondences.isEmpty();
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES__CONFIGURATION_CORRESPONDENCES:
			return configurationCorrespondences != null && !configurationCorrespondences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeQLSCARCorrespondencesImpl
