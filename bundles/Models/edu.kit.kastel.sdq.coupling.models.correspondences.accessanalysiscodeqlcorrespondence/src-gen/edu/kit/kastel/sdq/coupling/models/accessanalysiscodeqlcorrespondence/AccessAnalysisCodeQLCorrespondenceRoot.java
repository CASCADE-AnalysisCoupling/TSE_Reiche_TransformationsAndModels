/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Analysis Code QL Correspondence Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot#getConfigurationCorrespondences_AccessAnalysisCodeQL <em>Configuration Correspondences Access Analysis Code QL</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot#getDataSetSecurityLevelCorrespondence <em>Data Set Security Level Correspondence</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage#getAccessAnalysisCodeQLCorrespondenceRoot()
 * @model
 * @generated
 */
public interface AccessAnalysisCodeQLCorrespondenceRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Correspondences Access Analysis Code QL</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Correspondences Access Analysis Code QL</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage#getAccessAnalysisCodeQLCorrespondenceRoot_ConfigurationCorrespondences_AccessAnalysisCodeQL()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationCorrespondence> getConfigurationCorrespondences_AccessAnalysisCodeQL();

	/**
	 * Returns the value of the '<em><b>Data Set Security Level Correspondence</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Security Level Correspondence</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage#getAccessAnalysisCodeQLCorrespondenceRoot_DataSetSecurityLevelCorrespondence()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSetSecurityLevelCorrespondence> getDataSetSecurityLevelCorrespondence();

} // AccessAnalysisCodeQLCorrespondenceRoot
