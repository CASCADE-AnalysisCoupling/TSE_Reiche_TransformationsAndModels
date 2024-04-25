/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ParameterCorrespondenceImpl#getJavaParameter <em>Java Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ParameterCorrespondenceImpl#getScarParameter <em>Scar Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterCorrespondenceImpl extends SystemElementCorrespondenceImpl implements ParameterCorrespondence {
	/**
	 * The cached value of the '{@link #getJavaParameter() <em>Java Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter javaParameter;

	/**
	 * The cached value of the '{@link #getScarParameter() <em>Scar Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScarParameter()
	 * @generated
	 * @ordered
	 */
	protected ParameterIdentification scarParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlscarcorrespondencesPackage.Literals.PARAMETER_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getJavaParameter() {
		if (javaParameter != null && javaParameter.eIsProxy()) {
			InternalEObject oldJavaParameter = (InternalEObject) javaParameter;
			javaParameter = (Parameter) eResolveProxy(oldJavaParameter);
			if (javaParameter != oldJavaParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__JAVA_PARAMETER, oldJavaParameter,
							javaParameter));
			}
		}
		return javaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetJavaParameter() {
		return javaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaParameter(Parameter newJavaParameter) {
		Parameter oldJavaParameter = javaParameter;
		javaParameter = newJavaParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__JAVA_PARAMETER, oldJavaParameter,
					javaParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentification getScarParameter() {
		if (scarParameter != null && scarParameter.eIsProxy()) {
			InternalEObject oldScarParameter = (InternalEObject) scarParameter;
			scarParameter = (ParameterIdentification) eResolveProxy(oldScarParameter);
			if (scarParameter != oldScarParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__SCAR_PARAMETER, oldScarParameter,
							scarParameter));
			}
		}
		return scarParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentification basicGetScarParameter() {
		return scarParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScarParameter(ParameterIdentification newScarParameter) {
		ParameterIdentification oldScarParameter = scarParameter;
		scarParameter = newScarParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__SCAR_PARAMETER, oldScarParameter,
					scarParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__JAVA_PARAMETER:
			if (resolve)
				return getJavaParameter();
			return basicGetJavaParameter();
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__SCAR_PARAMETER:
			if (resolve)
				return getScarParameter();
			return basicGetScarParameter();
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
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__JAVA_PARAMETER:
			setJavaParameter((Parameter) newValue);
			return;
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__SCAR_PARAMETER:
			setScarParameter((ParameterIdentification) newValue);
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
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__JAVA_PARAMETER:
			setJavaParameter((Parameter) null);
			return;
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__SCAR_PARAMETER:
			setScarParameter((ParameterIdentification) null);
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
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__JAVA_PARAMETER:
			return javaParameter != null;
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__SCAR_PARAMETER:
			return scarParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterCorrespondenceImpl
