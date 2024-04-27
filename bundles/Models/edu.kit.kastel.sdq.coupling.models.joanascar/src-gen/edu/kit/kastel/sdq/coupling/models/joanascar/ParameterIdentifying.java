/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Identifying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getParameterIndex <em>Parameter Index</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getParameterIdentifying()
 * @model
 * @generated
 */
public interface ParameterIdentifying extends SystemElementIdentifiying_JOANASCAR {
	/**
	 * Returns the value of the '<em><b>Parameter Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Index</em>' attribute.
	 * @see #setParameterIndex(int)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getParameterIdentifying_ParameterIndex()
	 * @model required="true"
	 * @generated
	 */
	int getParameterIndex();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getParameterIndex <em>Parameter Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Index</em>' attribute.
	 * @see #getParameterIndex()
	 * @generated
	 */
	void setParameterIndex(int value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see #setParameterType(String)
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getParameterIdentifying_ParameterType()
	 * @model required="true"
	 * @generated
	 */
	String getParameterType();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getParameterType <em>Parameter Type</em>}' attribute.
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
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getParameterIdentifying_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getMethodName <em>Method Name</em>}' attribute.
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
	 * @see edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage#getParameterIdentifying_FullyQualifiedClassName()
	 * @model required="true"
	 * @generated
	 */
	String getFullyQualifiedClassName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 */
	void setFullyQualifiedClassName(String value);

} // ParameterIdentifying
