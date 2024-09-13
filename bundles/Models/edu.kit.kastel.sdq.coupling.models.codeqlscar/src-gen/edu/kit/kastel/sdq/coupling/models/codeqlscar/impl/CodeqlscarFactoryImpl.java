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
		case CodeqlscarPackage.RESULT:
			return createResult();
		case CodeqlscarPackage.RESULT_ENTRY_ELEMENT:
			return createResultEntryElement();
		case CodeqlscarPackage.RULE_ID:
			return createRuleId();
		case CodeqlscarPackage.PARAMETER_SCAR:
			return createParameter_SCAR();
		case CodeqlscarPackage.FIELD_SCAR:
			return createField_SCAR();
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
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends SystemElement> ResultEntryElement<T> createResultEntryElement() {
		ResultEntryElementImpl<T> resultEntryElement = new ResultEntryElementImpl<T>();
		return resultEntryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleId createRuleId() {
		RuleIdImpl ruleId = new RuleIdImpl();
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter_SCAR createParameter_SCAR() {
		Parameter_SCARImpl parameter_SCAR = new Parameter_SCARImpl();
		return parameter_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field_SCAR createField_SCAR() {
		Field_SCARImpl field_SCAR = new Field_SCARImpl();
		return field_SCAR;
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
