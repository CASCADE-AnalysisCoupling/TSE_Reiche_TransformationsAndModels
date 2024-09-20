/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.*;

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
public class JoanaresultingvaluescorrespondencesFactoryImpl extends EFactoryImpl
		implements JoanaresultingvaluescorrespondencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JoanaresultingvaluescorrespondencesFactory init() {
		try {
			JoanaresultingvaluescorrespondencesFactory theJoanaresultingvaluescorrespondencesFactory = (JoanaresultingvaluescorrespondencesFactory) EPackage.Registry.INSTANCE
					.getEFactory(JoanaresultingvaluescorrespondencesPackage.eNS_URI);
			if (theJoanaresultingvaluescorrespondencesFactory != null) {
				return theJoanaresultingvaluescorrespondencesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JoanaresultingvaluescorrespondencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaresultingvaluescorrespondencesFactoryImpl() {
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
		case JoanaresultingvaluescorrespondencesPackage.CORRESPONDENCES_RESOLVED_IMPLEMENTATION_VALUES:
			return createCorrespondences_ResolvedImplementationValues();
		case JoanaresultingvaluescorrespondencesPackage.LEVEL_CORRESPONDENCE_RESOLVED_IMPLEMENTATION_VALUES:
			return createLevelCorrespondence_ResolvedImplementationValues();
		case JoanaresultingvaluescorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE_JOANA_RESULTING_VALUES:
			return createEntryPointCorrespondence_JOANAResultingValues();
		case JoanaresultingvaluescorrespondencesPackage.PARAMETER_CORRESPONDENCE_JOANA_RESULTING_VALUES:
			return createParameterCorrespondence_JOANAResultingValues();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correspondences_ResolvedImplementationValues createCorrespondences_ResolvedImplementationValues() {
		Correspondences_ResolvedImplementationValuesImpl correspondences_ResolvedImplementationValues = new Correspondences_ResolvedImplementationValuesImpl();
		return correspondences_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelCorrespondence_ResolvedImplementationValues createLevelCorrespondence_ResolvedImplementationValues() {
		LevelCorrespondence_ResolvedImplementationValuesImpl levelCorrespondence_ResolvedImplementationValues = new LevelCorrespondence_ResolvedImplementationValuesImpl();
		return levelCorrespondence_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointCorrespondence_JOANAResultingValues createEntryPointCorrespondence_JOANAResultingValues() {
		EntryPointCorrespondence_JOANAResultingValuesImpl entryPointCorrespondence_JOANAResultingValues = new EntryPointCorrespondence_JOANAResultingValuesImpl();
		return entryPointCorrespondence_JOANAResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCorrespondence_JOANAResultingValues createParameterCorrespondence_JOANAResultingValues() {
		ParameterCorrespondence_JOANAResultingValuesImpl parameterCorrespondence_JOANAResultingValues = new ParameterCorrespondence_JOANAResultingValuesImpl();
		return parameterCorrespondence_JOANAResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaresultingvaluescorrespondencesPackage getJoanaresultingvaluescorrespondencesPackage() {
		return (JoanaresultingvaluescorrespondencesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JoanaresultingvaluescorrespondencesPackage getPackage() {
		return JoanaresultingvaluescorrespondencesPackage.eINSTANCE;
	}

} //JoanaresultingvaluescorrespondencesFactoryImpl
