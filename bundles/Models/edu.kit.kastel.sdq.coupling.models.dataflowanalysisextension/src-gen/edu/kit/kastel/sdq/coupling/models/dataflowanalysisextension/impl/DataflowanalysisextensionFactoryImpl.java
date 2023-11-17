/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.*;

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
public class DataflowanalysisextensionFactoryImpl extends EFactoryImpl implements DataflowanalysisextensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataflowanalysisextensionFactory init() {
		try {
			DataflowanalysisextensionFactory theDataflowanalysisextensionFactory = (DataflowanalysisextensionFactory) EPackage.Registry.INSTANCE
					.getEFactory(DataflowanalysisextensionPackage.eNS_URI);
			if (theDataflowanalysisextensionFactory != null) {
				return theDataflowanalysisextensionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataflowanalysisextensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataflowanalysisextensionFactoryImpl() {
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
		case DataflowanalysisextensionPackage.PROVIDED_OPERATION_IDENTIFICATION:
			return createProvidedOperationIdentification();
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_IDENTIFICATION:
			return createProvidedParameterIdentification();
		case DataflowanalysisextensionPackage.PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION:
			return createProvidedParameterCharacteristicAnnotation();
		case DataflowanalysisextensionPackage.EXTENSION_ROOT:
			return createExtensionRoot();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedOperationIdentification createProvidedOperationIdentification() {
		ProvidedOperationIdentificationImpl providedOperationIdentification = new ProvidedOperationIdentificationImpl();
		return providedOperationIdentification;
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
	public ProvidedParameterCharacteristicAnnotation createProvidedParameterCharacteristicAnnotation() {
		ProvidedParameterCharacteristicAnnotationImpl providedParameterCharacteristicAnnotation = new ProvidedParameterCharacteristicAnnotationImpl();
		return providedParameterCharacteristicAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionRoot createExtensionRoot() {
		ExtensionRootImpl extensionRoot = new ExtensionRootImpl();
		return extensionRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataflowanalysisextensionPackage getDataflowanalysisextensionPackage() {
		return (DataflowanalysisextensionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataflowanalysisextensionPackage getPackage() {
		return DataflowanalysisextensionPackage.eINSTANCE;
	}

} //DataflowanalysisextensionFactoryImpl
