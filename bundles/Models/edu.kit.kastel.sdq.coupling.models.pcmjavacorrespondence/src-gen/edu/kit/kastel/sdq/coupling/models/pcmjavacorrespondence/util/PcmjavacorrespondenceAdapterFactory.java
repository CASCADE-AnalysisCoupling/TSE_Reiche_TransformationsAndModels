/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.util;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage
 * @generated
 */
public class PcmjavacorrespondenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcmjavacorrespondencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmjavacorrespondenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PcmjavacorrespondencePackage.eINSTANCE;
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
	protected PcmjavacorrespondenceSwitch<Adapter> modelSwitch = new PcmjavacorrespondenceSwitch<Adapter>() {
		@Override
		public Adapter casePCMJavaCorrespondenceRoot(PCMJavaCorrespondenceRoot object) {
			return createPCMJavaCorrespondenceRootAdapter();
		}

		@Override
		public Adapter caseBasicComponent2Class(BasicComponent2Class object) {
			return createBasicComponent2ClassAdapter();
		}

		@Override
		public Adapter caseOperationInterface2Interface(OperationInterface2Interface object) {
			return createOperationInterface2InterfaceAdapter();
		}

		@Override
		public Adapter caseCompositeDataType2Class(CompositeDataType2Class object) {
			return createCompositeDataType2ClassAdapter();
		}

		@Override
		public Adapter caseProvidedOperationSignature2JavaMethod(ProvidedOperationSignature2JavaMethod object) {
			return createProvidedOperationSignature2JavaMethodAdapter();
		}

		@Override
		public Adapter caseProvidedSignature(ProvidedSignature object) {
			return createProvidedSignatureAdapter();
		}

		@Override
		public Adapter caseProvidedParameterIdentification(ProvidedParameterIdentification object) {
			return createProvidedParameterIdentificationAdapter();
		}

		@Override
		public Adapter casePCMParameter2JavaParameter(PCMParameter2JavaParameter object) {
			return createPCMParameter2JavaParameterAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot <em>PCM Java Correspondence Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot
	 * @generated
	 */
	public Adapter createPCMJavaCorrespondenceRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class <em>Basic Component2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class
	 * @generated
	 */
	public Adapter createBasicComponent2ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface <em>Operation Interface2 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface
	 * @generated
	 */
	public Adapter createOperationInterface2InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class <em>Composite Data Type2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class
	 * @generated
	 */
	public Adapter createCompositeDataType2ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod <em>Provided Operation Signature2 Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod
	 * @generated
	 */
	public Adapter createProvidedOperationSignature2JavaMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature <em>Provided Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature
	 * @generated
	 */
	public Adapter createProvidedSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification <em>Provided Parameter Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification
	 * @generated
	 */
	public Adapter createProvidedParameterIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter <em>PCM Parameter2 Java Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter
	 * @generated
	 */
	public Adapter createPCMParameter2JavaParameterAdapter() {
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

} //PcmjavacorrespondenceAdapterFactory
