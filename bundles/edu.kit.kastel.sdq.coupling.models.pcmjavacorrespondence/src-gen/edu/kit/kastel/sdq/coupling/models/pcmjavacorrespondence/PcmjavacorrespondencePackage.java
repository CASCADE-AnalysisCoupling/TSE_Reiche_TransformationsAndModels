/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence;

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
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory
 * @model kind="package"
 * @generated
 */
public interface PcmjavacorrespondencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcmjavacorrespondence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pcmjavacorrespondence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcmjavacorrespondence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmjavacorrespondencePackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMJavaCorrespondenceRootImpl <em>PCM Java Correspondence Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMJavaCorrespondenceRootImpl
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getPCMJavaCorrespondenceRoot()
	 * @generated
	 */
	int PCM_JAVA_CORRESPONDENCE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Basiccomponent2class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_JAVA_CORRESPONDENCE_ROOT__BASICCOMPONENT2CLASS = 0;

	/**
	 * The feature id for the '<em><b>Operation Interface2interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_JAVA_CORRESPONDENCE_ROOT__OPERATION_INTERFACE2INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Compositedatatype2class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_JAVA_CORRESPONDENCE_ROOT__COMPOSITEDATATYPE2CLASS = 2;

	/**
	 * The feature id for the '<em><b>Providedoperationsignature2javamethod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_JAVA_CORRESPONDENCE_ROOT__PROVIDEDOPERATIONSIGNATURE2JAVAMETHOD = 3;

	/**
	 * The feature id for the '<em><b>Pcmparameter2javaparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_JAVA_CORRESPONDENCE_ROOT__PCMPARAMETER2JAVAPARAMETER = 4;

	/**
	 * The number of structural features of the '<em>PCM Java Correspondence Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_JAVA_CORRESPONDENCE_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>PCM Java Correspondence Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_JAVA_CORRESPONDENCE_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.BasicComponent2ClassImpl <em>Basic Component2 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.BasicComponent2ClassImpl
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getBasicComponent2Class()
	 * @generated
	 */
	int BASIC_COMPONENT2_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT2_CLASS__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT2_CLASS__JAVA_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Basic Component2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT2_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Basic Component2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT2_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.OperationInterface2InterfaceImpl <em>Operation Interface2 Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.OperationInterface2InterfaceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getOperationInterface2Interface()
	 * @generated
	 */
	int OPERATION_INTERFACE2_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Pcm Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE2_INTERFACE__PCM_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Java Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE2_INTERFACE__JAVA_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Operation Interface2 Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE2_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation Interface2 Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE2_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.CompositeDataType2ClassImpl <em>Composite Data Type2 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.CompositeDataType2ClassImpl
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getCompositeDataType2Class()
	 * @generated
	 */
	int COMPOSITE_DATA_TYPE2_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Composite Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE2_CLASS__COMPOSITE_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE2_CLASS__JAVA_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Composite Data Type2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE2_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Composite Data Type2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE2_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedOperationSignature2JavaMethodImpl <em>Provided Operation Signature2 Java Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedOperationSignature2JavaMethodImpl
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getProvidedOperationSignature2JavaMethod()
	 * @generated
	 */
	int PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD = 4;

	/**
	 * The feature id for the '<em><b>Pcm Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Java Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__JAVA_METHOD = 1;

	/**
	 * The number of structural features of the '<em>Provided Operation Signature2 Java Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Provided Operation Signature2 Java Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedSignatureImpl <em>Provided Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedSignatureImpl
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getProvidedSignature()
	 * @generated
	 */
	int PROVIDED_SIGNATURE = 5;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SIGNATURE__PROVIDED_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Provided Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SIGNATURE__PROVIDED_SIGNATURE = 1;

	/**
	 * The number of structural features of the '<em>Provided Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SIGNATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Provided Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedParameterIdentificationImpl <em>Provided Parameter Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedParameterIdentificationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getProvidedParameterIdentification()
	 * @generated
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Provided Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_SIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Provided Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Provided Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PARAMETER_IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMParameter2JavaParameterImpl <em>PCM Parameter2 Java Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMParameter2JavaParameterImpl
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getPCMParameter2JavaParameter()
	 * @generated
	 */
	int PCM_PARAMETER2_JAVA_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Pcm Parameter Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Java Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER2_JAVA_PARAMETER__JAVA_PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>PCM Parameter2 Java Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER2_JAVA_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PCM Parameter2 Java Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER2_JAVA_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot <em>PCM Java Correspondence Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Java Correspondence Root</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot
	 * @generated
	 */
	EClass getPCMJavaCorrespondenceRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getBasiccomponent2class <em>Basiccomponent2class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basiccomponent2class</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getBasiccomponent2class()
	 * @see #getPCMJavaCorrespondenceRoot()
	 * @generated
	 */
	EReference getPCMJavaCorrespondenceRoot_Basiccomponent2class();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getOperationInterface2interface <em>Operation Interface2interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Interface2interface</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getOperationInterface2interface()
	 * @see #getPCMJavaCorrespondenceRoot()
	 * @generated
	 */
	EReference getPCMJavaCorrespondenceRoot_OperationInterface2interface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getCompositedatatype2class <em>Compositedatatype2class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compositedatatype2class</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getCompositedatatype2class()
	 * @see #getPCMJavaCorrespondenceRoot()
	 * @generated
	 */
	EReference getPCMJavaCorrespondenceRoot_Compositedatatype2class();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getProvidedoperationsignature2javamethod <em>Providedoperationsignature2javamethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providedoperationsignature2javamethod</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getProvidedoperationsignature2javamethod()
	 * @see #getPCMJavaCorrespondenceRoot()
	 * @generated
	 */
	EReference getPCMJavaCorrespondenceRoot_Providedoperationsignature2javamethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getPcmparameter2javaparameter <em>Pcmparameter2javaparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcmparameter2javaparameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getPcmparameter2javaparameter()
	 * @see #getPCMJavaCorrespondenceRoot()
	 * @generated
	 */
	EReference getPCMJavaCorrespondenceRoot_Pcmparameter2javaparameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class <em>Basic Component2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Component2 Class</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class
	 * @generated
	 */
	EClass getBasicComponent2Class();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class#getComponent()
	 * @see #getBasicComponent2Class()
	 * @generated
	 */
	EReference getBasicComponent2Class_Component();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class#getJavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Class</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class#getJavaClass()
	 * @see #getBasicComponent2Class()
	 * @generated
	 */
	EReference getBasicComponent2Class_JavaClass();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface <em>Operation Interface2 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Interface2 Interface</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface
	 * @generated
	 */
	EClass getOperationInterface2Interface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface#getPcmInterface <em>Pcm Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pcm Interface</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface#getPcmInterface()
	 * @see #getOperationInterface2Interface()
	 * @generated
	 */
	EReference getOperationInterface2Interface_PcmInterface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface#getJavaInterface <em>Java Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Interface</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface#getJavaInterface()
	 * @see #getOperationInterface2Interface()
	 * @generated
	 */
	EReference getOperationInterface2Interface_JavaInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class <em>Composite Data Type2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Data Type2 Class</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class
	 * @generated
	 */
	EClass getCompositeDataType2Class();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class#getCompositeDataType <em>Composite Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composite Data Type</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class#getCompositeDataType()
	 * @see #getCompositeDataType2Class()
	 * @generated
	 */
	EReference getCompositeDataType2Class_CompositeDataType();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class#getJavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Class</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class#getJavaClass()
	 * @see #getCompositeDataType2Class()
	 * @generated
	 */
	EReference getCompositeDataType2Class_JavaClass();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod <em>Provided Operation Signature2 Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Operation Signature2 Java Method</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod
	 * @generated
	 */
	EClass getProvidedOperationSignature2JavaMethod();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod#getPcmMethod <em>Pcm Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pcm Method</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod#getPcmMethod()
	 * @see #getProvidedOperationSignature2JavaMethod()
	 * @generated
	 */
	EReference getProvidedOperationSignature2JavaMethod_PcmMethod();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod#getJavaMethod <em>Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Method</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod#getJavaMethod()
	 * @see #getProvidedOperationSignature2JavaMethod()
	 * @generated
	 */
	EReference getProvidedOperationSignature2JavaMethod_JavaMethod();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature <em>Provided Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Signature</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature
	 * @generated
	 */
	EClass getProvidedSignature();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature#getProvidedRole()
	 * @see #getProvidedSignature()
	 * @generated
	 */
	EReference getProvidedSignature_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature#getProvidedSignature <em>Provided Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Signature</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature#getProvidedSignature()
	 * @see #getProvidedSignature()
	 * @generated
	 */
	EReference getProvidedSignature_ProvidedSignature();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification <em>Provided Parameter Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Parameter Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification
	 * @generated
	 */
	EClass getProvidedParameterIdentification();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification#getProvidedSignature <em>Provided Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Signature</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification#getProvidedSignature()
	 * @see #getProvidedParameterIdentification()
	 * @generated
	 */
	EReference getProvidedParameterIdentification_ProvidedSignature();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification#getParameter()
	 * @see #getProvidedParameterIdentification()
	 * @generated
	 */
	EReference getProvidedParameterIdentification_Parameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter <em>PCM Parameter2 Java Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Parameter2 Java Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter
	 * @generated
	 */
	EClass getPCMParameter2JavaParameter();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter#getPcmParameterIdentification <em>Pcm Parameter Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pcm Parameter Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter#getPcmParameterIdentification()
	 * @see #getPCMParameter2JavaParameter()
	 * @generated
	 */
	EReference getPCMParameter2JavaParameter_PcmParameterIdentification();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter#getJavaParameter <em>Java Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter#getJavaParameter()
	 * @see #getPCMParameter2JavaParameter()
	 * @generated
	 */
	EReference getPCMParameter2JavaParameter_JavaParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcmjavacorrespondenceFactory getPcmjavacorrespondenceFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMJavaCorrespondenceRootImpl <em>PCM Java Correspondence Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMJavaCorrespondenceRootImpl
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getPCMJavaCorrespondenceRoot()
		 * @generated
		 */
		EClass PCM_JAVA_CORRESPONDENCE_ROOT = eINSTANCE.getPCMJavaCorrespondenceRoot();

		/**
		 * The meta object literal for the '<em><b>Basiccomponent2class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_JAVA_CORRESPONDENCE_ROOT__BASICCOMPONENT2CLASS = eINSTANCE
				.getPCMJavaCorrespondenceRoot_Basiccomponent2class();

		/**
		 * The meta object literal for the '<em><b>Operation Interface2interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_JAVA_CORRESPONDENCE_ROOT__OPERATION_INTERFACE2INTERFACE = eINSTANCE
				.getPCMJavaCorrespondenceRoot_OperationInterface2interface();

		/**
		 * The meta object literal for the '<em><b>Compositedatatype2class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_JAVA_CORRESPONDENCE_ROOT__COMPOSITEDATATYPE2CLASS = eINSTANCE
				.getPCMJavaCorrespondenceRoot_Compositedatatype2class();

		/**
		 * The meta object literal for the '<em><b>Providedoperationsignature2javamethod</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_JAVA_CORRESPONDENCE_ROOT__PROVIDEDOPERATIONSIGNATURE2JAVAMETHOD = eINSTANCE
				.getPCMJavaCorrespondenceRoot_Providedoperationsignature2javamethod();

		/**
		 * The meta object literal for the '<em><b>Pcmparameter2javaparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_JAVA_CORRESPONDENCE_ROOT__PCMPARAMETER2JAVAPARAMETER = eINSTANCE
				.getPCMJavaCorrespondenceRoot_Pcmparameter2javaparameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.BasicComponent2ClassImpl <em>Basic Component2 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.BasicComponent2ClassImpl
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getBasicComponent2Class()
		 * @generated
		 */
		EClass BASIC_COMPONENT2_CLASS = eINSTANCE.getBasicComponent2Class();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_COMPONENT2_CLASS__COMPONENT = eINSTANCE.getBasicComponent2Class_Component();

		/**
		 * The meta object literal for the '<em><b>Java Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_COMPONENT2_CLASS__JAVA_CLASS = eINSTANCE.getBasicComponent2Class_JavaClass();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.OperationInterface2InterfaceImpl <em>Operation Interface2 Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.OperationInterface2InterfaceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getOperationInterface2Interface()
		 * @generated
		 */
		EClass OPERATION_INTERFACE2_INTERFACE = eINSTANCE.getOperationInterface2Interface();

		/**
		 * The meta object literal for the '<em><b>Pcm Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INTERFACE2_INTERFACE__PCM_INTERFACE = eINSTANCE
				.getOperationInterface2Interface_PcmInterface();

		/**
		 * The meta object literal for the '<em><b>Java Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INTERFACE2_INTERFACE__JAVA_INTERFACE = eINSTANCE
				.getOperationInterface2Interface_JavaInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.CompositeDataType2ClassImpl <em>Composite Data Type2 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.CompositeDataType2ClassImpl
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getCompositeDataType2Class()
		 * @generated
		 */
		EClass COMPOSITE_DATA_TYPE2_CLASS = eINSTANCE.getCompositeDataType2Class();

		/**
		 * The meta object literal for the '<em><b>Composite Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_TYPE2_CLASS__COMPOSITE_DATA_TYPE = eINSTANCE
				.getCompositeDataType2Class_CompositeDataType();

		/**
		 * The meta object literal for the '<em><b>Java Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_TYPE2_CLASS__JAVA_CLASS = eINSTANCE.getCompositeDataType2Class_JavaClass();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedOperationSignature2JavaMethodImpl <em>Provided Operation Signature2 Java Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedOperationSignature2JavaMethodImpl
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getProvidedOperationSignature2JavaMethod()
		 * @generated
		 */
		EClass PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD = eINSTANCE.getProvidedOperationSignature2JavaMethod();

		/**
		 * The meta object literal for the '<em><b>Pcm Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD = eINSTANCE
				.getProvidedOperationSignature2JavaMethod_PcmMethod();

		/**
		 * The meta object literal for the '<em><b>Java Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__JAVA_METHOD = eINSTANCE
				.getProvidedOperationSignature2JavaMethod_JavaMethod();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedSignatureImpl <em>Provided Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedSignatureImpl
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getProvidedSignature()
		 * @generated
		 */
		EClass PROVIDED_SIGNATURE = eINSTANCE.getProvidedSignature();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_SIGNATURE__PROVIDED_ROLE = eINSTANCE.getProvidedSignature_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Provided Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_SIGNATURE__PROVIDED_SIGNATURE = eINSTANCE.getProvidedSignature_ProvidedSignature();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedParameterIdentificationImpl <em>Provided Parameter Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.ProvidedParameterIdentificationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getProvidedParameterIdentification()
		 * @generated
		 */
		EClass PROVIDED_PARAMETER_IDENTIFICATION = eINSTANCE.getProvidedParameterIdentification();

		/**
		 * The meta object literal for the '<em><b>Provided Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_SIGNATURE = eINSTANCE
				.getProvidedParameterIdentification_ProvidedSignature();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER = eINSTANCE
				.getProvidedParameterIdentification_Parameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMParameter2JavaParameterImpl <em>PCM Parameter2 Java Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMParameter2JavaParameterImpl
		 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PcmjavacorrespondencePackageImpl#getPCMParameter2JavaParameter()
		 * @generated
		 */
		EClass PCM_PARAMETER2_JAVA_PARAMETER = eINSTANCE.getPCMParameter2JavaParameter();

		/**
		 * The meta object literal for the '<em><b>Pcm Parameter Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION = eINSTANCE
				.getPCMParameter2JavaParameter_PcmParameterIdentification();

		/**
		 * The meta object literal for the '<em><b>Java Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_PARAMETER2_JAVA_PARAMETER__JAVA_PARAMETER = eINSTANCE
				.getPCMParameter2JavaParameter_JavaParameter();

	}

} //PcmjavacorrespondencePackage
