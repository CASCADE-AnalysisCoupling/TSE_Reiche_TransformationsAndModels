/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.*;

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
public class AccessanalysisjoanacorrespondencesFactoryImpl extends EFactoryImpl
		implements AccessanalysisjoanacorrespondencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessanalysisjoanacorrespondencesFactory init() {
		try {
			AccessanalysisjoanacorrespondencesFactory theAccessanalysisjoanacorrespondencesFactory = (AccessanalysisjoanacorrespondencesFactory) EPackage.Registry.INSTANCE
					.getEFactory(AccessanalysisjoanacorrespondencesPackage.eNS_URI);
			if (theAccessanalysisjoanacorrespondencesFactory != null) {
				return theAccessanalysisjoanacorrespondencesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccessanalysisjoanacorrespondencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessanalysisjoanacorrespondencesFactoryImpl() {
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
		case AccessanalysisjoanacorrespondencesPackage.CORRESPONDENCES_ACCESS_ANALYSIS_JOANA:
			return createCorrespondences_AccessAnalysisJOANA();
		case AccessanalysisjoanacorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE:
			return createEntryPointCorrespondence();
		case AccessanalysisjoanacorrespondencesPackage.DATA_SET_LEVEL_CORRESPONDENCE:
			return createDataSetLevelCorrespondence();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correspondences_AccessAnalysisJOANA createCorrespondences_AccessAnalysisJOANA() {
		Correspondences_AccessAnalysisJOANAImpl correspondences_AccessAnalysisJOANA = new Correspondences_AccessAnalysisJOANAImpl();
		return correspondences_AccessAnalysisJOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointCorrespondence createEntryPointCorrespondence() {
		EntryPointCorrespondenceImpl entryPointCorrespondence = new EntryPointCorrespondenceImpl();
		return entryPointCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetLevelCorrespondence createDataSetLevelCorrespondence() {
		DataSetLevelCorrespondenceImpl dataSetLevelCorrespondence = new DataSetLevelCorrespondenceImpl();
		return dataSetLevelCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessanalysisjoanacorrespondencesPackage getAccessanalysisjoanacorrespondencesPackage() {
		return (AccessanalysisjoanacorrespondencesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccessanalysisjoanacorrespondencesPackage getPackage() {
		return AccessanalysisjoanacorrespondencesPackage.eINSTANCE;
	}

} //AccessanalysisjoanacorrespondencesFactoryImpl
