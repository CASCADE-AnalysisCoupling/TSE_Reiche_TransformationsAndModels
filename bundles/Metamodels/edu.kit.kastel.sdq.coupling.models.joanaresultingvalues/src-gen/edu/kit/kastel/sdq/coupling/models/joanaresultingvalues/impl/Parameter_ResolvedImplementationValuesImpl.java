/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Resolved Implementation Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl#getParameterIndex <em>Parameter Index</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Parameter_ResolvedImplementationValuesImpl extends MinimalEObjectImpl.Container
		implements Parameter_ResolvedImplementationValues {
	/**
	 * The default value of the '{@link #getParameterIndex() <em>Parameter Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int PARAMETER_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParameterIndex() <em>Parameter Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterIndex()
	 * @generated
	 * @ordered
	 */
	protected int parameterIndex = PARAMETER_INDEX_EDEFAULT;

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
	protected Parameter_ResolvedImplementationValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaresultingvaluesPackage.Literals.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParameterIndex() {
		return parameterIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterIndex(int newParameterIndex) {
		int oldParameterIndex = parameterIndex;
		parameterIndex = newParameterIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_INDEX,
					oldParameterIndex, parameterIndex));
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
					JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE,
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
					JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME, oldMethodName,
					methodName));
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
					JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME,
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
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_INDEX:
			return getParameterIndex();
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE:
			return getParameterType();
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME:
			return getMethodName();
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME:
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
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_INDEX:
			setParameterIndex((Integer) newValue);
			return;
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE:
			setParameterType((String) newValue);
			return;
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME:
			setMethodName((String) newValue);
			return;
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME:
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
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_INDEX:
			setParameterIndex(PARAMETER_INDEX_EDEFAULT);
			return;
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE:
			setParameterType(PARAMETER_TYPE_EDEFAULT);
			return;
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME:
			setMethodName(METHOD_NAME_EDEFAULT);
			return;
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME:
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
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_INDEX:
			return parameterIndex != PARAMETER_INDEX_EDEFAULT;
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE:
			return PARAMETER_TYPE_EDEFAULT == null ? parameterType != null
					: !PARAMETER_TYPE_EDEFAULT.equals(parameterType);
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME:
			return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME:
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
		result.append(" (parameterIndex: ");
		result.append(parameterIndex);
		result.append(", parameterType: ");
		result.append(parameterType);
		result.append(", methodName: ");
		result.append(methodName);
		result.append(", fullyQualifiedClassName: ");
		result.append(fullyQualifiedClassName);
		result.append(')');
		return result.toString();
	}

} //Parameter_ResolvedImplementationValuesImpl
