/**
 */
package edu.kit.kastel.sdq.coupling.models.codeqlscar.impl;

import edu.kit.kastel.sdq.coupling.models.codeqlscar.CodeqlscarPackage;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Result;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultImpl#getSource <em>Source</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultImpl#getSink <em>Sink</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.coupling.models.codeqlscar.impl.ResultImpl#getRuleId <em>Rule Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultImpl extends MinimalEObjectImpl.Container implements Result {
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
	 * The cached value of the '{@link #getRuleId() <em>Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected RuleId ruleId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeqlscarPackage.Literals.RESULT;
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
					CodeqlscarPackage.RESULT__SOURCE, oldSource, newSource);
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
						EOPPOSITE_FEATURE_BASE - CodeqlscarPackage.RESULT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CodeqlscarPackage.RESULT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeqlscarPackage.RESULT__SOURCE, newSource,
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
					CodeqlscarPackage.RESULT__SINK, oldSink, newSink);
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
						EOPPOSITE_FEATURE_BASE - CodeqlscarPackage.RESULT__SINK, null, msgs);
			if (newSink != null)
				msgs = ((InternalEObject) newSink).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CodeqlscarPackage.RESULT__SINK, null, msgs);
			msgs = basicSetSink(newSink, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeqlscarPackage.RESULT__SINK, newSink, newSink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleId getRuleId() {
		if (ruleId != null && ruleId.eIsProxy()) {
			InternalEObject oldRuleId = (InternalEObject) ruleId;
			ruleId = (RuleId) eResolveProxy(oldRuleId);
			if (ruleId != oldRuleId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodeqlscarPackage.RESULT__RULE_ID,
							oldRuleId, ruleId));
			}
		}
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleId basicGetRuleId() {
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleId(RuleId newRuleId) {
		RuleId oldRuleId = ruleId;
		ruleId = newRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeqlscarPackage.RESULT__RULE_ID, oldRuleId,
					ruleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CodeqlscarPackage.RESULT__SOURCE:
			return basicSetSource(null, msgs);
		case CodeqlscarPackage.RESULT__SINK:
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
		case CodeqlscarPackage.RESULT__SOURCE:
			return getSource();
		case CodeqlscarPackage.RESULT__SINK:
			return getSink();
		case CodeqlscarPackage.RESULT__RULE_ID:
			if (resolve)
				return getRuleId();
			return basicGetRuleId();
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
		case CodeqlscarPackage.RESULT__SOURCE:
			setSource((ResultEntryElement<?>) newValue);
			return;
		case CodeqlscarPackage.RESULT__SINK:
			setSink((ResultEntryElement<?>) newValue);
			return;
		case CodeqlscarPackage.RESULT__RULE_ID:
			setRuleId((RuleId) newValue);
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
		case CodeqlscarPackage.RESULT__SOURCE:
			setSource((ResultEntryElement<?>) null);
			return;
		case CodeqlscarPackage.RESULT__SINK:
			setSink((ResultEntryElement<?>) null);
			return;
		case CodeqlscarPackage.RESULT__RULE_ID:
			setRuleId((RuleId) null);
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
		case CodeqlscarPackage.RESULT__SOURCE:
			return source != null;
		case CodeqlscarPackage.RESULT__SINK:
			return sink != null;
		case CodeqlscarPackage.RESULT__RULE_ID:
			return ruleId != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultImpl
