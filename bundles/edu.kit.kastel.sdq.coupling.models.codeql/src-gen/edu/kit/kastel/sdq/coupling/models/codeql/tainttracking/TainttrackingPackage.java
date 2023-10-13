/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
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
	TainttrackingPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.NodeImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = IdentifierPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ExpressionNodeImpl <em>Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ExpressionNodeImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getExpressionNode()
	 * @generated
	 */
	int EXPRESSION_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE__EXPRESSION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ParameterNodeImpl <em>Parameter Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ParameterNodeImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getParameterNode()
	 * @generated
	 */
	int PARAMETER_NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NODE__PARAMETER = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelImpl <em>Security Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getSecurityLevel()
	 * @generated
	 */
	int SECURITY_LEVEL = 3;

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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.DataFlowRootImpl <em>Data Flow Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.DataFlowRootImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getDataFlowRoot()
	 * @generated
	 */
	int DATA_FLOW_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_ROOT__NODES = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_ROOT__CONFIGURATIONS = 1;

	/**
	 * The number of structural features of the '<em>Data Flow Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_ROOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ConfigurationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Applied Security Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__APPLIED_SECURITY_LEVEL = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Level Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SECURITY_LEVEL_ANNOTATIONS = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allowed Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ALLOWED_FLOWS = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelAnnotationImpl <em>Security Level Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.SecurityLevelAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getSecurityLevelAnnotation()
	 * @generated
	 */
	int SECURITY_LEVEL_ANNOTATION = 6;

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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ParameterAnnotationImpl <em>Parameter Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ParameterAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getParameterAnnotation()
	 * @generated
	 */
	int PARAMETER_ANNOTATION = 7;

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
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowImpl <em>Allowed Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.AllowedFlowImpl
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getAllowedFlow()
	 * @generated
	 */
	int ALLOWED_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOW__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOW__FROM = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOW__TO = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allowed Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_FLOW_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ExpressionNode <em>Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Node</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ExpressionNode
	 * @generated
	 */
	EClass getExpressionNode();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ExpressionNode#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ExpressionNode#getExpression()
	 * @see #getExpressionNode()
	 * @generated
	 */
	EReference getExpressionNode_Expression();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterNode <em>Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Node</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterNode
	 * @generated
	 */
	EClass getParameterNode();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterNode#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterNode#getParameter()
	 * @see #getParameterNode()
	 * @generated
	 */
	EReference getParameterNode_Parameter();

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
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.DataFlowRoot <em>Data Flow Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Root</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.DataFlowRoot
	 * @generated
	 */
	EClass getDataFlowRoot();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.DataFlowRoot#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.DataFlowRoot#getNodes()
	 * @see #getDataFlowRoot()
	 * @generated
	 */
	EReference getDataFlowRoot_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.DataFlowRoot#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Configurations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.DataFlowRoot#getConfigurations()
	 * @see #getDataFlowRoot()
	 * @generated
	 */
	EReference getDataFlowRoot_Configurations();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration#getAppliedSecurityLevel <em>Applied Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied Security Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration#getAppliedSecurityLevel()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_AppliedSecurityLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration#getSecurityLevelAnnotations <em>Security Level Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Level Annotations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration#getSecurityLevelAnnotations()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_SecurityLevelAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration#getAllowedFlows <em>Allowed Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed Flows</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration#getAllowedFlows()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_AllowedFlows();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.NodeImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ExpressionNodeImpl <em>Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ExpressionNodeImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getExpressionNode()
		 * @generated
		 */
		EClass EXPRESSION_NODE = eINSTANCE.getExpressionNode();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_NODE__EXPRESSION = eINSTANCE.getExpressionNode_Expression();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ParameterNodeImpl <em>Parameter Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ParameterNodeImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getParameterNode()
		 * @generated
		 */
		EClass PARAMETER_NODE = eINSTANCE.getParameterNode();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_NODE__PARAMETER = eINSTANCE.getParameterNode_Parameter();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.DataFlowRootImpl <em>Data Flow Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.DataFlowRootImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getDataFlowRoot()
		 * @generated
		 */
		EClass DATA_FLOW_ROOT = eINSTANCE.getDataFlowRoot();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_ROOT__NODES = eINSTANCE.getDataFlowRoot_Nodes();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_ROOT__CONFIGURATIONS = eINSTANCE.getDataFlowRoot_Configurations();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.ConfigurationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl.TainttrackingPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Applied Security Level</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__APPLIED_SECURITY_LEVEL = eINSTANCE.getConfiguration_AppliedSecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Security Level Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__SECURITY_LEVEL_ANNOTATIONS = eINSTANCE.getConfiguration_SecurityLevelAnnotations();

		/**
		 * The meta object literal for the '<em><b>Allowed Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ALLOWED_FLOWS = eINSTANCE.getConfiguration_AllowedFlows();

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

	}

} //TainttrackingPackage
