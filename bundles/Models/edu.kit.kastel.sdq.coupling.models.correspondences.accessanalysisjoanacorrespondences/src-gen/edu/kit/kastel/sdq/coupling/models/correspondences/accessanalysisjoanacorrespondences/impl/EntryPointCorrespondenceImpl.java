/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;

import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence;

import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.EntryPointCorrespondenceImpl#getAccessAnalysisConfig <em>Access Analysis Config</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.EntryPointCorrespondenceImpl#getEntryPoint <em>Entry Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryPointCorrespondenceImpl extends MinimalEObjectImpl.Container implements EntryPointCorrespondence {
	/**
	 * The cached value of the '{@link #getAccessAnalysisConfig() <em>Access Analysis Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessAnalysisConfig()
	 * @generated
	 * @ordered
	 */
	protected ConfidentialitySpecification accessAnalysisConfig;

	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint entryPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessanalysisjoanacorrespondencesPackage.Literals.ENTRY_POINT_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialitySpecification getAccessAnalysisConfig() {
		if (accessAnalysisConfig != null && accessAnalysisConfig.eIsProxy()) {
			InternalEObject oldAccessAnalysisConfig = (InternalEObject) accessAnalysisConfig;
			accessAnalysisConfig = (ConfidentialitySpecification) eResolveProxy(oldAccessAnalysisConfig);
			if (accessAnalysisConfig != oldAccessAnalysisConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG,
							oldAccessAnalysisConfig, accessAnalysisConfig));
			}
		}
		return accessAnalysisConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialitySpecification basicGetAccessAnalysisConfig() {
		return accessAnalysisConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessAnalysisConfig(ConfidentialitySpecification newAccessAnalysisConfig) {
		ConfidentialitySpecification oldAccessAnalysisConfig = accessAnalysisConfig;
		accessAnalysisConfig = newAccessAnalysisConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG,
					oldAccessAnalysisConfig, accessAnalysisConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint getEntryPoint() {
		if (entryPoint != null && entryPoint.eIsProxy()) {
			InternalEObject oldEntryPoint = (InternalEObject) entryPoint;
			entryPoint = (EntryPoint) eResolveProxy(oldEntryPoint);
			if (entryPoint != oldEntryPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT,
							oldEntryPoint, entryPoint));
			}
		}
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint basicGetEntryPoint() {
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint(EntryPoint newEntryPoint) {
		EntryPoint oldEntryPoint = entryPoint;
		entryPoint = newEntryPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT, oldEntryPoint,
					entryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG:
			if (resolve)
				return getAccessAnalysisConfig();
			return basicGetAccessAnalysisConfig();
		case AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT:
			if (resolve)
				return getEntryPoint();
			return basicGetEntryPoint();
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
		case AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG:
			setAccessAnalysisConfig((ConfidentialitySpecification) newValue);
			return;
		case AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT:
			setEntryPoint((EntryPoint) newValue);
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
		case AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG:
			setAccessAnalysisConfig((ConfidentialitySpecification) null);
			return;
		case AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT:
			setEntryPoint((EntryPoint) null);
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
		case AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ACCESS_ANALYSIS_CONFIG:
			return accessAnalysisConfig != null;
		case AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT:
			return entryPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryPointCorrespondenceImpl
