/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence;

import edu.kit.kastel.sdq.coupling.models.joana.Level;

import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literals Level Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.LiteralsLevelCorrespondenceImpl#getLiterals_EDFA <em>Literals EDFA</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.impl.LiteralsLevelCorrespondenceImpl#getLevel_JOANA <em>Level JOANA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralsLevelCorrespondenceImpl extends MinimalEObjectImpl.Container
		implements LiteralsLevelCorrespondence {
	/**
	 * The cached value of the '{@link #getLiterals_EDFA() <em>Literals EDFA</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterals_EDFA()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> literals_EDFA;

	/**
	 * The cached value of the '{@link #getLevel_JOANA() <em>Level JOANA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel_JOANA()
	 * @generated
	 * @ordered
	 */
	protected Level level_JOANA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralsLevelCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdfajoanacorrespondencesPackage.Literals.LITERALS_LEVEL_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Literal> getLiterals_EDFA() {
		if (literals_EDFA == null) {
			literals_EDFA = new EObjectResolvingEList<Literal>(Literal.class, this,
					EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LITERALS_EDFA);
		}
		return literals_EDFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getLevel_JOANA() {
		if (level_JOANA != null && level_JOANA.eIsProxy()) {
			InternalEObject oldLevel_JOANA = (InternalEObject) level_JOANA;
			level_JOANA = (Level) eResolveProxy(oldLevel_JOANA);
			if (level_JOANA != oldLevel_JOANA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LEVEL_JOANA, oldLevel_JOANA,
							level_JOANA));
			}
		}
		return level_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetLevel_JOANA() {
		return level_JOANA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel_JOANA(Level newLevel_JOANA) {
		Level oldLevel_JOANA = level_JOANA;
		level_JOANA = newLevel_JOANA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LEVEL_JOANA, oldLevel_JOANA,
					level_JOANA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LITERALS_EDFA:
			return getLiterals_EDFA();
		case EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LEVEL_JOANA:
			if (resolve)
				return getLevel_JOANA();
			return basicGetLevel_JOANA();
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
		case EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LITERALS_EDFA:
			getLiterals_EDFA().clear();
			getLiterals_EDFA().addAll((Collection<? extends Literal>) newValue);
			return;
		case EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LEVEL_JOANA:
			setLevel_JOANA((Level) newValue);
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
		case EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LITERALS_EDFA:
			getLiterals_EDFA().clear();
			return;
		case EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LEVEL_JOANA:
			setLevel_JOANA((Level) null);
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
		case EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LITERALS_EDFA:
			return literals_EDFA != null && !literals_EDFA.isEmpty();
		case EdfajoanacorrespondencesPackage.LITERALS_LEVEL_CORRESPONDENCE__LEVEL_JOANA:
			return level_JOANA != null;
		}
		return super.eIsSet(featureID);
	}

} //LiteralsLevelCorrespondenceImpl
