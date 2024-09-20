/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar.impl;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Flow;
import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage;
import edu.kit.kastel.sdq.coupling.models.joanascar.Sink;
import edu.kit.kastel.sdq.coupling.models.joanascar.Source;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.FlowImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.FlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.FlowImpl#getSink <em>Sink</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends MinimalEObjectImpl.Container implements Flow {
	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint_SCAR entryPoint;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source<?> source;

	/**
	 * The cached value of the '{@link #getSink() <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSink()
	 * @generated
	 * @ordered
	 */
	protected Sink<?> sink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanascarPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint_SCAR getEntryPoint() {
		if (entryPoint != null && entryPoint.eIsProxy()) {
			InternalEObject oldEntryPoint = (InternalEObject) entryPoint;
			entryPoint = (EntryPoint_SCAR) eResolveProxy(oldEntryPoint);
			if (entryPoint != oldEntryPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoanascarPackage.FLOW__ENTRY_POINT,
							oldEntryPoint, entryPoint));
			}
		}
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint_SCAR basicGetEntryPoint() {
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint(EntryPoint_SCAR newEntryPoint) {
		EntryPoint_SCAR oldEntryPoint = entryPoint;
		entryPoint = newEntryPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.FLOW__ENTRY_POINT, oldEntryPoint,
					entryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source<?> getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source<?> newSource, NotificationChain msgs) {
		Source<?> oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JoanascarPackage.FLOW__SOURCE, oldSource, newSource);
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
	public void setSource(Source<?> newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JoanascarPackage.FLOW__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JoanascarPackage.FLOW__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.FLOW__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sink<?> getSink() {
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSink(Sink<?> newSink, NotificationChain msgs) {
		Sink<?> oldSink = sink;
		sink = newSink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoanascarPackage.FLOW__SINK,
					oldSink, newSink);
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
	public void setSink(Sink<?> newSink) {
		if (newSink != sink) {
			NotificationChain msgs = null;
			if (sink != null)
				msgs = ((InternalEObject) sink).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JoanascarPackage.FLOW__SINK, null, msgs);
			if (newSink != null)
				msgs = ((InternalEObject) newSink).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JoanascarPackage.FLOW__SINK, null, msgs);
			msgs = basicSetSink(newSink, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.FLOW__SINK, newSink, newSink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JoanascarPackage.FLOW__SOURCE:
			return basicSetSource(null, msgs);
		case JoanascarPackage.FLOW__SINK:
			return basicSetSink(null, msgs);
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
		case JoanascarPackage.FLOW__ENTRY_POINT:
			if (resolve)
				return getEntryPoint();
			return basicGetEntryPoint();
		case JoanascarPackage.FLOW__SOURCE:
			return getSource();
		case JoanascarPackage.FLOW__SINK:
			return getSink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JoanascarPackage.FLOW__ENTRY_POINT:
			setEntryPoint((EntryPoint_SCAR) newValue);
			return;
		case JoanascarPackage.FLOW__SOURCE:
			setSource((Source<?>) newValue);
			return;
		case JoanascarPackage.FLOW__SINK:
			setSink((Sink<?>) newValue);
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
		case JoanascarPackage.FLOW__ENTRY_POINT:
			setEntryPoint((EntryPoint_SCAR) null);
			return;
		case JoanascarPackage.FLOW__SOURCE:
			setSource((Source<?>) null);
			return;
		case JoanascarPackage.FLOW__SINK:
			setSink((Sink<?>) null);
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
		case JoanascarPackage.FLOW__ENTRY_POINT:
			return entryPoint != null;
		case JoanascarPackage.FLOW__SOURCE:
			return source != null;
		case JoanascarPackage.FLOW__SINK:
			return sink != null;
		}
		return super.eIsSet(featureID);
	}

} //FlowImpl
