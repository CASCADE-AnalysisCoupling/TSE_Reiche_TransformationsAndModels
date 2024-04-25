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
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ANALYSIS_RESULT__CONFIGURATIONS = 3;

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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultEntryImpl <em>Result Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultEntryImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getResultEntry()
	 * @generated
	 */
	int RESULT_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY__SINK = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ENTRY__CONFIG = 2;

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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ConfigurationID_SCARImpl <em>Configuration ID SCAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ConfigurationID_SCARImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getConfigurationID_SCAR()
	 * @generated
	 */
	int CONFIGURATION_ID_SCAR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ID_SCAR__ID = 0;

	/**
	 * The number of structural features of the '<em>Configuration ID SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ID_SCAR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration ID SCAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ID_SCAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SystemElementIdentificationImpl <em>System Element Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SystemElementIdentificationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getSystemElementIdentification()
	 * @generated
	 */
	int SYSTEM_ELEMENT_IDENTIFICATION = 4;

	/**
	 * The number of structural features of the '<em>System Element Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_IDENTIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Element Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ParameterIdentificationImpl <em>Parameter Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ParameterIdentificationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getParameterIdentification()
	 * @generated
	 */
	int PARAMETER_IDENTIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION__PARAMETER_NAME = SYSTEM_ELEMENT_IDENTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION__PARAMETER_TYPE = SYSTEM_ELEMENT_IDENTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION__METHOD_NAME = SYSTEM_ELEMENT_IDENTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION__FULLY_QUALIFIED_CLASS_NAME = SYSTEM_ELEMENT_IDENTIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION_FEATURE_COUNT = SYSTEM_ELEMENT_IDENTIFICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION_OPERATION_COUNT = SYSTEM_ELEMENT_IDENTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.FieldIdentificationImpl <em>Field Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.FieldIdentificationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getFieldIdentification()
	 * @generated
	 */
	int FIELD_IDENTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFICATION__FIELD_NAME = SYSTEM_ELEMENT_IDENTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFICATION__TYPE = SYSTEM_ELEMENT_IDENTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFICATION__FULLY_QUALIFIED_CLASS_NAME = SYSTEM_ELEMENT_IDENTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFICATION_FEATURE_COUNT = SYSTEM_ELEMENT_IDENTIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Field Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFICATION_OPERATION_COUNT = SYSTEM_ELEMENT_IDENTIFICATION_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult#getConfigurations()
	 * @see #getSourceCodeAnalysisResult()
	 * @generated
	 */
	EReference getSourceCodeAnalysisResult_Configurations();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry <em>Result Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Entry</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry
	 * @generated
	 */
	EClass getResultEntry();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getSource()
	 * @see #getResultEntry()
	 * @generated
	 */
	EReference getResultEntry_Source();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sink</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getSink()
	 * @see #getResultEntry()
	 * @generated
	 */
	EReference getResultEntry_Sink();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry#getConfig()
	 * @see #getResultEntry()
	 * @generated
	 */
	EReference getResultEntry_Config();

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
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR <em>Configuration ID SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration ID SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR
	 * @generated
	 */
	EClass getConfigurationID_SCAR();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR#getId()
	 * @see #getConfigurationID_SCAR()
	 * @generated
	 */
	EAttribute getConfigurationID_SCAR_Id();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElementIdentification <em>System Element Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.SystemElementIdentification
	 * @generated
	 */
	EClass getSystemElementIdentification();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification <em>Parameter Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification
	 * @generated
	 */
	EClass getParameterIdentification();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification#getParameterName()
	 * @see #getParameterIdentification()
	 * @generated
	 */
	EAttribute getParameterIdentification_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification#getParameterType()
	 * @see #getParameterIdentification()
	 * @generated
	 */
	EAttribute getParameterIdentification_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification#getMethodName()
	 * @see #getParameterIdentification()
	 * @generated
	 */
	EAttribute getParameterIdentification_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification#getFullyQualifiedClassName()
	 * @see #getParameterIdentification()
	 * @generated
	 */
	EAttribute getParameterIdentification_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification <em>Field Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification
	 * @generated
	 */
	EClass getFieldIdentification();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification#getFieldName()
	 * @see #getFieldIdentification()
	 * @generated
	 */
	EAttribute getFieldIdentification_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification#getType()
	 * @see #getFieldIdentification()
	 * @generated
	 */
	EAttribute getFieldIdentification_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.FieldIdentification#getFullyQualifiedClassName()
	 * @see #getFieldIdentification()
	 * @generated
	 */
	EAttribute getFieldIdentification_FullyQualifiedClassName();

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
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ANALYSIS_RESULT__CONFIGURATIONS = eINSTANCE.getSourceCodeAnalysisResult_Configurations();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultEntryImpl <em>Result Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultEntryImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getResultEntry()
		 * @generated
		 */
		EClass RESULT_ENTRY = eINSTANCE.getResultEntry();

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
		 * The meta object literal for the '<em><b>Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_ENTRY__CONFIG = eINSTANCE.getResultEntry_Config();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ConfigurationID_SCARImpl <em>Configuration ID SCAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ConfigurationID_SCARImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getConfigurationID_SCAR()
		 * @generated
		 */
		EClass CONFIGURATION_ID_SCAR = eINSTANCE.getConfigurationID_SCAR();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_ID_SCAR__ID = eINSTANCE.getConfigurationID_SCAR_Id();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SystemElementIdentificationImpl <em>System Element Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.SystemElementIdentificationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getSystemElementIdentification()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT_IDENTIFICATION = eINSTANCE.getSystemElementIdentification();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ParameterIdentificationImpl <em>Parameter Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ParameterIdentificationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getParameterIdentification()
		 * @generated
		 */
		EClass PARAMETER_IDENTIFICATION = eINSTANCE.getParameterIdentification();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICATION__PARAMETER_NAME = eINSTANCE.getParameterIdentification_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICATION__PARAMETER_TYPE = eINSTANCE.getParameterIdentification_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICATION__METHOD_NAME = eINSTANCE.getParameterIdentification_MethodName();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_IDENTIFICATION__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE
				.getParameterIdentification_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.FieldIdentificationImpl <em>Field Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.FieldIdentificationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.CodeqlscarPackageImpl#getFieldIdentification()
		 * @generated
		 */
		EClass FIELD_IDENTIFICATION = eINSTANCE.getFieldIdentification();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_IDENTIFICATION__FIELD_NAME = eINSTANCE.getFieldIdentification_FieldName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_IDENTIFICATION__TYPE = eINSTANCE.getFieldIdentification_Type();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_IDENTIFICATION__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE
				.getFieldIdentification_FullyQualifiedClassName();

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
