/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;

import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Security Level Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.DataSetSecurityLevelCorrespondenceImpl#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl.DataSetSecurityLevelCorrespondenceImpl#getSecurityLevel <em>Security Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetSecurityLevelCorrespondenceImpl extends MinimalEObjectImpl.Container
		implements DataSetSecurityLevelCorrespondence {
	/**
	 * The cached value of the '{@link #getDataSets() <em>Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSet> dataSets;

	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel securityLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetSecurityLevelCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessanalysiscodeqlcorrespondencePackage.Literals.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSet> getDataSets() {
		if (dataSets == null) {
			dataSets = new EObjectResolvingEList<DataSet>(DataSet.class, this,
					AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__DATA_SETS);
		}
		return dataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel getSecurityLevel() {
		if (securityLevel != null && securityLevel.eIsProxy()) {
			InternalEObject oldSecurityLevel = (InternalEObject) securityLevel;
			securityLevel = (SecurityLevel) eResolveProxy(oldSecurityLevel);
			if (securityLevel != oldSecurityLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL,
							oldSecurityLevel, securityLevel));
			}
		}
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel basicGetSecurityLevel() {
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel(SecurityLevel newSecurityLevel) {
		SecurityLevel oldSecurityLevel = securityLevel;
		securityLevel = newSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL,
					oldSecurityLevel, securityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__DATA_SETS:
			return getDataSets();
		case AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL:
			if (resolve)
				return getSecurityLevel();
			return basicGetSecurityLevel();
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
		case AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__DATA_SETS:
			getDataSets().clear();
			getDataSets().addAll((Collection<? extends DataSet>) newValue);
			return;
		case AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL:
			setSecurityLevel((SecurityLevel) newValue);
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
		case AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__DATA_SETS:
			getDataSets().clear();
			return;
		case AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL:
			setSecurityLevel((SecurityLevel) null);
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
		case AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__DATA_SETS:
			return dataSets != null && !dataSets.isEmpty();
		case AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE__SECURITY_LEVEL:
			return securityLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //DataSetSecurityLevelCorrespondenceImpl
