/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter SCAR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getParameter_SCAR()
 * @model
 * @generated
 */
public interface Parameter_SCAR extends SystemElement {
	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getParameter_SCAR_ParameterName()
	 * @model required="true"
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see #setParameterType(String)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getParameter_SCAR_ParameterType()
	 * @model required="true"
	 * @generated
	 */
	String getParameterType();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getParameterType <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' attribute.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(String value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getParameter_SCAR_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #setFullyQualifiedClassName(String)
	 * @see edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage#getParameter_SCAR_FullyQualifiedClassName()
	 * @model required="true"
	 * @generated
	 */
	String getFullyQualifiedClassName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 */
	void setFullyQualifiedClassName(String value);

} // Parameter_SCAR
