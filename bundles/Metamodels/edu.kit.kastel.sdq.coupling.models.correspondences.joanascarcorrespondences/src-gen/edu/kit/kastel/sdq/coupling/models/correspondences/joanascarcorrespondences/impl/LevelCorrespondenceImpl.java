/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence;

import edu.kit.kastel.sdq.coupling.models.joana.Level;

import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.LevelCorrespondenceImpl#getLevel_JOANA <em>Level JOANA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.LevelCorrespondenceImpl#getLevel_SCAR <em>Level SCAR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelCorrespondenceImpl extends MinimalEObjectImpl.Container implements LevelCorrespondence {
	/**
	 * The cached value of the '{@link #getLevel_JOANA() <em>Level JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel_JOANA()
	 * @generated
	 * @ordered
	 */
	protected Level level_JOANA;

	/**
	 * The cached value of the '{@link #getLevel_SCAR() <em>Level SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel_SCAR()
	 * @generated
	 * @ordered
	 */
	protected Level_SCAR level_SCAR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanascarcorrespondencesPackage.Literals.LEVEL_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getLevel_JOANA() {
		if (level_JOANA != null && level_JOANA.eIsProxy()) {
			InternalEObject oldLevel_JOANA = (InternalEObject) level_JOANA;
			level_JOANA = (Level) eResolveProxy(oldLevel_JOANA);
			if (level_JOANA != oldLevel_JOANA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_JOANA, oldLevel_JOANA,
							level_JOANA));
			}
		}
		return level_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetLevel_JOANA() {
		return level_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel_JOANA(Level newLevel_JOANA) {
		Level oldLevel_JOANA = level_JOANA;
		level_JOANA = newLevel_JOANA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_JOANA, oldLevel_JOANA, level_JOANA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_SCAR getLevel_SCAR() {
		if (level_SCAR != null && level_SCAR.eIsProxy()) {
			InternalEObject oldLevel_SCAR = (InternalEObject) level_SCAR;
			level_SCAR = (Level_SCAR) eResolveProxy(oldLevel_SCAR);
			if (level_SCAR != oldLevel_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_SCAR, oldLevel_SCAR,
							level_SCAR));
			}
		}
		return level_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_SCAR basicGetLevel_SCAR() {
		return level_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel_SCAR(Level_SCAR newLevel_SCAR) {
		Level_SCAR oldLevel_SCAR = level_SCAR;
		level_SCAR = newLevel_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_SCAR, oldLevel_SCAR, level_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_JOANA:
			if (resolve)
				return getLevel_JOANA();
			return basicGetLevel_JOANA();
		case JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_SCAR:
			if (resolve)
				return getLevel_SCAR();
			return basicGetLevel_SCAR();
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
		case JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_JOANA:
			setLevel_JOANA((Level) newValue);
			return;
		case JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_SCAR:
			setLevel_SCAR((Level_SCAR) newValue);
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
		case JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_JOANA:
			setLevel_JOANA((Level) null);
			return;
		case JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_SCAR:
			setLevel_SCAR((Level_SCAR) null);
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
		case JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_JOANA:
			return level_JOANA != null;
		case JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE__LEVEL_SCAR:
			return level_SCAR != null;
		}
		return super.eIsSet(featureID);
	}

} //LevelCorrespondenceImpl
