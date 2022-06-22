/**
 */
package SWVS.impl;

import SWVS.Actor;
import SWVS.Condition;
import SWVS.Flow;
import SWVS.SWVSPackage;
import SWVS.UseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.UseCaseImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link SWVS.impl.UseCaseImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link SWVS.impl.UseCaseImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link SWVS.impl.UseCaseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link SWVS.impl.UseCaseImpl#getActActors <em>Act Actors</em>}</li>
 *   <li>{@link SWVS.impl.UseCaseImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends MObjectImpl implements UseCase {
  /**
   * The cached value of the '{@link #getExtend() <em>Extend</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtend()
   * @generated
   * @ordered
   */
  protected EList<UseCase> extend;

  /**
   * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclude()
   * @generated
   * @ordered
   */
  protected EList<UseCase> include;

  /**
   * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlows()
   * @generated
   * @ordered
   */
  protected EList<Flow> flows;

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
   * The cached value of the '{@link #getActActors() <em>Act Actors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActActors()
   * @generated
   * @ordered
   */
  protected EList<Actor> actActors;

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
  protected UseCaseImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.USE_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UseCase> getExtend() {
    if (extend == null) {
      extend =
          new EObjectContainmentEList<UseCase>(UseCase.class, this, SWVSPackage.USE_CASE__EXTEND);
    }
    return extend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UseCase> getInclude() {
    if (include == null) {
      include =
          new EObjectContainmentEList<UseCase>(UseCase.class, this, SWVSPackage.USE_CASE__INCLUDE);
    }
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Flow> getFlows() {
    if (flows == null) {
      flows = new EObjectContainmentEList<Flow>(Flow.class, this, SWVSPackage.USE_CASE__FLOWS);
    }
    return flows;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.USE_CASE__CONTEXT,
          oldContext, context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Actor> getActActors() {
    if (actActors == null) {
      actActors = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this,
          SWVSPackage.USE_CASE__ACT_ACTORS, SWVSPackage.ACTOR__ACT_USECASES);
    }
    return actActors;
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
          SWVSPackage.USE_CASE__CONDITION, oldCondition, newCondition);
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
            EOPPOSITE_FEATURE_BASE - SWVSPackage.USE_CASE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject) newCondition).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - SWVSPackage.USE_CASE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.USE_CASE__CONDITION,
          newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
      NotificationChain msgs) {
    switch (featureID) {
      case SWVSPackage.USE_CASE__ACT_ACTORS:
        return ((InternalEList<InternalEObject>) (InternalEList<?>) getActActors())
            .basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case SWVSPackage.USE_CASE__EXTEND:
        return ((InternalEList<?>) getExtend()).basicRemove(otherEnd, msgs);
      case SWVSPackage.USE_CASE__INCLUDE:
        return ((InternalEList<?>) getInclude()).basicRemove(otherEnd, msgs);
      case SWVSPackage.USE_CASE__FLOWS:
        return ((InternalEList<?>) getFlows()).basicRemove(otherEnd, msgs);
      case SWVSPackage.USE_CASE__ACT_ACTORS:
        return ((InternalEList<?>) getActActors()).basicRemove(otherEnd, msgs);
      case SWVSPackage.USE_CASE__CONDITION:
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
      case SWVSPackage.USE_CASE__EXTEND:
        return getExtend();
      case SWVSPackage.USE_CASE__INCLUDE:
        return getInclude();
      case SWVSPackage.USE_CASE__FLOWS:
        return getFlows();
      case SWVSPackage.USE_CASE__CONTEXT:
        return getContext();
      case SWVSPackage.USE_CASE__ACT_ACTORS:
        return getActActors();
      case SWVSPackage.USE_CASE__CONDITION:
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
      case SWVSPackage.USE_CASE__EXTEND:
        getExtend().clear();
        getExtend().addAll((Collection<? extends UseCase>) newValue);
        return;
      case SWVSPackage.USE_CASE__INCLUDE:
        getInclude().clear();
        getInclude().addAll((Collection<? extends UseCase>) newValue);
        return;
      case SWVSPackage.USE_CASE__FLOWS:
        getFlows().clear();
        getFlows().addAll((Collection<? extends Flow>) newValue);
        return;
      case SWVSPackage.USE_CASE__CONTEXT:
        setContext((String) newValue);
        return;
      case SWVSPackage.USE_CASE__ACT_ACTORS:
        getActActors().clear();
        getActActors().addAll((Collection<? extends Actor>) newValue);
        return;
      case SWVSPackage.USE_CASE__CONDITION:
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
      case SWVSPackage.USE_CASE__EXTEND:
        getExtend().clear();
        return;
      case SWVSPackage.USE_CASE__INCLUDE:
        getInclude().clear();
        return;
      case SWVSPackage.USE_CASE__FLOWS:
        getFlows().clear();
        return;
      case SWVSPackage.USE_CASE__CONTEXT:
        setContext(CONTEXT_EDEFAULT);
        return;
      case SWVSPackage.USE_CASE__ACT_ACTORS:
        getActActors().clear();
        return;
      case SWVSPackage.USE_CASE__CONDITION:
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
      case SWVSPackage.USE_CASE__EXTEND:
        return extend != null && !extend.isEmpty();
      case SWVSPackage.USE_CASE__INCLUDE:
        return include != null && !include.isEmpty();
      case SWVSPackage.USE_CASE__FLOWS:
        return flows != null && !flows.isEmpty();
      case SWVSPackage.USE_CASE__CONTEXT:
        return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
      case SWVSPackage.USE_CASE__ACT_ACTORS:
        return actActors != null && !actActors.isEmpty();
      case SWVSPackage.USE_CASE__CONDITION:
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
    result.append(" (context: ");
    result.append(context);
    result.append(')');
    return result.toString();
  }

} //UseCaseImpl
