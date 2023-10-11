/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.code.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.code.CodePackage;
import edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveType;
import edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveTypeNames;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeql.code.impl.PrimitiveTypeImpl#getPrimitiveTypeName <em>Primitive Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveTypeImpl extends TypeImpl implements PrimitiveType {
	/**
	 * The default value of the '{@link #getPrimitiveTypeName() <em>Primitive Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveTypeNames PRIMITIVE_TYPE_NAME_EDEFAULT = PrimitiveTypeNames.FLOAT;

	/**
	 * The cached value of the '{@link #getPrimitiveTypeName() <em>Primitive Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypeName()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveTypeNames primitiveTypeName = PRIMITIVE_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.PRIMITIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeNames getPrimitiveTypeName() {
		return primitiveTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimitiveTypeName(PrimitiveTypeNames newPrimitiveTypeName) {
		PrimitiveTypeNames oldPrimitiveTypeName = primitiveTypeName;
		primitiveTypeName = newPrimitiveTypeName == null ? PRIMITIVE_TYPE_NAME_EDEFAULT : newPrimitiveTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PRIMITIVE_TYPE__PRIMITIVE_TYPE_NAME,
					oldPrimitiveTypeName, primitiveTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodePackage.PRIMITIVE_TYPE__PRIMITIVE_TYPE_NAME:
			return getPrimitiveTypeName();
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
		case CodePackage.PRIMITIVE_TYPE__PRIMITIVE_TYPE_NAME:
			setPrimitiveTypeName((PrimitiveTypeNames) newValue);
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
		case CodePackage.PRIMITIVE_TYPE__PRIMITIVE_TYPE_NAME:
			setPrimitiveTypeName(PRIMITIVE_TYPE_NAME_EDEFAULT);
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
		case CodePackage.PRIMITIVE_TYPE__PRIMITIVE_TYPE_NAME:
			return primitiveTypeName != PRIMITIVE_TYPE_NAME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (primitiveTypeName: ");
		result.append(primitiveTypeName);
		result.append(')');
		return result.toString();
	}

} //PrimitiveTypeImpl
