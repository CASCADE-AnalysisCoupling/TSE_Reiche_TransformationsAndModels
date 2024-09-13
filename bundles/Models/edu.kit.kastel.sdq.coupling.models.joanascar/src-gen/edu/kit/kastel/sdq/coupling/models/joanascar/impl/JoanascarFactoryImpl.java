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
		case JoanascarPackage.PARAMETER_SCAR:
			return createParameter_SCAR();
		case JoanascarPackage.FIELD_SCAR:
			return createField_SCAR();
		case JoanascarPackage.LEVEL_SCAR:
			return createLevel_SCAR();
		case JoanascarPackage.ENTRY_POINT_SCAR:
			return createEntryPoint_SCAR();
		case JoanascarPackage.FLOW:
			return createFlow();
		case JoanascarPackage.SOURCE:
			return createSource();
		case JoanascarPackage.SINK:
			return createSink();
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
	public Level_SCAR createLevel_SCAR() {
		Level_SCARImpl level_SCAR = new Level_SCARImpl();
		return level_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint_SCAR createEntryPoint_SCAR() {
		EntryPoint_SCARImpl entryPoint_SCAR = new EntryPoint_SCARImpl();
		return entryPoint_SCAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends SystemElement_SCAR> Source<T> createSource() {
		SourceImpl<T> source = new SourceImpl<T>();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends SystemElement_SCAR> Sink<T> createSink() {
		SinkImpl<T> sink = new SinkImpl<T>();
		return sink;
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
