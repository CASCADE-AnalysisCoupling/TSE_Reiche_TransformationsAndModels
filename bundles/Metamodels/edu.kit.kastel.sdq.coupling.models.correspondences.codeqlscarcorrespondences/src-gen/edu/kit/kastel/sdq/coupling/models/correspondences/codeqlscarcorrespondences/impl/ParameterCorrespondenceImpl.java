/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ParameterCorrespondenceImpl#getParameter_Java <em>Parameter Java</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl.ParameterCorrespondenceImpl#getParameter_SCAR <em>Parameter SCAR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterCorrespondenceImpl extends SystemElementCorrespondenceImpl implements ParameterCorrespondence {
	/**
	 * The cached value of the '{@link #getParameter_Java() <em>Parameter Java</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_Java()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter_Java;

	/**
	 * The cached value of the '{@link #getParameter_SCAR() <em>Parameter SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_SCAR()
	 * @generated
	 * @ordered
	 */
	protected Parameter_SCAR parameter_SCAR;

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
	public Parameter getParameter_Java() {
		if (parameter_Java != null && parameter_Java.eIsProxy()) {
			InternalEObject oldParameter_Java = (InternalEObject) parameter_Java;
			parameter_Java = (Parameter) eResolveProxy(oldParameter_Java);
			if (parameter_Java != oldParameter_Java) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA,
							oldParameter_Java, parameter_Java));
			}
		}
		return parameter_Java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter_Java() {
		return parameter_Java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_Java(Parameter newParameter_Java) {
		Parameter oldParameter_Java = parameter_Java;
		parameter_Java = newParameter_Java;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA, oldParameter_Java,
					parameter_Java));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_SCAR getParameter_SCAR() {
		if (parameter_SCAR != null && parameter_SCAR.eIsProxy()) {
			InternalEObject oldParameter_SCAR = (InternalEObject) parameter_SCAR;
			parameter_SCAR = (Parameter_SCAR) eResolveProxy(oldParameter_SCAR);
			if (parameter_SCAR != oldParameter_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR,
							oldParameter_SCAR, parameter_SCAR));
			}
		}
		return parameter_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_SCAR basicGetParameter_SCAR() {
		return parameter_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_SCAR(Parameter_SCAR newParameter_SCAR) {
		Parameter_SCAR oldParameter_SCAR = parameter_SCAR;
		parameter_SCAR = newParameter_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR, oldParameter_SCAR,
					parameter_SCAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA:
			if (resolve)
				return getParameter_Java();
			return basicGetParameter_Java();
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR:
			if (resolve)
				return getParameter_SCAR();
			return basicGetParameter_SCAR();
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
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA:
			setParameter_Java((Parameter) newValue);
			return;
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR:
			setParameter_SCAR((Parameter_SCAR) newValue);
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
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA:
			setParameter_Java((Parameter) null);
			return;
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR:
			setParameter_SCAR((Parameter_SCAR) null);
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
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA:
			return parameter_Java != null;
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR:
			return parameter_SCAR != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterCorrespondenceImpl
