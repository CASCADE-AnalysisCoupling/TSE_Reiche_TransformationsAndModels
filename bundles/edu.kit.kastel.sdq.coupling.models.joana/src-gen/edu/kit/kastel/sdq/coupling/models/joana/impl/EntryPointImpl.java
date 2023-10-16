/**
 */
package edu.kit.kastel.sdq.coupling.models.joana.impl;

import edu.kit.kastel.sdq.coupling.models.joana.Annotation;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.impl.EntryPointImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.impl.EntryPointImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryPointImpl extends MinimalEObjectImpl.Container implements EntryPoint {
	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<Level> level;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaPackage.Literals.ENTRY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Level> getLevel() {
		if (level == null) {
			level = new EObjectResolvingEList<Level>(Level.class, this, JoanaPackage.ENTRY_POINT__LEVEL);
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectResolvingEList<Annotation>(Annotation.class, this,
					JoanaPackage.ENTRY_POINT__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanaPackage.ENTRY_POINT__LEVEL:
			return getLevel();
		case JoanaPackage.ENTRY_POINT__ANNOTATION:
			return getAnnotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JoanaPackage.ENTRY_POINT__LEVEL:
			getLevel().clear();
			getLevel().addAll((Collection<? extends Level>) newValue);
			return;
		case JoanaPackage.ENTRY_POINT__ANNOTATION:
			getAnnotation().clear();
			getAnnotation().addAll((Collection<? extends Annotation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JoanaPackage.ENTRY_POINT__LEVEL:
			getLevel().clear();
			return;
		case JoanaPackage.ENTRY_POINT__ANNOTATION:
			getAnnotation().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JoanaPackage.ENTRY_POINT__LEVEL:
			return level != null && !level.isEmpty();
		case JoanaPackage.ENTRY_POINT__ANNOTATION:
			return annotation != null && !annotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntryPointImpl
