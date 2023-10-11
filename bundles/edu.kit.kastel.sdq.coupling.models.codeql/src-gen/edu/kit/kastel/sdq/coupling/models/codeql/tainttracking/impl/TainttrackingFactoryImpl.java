/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TainttrackingFactoryImpl extends EFactoryImpl implements TainttrackingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TainttrackingFactory init() {
		try {
			TainttrackingFactory theTainttrackingFactory = (TainttrackingFactory) EPackage.Registry.INSTANCE
					.getEFactory(TainttrackingPackage.eNS_URI);
			if (theTainttrackingFactory != null) {
				return theTainttrackingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TainttrackingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TainttrackingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TainttrackingPackage.NODE:
			return createNode();
		case TainttrackingPackage.EXPRESSION_NODE:
			return createExpressionNode();
		case TainttrackingPackage.PARAMETER_NODE:
			return createParameterNode();
		case TainttrackingPackage.SECURITY_LEVEL:
			return createSecurityLevel();
		case TainttrackingPackage.DATA_FLOW_ROOT:
			return createDataFlowRoot();
		case TainttrackingPackage.CONFIGURATION:
			return createConfiguration();
		case TainttrackingPackage.SECURITY_LEVEL_ANNOTATION:
			return createSecurityLevelAnnotation();
		case TainttrackingPackage.PARAMETER_ANNOTATION:
			return createParameterAnnotation();
		case TainttrackingPackage.ALLOWED_FLOW:
			return createAllowedFlow();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionNode createExpressionNode() {
		ExpressionNodeImpl expressionNode = new ExpressionNodeImpl();
		return expressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterNode createParameterNode() {
		ParameterNodeImpl parameterNode = new ParameterNodeImpl();
		return parameterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel createSecurityLevel() {
		SecurityLevelImpl securityLevel = new SecurityLevelImpl();
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRoot createDataFlowRoot() {
		DataFlowRootImpl dataFlowRoot = new DataFlowRootImpl();
		return dataFlowRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevelAnnotation createSecurityLevelAnnotation() {
		SecurityLevelAnnotationImpl securityLevelAnnotation = new SecurityLevelAnnotationImpl();
		return securityLevelAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterAnnotation createParameterAnnotation() {
		ParameterAnnotationImpl parameterAnnotation = new ParameterAnnotationImpl();
		return parameterAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowedFlow createAllowedFlow() {
		AllowedFlowImpl allowedFlow = new AllowedFlowImpl();
		return allowedFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TainttrackingPackage getTainttrackingPackage() {
		return (TainttrackingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TainttrackingPackage getPackage() {
		return TainttrackingPackage.eINSTANCE;
	}

} //TainttrackingFactoryImpl
