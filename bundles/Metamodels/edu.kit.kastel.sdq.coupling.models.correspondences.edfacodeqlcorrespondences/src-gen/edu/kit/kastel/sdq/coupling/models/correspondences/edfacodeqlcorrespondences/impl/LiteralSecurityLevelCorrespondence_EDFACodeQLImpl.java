/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesPackage;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL;

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
 * An implementation of the model object '<em><b>Literal Security Level Correspondence EDFA Code QL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.LiteralSecurityLevelCorrespondence_EDFACodeQLImpl#getSecurityLevel_CodeQL <em>Security Level Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.impl.LiteralSecurityLevelCorrespondence_EDFACodeQLImpl#getLiterals_EDFA <em>Literals EDFA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralSecurityLevelCorrespondence_EDFACodeQLImpl extends MinimalEObjectImpl.Container
		implements LiteralSecurityLevelCorrespondence_EDFACodeQL {
	/**
	 * The cached value of the '{@link #getSecurityLevel_CodeQL() <em>Security Level Code QL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel_CodeQL()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel securityLevel_CodeQL;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralSecurityLevelCorrespondence_EDFACodeQLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdfacodeqlcorrespondencesPackage.Literals.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel getSecurityLevel_CodeQL() {
		if (securityLevel_CodeQL != null && securityLevel_CodeQL.eIsProxy()) {
			InternalEObject oldSecurityLevel_CodeQL = (InternalEObject) securityLevel_CodeQL;
			securityLevel_CodeQL = (SecurityLevel) eResolveProxy(oldSecurityLevel_CodeQL);
			if (securityLevel_CodeQL != oldSecurityLevel_CodeQL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__SECURITY_LEVEL_CODE_QL,
							oldSecurityLevel_CodeQL, securityLevel_CodeQL));
			}
		}
		return securityLevel_CodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel basicGetSecurityLevel_CodeQL() {
		return securityLevel_CodeQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityLevel_CodeQL(SecurityLevel newSecurityLevel_CodeQL) {
		SecurityLevel oldSecurityLevel_CodeQL = securityLevel_CodeQL;
		securityLevel_CodeQL = newSecurityLevel_CodeQL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__SECURITY_LEVEL_CODE_QL,
					oldSecurityLevel_CodeQL, securityLevel_CodeQL));
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
					EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__LITERALS_EDFA);
		}
		return literals_EDFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__SECURITY_LEVEL_CODE_QL:
			if (resolve)
				return getSecurityLevel_CodeQL();
			return basicGetSecurityLevel_CodeQL();
		case EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__LITERALS_EDFA:
			return getLiterals_EDFA();
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
		case EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__SECURITY_LEVEL_CODE_QL:
			setSecurityLevel_CodeQL((SecurityLevel) newValue);
			return;
		case EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__LITERALS_EDFA:
			getLiterals_EDFA().clear();
			getLiterals_EDFA().addAll((Collection<? extends Literal>) newValue);
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
		case EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__SECURITY_LEVEL_CODE_QL:
			setSecurityLevel_CodeQL((SecurityLevel) null);
			return;
		case EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__LITERALS_EDFA:
			getLiterals_EDFA().clear();
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
		case EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__SECURITY_LEVEL_CODE_QL:
			return securityLevel_CodeQL != null;
		case EdfacodeqlcorrespondencesPackage.LITERAL_SECURITY_LEVEL_CORRESPONDENCE_EDFA_CODE_QL__LITERALS_EDFA:
			return literals_EDFA != null && !literals_EDFA.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LiteralSecurityLevelCorrespondence_EDFACodeQLImpl
