/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correspondences EDFAJOANA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.Correspondences_EDFAJOANAImpl#getConfigurationCorrespondences <em>Configuration Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.Correspondences_EDFAJOANAImpl#getLiteralLevelCorrespondences <em>Literal Level Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Correspondences_EDFAJOANAImpl extends MinimalEObjectImpl.Container implements Correspondences_EDFAJOANA {
	/**
	 * The cached value of the '{@link #getConfigurationCorrespondences() <em>Configuration Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationCorrespondence> configurationCorrespondences;

	/**
	 * The cached value of the '{@link #getLiteralLevelCorrespondences() <em>Literal Level Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralLevelCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<LiteralsLevelCorrespondence> literalLevelCorrespondences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Correspondences_EDFAJOANAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdfajoanacorrespondencesPackage.Literals.CORRESPONDENCES_EDFAJOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationCorrespondence> getConfigurationCorrespondences() {
		if (configurationCorrespondences == null) {
			configurationCorrespondences = new EObjectContainmentEList<ConfigurationCorrespondence>(
					ConfigurationCorrespondence.class, this,
					EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__CONFIGURATION_CORRESPONDENCES);
		}
		return configurationCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiteralsLevelCorrespondence> getLiteralLevelCorrespondences() {
		if (literalLevelCorrespondences == null) {
			literalLevelCorrespondences = new EObjectContainmentEList<LiteralsLevelCorrespondence>(
					LiteralsLevelCorrespondence.class, this,
					EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__LITERAL_LEVEL_CORRESPONDENCES);
		}
		return literalLevelCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__CONFIGURATION_CORRESPONDENCES:
			return ((InternalEList<?>) getConfigurationCorrespondences()).basicRemove(otherEnd, msgs);
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__LITERAL_LEVEL_CORRESPONDENCES:
			return ((InternalEList<?>) getLiteralLevelCorrespondences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__CONFIGURATION_CORRESPONDENCES:
			return getConfigurationCorrespondences();
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__LITERAL_LEVEL_CORRESPONDENCES:
			return getLiteralLevelCorrespondences();
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
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__CONFIGURATION_CORRESPONDENCES:
			getConfigurationCorrespondences().clear();
			getConfigurationCorrespondences().addAll((Collection<? extends ConfigurationCorrespondence>) newValue);
			return;
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__LITERAL_LEVEL_CORRESPONDENCES:
			getLiteralLevelCorrespondences().clear();
			getLiteralLevelCorrespondences().addAll((Collection<? extends LiteralsLevelCorrespondence>) newValue);
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
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__CONFIGURATION_CORRESPONDENCES:
			getConfigurationCorrespondences().clear();
			return;
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__LITERAL_LEVEL_CORRESPONDENCES:
			getLiteralLevelCorrespondences().clear();
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
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__CONFIGURATION_CORRESPONDENCES:
			return configurationCorrespondences != null && !configurationCorrespondences.isEmpty();
		case EdfajoanacorrespondencesPackage.CORRESPONDENCES_EDFAJOANA__LITERAL_LEVEL_CORRESPONDENCES:
			return literalLevelCorrespondences != null && !literalLevelCorrespondences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Correspondences_EDFAJOANAImpl
