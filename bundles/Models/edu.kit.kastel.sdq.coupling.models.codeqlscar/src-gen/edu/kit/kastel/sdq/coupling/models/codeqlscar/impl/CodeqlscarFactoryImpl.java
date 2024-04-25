/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar.impl;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeqlscarFactoryImpl extends EFactoryImpl implements CodeqlscarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeqlscarFactory init() {
		try {
			CodeqlscarFactory theCodeqlscarFactory = (CodeqlscarFactory) EPackage.Registry.INSTANCE
					.getEFactory(CodeqlscarPackage.eNS_URI);
			if (theCodeqlscarFactory != null) {
				return theCodeqlscarFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeqlscarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlscarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CodeqlscarPackage.SOURCE_CODE_ANALYSIS_RESULT:
			return createSourceCodeAnalysisResult();
		case CodeqlscarPackage.RESULT_ENTRY:
			return createResultEntry();
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT:
			return createResultEntryElement();
		case CodeqlscarPackage.CONFIGURATION_ID_SCAR:
			return createConfigurationID_SCAR();
		case CodeqlscarPackage.PARAMETER_IDENTIFICATION:
			return createParameterIdentification();
		case CodeqlscarPackage.FIELD_IDENTIFICATION:
			return createFieldIdentification();
		case CodeqlscarPackage.SECURITY_LEVEL_SCAR:
			return createSecurityLevel_SCAR();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeAnalysisResult createSourceCodeAnalysisResult() {
		SourceCodeAnalysisResultImpl sourceCodeAnalysisResult = new SourceCodeAnalysisResultImpl();
		return sourceCodeAnalysisResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultEntry createResultEntry() {
		ResultEntryImpl resultEntry = new ResultEntryImpl();
		return resultEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends SystemElementIdentification> ResultEntryElement<T> createResultEntryElement() {
		ResultEntryElementImpl<T> resultEntryElement = new ResultEntryElementImpl<T>();
		return resultEntryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationID_SCAR createConfigurationID_SCAR() {
		ConfigurationID_SCARImpl configurationID_SCAR = new ConfigurationID_SCARImpl();
		return configurationID_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentification createParameterIdentification() {
		ParameterIdentificationImpl parameterIdentification = new ParameterIdentificationImpl();
		return parameterIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldIdentification createFieldIdentification() {
		FieldIdentificationImpl fieldIdentification = new FieldIdentificationImpl();
		return fieldIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel_SCAR createSecurityLevel_SCAR() {
		SecurityLevel_SCARImpl securityLevel_SCAR = new SecurityLevel_SCARImpl();
		return securityLevel_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeqlscarPackage getCodeqlscarPackage() {
		return (CodeqlscarPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodeqlscarPackage getPackage() {
		return CodeqlscarPackage.eINSTANCE;
	}

} //CodeqlscarFactoryImpl
