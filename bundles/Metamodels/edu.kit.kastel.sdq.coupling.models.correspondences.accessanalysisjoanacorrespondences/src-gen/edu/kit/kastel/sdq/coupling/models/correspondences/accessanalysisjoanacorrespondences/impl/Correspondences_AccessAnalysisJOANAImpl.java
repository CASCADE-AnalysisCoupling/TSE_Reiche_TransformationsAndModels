/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence;

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
 * An implementation of the model object '<em><b>Correspondences Access Analysis JOANA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.Correspondences_AccessAnalysisJOANAImpl#getEntryPointCorrespondences <em>Entry Point Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl.Correspondences_AccessAnalysisJOANAImpl#getDataSetLevelCorrespondences <em>Data Set Level Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Correspondences_AccessAnalysisJOANAImpl extends MinimalEObjectImpl.Container
		implements Correspondences_AccessAnalysisJOANA {
	/**
	 * The cached value of the '{@link #getEntryPointCorrespondences() <em>Entry Point Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPointCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryPointCorrespondence> entryPointCorrespondences;

	/**
	 * The cached value of the '{@link #getDataSetLevelCorrespondences() <em>Data Set Level Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetLevelCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetLevelCorrespondence> dataSetLevelCorrespondences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Correspondences_AccessAnalysisJOANAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessanalysisjoanacorrespondencesPackage.Literals.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryPointCorrespondence> getEntryPointCorrespondences() {
		if (entryPointCorrespondences == null) {
			entryPointCorrespondences = new EObjectContainmentEList<EntryPointCorrespondence>(
					EntryPointCorrespondence.class, this,
					AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__ENTRY_POINT_CORRESPONDENCES);
		}
		return entryPointCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetLevelCorrespondence> getDataSetLevelCorrespondences() {
		if (dataSetLevelCorrespondences == null) {
			dataSetLevelCorrespondences = new EObjectContainmentEList<DataSetLevelCorrespondence>(
					DataSetLevelCorrespondence.class, this,
					AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__DATA_SET_LEVEL_CORRESPONDENCES);
		}
		return dataSetLevelCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__ENTRY_POINT_CORRESPONDENCES:
			return ((InternalEList<?>) getEntryPointCorrespondences()).basicRemove(otherEnd, msgs);
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__DATA_SET_LEVEL_CORRESPONDENCES:
			return ((InternalEList<?>) getDataSetLevelCorrespondences()).basicRemove(otherEnd, msgs);
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
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__ENTRY_POINT_CORRESPONDENCES:
			return getEntryPointCorrespondences();
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__DATA_SET_LEVEL_CORRESPONDENCES:
			return getDataSetLevelCorrespondences();
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
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__ENTRY_POINT_CORRESPONDENCES:
			getEntryPointCorrespondences().clear();
			getEntryPointCorrespondences().addAll((Collection<? extends EntryPointCorrespondence>) newValue);
			return;
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__DATA_SET_LEVEL_CORRESPONDENCES:
			getDataSetLevelCorrespondences().clear();
			getDataSetLevelCorrespondences().addAll((Collection<? extends DataSetLevelCorrespondence>) newValue);
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
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__ENTRY_POINT_CORRESPONDENCES:
			getEntryPointCorrespondences().clear();
			return;
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__DATA_SET_LEVEL_CORRESPONDENCES:
			getDataSetLevelCorrespondences().clear();
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
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__ENTRY_POINT_CORRESPONDENCES:
			return entryPointCorrespondences != null && !entryPointCorrespondences.isEmpty();
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA__DATA_SET_LEVEL_CORRESPONDENCES:
			return dataSetLevelCorrespondences != null && !dataSetLevelCorrespondences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Correspondences_AccessAnalysisJOANAImpl
