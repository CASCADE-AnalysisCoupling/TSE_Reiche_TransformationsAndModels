/**
 */
package edu.kit.kastel.sdq.coupling.codeqlresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeqlresultingvaluesFactoryImpl extends EFactoryImpl implements CodeqlresultingvaluesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeqlresultingvaluesFactory init() {
		try {
			CodeqlresultingvaluesFactory theCodeqlresultingvaluesFactory = (CodeqlresultingvaluesFactory) EPackage.Registry.INSTANCE
					.getEFactory(CodeqlresultingvaluesPackage.eNS_URI);
			if (theCodeqlresultingvaluesFactory != null) {
				return theCodeqlresultingvaluesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeqlresultingvaluesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlresultingvaluesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES:
			return createResolvedImplementationValues();
		case CodeqlresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES:
			return createParameter_ResolvedImplementationValues();
		case CodeqlresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE:
			return createResolvedImplementationValue();
		case CodeqlresultingvaluesPackage.SECURITY_LEVEL_RESOLVED_IMPLEMENTATION_VALUES:
			return createSecurityLevel_ResolvedImplementationValues();
		case CodeqlresultingvaluesPackage.RULE_ID_RESOLVED_IMPLEMENTATION_VALUE:
			return createRuleId_ResolvedImplementationValue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolvedImplementationValues createResolvedImplementationValues() {
		ResolvedImplementationValuesImpl resolvedImplementationValues = new ResolvedImplementationValuesImpl();
		return resolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_ResolvedImplementationValues createParameter_ResolvedImplementationValues() {
		Parameter_ResolvedImplementationValuesImpl parameter_ResolvedImplementationValues = new Parameter_ResolvedImplementationValuesImpl();
		return parameter_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolvedImplementationValue createResolvedImplementationValue() {
		ResolvedImplementationValueImpl resolvedImplementationValue = new ResolvedImplementationValueImpl();
		return resolvedImplementationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_ResolvedImplementationValues createSecurityLevel_ResolvedImplementationValues() {
		SecurityLevel_ResolvedImplementationValuesImpl securityLevel_ResolvedImplementationValues = new SecurityLevel_ResolvedImplementationValuesImpl();
		return securityLevel_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleId_ResolvedImplementationValue createRuleId_ResolvedImplementationValue() {
		RuleId_ResolvedImplementationValueImpl ruleId_ResolvedImplementationValue = new RuleId_ResolvedImplementationValueImpl();
		return ruleId_ResolvedImplementationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlresultingvaluesPackage getCodeqlresultingvaluesPackage() {
		return (CodeqlresultingvaluesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodeqlresultingvaluesPackage getPackage() {
		return CodeqlresultingvaluesPackage.eINSTANCE;
	}

} //CodeqlresultingvaluesFactoryImpl
