/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.*;

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
public class CodeqlresultingvaluescorrespondencesFactoryImpl extends EFactoryImpl
		implements CodeqlresultingvaluescorrespondencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeqlresultingvaluescorrespondencesFactory init() {
		try {
			CodeqlresultingvaluescorrespondencesFactory theCodeqlresultingvaluescorrespondencesFactory = (CodeqlresultingvaluescorrespondencesFactory) EPackage.Registry.INSTANCE
					.getEFactory(CodeqlresultingvaluescorrespondencesPackage.eNS_URI);
			if (theCodeqlresultingvaluescorrespondencesFactory != null) {
				return theCodeqlresultingvaluescorrespondencesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeqlresultingvaluescorrespondencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlresultingvaluescorrespondencesFactoryImpl() {
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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_CODE_QL_RESULTING_VALUES:
			return createCorrespondences_CodeQLResultingValues();
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_CODE_QL_RESULTING_VALUES:
			return createSecurityLevelCorrespondence_CodeQLResultingValues();
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_CODE_QL_RESULTING_VALUES:
			return createConfigurationCorrespondence_CodeQLResultingValues();
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_CODE_QL_RESULTING_VALUES:
			return createParameterCorrespondence_CodeQLResultingValues();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correspondences_CodeQLResultingValues createCorrespondences_CodeQLResultingValues() {
		Correspondences_CodeQLResultingValuesImpl correspondences_CodeQLResultingValues = new Correspondences_CodeQLResultingValuesImpl();
		return correspondences_CodeQLResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevelCorrespondence_CodeQLResultingValues createSecurityLevelCorrespondence_CodeQLResultingValues() {
		SecurityLevelCorrespondence_CodeQLResultingValuesImpl securityLevelCorrespondence_CodeQLResultingValues = new SecurityLevelCorrespondence_CodeQLResultingValuesImpl();
		return securityLevelCorrespondence_CodeQLResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationCorrespondence_CodeQLResultingValues createConfigurationCorrespondence_CodeQLResultingValues() {
		ConfigurationCorrespondence_CodeQLResultingValuesImpl configurationCorrespondence_CodeQLResultingValues = new ConfigurationCorrespondence_CodeQLResultingValuesImpl();
		return configurationCorrespondence_CodeQLResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCorrespondence_CodeQLResultingValues createParameterCorrespondence_CodeQLResultingValues() {
		ParameterCorrespondence_CodeQLResultingValuesImpl parameterCorrespondence_CodeQLResultingValues = new ParameterCorrespondence_CodeQLResultingValuesImpl();
		return parameterCorrespondence_CodeQLResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlresultingvaluescorrespondencesPackage getCodeqlresultingvaluescorrespondencesPackage() {
		return (CodeqlresultingvaluescorrespondencesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodeqlresultingvaluescorrespondencesPackage getPackage() {
		return CodeqlresultingvaluescorrespondencesPackage.eINSTANCE;
	}

} //CodeqlresultingvaluescorrespondencesFactoryImpl
