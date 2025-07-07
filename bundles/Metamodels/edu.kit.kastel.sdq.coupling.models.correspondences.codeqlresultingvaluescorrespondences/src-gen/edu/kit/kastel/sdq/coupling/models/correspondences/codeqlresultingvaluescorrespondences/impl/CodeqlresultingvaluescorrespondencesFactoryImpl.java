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
		case CodeqlresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES:
			return createCorrespondences_ResolvedImplementationValues();
		case CodeqlresultingvaluescorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES:
			return createSecurityLevelCorrespondence_ResolvedImplementationValues();
		case CodeqlresultingvaluescorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES:
			return createConfigurationCorrespondence_ResolvedImplementationValues();
		case CodeqlresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES:
			return createParameterCorrespondence_ResolvedImplementationValues();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correspondences_ResolvedImplementationValues createCorrespondences_ResolvedImplementationValues() {
		Correspondences_ResolvedImplementationValuesImpl correspondences_ResolvedImplementationValues = new Correspondences_ResolvedImplementationValuesImpl();
		return correspondences_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevelCorrespondence_ResolvedImplementationValues createSecurityLevelCorrespondence_ResolvedImplementationValues() {
		SecurityLevelCorrespondence_ResolvedImplementationValuesImpl securityLevelCorrespondence_ResolvedImplementationValues = new SecurityLevelCorrespondence_ResolvedImplementationValuesImpl();
		return securityLevelCorrespondence_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationCorrespondence_ResolvedImplementationValues createConfigurationCorrespondence_ResolvedImplementationValues() {
		ConfigurationCorrespondence_ResolvedImplementationValuesImpl configurationCorrespondence_ResolvedImplementationValues = new ConfigurationCorrespondence_ResolvedImplementationValuesImpl();
		return configurationCorrespondence_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCorrespondence_ResolvedImplementationValues createParameterCorrespondence_ResolvedImplementationValues() {
		ParameterCorrespondence_ResolvedImplementationValuesImpl parameterCorrespondence_ResolvedImplementationValues = new ParameterCorrespondence_ResolvedImplementationValuesImpl();
		return parameterCorrespondence_ResolvedImplementationValues;
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
