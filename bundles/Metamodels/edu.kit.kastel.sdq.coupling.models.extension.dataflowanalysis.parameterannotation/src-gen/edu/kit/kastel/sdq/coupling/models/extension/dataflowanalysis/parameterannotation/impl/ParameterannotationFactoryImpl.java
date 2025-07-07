/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.*;

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
public class ParameterannotationFactoryImpl extends EFactoryImpl implements ParameterannotationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterannotationFactory init() {
		try {
			ParameterannotationFactory theParameterannotationFactory = (ParameterannotationFactory) EPackage.Registry.INSTANCE
					.getEFactory(ParameterannotationPackage.eNS_URI);
			if (theParameterannotationFactory != null) {
				return theParameterannotationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParameterannotationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterannotationFactoryImpl() {
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
		case ParameterannotationPackage.PROVIDED_OPERATION_IDENTIFICATION:
			return createProvidedOperationIdentification();
		case ParameterannotationPackage.GENERAL_OPERATION_PARAMETER_IDENTIFICATION:
			return createGeneralOperationParameterIdentification();
		case ParameterannotationPackage.PROVIDED_OPERATION_PARAMETER_IDENTIFICATION:
			return createProvidedOperationParameterIdentification();
		case ParameterannotationPackage.PARAMETER_ANNOTATION:
			return createParameterAnnotation();
		case ParameterannotationPackage.PARAMETER_ANNOTATIONS:
			return createParameterAnnotations();
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
	public ProvidedOperationIdentification createProvidedOperationIdentification() {
		ProvidedOperationIdentificationImpl providedOperationIdentification = new ProvidedOperationIdentificationImpl();
		return providedOperationIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralOperationParameterIdentification createGeneralOperationParameterIdentification() {
		GeneralOperationParameterIdentificationImpl generalOperationParameterIdentification = new GeneralOperationParameterIdentificationImpl();
		return generalOperationParameterIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedOperationParameterIdentification createProvidedOperationParameterIdentification() {
		ProvidedOperationParameterIdentificationImpl providedOperationParameterIdentification = new ProvidedOperationParameterIdentificationImpl();
		return providedOperationParameterIdentification;
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
	public ParameterAnnotations createParameterAnnotations() {
		ParameterAnnotationsImpl parameterAnnotations = new ParameterAnnotationsImpl();
		return parameterAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterannotationPackage getParameterannotationPackage() {
		return (ParameterannotationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParameterannotationPackage getPackage() {
		return ParameterannotationPackage.eINSTANCE;
	}

} //ParameterannotationFactoryImpl
