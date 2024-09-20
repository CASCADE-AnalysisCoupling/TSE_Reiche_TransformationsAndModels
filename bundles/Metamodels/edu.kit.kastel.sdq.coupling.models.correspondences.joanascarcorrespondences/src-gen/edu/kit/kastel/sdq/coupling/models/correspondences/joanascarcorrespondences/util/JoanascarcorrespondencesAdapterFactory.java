/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesPackage
 * @generated
 */
public class JoanascarcorrespondencesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JoanascarcorrespondencesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanascarcorrespondencesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JoanascarcorrespondencesPackage.eINSTANCE;
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
	protected JoanascarcorrespondencesSwitch<Adapter> modelSwitch = new JoanascarcorrespondencesSwitch<Adapter>() {
		@Override
		public Adapter caseJOANASCARCorrespondences(JOANASCARCorrespondences object) {
			return createJOANASCARCorrespondencesAdapter();
		}

		@Override
		public Adapter caseEntryPointCorrespondence(EntryPointCorrespondence object) {
			return createEntryPointCorrespondenceAdapter();
		}

		@Override
		public Adapter caseLevelCorrespondence(LevelCorrespondence object) {
			return createLevelCorrespondenceAdapter();
		}

		@Override
		public Adapter caseSystemElementCorrespondence(SystemElementCorrespondence object) {
			return createSystemElementCorrespondenceAdapter();
		}

		@Override
		public Adapter caseParameterCorrespondence(ParameterCorrespondence object) {
			return createParameterCorrespondenceAdapter();
		}

		@Override
		public Adapter caseFieldCorrespondence(FieldCorrespondence object) {
			return createFieldCorrespondenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences <em>JOANASCAR Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences
	 * @generated
	 */
	public Adapter createJOANASCARCorrespondencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence <em>Entry Point Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence
	 * @generated
	 */
	public Adapter createEntryPointCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence <em>Level Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence
	 * @generated
	 */
	public Adapter createLevelCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.SystemElementCorrespondence <em>System Element Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.SystemElementCorrespondence
	 * @generated
	 */
	public Adapter createSystemElementCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence <em>Parameter Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence
	 * @generated
	 */
	public Adapter createParameterCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence <em>Field Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence
	 * @generated
	 */
	public Adapter createFieldCorrespondenceAdapter() {
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

} //JoanascarcorrespondencesAdapterFactory
