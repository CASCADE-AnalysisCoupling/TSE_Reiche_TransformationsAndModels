/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Code Analysis Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getSystemElements <em>System Elements</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getLevels <em>Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSourceCodeAnalysisResult()
 * @model
 * @generated
 */
public interface SourceCodeAnalysisResult extends EObject {
	/**
	 * Returns the value of the '<em><b>System Elements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanascar.SystemElement_SCAR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Elements</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSourceCodeAnalysisResult_SystemElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemElement_SCAR> getSystemElements();

	/**
	 * Returns the value of the '<em><b>Entry Points</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Points</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSourceCodeAnalysisResult_EntryPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntryPoint_SCAR> getEntryPoints();

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSourceCodeAnalysisResult_Levels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Level_SCAR> getLevels();

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.coupling.models.joanascar.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getSourceCodeAnalysisResult_Flows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flow> getFlows();

} // SourceCodeAnalysisResult
