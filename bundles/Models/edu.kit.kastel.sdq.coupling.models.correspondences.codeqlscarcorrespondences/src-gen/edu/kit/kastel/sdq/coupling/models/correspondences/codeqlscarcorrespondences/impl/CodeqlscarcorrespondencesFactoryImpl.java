/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.*;

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
public class CodeqlscarcorrespondencesFactoryImpl extends EFactoryImpl implements CodeqlscarcorrespondencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeqlscarcorrespondencesFactory init() {
		try {
			CodeqlscarcorrespondencesFactory theCodeqlscarcorrespondencesFactory = (CodeqlscarcorrespondencesFactory) EPackage.Registry.INSTANCE
					.getEFactory(CodeqlscarcorrespondencesPackage.eNS_URI);
			if (theCodeqlscarcorrespondencesFactory != null) {
				return theCodeqlscarcorrespondencesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeqlscarcorrespondencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlscarcorrespondencesFactoryImpl() {
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
		case CodeqlscarcorrespondencesPackage.CODE_QLSCAR_CORRESPONDENCES:
			return createCodeQLSCARCorrespondences();
		case CodeqlscarcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE:
			return createConfigurationCorrespondence();
		case CodeqlscarcorrespondencesPackage.SECURITY_LEVEL_CORRESPONDENCE:
			return createSecurityLevelCorrespondence();
		case CodeqlscarcorrespondencesPackage.PARAMETER_CORRESPONDENCE:
			return createParameterCorrespondence();
		case CodeqlscarcorrespondencesPackage.FIELD_CORRESPONDENCE:
			return createFieldCorrespondence();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeQLSCARCorrespondences createCodeQLSCARCorrespondences() {
		CodeQLSCARCorrespondencesImpl codeQLSCARCorrespondences = new CodeQLSCARCorrespondencesImpl();
		return codeQLSCARCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationCorrespondence createConfigurationCorrespondence() {
		ConfigurationCorrespondenceImpl configurationCorrespondence = new ConfigurationCorrespondenceImpl();
		return configurationCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevelCorrespondence createSecurityLevelCorrespondence() {
		SecurityLevelCorrespondenceImpl securityLevelCorrespondence = new SecurityLevelCorrespondenceImpl();
		return securityLevelCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCorrespondence createParameterCorrespondence() {
		ParameterCorrespondenceImpl parameterCorrespondence = new ParameterCorrespondenceImpl();
		return parameterCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldCorrespondence createFieldCorrespondence() {
		FieldCorrespondenceImpl fieldCorrespondence = new FieldCorrespondenceImpl();
		return fieldCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlscarcorrespondencesPackage getCodeqlscarcorrespondencesPackage() {
		return (CodeqlscarcorrespondencesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodeqlscarcorrespondencesPackage getPackage() {
		return CodeqlscarcorrespondencesPackage.eINSTANCE;
	}

} //CodeqlscarcorrespondencesFactoryImpl
