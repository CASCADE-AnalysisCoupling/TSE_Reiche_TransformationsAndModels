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
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUES:
			return createResolvedImplementationValues();
		case JoanaresultingvaluesPackage.PARAMETER_RESOLVED_IMPLEMENTATION_VALUES:
			return createParameter_ResolvedImplementationValues();
		case JoanaresultingvaluesPackage.LEVEL_RESOLVED_IMPLEMENTATION_VALUES:
			return createLevel_ResolvedImplementationValues();
		case JoanaresultingvaluesPackage.ENTRY_POINT_RESOLVED_IMPLEMENTATION_VALUES:
			return createEntryPoint_ResolvedImplementationValues();
		case JoanaresultingvaluesPackage.RESOLVED_IMPLEMENTATION_VALUE:
			return createResolvedImplementationValue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolvedImplementationValues createResolvedImplementationValues() {
		ResolvedImplementationValuesImpl resolvedImplementationValues = new ResolvedImplementationValuesImpl();
		return resolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_ResolvedImplementationValues createParameter_ResolvedImplementationValues() {
		Parameter_ResolvedImplementationValuesImpl parameter_ResolvedImplementationValues = new Parameter_ResolvedImplementationValuesImpl();
		return parameter_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_ResolvedImplementationValues createLevel_ResolvedImplementationValues() {
		Level_ResolvedImplementationValuesImpl level_ResolvedImplementationValues = new Level_ResolvedImplementationValuesImpl();
		return level_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint_ResolvedImplementationValues createEntryPoint_ResolvedImplementationValues() {
		EntryPoint_ResolvedImplementationValuesImpl entryPoint_ResolvedImplementationValues = new EntryPoint_ResolvedImplementationValuesImpl();
		return entryPoint_ResolvedImplementationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolvedImplementationValue createResolvedImplementationValue() {
		ResolvedImplementationValueImpl resolvedImplementationValue = new ResolvedImplementationValueImpl();
		return resolvedImplementationValue;
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
