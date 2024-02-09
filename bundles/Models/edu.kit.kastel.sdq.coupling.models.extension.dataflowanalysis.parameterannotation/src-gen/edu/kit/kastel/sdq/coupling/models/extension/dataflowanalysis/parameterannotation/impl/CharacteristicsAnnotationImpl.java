/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.CharacteristicsAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationPackage;

import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristics Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.CharacteristicsAnnotationImpl#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CharacteristicsAnnotationImpl extends MinimalEObjectImpl.Container
		implements CharacteristicsAnnotation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicsAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParameterannotationPackage.Literals.CHARACTERISTICS_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumCharacteristic> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectContainmentEList<EnumCharacteristic>(EnumCharacteristic.class, this,
					ParameterannotationPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ParameterannotationPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
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
		case ParameterannotationPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
			return getCharacteristics();
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
		case ParameterannotationPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
			getCharacteristics().clear();
			getCharacteristics().addAll((Collection<? extends EnumCharacteristic>) newValue);
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
		case ParameterannotationPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
			getCharacteristics().clear();
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
		case ParameterannotationPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
			return characteristics != null && !characteristics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CharacteristicsAnnotationImpl
