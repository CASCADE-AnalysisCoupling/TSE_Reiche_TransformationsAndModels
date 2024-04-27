/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar.impl;

import edu.kit.kastel.sdq.coupling.models.joanascar.*;

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
public class JoanascarFactoryImpl extends EFactoryImpl implements JoanascarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JoanascarFactory init() {
		try {
			JoanascarFactory theJoanascarFactory = (JoanascarFactory) EPackage.Registry.INSTANCE
					.getEFactory(JoanascarPackage.eNS_URI);
			if (theJoanascarFactory != null) {
				return theJoanascarFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JoanascarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanascarFactoryImpl() {
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
		case JoanascarPackage.SOURCE_CODE_ANALYSIS_RESULT:
			return createSourceCodeAnalysisResult();
		case JoanascarPackage.PARAMETER_IDENTIFYING:
			return createParameterIdentifying();
		case JoanascarPackage.FIELD_IDENTIFYING:
			return createFieldIdentifying();
		case JoanascarPackage.LEVEL_SCAR:
			return createLevel_SCAR();
		case JoanascarPackage.ENTRY_POINT_IDENTIFYING:
			return createEntryPointIdentifying();
		case JoanascarPackage.RESULT_ENTRY:
			return createResultEntry();
		case JoanascarPackage.RESULT_ENTRY_ELEMENT:
			return createResultEntryElement();
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
	public ParameterIdentifying createParameterIdentifying() {
		ParameterIdentifyingImpl parameterIdentifying = new ParameterIdentifyingImpl();
		return parameterIdentifying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldIdentifying createFieldIdentifying() {
		FieldIdentifyingImpl fieldIdentifying = new FieldIdentifyingImpl();
		return fieldIdentifying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level_SCAR createLevel_SCAR() {
		Level_SCARImpl level_SCAR = new Level_SCARImpl();
		return level_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointIdentifying createEntryPointIdentifying() {
		EntryPointIdentifyingImpl entryPointIdentifying = new EntryPointIdentifyingImpl();
		return entryPointIdentifying;
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
	public <T extends SystemElementIdentifiying_JOANASCAR> ResultEntryElement<T> createResultEntryElement() {
		ResultEntryElementImpl<T> resultEntryElement = new ResultEntryElementImpl<T>();
		return resultEntryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanascarPackage getJoanascarPackage() {
		return (JoanascarPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JoanascarPackage getPackage() {
		return JoanascarPackage.eINSTANCE;
	}

} //JoanascarFactoryImpl
