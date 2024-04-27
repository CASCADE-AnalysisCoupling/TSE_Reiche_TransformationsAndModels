/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage;

import edu.kit.kastel.sdq.coupling.models.java.members.Field;

import edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.FieldCorrespondenceImpl#getField_JAVA <em>Field JAVA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.FieldCorrespondenceImpl#getField_SCAR <em>Field SCAR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldCorrespondenceImpl extends SystemElementCorrespondenceImpl implements FieldCorrespondence {
	/**
	 * The cached value of the '{@link #getField_JAVA() <em>Field JAVA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField_JAVA()
	 * @generated
	 * @ordered
	 */
	protected Field field_JAVA;

	/**
	 * The cached value of the '{@link #getField_SCAR() <em>Field SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField_SCAR()
	 * @generated
	 * @ordered
	 */
	protected FieldIdentifying field_SCAR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanascarcorrespondencesPackage.Literals.FIELD_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getField_JAVA() {
		if (field_JAVA != null && field_JAVA.eIsProxy()) {
			InternalEObject oldField_JAVA = (InternalEObject) field_JAVA;
			field_JAVA = (Field) eResolveProxy(oldField_JAVA);
			if (field_JAVA != oldField_JAVA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA, oldField_JAVA,
							field_JAVA));
			}
		}
		return field_JAVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetField_JAVA() {
		return field_JAVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField_JAVA(Field newField_JAVA) {
		Field oldField_JAVA = field_JAVA;
		field_JAVA = newField_JAVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA, oldField_JAVA, field_JAVA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldIdentifying getField_SCAR() {
		if (field_SCAR != null && field_SCAR.eIsProxy()) {
			InternalEObject oldField_SCAR = (InternalEObject) field_SCAR;
			field_SCAR = (FieldIdentifying) eResolveProxy(oldField_SCAR);
			if (field_SCAR != oldField_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR, oldField_SCAR,
							field_SCAR));
			}
		}
		return field_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldIdentifying basicGetField_SCAR() {
		return field_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField_SCAR(FieldIdentifying newField_SCAR) {
		FieldIdentifying oldField_SCAR = field_SCAR;
		field_SCAR = newField_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR, oldField_SCAR, field_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA:
			if (resolve)
				return getField_JAVA();
			return basicGetField_JAVA();
		case JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR:
			if (resolve)
				return getField_SCAR();
			return basicGetField_SCAR();
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
		case JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA:
			setField_JAVA((Field) newValue);
			return;
		case JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR:
			setField_SCAR((FieldIdentifying) newValue);
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
		case JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA:
			setField_JAVA((Field) null);
			return;
		case JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR:
			setField_SCAR((FieldIdentifying) null);
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
		case JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA:
			return field_JAVA != null;
		case JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR:
			return field_SCAR != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldCorrespondenceImpl
