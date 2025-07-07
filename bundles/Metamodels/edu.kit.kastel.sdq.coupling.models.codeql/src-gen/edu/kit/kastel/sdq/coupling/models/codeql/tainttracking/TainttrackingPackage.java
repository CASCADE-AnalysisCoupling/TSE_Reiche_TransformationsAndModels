/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking;

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
 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingFactory
 * @model kind="package"
 * @generated
 */
public interface TainttrackingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tainttracking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codeql/tainttracking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tainttracking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TainttrackingPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelImpl <em>Security Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getSecurityLevel()
	 * @generated
	 */
	int SECURITY_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL__NAME = IdentifierPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Security Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingRootImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getTainttrackingRoot()
	 * @generated
	 */
	int TAINTTRACKING_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAINTTRACKING_ROOT__QUERIES = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAINTTRACKING_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAINTTRACKING_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.QueryImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Applied Security Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__APPLIED_SECURITY_LEVEL = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Level Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SECURITY_LEVEL_ANNOTATIONS = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allowed Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ALLOWED_FLOWS = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelAnnotationImpl <em>Security Level Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getSecurityLevelAnnotation()
	 * @generated
	 */
	int SECURITY_LEVEL_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_ANNOTATION__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_ANNOTATION__SECURITY_LEVEL = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Level Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_ANNOTATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Level Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_ANNOTATION_OPERATION_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.FieldAnnotationImpl <em>Field Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.FieldAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getFieldAnnotation()
	 * @generated
	 */
	int FIELD_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ANNOTATION__ID = SECURITY_LEVEL_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ANNOTATION__SECURITY_LEVEL = SECURITY_LEVEL_ANNOTATION__SECURITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ANNOTATION__FIELD = SECURITY_LEVEL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ANNOTATION_FEATURE_COUNT = SECURITY_LEVEL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ANNOTATION_OPERATION_COUNT = SECURITY_LEVEL_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ParameterAnnotationImpl <em>Parameter Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ParameterAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getParameterAnnotation()
	 * @generated
	 */
	int PARAMETER_ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATION__ID = SECURITY_LEVEL_ANNOTATION__ID;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATION__SECURITY_LEVEL = SECURITY_LEVEL_ANNOTATION__SECURITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATION__PARAMETER = SECURITY_LEVEL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATION_FEATURE_COUNT = SECURITY_LEVEL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATION_OPERATION_COUNT = SECURITY_LEVEL_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowImpl <em>Allowed Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getAllowedFlow()
	 * @generated
	 */
	int ALLOWED_FLOW = 6;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOW__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOW__TO = 1;

	/**
	 * The number of structural features of the '<em>Allowed Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allowed Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowsImpl <em>Allowed Flows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowsImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getAllowedFlows()
	 * @generated
	 */
	int ALLOWED_FLOWS = 7;

	/**
	 * The feature id for the '<em><b>Allowed Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOWS__ALLOWED_FLOWS = 0;

	/**
	 * The number of structural features of the '<em>Allowed Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOWS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Allowed Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOWS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel
	 * @generated
	 */
	EClass getSecurityLevel();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot
	 * @generated
	 */
	EClass getTainttrackingRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot#getQueries()
	 * @see #getTainttrackingRoot()
	 * @generated
	 */
	EReference getTainttrackingRoot_Queries();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query#getAppliedSecurityLevel <em>Applied Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applied Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query#getAppliedSecurityLevel()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_AppliedSecurityLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query#getSecurityLevelAnnotations <em>Security Level Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Level Annotations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query#getSecurityLevelAnnotations()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_SecurityLevelAnnotations();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query#getAllowedFlows <em>Allowed Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowed Flows</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query#getAllowedFlows()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_AllowedFlows();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation <em>Security Level Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Level Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation
	 * @generated
	 */
	EClass getSecurityLevelAnnotation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation#getSecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation#getSecurityLevel()
	 * @see #getSecurityLevelAnnotation()
	 * @generated
	 */
	EReference getSecurityLevelAnnotation_SecurityLevel();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.FieldAnnotation <em>Field Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.FieldAnnotation
	 * @generated
	 */
	EClass getFieldAnnotation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.FieldAnnotation#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.FieldAnnotation#getField()
	 * @see #getFieldAnnotation()
	 * @generated
	 */
	EReference getFieldAnnotation_Field();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation <em>Parameter Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation
	 * @generated
	 */
	EClass getParameterAnnotation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation#getParameter()
	 * @see #getParameterAnnotation()
	 * @generated
	 */
	EReference getParameterAnnotation_Parameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow <em>Allowed Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed Flow</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow
	 * @generated
	 */
	EClass getAllowedFlow();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow#getFrom()
	 * @see #getAllowedFlow()
	 * @generated
	 */
	EReference getAllowedFlow_From();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow#getTo()
	 * @see #getAllowedFlow()
	 * @generated
	 */
	EReference getAllowedFlow_To();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlows <em>Allowed Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed Flows</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlows
	 * @generated
	 */
	EClass getAllowedFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlows#getAllowedFlows <em>Allowed Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed Flows</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlows#getAllowedFlows()
	 * @see #getAllowedFlows()
	 * @generated
	 */
	EReference getAllowedFlows_AllowedFlows();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TainttrackingFactory getTainttrackingFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelImpl <em>Security Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getSecurityLevel()
		 * @generated
		 */
		EClass SECURITY_LEVEL = eINSTANCE.getSecurityLevel();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingRootImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getTainttrackingRoot()
		 * @generated
		 */
		EClass TAINTTRACKING_ROOT = eINSTANCE.getTainttrackingRoot();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAINTTRACKING_ROOT__QUERIES = eINSTANCE.getTainttrackingRoot_Queries();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.QueryImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Applied Security Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__APPLIED_SECURITY_LEVEL = eINSTANCE.getQuery_AppliedSecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Security Level Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__SECURITY_LEVEL_ANNOTATIONS = eINSTANCE.getQuery_SecurityLevelAnnotations();

		/**
		 * The meta object literal for the '<em><b>Allowed Flows</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__ALLOWED_FLOWS = eINSTANCE.getQuery_AllowedFlows();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelAnnotationImpl <em>Security Level Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getSecurityLevelAnnotation()
		 * @generated
		 */
		EClass SECURITY_LEVEL_ANNOTATION = eINSTANCE.getSecurityLevelAnnotation();

		/**
		 * The meta object literal for the '<em><b>Security Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_LEVEL_ANNOTATION__SECURITY_LEVEL = eINSTANCE.getSecurityLevelAnnotation_SecurityLevel();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.FieldAnnotationImpl <em>Field Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.FieldAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getFieldAnnotation()
		 * @generated
		 */
		EClass FIELD_ANNOTATION = eINSTANCE.getFieldAnnotation();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ANNOTATION__FIELD = eINSTANCE.getFieldAnnotation_Field();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ParameterAnnotationImpl <em>Parameter Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ParameterAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getParameterAnnotation()
		 * @generated
		 */
		EClass PARAMETER_ANNOTATION = eINSTANCE.getParameterAnnotation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_ANNOTATION__PARAMETER = eINSTANCE.getParameterAnnotation_Parameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowImpl <em>Allowed Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getAllowedFlow()
		 * @generated
		 */
		EClass ALLOWED_FLOW = eINSTANCE.getAllowedFlow();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOWED_FLOW__FROM = eINSTANCE.getAllowedFlow_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOWED_FLOW__TO = eINSTANCE.getAllowedFlow_To();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowsImpl <em>Allowed Flows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowsImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getAllowedFlows()
		 * @generated
		 */
		EClass ALLOWED_FLOWS = eINSTANCE.getAllowedFlows();

		/**
		 * The meta object literal for the '<em><b>Allowed Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOWED_FLOWS__ALLOWED_FLOWS = eINSTANCE.getAllowedFlows_AllowedFlows();

	}

} //TainttrackingPackage
