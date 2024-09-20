/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;

import edu.kit.kastel.scbs.confidentiality.data.DataPackage;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsFactory;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowAnnotation;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowCallAnnotation;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowOperationSignatureAnnotation;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowParameterAnnotation;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowReturnAnnotation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessanalysisannotationsPackageImpl extends EPackageImpl implements AccessanalysisannotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowOperationSignatureAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowCallAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowReturnAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowParameterAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccessanalysisannotationsPackageImpl() {
		super(eNS_URI, AccessanalysisannotationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AccessanalysisannotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccessanalysisannotationsPackage init() {
		if (isInited)
			return (AccessanalysisannotationsPackage) EPackage.Registry.INSTANCE
					.getEPackage(AccessanalysisannotationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAccessanalysisannotationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AccessanalysisannotationsPackageImpl theAccessanalysisannotationsPackage = registeredAccessanalysisannotationsPackage instanceof AccessanalysisannotationsPackageImpl
				? (AccessanalysisannotationsPackageImpl) registeredAccessanalysisannotationsPackage
				: new AccessanalysisannotationsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ConfidentialityPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAccessanalysisannotationsPackage.createPackageContents();

		// Initialize created meta-data
		theAccessanalysisannotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccessanalysisannotationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccessanalysisannotationsPackage.eNS_URI, theAccessanalysisannotationsPackage);
		return theAccessanalysisannotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlowAnnotation() {
		return informationFlowAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlowAnnotation_DataTargets() {
		return (EReference) informationFlowAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlowOperationSignatureAnnotation() {
		return informationFlowOperationSignatureAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlowOperationSignatureAnnotation_OperationSignature() {
		return (EReference) informationFlowOperationSignatureAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlowCallAnnotation() {
		return informationFlowCallAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlowReturnAnnotation() {
		return informationFlowReturnAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlowParameterAnnotation() {
		return informationFlowParameterAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlowParameterAnnotation_Parameter() {
		return (EReference) informationFlowParameterAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotations() {
		return annotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotations_InformationFlowAnnotations() {
		return (EReference) annotationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessanalysisannotationsFactory getAccessanalysisannotationsFactory() {
		return (AccessanalysisannotationsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		informationFlowAnnotationEClass = createEClass(INFORMATION_FLOW_ANNOTATION);
		createEReference(informationFlowAnnotationEClass, INFORMATION_FLOW_ANNOTATION__DATA_TARGETS);

		informationFlowOperationSignatureAnnotationEClass = createEClass(
				INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION);
		createEReference(informationFlowOperationSignatureAnnotationEClass,
				INFORMATION_FLOW_OPERATION_SIGNATURE_ANNOTATION__OPERATION_SIGNATURE);

		informationFlowCallAnnotationEClass = createEClass(INFORMATION_FLOW_CALL_ANNOTATION);

		informationFlowReturnAnnotationEClass = createEClass(INFORMATION_FLOW_RETURN_ANNOTATION);

		informationFlowParameterAnnotationEClass = createEClass(INFORMATION_FLOW_PARAMETER_ANNOTATION);
		createEReference(informationFlowParameterAnnotationEClass, INFORMATION_FLOW_PARAMETER_ANNOTATION__PARAMETER);

		annotationsEClass = createEClass(ANNOTATIONS);
		createEReference(annotationsEClass, ANNOTATIONS__INFORMATION_FLOW_ANNOTATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DataPackage theDataPackage = (DataPackage) EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		informationFlowOperationSignatureAnnotationEClass.getESuperTypes().add(this.getInformationFlowAnnotation());
		informationFlowCallAnnotationEClass.getESuperTypes().add(this.getInformationFlowOperationSignatureAnnotation());
		informationFlowReturnAnnotationEClass.getESuperTypes()
				.add(this.getInformationFlowOperationSignatureAnnotation());
		informationFlowParameterAnnotationEClass.getESuperTypes()
				.add(this.getInformationFlowOperationSignatureAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(informationFlowAnnotationEClass, InformationFlowAnnotation.class, "InformationFlowAnnotation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationFlowAnnotation_DataTargets(), theDataPackage.getDataIdentifying(), null,
				"dataTargets", null, 0, -1, InformationFlowAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationFlowOperationSignatureAnnotationEClass, InformationFlowOperationSignatureAnnotation.class,
				"InformationFlowOperationSignatureAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationFlowOperationSignatureAnnotation_OperationSignature(),
				theRepositoryPackage.getOperationSignature(), null, "operationSignature", null, 1, 1,
				InformationFlowOperationSignatureAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationFlowCallAnnotationEClass, InformationFlowCallAnnotation.class,
				"InformationFlowCallAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationFlowReturnAnnotationEClass, InformationFlowReturnAnnotation.class,
				"InformationFlowReturnAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationFlowParameterAnnotationEClass, InformationFlowParameterAnnotation.class,
				"InformationFlowParameterAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationFlowParameterAnnotation_Parameter(), theRepositoryPackage.getParameter(), null,
				"parameter", null, 1, 1, InformationFlowParameterAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationsEClass, Annotations.class, "Annotations", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotations_InformationFlowAnnotations(), this.getInformationFlowAnnotation(), null,
				"InformationFlowAnnotations", null, 0, -1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AccessanalysisannotationsPackageImpl
