/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.*;

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
public class EdfacodeqlcorrespondencesFactoryImpl extends EFactoryImpl implements EdfacodeqlcorrespondencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdfacodeqlcorrespondencesFactory init() {
		try {
			EdfacodeqlcorrespondencesFactory theEdfacodeqlcorrespondencesFactory = (EdfacodeqlcorrespondencesFactory) EPackage.Registry.INSTANCE
					.getEFactory(EdfacodeqlcorrespondencesPackage.eNS_URI);
			if (theEdfacodeqlcorrespondencesFactory != null) {
				return theEdfacodeqlcorrespondencesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdfacodeqlcorrespondencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdfacodeqlcorrespondencesFactoryImpl() {
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
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL:
			return createCorrespondences_EDFACodeQL();
		case EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL:
			return createLiteralSecurityLevelCorrespondence_EDFACodeQL();
		case EdfacodeqlcorrespondencesPackage.CONFIGURATION_CORRESPONDENCE_EDFA_CODE_QL:
			return createConfigurationCorrespondence_EDFACodeQL();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Correspondences_EDFACodeQL createCorrespondences_EDFACodeQL() {
		Correspondences_EDFACodeQLImpl correspondences_EDFACodeQL = new Correspondences_EDFACodeQLImpl();
		return correspondences_EDFACodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralSecurityLevelCorrespondence_EDFACodeQL createLiteralSecurityLevelCorrespondence_EDFACodeQL() {
		LiteralSecurityLevelCorrespondence_EDFACodeQLImpl literalSecurityLevelCorrespondence_EDFACodeQL = new LiteralSecurityLevelCorrespondence_EDFACodeQLImpl();
		return literalSecurityLevelCorrespondence_EDFACodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationCorrespondence_EDFACodeQL createConfigurationCorrespondence_EDFACodeQL() {
		ConfigurationCorrespondence_EDFACodeQLImpl configurationCorrespondence_EDFACodeQL = new ConfigurationCorrespondence_EDFACodeQLImpl();
		return configurationCorrespondence_EDFACodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdfacodeqlcorrespondencesPackage getEdfacodeqlcorrespondencesPackage() {
		return (EdfacodeqlcorrespondencesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdfacodeqlcorrespondencesPackage getPackage() {
		return EdfacodeqlcorrespondencesPackage.eINSTANCE;
	}

} //EdfacodeqlcorrespondencesFactoryImpl
