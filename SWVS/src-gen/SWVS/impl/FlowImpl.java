/**
 */
package SWVS.impl;

import SWVS.Condition;
import SWVS.Flow;
import SWVS.MObject;
import SWVS.SWVSPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.FlowImpl#getFlowId <em>Flow Id</em>}</li>
 *   <li>{@link SWVS.impl.FlowImpl#getHost <em>Host</em>}</li>
 *   <li>{@link SWVS.impl.FlowImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link SWVS.impl.FlowImpl#getContext <em>Context</em>}</li>
 *   <li>{@link SWVS.impl.FlowImpl#getDetailFlows <em>Detail Flows</em>}</li>
 *   <li>{@link SWVS.impl.FlowImpl#getResult <em>Result</em>}</li>
 *   <li>{@link SWVS.impl.FlowImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends MObjectImpl implements Flow {
  /**
   * The default value of the '{@link #getFlowId() <em>Flow Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlowId()
   * @generated
   * @ordered
   */
  protected static final String FLOW_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFlowId() <em>Flow Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlowId()
   * @generated
   * @ordered
   */
  protected String flowId = FLOW_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getHost() <em>Host</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected EList<MObject> host;

  /**
   * The cached value of the '{@link #getClients() <em>Clients</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClients()
   * @generated
   * @ordered
   */
  protected EList<MObject> clients;

  /**
   * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected static final String CONTEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected String context = CONTEXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDetailFlows() <em>Detail Flows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetailFlows()
   * @generated
   * @ordered
   */
  protected EList<Flow> detailFlows;

  /**
   * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected static final String RESULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected String result = RESULT_EDEFAULT;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition;

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
    return SWVSPackage.Literals.FLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFlowId() {
    return flowId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlowId(String newFlowId) {
    String oldFlowId = flowId;
    flowId = newFlowId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.FLOW__FLOW_ID, oldFlowId,
          flowId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MObject> getHost() {
    if (host == null) {
      host = new EObjectResolvingEList<MObject>(MObject.class, this, SWVSPackage.FLOW__HOST);
    }
    return host;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MObject> getClients() {
    if (clients == null) {
      clients = new EObjectResolvingEList<MObject>(MObject.class, this, SWVSPackage.FLOW__CLIENTS);
    }
    return clients;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContext() {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(String newContext) {
    String oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.FLOW__CONTEXT, oldContext,
          context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Flow> getDetailFlows() {
    if (detailFlows == null) {
      detailFlows =
          new EObjectContainmentEList<Flow>(Flow.class, this, SWVSPackage.FLOW__DETAIL_FLOWS);
    }
    return detailFlows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResult() {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResult(String newResult) {
    String oldResult = result;
    result = newResult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.FLOW__RESULT, oldResult,
          result));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondition() {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
    Condition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          SWVSPackage.FLOW__CONDITION, oldCondition, newCondition);
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
  public void setCondition(Condition newCondition) {
    if (newCondition != condition) {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject) condition).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - SWVSPackage.FLOW__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject) newCondition).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - SWVSPackage.FLOW__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.FLOW__CONDITION,
          newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
      NotificationChain msgs) {
    switch (featureID) {
      case SWVSPackage.FLOW__DETAIL_FLOWS:
        return ((InternalEList<?>) getDetailFlows()).basicRemove(otherEnd, msgs);
      case SWVSPackage.FLOW__CONDITION:
        return basicSetCondition(null, msgs);
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
      case SWVSPackage.FLOW__FLOW_ID:
        return getFlowId();
      case SWVSPackage.FLOW__HOST:
        return getHost();
      case SWVSPackage.FLOW__CLIENTS:
        return getClients();
      case SWVSPackage.FLOW__CONTEXT:
        return getContext();
      case SWVSPackage.FLOW__DETAIL_FLOWS:
        return getDetailFlows();
      case SWVSPackage.FLOW__RESULT:
        return getResult();
      case SWVSPackage.FLOW__CONDITION:
        return getCondition();
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
      case SWVSPackage.FLOW__FLOW_ID:
        setFlowId((String) newValue);
        return;
      case SWVSPackage.FLOW__HOST:
        getHost().clear();
        getHost().addAll((Collection<? extends MObject>) newValue);
        return;
      case SWVSPackage.FLOW__CLIENTS:
        getClients().clear();
        getClients().addAll((Collection<? extends MObject>) newValue);
        return;
      case SWVSPackage.FLOW__CONTEXT:
        setContext((String) newValue);
        return;
      case SWVSPackage.FLOW__DETAIL_FLOWS:
        getDetailFlows().clear();
        getDetailFlows().addAll((Collection<? extends Flow>) newValue);
        return;
      case SWVSPackage.FLOW__RESULT:
        setResult((String) newValue);
        return;
      case SWVSPackage.FLOW__CONDITION:
        setCondition((Condition) newValue);
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
      case SWVSPackage.FLOW__FLOW_ID:
        setFlowId(FLOW_ID_EDEFAULT);
        return;
      case SWVSPackage.FLOW__HOST:
        getHost().clear();
        return;
      case SWVSPackage.FLOW__CLIENTS:
        getClients().clear();
        return;
      case SWVSPackage.FLOW__CONTEXT:
        setContext(CONTEXT_EDEFAULT);
        return;
      case SWVSPackage.FLOW__DETAIL_FLOWS:
        getDetailFlows().clear();
        return;
      case SWVSPackage.FLOW__RESULT:
        setResult(RESULT_EDEFAULT);
        return;
      case SWVSPackage.FLOW__CONDITION:
        setCondition((Condition) null);
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
      case SWVSPackage.FLOW__FLOW_ID:
        return FLOW_ID_EDEFAULT == null ? flowId != null : !FLOW_ID_EDEFAULT.equals(flowId);
      case SWVSPackage.FLOW__HOST:
        return host != null && !host.isEmpty();
      case SWVSPackage.FLOW__CLIENTS:
        return clients != null && !clients.isEmpty();
      case SWVSPackage.FLOW__CONTEXT:
        return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
      case SWVSPackage.FLOW__DETAIL_FLOWS:
        return detailFlows != null && !detailFlows.isEmpty();
      case SWVSPackage.FLOW__RESULT:
        return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
      case SWVSPackage.FLOW__CONDITION:
        return condition != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy())
      return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (flowId: ");
    result.append(flowId);
    result.append(", context: ");
    result.append(context);
    result.append(", result: ");
    result.append(result);
    result.append(')');
    return result.toString();
  }

} //FlowImpl
