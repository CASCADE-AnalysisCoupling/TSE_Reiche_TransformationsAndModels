/**
 */
package edu.kit.kastel.sdq.coupling.models.joanascar.impl;

import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.JoanascarPackage;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryImpl#getSource <em>Source</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.joanascar.impl.ResultEntryImpl#getSink <em>Sink</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultEntryImpl extends MinimalEObjectImpl.Container implements ResultEntry {
	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EntryPointIdentifying entryPoint;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ResultEntryElement<?> source;

	/**
	 * The cached value of the '{@link #getSink() <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSink()
	 * @generated
	 * @ordered
	 */
	protected ResultEntryElement<?> sink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanascarPackage.Literals.RESULT_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointIdentifying getEntryPoint() {
		if (entryPoint != null && entryPoint.eIsProxy()) {
			InternalEObject oldEntryPoint = (InternalEObject) entryPoint;
			entryPoint = (EntryPointIdentifying) eResolveProxy(oldEntryPoint);
			if (entryPoint != oldEntryPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanascarPackage.RESULT_ENTRY__ENTRY_POINT, oldEntryPoint, entryPoint));
			}
		}
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointIdentifying basicGetEntryPoint() {
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint(EntryPointIdentifying newEntryPoint) {
		EntryPointIdentifying oldEntryPoint = entryPoint;
		entryPoint = newEntryPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.RESULT_ENTRY__ENTRY_POINT,
					oldEntryPoint, entryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultEntryElement<?> getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ResultEntryElement<?> newSource, NotificationChain msgs) {
		ResultEntryElement<?> oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JoanascarPackage.RESULT_ENTRY__SOURCE, oldSource, newSource);
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
	public void setSource(ResultEntryElement<?> newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JoanascarPackage.RESULT_ENTRY__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JoanascarPackage.RESULT_ENTRY__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.RESULT_ENTRY__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultEntryElement<?> getSink() {
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSink(ResultEntryElement<?> newSink, NotificationChain msgs) {
		ResultEntryElement<?> oldSink = sink;
		sink = newSink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JoanascarPackage.RESULT_ENTRY__SINK, oldSink, newSink);
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
	public void setSink(ResultEntryElement<?> newSink) {
		if (newSink != sink) {
			NotificationChain msgs = null;
			if (sink != null)
				msgs = ((InternalEObject) sink).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JoanascarPackage.RESULT_ENTRY__SINK, null, msgs);
			if (newSink != null)
				msgs = ((InternalEObject) newSink).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JoanascarPackage.RESULT_ENTRY__SINK, null, msgs);
			msgs = basicSetSink(newSink, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanascarPackage.RESULT_ENTRY__SINK, newSink,
					newSink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JoanascarPackage.RESULT_ENTRY__SOURCE:
			return basicSetSource(null, msgs);
		case JoanascarPackage.RESULT_ENTRY__SINK:
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
		case JoanascarPackage.RESULT_ENTRY__ENTRY_POINT:
			if (resolve)
				return getEntryPoint();
			return basicGetEntryPoint();
		case JoanascarPackage.RESULT_ENTRY__SOURCE:
			return getSource();
		case JoanascarPackage.RESULT_ENTRY__SINK:
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
		case JoanascarPackage.RESULT_ENTRY__ENTRY_POINT:
			setEntryPoint((EntryPointIdentifying) newValue);
			return;
		case JoanascarPackage.RESULT_ENTRY__SOURCE:
			setSource((ResultEntryElement<?>) newValue);
			return;
		case JoanascarPackage.RESULT_ENTRY__SINK:
			setSink((ResultEntryElement<?>) newValue);
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
		case JoanascarPackage.RESULT_ENTRY__ENTRY_POINT:
			setEntryPoint((EntryPointIdentifying) null);
			return;
		case JoanascarPackage.RESULT_ENTRY__SOURCE:
			setSource((ResultEntryElement<?>) null);
			return;
		case JoanascarPackage.RESULT_ENTRY__SINK:
			setSink((ResultEntryElement<?>) null);
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
		case JoanascarPackage.RESULT_ENTRY__ENTRY_POINT:
			return entryPoint != null;
		case JoanascarPackage.RESULT_ENTRY__SOURCE:
			return source != null;
		case JoanascarPackage.RESULT_ENTRY__SINK:
			return sink != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultEntryImpl
