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
			TainttrackingFactory theTainttrackingFactory = (TainttrackingFactory)EPackage.Registry.INSTANCE.getEFactory(TainttrackingPackage.eNS_URI);
			if (theTainttrackingFactory != null) {
				return theTainttrackingFactory;
			}
		}
		catch (Exception exception) {
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
			case TainttrackingPackage.SECURITY_LEVEL: return createSecurityLevel();
			case TainttrackingPackage.TAINTTRACKING_ROOT: return createTainttrackingRoot();
			case TainttrackingPackage.QUERY: return createQuery();
			case TainttrackingPackage.SECURITY_LEVEL_ANNOTATION: return createSecurityLevelAnnotation();
			case TainttrackingPackage.FIELD_ANNOTATION: return createFieldAnnotation();
			case TainttrackingPackage.PARAMETER_ANNOTATION: return createParameterAnnotation();
			case TainttrackingPackage.ALLOWED_FLOW: return createAllowedFlow();
			case TainttrackingPackage.ALLOWED_FLOWS: return createAllowedFlows();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel createSecurityLevel() {
		SecurityLevelImpl securityLevel = new SecurityLevelImpl();
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TainttrackingRoot createTainttrackingRoot() {
		TainttrackingRootImpl tainttrackingRoot = new TainttrackingRootImpl();
		return tainttrackingRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevelAnnotation createSecurityLevelAnnotation() {
		SecurityLevelAnnotationImpl securityLevelAnnotation = new SecurityLevelAnnotationImpl();
		return securityLevelAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAnnotation createFieldAnnotation() {
		FieldAnnotationImpl fieldAnnotation = new FieldAnnotationImpl();
		return fieldAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterAnnotation createParameterAnnotation() {
		ParameterAnnotationImpl parameterAnnotation = new ParameterAnnotationImpl();
		return parameterAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedFlow createAllowedFlow() {
		AllowedFlowImpl allowedFlow = new AllowedFlowImpl();
		return allowedFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedFlows createAllowedFlows() {
		AllowedFlowsImpl allowedFlows = new AllowedFlowsImpl();
		return allowedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TainttrackingPackage getTainttrackingPackage() {
		return (TainttrackingPackage)getEPackage();
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
