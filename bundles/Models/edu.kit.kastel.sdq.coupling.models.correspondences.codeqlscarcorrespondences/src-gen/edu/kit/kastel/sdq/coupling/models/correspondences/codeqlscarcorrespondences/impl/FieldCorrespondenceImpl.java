/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.FieldCorrespondenceImpl#getJavaField <em>Java Field</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.FieldCorrespondenceImpl#getScarField <em>Scar Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldCorrespondenceImpl extends SystemElementCorrespondenceImpl implements FieldCorrespondence {
	/**
	 * The cached value of the '{@link #getJavaField() <em>Java Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaField()
	 * @generated
	 * @ordered
	 */
	protected Field javaField;

	/**
	 * The cached value of the '{@link #getScarField() <em>Scar Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScarField()
	 * @generated
	 * @ordered
	 */
	protected FieldIdentification scarField;

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
	public Field getJavaField() {
		if (javaField != null && javaField.eIsProxy()) {
			InternalEObject oldJavaField = (InternalEObject) javaField;
			javaField = (Field) eResolveProxy(oldJavaField);
			if (javaField != oldJavaField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__JAVA_FIELD, oldJavaField,
							javaField));
			}
		}
		return javaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetJavaField() {
		return javaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaField(Field newJavaField) {
		Field oldJavaField = javaField;
		javaField = newJavaField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__JAVA_FIELD, oldJavaField, javaField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldIdentification getScarField() {
		if (scarField != null && scarField.eIsProxy()) {
			InternalEObject oldScarField = (InternalEObject) scarField;
			scarField = (FieldIdentification) eResolveProxy(oldScarField);
			if (scarField != oldScarField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__SCAR_FIELD, oldScarField,
							scarField));
			}
		}
		return scarField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldIdentification basicGetScarField() {
		return scarField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScarField(FieldIdentification newScarField) {
		FieldIdentification oldScarField = scarField;
		scarField = newScarField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__SCAR_FIELD, oldScarField, scarField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__JAVA_FIELD:
			if (resolve)
				return getJavaField();
			return basicGetJavaField();
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__SCAR_FIELD:
			if (resolve)
				return getScarField();
			return basicGetScarField();
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
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__JAVA_FIELD:
			setJavaField((Field) newValue);
			return;
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__SCAR_FIELD:
			setScarField((FieldIdentification) newValue);
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
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__JAVA_FIELD:
			setJavaField((Field) null);
			return;
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__SCAR_FIELD:
			setScarField((FieldIdentification) null);
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
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__JAVA_FIELD:
			return javaField != null;
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE__SCAR_FIELD:
			return scarField != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldCorrespondenceImpl
