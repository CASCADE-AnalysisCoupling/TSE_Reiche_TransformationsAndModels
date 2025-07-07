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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValuesImpl <em>Resolved Implementation Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getResolvedImplementationValues()
	 * @generated
	 */
	int RESOLVED_IMPLEMENTATION_VALUES = 0;

	/**
	 * The feature id for the '<em><b>System Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES__LEVELS = 1;

	/**
	 * The feature id for the '<em><b>Entry Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Resulting Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES = 3;

	/**
	 * The number of structural features of the '<em>Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl <em>Parameter Resolved Implementation Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Parameter Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME = 2;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME = 3;

	/**
	 * The number of structural features of the '<em>Parameter Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RESOLVED_IMPLEMENTATION_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Level_ResolvedImplementationValuesImpl <em>Level Resolved Implementation Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Level_ResolvedImplementationValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getLevel_ResolvedImplementationValues()
	 * @generated
	 */
	int LEVEL_RESOLVED_IMPLEMENTATION_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_RESOLVED_IMPLEMENTATION_VALUES__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_RESOLVED_IMPLEMENTATION_VALUES__NAME = IdentifierPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Level Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_RESOLVED_IMPLEMENTATION_VALUES_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Level Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_RESOLVED_IMPLEMENTATION_VALUES_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.EntryPoint_ResolvedImplementationValuesImpl <em>Entry Point Resolved Implementation Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.EntryPoint_ResolvedImplementationValuesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getEntryPoint_ResolvedImplementationValues()
	 * @generated
	 */
	int ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES__TAG = 0;

	/**
	 * The number of structural features of the '<em>Entry Point Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entry Point Resolved Implementation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValueImpl <em>Resolved Implementation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValueImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getResolvedImplementationValue()
	 * @generated
	 */
	int RESOLVED_IMPLEMENTATION_VALUE = 4;

	/**
	 * The feature id for the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUE__SYSTEM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUE__CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUE__LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Resolved Implementation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resolved Implementation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_IMPLEMENTATION_VALUE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues <em>Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues
	 * @generated
	 */
	EClass getResolvedImplementationValues();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getSystemElements <em>System Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Elements</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getSystemElements()
	 * @see #getResolvedImplementationValues()
	 * @generated
	 */
	EReference getResolvedImplementationValues_SystemElements();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getLevels()
	 * @see #getResolvedImplementationValues()
	 * @generated
	 */
	EReference getResolvedImplementationValues_Levels();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getEntryPoints <em>Entry Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Points</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getEntryPoints()
	 * @see #getResolvedImplementationValues()
	 * @generated
	 */
	EReference getResolvedImplementationValues_EntryPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getResultingValues <em>Resulting Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resulting Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues#getResultingValues()
	 * @see #getResolvedImplementationValues()
	 * @generated
	 */
	EReference getResolvedImplementationValues_ResultingValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues <em>Parameter Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues
	 * @generated
	 */
	EClass getParameter_ResolvedImplementationValues();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues#getParameterIndex <em>Parameter Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Index</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues#getParameterIndex()
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	EAttribute getParameter_ResolvedImplementationValues_ParameterIndex();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues#getParameterType()
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	EAttribute getParameter_ResolvedImplementationValues_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues#getMethodName()
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	EAttribute getParameter_ResolvedImplementationValues_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues#getFullyQualifiedClassName()
	 * @see #getParameter_ResolvedImplementationValues()
	 * @generated
	 */
	EAttribute getParameter_ResolvedImplementationValues_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues <em>Level Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues
	 * @generated
	 */
	EClass getLevel_ResolvedImplementationValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues <em>Entry Point Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point Resolved Implementation Values</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues
	 * @generated
	 */
	EClass getEntryPoint_ResolvedImplementationValues();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues#getTag()
	 * @see #getEntryPoint_ResolvedImplementationValues()
	 * @generated
	 */
	EAttribute getEntryPoint_ResolvedImplementationValues_Tag();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue <em>Resolved Implementation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolved Implementation Value</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue
	 * @generated
	 */
	EClass getResolvedImplementationValue();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getSystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getSystemElement()
	 * @see #getResolvedImplementationValue()
	 * @generated
	 */
	EReference getResolvedImplementationValue_SystemElement();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getConfiguration()
	 * @see #getResolvedImplementationValue()
	 * @generated
	 */
	EReference getResolvedImplementationValue_Configuration();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue#getLevel()
	 * @see #getResolvedImplementationValue()
	 * @generated
	 */
	EReference getResolvedImplementationValue_Level();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValuesImpl <em>Resolved Implementation Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getResolvedImplementationValues()
		 * @generated
		 */
		EClass RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE.getResolvedImplementationValues();

		/**
		 * The meta object literal for the '<em><b>System Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUES__SYSTEM_ELEMENTS = eINSTANCE
				.getResolvedImplementationValues_SystemElements();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUES__LEVELS = eINSTANCE.getResolvedImplementationValues_Levels();

		/**
		 * The meta object literal for the '<em><b>Entry Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUES__ENTRY_POINTS = eINSTANCE
				.getResolvedImplementationValues_EntryPoints();

		/**
		 * The meta object literal for the '<em><b>Resulting Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUES__RESULTING_VALUES = eINSTANCE
				.getResolvedImplementationValues_ResultingValues();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl <em>Parameter Resolved Implementation Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Parameter_ResolvedImplementationValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getParameter_ResolvedImplementationValues()
		 * @generated
		 */
		EClass PARAMETER_RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE.getParameter_ResolvedImplementationValues();

		/**
		 * The meta object literal for the '<em><b>Parameter Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_INDEX = eINSTANCE
				.getParameter_ResolvedImplementationValues_ParameterIndex();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__PARAMETER_TYPE = eINSTANCE
				.getParameter_ResolvedImplementationValues_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__METHOD_NAME = eINSTANCE
				.getParameter_ResolvedImplementationValues_MethodName();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_RESOLVED_IMPLEMENTATION_VALUES__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE
				.getParameter_ResolvedImplementationValues_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Level_ResolvedImplementationValuesImpl <em>Level Resolved Implementation Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.Level_ResolvedImplementationValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getLevel_ResolvedImplementationValues()
		 * @generated
		 */
		EClass LEVEL_RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE.getLevel_ResolvedImplementationValues();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.EntryPoint_ResolvedImplementationValuesImpl <em>Entry Point Resolved Implementation Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.EntryPoint_ResolvedImplementationValuesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getEntryPoint_ResolvedImplementationValues()
		 * @generated
		 */
		EClass ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES = eINSTANCE.getEntryPoint_ResolvedImplementationValues();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES__TAG = eINSTANCE
				.getEntryPoint_ResolvedImplementationValues_Tag();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValueImpl <em>Resolved Implementation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.ResolvedImplementationValueImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.JoanaresultingvaluesPackageImpl#getResolvedImplementationValue()
		 * @generated
		 */
		EClass RESOLVED_IMPLEMENTATION_VALUE = eINSTANCE.getResolvedImplementationValue();

		/**
		 * The meta object literal for the '<em><b>System Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUE__SYSTEM_ELEMENT = eINSTANCE
				.getResolvedImplementationValue_SystemElement();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUE__CONFIGURATION = eINSTANCE
				.getResolvedImplementationValue_Configuration();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_IMPLEMENTATION_VALUE__LEVEL = eINSTANCE.getResolvedImplementationValue_Level();

	}

} //JoanaresultingvaluesPackage
