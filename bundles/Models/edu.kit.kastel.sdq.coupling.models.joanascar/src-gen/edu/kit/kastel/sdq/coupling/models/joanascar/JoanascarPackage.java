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
	 * The feature id for the '<em><b>Result Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES = 3;

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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SystemElementIdentifiying_JOANASCARImpl <em>System Element Identifiying JOANASCAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.SystemElementIdentifiying_JOANASCARImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getSystemElementIdentifiying_JOANASCAR()
	 * @generated
	 */
	int SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR = 1;

	/**
	 * The number of structural features of the '<em>System Element Identifiying JOANASCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Element Identifiying JOANASCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ParameterIdentifyingImpl <em>Parameter Identifying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.ParameterIdentifyingImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getParameterIdentifying()
	 * @generated
	 */
	int PARAMETER_IDENTIFYING = 2;

	/**
	 * The feature id for the '<em><b>Parameter Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFYING__PARAMETER_INDEX = SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFYING__PARAMETER_TYPE = SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFYING__METHOD_NAME = SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFYING__FULLY_QUALIFIED_CLASS_NAME = SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFYING_FEATURE_COUNT = SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Parameter Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFYING_OPERATION_COUNT = SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.FieldIdentifyingImpl <em>Field Identifying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.FieldIdentifyingImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getFieldIdentifying()
	 * @generated
	 */
	int FIELD_IDENTIFYING = 3;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFYING__FIELD_NAME = SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFYING__FULLY_QUALIFIED_CLASS_NAME = SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFYING_FEATURE_COUNT = SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFYING_OPERATION_COUNT = SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.EntryPointIdentifyingImpl <em>Entry Point Identifying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.EntryPointIdentifyingImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getEntryPointIdentifying()
	 * @generated
	 */
	int ENTRY_POINT_IDENTIFYING = 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_IDENTIFYING__TAG = 0;

	/**
	 * The number of structural features of the '<em>Entry Point Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_IDENTIFYING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entry Point Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_IDENTIFYING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryImpl <em>Result Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getResultEntry()
	 * @generated
	 */
	int RESULT_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY__ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY__SINK = 2;

	/**
	 * The number of structural features of the '<em>Result Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Result Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryElementImpl <em>Result Entry Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryElementImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getResultEntryElement()
	 * @generated
	 */
	int RESULT_ENTRY_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY_ELEMENT__LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Result Entry Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Result Entry Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY_ELEMENT_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getResultEntries <em>Result Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Entries</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getResultEntries()
	 * @see #getSourceCodeAnalysisResult()
	 * @generated
	 */
	EReference getSourceCodeAnalysisResult_ResultEntries();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.SystemElementIdentifiying_JOANASCAR <em>System Element Identifiying JOANASCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element Identifiying JOANASCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.SystemElementIdentifiying_JOANASCAR
	 * @generated
	 */
	EClass getSystemElementIdentifiying_JOANASCAR();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying <em>Parameter Identifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Identifying</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying
	 * @generated
	 */
	EClass getParameterIdentifying();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getParameterIndex <em>Parameter Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Index</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getParameterIndex()
	 * @see #getParameterIdentifying()
	 * @generated
	 */
	EAttribute getParameterIdentifying_ParameterIndex();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getParameterType()
	 * @see #getParameterIdentifying()
	 * @generated
	 */
	EAttribute getParameterIdentifying_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getMethodName()
	 * @see #getParameterIdentifying()
	 * @generated
	 */
	EAttribute getParameterIdentifying_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getFullyQualifiedClassName()
	 * @see #getParameterIdentifying()
	 * @generated
	 */
	EAttribute getParameterIdentifying_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying <em>Field Identifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Identifying</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying
	 * @generated
	 */
	EClass getFieldIdentifying();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying#getFieldName()
	 * @see #getFieldIdentifying()
	 * @generated
	 */
	EAttribute getFieldIdentifying_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying#getFullyQualifiedClassName()
	 * @see #getFieldIdentifying()
	 * @generated
	 */
	EAttribute getFieldIdentifying_FullyQualifiedClassName();

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
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying <em>Entry Point Identifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point Identifying</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying
	 * @generated
	 */
	EClass getEntryPointIdentifying();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying#getTag()
	 * @see #getEntryPointIdentifying()
	 * @generated
	 */
	EAttribute getEntryPointIdentifying_Tag();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry <em>Result Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Entry</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry
	 * @generated
	 */
	EClass getResultEntry();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Point</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getEntryPoint()
	 * @see #getResultEntry()
	 * @generated
	 */
	EReference getResultEntry_EntryPoint();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getSource()
	 * @see #getResultEntry()
	 * @generated
	 */
	EReference getResultEntry_Source();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sink</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry#getSink()
	 * @see #getResultEntry()
	 * @generated
	 */
	EReference getResultEntry_Sink();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement <em>Result Entry Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Entry Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement
	 * @generated
	 */
	EClass getResultEntryElement();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement#getSystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement#getSystemElement()
	 * @see #getResultEntryElement()
	 * @generated
	 */
	EReference getResultEntryElement_SystemElement();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement#getLevel()
	 * @see #getResultEntryElement()
	 * @generated
	 */
	EReference getResultEntryElement_Level();

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
		 * The meta object literal for the '<em><b>Result Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES = eINSTANCE.getSourceCodeAnalysisResult_ResultEntries();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.SystemElementIdentifiying_JOANASCARImpl <em>System Element Identifiying JOANASCAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.SystemElementIdentifiying_JOANASCARImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getSystemElementIdentifiying_JOANASCAR()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT_IDENTIFIYING_JOANASCAR = eINSTANCE.getSystemElementIdentifiying_JOANASCAR();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ParameterIdentifyingImpl <em>Parameter Identifying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.ParameterIdentifyingImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getParameterIdentifying()
		 * @generated
		 */
		EClass PARAMETER_IDENTIFYING = eINSTANCE.getParameterIdentifying();

		/**
		 * The meta object literal for the '<em><b>Parameter Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFYING__PARAMETER_INDEX = eINSTANCE.getParameterIdentifying_ParameterIndex();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFYING__PARAMETER_TYPE = eINSTANCE.getParameterIdentifying_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFYING__METHOD_NAME = eINSTANCE.getParameterIdentifying_MethodName();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFYING__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE
				.getParameterIdentifying_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.FieldIdentifyingImpl <em>Field Identifying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.FieldIdentifyingImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getFieldIdentifying()
		 * @generated
		 */
		EClass FIELD_IDENTIFYING = eINSTANCE.getFieldIdentifying();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_IDENTIFYING__FIELD_NAME = eINSTANCE.getFieldIdentifying_FieldName();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_IDENTIFYING__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE
				.getFieldIdentifying_FullyQualifiedClassName();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.EntryPointIdentifyingImpl <em>Entry Point Identifying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.EntryPointIdentifyingImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getEntryPointIdentifying()
		 * @generated
		 */
		EClass ENTRY_POINT_IDENTIFYING = eINSTANCE.getEntryPointIdentifying();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_POINT_IDENTIFYING__TAG = eINSTANCE.getEntryPointIdentifying_Tag();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryImpl <em>Result Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getResultEntry()
		 * @generated
		 */
		EClass RESULT_ENTRY = eINSTANCE.getResultEntry();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_ENTRY__ENTRY_POINT = eINSTANCE.getResultEntry_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_ENTRY__SOURCE = eINSTANCE.getResultEntry_Source();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_ENTRY__SINK = eINSTANCE.getResultEntry_Sink();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryElementImpl <em>Result Entry Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryElementImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joanascar.impl.JoanascarPackageImpl#getResultEntryElement()
		 * @generated
		 */
		EClass RESULT_ENTRY_ELEMENT = eINSTANCE.getResultEntryElement();

		/**
		 * The meta object literal for the '<em><b>System Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT = eINSTANCE.getResultEntryElement_SystemElement();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_ENTRY_ELEMENT__LEVEL = eINSTANCE.getResultEntryElement_Level();

	}

} //JoanascarPackage
