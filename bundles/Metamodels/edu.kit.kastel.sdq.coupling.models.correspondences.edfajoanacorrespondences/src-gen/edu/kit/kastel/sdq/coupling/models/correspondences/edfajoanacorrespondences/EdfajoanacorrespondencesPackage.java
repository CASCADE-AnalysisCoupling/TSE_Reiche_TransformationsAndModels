/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesFactory
 * @model kind="package"
 * @generated
 */
public interface EdfajoanacorrespondencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edfajoanacorrespondences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/edfajoanacorrespondences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edfajoanacorrespondences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdfajoanacorrespondencesPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.EdfajoanacorrespondencesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.Correspondences_EDFAJOANAImpl <em>Correspondences EDFAJOANA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.Correspondences_EDFAJOANAImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.EdfajoanacorrespondencesPackageImpl#getCorrespondences_EDFAJOANA()
	 * @generated
	 */
	int CORRESPONDENCES_EDFAJOANA = 0;

	/**
	 * The feature id for the '<em><b>Configuration Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_EDFAJOANA__CONFIGURATION_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Literal Level Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_EDFAJOANA__LITERAL_LEVEL_CORRESPONDENCES = 1;

	/**
	 * The number of structural features of the '<em>Correspondences EDFAJOANA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_EDFAJOANA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Correspondences EDFAJOANA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_EDFAJOANA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.ConfigurationCorrespondenceImpl <em>Configuration Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.ConfigurationCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.EdfajoanacorrespondencesPackageImpl#getConfigurationCorrespondence()
	 * @generated
	 */
	int CONFIGURATION_CORRESPONDENCE = 1;

	/**
	 * The feature id for the '<em><b>Configuration EDFA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE__CONFIGURATION_EDFA = 0;

	/**
	 * The feature id for the '<em><b>Configuration JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE__CONFIGURATION_JOANA = 1;

	/**
	 * The number of structural features of the '<em>Configuration Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuration Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.LiteralsLevelCorrespondenceImpl <em>Literals Level Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.LiteralsLevelCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.EdfajoanacorrespondencesPackageImpl#getLiteralsLevelCorrespondence()
	 * @generated
	 */
	int LITERALS_LEVEL_CORRESPONDENCE = 2;

	/**
	 * The feature id for the '<em><b>Literals EDFA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERALS_LEVEL_CORRESPONDENCE__LITERALS_EDFA = 0;

	/**
	 * The feature id for the '<em><b>Level JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERALS_LEVEL_CORRESPONDENCE__LEVEL_JOANA = 1;

	/**
	 * The number of structural features of the '<em>Literals Level Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERALS_LEVEL_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Literals Level Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERALS_LEVEL_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA <em>Correspondences EDFAJOANA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondences EDFAJOANA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA
	 * @generated
	 */
	EClass getCorrespondences_EDFAJOANA();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA#getConfigurationCorrespondences <em>Configuration Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA#getConfigurationCorrespondences()
	 * @see #getCorrespondences_EDFAJOANA()
	 * @generated
	 */
	EReference getCorrespondences_EDFAJOANA_ConfigurationCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA#getLiteralLevelCorrespondences <em>Literal Level Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal Level Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA#getLiteralLevelCorrespondences()
	 * @see #getCorrespondences_EDFAJOANA()
	 * @generated
	 */
	EReference getCorrespondences_EDFAJOANA_LiteralLevelCorrespondences();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence <em>Configuration Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence
	 * @generated
	 */
	EClass getConfigurationCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence#getConfiguration_EDFA <em>Configuration EDFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration EDFA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence#getConfiguration_EDFA()
	 * @see #getConfigurationCorrespondence()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_Configuration_EDFA();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence#getConfiguration_JOANA <em>Configuration JOANA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration JOANA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence#getConfiguration_JOANA()
	 * @see #getConfigurationCorrespondence()
	 * @generated
	 */
	EReference getConfigurationCorrespondence_Configuration_JOANA();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence <em>Literals Level Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literals Level Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence
	 * @generated
	 */
	EClass getLiteralsLevelCorrespondence();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence#getLiterals_EDFA <em>Literals EDFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Literals EDFA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence#getLiterals_EDFA()
	 * @see #getLiteralsLevelCorrespondence()
	 * @generated
	 */
	EReference getLiteralsLevelCorrespondence_Literals_EDFA();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence#getLevel_JOANA <em>Level JOANA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level JOANA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence#getLevel_JOANA()
	 * @see #getLiteralsLevelCorrespondence()
	 * @generated
	 */
	EReference getLiteralsLevelCorrespondence_Level_JOANA();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdfajoanacorrespondencesFactory getEdfajoanacorrespondencesFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.Correspondences_EDFAJOANAImpl <em>Correspondences EDFAJOANA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.Correspondences_EDFAJOANAImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.EdfajoanacorrespondencesPackageImpl#getCorrespondences_EDFAJOANA()
		 * @generated
		 */
		EClass CORRESPONDENCES_EDFAJOANA = eINSTANCE.getCorrespondences_EDFAJOANA();

		/**
		 * The meta object literal for the '<em><b>Configuration Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_EDFAJOANA__CONFIGURATION_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_EDFAJOANA_ConfigurationCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Literal Level Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_EDFAJOANA__LITERAL_LEVEL_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_EDFAJOANA_LiteralLevelCorrespondences();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.ConfigurationCorrespondenceImpl <em>Configuration Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.ConfigurationCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.EdfajoanacorrespondencesPackageImpl#getConfigurationCorrespondence()
		 * @generated
		 */
		EClass CONFIGURATION_CORRESPONDENCE = eINSTANCE.getConfigurationCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Configuration EDFA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE__CONFIGURATION_EDFA = eINSTANCE
				.getConfigurationCorrespondence_Configuration_EDFA();

		/**
		 * The meta object literal for the '<em><b>Configuration JOANA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CORRESPONDENCE__CONFIGURATION_JOANA = eINSTANCE
				.getConfigurationCorrespondence_Configuration_JOANA();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.LiteralsLevelCorrespondenceImpl <em>Literals Level Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.LiteralsLevelCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.EdfajoanacorrespondencesPackageImpl#getLiteralsLevelCorrespondence()
		 * @generated
		 */
		EClass LITERALS_LEVEL_CORRESPONDENCE = eINSTANCE.getLiteralsLevelCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Literals EDFA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERALS_LEVEL_CORRESPONDENCE__LITERALS_EDFA = eINSTANCE
				.getLiteralsLevelCorrespondence_Literals_EDFA();

		/**
		 * The meta object literal for the '<em><b>Level JOANA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERALS_LEVEL_CORRESPONDENCE__LEVEL_JOANA = eINSTANCE.getLiteralsLevelCorrespondence_Level_JOANA();

	}

} //EdfajoanacorrespondencesPackage
