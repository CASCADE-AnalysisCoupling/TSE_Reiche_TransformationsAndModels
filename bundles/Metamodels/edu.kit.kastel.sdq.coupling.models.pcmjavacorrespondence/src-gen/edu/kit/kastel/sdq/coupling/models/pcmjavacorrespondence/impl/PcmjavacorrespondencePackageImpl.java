/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.kastel.sdq.coupling.models.java.JavaPackage;

import edu.kit.kastel.sdq.coupling.models.java.members.MembersPackage;

import edu.kit.kastel.sdq.coupling.models.java.types.TypesPackage;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature;

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
public class PcmjavacorrespondencePackageImpl extends EPackageImpl implements PcmjavacorrespondencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmJavaCorrespondenceRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicComponent2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInterface2InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeDataType2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedOperationSignature2JavaMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedParameterIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmParameter2JavaParameterEClass = null;

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
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcmjavacorrespondencePackageImpl() {
		super(eNS_URI, PcmjavacorrespondenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PcmjavacorrespondencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PcmjavacorrespondencePackage init() {
		if (isInited) return (PcmjavacorrespondencePackage)EPackage.Registry.INSTANCE.getEPackage(PcmjavacorrespondencePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPcmjavacorrespondencePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PcmjavacorrespondencePackageImpl thePcmjavacorrespondencePackage = registeredPcmjavacorrespondencePackage instanceof PcmjavacorrespondencePackageImpl ? (PcmjavacorrespondencePackageImpl)registeredPcmjavacorrespondencePackage : new PcmjavacorrespondencePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		edu.kit.kastel.sdq.coupling.models.identifier.IdentifierPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePcmjavacorrespondencePackage.createPackageContents();

		// Initialize created meta-data
		thePcmjavacorrespondencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePcmjavacorrespondencePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcmjavacorrespondencePackage.eNS_URI, thePcmjavacorrespondencePackage);
		return thePcmjavacorrespondencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMJavaCorrespondenceRoot() {
		return pcmJavaCorrespondenceRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPCMJavaCorrespondenceRoot_Basiccomponent2class() {
		return (EReference)pcmJavaCorrespondenceRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPCMJavaCorrespondenceRoot_OperationInterface2interface() {
		return (EReference)pcmJavaCorrespondenceRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPCMJavaCorrespondenceRoot_Compositedatatype2class() {
		return (EReference)pcmJavaCorrespondenceRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPCMJavaCorrespondenceRoot_Providedoperationsignature2javamethod() {
		return (EReference)pcmJavaCorrespondenceRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPCMJavaCorrespondenceRoot_Pcmparameter2javaparameter() {
		return (EReference)pcmJavaCorrespondenceRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicComponent2Class() {
		return basicComponent2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicComponent2Class_Component() {
		return (EReference)basicComponent2ClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicComponent2Class_JavaClass() {
		return (EReference)basicComponent2ClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationInterface2Interface() {
		return operationInterface2InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationInterface2Interface_PcmInterface() {
		return (EReference)operationInterface2InterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationInterface2Interface_JavaInterface() {
		return (EReference)operationInterface2InterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeDataType2Class() {
		return compositeDataType2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeDataType2Class_CompositeDataType() {
		return (EReference)compositeDataType2ClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeDataType2Class_JavaClass() {
		return (EReference)compositeDataType2ClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedOperationSignature2JavaMethod() {
		return providedOperationSignature2JavaMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedOperationSignature2JavaMethod_PcmMethod() {
		return (EReference)providedOperationSignature2JavaMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedOperationSignature2JavaMethod_JavaMethod() {
		return (EReference)providedOperationSignature2JavaMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedSignature() {
		return providedSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedSignature_ProvidedRole() {
		return (EReference)providedSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedSignature_ProvidedSignature() {
		return (EReference)providedSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedParameterIdentification() {
		return providedParameterIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedParameterIdentification_ProvidedSignature() {
		return (EReference)providedParameterIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedParameterIdentification_Parameter() {
		return (EReference)providedParameterIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMParameter2JavaParameter() {
		return pcmParameter2JavaParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPCMParameter2JavaParameter_PcmParameterIdentification() {
		return (EReference)pcmParameter2JavaParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPCMParameter2JavaParameter_JavaParameter() {
		return (EReference)pcmParameter2JavaParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PcmjavacorrespondenceFactory getPcmjavacorrespondenceFactory() {
		return (PcmjavacorrespondenceFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pcmJavaCorrespondenceRootEClass = createEClass(PCM_JAVA_CORRESPONDENCE_ROOT);
		createEReference(pcmJavaCorrespondenceRootEClass, PCM_JAVA_CORRESPONDENCE_ROOT__BASICCOMPONENT2CLASS);
		createEReference(pcmJavaCorrespondenceRootEClass, PCM_JAVA_CORRESPONDENCE_ROOT__OPERATION_INTERFACE2INTERFACE);
		createEReference(pcmJavaCorrespondenceRootEClass, PCM_JAVA_CORRESPONDENCE_ROOT__COMPOSITEDATATYPE2CLASS);
		createEReference(pcmJavaCorrespondenceRootEClass, PCM_JAVA_CORRESPONDENCE_ROOT__PROVIDEDOPERATIONSIGNATURE2JAVAMETHOD);
		createEReference(pcmJavaCorrespondenceRootEClass, PCM_JAVA_CORRESPONDENCE_ROOT__PCMPARAMETER2JAVAPARAMETER);

		basicComponent2ClassEClass = createEClass(BASIC_COMPONENT2_CLASS);
		createEReference(basicComponent2ClassEClass, BASIC_COMPONENT2_CLASS__COMPONENT);
		createEReference(basicComponent2ClassEClass, BASIC_COMPONENT2_CLASS__JAVA_CLASS);

		operationInterface2InterfaceEClass = createEClass(OPERATION_INTERFACE2_INTERFACE);
		createEReference(operationInterface2InterfaceEClass, OPERATION_INTERFACE2_INTERFACE__PCM_INTERFACE);
		createEReference(operationInterface2InterfaceEClass, OPERATION_INTERFACE2_INTERFACE__JAVA_INTERFACE);

		compositeDataType2ClassEClass = createEClass(COMPOSITE_DATA_TYPE2_CLASS);
		createEReference(compositeDataType2ClassEClass, COMPOSITE_DATA_TYPE2_CLASS__COMPOSITE_DATA_TYPE);
		createEReference(compositeDataType2ClassEClass, COMPOSITE_DATA_TYPE2_CLASS__JAVA_CLASS);

		providedOperationSignature2JavaMethodEClass = createEClass(PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD);
		createEReference(providedOperationSignature2JavaMethodEClass, PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__PCM_METHOD);
		createEReference(providedOperationSignature2JavaMethodEClass, PROVIDED_OPERATION_SIGNATURE2_JAVA_METHOD__JAVA_METHOD);

		providedSignatureEClass = createEClass(PROVIDED_SIGNATURE);
		createEReference(providedSignatureEClass, PROVIDED_SIGNATURE__PROVIDED_ROLE);
		createEReference(providedSignatureEClass, PROVIDED_SIGNATURE__PROVIDED_SIGNATURE);

		providedParameterIdentificationEClass = createEClass(PROVIDED_PARAMETER_IDENTIFICATION);
		createEReference(providedParameterIdentificationEClass, PROVIDED_PARAMETER_IDENTIFICATION__PROVIDED_SIGNATURE);
		createEReference(providedParameterIdentificationEClass, PROVIDED_PARAMETER_IDENTIFICATION__PARAMETER);

		pcmParameter2JavaParameterEClass = createEClass(PCM_PARAMETER2_JAVA_PARAMETER);
		createEReference(pcmParameter2JavaParameterEClass, PCM_PARAMETER2_JAVA_PARAMETER__PCM_PARAMETER_IDENTIFICATION);
		createEReference(pcmParameter2JavaParameterEClass, PCM_PARAMETER2_JAVA_PARAMETER__JAVA_PARAMETER);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		MembersPackage theMembersPackage = (MembersPackage)EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pcmJavaCorrespondenceRootEClass, PCMJavaCorrespondenceRoot.class, "PCMJavaCorrespondenceRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMJavaCorrespondenceRoot_Basiccomponent2class(), this.getBasicComponent2Class(), null, "basiccomponent2class", null, 0, -1, PCMJavaCorrespondenceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMJavaCorrespondenceRoot_OperationInterface2interface(), this.getOperationInterface2Interface(), null, "operationInterface2interface", null, 0, -1, PCMJavaCorrespondenceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMJavaCorrespondenceRoot_Compositedatatype2class(), this.getCompositeDataType2Class(), null, "compositedatatype2class", null, 0, -1, PCMJavaCorrespondenceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMJavaCorrespondenceRoot_Providedoperationsignature2javamethod(), this.getProvidedOperationSignature2JavaMethod(), null, "providedoperationsignature2javamethod", null, 0, -1, PCMJavaCorrespondenceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMJavaCorrespondenceRoot_Pcmparameter2javaparameter(), this.getPCMParameter2JavaParameter(), null, "pcmparameter2javaparameter", null, 0, -1, PCMJavaCorrespondenceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicComponent2ClassEClass, BasicComponent2Class.class, "BasicComponent2Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicComponent2Class_Component(), theRepositoryPackage.getBasicComponent(), null, "component", null, 1, 1, BasicComponent2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicComponent2Class_JavaClass(), theTypesPackage.getClass_(), null, "javaClass", null, 1, 1, BasicComponent2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationInterface2InterfaceEClass, OperationInterface2Interface.class, "OperationInterface2Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationInterface2Interface_PcmInterface(), theRepositoryPackage.getOperationInterface(), null, "pcmInterface", null, 1, 1, OperationInterface2Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationInterface2Interface_JavaInterface(), theTypesPackage.getInterface(), null, "javaInterface", null, 1, 1, OperationInterface2Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeDataType2ClassEClass, CompositeDataType2Class.class, "CompositeDataType2Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeDataType2Class_CompositeDataType(), theRepositoryPackage.getCompositeDataType(), null, "CompositeDataType", null, 1, 1, CompositeDataType2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeDataType2Class_JavaClass(), theTypesPackage.getClass_(), null, "javaClass", null, 1, 1, CompositeDataType2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedOperationSignature2JavaMethodEClass, ProvidedOperationSignature2JavaMethod.class, "ProvidedOperationSignature2JavaMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedOperationSignature2JavaMethod_PcmMethod(), this.getProvidedSignature(), null, "pcmMethod", null, 1, 1, ProvidedOperationSignature2JavaMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedOperationSignature2JavaMethod_JavaMethod(), theMembersPackage.getMethod(), null, "javaMethod", null, 1, 1, ProvidedOperationSignature2JavaMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedSignatureEClass, ProvidedSignature.class, "ProvidedSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedSignature_ProvidedRole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedRole", null, 1, 1, ProvidedSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedSignature_ProvidedSignature(), theRepositoryPackage.getOperationSignature(), null, "providedSignature", null, 1, 1, ProvidedSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedParameterIdentificationEClass, ProvidedParameterIdentification.class, "ProvidedParameterIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedParameterIdentification_ProvidedSignature(), this.getProvidedSignature(), null, "providedSignature", null, 1, 1, ProvidedParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedParameterIdentification_Parameter(), theRepositoryPackage.getParameter(), null, "parameter", null, 1, 1, ProvidedParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmParameter2JavaParameterEClass, PCMParameter2JavaParameter.class, "PCMParameter2JavaParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMParameter2JavaParameter_PcmParameterIdentification(), this.getProvidedParameterIdentification(), null, "pcmParameterIdentification", null, 1, 1, PCMParameter2JavaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMParameter2JavaParameter_JavaParameter(), theMembersPackage.getParameter(), null, "javaParameter", null, 1, 1, PCMParameter2JavaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PcmjavacorrespondencePackageImpl
