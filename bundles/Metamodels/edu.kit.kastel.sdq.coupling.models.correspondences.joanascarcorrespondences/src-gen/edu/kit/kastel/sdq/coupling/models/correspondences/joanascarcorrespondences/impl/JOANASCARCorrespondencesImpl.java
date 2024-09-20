/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.SystemElementCorrespondence;

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
 * An implementation of the model object '<em><b>JOANASCAR Correspondences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JOANASCARCorrespondencesImpl#getEntryPointCorrespondences <em>Entry Point Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JOANASCARCorrespondencesImpl#getLevelCorrespondences <em>Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JOANASCARCorrespondencesImpl#getSystemElementCorrespondences <em>System Element Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JOANASCARCorrespondencesImpl extends MinimalEObjectImpl.Container implements JOANASCARCorrespondences {
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
	 * The cached value of the '{@link #getLevelCorrespondences() <em>Level Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<LevelCorrespondence> levelCorrespondences;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JOANASCARCorrespondencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanascarcorrespondencesPackage.Literals.JOANASCAR_CORRESPONDENCES;
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
					JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__ENTRY_POINT_CORRESPONDENCES);
		}
		return entryPointCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LevelCorrespondence> getLevelCorrespondences() {
		if (levelCorrespondences == null) {
			levelCorrespondences = new EObjectContainmentEList<LevelCorrespondence>(LevelCorrespondence.class, this,
					JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__LEVEL_CORRESPONDENCES);
		}
		return levelCorrespondences;
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
					JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES);
		}
		return systemElementCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__ENTRY_POINT_CORRESPONDENCES:
			return ((InternalEList<?>) getEntryPointCorrespondences()).basicRemove(otherEnd, msgs);
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__LEVEL_CORRESPONDENCES:
			return ((InternalEList<?>) getLevelCorrespondences()).basicRemove(otherEnd, msgs);
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES:
			return ((InternalEList<?>) getSystemElementCorrespondences()).basicRemove(otherEnd, msgs);
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
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__ENTRY_POINT_CORRESPONDENCES:
			return getEntryPointCorrespondences();
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__LEVEL_CORRESPONDENCES:
			return getLevelCorrespondences();
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES:
			return getSystemElementCorrespondences();
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
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__ENTRY_POINT_CORRESPONDENCES:
			getEntryPointCorrespondences().clear();
			getEntryPointCorrespondences().addAll((Collection<? extends EntryPointCorrespondence>) newValue);
			return;
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__LEVEL_CORRESPONDENCES:
			getLevelCorrespondences().clear();
			getLevelCorrespondences().addAll((Collection<? extends LevelCorrespondence>) newValue);
			return;
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES:
			getSystemElementCorrespondences().clear();
			getSystemElementCorrespondences().addAll((Collection<? extends SystemElementCorrespondence>) newValue);
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
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__ENTRY_POINT_CORRESPONDENCES:
			getEntryPointCorrespondences().clear();
			return;
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__LEVEL_CORRESPONDENCES:
			getLevelCorrespondences().clear();
			return;
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES:
			getSystemElementCorrespondences().clear();
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
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__ENTRY_POINT_CORRESPONDENCES:
			return entryPointCorrespondences != null && !entryPointCorrespondences.isEmpty();
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__LEVEL_CORRESPONDENCES:
			return levelCorrespondences != null && !levelCorrespondences.isEmpty();
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES:
			return systemElementCorrespondences != null && !systemElementCorrespondences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JOANASCARCorrespondencesImpl
