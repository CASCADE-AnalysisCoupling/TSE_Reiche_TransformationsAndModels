/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.*;

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
public class AccessanalysiscodeqlcorrespondenceFactoryImpl extends EFactoryImpl
		implements AccessanalysiscodeqlcorrespondenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessanalysiscodeqlcorrespondenceFactory init() {
		try {
			AccessanalysiscodeqlcorrespondenceFactory theAccessanalysiscodeqlcorrespondenceFactory = (AccessanalysiscodeqlcorrespondenceFactory) EPackage.Registry.INSTANCE
					.getEFactory(AccessanalysiscodeqlcorrespondencePackage.eNS_URI);
			if (theAccessanalysiscodeqlcorrespondenceFactory != null) {
				return theAccessanalysiscodeqlcorrespondenceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccessanalysiscodeqlcorrespondenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessanalysiscodeqlcorrespondenceFactoryImpl() {
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
		case AccessanalysiscodeqlcorrespondencePackage.ACCESS_ANALYSIS_CODE_QL_CORRESPONDENCE_ROOT:
			return createAccessAnalysisCodeQLCorrespondenceRoot();
		case AccessanalysiscodeqlcorrespondencePackage.CONFIGURATION_CORRESPONDENCE:
			return createConfigurationCorrespondence();
		case AccessanalysiscodeqlcorrespondencePackage.DATA_SET_SECURITY_LEVEL_CORRESPONDENCE:
			return createDataSetSecurityLevelCorrespondence();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessAnalysisCodeQLCorrespondenceRoot createAccessAnalysisCodeQLCorrespondenceRoot() {
		AccessAnalysisCodeQLCorrespondenceRootImpl accessAnalysisCodeQLCorrespondenceRoot = new AccessAnalysisCodeQLCorrespondenceRootImpl();
		return accessAnalysisCodeQLCorrespondenceRoot;
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
	public DataSetSecurityLevelCorrespondence createDataSetSecurityLevelCorrespondence() {
		DataSetSecurityLevelCorrespondenceImpl dataSetSecurityLevelCorrespondence = new DataSetSecurityLevelCorrespondenceImpl();
		return dataSetSecurityLevelCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessanalysiscodeqlcorrespondencePackage getAccessanalysiscodeqlcorrespondencePackage() {
		return (AccessanalysiscodeqlcorrespondencePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccessanalysiscodeqlcorrespondencePackage getPackage() {
		return AccessanalysiscodeqlcorrespondencePackage.eINSTANCE;
	}

} //AccessanalysiscodeqlcorrespondenceFactoryImpl
