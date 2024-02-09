/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;
import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterAnnotationImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterAnnotationImpl#getParameterIdentification <em>Parameter Identification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterAnnotationImpl extends CharacteristicsAnnotationImpl implements ParameterAnnotation {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterIdentification() <em>Parameter Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterIdentification()
	 * @generated
	 * @ordered
	 */
	protected GeneralOperationParameterIdentification parameterIdentification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParameterannotationPackage.Literals.PARAMETER_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParameterannotationPackage.PARAMETER_ANNOTATION__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralOperationParameterIdentification getParameterIdentification() {
		return parameterIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterIdentification(
			GeneralOperationParameterIdentification newParameterIdentification, NotificationChain msgs) {
		GeneralOperationParameterIdentification oldParameterIdentification = parameterIdentification;
		parameterIdentification = newParameterIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ParameterannotationPackage.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION,
					oldParameterIdentification, newParameterIdentification);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterIdentification(GeneralOperationParameterIdentification newParameterIdentification) {
		if (newParameterIdentification != parameterIdentification) {
			NotificationChain msgs = null;
			if (parameterIdentification != null)
				msgs = ((InternalEObject) parameterIdentification).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ParameterannotationPackage.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION,
						null, msgs);
			if (newParameterIdentification != null)
				msgs = ((InternalEObject) newParameterIdentification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ParameterannotationPackage.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION,
						null, msgs);
			msgs = basicSetParameterIdentification(newParameterIdentification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ParameterannotationPackage.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION,
					newParameterIdentification, newParameterIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ParameterannotationPackage.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION:
			return basicSetParameterIdentification(null, msgs);
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
		case ParameterannotationPackage.PARAMETER_ANNOTATION__ID:
			return getId();
		case ParameterannotationPackage.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION:
			return getParameterIdentification();
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
		case ParameterannotationPackage.PARAMETER_ANNOTATION__ID:
			setId((String) newValue);
			return;
		case ParameterannotationPackage.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION:
			setParameterIdentification((GeneralOperationParameterIdentification) newValue);
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
		case ParameterannotationPackage.PARAMETER_ANNOTATION__ID:
			setId(ID_EDEFAULT);
			return;
		case ParameterannotationPackage.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION:
			setParameterIdentification((GeneralOperationParameterIdentification) null);
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
		case ParameterannotationPackage.PARAMETER_ANNOTATION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ParameterannotationPackage.PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION:
			return parameterIdentification != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiedElement.class) {
			switch (derivedFeatureID) {
			case ParameterannotationPackage.PARAMETER_ANNOTATION__ID:
				return IdentifierPackage.IDENTIFIED_ELEMENT__ID;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiedElement.class) {
			switch (baseFeatureID) {
			case IdentifierPackage.IDENTIFIED_ELEMENT__ID:
				return ParameterannotationPackage.PARAMETER_ANNOTATION__ID;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ParameterAnnotationImpl
