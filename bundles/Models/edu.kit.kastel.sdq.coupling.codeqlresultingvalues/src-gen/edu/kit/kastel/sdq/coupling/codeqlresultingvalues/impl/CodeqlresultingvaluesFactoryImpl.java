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
		case CodeqlresultingvaluesPackage.CODE_QL_RESULTING_VALUES:
			return createCodeQLResultingValues();
		case CodeqlresultingvaluesPackage.PARAMETER_IDENTIFICIATION_CODE_QL_RESULTING_VALUES:
			return createParameterIdentificiation_CodeQLResultingValues();
		case CodeqlresultingvaluesPackage.RESULTING_VALUE:
			return createResultingValue();
		case CodeqlresultingvaluesPackage.SECURITY_LEVEL_RESULTING_VALUES:
			return createSecurityLevel_ResultingValues();
		case CodeqlresultingvaluesPackage.CONFIGURATION_ID_RESULTING_VALUES:
			return createConfigurationID_ResultingValues();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeQLResultingValues createCodeQLResultingValues() {
		CodeQLResultingValuesImpl codeQLResultingValues = new CodeQLResultingValuesImpl();
		return codeQLResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentificiation_CodeQLResultingValues createParameterIdentificiation_CodeQLResultingValues() {
		ParameterIdentificiation_CodeQLResultingValuesImpl parameterIdentificiation_CodeQLResultingValues = new ParameterIdentificiation_CodeQLResultingValuesImpl();
		return parameterIdentificiation_CodeQLResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultingValue createResultingValue() {
		ResultingValueImpl resultingValue = new ResultingValueImpl();
		return resultingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_ResultingValues createSecurityLevel_ResultingValues() {
		SecurityLevel_ResultingValuesImpl securityLevel_ResultingValues = new SecurityLevel_ResultingValuesImpl();
		return securityLevel_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationID_ResultingValues createConfigurationID_ResultingValues() {
		ConfigurationID_ResultingValuesImpl configurationID_ResultingValues = new ConfigurationID_ResultingValuesImpl();
		return configurationID_ResultingValues;
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
