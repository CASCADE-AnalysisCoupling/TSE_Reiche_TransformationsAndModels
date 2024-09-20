/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL;

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
 * An implementation of the model object '<em><b>Correspondences EDFA Code QL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.Correspondences_EDFACodeQLImpl#getLiteralSecurityLevelCorrespondences <em>Literal Security Level Correspondences</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.Correspondences_EDFACodeQLImpl#getConfigurationCorrespondences <em>Configuration Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Correspondences_EDFACodeQLImpl extends MinimalEObjectImpl.Container implements Correspondences_EDFACodeQL {
	/**
	 * The cached value of the '{@link #getLiteralSecurityLevelCorrespondences() <em>Literal Security Level Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralSecurityLevelCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<LiteralSecurityLevelCorrespondence_EDFACodeQL> literalSecurityLevelCorrespondences;

	/**
	 * The cached value of the '{@link #getConfigurationCorrespondences() <em>Configuration Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationCorrespondence_EDFACodeQL> configurationCorrespondences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Correspondences_EDFACodeQLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdfacodeqlcorrespondencesPackage.Literals.CORRESPONDENCES_EDFA_CODE_QL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiteralSecurityLevelCorrespondence_EDFACodeQL> getLiteralSecurityLevelCorrespondences() {
		if (literalSecurityLevelCorrespondences == null) {
			literalSecurityLevelCorrespondences = new EObjectContainmentEList<LiteralSecurityLevelCorrespondence_EDFACodeQL>(
					LiteralSecurityLevelCorrespondence_EDFACodeQL.class, this,
					EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__LITERAL_SECURITY_LEVEL_CORRESPONDENCES);
		}
		return literalSecurityLevelCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationCorrespondence_EDFACodeQL> getConfigurationCorrespondences() {
		if (configurationCorrespondences == null) {
			configurationCorrespondences = new EObjectContainmentEList<ConfigurationCorrespondence_EDFACodeQL>(
					ConfigurationCorrespondence_EDFACodeQL.class, this,
					EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__CONFIGURATION_CORRESPONDENCES);
		}
		return configurationCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__LITERAL_SECURITY_LEVEL_CORRESPONDENCES:
			return ((InternalEList<?>) getLiteralSecurityLevelCorrespondences()).basicRemove(otherEnd, msgs);
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__CONFIGURATION_CORRESPONDENCES:
			return ((InternalEList<?>) getConfigurationCorrespondences()).basicRemove(otherEnd, msgs);
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
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__LITERAL_SECURITY_LEVEL_CORRESPONDENCES:
			return getLiteralSecurityLevelCorrespondences();
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__CONFIGURATION_CORRESPONDENCES:
			return getConfigurationCorrespondences();
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
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__LITERAL_SECURITY_LEVEL_CORRESPONDENCES:
			getLiteralSecurityLevelCorrespondences().clear();
			getLiteralSecurityLevelCorrespondences()
					.addAll((Collection<? extends LiteralSecurityLevelCorrespondence_EDFACodeQL>) newValue);
			return;
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__CONFIGURATION_CORRESPONDENCES:
			getConfigurationCorrespondences().clear();
			getConfigurationCorrespondences()
					.addAll((Collection<? extends ConfigurationCorrespondence_EDFACodeQL>) newValue);
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
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__LITERAL_SECURITY_LEVEL_CORRESPONDENCES:
			getLiteralSecurityLevelCorrespondences().clear();
			return;
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__CONFIGURATION_CORRESPONDENCES:
			getConfigurationCorrespondences().clear();
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
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__LITERAL_SECURITY_LEVEL_CORRESPONDENCES:
			return literalSecurityLevelCorrespondences != null && !literalSecurityLevelCorrespondences.isEmpty();
		case EdfacodeqlcorrespondencesPackage.CORRESPONDENCES_EDFA_CODE_QL__CONFIGURATION_CORRESPONDENCES:
			return configurationCorrespondences != null && !configurationCorrespondences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Correspondences_EDFACodeQLImpl
