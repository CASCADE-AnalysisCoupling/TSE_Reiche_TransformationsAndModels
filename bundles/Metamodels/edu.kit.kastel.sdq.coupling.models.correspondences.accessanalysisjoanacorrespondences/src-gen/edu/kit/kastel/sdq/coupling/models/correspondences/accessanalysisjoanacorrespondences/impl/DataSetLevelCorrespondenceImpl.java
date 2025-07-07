/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;

import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence;

import edu.kit.kastel.sdq.coupling.models.joana.Level;

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
 * An implementation of the model object '<em><b>Data Set Level Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.DataSetLevelCorrespondenceImpl#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.DataSetLevelCorrespondenceImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetLevelCorrespondenceImpl extends MinimalEObjectImpl.Container implements DataSetLevelCorrespondence {
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
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetLevelCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessanalysisjoanacorrespondencesPackage.Literals.DATA_SET_LEVEL_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSet> getDataSets() {
		if (dataSets == null) {
			dataSets = new EObjectResolvingEList<DataSet>(DataSet.class, this,
					AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__DATA_SETS);
		}
		return dataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject) level;
			level = (Level) eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__LEVEL, oldLevel,
							level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Level newLevel) {
		Level oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__DATA_SETS:
			return getDataSets();
		case AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__LEVEL:
			if (resolve)
				return getLevel();
			return basicGetLevel();
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
		case AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__DATA_SETS:
			getDataSets().clear();
			getDataSets().addAll((Collection<? extends DataSet>) newValue);
			return;
		case AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__LEVEL:
			setLevel((Level) newValue);
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
		case AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__DATA_SETS:
			getDataSets().clear();
			return;
		case AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__LEVEL:
			setLevel((Level) null);
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
		case AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__DATA_SETS:
			return dataSets != null && !dataSets.isEmpty();
		case AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE__LEVEL:
			return level != null;
		}
		return super.eIsSet(featureID);
	}

} //DataSetLevelCorrespondenceImpl
