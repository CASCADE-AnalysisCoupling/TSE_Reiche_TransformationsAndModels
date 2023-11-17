/**
 */
package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Java Correspondence Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getBasiccomponent2class <em>Basiccomponent2class</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getOperationInterface2interface <em>Operation Interface2interface</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getCompositedatatype2class <em>Compositedatatype2class</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getProvidedoperationsignature2javamethod <em>Providedoperationsignature2javamethod</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot#getPcmparameter2javaparameter <em>Pcmparameter2javaparameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getPCMJavaCorrespondenceRoot()
 * @model
 * @generated
 */
public interface PCMJavaCorrespondenceRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Basiccomponent2class</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basiccomponent2class</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getPCMJavaCorrespondenceRoot_Basiccomponent2class()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicComponent2Class> getBasiccomponent2class();

	/**
	 * Returns the value of the '<em><b>Operation Interface2interface</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Interface2interface</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getPCMJavaCorrespondenceRoot_OperationInterface2interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationInterface2Interface> getOperationInterface2interface();

	/**
	 * Returns the value of the '<em><b>Compositedatatype2class</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositedatatype2class</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getPCMJavaCorrespondenceRoot_Compositedatatype2class()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeDataType2Class> getCompositedatatype2class();

	/**
	 * Returns the value of the '<em><b>Providedoperationsignature2javamethod</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedoperationsignature2javamethod</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getPCMJavaCorrespondenceRoot_Providedoperationsignature2javamethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedOperationSignature2JavaMethod> getProvidedoperationsignature2javamethod();

	/**
	 * Returns the value of the '<em><b>Pcmparameter2javaparameter</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmparameter2javaparameter</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondencePackage#getPCMJavaCorrespondenceRoot_Pcmparameter2javaparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCMParameter2JavaParameter> getPcmparameter2javaparameter();

} // PCMJavaCorrespondenceRoot
