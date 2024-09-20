/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;

import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.ConfigurationCorrespondenceImpl#getConfiguration_EDFA <em>Configuration EDFA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.ConfigurationCorrespondenceImpl#getConfiguration_JOANA <em>Configuration JOANA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationCorrespondenceImpl extends MinimalEObjectImpl.Container
		implements ConfigurationCorrespondence {
	/**
	 * The cached value of the '{@link #getConfiguration_EDFA() <em>Configuration EDFA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_EDFA()
	 * @generated
	 * @ordered
	 */
	protected ParameterAnnotations configuration_EDFA;

	/**
	 * The cached value of the '{@link #getConfiguration_JOANA() <em>Configuration JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_JOANA()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint configuration_JOANA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdfajoanacorrespondencesPackage.Literals.CONFIGURATION_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterAnnotations getConfiguration_EDFA() {
		if (configuration_EDFA != null && configuration_EDFA.eIsProxy()) {
			InternalEObject oldConfiguration_EDFA = (InternalEObject) configuration_EDFA;
			configuration_EDFA = (ParameterAnnotations) eResolveProxy(oldConfiguration_EDFA);
			if (configuration_EDFA != oldConfiguration_EDFA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_EDFA,
							oldConfiguration_EDFA, configuration_EDFA));
			}
		}
		return configuration_EDFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterAnnotations basicGetConfiguration_EDFA() {
		return configuration_EDFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration_EDFA(ParameterAnnotations newConfiguration_EDFA) {
		ParameterAnnotations oldConfiguration_EDFA = configuration_EDFA;
		configuration_EDFA = newConfiguration_EDFA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_EDFA,
					oldConfiguration_EDFA, configuration_EDFA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryPoint getConfiguration_JOANA() {
		if (configuration_JOANA != null && configuration_JOANA.eIsProxy()) {
			InternalEObject oldConfiguration_JOANA = (InternalEObject) configuration_JOANA;
			configuration_JOANA = (EntryPoint) eResolveProxy(oldConfiguration_JOANA);
			if (configuration_JOANA != oldConfiguration_JOANA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_JOANA,
							oldConfiguration_JOANA, configuration_JOANA));
			}
		}
		return configuration_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint basicGetConfiguration_JOANA() {
		return configuration_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration_JOANA(EntryPoint newConfiguration_JOANA) {
		EntryPoint oldConfiguration_JOANA = configuration_JOANA;
		configuration_JOANA = newConfiguration_JOANA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_JOANA,
					oldConfiguration_JOANA, configuration_JOANA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_EDFA:
			if (resolve)
				return getConfiguration_EDFA();
			return basicGetConfiguration_EDFA();
		case EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_JOANA:
			if (resolve)
				return getConfiguration_JOANA();
			return basicGetConfiguration_JOANA();
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
		case EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_EDFA:
			setConfiguration_EDFA((ParameterAnnotations) newValue);
			return;
		case EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_JOANA:
			setConfiguration_JOANA((EntryPoint) newValue);
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
		case EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_EDFA:
			setConfiguration_EDFA((ParameterAnnotations) null);
			return;
		case EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_JOANA:
			setConfiguration_JOANA((EntryPoint) null);
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
		case EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_EDFA:
			return configuration_EDFA != null;
		case EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE__CONFIGURATION_JOANA:
			return configuration_JOANA != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationCorrespondenceImpl
