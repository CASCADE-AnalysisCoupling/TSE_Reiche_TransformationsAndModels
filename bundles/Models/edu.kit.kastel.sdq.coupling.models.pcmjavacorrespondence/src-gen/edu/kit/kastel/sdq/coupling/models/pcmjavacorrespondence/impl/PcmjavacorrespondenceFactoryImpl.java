/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.*;

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
public class PcmjavacorrespondenceFactoryImpl extends EFactoryImpl implements PcmjavacorrespondenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmjavacorrespondenceFactory init() {
		try {
			PcmjavacorrespondenceFactory thePcmjavacorrespondenceFactory = (PcmjavacorrespondenceFactory) EPackage.Registry.INSTANCE
					.getEFactory(PcmjavacorrespondencePackage.eNS_URI);
			if (thePcmjavacorrespondenceFactory != null) {
				return thePcmjavacorrespondenceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcmjavacorrespondenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmjavacorrespondenceFactoryImpl() {
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
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT:
			return createPCMJavaCorrespondenceRoot();
		case PcmjavacorrespondencePackage.BASIC_COMPONENT2_CLASS:
			return createBasicComponent2Class();
		case PcmjavacorrespondencePackage.OPERATION_INTERFACE2_INTERFACE:
			return createOperationInterface2Interface();
		case PcmjavacorrespondencePackage.COMPOSITE_DATA_TYPE2_CLASS:
			return createCompositeDataType2Class();
		case PcmjavacorrespondencePackage.PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD:
			return createProvidedOperationSignature2JavaMethod();
		case PcmjavacorrespondencePackage.PROVIDED_SIGNATURE:
			return createProvidedSignature();
		case PcmjavacorrespondencePackage.PROVIDED_PARAMETER_IDENTIFICATION:
			return createProvidedParameterIdentification();
		case PcmjavacorrespondencePackage.PCM_PARAMETER2_JAVA_PARAMETER:
			return createPCMParameter2JavaParameter();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMJavaCorrespondenceRoot createPCMJavaCorrespondenceRoot() {
		PCMJavaCorrespondenceRootImpl pcmJavaCorrespondenceRoot = new PCMJavaCorrespondenceRootImpl();
		return pcmJavaCorrespondenceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponent2Class createBasicComponent2Class() {
		BasicComponent2ClassImpl basicComponent2Class = new BasicComponent2ClassImpl();
		return basicComponent2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface2Interface createOperationInterface2Interface() {
		OperationInterface2InterfaceImpl operationInterface2Interface = new OperationInterface2InterfaceImpl();
		return operationInterface2Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDataType2Class createCompositeDataType2Class() {
		CompositeDataType2ClassImpl compositeDataType2Class = new CompositeDataType2ClassImpl();
		return compositeDataType2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedOperationSignature2JavaMethod createProvidedOperationSignature2JavaMethod() {
		ProvidedOperationSignature2JavaMethodImpl providedOperationSignature2JavaMethod = new ProvidedOperationSignature2JavaMethodImpl();
		return providedOperationSignature2JavaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedSignature createProvidedSignature() {
		ProvidedSignatureImpl providedSignature = new ProvidedSignatureImpl();
		return providedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedParameterIdentification createProvidedParameterIdentification() {
		ProvidedParameterIdentificationImpl providedParameterIdentification = new ProvidedParameterIdentificationImpl();
		return providedParameterIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMParameter2JavaParameter createPCMParameter2JavaParameter() {
		PCMParameter2JavaParameterImpl pcmParameter2JavaParameter = new PCMParameter2JavaParameterImpl();
		return pcmParameter2JavaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmjavacorrespondencePackage getPcmjavacorrespondencePackage() {
		return (PcmjavacorrespondencePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcmjavacorrespondencePackage getPackage() {
		return PcmjavacorrespondencePackage.eINSTANCE;
	}

} //PcmjavacorrespondenceFactoryImpl
