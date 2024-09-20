/**
 */
package edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util;

import edu.kit.kastel.sdq.coupling.models.identifier.Entity;
import edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement;
import edu.kit.kastel.sdq.coupling.models.identifier.NamedElement;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JoanaresultingvaluesPackage
 * @generated
 */
public class JoanaresultingvaluesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JoanaresultingvaluesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaresultingvaluesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JoanaresultingvaluesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoanaresultingvaluesSwitch<Adapter> modelSwitch = new JoanaresultingvaluesSwitch<Adapter>() {
		@Override
		public Adapter caseResolvedImplementationValues(ResolvedImplementationValues object) {
			return createResolvedImplementationValuesAdapter();
		}

		@Override
		public Adapter caseParameter_ResolvedImplementationValues(Parameter_ResolvedImplementationValues object) {
			return createParameter_ResolvedImplementationValuesAdapter();
		}

		@Override
		public Adapter caseLevel_ResolvedImplementationValues(Level_ResolvedImplementationValues object) {
			return createLevel_ResolvedImplementationValuesAdapter();
		}

		@Override
		public Adapter caseEntryPoint_ResolvedImplementationValues(EntryPoint_ResolvedImplementationValues object) {
			return createEntryPoint_ResolvedImplementationValuesAdapter();
		}

		@Override
		public Adapter caseResolvedImplementationValue(ResolvedImplementationValue object) {
			return createResolvedImplementationValueAdapter();
		}

		@Override
		public Adapter caseIdentifiedElement(IdentifiedElement object) {
			return createIdentifiedElementAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues <em>Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues
	 * @generated
	 */
	public Adapter createResolvedImplementationValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues <em>Parameter Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues
	 * @generated
	 */
	public Adapter createParameter_ResolvedImplementationValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues <em>Level Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues
	 * @generated
	 */
	public Adapter createLevel_ResolvedImplementationValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues <em>Entry Point Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues
	 * @generated
	 */
	public Adapter createEntryPoint_ResolvedImplementationValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue <em>Resolved Implementation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue
	 * @generated
	 */
	public Adapter createResolvedImplementationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.identifier.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.identifier.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.identifier.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.identifier.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.identifier.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JoanaresultingvaluesAdapterFactory
