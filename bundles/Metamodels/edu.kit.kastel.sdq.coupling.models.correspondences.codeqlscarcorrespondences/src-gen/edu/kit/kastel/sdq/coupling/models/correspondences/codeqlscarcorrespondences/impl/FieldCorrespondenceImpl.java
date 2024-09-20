/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence;

import edu.kit.kastel.sdq.coupling.models.java.members.Field;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.FieldCorrespondenceImpl#getField_Java <em>Field Java</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.FieldCorrespondenceImpl#getField_SCAR <em>Field SCAR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldCorrespondenceImpl extends SystemElementCorrespondenceImpl implements FieldCorrespondence {
	/**
	 * The cached value of the '{@link #getField_Java() <em>Field Java</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField_Java()
	 * @generated
	 * @ordered
	 */
	protected Field field_Java;

	/**
	 * The cached value of the '{@link #getField_SCAR() <em>Field SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField_SCAR()
	 * @generated
	 * @ordered
	 */
	protected Field_SCAR field_SCAR;

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
		return CodeqlscarcorrespondencesPackage.Literals.FIELD_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getField_Java() {
		if (field_Java != null && field_Java.eIsProxy()) {
			InternalEObject oldField_Java = (InternalEObject) field_Java;
			field_Java = (Field) eResolveProxy(oldField_Java);
			if (field_Java != oldField_Java) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA, oldField_Java,
							field_Java));
			}
		}
		return field_Java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetField_Java() {
		return field_Java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField_Java(Field newField_Java) {
		Field oldField_Java = field_Java;
		field_Java = newField_Java;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA, oldField_Java, field_Java));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field_SCAR getField_SCAR() {
		if (field_SCAR != null && field_SCAR.eIsProxy()) {
			InternalEObject oldField_SCAR = (InternalEObject) field_SCAR;
			field_SCAR = (Field_SCAR) eResolveProxy(oldField_SCAR);
			if (field_SCAR != oldField_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR, oldField_SCAR,
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
	public Field_SCAR basicGetField_SCAR() {
		return field_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField_SCAR(Field_SCAR newField_SCAR) {
		Field_SCAR oldField_SCAR = field_SCAR;
		field_SCAR = newField_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR, oldField_SCAR, field_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA:
			if (resolve)
				return getField_Java();
			return basicGetField_Java();
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR:
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
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA:
			setField_Java((Field) newValue);
			return;
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR:
			setField_SCAR((Field_SCAR) newValue);
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
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA:
			setField_Java((Field) null);
			return;
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR:
			setField_SCAR((Field_SCAR) null);
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
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_JAVA:
			return field_Java != null;
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__FIELD_SCAR:
			return field_SCAR != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldCorrespondenceImpl
