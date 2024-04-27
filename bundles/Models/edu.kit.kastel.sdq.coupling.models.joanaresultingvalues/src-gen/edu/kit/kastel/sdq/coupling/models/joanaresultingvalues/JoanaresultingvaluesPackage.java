/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues;

import edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesFactory
 * @model kind="package"
 * @generated
 */
public interface JoanaresultingvaluesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "joanaresultingvalues";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/joanaresultingvalues";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "joanaresultingvalues";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanaresultingvaluesPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JOANAResultingValuesImpl <em>JOANA Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JOANAResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getJOANAResultingValues()
	 * @generated
	 */
	int JOANA_RESULTING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>System Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_RESULTING_VALUES__SYSTEM_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_RESULTING_VALUES__LEVELS = 1;

	/**
	 * The feature id for the '<em><b>Entry Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_RESULTING_VALUES__ENTRY_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Resulting Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_RESULTING_VALUES__RESULTING_VALUES = 3;

	/**
	 * The number of structural features of the '<em>JOANA Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_RESULTING_VALUES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>JOANA Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ParameterIdentification_JOANAResultingValuesImpl <em>Parameter Identification JOANA Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ParameterIdentification_JOANAResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getParameterIdentification_JOANAResultingValues()
	 * @generated
	 */
	int PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Parameter Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__PARAMETER_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__PARAMETER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__METHOD_NAME = 2;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME = 3;

	/**
	 * The number of structural features of the '<em>Parameter Identification JOANA Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter Identification JOANA Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Level_ResultingValuesImpl <em>Level Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Level_ResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getLevel_ResultingValues()
	 * @generated
	 */
	int LEVEL_RESULTING_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_RESULTING_VALUES__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_RESULTING_VALUES__NAME = IdentifierPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Level Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_RESULTING_VALUES_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Level Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_RESULTING_VALUES_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.EntryPointIdentification_ResultingValuesImpl <em>Entry Point Identification Resulting Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.EntryPointIdentification_ResultingValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getEntryPointIdentification_ResultingValues()
	 * @generated
	 */
	int ENTRY_POINT_IDENTIFICATION_RESULTING_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_IDENTIFICATION_RESULTING_VALUES__TAG = 0;

	/**
	 * The number of structural features of the '<em>Entry Point Identification Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_IDENTIFICATION_RESULTING_VALUES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entry Point Identification Resulting Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_IDENTIFICATION_RESULTING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResultingValueImpl <em>Resulting Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResultingValueImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getResultingValue()
	 * @generated
	 */
	int RESULTING_VALUE = 4;

	/**
	 * The feature id for the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTING_VALUE__SYSTEM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTING_VALUE__CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTING_VALUE__LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Resulting Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTING_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resulting Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTING_VALUE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues <em>JOANA Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JOANA Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues
	 * @generated
	 */
	EClass getJOANAResultingValues();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getSystemElements <em>System Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Elements</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getSystemElements()
	 * @see #getJOANAResultingValues()
	 * @generated
	 */
	EReference getJOANAResultingValues_SystemElements();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getLevels()
	 * @see #getJOANAResultingValues()
	 * @generated
	 */
	EReference getJOANAResultingValues_Levels();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getEntryPoints <em>Entry Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Points</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getEntryPoints()
	 * @see #getJOANAResultingValues()
	 * @generated
	 */
	EReference getJOANAResultingValues_EntryPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getResultingValues <em>Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues#getResultingValues()
	 * @see #getJOANAResultingValues()
	 * @generated
	 */
	EReference getJOANAResultingValues_ResultingValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues <em>Parameter Identification JOANA Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Identification JOANA Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues
	 * @generated
	 */
	EClass getParameterIdentification_JOANAResultingValues();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues#getParameterIndex <em>Parameter Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Index</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues#getParameterIndex()
	 * @see #getParameterIdentification_JOANAResultingValues()
	 * @generated
	 */
	EAttribute getParameterIdentification_JOANAResultingValues_ParameterIndex();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues#getParameterType()
	 * @see #getParameterIdentification_JOANAResultingValues()
	 * @generated
	 */
	EAttribute getParameterIdentification_JOANAResultingValues_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues#getMethodName()
	 * @see #getParameterIdentification_JOANAResultingValues()
	 * @generated
	 */
	EAttribute getParameterIdentification_JOANAResultingValues_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues#getFullyQualifiedClassName()
	 * @see #getParameterIdentification_JOANAResultingValues()
	 * @generated
	 */
	EAttribute getParameterIdentification_JOANAResultingValues_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues <em>Level Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues
	 * @generated
	 */
	EClass getLevel_ResultingValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues <em>Entry Point Identification Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point Identification Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues
	 * @generated
	 */
	EClass getEntryPointIdentification_ResultingValues();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues#getTag()
	 * @see #getEntryPointIdentification_ResultingValues()
	 * @generated
	 */
	EAttribute getEntryPointIdentification_ResultingValues_Tag();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue <em>Resulting Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resulting Value</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue
	 * @generated
	 */
	EClass getResultingValue();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getSystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getSystemElement()
	 * @see #getResultingValue()
	 * @generated
	 */
	EReference getResultingValue_SystemElement();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getConfiguration()
	 * @see #getResultingValue()
	 * @generated
	 */
	EReference getResultingValue_Configuration();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue#getLevel()
	 * @see #getResultingValue()
	 * @generated
	 */
	EReference getResultingValue_Level();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JoanaresultingvaluesFactory getJoanaresultingvaluesFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JOANAResultingValuesImpl <em>JOANA Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JOANAResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getJOANAResultingValues()
		 * @generated
		 */
		EClass JOANA_RESULTING_VALUES = eINSTANCE.getJOANAResultingValues();

		/**
		 * The meta object literal for the '<em><b>System Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOANA_RESULTING_VALUES__SYSTEM_ELEMENTS = eINSTANCE.getJOANAResultingValues_SystemElements();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOANA_RESULTING_VALUES__LEVELS = eINSTANCE.getJOANAResultingValues_Levels();

		/**
		 * The meta object literal for the '<em><b>Entry Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOANA_RESULTING_VALUES__ENTRY_POINTS = eINSTANCE.getJOANAResultingValues_EntryPoints();

		/**
		 * The meta object literal for the '<em><b>Resulting Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOANA_RESULTING_VALUES__RESULTING_VALUES = eINSTANCE.getJOANAResultingValues_ResultingValues();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ParameterIdentification_JOANAResultingValuesImpl <em>Parameter Identification JOANA Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ParameterIdentification_JOANAResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getParameterIdentification_JOANAResultingValues()
		 * @generated
		 */
		EClass PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES = eINSTANCE
				.getParameterIdentification_JOANAResultingValues();

		/**
		 * The meta object literal for the '<em><b>Parameter Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__PARAMETER_INDEX = eINSTANCE
				.getParameterIdentification_JOANAResultingValues_ParameterIndex();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__PARAMETER_TYPE = eINSTANCE
				.getParameterIdentification_JOANAResultingValues_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__METHOD_NAME = eINSTANCE
				.getParameterIdentification_JOANAResultingValues_MethodName();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE
				.getParameterIdentification_JOANAResultingValues_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Level_ResultingValuesImpl <em>Level Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Level_ResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getLevel_ResultingValues()
		 * @generated
		 */
		EClass LEVEL_RESULTING_VALUES = eINSTANCE.getLevel_ResultingValues();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.EntryPointIdentification_ResultingValuesImpl <em>Entry Point Identification Resulting Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.EntryPointIdentification_ResultingValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getEntryPointIdentification_ResultingValues()
		 * @generated
		 */
		EClass ENTRY_POINT_IDENTIFICATION_RESULTING_VALUES = eINSTANCE.getEntryPointIdentification_ResultingValues();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_POINT_IDENTIFICATION_RESULTING_VALUES__TAG = eINSTANCE
				.getEntryPointIdentification_ResultingValues_Tag();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResultingValueImpl <em>Resulting Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResultingValueImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getResultingValue()
		 * @generated
		 */
		EClass RESULTING_VALUE = eINSTANCE.getResultingValue();

		/**
		 * The meta object literal for the '<em><b>System Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTING_VALUE__SYSTEM_ELEMENT = eINSTANCE.getResultingValue_SystemElement();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTING_VALUE__CONFIGURATION = eINSTANCE.getResultingValue_Configuration();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTING_VALUE__LEVEL = eINSTANCE.getResultingValue_Level();

	}

} //JoanaresultingvaluesPackage
