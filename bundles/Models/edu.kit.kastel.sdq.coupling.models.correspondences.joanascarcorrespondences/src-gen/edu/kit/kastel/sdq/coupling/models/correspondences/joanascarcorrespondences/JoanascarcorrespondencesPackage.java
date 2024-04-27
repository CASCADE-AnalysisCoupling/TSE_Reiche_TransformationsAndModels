/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences;

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
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesFactory
 * @model kind="package"
 * @generated
 */
public interface JoanascarcorrespondencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "joanascarcorrespondences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/joanascarcorrespondences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "joanascarcorrespondences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanascarcorrespondencesPackage eINSTANCE = edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JOANASCARCorrespondencesImpl <em>JOANASCAR Correspondences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JOANASCARCorrespondencesImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getJOANASCARCorrespondences()
	 * @generated
	 */
	int JOANASCAR_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Entry Point Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANASCAR_CORRESPONDENCES__ENTRY_POINT_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Level Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANASCAR_CORRESPONDENCES__LEVEL_CORRESPONDENCES = 1;

	/**
	 * The feature id for the '<em><b>System Element Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANASCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES = 2;

	/**
	 * The number of structural features of the '<em>JOANASCAR Correspondences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANASCAR_CORRESPONDENCES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>JOANASCAR Correspondences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANASCAR_CORRESPONDENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.EntryPointCorrespondenceImpl <em>Entry Point Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.EntryPointCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getEntryPointCorrespondence()
	 * @generated
	 */
	int ENTRY_POINT_CORRESPONDENCE = 1;

	/**
	 * The feature id for the '<em><b>Entry Point JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_JOANA = 0;

	/**
	 * The feature id for the '<em><b>Entry Point SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_SCAR = 1;

	/**
	 * The number of structural features of the '<em>Entry Point Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry Point Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.LevelCorrespondenceImpl <em>Level Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.LevelCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getLevelCorrespondence()
	 * @generated
	 */
	int LEVEL_CORRESPONDENCE = 2;

	/**
	 * The feature id for the '<em><b>Level JOANA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CORRESPONDENCE__LEVEL_JOANA = 0;

	/**
	 * The feature id for the '<em><b>Level SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CORRESPONDENCE__LEVEL_SCAR = 1;

	/**
	 * The number of structural features of the '<em>Level Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Level Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.SystemElementCorrespondenceImpl <em>System Element Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.SystemElementCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getSystemElementCorrespondence()
	 * @generated
	 */
	int SYSTEM_ELEMENT_CORRESPONDENCE = 3;

	/**
	 * The number of structural features of the '<em>System Element Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Element Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.ParameterCorrespondenceImpl <em>Parameter Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.ParameterCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getParameterCorrespondence()
	 * @generated
	 */
	int PARAMETER_CORRESPONDENCE = 4;

	/**
	 * The feature id for the '<em><b>Parameter JAVA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE__PARAMETER_JAVA = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE__PARAMETER_SCAR = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_FEATURE_COUNT = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_OPERATION_COUNT = SYSTEM_ELEMENT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.FieldCorrespondenceImpl <em>Field Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.FieldCorrespondenceImpl
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getFieldCorrespondence()
	 * @generated
	 */
	int FIELD_CORRESPONDENCE = 5;

	/**
	 * The feature id for the '<em><b>Field JAVA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CORRESPONDENCE__FIELD_JAVA = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field SCAR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CORRESPONDENCE__FIELD_SCAR = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CORRESPONDENCE_FEATURE_COUNT = SYSTEM_ELEMENT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_CORRESPONDENCE_OPERATION_COUNT = SYSTEM_ELEMENT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences <em>JOANASCAR Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JOANASCAR Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences
	 * @generated
	 */
	EClass getJOANASCARCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences#getEntryPointCorrespondences <em>Entry Point Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Point Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences#getEntryPointCorrespondences()
	 * @see #getJOANASCARCorrespondences()
	 * @generated
	 */
	EReference getJOANASCARCorrespondences_EntryPointCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences#getLevelCorrespondences <em>Level Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences#getLevelCorrespondences()
	 * @see #getJOANASCARCorrespondences()
	 * @generated
	 */
	EReference getJOANASCARCorrespondences_LevelCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences#getSystemElementCorrespondences <em>System Element Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Element Correspondences</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences#getSystemElementCorrespondences()
	 * @see #getJOANASCARCorrespondences()
	 * @generated
	 */
	EReference getJOANASCARCorrespondences_SystemElementCorrespondences();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence <em>Entry Point Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence
	 * @generated
	 */
	EClass getEntryPointCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence#getEntryPoint_JOANA <em>Entry Point JOANA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Point JOANA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence#getEntryPoint_JOANA()
	 * @see #getEntryPointCorrespondence()
	 * @generated
	 */
	EReference getEntryPointCorrespondence_EntryPoint_JOANA();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence#getEntryPoint_SCAR <em>Entry Point SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Point SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence#getEntryPoint_SCAR()
	 * @see #getEntryPointCorrespondence()
	 * @generated
	 */
	EReference getEntryPointCorrespondence_EntryPoint_SCAR();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence <em>Level Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence
	 * @generated
	 */
	EClass getLevelCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence#getLevel_JOANA <em>Level JOANA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level JOANA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence#getLevel_JOANA()
	 * @see #getLevelCorrespondence()
	 * @generated
	 */
	EReference getLevelCorrespondence_Level_JOANA();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence#getLevel_SCAR <em>Level SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence#getLevel_SCAR()
	 * @see #getLevelCorrespondence()
	 * @generated
	 */
	EReference getLevelCorrespondence_Level_SCAR();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.SystemElementCorrespondence <em>System Element Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.SystemElementCorrespondence
	 * @generated
	 */
	EClass getSystemElementCorrespondence();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence <em>Parameter Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence
	 * @generated
	 */
	EClass getParameterCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence#getParameter_JAVA <em>Parameter JAVA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter JAVA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence#getParameter_JAVA()
	 * @see #getParameterCorrespondence()
	 * @generated
	 */
	EReference getParameterCorrespondence_Parameter_JAVA();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence#getParameter_SCAR <em>Parameter SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence#getParameter_SCAR()
	 * @see #getParameterCorrespondence()
	 * @generated
	 */
	EReference getParameterCorrespondence_Parameter_SCAR();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence <em>Field Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Correspondence</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence
	 * @generated
	 */
	EClass getFieldCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence#getField_JAVA <em>Field JAVA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field JAVA</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence#getField_JAVA()
	 * @see #getFieldCorrespondence()
	 * @generated
	 */
	EReference getFieldCorrespondence_Field_JAVA();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence#getField_SCAR <em>Field SCAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field SCAR</em>'.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence#getField_SCAR()
	 * @see #getFieldCorrespondence()
	 * @generated
	 */
	EReference getFieldCorrespondence_Field_SCAR();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JoanascarcorrespondencesFactory getJoanascarcorrespondencesFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JOANASCARCorrespondencesImpl <em>JOANASCAR Correspondences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JOANASCARCorrespondencesImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getJOANASCARCorrespondences()
		 * @generated
		 */
		EClass JOANASCAR_CORRESPONDENCES = eINSTANCE.getJOANASCARCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Entry Point Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOANASCAR_CORRESPONDENCES__ENTRY_POINT_CORRESPONDENCES = eINSTANCE
				.getJOANASCARCorrespondences_EntryPointCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Level Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOANASCAR_CORRESPONDENCES__LEVEL_CORRESPONDENCES = eINSTANCE
				.getJOANASCARCorrespondences_LevelCorrespondences();

		/**
		 * The meta object literal for the '<em><b>System Element Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOANASCAR_CORRESPONDENCES__SYSTEM_ELEMENT_CORRESPONDENCES = eINSTANCE
				.getJOANASCARCorrespondences_SystemElementCorrespondences();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.EntryPointCorrespondenceImpl <em>Entry Point Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.EntryPointCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getEntryPointCorrespondence()
		 * @generated
		 */
		EClass ENTRY_POINT_CORRESPONDENCE = eINSTANCE.getEntryPointCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Entry Point JOANA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_JOANA = eINSTANCE
				.getEntryPointCorrespondence_EntryPoint_JOANA();

		/**
		 * The meta object literal for the '<em><b>Entry Point SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT_CORRESPONDENCE__ENTRY_POINT_SCAR = eINSTANCE
				.getEntryPointCorrespondence_EntryPoint_SCAR();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.LevelCorrespondenceImpl <em>Level Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.LevelCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getLevelCorrespondence()
		 * @generated
		 */
		EClass LEVEL_CORRESPONDENCE = eINSTANCE.getLevelCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Level JOANA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL_CORRESPONDENCE__LEVEL_JOANA = eINSTANCE.getLevelCorrespondence_Level_JOANA();

		/**
		 * The meta object literal for the '<em><b>Level SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL_CORRESPONDENCE__LEVEL_SCAR = eINSTANCE.getLevelCorrespondence_Level_SCAR();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.SystemElementCorrespondenceImpl <em>System Element Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.SystemElementCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getSystemElementCorrespondence()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT_CORRESPONDENCE = eINSTANCE.getSystemElementCorrespondence();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.ParameterCorrespondenceImpl <em>Parameter Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.ParameterCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getParameterCorrespondence()
		 * @generated
		 */
		EClass PARAMETER_CORRESPONDENCE = eINSTANCE.getParameterCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Parameter JAVA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE__PARAMETER_JAVA = eINSTANCE.getParameterCorrespondence_Parameter_JAVA();

		/**
		 * The meta object literal for the '<em><b>Parameter SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE__PARAMETER_SCAR = eINSTANCE.getParameterCorrespondence_Parameter_SCAR();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.FieldCorrespondenceImpl <em>Field Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.FieldCorrespondenceImpl
		 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl.JoanascarcorrespondencesPackageImpl#getFieldCorrespondence()
		 * @generated
		 */
		EClass FIELD_CORRESPONDENCE = eINSTANCE.getFieldCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Field JAVA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_CORRESPONDENCE__FIELD_JAVA = eINSTANCE.getFieldCorrespondence_Field_JAVA();

		/**
		 * The meta object literal for the '<em><b>Field SCAR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_CORRESPONDENCE__FIELD_SCAR = eINSTANCE.getFieldCorrespondence_Field_SCAR();

	}

} //JoanascarcorrespondencesPackage
