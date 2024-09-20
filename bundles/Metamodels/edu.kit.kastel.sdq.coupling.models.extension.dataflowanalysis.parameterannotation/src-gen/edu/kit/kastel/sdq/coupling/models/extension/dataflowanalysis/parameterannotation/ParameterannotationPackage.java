/**
 */
package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation;

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
 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterannotationFactory
 * @model kind="package"
 * @generated
 */
public interface ParameterannotationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parameterannotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/parameterannotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parameterannotation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterannotationPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.CharacteristicsAnnotationImpl <em>Characteristics Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.CharacteristicsAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getCharacteristicsAnnotation()
	 * @generated
	 */
	int CHARACTERISTICS_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_ANNOTATION__CHARACTERISTICS = 0;

	/**
	 * The number of structural features of the '<em>Characteristics Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Characteristics Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ProvidedOperationIdentificationImpl <em>Provided Operation Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ProvidedOperationIdentificationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getProvidedOperationIdentification()
	 * @generated
	 */
	int PROVIDED_OPERATION_IDENTIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Provided Operation Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_IDENTIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Provided Operation Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.GeneralOperationParameterIdentificationImpl <em>General Operation Parameter Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.GeneralOperationParameterIdentificationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getGeneralOperationParameterIdentification()
	 * @generated
	 */
	int GENERAL_OPERATION_PARAMETER_IDENTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>General Operation Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_PARAMETER_IDENTIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>General Operation Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_PARAMETER_IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ProvidedOperationParameterIdentificationImpl <em>Provided Operation Parameter Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ProvidedOperationParameterIdentificationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getProvidedOperationParameterIdentification()
	 * @generated
	 */
	int PROVIDED_OPERATION_PARAMETER_IDENTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE = GENERAL_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER = GENERAL_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__PROVIDED_ROLE = GENERAL_OPERATION_PARAMETER_IDENTIFICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Provided Operation Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_PARAMETER_IDENTIFICATION_FEATURE_COUNT = GENERAL_OPERATION_PARAMETER_IDENTIFICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>Provided Operation Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_PARAMETER_IDENTIFICATION_OPERATION_COUNT = GENERAL_OPERATION_PARAMETER_IDENTIFICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterAnnotationImpl <em>Parameter Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getParameterAnnotation()
	 * @generated
	 */
	int PARAMETER_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATION__CHARACTERISTICS = CHARACTERISTICS_ANNOTATION__CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATION__ID = CHARACTERISTICS_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION = CHARACTERISTICS_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATION_FEATURE_COUNT = CHARACTERISTICS_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATION_OPERATION_COUNT = CHARACTERISTICS_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterAnnotationsImpl <em>Parameter Annotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterAnnotationsImpl
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getParameterAnnotations()
	 * @generated
	 */
	int PARAMETER_ANNOTATIONS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATIONS__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATIONS__ANNOTATIONS = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATIONS_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANNOTATIONS_OPERATION_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.CharacteristicsAnnotation <em>Characteristics Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristics Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.CharacteristicsAnnotation
	 * @generated
	 */
	EClass getCharacteristicsAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.CharacteristicsAnnotation#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristics</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.CharacteristicsAnnotation#getCharacteristics()
	 * @see #getCharacteristicsAnnotation()
	 * @generated
	 */
	EReference getCharacteristicsAnnotation_Characteristics();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationIdentification <em>Provided Operation Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Operation Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationIdentification
	 * @generated
	 */
	EClass getProvidedOperationIdentification();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification <em>General Operation Parameter Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Operation Parameter Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification
	 * @generated
	 */
	EClass getGeneralOperationParameterIdentification();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification#getOperationSignature <em>Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Signature</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification#getOperationSignature()
	 * @see #getGeneralOperationParameterIdentification()
	 * @generated
	 */
	EReference getGeneralOperationParameterIdentification_OperationSignature();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification#getParameter()
	 * @see #getGeneralOperationParameterIdentification()
	 * @generated
	 */
	EReference getGeneralOperationParameterIdentification_Parameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification <em>Provided Operation Parameter Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Operation Parameter Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification
	 * @generated
	 */
	EClass getProvidedOperationParameterIdentification();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification#getProvidedRole()
	 * @see #getProvidedOperationParameterIdentification()
	 * @generated
	 */
	EReference getProvidedOperationParameterIdentification_ProvidedRole();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation <em>Parameter Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation
	 * @generated
	 */
	EClass getParameterAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation#getParameterIdentification <em>Parameter Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation#getParameterIdentification()
	 * @see #getParameterAnnotation()
	 * @generated
	 */
	EReference getParameterAnnotation_ParameterIdentification();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations <em>Parameter Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Annotations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations
	 * @generated
	 */
	EClass getParameterAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations#getAnnotations()
	 * @see #getParameterAnnotations()
	 * @generated
	 */
	EReference getParameterAnnotations_Annotations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParameterannotationFactory getParameterannotationFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.CharacteristicsAnnotationImpl <em>Characteristics Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.CharacteristicsAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getCharacteristicsAnnotation()
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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ProvidedOperationIdentificationImpl <em>Provided Operation Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ProvidedOperationIdentificationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getProvidedOperationIdentification()
		 * @generated
		 */
		EClass PROVIDED_OPERATION_IDENTIFICATION = eINSTANCE.getProvidedOperationIdentification();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.GeneralOperationParameterIdentificationImpl <em>General Operation Parameter Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.GeneralOperationParameterIdentificationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getGeneralOperationParameterIdentification()
		 * @generated
		 */
		EClass GENERAL_OPERATION_PARAMETER_IDENTIFICATION = eINSTANCE.getGeneralOperationParameterIdentification();

		/**
		 * The meta object literal for the '<em><b>Operation Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_OPERATION_PARAMETER_IDENTIFICATION__OPERATION_SIGNATURE = eINSTANCE
				.getGeneralOperationParameterIdentification_OperationSignature();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_OPERATION_PARAMETER_IDENTIFICATION__PARAMETER = eINSTANCE
				.getGeneralOperationParameterIdentification_Parameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ProvidedOperationParameterIdentificationImpl <em>Provided Operation Parameter Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ProvidedOperationParameterIdentificationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getProvidedOperationParameterIdentification()
		 * @generated
		 */
		EClass PROVIDED_OPERATION_PARAMETER_IDENTIFICATION = eINSTANCE.getProvidedOperationParameterIdentification();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_OPERATION_PARAMETER_IDENTIFICATION__PROVIDED_ROLE = eINSTANCE
				.getProvidedOperationParameterIdentification_ProvidedRole();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterAnnotationImpl <em>Parameter Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getParameterAnnotation()
		 * @generated
		 */
		EClass PARAMETER_ANNOTATION = eINSTANCE.getParameterAnnotation();

		/**
		 * The meta object literal for the '<em><b>Parameter Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_ANNOTATION__PARAMETER_IDENTIFICATION = eINSTANCE
				.getParameterAnnotation_ParameterIdentification();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterAnnotationsImpl <em>Parameter Annotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterAnnotationsImpl
		 * @see edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.impl.ParameterannotationPackageImpl#getParameterAnnotations()
		 * @generated
		 */
		EClass PARAMETER_ANNOTATIONS = eINSTANCE.getParameterAnnotations();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_ANNOTATIONS__ANNOTATIONS = eINSTANCE.getParameterAnnotations_Annotations();

	}

} //ParameterannotationPackage
