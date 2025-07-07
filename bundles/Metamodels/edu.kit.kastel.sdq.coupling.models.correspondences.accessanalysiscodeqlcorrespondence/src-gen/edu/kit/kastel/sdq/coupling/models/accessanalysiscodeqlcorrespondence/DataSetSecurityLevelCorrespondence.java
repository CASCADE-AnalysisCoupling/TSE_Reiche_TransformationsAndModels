/**
 */
package edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Security Level Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence#getSecurityLevel <em>Security Level</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage#getDataSetSecurityLevelCorrespondence()
 * @model
 * @generated
 */
public interface DataSetSecurityLevelCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Sets</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.data.DataSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sets</em>' reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage#getDataSetSecurityLevelCorrespondence_DataSets()
	 * @model required="true"
	 * @generated
	 */
	EList<DataSet> getDataSets();

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level</em>' reference.
	 * @see #setSecurityLevel(SecurityLevel)
	 * @see edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondencePackage#getDataSetSecurityLevelCorrespondence_SecurityLevel()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel getSecurityLevel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence#getSecurityLevel <em>Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' reference.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(SecurityLevel value);

} // DataSetSecurityLevelCorrespondence
