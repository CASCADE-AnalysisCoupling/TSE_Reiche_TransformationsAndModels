/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesFactory
 * @model kind="package"
 * @generated
 */
public interface JoanaresultingvaluescorrespondencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "joanaresultingvaluescorrespondences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/joanaresultingvaluescorrespondences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "joanaresultingvaluescorrespondences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanaresultingvaluescorrespondencesPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.JoanaresultingvaluescorrespondencesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.Correspondences_ResolvedImplementationValuesImpl <em>Correspondences Resolved Implementation Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.Correspondences_ResolvedImplementationValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.JoanaresultingvaluescorrespondencesPackageImpl#getCorrespondences_ResolvedImplementationValues()
	 * @generated
	 */
	int CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Level Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Entry Point Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINT_CORRESPONDENCES = 1;

	/**
	 * The feature id for the '<em><b>Parameter Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_CORRESPONDENCES = 2;

	/**
	 * The number of structural features of the '<em>Correspondences Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Correspondences Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.LevelCorrespondence_ResolvedImplementationValuesImpl <em>Level Correspondence Resolved Implementation Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.LevelCorrespondence_ResolvedImplementationValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.JoanaresultingvaluescorrespondencesPackageImpl#getLevelCorrespondence_ResolvedImplementationValues()
	 * @generated
	 */
	int LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Level JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_JOANA = 0;

	/**
	 * The feature id for the '<em><b>Level Resolved Implementation Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_RESOLVED_IMPLEMENTATION_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Level Correspondence Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Level Correspondence Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.EntryPointCorrespondence_JOANAResultingValuesImpl <em>Entry Point Correspondence JOANA Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.EntryPointCorrespondence_JOANAResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.JoanaresultingvaluescorrespondencesPackageImpl#getEntryPointCorrespondence_JOANAResultingValues()
	 * @generated
	 */
	int ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Entry Point SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_SCAR = 0;

	/**
	 * The feature id for the '<em><b>Entry Point Resolved Implementation Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Entry Point Correspondence JOANA Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry Point Correspondence JOANA Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.ParameterCorrespondence_JOANAResultingValuesImpl <em>Parameter Correspondence JOANA Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.ParameterCorrespondence_JOANAResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.JoanaresultingvaluescorrespondencesPackageImpl#getParameterCorrespondence_JOANAResultingValues()
	 * @generated
	 */
	int PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Parameter SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_SCAR = 0;

	/**
	 * The feature id for the '<em><b>Parameter Resolved Implementation Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_RESOLVED_IMPLEMENTATION_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Parameter Correspondence JOANA Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Correspondence JOANA Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues <em>Correspondences Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondences Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues
	 * @generated
	 */
	EClass getCorrespondences_ResolvedImplementationValues();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getLevelCorrespondences <em>Level Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getLevelCorrespondences()
	 * @see #getCorrespondences_ResolvedImplementationValues()
	 * @generated
	 */
	EReference getCorrespondences_ResolvedImplementationValues_LevelCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getEntryPointCorrespondences <em>Entry Point Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Point Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getEntryPointCorrespondences()
	 * @see #getCorrespondences_ResolvedImplementationValues()
	 * @generated
	 */
	EReference getCorrespondences_ResolvedImplementationValues_EntryPointCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getParameterCorrespondences <em>Parameter Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues#getParameterCorrespondences()
	 * @see #getCorrespondences_ResolvedImplementationValues()
	 * @generated
	 */
	EReference getCorrespondences_ResolvedImplementationValues_ParameterCorrespondences();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues <em>Level Correspondence Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Correspondence Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues
	 * @generated
	 */
	EClass getLevelCorrespondence_ResolvedImplementationValues();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues#getLevel_JOANA <em>Level JOANA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level JOANA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues#getLevel_JOANA()
	 * @see #getLevelCorrespondence_ResolvedImplementationValues()
	 * @generated
	 */
	EReference getLevelCorrespondence_ResolvedImplementationValues_Level_JOANA();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues#getLevel_ResolvedImplementationValues <em>Level Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues#getLevel_ResolvedImplementationValues()
	 * @see #getLevelCorrespondence_ResolvedImplementationValues()
	 * @generated
	 */
	EReference getLevelCorrespondence_ResolvedImplementationValues_Level_ResolvedImplementationValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues <em>Entry Point Correspondence JOANA Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point Correspondence JOANA Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues
	 * @generated
	 */
	EClass getEntryPointCorrespondence_JOANAResultingValues();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_SCAR <em>Entry Point SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Point SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_SCAR()
	 * @see #getEntryPointCorrespondence_JOANAResultingValues()
	 * @generated
	 */
	EReference getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_SCAR();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_ResolvedImplementationValues <em>Entry Point Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Point Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues#getEntryPoint_ResolvedImplementationValues()
	 * @see #getEntryPointCorrespondence_JOANAResultingValues()
	 * @generated
	 */
	EReference getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_ResolvedImplementationValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues <em>Parameter Correspondence JOANA Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Correspondence JOANA Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues
	 * @generated
	 */
	EClass getParameterCorrespondence_JOANAResultingValues();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_SCAR <em>Parameter SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_SCAR()
	 * @see #getParameterCorrespondence_JOANAResultingValues()
	 * @generated
	 */
	EReference getParameterCorrespondence_JOANAResultingValues_Parameter_SCAR();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_ResolvedImplementationValues <em>Parameter Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues#getParameter_ResolvedImplementationValues()
	 * @see #getParameterCorrespondence_JOANAResultingValues()
	 * @generated
	 */
	EReference getParameterCorrespondence_JOANAResultingValues_Parameter_ResolvedImplementationValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JoanaresultingvaluescorrespondencesFactory getJoanaresultingvaluescorrespondencesFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.Correspondences_ResolvedImplementationValuesImpl <em>Correspondences Resolved Implementation Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.Correspondences_ResolvedImplementationValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.JoanaresultingvaluescorrespondencesPackageImpl#getCorrespondences_ResolvedImplementationValues()
		 * @generated
		 */
		EClass CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE
				.getCorrespondences_ResolvedImplementationValues();

		/**
		 * The meta object literal for the '<em><b>Level Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_ResolvedImplementationValues_LevelCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Entry Point Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINT_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_ResolvedImplementationValues_EntryPointCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Parameter Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_CORRESPONDENCES = eINSTANCE
				.getCorrespondences_ResolvedImplementationValues_ParameterCorrespondences();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.LevelCorrespondence_ResolvedImplementationValuesImpl <em>Level Correspondence Resolved Implementation Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.LevelCorrespondence_ResolvedImplementationValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.JoanaresultingvaluescorrespondencesPackageImpl#getLevelCorrespondence_ResolvedImplementationValues()
		 * @generated
		 */
		EClass LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE
				.getLevelCorrespondence_ResolvedImplementationValues();

		/**
		 * The meta object literal for the '<em><b>Level JOANA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_JOANA = eINSTANCE
				.getLevelCorrespondence_ResolvedImplementationValues_Level_JOANA();

		/**
		 * The meta object literal for the '<em><b>Level Resolved Implementation Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES__LEVEL_RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE
				.getLevelCorrespondence_ResolvedImplementationValues_Level_ResolvedImplementationValues();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.EntryPointCorrespondence_JOANAResultingValuesImpl <em>Entry Point Correspondence JOANA Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.EntryPointCorrespondence_JOANAResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.JoanaresultingvaluescorrespondencesPackageImpl#getEntryPointCorrespondence_JOANAResultingValues()
		 * @generated
		 */
		EClass ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES = eINSTANCE
				.getEntryPointCorrespondence_JOANAResultingValues();

		/**
		 * The meta object literal for the '<em><b>Entry Point SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_SCAR = eINSTANCE
				.getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_SCAR();

		/**
		 * The meta object literal for the '<em><b>Entry Point Resolved Implementation Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES__ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE
				.getEntryPointCorrespondence_JOANAResultingValues_EntryPoint_ResolvedImplementationValues();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.ParameterCorrespondence_JOANAResultingValuesImpl <em>Parameter Correspondence JOANA Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.ParameterCorrespondence_JOANAResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl.JoanaresultingvaluescorrespondencesPackageImpl#getParameterCorrespondence_JOANAResultingValues()
		 * @generated
		 */
		EClass PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES = eINSTANCE
				.getParameterCorrespondence_JOANAResultingValues();

		/**
		 * The meta object literal for the '<em><b>Parameter SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_SCAR = eINSTANCE
				.getParameterCorrespondence_JOANAResultingValues_Parameter_SCAR();

		/**
		 * The meta object literal for the '<em><b>Parameter Resolved Implementation Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES__PARAMETER_RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE
				.getParameterCorrespondence_JOANAResultingValues_Parameter_ResolvedImplementationValues();

	}

} //JoanaresultingvaluescorrespondencesPackage
