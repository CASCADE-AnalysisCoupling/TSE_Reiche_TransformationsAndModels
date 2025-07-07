/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

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
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarFactory
 * @model kind="package"
 * @generated
 */
public interface JoanascarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "joanascar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/joanascar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "joanascar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanascarPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceCodeAnalysisResultImpl <em>Source Code Analysis Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceCodeAnalysisResultImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getSourceCodeAnalysisResult()
	 * @generated
	 */
	int SOURCE_CODE_ANALYSIS_RESULT = 0;

	/**
	 * The feature id for the '<em><b>System Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Entry Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT__ENTRY_POINTS = 1;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT__LEVELS = 2;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT__FLOWS = 3;

	/**
	 * The number of structural features of the '<em>Source Code Analysis Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Source Code Analysis Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SystemElement_SCARImpl <em>System Element SCAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.SystemElement_SCARImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getSystemElement_SCAR()
	 * @generated
	 */
	int SYSTEM_ELEMENT_SCAR = 1;

	/**
	 * The number of structural features of the '<em>System Element SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_SCAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Element SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_SCAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.Parameter_SCARImpl <em>Parameter SCAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.Parameter_SCARImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getParameter_SCAR()
	 * @generated
	 */
	int PARAMETER_SCAR = 2;

	/**
	 * The feature id for the '<em><b>Parameter Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR__PARAMETER_INDEX = SYSTEM_ELEMENT_SCAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR__PARAMETER_TYPE = SYSTEM_ELEMENT_SCAR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR__METHOD_NAME = SYSTEM_ELEMENT_SCAR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR__FULLY_QUALIFIED_CLASS_NAME = SYSTEM_ELEMENT_SCAR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR_FEATURE_COUNT = SYSTEM_ELEMENT_SCAR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Parameter SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR_OPERATION_COUNT = SYSTEM_ELEMENT_SCAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.Field_SCARImpl <em>Field SCAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.Field_SCARImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getField_SCAR()
	 * @generated
	 */
	int FIELD_SCAR = 3;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCAR__FIELD_NAME = SYSTEM_ELEMENT_SCAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCAR__FULLY_QUALIFIED_CLASS_NAME = SYSTEM_ELEMENT_SCAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCAR_FEATURE_COUNT = SYSTEM_ELEMENT_SCAR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCAR_OPERATION_COUNT = SYSTEM_ELEMENT_SCAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.Level_SCARImpl <em>Level SCAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.Level_SCARImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getLevel_SCAR()
	 * @generated
	 */
	int LEVEL_SCAR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_SCAR__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_SCAR__NAME = IdentifierPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Level SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_SCAR_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Level SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_SCAR_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.EntryPoint_SCARImpl <em>Entry Point SCAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.EntryPoint_SCARImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getEntryPoint_SCAR()
	 * @generated
	 */
	int ENTRY_POINT_SCAR = 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_SCAR__TAG = 0;

	/**
	 * The number of structural features of the '<em>Entry Point SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_SCAR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entry Point SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_SCAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.FlowImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 6;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SINK = 2;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 7;

	/**
	 * The feature id for the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SYSTEM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Source Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.SinkImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 8;

	/**
	 * The feature id for the '<em><b>Sink Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__SINK_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__SYSTEM_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult <em>Source Code Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Code Analysis Result</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult
	 * @generated
	 */
	EClass getSourceCodeAnalysisResult();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getSystemElements <em>System Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Elements</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getSystemElements()
	 * @see #getSourceCodeAnalysisResult()
	 * @generated
	 */
	EReference getSourceCodeAnalysisResult_SystemElements();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getEntryPoints <em>Entry Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Points</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getEntryPoints()
	 * @see #getSourceCodeAnalysisResult()
	 * @generated
	 */
	EReference getSourceCodeAnalysisResult_EntryPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getLevels()
	 * @see #getSourceCodeAnalysisResult()
	 * @generated
	 */
	EReference getSourceCodeAnalysisResult_Levels();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getFlows()
	 * @see #getSourceCodeAnalysisResult()
	 * @generated
	 */
	EReference getSourceCodeAnalysisResult_Flows();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.SystemElement_SCAR <em>System Element SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.SystemElement_SCAR
	 * @generated
	 */
	EClass getSystemElement_SCAR();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR <em>Parameter SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR
	 * @generated
	 */
	EClass getParameter_SCAR();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR#getParameterIndex <em>Parameter Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Index</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR#getParameterIndex()
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	EAttribute getParameter_SCAR_ParameterIndex();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR#getParameterType()
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	EAttribute getParameter_SCAR_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR#getMethodName()
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	EAttribute getParameter_SCAR_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR#getFullyQualifiedClassName()
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	EAttribute getParameter_SCAR_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Field_SCAR <em>Field SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Field_SCAR
	 * @generated
	 */
	EClass getField_SCAR();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Field_SCAR#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Field_SCAR#getFieldName()
	 * @see #getField_SCAR()
	 * @generated
	 */
	EAttribute getField_SCAR_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Field_SCAR#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Field_SCAR#getFullyQualifiedClassName()
	 * @see #getField_SCAR()
	 * @generated
	 */
	EAttribute getField_SCAR_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR <em>Level SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR
	 * @generated
	 */
	EClass getLevel_SCAR();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR <em>Entry Point SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR
	 * @generated
	 */
	EClass getEntryPoint_SCAR();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR#getTag()
	 * @see #getEntryPoint_SCAR()
	 * @generated
	 */
	EAttribute getEntryPoint_SCAR_Tag();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Point</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getEntryPoint()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_EntryPoint();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getSource()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Source();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sink</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Flow#getSink()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sink();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Source#getSystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Source#getSystemElement()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_SystemElement();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Source#getSourceLevel <em>Source Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Source#getSourceLevel()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_SourceLevel();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Sink#getSinkLevel <em>Sink Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sink Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Sink#getSinkLevel()
	 * @see #getSink()
	 * @generated
	 */
	EReference getSink_SinkLevel();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.Sink#getSystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.Sink#getSystemElement()
	 * @see #getSink()
	 * @generated
	 */
	EReference getSink_SystemElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JoanascarFactory getJoanascarFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceCodeAnalysisResultImpl <em>Source Code Analysis Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceCodeAnalysisResultImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getSourceCodeAnalysisResult()
		 * @generated
		 */
		EClass SOURCE_CODE_ANALYSIS_RESULT = eINSTANCE.getSourceCodeAnalysisResult();

		/**
		 * The meta object literal for the '<em><b>System Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENTS = eINSTANCE
				.getSourceCodeAnalysisResult_SystemElements();

		/**
		 * The meta object literal for the '<em><b>Entry Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ANALYSIS_RESULT__ENTRY_POINTS = eINSTANCE.getSourceCodeAnalysisResult_EntryPoints();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ANALYSIS_RESULT__LEVELS = eINSTANCE.getSourceCodeAnalysisResult_Levels();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ANALYSIS_RESULT__FLOWS = eINSTANCE.getSourceCodeAnalysisResult_Flows();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SystemElement_SCARImpl <em>System Element SCAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.SystemElement_SCARImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getSystemElement_SCAR()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT_SCAR = eINSTANCE.getSystemElement_SCAR();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.Parameter_SCARImpl <em>Parameter SCAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.Parameter_SCARImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getParameter_SCAR()
		 * @generated
		 */
		EClass PARAMETER_SCAR = eINSTANCE.getParameter_SCAR();

		/**
		 * The meta object literal for the '<em><b>Parameter Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SCAR__PARAMETER_INDEX = eINSTANCE.getParameter_SCAR_ParameterIndex();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SCAR__PARAMETER_TYPE = eINSTANCE.getParameter_SCAR_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SCAR__METHOD_NAME = eINSTANCE.getParameter_SCAR_MethodName();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SCAR__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE.getParameter_SCAR_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.Field_SCARImpl <em>Field SCAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.Field_SCARImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getField_SCAR()
		 * @generated
		 */
		EClass FIELD_SCAR = eINSTANCE.getField_SCAR();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SCAR__FIELD_NAME = eINSTANCE.getField_SCAR_FieldName();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SCAR__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE.getField_SCAR_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.Level_SCARImpl <em>Level SCAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.Level_SCARImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getLevel_SCAR()
		 * @generated
		 */
		EClass LEVEL_SCAR = eINSTANCE.getLevel_SCAR();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.EntryPoint_SCARImpl <em>Entry Point SCAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.EntryPoint_SCARImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getEntryPoint_SCAR()
		 * @generated
		 */
		EClass ENTRY_POINT_SCAR = eINSTANCE.getEntryPoint_SCAR();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_POINT_SCAR__TAG = eINSTANCE.getEntryPoint_SCAR_Tag();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.FlowImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ENTRY_POINT = eINSTANCE.getFlow_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SOURCE = eINSTANCE.getFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SINK = eINSTANCE.getFlow_Sink();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.SourceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>System Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SYSTEM_ELEMENT = eINSTANCE.getSource_SystemElement();

		/**
		 * The meta object literal for the '<em><b>Source Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SOURCE_LEVEL = eINSTANCE.getSource_SourceLevel();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.SinkImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '<em><b>Sink Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK__SINK_LEVEL = eINSTANCE.getSink_SinkLevel();

		/**
		 * The meta object literal for the '<em><b>System Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK__SYSTEM_ELEMENT = eINSTANCE.getSink_SystemElement();

	}

} //JoanascarPackage
