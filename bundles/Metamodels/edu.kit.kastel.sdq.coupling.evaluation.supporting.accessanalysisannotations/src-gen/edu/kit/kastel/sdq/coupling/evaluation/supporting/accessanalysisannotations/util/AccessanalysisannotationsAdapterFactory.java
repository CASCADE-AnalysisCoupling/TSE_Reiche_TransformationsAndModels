/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.util;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage
 * @generated
 */
public class AccessanalysisannotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AccessanalysisannotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessanalysisannotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AccessanalysisannotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessanalysisannotationsSwitch<Adapter> modelSwitch = new AccessanalysisannotationsSwitch<Adapter>() {
		@Override
		public Adapter caseInformationFlowAnnotation(InformationFlowAnnotation object) {
			return createInformationFlowAnnotationAdapter();
		}

		@Override
		public Adapter caseInformationFlowOperationSignatureAnnotation(
				InformationFlowOperationSignatureAnnotation object) {
			return createInformationFlowOperationSignatureAnnotationAdapter();
		}

		@Override
		public Adapter caseInformationFlowCallAnnotation(InformationFlowCallAnnotation object) {
			return createInformationFlowCallAnnotationAdapter();
		}

		@Override
		public Adapter caseInformationFlowReturnAnnotation(InformationFlowReturnAnnotation object) {
			return createInformationFlowReturnAnnotationAdapter();
		}

		@Override
		public Adapter caseInformationFlowParameterAnnotation(InformationFlowParameterAnnotation object) {
			return createInformationFlowParameterAnnotationAdapter();
		}

		@Override
		public Adapter caseAnnotations(Annotations object) {
			return createAnnotationsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation <em>Information Flow Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation
	 * @generated
	 */
	public Adapter createInformationFlowAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowOperationSignatureAnnotation <em>Information Flow Operation Signature Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowOperationSignatureAnnotation
	 * @generated
	 */
	public Adapter createInformationFlowOperationSignatureAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowCallAnnotation <em>Information Flow Call Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowCallAnnotation
	 * @generated
	 */
	public Adapter createInformationFlowCallAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowReturnAnnotation <em>Information Flow Return Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowReturnAnnotation
	 * @generated
	 */
	public Adapter createInformationFlowReturnAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowParameterAnnotation <em>Information Flow Parameter Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowParameterAnnotation
	 * @generated
	 */
	public Adapter createInformationFlowParameterAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations
	 * @generated
	 */
	public Adapter createAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AccessanalysisannotationsAdapterFactory
