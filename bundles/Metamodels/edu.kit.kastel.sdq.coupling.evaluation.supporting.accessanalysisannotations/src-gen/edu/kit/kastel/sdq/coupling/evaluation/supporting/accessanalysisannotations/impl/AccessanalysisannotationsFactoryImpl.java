/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.*;

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
public class AccessanalysisannotationsFactoryImpl extends EFactoryImpl implements AccessanalysisannotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessanalysisannotationsFactory init() {
		try {
			AccessanalysisannotationsFactory theAccessanalysisannotationsFactory = (AccessanalysisannotationsFactory) EPackage.Registry.INSTANCE
					.getEFactory(AccessanalysisannotationsPackage.eNS_URI);
			if (theAccessanalysisannotationsFactory != null) {
				return theAccessanalysisannotationsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccessanalysisannotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessanalysisannotationsFactoryImpl() {
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
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_ANNOTATION:
			return createInformationFlowAnnotation();
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_CALL_ANNOTATION:
			return createInformationFlowCallAnnotation();
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_RETURN_ANNOTATION:
			return createInformationFlowReturnAnnotation();
		case AccessanalysisannotationsPackage.INFORMATION_FLOW_PARAMETER_ANNOTATION:
			return createInformationFlowParameterAnnotation();
		case AccessanalysisannotationsPackage.ANNOTATIONS:
			return createAnnotations();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlowAnnotation createInformationFlowAnnotation() {
		InformationFlowAnnotationImpl informationFlowAnnotation = new InformationFlowAnnotationImpl();
		return informationFlowAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlowCallAnnotation createInformationFlowCallAnnotation() {
		InformationFlowCallAnnotationImpl informationFlowCallAnnotation = new InformationFlowCallAnnotationImpl();
		return informationFlowCallAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlowReturnAnnotation createInformationFlowReturnAnnotation() {
		InformationFlowReturnAnnotationImpl informationFlowReturnAnnotation = new InformationFlowReturnAnnotationImpl();
		return informationFlowReturnAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlowParameterAnnotation createInformationFlowParameterAnnotation() {
		InformationFlowParameterAnnotationImpl informationFlowParameterAnnotation = new InformationFlowParameterAnnotationImpl();
		return informationFlowParameterAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotations createAnnotations() {
		AnnotationsImpl annotations = new AnnotationsImpl();
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessanalysisannotationsPackage getAccessanalysisannotationsPackage() {
		return (AccessanalysisannotationsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccessanalysisannotationsPackage getPackage() {
		return AccessanalysisannotationsPackage.eINSTANCE;
	}

} //AccessanalysisannotationsFactoryImpl
