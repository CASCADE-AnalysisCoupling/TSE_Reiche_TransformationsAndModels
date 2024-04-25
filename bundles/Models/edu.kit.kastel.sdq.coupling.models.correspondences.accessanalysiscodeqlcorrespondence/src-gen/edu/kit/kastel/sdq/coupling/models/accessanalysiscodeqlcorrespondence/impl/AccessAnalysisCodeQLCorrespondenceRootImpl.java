/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence;

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
 * An implementation of the model object '<em><b>Access Analysis Code QL Correspondence Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessAnalysisCodeQLCorrespondenceRootImpl#getConfigurationCorrespondences_AccessAnalysisCodeQL <em>Configuration Correspondences Access Analysis Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.AccessAnalysisCodeQLCorrespondenceRootImpl#getDataSetSecurityLevelCorrespondence <em>Data Set Security Level Correspondence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessAnalysisCodeQLCorrespondenceRootImpl extends MinimalEObjectImpl.Container
		implements AccessAnalysisCodeQLCorrespondenceRoot {
	/**
	 * The cached value of the '{@link #getConfigurationCorrespondences_AccessAnalysisCodeQL() <em>Configuration Correspondences Access Analysis Code QL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationCorrespondences_AccessAnalysisCodeQL()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationCorrespondence> configurationCorrespondences_AccessAnalysisCodeQL;

	/**
	 * The cached value of the '{@link #getDataSetSecurityLevelCorrespondence() <em>Data Set Security Level Correspondence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetSecurityLevelCorrespondence()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetSecurityLevelCorrespondence> dataSetSecurityLevelCorrespondence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessAnalysisCodeQLCorrespondenceRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessanalysiscodeqlcorrespondencePackage.Literals.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationCorrespondence> getConfigurationCorrespondences_AccessAnalysisCodeQL() {
		if (configurationCorrespondences_AccessAnalysisCodeQL == null) {
			configurationCorrespondences_AccessAnalysisCodeQL = new EObjectContainmentEList<ConfigurationCorrespondence>(
					ConfigurationCorrespondence.class, this,
					AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__CONFIGURATION_CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL);
		}
		return configurationCorrespondences_AccessAnalysisCodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetSecurityLevelCorrespondence> getDataSetSecurityLevelCorrespondence() {
		if (dataSetSecurityLevelCorrespondence == null) {
			dataSetSecurityLevelCorrespondence = new EObjectContainmentEList<DataSetSecurityLevelCorrespondence>(
					DataSetSecurityLevelCorrespondence.class, this,
					AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__DATA_SET_SECURITY_LEVEL_CORRESPONDENCE);
		}
		return dataSetSecurityLevelCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__CONFIGURATION_CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL:
			return ((InternalEList<?>) getConfigurationCorrespondences_AccessAnalysisCodeQL()).basicRemove(otherEnd,
					msgs);
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__DATA_SET_SECURITY_LEVEL_CORRESPONDENCE:
			return ((InternalEList<?>) getDataSetSecurityLevelCorrespondence()).basicRemove(otherEnd, msgs);
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
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__CONFIGURATION_CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL:
			return getConfigurationCorrespondences_AccessAnalysisCodeQL();
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__DATA_SET_SECURITY_LEVEL_CORRESPONDENCE:
			return getDataSetSecurityLevelCorrespondence();
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
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__CONFIGURATION_CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL:
			getConfigurationCorrespondences_AccessAnalysisCodeQL().clear();
			getConfigurationCorrespondences_AccessAnalysisCodeQL()
					.addAll((Collection<? extends ConfigurationCorrespondence>) newValue);
			return;
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__DATA_SET_SECURITY_LEVEL_CORRESPONDENCE:
			getDataSetSecurityLevelCorrespondence().clear();
			getDataSetSecurityLevelCorrespondence()
					.addAll((Collection<? extends DataSetSecurityLevelCorrespondence>) newValue);
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
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__CONFIGURATION_CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL:
			getConfigurationCorrespondences_AccessAnalysisCodeQL().clear();
			return;
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__DATA_SET_SECURITY_LEVEL_CORRESPONDENCE:
			getDataSetSecurityLevelCorrespondence().clear();
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
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__CONFIGURATION_CORRESPONDENCES_ACCESS_ANALYSIS_CODE_QL:
			return configurationCorrespondences_AccessAnalysisCodeQL != null
					&& !configurationCorrespondences_AccessAnalysisCodeQL.isEmpty();
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT__DATA_SET_SECURITY_LEVEL_CORRESPONDENCE:
			return dataSetSecurityLevelCorrespondence != null && !dataSetSecurityLevelCorrespondence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccessAnalysisCodeQLCorrespondenceRootImpl
