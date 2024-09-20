/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.util;

import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesPackage
 * @generated
 */
public class CodeqlresultingvaluescorrespondencesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodeqlresultingvaluescorrespondencesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlresultingvaluescorrespondencesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CodeqlresultingvaluescorrespondencesPackage.eINSTANCE;
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
	protected CodeqlresultingvaluescorrespondencesSwitch<Adapter> modelSwitch = new CodeqlresultingvaluescorrespondencesSwitch<Adapter>() {
		@Override
		public Adapter caseCorrespondences_ResolvedImplementationValues(
				Correspondences_ResolvedImplementationValues object) {
			return createCorrespondences_ResolvedImplementationValuesAdapter();
		}

		@Override
		public Adapter caseSecurityLevelCorrespondence_ResolvedImplementationValues(
				SecurityLevelCorrespondence_ResolvedImplementationValues object) {
			return createSecurityLevelCorrespondence_ResolvedImplementationValuesAdapter();
		}

		@Override
		public Adapter caseConfigurationCorrespondence_ResolvedImplementationValues(
				ConfigurationCorrespondence_ResolvedImplementationValues object) {
			return createConfigurationCorrespondence_ResolvedImplementationValuesAdapter();
		}

		@Override
		public Adapter caseParameterCorrespondence_ResolvedImplementationValues(
				ParameterCorrespondence_ResolvedImplementationValues object) {
			return createParameterCorrespondence_ResolvedImplementationValuesAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues <em>Correspondences Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues
	 * @generated
	 */
	public Adapter createCorrespondences_ResolvedImplementationValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues <em>Security Level Correspondence Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues
	 * @generated
	 */
	public Adapter createSecurityLevelCorrespondence_ResolvedImplementationValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_ResolvedImplementationValues <em>Configuration Correspondence Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_ResolvedImplementationValues
	 * @generated
	 */
	public Adapter createConfigurationCorrespondence_ResolvedImplementationValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues <em>Parameter Correspondence Resolved Implementation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues
	 * @generated
	 */
	public Adapter createParameterCorrespondence_ResolvedImplementationValuesAdapter() {
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

} //CodeqlresultingvaluescorrespondencesAdapterFactory
