/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations;

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
 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AccessanalysisannotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accessanalysisannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/accessanalysisannotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accessanalysisannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessanalysisannotationsPackage eINSTANCE = edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowAnnotationImpl <em>Information Flow Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getInformationFlowAnnotation()
	 * @generated
	 */
	int INFORMATION_FLOW_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Data Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_ANNOTATION__DATA_TARGETS = 0;

	/**
	 * The number of structural features of the '<em>Information Flow Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Information Flow Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowOperationSignatureAnnotationImpl <em>Information Flow Operation Signature Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowOperationSignatureAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getInformationFlowOperationSignatureAnnotation()
	 * @generated
	 */
	int INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Data Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__DATA_TARGETS = INFORMATION_FLOW_ANNOTATION__DATA_TARGETS;

	/**
	 * The feature id for the '<em><b>Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE = INFORMATION_FLOW_ANNOTATION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Information Flow Operation Signature Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION_FEATURE_COUNT = INFORMATION_FLOW_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Information Flow Operation Signature Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION_OPERATION_COUNT = INFORMATION_FLOW_ANNOTATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowCallAnnotationImpl <em>Information Flow Call Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowCallAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getInformationFlowCallAnnotation()
	 * @generated
	 */
	int INFORMATION_FLOW_CALL_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Data Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_CALL_ANNOTATION__DATA_TARGETS = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__DATA_TARGETS;

	/**
	 * The feature id for the '<em><b>Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_CALL_ANNOTATION__OPERATION_SIGNATURE = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE;

	/**
	 * The number of structural features of the '<em>Information Flow Call Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_CALL_ANNOTATION_FEATURE_COUNT = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of operations of the '<em>Information Flow Call Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_CALL_ANNOTATION_OPERATION_COUNT = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowReturnAnnotationImpl <em>Information Flow Return Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowReturnAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getInformationFlowReturnAnnotation()
	 * @generated
	 */
	int INFORMATION_FLOW_RETURN_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Data Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_RETURN_ANNOTATION__DATA_TARGETS = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__DATA_TARGETS;

	/**
	 * The feature id for the '<em><b>Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_RETURN_ANNOTATION__OPERATION_SIGNATURE = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE;

	/**
	 * The number of structural features of the '<em>Information Flow Return Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_RETURN_ANNOTATION_FEATURE_COUNT = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of operations of the '<em>Information Flow Return Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_RETURN_ANNOTATION_OPERATION_COUNT = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowParameterAnnotationImpl <em>Information Flow Parameter Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowParameterAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getInformationFlowParameterAnnotation()
	 * @generated
	 */
	int INFORMATION_FLOW_PARAMETER_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Data Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_PARAMETER_ANNOTATION__DATA_TARGETS = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__DATA_TARGETS;

	/**
	 * The feature id for the '<em><b>Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_PARAMETER_ANNOTATION__OPERATION_SIGNATURE = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_PARAMETER_ANNOTATION__PARAMETER = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Information Flow Parameter Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_PARAMETER_ANNOTATION_FEATURE_COUNT = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION_FEATURE_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>Information Flow Parameter Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_PARAMETER_ANNOTATION_OPERATION_COUNT = INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AnnotationsImpl <em>Annotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AnnotationsImpl
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getAnnotations()
	 * @generated
	 */
	int ANNOTATIONS = 5;

	/**
	 * The feature id for the '<em><b>Information Flow Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__INFORMATION_FLOW_ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation <em>Information Flow Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation
	 * @generated
	 */
	EClass getInformationFlowAnnotation();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation#getDataTargets <em>Data Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Targets</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation#getDataTargets()
	 * @see #getInformationFlowAnnotation()
	 * @generated
	 */
	EReference getInformationFlowAnnotation_DataTargets();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowOperationSignatureAnnotation <em>Information Flow Operation Signature Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow Operation Signature Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowOperationSignatureAnnotation
	 * @generated
	 */
	EClass getInformationFlowOperationSignatureAnnotation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowOperationSignatureAnnotation#getOperationSignature <em>Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Signature</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowOperationSignatureAnnotation#getOperationSignature()
	 * @see #getInformationFlowOperationSignatureAnnotation()
	 * @generated
	 */
	EReference getInformationFlowOperationSignatureAnnotation_OperationSignature();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowCallAnnotation <em>Information Flow Call Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow Call Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowCallAnnotation
	 * @generated
	 */
	EClass getInformationFlowCallAnnotation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowReturnAnnotation <em>Information Flow Return Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow Return Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowReturnAnnotation
	 * @generated
	 */
	EClass getInformationFlowReturnAnnotation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowParameterAnnotation <em>Information Flow Parameter Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow Parameter Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowParameterAnnotation
	 * @generated
	 */
	EClass getInformationFlowParameterAnnotation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowParameterAnnotation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowParameterAnnotation#getParameter()
	 * @see #getInformationFlowParameterAnnotation()
	 * @generated
	 */
	EReference getInformationFlowParameterAnnotation_Parameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations
	 * @generated
	 */
	EClass getAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations#getInformationFlowAnnotations <em>Information Flow Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information Flow Annotations</em>'.
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations#getInformationFlowAnnotations()
	 * @see #getAnnotations()
	 * @generated
	 */
	EReference getAnnotations_InformationFlowAnnotations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccessanalysisannotationsFactory getAccessanalysisannotationsFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowAnnotationImpl <em>Information Flow Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getInformationFlowAnnotation()
		 * @generated
		 */
		EClass INFORMATION_FLOW_ANNOTATION = eINSTANCE.getInformationFlowAnnotation();

		/**
		 * The meta object literal for the '<em><b>Data Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW_ANNOTATION__DATA_TARGETS = eINSTANCE.getInformationFlowAnnotation_DataTargets();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowOperationSignatureAnnotationImpl <em>Information Flow Operation Signature Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowOperationSignatureAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getInformationFlowOperationSignatureAnnotation()
		 * @generated
		 */
		EClass INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION = eINSTANCE
				.getInformationFlowOperationSignatureAnnotation();

		/**
		 * The meta object literal for the '<em><b>Operation Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE = eINSTANCE
				.getInformationFlowOperationSignatureAnnotation_OperationSignature();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowCallAnnotationImpl <em>Information Flow Call Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowCallAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getInformationFlowCallAnnotation()
		 * @generated
		 */
		EClass INFORMATION_FLOW_CALL_ANNOTATION = eINSTANCE.getInformationFlowCallAnnotation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowReturnAnnotationImpl <em>Information Flow Return Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowReturnAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getInformationFlowReturnAnnotation()
		 * @generated
		 */
		EClass INFORMATION_FLOW_RETURN_ANNOTATION = eINSTANCE.getInformationFlowReturnAnnotation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowParameterAnnotationImpl <em>Information Flow Parameter Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.InformationFlowParameterAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getInformationFlowParameterAnnotation()
		 * @generated
		 */
		EClass INFORMATION_FLOW_PARAMETER_ANNOTATION = eINSTANCE.getInformationFlowParameterAnnotation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW_PARAMETER_ANNOTATION__PARAMETER = eINSTANCE
				.getInformationFlowParameterAnnotation_Parameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AnnotationsImpl <em>Annotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AnnotationsImpl
		 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl.AccessanalysisannotationsPackageImpl#getAnnotations()
		 * @generated
		 */
		EClass ANNOTATIONS = eINSTANCE.getAnnotations();

		/**
		 * The meta object literal for the '<em><b>Information Flow Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATIONS__INFORMATION_FLOW_ANNOTATIONS = eINSTANCE.getAnnotations_InformationFlowAnnotations();

	}

} //AccessanalysisannotationsPackage
