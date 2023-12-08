/**
 */
package edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension;

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
 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.DataflowanalysisextensionFactory
 * @model kind="package"
 * @generated
 */
public interface DataflowanalysisextensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataflowanalysisextension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dataflowanalysisextension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataflowanalysisextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataflowanalysisextensionPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedOperationIdentificationImpl <em>Provided Operation Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedOperationIdentificationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl#getProvidedOperationIdentification()
	 * @generated
	 */
	int PROVIDED_OPERATION_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_IDENTIFICATION__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_IDENTIFICATION__PROVIDED_ROLE = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_IDENTIFICATION__OPERATION_SIGNATURE = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provided Operation Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_IDENTIFICATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provided Operation Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_IDENTIFICATION_OPERATION_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterIdentificationImpl <em>Provided Parameter Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterIdentificationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl#getProvidedParameterIdentification()
	 * @generated
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provided Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provided Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION_OPERATION_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterCharacteristicAnnotationImpl <em>Provided Parameter Characteristic Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterCharacteristicAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl#getProvidedParameterCharacteristicAnnotation()
	 * @generated
	 */
	int PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__CHARACTERISTICS = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Provided Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__PROVIDED_PARAMETER = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Provided Parameter Characteristic Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Provided Parameter Characteristic Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION_OPERATION_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.CharacteristicsAnnotationImpl <em>Characteristics Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.CharacteristicsAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl#getCharacteristicsAnnotation()
	 * @generated
	 */
	int CHARACTERISTICS_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_ANNOTATION__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_ANNOTATION__CHARACTERISTICS = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characteristics Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_ANNOTATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Characteristics Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_ANNOTATION_OPERATION_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ExtensionRootImpl <em>Extension Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ExtensionRootImpl
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl#getExtensionRoot()
	 * @generated
	 */
	int EXTENSION_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ROOT__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Parameter Identification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ROOT__PROVIDED_PARAMETER_IDENTIFICATION = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ROOT__PARAMETER_ANNOTATIONS = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ROOT_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extension Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ROOT_OPERATION_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification <em>Provided Operation Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Operation Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification
	 * @generated
	 */
	EClass getProvidedOperationIdentification();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification#getProvidedRole()
	 * @see #getProvidedOperationIdentification()
	 * @generated
	 */
	EReference getProvidedOperationIdentification_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification#getOperationSignature <em>Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Signature</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedOperationIdentification#getOperationSignature()
	 * @see #getProvidedOperationIdentification()
	 * @generated
	 */
	EReference getProvidedOperationIdentification_OperationSignature();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification <em>Provided Parameter Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Parameter Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification
	 * @generated
	 */
	EClass getProvidedParameterIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification#getProvidedOperation <em>Provided Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Operation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification#getProvidedOperation()
	 * @see #getProvidedParameterIdentification()
	 * @generated
	 */
	EReference getProvidedParameterIdentification_ProvidedOperation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification#getParameter()
	 * @see #getProvidedParameterIdentification()
	 * @generated
	 */
	EReference getProvidedParameterIdentification_Parameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation <em>Provided Parameter Characteristic Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Parameter Characteristic Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation
	 * @generated
	 */
	EClass getProvidedParameterCharacteristicAnnotation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation#getProvidedParameter <em>Provided Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation#getProvidedParameter()
	 * @see #getProvidedParameterCharacteristicAnnotation()
	 * @generated
	 */
	EReference getProvidedParameterCharacteristicAnnotation_ProvidedParameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.CharacteristicsAnnotation <em>Characteristics Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristics Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.CharacteristicsAnnotation
	 * @generated
	 */
	EClass getCharacteristicsAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.CharacteristicsAnnotation#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristics</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.CharacteristicsAnnotation#getCharacteristics()
	 * @see #getCharacteristicsAnnotation()
	 * @generated
	 */
	EReference getCharacteristicsAnnotation_Characteristics();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot <em>Extension Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Root</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot
	 * @generated
	 */
	EClass getExtensionRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot#getProvidedParameterIdentification <em>Provided Parameter Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Parameter Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot#getProvidedParameterIdentification()
	 * @see #getExtensionRoot()
	 * @generated
	 */
	EReference getExtensionRoot_ProvidedParameterIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot#getParameterAnnotations <em>Parameter Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Annotations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot#getParameterAnnotations()
	 * @see #getExtensionRoot()
	 * @generated
	 */
	EReference getExtensionRoot_ParameterAnnotations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataflowanalysisextensionFactory getDataflowanalysisextensionFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedOperationIdentificationImpl <em>Provided Operation Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedOperationIdentificationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl#getProvidedOperationIdentification()
		 * @generated
		 */
		EClass PROVIDED_OPERATION_IDENTIFICATION = eINSTANCE.getProvidedOperationIdentification();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_OPERATION_IDENTIFICATION__PROVIDED_ROLE = eINSTANCE
				.getProvidedOperationIdentification_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Operation Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_OPERATION_IDENTIFICATION__OPERATION_SIGNATURE = eINSTANCE
				.getProvidedOperationIdentification_OperationSignature();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterIdentificationImpl <em>Provided Parameter Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterIdentificationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl#getProvidedParameterIdentification()
		 * @generated
		 */
		EClass PROVIDED_PARAMETER_IDENTIFICATION = eINSTANCE.getProvidedParameterIdentification();

		/**
		 * The meta object literal for the '<em><b>Provided Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_OPERATION = eINSTANCE
				.getProvidedParameterIdentification_ProvidedOperation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER = eINSTANCE
				.getProvidedParameterIdentification_Parameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterCharacteristicAnnotationImpl <em>Provided Parameter Characteristic Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ProvidedParameterCharacteristicAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl#getProvidedParameterCharacteristicAnnotation()
		 * @generated
		 */
		EClass PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION = eINSTANCE.getProvidedParameterCharacteristicAnnotation();

		/**
		 * The meta object literal for the '<em><b>Provided Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_PARAMETER_CHARACTERISTIC_ANNOTATION__PROVIDED_PARAMETER = eINSTANCE
				.getProvidedParameterCharacteristicAnnotation_ProvidedParameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.CharacteristicsAnnotationImpl <em>Characteristics Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.CharacteristicsAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl#getCharacteristicsAnnotation()
		 * @generated
		 */
		EClass CHARACTERISTICS_ANNOTATION = eINSTANCE.getCharacteristicsAnnotation();

		/**
		 * The meta object literal for the '<em><b>Characteristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTICS_ANNOTATION__CHARACTERISTICS = eINSTANCE
				.getCharacteristicsAnnotation_Characteristics();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ExtensionRootImpl <em>Extension Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.ExtensionRootImpl
		 * @see edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.impl.DataflowanalysisextensionPackageImpl#getExtensionRoot()
		 * @generated
		 */
		EClass EXTENSION_ROOT = eINSTANCE.getExtensionRoot();

		/**
		 * The meta object literal for the '<em><b>Provided Parameter Identification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_ROOT__PROVIDED_PARAMETER_IDENTIFICATION = eINSTANCE
				.getExtensionRoot_ProvidedParameterIdentification();

		/**
		 * The meta object literal for the '<em><b>Parameter Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_ROOT__PARAMETER_ANNOTATIONS = eINSTANCE.getExtensionRoot_ParameterAnnotations();

	}

} //DataflowanalysisextensionPackage
