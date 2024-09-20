/**
 */
package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationPackage;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fully Implicit Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.impl.FullyImplicitConfigurationImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FullyImplicitConfigurationImpl extends ConfigurationImpl implements FullyImplicitConfiguration {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FullyImplicitConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationrepresentationPackage.Literals.FULLY_IMPLICIT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<EObject>(EObject.class, this,
					ConfigurationrepresentationPackage.FULLY_IMPLICIT_CONFIGURATION__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationrepresentationPackage.FULLY_IMPLICIT_CONFIGURATION__INPUTS:
			return getInputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ConfigurationrepresentationPackage.FULLY_IMPLICIT_CONFIGURATION__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends EObject>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ConfigurationrepresentationPackage.FULLY_IMPLICIT_CONFIGURATION__INPUTS:
			getInputs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ConfigurationrepresentationPackage.FULLY_IMPLICIT_CONFIGURATION__INPUTS:
			return inputs != null && !inputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FullyImplicitConfigurationImpl
