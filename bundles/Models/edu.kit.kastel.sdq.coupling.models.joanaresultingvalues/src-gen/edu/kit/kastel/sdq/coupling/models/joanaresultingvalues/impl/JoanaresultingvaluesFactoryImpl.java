/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.*;

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
public class JoanaresultingvaluesFactoryImpl extends EFactoryImpl implements JoanaresultingvaluesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JoanaresultingvaluesFactory init() {
		try {
			JoanaresultingvaluesFactory theJoanaresultingvaluesFactory = (JoanaresultingvaluesFactory) EPackage.Registry.INSTANCE
					.getEFactory(JoanaresultingvaluesPackage.eNS_URI);
			if (theJoanaresultingvaluesFactory != null) {
				return theJoanaresultingvaluesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JoanaresultingvaluesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaresultingvaluesFactoryImpl() {
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
		case JoanaresultingvaluesPackage.JOANA_RESULTING_VALUES:
			return createJOANAResultingValues();
		case JoanaresultingvaluesPackage.PARAMETER_IDENTIFICATION_JOANA_RESULTING_VALUES:
			return createParameterIdentification_JOANAResultingValues();
		case JoanaresultingvaluesPackage.LEVEL_RESULTING_VALUES:
			return createLevel_ResultingValues();
		case JoanaresultingvaluesPackage.ENTRY_POINT_IDENTIFICATION_RESULTING_VALUES:
			return createEntryPointIdentification_ResultingValues();
		case JoanaresultingvaluesPackage.RESULTING_VALUE:
			return createResultingValue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOANAResultingValues createJOANAResultingValues() {
		JOANAResultingValuesImpl joanaResultingValues = new JOANAResultingValuesImpl();
		return joanaResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentification_JOANAResultingValues createParameterIdentification_JOANAResultingValues() {
		ParameterIdentification_JOANAResultingValuesImpl parameterIdentification_JOANAResultingValues = new ParameterIdentification_JOANAResultingValuesImpl();
		return parameterIdentification_JOANAResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_ResultingValues createLevel_ResultingValues() {
		Level_ResultingValuesImpl level_ResultingValues = new Level_ResultingValuesImpl();
		return level_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointIdentification_ResultingValues createEntryPointIdentification_ResultingValues() {
		EntryPointIdentification_ResultingValuesImpl entryPointIdentification_ResultingValues = new EntryPointIdentification_ResultingValuesImpl();
		return entryPointIdentification_ResultingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultingValue createResultingValue() {
		ResultingValueImpl resultingValue = new ResultingValueImpl();
		return resultingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaresultingvaluesPackage getJoanaresultingvaluesPackage() {
		return (JoanaresultingvaluesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JoanaresultingvaluesPackage getPackage() {
		return JoanaresultingvaluesPackage.eINSTANCE;
	}

} //JoanaresultingvaluesFactoryImpl
