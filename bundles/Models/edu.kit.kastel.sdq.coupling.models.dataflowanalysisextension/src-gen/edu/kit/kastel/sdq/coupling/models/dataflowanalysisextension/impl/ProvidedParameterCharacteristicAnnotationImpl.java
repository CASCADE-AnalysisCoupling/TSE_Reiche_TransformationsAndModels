/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.CharacteristicsAnnotation;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification;

import edu.kit.kastel.sdq.coupling.models.identifier.impl.IdentifiedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Parameter Characteristic Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterCharacteristicAnnotationImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterCharacteristicAnnotationImpl#getProvidedParameter <em>Provided Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedParameterCharacteristicAnnotationImpl extends IdentifiedElementImpl
		implements ProvidedParameterCharacteristicAnnotation {
	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumCharacteristic> characteristics;

	/**
	 * The cached value of the '{@link #getProvidedParameter() <em>Provided Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedParameter()
	 * @generated
	 * @ordered
	 */
	protected ProvidedParameterIdentification providedParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedParameterCharacteristicAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowanalysisextensionPackage.Literals.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumCharacteristic> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectContainmentEList<EnumCharacteristic>(EnumCharacteristic.class, this,
					DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedParameterIdentification getProvidedParameter() {
		if (providedParameter != null && providedParameter.eIsProxy()) {
			InternalEObject oldProvidedParameter = (InternalEObject) providedParameter;
			providedParameter = (ProvidedParameterIdentification) eResolveProxy(oldProvidedParameter);
			if (providedParameter != oldProvidedParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__PROVIDED_PARAMETER,
							oldProvidedParameter, providedParameter));
			}
		}
		return providedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedParameterIdentification basicGetProvidedParameter() {
		return providedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedParameter(ProvidedParameterIdentification newProvidedParameter) {
		ProvidedParameterIdentification oldProvidedParameter = providedParameter;
		providedParameter = newProvidedParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__PROVIDED_PARAMETER,
					oldProvidedParameter, providedParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__CHARACTERISTICS:
			return ((InternalEList<?>) getCharacteristics()).basicRemove(otherEnd, msgs);
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
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__CHARACTERISTICS:
			return getCharacteristics();
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__PROVIDED_PARAMETER:
			if (resolve)
				return getProvidedParameter();
			return basicGetProvidedParameter();
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
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__CHARACTERISTICS:
			getCharacteristics().clear();
			getCharacteristics().addAll((Collection<? extends EnumCharacteristic>) newValue);
			return;
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__PROVIDED_PARAMETER:
			setProvidedParameter((ProvidedParameterIdentification) newValue);
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
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__CHARACTERISTICS:
			getCharacteristics().clear();
			return;
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__PROVIDED_PARAMETER:
			setProvidedParameter((ProvidedParameterIdentification) null);
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
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__CHARACTERISTICS:
			return characteristics != null && !characteristics.isEmpty();
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__PROVIDED_PARAMETER:
			return providedParameter != null;
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
		if (baseClass == CharacteristicsAnnotation.class) {
			switch (derivedFeatureID) {
			case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__CHARACTERISTICS:
				return DataflowanalysisextensionPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS;
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
		if (baseClass == CharacteristicsAnnotation.class) {
			switch (baseFeatureID) {
			case DataflowanalysisextensionPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
				return DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__CHARACTERISTICS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProvidedParameterCharacteristicAnnotationImpl
