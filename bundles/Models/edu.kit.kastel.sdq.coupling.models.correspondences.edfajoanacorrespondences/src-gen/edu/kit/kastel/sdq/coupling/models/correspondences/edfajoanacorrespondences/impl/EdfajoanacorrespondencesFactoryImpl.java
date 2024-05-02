/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.*;

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
public class EdfajoanacorrespondencesFactoryImpl extends EFactoryImpl implements EdfajoanacorrespondencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdfajoanacorrespondencesFactory init() {
		try {
			EdfajoanacorrespondencesFactory theEdfajoanacorrespondencesFactory = (EdfajoanacorrespondencesFactory) EPackage.Registry.INSTANCE
					.getEFactory(EdfajoanacorrespondencesPackage.eNS_URI);
			if (theEdfajoanacorrespondencesFactory != null) {
				return theEdfajoanacorrespondencesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdfajoanacorrespondencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdfajoanacorrespondencesFactoryImpl() {
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
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA:
			return createCorrespondences_EDFAJOANA();
		case EdfajoanacorrespondencesPackage.CONFIGURATION_CORRESPONDENCE:
			return createConfigurationCorrespondence();
		case EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE:
			return createLiteralsLevelCorrespondence();
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
	public Correspondences_EDFAJOANA createCorrespondences_EDFAJOANA() {
		Correspondences_EDFAJOANAImpl correspondences_EDFAJOANA = new Correspondences_EDFAJOANAImpl();
		return correspondences_EDFAJOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationCorrespondence createConfigurationCorrespondence() {
		ConfigurationCorrespondenceImpl configurationCorrespondence = new ConfigurationCorrespondenceImpl();
		return configurationCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralsLevelCorrespondence createLiteralsLevelCorrespondence() {
		LiteralsLevelCorrespondenceImpl literalsLevelCorrespondence = new LiteralsLevelCorrespondenceImpl();
		return literalsLevelCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdfajoanacorrespondencesPackage getEdfajoanacorrespondencesPackage() {
		return (EdfajoanacorrespondencesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdfajoanacorrespondencesPackage getPackage() {
		return EdfajoanacorrespondencesPackage.eINSTANCE;
	}

} //EdfajoanacorrespondencesFactoryImpl
