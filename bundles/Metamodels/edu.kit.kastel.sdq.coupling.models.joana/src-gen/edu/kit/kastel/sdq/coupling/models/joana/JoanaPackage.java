/**
 */
package edu.kit.kastel.sdq.coupling.models.joana;

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
 * @see edu.kit.kastel.sdq.coupling.models.joana.JoanaFactory
 * @model kind="package"
 * @generated
 */
public interface JoanaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "joana";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/joana";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "joana";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanaPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.JOANARootImpl <em>JOANA Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JOANARootImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getJOANARoot()
	 * @generated
	 */
	int JOANA_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_ROOT__ENTRYPOINT = 0;

	/**
	 * The number of structural features of the '<em>JOANA Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>JOANA Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.InformationFlowAnnotationImpl <em>Information Flow Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.InformationFlowAnnotationImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getInformationFlowAnnotation()
	 * @generated
	 */
	int INFORMATION_FLOW_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_ANNOTATION__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>System Element Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Information Flow Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information Flow Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.EntryPointImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ID = IdentifierPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__LEVEL = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ANNOTATION = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lattice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__LATTICE = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__METHOD_IDENTIFICATION = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_OPERATION_COUNT = IdentifierPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.SourceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LEVEL = INFORMATION_FLOW_ANNOTATION__LEVEL;

	/**
	 * The feature id for the '<em><b>System Element Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SYSTEM_ELEMENT_IDENTIFICATION = INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = INFORMATION_FLOW_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = INFORMATION_FLOW_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.SinkImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 4;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__LEVEL = INFORMATION_FLOW_ANNOTATION__LEVEL;

	/**
	 * The feature id for the '<em><b>System Element Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__SYSTEM_ELEMENT_IDENTIFICATION = INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = INFORMATION_FLOW_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_OPERATION_COUNT = INFORMATION_FLOW_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.LevelImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NAME = IdentifierPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.MayFlowImpl <em>May Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.MayFlowImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getMayFlow()
	 * @generated
	 */
	int MAY_FLOW = 6;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAY_FLOW__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAY_FLOW__TO = 1;

	/**
	 * The number of structural features of the '<em>May Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAY_FLOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>May Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAY_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.LatticeImpl <em>Lattice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.LatticeImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getLattice()
	 * @generated
	 */
	int LATTICE = 7;

	/**
	 * The feature id for the '<em><b>May Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE__MAY_FLOW = 0;

	/**
	 * The number of structural features of the '<em>Lattice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lattice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.SystemElementIdentifyingImpl <em>System Element Identifying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.SystemElementIdentifyingImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getSystemElementIdentifying()
	 * @generated
	 */
	int SYSTEM_ELEMENT_IDENTIFYING = 8;

	/**
	 * The number of structural features of the '<em>System Element Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_IDENTIFYING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Element Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_IDENTIFYING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.ParametertIdentifyingImpl <em>Parametert Identifying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.ParametertIdentifyingImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getParametertIdentifying()
	 * @generated
	 */
	int PARAMETERT_IDENTIFYING = 9;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERT_IDENTIFYING__PARAMETER = SYSTEM_ELEMENT_IDENTIFYING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parametert Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERT_IDENTIFYING_FEATURE_COUNT = SYSTEM_ELEMENT_IDENTIFYING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parametert Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERT_IDENTIFYING_OPERATION_COUNT = SYSTEM_ELEMENT_IDENTIFYING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.MethodIdentifyingImpl <em>Method Identifying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.MethodIdentifyingImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getMethodIdentifying()
	 * @generated
	 */
	int METHOD_IDENTIFYING = 10;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_IDENTIFYING__METHOD = SYSTEM_ELEMENT_IDENTIFYING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_IDENTIFYING_FEATURE_COUNT = SYSTEM_ELEMENT_IDENTIFYING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_IDENTIFYING_OPERATION_COUNT = SYSTEM_ELEMENT_IDENTIFYING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.FieldIdentifyingImpl <em>Field Identifying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.FieldIdentifyingImpl
	 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getFieldIdentifying()
	 * @generated
	 */
	int FIELD_IDENTIFYING = 11;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFYING__FIELD = SYSTEM_ELEMENT_IDENTIFYING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFYING_FEATURE_COUNT = SYSTEM_ELEMENT_IDENTIFYING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_IDENTIFYING_OPERATION_COUNT = SYSTEM_ELEMENT_IDENTIFYING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.JOANARoot <em>JOANA Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JOANA Root</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JOANARoot
	 * @generated
	 */
	EClass getJOANARoot();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joana.JOANARoot#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entrypoint</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.JOANARoot#getEntrypoint()
	 * @see #getJOANARoot()
	 * @generated
	 */
	EReference getJOANARoot_Entrypoint();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation <em>Information Flow Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation
	 * @generated
	 */
	EClass getInformationFlowAnnotation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation#getLevel()
	 * @see #getInformationFlowAnnotation()
	 * @generated
	 */
	EReference getInformationFlowAnnotation_Level();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation#getSystemElementIdentification <em>System Element Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Element Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation#getSystemElementIdentification()
	 * @see #getInformationFlowAnnotation()
	 * @generated
	 */
	EReference getInformationFlowAnnotation_SystemElementIdentification();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getLevel()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getAnnotation()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getLattice <em>Lattice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lattice</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getLattice()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_Lattice();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getMethodIdentification <em>Method Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Identification</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.EntryPoint#getMethodIdentification()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_MethodIdentification();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.MayFlow <em>May Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>May Flow</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.MayFlow
	 * @generated
	 */
	EClass getMayFlow();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joana.MayFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.MayFlow#getFrom()
	 * @see #getMayFlow()
	 * @generated
	 */
	EReference getMayFlow_From();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joana.MayFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.MayFlow#getTo()
	 * @see #getMayFlow()
	 * @generated
	 */
	EReference getMayFlow_To();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.Lattice <em>Lattice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lattice</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.Lattice
	 * @generated
	 */
	EClass getLattice();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.joana.Lattice#getMayFlow <em>May Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>May Flow</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.Lattice#getMayFlow()
	 * @see #getLattice()
	 * @generated
	 */
	EReference getLattice_MayFlow();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.SystemElementIdentifying <em>System Element Identifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element Identifying</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.SystemElementIdentifying
	 * @generated
	 */
	EClass getSystemElementIdentifying();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.ParametertIdentifying <em>Parametert Identifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametert Identifying</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.ParametertIdentifying
	 * @generated
	 */
	EClass getParametertIdentifying();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joana.ParametertIdentifying#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.ParametertIdentifying#getParameter()
	 * @see #getParametertIdentifying()
	 * @generated
	 */
	EReference getParametertIdentifying_Parameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying <em>Method Identifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Identifying</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying
	 * @generated
	 */
	EClass getMethodIdentifying();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying#getMethod()
	 * @see #getMethodIdentifying()
	 * @generated
	 */
	EReference getMethodIdentifying_Method();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.joana.FieldIdentifying <em>Field Identifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Identifying</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.FieldIdentifying
	 * @generated
	 */
	EClass getFieldIdentifying();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.joana.FieldIdentifying#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.joana.FieldIdentifying#getField()
	 * @see #getFieldIdentifying()
	 * @generated
	 */
	EReference getFieldIdentifying_Field();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JoanaFactory getJoanaFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.JOANARootImpl <em>JOANA Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JOANARootImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getJOANARoot()
		 * @generated
		 */
		EClass JOANA_ROOT = eINSTANCE.getJOANARoot();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOANA_ROOT__ENTRYPOINT = eINSTANCE.getJOANARoot_Entrypoint();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.InformationFlowAnnotationImpl <em>Information Flow Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.InformationFlowAnnotationImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getInformationFlowAnnotation()
		 * @generated
		 */
		EClass INFORMATION_FLOW_ANNOTATION = eINSTANCE.getInformationFlowAnnotation();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW_ANNOTATION__LEVEL = eINSTANCE.getInformationFlowAnnotation_Level();

		/**
		 * The meta object literal for the '<em><b>System Element Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW_ANNOTATION__SYSTEM_ELEMENT_IDENTIFICATION = eINSTANCE.getInformationFlowAnnotation_SystemElementIdentification();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.EntryPointImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__LEVEL = eINSTANCE.getEntryPoint_Level();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__ANNOTATION = eINSTANCE.getEntryPoint_Annotation();

		/**
		 * The meta object literal for the '<em><b>Lattice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__LATTICE = eINSTANCE.getEntryPoint_Lattice();

		/**
		 * The meta object literal for the '<em><b>Method Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__METHOD_IDENTIFICATION = eINSTANCE.getEntryPoint_MethodIdentification();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.SourceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.SinkImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.LevelImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.MayFlowImpl <em>May Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.MayFlowImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getMayFlow()
		 * @generated
		 */
		EClass MAY_FLOW = eINSTANCE.getMayFlow();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAY_FLOW__FROM = eINSTANCE.getMayFlow_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAY_FLOW__TO = eINSTANCE.getMayFlow_To();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.LatticeImpl <em>Lattice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.LatticeImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getLattice()
		 * @generated
		 */
		EClass LATTICE = eINSTANCE.getLattice();

		/**
		 * The meta object literal for the '<em><b>May Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATTICE__MAY_FLOW = eINSTANCE.getLattice_MayFlow();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.SystemElementIdentifyingImpl <em>System Element Identifying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.SystemElementIdentifyingImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getSystemElementIdentifying()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT_IDENTIFYING = eINSTANCE.getSystemElementIdentifying();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.ParametertIdentifyingImpl <em>Parametert Identifying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.ParametertIdentifyingImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getParametertIdentifying()
		 * @generated
		 */
		EClass PARAMETERT_IDENTIFYING = eINSTANCE.getParametertIdentifying();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERT_IDENTIFYING__PARAMETER = eINSTANCE.getParametertIdentifying_Parameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.MethodIdentifyingImpl <em>Method Identifying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.MethodIdentifyingImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getMethodIdentifying()
		 * @generated
		 */
		EClass METHOD_IDENTIFYING = eINSTANCE.getMethodIdentifying();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_IDENTIFYING__METHOD = eINSTANCE.getMethodIdentifying_Method();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.joana.impl.FieldIdentifyingImpl <em>Field Identifying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.FieldIdentifyingImpl
		 * @see edu.kit.kastel.sdq.coupling.models.joana.impl.JoanaPackageImpl#getFieldIdentifying()
		 * @generated
		 */
		EClass FIELD_IDENTIFYING = eINSTANCE.getFieldIdentifying();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_IDENTIFYING__FIELD = eINSTANCE.getFieldIdentifying_Field();

	}

} //JoanaPackage
