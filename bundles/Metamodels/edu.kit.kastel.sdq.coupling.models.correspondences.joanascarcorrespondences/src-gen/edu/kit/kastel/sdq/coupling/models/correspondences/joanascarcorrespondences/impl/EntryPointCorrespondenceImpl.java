/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.EntryPointCorrespondenceImpl#getEntryPoint_JOANA <em>Entry Point JOANA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.EntryPointCorrespondenceImpl#getEntryPoint_SCAR <em>Entry Point SCAR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryPointCorrespondenceImpl extends MinimalEObjectImpl.Container implements EntryPointCorrespondence {
	/**
	 * The cached value of the '{@link #getEntryPoint_JOANA() <em>Entry Point JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint_JOANA()
	 * @generated
	 * @ordered
	 */
	protected HybridConfiguration entryPoint_JOANA;

	/**
	 * The cached value of the '{@link #getEntryPoint_SCAR() <em>Entry Point SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint_SCAR()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint_SCAR entryPoint_SCAR;

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
		return JoanascarcorrespondencesPackage.Literals.ENTRY_POINT_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridConfiguration getEntryPoint_JOANA() {
		if (entryPoint_JOANA != null && entryPoint_JOANA.eIsProxy()) {
			InternalEObject oldEntryPoint_JOANA = (InternalEObject) entryPoint_JOANA;
			entryPoint_JOANA = (HybridConfiguration) eResolveProxy(oldEntryPoint_JOANA);
			if (entryPoint_JOANA != oldEntryPoint_JOANA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_JOANA,
							oldEntryPoint_JOANA, entryPoint_JOANA));
			}
		}
		return entryPoint_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridConfiguration basicGetEntryPoint_JOANA() {
		return entryPoint_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint_JOANA(HybridConfiguration newEntryPoint_JOANA) {
		HybridConfiguration oldEntryPoint_JOANA = entryPoint_JOANA;
		entryPoint_JOANA = newEntryPoint_JOANA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_JOANA, oldEntryPoint_JOANA,
					entryPoint_JOANA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint_SCAR getEntryPoint_SCAR() {
		if (entryPoint_SCAR != null && entryPoint_SCAR.eIsProxy()) {
			InternalEObject oldEntryPoint_SCAR = (InternalEObject) entryPoint_SCAR;
			entryPoint_SCAR = (EntryPoint_SCAR) eResolveProxy(oldEntryPoint_SCAR);
			if (entryPoint_SCAR != oldEntryPoint_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_SCAR,
							oldEntryPoint_SCAR, entryPoint_SCAR));
			}
		}
		return entryPoint_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint_SCAR basicGetEntryPoint_SCAR() {
		return entryPoint_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint_SCAR(EntryPoint_SCAR newEntryPoint_SCAR) {
		EntryPoint_SCAR oldEntryPoint_SCAR = entryPoint_SCAR;
		entryPoint_SCAR = newEntryPoint_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_SCAR, oldEntryPoint_SCAR,
					entryPoint_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_JOANA:
			if (resolve)
				return getEntryPoint_JOANA();
			return basicGetEntryPoint_JOANA();
		case JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_SCAR:
			if (resolve)
				return getEntryPoint_SCAR();
			return basicGetEntryPoint_SCAR();
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
		case JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_JOANA:
			setEntryPoint_JOANA((HybridConfiguration) newValue);
			return;
		case JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_SCAR:
			setEntryPoint_SCAR((EntryPoint_SCAR) newValue);
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
		case JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_JOANA:
			setEntryPoint_JOANA((HybridConfiguration) null);
			return;
		case JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_SCAR:
			setEntryPoint_SCAR((EntryPoint_SCAR) null);
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
		case JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_JOANA:
			return entryPoint_JOANA != null;
		case JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_SCAR:
			return entryPoint_SCAR != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryPointCorrespondenceImpl
