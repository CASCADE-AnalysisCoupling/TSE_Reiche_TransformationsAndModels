/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionPackage;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification;

import edu.kit.kastel.sdq.coupling.models.identifier.impl.IdentifiedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ExtensionRootImpl#getProvidedParameterIdentification <em>Provided Parameter Identification</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ExtensionRootImpl#getParameterAnnotations <em>Parameter Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionRootImpl extends IdentifiedElementImpl implements ExtensionRoot {
	/**
	 * The cached value of the '{@link #getProvidedParameterIdentification() <em>Provided Parameter Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedParameterIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedParameterIdentification> providedParameterIdentification;

	/**
	 * The cached value of the '{@link #getParameterAnnotations() <em>Parameter Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedParameterCharacteristicAnnotation> parameterAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowanalysisextensionPackage.Literals.EXTENSION_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedParameterIdentification> getProvidedParameterIdentification() {
		if (providedParameterIdentification == null) {
			providedParameterIdentification = new EObjectContainmentEList<ProvidedParameterIdentification>(
					ProvidedParameterIdentification.class, this,
					DataflowanalysisextensionPackage.EXTENSION_ROOT__PROVIDED_PARAMETER_IDENTIFICATION);
		}
		return providedParameterIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedParameterCharacteristicAnnotation> getParameterAnnotations() {
		if (parameterAnnotations == null) {
			parameterAnnotations = new EObjectContainmentEList<ProvidedParameterCharacteristicAnnotation>(
					ProvidedParameterCharacteristicAnnotation.class, this,
					DataflowanalysisextensionPackage.EXTENSION_ROOT__PARAMETER_ANNOTATIONS);
		}
		return parameterAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DataflowanalysisextensionPackage.EXTENSION_ROOT__PROVIDED_PARAMETER_IDENTIFICATION:
			return ((InternalEList<?>) getProvidedParameterIdentification()).basicRemove(otherEnd, msgs);
		case DataflowanalysisextensionPackage.EXTENSION_ROOT__PARAMETER_ANNOTATIONS:
			return ((InternalEList<?>) getParameterAnnotations()).basicRemove(otherEnd, msgs);
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
		case DataflowanalysisextensionPackage.EXTENSION_ROOT__PROVIDED_PARAMETER_IDENTIFICATION:
			return getProvidedParameterIdentification();
		case DataflowanalysisextensionPackage.EXTENSION_ROOT__PARAMETER_ANNOTATIONS:
			return getParameterAnnotations();
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
		case DataflowanalysisextensionPackage.EXTENSION_ROOT__PROVIDED_PARAMETER_IDENTIFICATION:
			getProvidedParameterIdentification().clear();
			getProvidedParameterIdentification()
					.addAll((Collection<? extends ProvidedParameterIdentification>) newValue);
			return;
		case DataflowanalysisextensionPackage.EXTENSION_ROOT__PARAMETER_ANNOTATIONS:
			getParameterAnnotations().clear();
			getParameterAnnotations()
					.addAll((Collection<? extends ProvidedParameterCharacteristicAnnotation>) newValue);
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
		case DataflowanalysisextensionPackage.EXTENSION_ROOT__PROVIDED_PARAMETER_IDENTIFICATION:
			getProvidedParameterIdentification().clear();
			return;
		case DataflowanalysisextensionPackage.EXTENSION_ROOT__PARAMETER_ANNOTATIONS:
			getParameterAnnotations().clear();
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
		case DataflowanalysisextensionPackage.EXTENSION_ROOT__PROVIDED_PARAMETER_IDENTIFICATION:
			return providedParameterIdentification != null && !providedParameterIdentification.isEmpty();
		case DataflowanalysisextensionPackage.EXTENSION_ROOT__PARAMETER_ANNOTATIONS:
			return parameterAnnotations != null && !parameterAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExtensionRootImpl
