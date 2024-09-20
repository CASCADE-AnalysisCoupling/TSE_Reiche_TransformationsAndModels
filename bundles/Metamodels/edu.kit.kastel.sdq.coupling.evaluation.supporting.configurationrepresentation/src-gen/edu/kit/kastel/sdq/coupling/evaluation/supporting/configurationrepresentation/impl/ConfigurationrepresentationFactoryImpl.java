/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.*;

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
public class ConfigurationrepresentationFactoryImpl extends EFactoryImpl implements ConfigurationrepresentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationrepresentationFactory init() {
		try {
			ConfigurationrepresentationFactory theConfigurationrepresentationFactory = (ConfigurationrepresentationFactory) EPackage.Registry.INSTANCE
					.getEFactory(ConfigurationrepresentationPackage.eNS_URI);
			if (theConfigurationrepresentationFactory != null) {
				return theConfigurationrepresentationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationrepresentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationrepresentationFactoryImpl() {
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
		case ConfigurationrepresentationPackage.CONFIGURATIONS:
			return createConfigurations();
		case ConfigurationrepresentationPackage.HYBRID_CONFIGURATION:
			return createHybridConfiguration();
		case ConfigurationrepresentationPackage.FULLY_IMPLICIT_CONFIGURATION:
			return createFullyImplicitConfiguration();
		case ConfigurationrepresentationPackage.SINGLE_ELEMENT_CONFIGURATION:
			return createSingleElementConfiguration();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configurations createConfigurations() {
		ConfigurationsImpl configurations = new ConfigurationsImpl();
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridConfiguration createHybridConfiguration() {
		HybridConfigurationImpl hybridConfiguration = new HybridConfigurationImpl();
		return hybridConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyImplicitConfiguration createFullyImplicitConfiguration() {
		FullyImplicitConfigurationImpl fullyImplicitConfiguration = new FullyImplicitConfigurationImpl();
		return fullyImplicitConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElementConfiguration createSingleElementConfiguration() {
		SingleElementConfigurationImpl singleElementConfiguration = new SingleElementConfigurationImpl();
		return singleElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationrepresentationPackage getConfigurationrepresentationPackage() {
		return (ConfigurationrepresentationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationrepresentationPackage getPackage() {
		return ConfigurationrepresentationPackage.eINSTANCE;
	}

} //ConfigurationrepresentationFactoryImpl
