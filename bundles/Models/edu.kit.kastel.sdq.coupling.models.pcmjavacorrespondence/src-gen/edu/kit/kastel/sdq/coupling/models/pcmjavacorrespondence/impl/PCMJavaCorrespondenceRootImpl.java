/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl;

import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod;

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
 * An implementation of the model object '<em><b>PCM Java Correspondence Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMJavaCorrespondenceRootImpl#getBasiccomponent2class <em>Basiccomponent2class</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMJavaCorrespondenceRootImpl#getOperationInterface2interface <em>Operation Interface2interface</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMJavaCorrespondenceRootImpl#getCompositedatatype2class <em>Compositedatatype2class</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMJavaCorrespondenceRootImpl#getProvidedoperationsignature2javamethod <em>Providedoperationsignature2javamethod</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.impl.PCMJavaCorrespondenceRootImpl#getPcmparameter2javaparameter <em>Pcmparameter2javaparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMJavaCorrespondenceRootImpl extends MinimalEObjectImpl.Container implements PCMJavaCorrespondenceRoot {
	/**
	 * The cached value of the '{@link #getBasiccomponent2class() <em>Basiccomponent2class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasiccomponent2class()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicComponent2Class> basiccomponent2class;

	/**
	 * The cached value of the '{@link #getOperationInterface2interface() <em>Operation Interface2interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationInterface2interface()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationInterface2Interface> operationInterface2interface;

	/**
	 * The cached value of the '{@link #getCompositedatatype2class() <em>Compositedatatype2class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositedatatype2class()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeDataType2Class> compositedatatype2class;

	/**
	 * The cached value of the '{@link #getProvidedoperationsignature2javamethod() <em>Providedoperationsignature2javamethod</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedoperationsignature2javamethod()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedOperationSignature2JavaMethod> providedoperationsignature2javamethod;

	/**
	 * The cached value of the '{@link #getPcmparameter2javaparameter() <em>Pcmparameter2javaparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmparameter2javaparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMParameter2JavaParameter> pcmparameter2javaparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMJavaCorrespondenceRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmjavacorrespondencePackage.Literals.PCM_JAVA_CORRESPONDENCE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicComponent2Class> getBasiccomponent2class() {
		if (basiccomponent2class == null) {
			basiccomponent2class = new EObjectContainmentEList<BasicComponent2Class>(BasicComponent2Class.class, this,
					PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__BASICCOMPONENT2CLASS);
		}
		return basiccomponent2class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationInterface2Interface> getOperationInterface2interface() {
		if (operationInterface2interface == null) {
			operationInterface2interface = new EObjectContainmentEList<OperationInterface2Interface>(
					OperationInterface2Interface.class, this,
					PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__OPERATION_INTERFACE2INTERFACE);
		}
		return operationInterface2interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeDataType2Class> getCompositedatatype2class() {
		if (compositedatatype2class == null) {
			compositedatatype2class = new EObjectContainmentEList<CompositeDataType2Class>(
					CompositeDataType2Class.class, this,
					PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__COMPOSITEDATATYPE2CLASS);
		}
		return compositedatatype2class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedOperationSignature2JavaMethod> getProvidedoperationsignature2javamethod() {
		if (providedoperationsignature2javamethod == null) {
			providedoperationsignature2javamethod = new EObjectContainmentEList<ProvidedOperationSignature2JavaMethod>(
					ProvidedOperationSignature2JavaMethod.class, this,
					PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PROVIDEDOPERATIONSIGNATURE2JAVAMETHOD);
		}
		return providedoperationsignature2javamethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCMParameter2JavaParameter> getPcmparameter2javaparameter() {
		if (pcmparameter2javaparameter == null) {
			pcmparameter2javaparameter = new EObjectContainmentEList<PCMParameter2JavaParameter>(
					PCMParameter2JavaParameter.class, this,
					PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PCMPARAMETER2JAVAPARAMETER);
		}
		return pcmparameter2javaparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__BASICCOMPONENT2CLASS:
			return ((InternalEList<?>) getBasiccomponent2class()).basicRemove(otherEnd, msgs);
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__OPERATION_INTERFACE2INTERFACE:
			return ((InternalEList<?>) getOperationInterface2interface()).basicRemove(otherEnd, msgs);
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__COMPOSITEDATATYPE2CLASS:
			return ((InternalEList<?>) getCompositedatatype2class()).basicRemove(otherEnd, msgs);
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PROVIDEDOPERATIONSIGNATURE2JAVAMETHOD:
			return ((InternalEList<?>) getProvidedoperationsignature2javamethod()).basicRemove(otherEnd, msgs);
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PCMPARAMETER2JAVAPARAMETER:
			return ((InternalEList<?>) getPcmparameter2javaparameter()).basicRemove(otherEnd, msgs);
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
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__BASICCOMPONENT2CLASS:
			return getBasiccomponent2class();
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__OPERATION_INTERFACE2INTERFACE:
			return getOperationInterface2interface();
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__COMPOSITEDATATYPE2CLASS:
			return getCompositedatatype2class();
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PROVIDEDOPERATIONSIGNATURE2JAVAMETHOD:
			return getProvidedoperationsignature2javamethod();
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PCMPARAMETER2JAVAPARAMETER:
			return getPcmparameter2javaparameter();
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
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__BASICCOMPONENT2CLASS:
			getBasiccomponent2class().clear();
			getBasiccomponent2class().addAll((Collection<? extends BasicComponent2Class>) newValue);
			return;
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__OPERATION_INTERFACE2INTERFACE:
			getOperationInterface2interface().clear();
			getOperationInterface2interface().addAll((Collection<? extends OperationInterface2Interface>) newValue);
			return;
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__COMPOSITEDATATYPE2CLASS:
			getCompositedatatype2class().clear();
			getCompositedatatype2class().addAll((Collection<? extends CompositeDataType2Class>) newValue);
			return;
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PROVIDEDOPERATIONSIGNATURE2JAVAMETHOD:
			getProvidedoperationsignature2javamethod().clear();
			getProvidedoperationsignature2javamethod()
					.addAll((Collection<? extends ProvidedOperationSignature2JavaMethod>) newValue);
			return;
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PCMPARAMETER2JAVAPARAMETER:
			getPcmparameter2javaparameter().clear();
			getPcmparameter2javaparameter().addAll((Collection<? extends PCMParameter2JavaParameter>) newValue);
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
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__BASICCOMPONENT2CLASS:
			getBasiccomponent2class().clear();
			return;
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__OPERATION_INTERFACE2INTERFACE:
			getOperationInterface2interface().clear();
			return;
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__COMPOSITEDATATYPE2CLASS:
			getCompositedatatype2class().clear();
			return;
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PROVIDEDOPERATIONSIGNATURE2JAVAMETHOD:
			getProvidedoperationsignature2javamethod().clear();
			return;
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PCMPARAMETER2JAVAPARAMETER:
			getPcmparameter2javaparameter().clear();
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
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__BASICCOMPONENT2CLASS:
			return basiccomponent2class != null && !basiccomponent2class.isEmpty();
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__OPERATION_INTERFACE2INTERFACE:
			return operationInterface2interface != null && !operationInterface2interface.isEmpty();
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__COMPOSITEDATATYPE2CLASS:
			return compositedatatype2class != null && !compositedatatype2class.isEmpty();
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PROVIDEDOPERATIONSIGNATURE2JAVAMETHOD:
			return providedoperationsignature2javamethod != null && !providedoperationsignature2javamethod.isEmpty();
		case PcmjavacorrespondencePackage.PCM_JAVA_CORRESPONDENCE_ROOT__PCMPARAMETER2JAVAPARAMETER:
			return pcmparameter2javaparameter != null && !pcmparameter2javaparameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCMJavaCorrespondenceRootImpl
