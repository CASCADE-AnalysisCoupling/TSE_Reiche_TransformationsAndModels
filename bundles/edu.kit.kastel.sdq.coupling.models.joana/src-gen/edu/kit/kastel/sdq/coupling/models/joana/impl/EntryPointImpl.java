/**
 */
package edu.kit.kastel.sdq.coupling.models.joana.impl;

import edu.kit.kastel.sdq.coupling.models.identifier.impl.IdentifiedElementImpl;

import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation;
import edu.kit.kastel.sdq.coupling.models.joana.JoanaPackage;
import edu.kit.kastel.sdq.coupling.models.joana.Lattice;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.impl.EntryPointImpl#getLattice <em>Lattice</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joana.impl.EntryPointImpl#getMethodIdentification <em>Method Identification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryPointImpl extends IdentifiedElementImpl implements EntryPoint {
	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<Level> level;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationFlowAnnotation> annotation;

	/**
	 * The cached value of the '{@link #getLattice() <em>Lattice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLattice()
	 * @generated
	 * @ordered
	 */
	protected Lattice lattice;

	/**
	 * The cached value of the '{@link #getMethodIdentification() <em>Method Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodIdentification()
	 * @generated
	 * @ordered
	 */
	protected MethodIdentifying methodIdentification;

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
			level = new EObjectContainmentEList<Level>(Level.class, this, JoanaPackage.ENTRY_POINT__LEVEL);
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformationFlowAnnotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<InformationFlowAnnotation>(InformationFlowAnnotation.class, this,
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
	public Lattice getLattice() {
		return lattice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLattice(Lattice newLattice, NotificationChain msgs) {
		Lattice oldLattice = lattice;
		lattice = newLattice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JoanaPackage.ENTRY_POINT__LATTICE, oldLattice, newLattice);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLattice(Lattice newLattice) {
		if (newLattice != lattice) {
			NotificationChain msgs = null;
			if (lattice != null)
				msgs = ((InternalEObject) lattice).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JoanaPackage.ENTRY_POINT__LATTICE, null, msgs);
			if (newLattice != null)
				msgs = ((InternalEObject) newLattice).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JoanaPackage.ENTRY_POINT__LATTICE, null, msgs);
			msgs = basicSetLattice(newLattice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaPackage.ENTRY_POINT__LATTICE, newLattice,
					newLattice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodIdentifying getMethodIdentification() {
		return methodIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodIdentification(MethodIdentifying newMethodIdentification,
			NotificationChain msgs) {
		MethodIdentifying oldMethodIdentification = methodIdentification;
		methodIdentification = newMethodIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JoanaPackage.ENTRY_POINT__METHOD_IDENTIFICATION, oldMethodIdentification, newMethodIdentification);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodIdentification(MethodIdentifying newMethodIdentification) {
		if (newMethodIdentification != methodIdentification) {
			NotificationChain msgs = null;
			if (methodIdentification != null)
				msgs = ((InternalEObject) methodIdentification).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JoanaPackage.ENTRY_POINT__METHOD_IDENTIFICATION, null, msgs);
			if (newMethodIdentification != null)
				msgs = ((InternalEObject) newMethodIdentification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JoanaPackage.ENTRY_POINT__METHOD_IDENTIFICATION, null, msgs);
			msgs = basicSetMethodIdentification(newMethodIdentification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaPackage.ENTRY_POINT__METHOD_IDENTIFICATION,
					newMethodIdentification, newMethodIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JoanaPackage.ENTRY_POINT__LEVEL:
			return ((InternalEList<?>) getLevel()).basicRemove(otherEnd, msgs);
		case JoanaPackage.ENTRY_POINT__ANNOTATION:
			return ((InternalEList<?>) getAnnotation()).basicRemove(otherEnd, msgs);
		case JoanaPackage.ENTRY_POINT__LATTICE:
			return basicSetLattice(null, msgs);
		case JoanaPackage.ENTRY_POINT__METHOD_IDENTIFICATION:
			return basicSetMethodIdentification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case JoanaPackage.ENTRY_POINT__LATTICE:
			return getLattice();
		case JoanaPackage.ENTRY_POINT__METHOD_IDENTIFICATION:
			return getMethodIdentification();
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
			getAnnotation().addAll((Collection<? extends InformationFlowAnnotation>) newValue);
			return;
		case JoanaPackage.ENTRY_POINT__LATTICE:
			setLattice((Lattice) newValue);
			return;
		case JoanaPackage.ENTRY_POINT__METHOD_IDENTIFICATION:
			setMethodIdentification((MethodIdentifying) newValue);
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
		case JoanaPackage.ENTRY_POINT__LATTICE:
			setLattice((Lattice) null);
			return;
		case JoanaPackage.ENTRY_POINT__METHOD_IDENTIFICATION:
			setMethodIdentification((MethodIdentifying) null);
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
		case JoanaPackage.ENTRY_POINT__LATTICE:
			return lattice != null;
		case JoanaPackage.ENTRY_POINT__METHOD_IDENTIFICATION:
			return methodIdentification != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryPointImpl
