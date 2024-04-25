/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeqlresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Identificiation Code QL Resulting Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ParameterIdentificiation_CodeQLResultingValuesImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ParameterIdentificiation_CodeQLResultingValuesImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ParameterIdentificiation_CodeQLResultingValuesImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl.ParameterIdentificiation_CodeQLResultingValuesImpl#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterIdentificiation_CodeQLResultingValuesImpl extends MinimalEObjectImpl.Container
		implements ParameterIdentificiation_CodeQLResultingValues {
	/**
	 * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected String parameterName = PARAMETER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected String parameterType = PARAMETER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullyQualifiedClassName() <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLY_QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullyQualifiedClassName() <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String fullyQualifiedClassName = FULLY_QUALIFIED_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterIdentificiation_CodeQLResultingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlresultingvaluesPackage.Literals.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_NAME,
					oldParameterName, parameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(String newParameterType) {
		String oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_TYPE,
					oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__METHOD_NAME,
					oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedClassName() {
		return fullyQualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedClassName(String newFullyQualifiedClassName) {
		String oldFullyQualifiedClassName = fullyQualifiedClassName;
		fullyQualifiedClassName = newFullyQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME,
					oldFullyQualifiedClassName, fullyQualifiedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_NAME:
			return getParameterName();
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_TYPE:
			return getParameterType();
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__METHOD_NAME:
			return getMethodName();
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME:
			return getFullyQualifiedClassName();
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
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_NAME:
			setParameterName((String) newValue);
			return;
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_TYPE:
			setParameterType((String) newValue);
			return;
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__METHOD_NAME:
			setMethodName((String) newValue);
			return;
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME:
			setFullyQualifiedClassName((String) newValue);
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
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_NAME:
			setParameterName(PARAMETER_NAME_EDEFAULT);
			return;
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_TYPE:
			setParameterType(PARAMETER_TYPE_EDEFAULT);
			return;
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__METHOD_NAME:
			setMethodName(METHOD_NAME_EDEFAULT);
			return;
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME:
			setFullyQualifiedClassName(FULLY_QUALIFIED_CLASS_NAME_EDEFAULT);
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
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_NAME:
			return PARAMETER_NAME_EDEFAULT == null ? parameterName != null
					: !PARAMETER_NAME_EDEFAULT.equals(parameterName);
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__PARAMETER_TYPE:
			return PARAMETER_TYPE_EDEFAULT == null ? parameterType != null
					: !PARAMETER_TYPE_EDEFAULT.equals(parameterType);
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__METHOD_NAME:
			return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME:
			return FULLY_QUALIFIED_CLASS_NAME_EDEFAULT == null ? fullyQualifiedClassName != null
					: !FULLY_QUALIFIED_CLASS_NAME_EDEFAULT.equals(fullyQualifiedClassName);
		}
		return super.eIsSet(featureID);
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
		result.append(" (ParameterName: ");
		result.append(parameterName);
		result.append(", parameterType: ");
		result.append(parameterType);
		result.append(", methodName: ");
		result.append(methodName);
		result.append(", fullyQualifiedClassName: ");
		result.append(fullyQualifiedClassName);
		result.append(')');
		return result.toString();
	}

} //ParameterIdentificiation_CodeQLResultingValuesImpl
