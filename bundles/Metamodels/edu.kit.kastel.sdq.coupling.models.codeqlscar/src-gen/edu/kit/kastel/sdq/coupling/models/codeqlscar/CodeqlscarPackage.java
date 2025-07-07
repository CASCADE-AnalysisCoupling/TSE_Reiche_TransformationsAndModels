/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar;

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
 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarFactory
 * @model kind="package"
 * @generated
 */
public interface CodeqlscarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codeqlscar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codeqlscar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codeqlscar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeqlscarPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SourceCodeAnalysisResultImpl <em>Source Code Analysis Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SourceCodeAnalysisResultImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getSourceCodeAnalysisResult()
	 * @generated
	 */
	int SOURCE_CODE_ANALYSIS_RESULT = 0;

	/**
	 * The feature id for the '<em><b>System Element Identifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENT_IDENTIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Security Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT__SECURITY_LEVELS = 1;

	/**
	 * The feature id for the '<em><b>Result Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES = 2;

	/**
	 * The feature id for the '<em><b>Rule Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT__RULE_IDS = 3;

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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SINK = 1;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__RULE_ID = 2;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultEntryElementImpl <em>Result Entry Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultEntryElementImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getResultEntryElement()
	 * @generated
	 */
	int RESULT_ENTRY_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY_ELEMENT__SYSTEM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY_ELEMENT__SECURITY_LEVEL = 1;

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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.RuleIdImpl <em>Rule Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.RuleIdImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getRuleId()
	 * @generated
	 */
	int RULE_ID = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ID__ID = 0;

	/**
	 * The number of structural features of the '<em>Rule Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SystemElementImpl <em>System Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SystemElementImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getSystemElement()
	 * @generated
	 */
	int SYSTEM_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.Parameter_SCARImpl <em>Parameter SCAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.Parameter_SCARImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getParameter_SCAR()
	 * @generated
	 */
	int PARAMETER_SCAR = 5;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR__PARAMETER_NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR__PARAMETER_TYPE = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR__METHOD_NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR__FULLY_QUALIFIED_CLASS_NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Parameter SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SCAR_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.Field_SCARImpl <em>Field SCAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.Field_SCARImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getField_SCAR()
	 * @generated
	 */
	int FIELD_SCAR = 6;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCAR__FIELD_NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCAR__TYPE = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCAR__FULLY_QUALIFIED_CLASS_NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCAR_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Field SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCAR_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SecurityLevel_SCARImpl <em>Security Level SCAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SecurityLevel_SCARImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getSecurityLevel_SCAR()
	 * @generated
	 */
	int SECURITY_LEVEL_SCAR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_SCAR__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_SCAR__NAME = IdentifierPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Security Level SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_SCAR_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Level SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_SCAR_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult <em>Source Code Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Code Analysis Result</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult
	 * @generated
	 */
	EClass getSourceCodeAnalysisResult();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getSystemElementIdentifications <em>System Element Identifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Element Identifications</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getSystemElementIdentifications()
	 * @see #getSourceCodeAnalysisResult()
	 * @generated
	 */
	EReference getSourceCodeAnalysisResult_SystemElementIdentifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getSecurityLevels <em>Security Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Levels</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getSecurityLevels()
	 * @see #getSourceCodeAnalysisResult()
	 * @generated
	 */
	EReference getSourceCodeAnalysisResult_SecurityLevels();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getResultEntries <em>Result Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Entries</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getResultEntries()
	 * @see #getSourceCodeAnalysisResult()
	 * @generated
	 */
	EReference getSourceCodeAnalysisResult_ResultEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getRuleIds <em>Rule Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Ids</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getRuleIds()
	 * @see #getSourceCodeAnalysisResult()
	 * @generated
	 */
	EReference getSourceCodeAnalysisResult_RuleIds();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getSource()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Source();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sink</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getSink()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Sink();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getRuleId <em>Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule Id</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Result#getRuleId()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_RuleId();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement <em>Result Entry Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Entry Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement
	 * @generated
	 */
	EClass getResultEntryElement();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement#getSystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement#getSystemElement()
	 * @see #getResultEntryElement()
	 * @generated
	 */
	EReference getResultEntryElement_SystemElement();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement#getSecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement#getSecurityLevel()
	 * @see #getResultEntryElement()
	 * @generated
	 */
	EReference getResultEntryElement_SecurityLevel();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId <em>Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Id</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId
	 * @generated
	 */
	EClass getRuleId();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId#getId()
	 * @see #getRuleId()
	 * @generated
	 */
	EAttribute getRuleId_Id();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElement
	 * @generated
	 */
	EClass getSystemElement();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR <em>Parameter SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR
	 * @generated
	 */
	EClass getParameter_SCAR();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getParameterName()
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	EAttribute getParameter_SCAR_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getParameterType()
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	EAttribute getParameter_SCAR_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getMethodName()
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	EAttribute getParameter_SCAR_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getFullyQualifiedClassName()
	 * @see #getParameter_SCAR()
	 * @generated
	 */
	EAttribute getParameter_SCAR_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR <em>Field SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR
	 * @generated
	 */
	EClass getField_SCAR();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getFieldName()
	 * @see #getField_SCAR()
	 * @generated
	 */
	EAttribute getField_SCAR_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getType()
	 * @see #getField_SCAR()
	 * @generated
	 */
	EAttribute getField_SCAR_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR#getFullyQualifiedClassName()
	 * @see #getField_SCAR()
	 * @generated
	 */
	EAttribute getField_SCAR_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR <em>Security Level SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Level SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR
	 * @generated
	 */
	EClass getSecurityLevel_SCAR();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeqlscarFactory getCodeqlscarFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SourceCodeAnalysisResultImpl <em>Source Code Analysis Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SourceCodeAnalysisResultImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getSourceCodeAnalysisResult()
		 * @generated
		 */
		EClass SOURCE_CODE_ANALYSIS_RESULT = eINSTANCE.getSourceCodeAnalysisResult();

		/**
		 * The meta object literal for the '<em><b>System Element Identifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ANALYSIS_RESULT__SYSTEM_ELEMENT_IDENTIFICATIONS = eINSTANCE
				.getSourceCodeAnalysisResult_SystemElementIdentifications();

		/**
		 * The meta object literal for the '<em><b>Security Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ANALYSIS_RESULT__SECURITY_LEVELS = eINSTANCE
				.getSourceCodeAnalysisResult_SecurityLevels();

		/**
		 * The meta object literal for the '<em><b>Result Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ANALYSIS_RESULT__RESULT_ENTRIES = eINSTANCE.getSourceCodeAnalysisResult_ResultEntries();

		/**
		 * The meta object literal for the '<em><b>Rule Ids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ANALYSIS_RESULT__RULE_IDS = eINSTANCE.getSourceCodeAnalysisResult_RuleIds();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__SOURCE = eINSTANCE.getResult_Source();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__SINK = eINSTANCE.getResult_Sink();

		/**
		 * The meta object literal for the '<em><b>Rule Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__RULE_ID = eINSTANCE.getResult_RuleId();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultEntryElementImpl <em>Result Entry Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultEntryElementImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getResultEntryElement()
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
		 * The meta object literal for the '<em><b>Security Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_ENTRY_ELEMENT__SECURITY_LEVEL = eINSTANCE.getResultEntryElement_SecurityLevel();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.RuleIdImpl <em>Rule Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.RuleIdImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getRuleId()
		 * @generated
		 */
		EClass RULE_ID = eINSTANCE.getRuleId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ID__ID = eINSTANCE.getRuleId_Id();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SystemElementImpl <em>System Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SystemElementImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getSystemElement()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT = eINSTANCE.getSystemElement();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.Parameter_SCARImpl <em>Parameter SCAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.Parameter_SCARImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getParameter_SCAR()
		 * @generated
		 */
		EClass PARAMETER_SCAR = eINSTANCE.getParameter_SCAR();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SCAR__PARAMETER_NAME = eINSTANCE.getParameter_SCAR_ParameterName();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.Field_SCARImpl <em>Field SCAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.Field_SCARImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getField_SCAR()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SCAR__TYPE = eINSTANCE.getField_SCAR_Type();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SCAR__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE.getField_SCAR_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SecurityLevel_SCARImpl <em>Security Level SCAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SecurityLevel_SCARImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getSecurityLevel_SCAR()
		 * @generated
		 */
		EClass SECURITY_LEVEL_SCAR = eINSTANCE.getSecurityLevel_SCAR();

	}

} //CodeqlscarPackage
