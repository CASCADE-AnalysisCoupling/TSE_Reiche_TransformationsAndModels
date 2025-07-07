/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.impl;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.*;

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
public class JoanascarcorrespondencesFactoryImpl extends EFactoryImpl implements JoanascarcorrespondencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JoanascarcorrespondencesFactory init() {
		try {
			JoanascarcorrespondencesFactory theJoanascarcorrespondencesFactory = (JoanascarcorrespondencesFactory) EPackage.Registry.INSTANCE
					.getEFactory(JoanascarcorrespondencesPackage.eNS_URI);
			if (theJoanascarcorrespondencesFactory != null) {
				return theJoanascarcorrespondencesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JoanascarcorrespondencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanascarcorrespondencesFactoryImpl() {
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
		case JoanascarcorrespondencesPackage.JOANASCAR_CORRESPONDENCES:
			return createJOANASCARCorrespondences();
		case JoanascarcorrespondencesPackage.ENTRY_POINT_CORRESPONDENCE:
			return createEntryPointCorrespondence();
		case JoanascarcorrespondencesPackage.LEVEL_CORRESPONDENCE:
			return createLevelCorrespondence();
		case JoanascarcorrespondencesPackage.PARAMETER_CORRESPONDENCE:
			return createParameterCorrespondence();
		case JoanascarcorrespondencesPackage.FIELD_CORRESPONDENCE:
			return createFieldCorrespondence();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOANASCARCorrespondences createJOANASCARCorrespondences() {
		JOANASCARCorrespondencesImpl joanascarCorrespondences = new JOANASCARCorrespondencesImpl();
		return joanascarCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointCorrespondence createEntryPointCorrespondence() {
		EntryPointCorrespondenceImpl entryPointCorrespondence = new EntryPointCorrespondenceImpl();
		return entryPointCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelCorrespondence createLevelCorrespondence() {
		LevelCorrespondenceImpl levelCorrespondence = new LevelCorrespondenceImpl();
		return levelCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCorrespondence createParameterCorrespondence() {
		ParameterCorrespondenceImpl parameterCorrespondence = new ParameterCorrespondenceImpl();
		return parameterCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldCorrespondence createFieldCorrespondence() {
		FieldCorrespondenceImpl fieldCorrespondence = new FieldCorrespondenceImpl();
		return fieldCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanascarcorrespondencesPackage getJoanascarcorrespondencesPackage() {
		return (JoanascarcorrespondencesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JoanascarcorrespondencesPackage getPackage() {
		return JoanascarcorrespondencesPackage.eINSTANCE;
	}

} //JoanascarcorrespondencesFactoryImpl
