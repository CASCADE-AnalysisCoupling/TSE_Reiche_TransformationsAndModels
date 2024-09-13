/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationrepresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configurationrepresentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/configurationrepresentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configurationrepresentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationrepresentationPackage eINSTANCE = edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationsImpl <em>Configurations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationsImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl#getConfigurations()
	 * @generated
	 */
	int CONFIGURATIONS = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONS__CONFIGURATIONS = 0;

	/**
	 * The number of structural features of the '<em>Configurations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configurations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.HybridConfigurationImpl <em>Hybrid Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.HybridConfigurationImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl#getHybridConfiguration()
	 * @generated
	 */
	int HYBRID_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CONFIGURATION__ID = CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Additional Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CONFIGURATION__ADDITIONAL_INPUTS = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main Configuration Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hybrid Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hybrid Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CONFIGURATION_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.FullyImplicitConfigurationImpl <em>Fully Implicit Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.FullyImplicitConfigurationImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl#getFullyImplicitConfiguration()
	 * @generated
	 */
	int FULLY_IMPLICIT_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULLY_IMPLICIT_CONFIGURATION__ID = CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULLY_IMPLICIT_CONFIGURATION__INPUTS = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fully Implicit Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULLY_IMPLICIT_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fully Implicit Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULLY_IMPLICIT_CONFIGURATION_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.SingleElementConfigurationImpl <em>Single Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.SingleElementConfigurationImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl#getSingleElementConfiguration()
	 * @generated
	 */
	int SINGLE_ELEMENT_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_CONFIGURATION__ID = CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Configuration Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_CONFIGURATION__CONFIGURATION_ELEMENT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_CONFIGURATION_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configurations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations
	 * @generated
	 */
	EClass getConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations#getConfigurations()
	 * @see #getConfigurations()
	 * @generated
	 */
	EReference getConfigurations_Configurations();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration <em>Hybrid Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Configuration</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration
	 * @generated
	 */
	EClass getHybridConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration#getAdditionalInputs <em>Additional Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Inputs</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration#getAdditionalInputs()
	 * @see #getHybridConfiguration()
	 * @generated
	 */
	EReference getHybridConfiguration_AdditionalInputs();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration#getMainConfigurationElement <em>Main Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Configuration Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration#getMainConfigurationElement()
	 * @see #getHybridConfiguration()
	 * @generated
	 */
	EReference getHybridConfiguration_MainConfigurationElement();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration <em>Fully Implicit Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fully Implicit Configuration</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration
	 * @generated
	 */
	EClass getFullyImplicitConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration#getInputs()
	 * @see #getFullyImplicitConfiguration()
	 * @generated
	 */
	EReference getFullyImplicitConfiguration_Inputs();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.SingleElementConfiguration <em>Single Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Element Configuration</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.SingleElementConfiguration
	 * @generated
	 */
	EClass getSingleElementConfiguration();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.SingleElementConfiguration#getConfigurationElement <em>Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.SingleElementConfiguration#getConfigurationElement()
	 * @see #getSingleElementConfiguration()
	 * @generated
	 */
	EReference getSingleElementConfiguration_ConfigurationElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationrepresentationFactory getConfigurationrepresentationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationsImpl <em>Configurations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationsImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl#getConfigurations()
		 * @generated
		 */
		EClass CONFIGURATIONS = eINSTANCE.getConfigurations();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATIONS__CONFIGURATIONS = eINSTANCE.getConfigurations_Configurations();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.HybridConfigurationImpl <em>Hybrid Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.HybridConfigurationImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl#getHybridConfiguration()
		 * @generated
		 */
		EClass HYBRID_CONFIGURATION = eINSTANCE.getHybridConfiguration();

		/**
		 * The meta object literal for the '<em><b>Additional Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_CONFIGURATION__ADDITIONAL_INPUTS = eINSTANCE.getHybridConfiguration_AdditionalInputs();

		/**
		 * The meta object literal for the '<em><b>Main Configuration Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_CONFIGURATION__MAIN_CONFIGURATION_ELEMENT = eINSTANCE
				.getHybridConfiguration_MainConfigurationElement();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.FullyImplicitConfigurationImpl <em>Fully Implicit Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.FullyImplicitConfigurationImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl#getFullyImplicitConfiguration()
		 * @generated
		 */
		EClass FULLY_IMPLICIT_CONFIGURATION = eINSTANCE.getFullyImplicitConfiguration();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULLY_IMPLICIT_CONFIGURATION__INPUTS = eINSTANCE.getFullyImplicitConfiguration_Inputs();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.SingleElementConfigurationImpl <em>Single Element Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.SingleElementConfigurationImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.ConfigurationrepresentationPackageImpl#getSingleElementConfiguration()
		 * @generated
		 */
		EClass SINGLE_ELEMENT_CONFIGURATION = eINSTANCE.getSingleElementConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configuration Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT_CONFIGURATION__CONFIGURATION_ELEMENT = eINSTANCE
				.getSingleElementConfiguration_ConfigurationElement();

	}

} //ConfigurationrepresentationPackage
