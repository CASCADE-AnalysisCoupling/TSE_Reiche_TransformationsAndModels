/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.CharacteristicsAnnotation;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage;

import edu.kit.kastel.sdq.coupling.models.identifier.impl.IdentifiedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristics Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.CharacteristicsAnnotationImpl#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CharacteristicsAnnotationImpl extends IdentifiedElementImpl implements CharacteristicsAnnotation {
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
		return DataflowanalysisextensionPackage.Literals.CHARACTERISTICS_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumCharacteristic> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectContainmentEList<EnumCharacteristic>(EnumCharacteristic.class, this,
					DataflowanalysisextensionPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS);
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
		case DataflowanalysisextensionPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
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
		case DataflowanalysisextensionPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
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
		case DataflowanalysisextensionPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
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
		case DataflowanalysisextensionPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
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
		case DataflowanalysisextensionPackage.CHARACTERISTICS_ANNOTATION__CHARACTERISTICS:
			return characteristics != null && !characteristics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CharacteristicsAnnotationImpl
