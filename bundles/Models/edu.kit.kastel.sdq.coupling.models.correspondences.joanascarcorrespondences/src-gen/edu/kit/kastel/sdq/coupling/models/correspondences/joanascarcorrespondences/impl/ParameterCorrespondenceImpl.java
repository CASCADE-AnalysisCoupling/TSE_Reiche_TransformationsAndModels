/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.ParameterCorrespondenceImpl#getParameter_JAVA <em>Parameter JAVA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.ParameterCorrespondenceImpl#getParameter_SCAR <em>Parameter SCAR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterCorrespondenceImpl extends SystemElementCorrespondenceImpl implements ParameterCorrespondence {
	/**
	 * The cached value of the '{@link #getParameter_JAVA() <em>Parameter JAVA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_JAVA()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter_JAVA;

	/**
	 * The cached value of the '{@link #getParameter_SCAR() <em>Parameter SCAR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_SCAR()
	 * @generated
	 * @ordered
	 */
	protected ParameterIdentifying parameter_SCAR;

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
		return JoanascarcorrespondencesPackage.Literals.PARAMETER_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter_JAVA() {
		if (parameter_JAVA != null && parameter_JAVA.eIsProxy()) {
			InternalEObject oldParameter_JAVA = (InternalEObject) parameter_JAVA;
			parameter_JAVA = (Parameter) eResolveProxy(oldParameter_JAVA);
			if (parameter_JAVA != oldParameter_JAVA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA, oldParameter_JAVA,
							parameter_JAVA));
			}
		}
		return parameter_JAVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter_JAVA() {
		return parameter_JAVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_JAVA(Parameter newParameter_JAVA) {
		Parameter oldParameter_JAVA = parameter_JAVA;
		parameter_JAVA = newParameter_JAVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA, oldParameter_JAVA,
					parameter_JAVA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentifying getParameter_SCAR() {
		if (parameter_SCAR != null && parameter_SCAR.eIsProxy()) {
			InternalEObject oldParameter_SCAR = (InternalEObject) parameter_SCAR;
			parameter_SCAR = (ParameterIdentifying) eResolveProxy(oldParameter_SCAR);
			if (parameter_SCAR != oldParameter_SCAR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR, oldParameter_SCAR,
							parameter_SCAR));
			}
		}
		return parameter_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentifying basicGetParameter_SCAR() {
		return parameter_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_SCAR(ParameterIdentifying newParameter_SCAR) {
		ParameterIdentifying oldParameter_SCAR = parameter_SCAR;
		parameter_SCAR = newParameter_SCAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR, oldParameter_SCAR,
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
		case JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA:
			if (resolve)
				return getParameter_JAVA();
			return basicGetParameter_JAVA();
		case JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR:
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
		case JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA:
			setParameter_JAVA((Parameter) newValue);
			return;
		case JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR:
			setParameter_SCAR((ParameterIdentifying) newValue);
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
		case JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA:
			setParameter_JAVA((Parameter) null);
			return;
		case JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR:
			setParameter_SCAR((ParameterIdentifying) null);
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
		case JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_JAVA:
			return parameter_JAVA != null;
		case JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE__PARAMETER_SCAR:
			return parameter_SCAR != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterCorrespondenceImpl
