/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Correspondence EDFA Code QL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.ConfigurationCorrespondence_EDFACodeQLImpl#getConfiguration_CodeQL <em>Configuration Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.ConfigurationCorrespondence_EDFACodeQLImpl#getConfiguration_EDFA <em>Configuration EDFA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationCorrespondence_EDFACodeQLImpl extends MinimalEObjectImpl.Container
		implements ConfigurationCorrespondence_EDFACodeQL {
	/**
	 * The cached value of the '{@link #getConfiguration_CodeQL() <em>Configuration Code QL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_CodeQL()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration_CodeQL;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationCorrespondence_EDFACodeQLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdfacodeqlcorrespondencesPackage.Literals.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getConfiguration_CodeQL() {
		if (configuration_CodeQL != null && configuration_CodeQL.eIsProxy()) {
			InternalEObject oldConfiguration_CodeQL = (InternalEObject) configuration_CodeQL;
			configuration_CodeQL = (Configuration) eResolveProxy(oldConfiguration_CodeQL);
			if (configuration_CodeQL != oldConfiguration_CodeQL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_CODE_QL,
							oldConfiguration_CodeQL, configuration_CodeQL));
			}
		}
		return configuration_CodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfiguration_CodeQL() {
		return configuration_CodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration_CodeQL(Configuration newConfiguration_CodeQL) {
		Configuration oldConfiguration_CodeQL = configuration_CodeQL;
		configuration_CodeQL = newConfiguration_CodeQL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_CODE_QL,
					oldConfiguration_CodeQL, configuration_CodeQL));
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
							EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_EDFA,
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
					EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_EDFA,
					oldConfiguration_EDFA, configuration_EDFA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_CODE_QL:
			if (resolve)
				return getConfiguration_CodeQL();
			return basicGetConfiguration_CodeQL();
		case EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_EDFA:
			if (resolve)
				return getConfiguration_EDFA();
			return basicGetConfiguration_EDFA();
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
		case EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_CODE_QL:
			setConfiguration_CodeQL((Configuration) newValue);
			return;
		case EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_EDFA:
			setConfiguration_EDFA((ParameterAnnotations) newValue);
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
		case EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_CODE_QL:
			setConfiguration_CodeQL((Configuration) null);
			return;
		case EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_EDFA:
			setConfiguration_EDFA((ParameterAnnotations) null);
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
		case EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_CODE_QL:
			return configuration_CodeQL != null;
		case EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL__CONFIGURATION_EDFA:
			return configuration_EDFA != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationCorrespondence_EDFACodeQLImpl
