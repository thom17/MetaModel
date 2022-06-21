/**
 */
package SWVS.impl;

import SWVS.SWVSPackage;
import SWVS.State;
import SWVS.UseCase;

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
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.SystemImpl#getSystemType <em>System Type</em>}</li>
 *   <li>{@link SWVS.impl.SystemImpl#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link SWVS.impl.SystemImpl#getDefClass <em>Def Class</em>}</li>
 *   <li>{@link SWVS.impl.SystemImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ObjectImpl implements SWVS.System {
  /**
   * The default value of the '{@link #getSystemType() <em>System Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemType()
   * @generated
   * @ordered
   */
  protected static final String SYSTEM_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSystemType() <em>System Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemType()
   * @generated
   * @ordered
   */
  protected String systemType = SYSTEM_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getUsecase() <em>Usecase</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsecase()
   * @generated
   * @ordered
   */
  protected EList<UseCase> usecase;

  /**
   * The cached value of the '{@link #getDefClass() <em>Def Class</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefClass()
   * @generated
   * @ordered
   */
  protected EList<SWVS.Class> defClass;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected EList<State> state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSystemType() {
    return systemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystemType(String newSystemType) {
    String oldSystemType = systemType;
    systemType = newSystemType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.SYSTEM__SYSTEM_TYPE,
          oldSystemType, systemType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UseCase> getUsecase() {
    if (usecase == null) {
      usecase =
          new EObjectContainmentEList<UseCase>(UseCase.class, this, SWVSPackage.SYSTEM__USECASE);
    }
    return usecase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SWVS.Class> getDefClass() {
    if (defClass == null) {
      defClass = new EObjectResolvingEList<SWVS.Class>(SWVS.Class.class, this,
          SWVSPackage.SYSTEM__DEF_CLASS);
    }
    return defClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getState() {
    if (state == null) {
      state = new EObjectContainmentEList<State>(State.class, this, SWVSPackage.SYSTEM__STATE);
    }
    return state;
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
      case SWVSPackage.SYSTEM__USECASE:
        return ((InternalEList<?>) getUsecase()).basicRemove(otherEnd, msgs);
      case SWVSPackage.SYSTEM__STATE:
        return ((InternalEList<?>) getState()).basicRemove(otherEnd, msgs);
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
      case SWVSPackage.SYSTEM__SYSTEM_TYPE:
        return getSystemType();
      case SWVSPackage.SYSTEM__USECASE:
        return getUsecase();
      case SWVSPackage.SYSTEM__DEF_CLASS:
        return getDefClass();
      case SWVSPackage.SYSTEM__STATE:
        return getState();
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
      case SWVSPackage.SYSTEM__SYSTEM_TYPE:
        setSystemType((String) newValue);
        return;
      case SWVSPackage.SYSTEM__USECASE:
        getUsecase().clear();
        getUsecase().addAll((Collection<? extends UseCase>) newValue);
        return;
      case SWVSPackage.SYSTEM__DEF_CLASS:
        getDefClass().clear();
        getDefClass().addAll((Collection<? extends SWVS.Class>) newValue);
        return;
      case SWVSPackage.SYSTEM__STATE:
        getState().clear();
        getState().addAll((Collection<? extends State>) newValue);
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
      case SWVSPackage.SYSTEM__SYSTEM_TYPE:
        setSystemType(SYSTEM_TYPE_EDEFAULT);
        return;
      case SWVSPackage.SYSTEM__USECASE:
        getUsecase().clear();
        return;
      case SWVSPackage.SYSTEM__DEF_CLASS:
        getDefClass().clear();
        return;
      case SWVSPackage.SYSTEM__STATE:
        getState().clear();
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
      case SWVSPackage.SYSTEM__SYSTEM_TYPE:
        return SYSTEM_TYPE_EDEFAULT == null ? systemType != null
            : !SYSTEM_TYPE_EDEFAULT.equals(systemType);
      case SWVSPackage.SYSTEM__USECASE:
        return usecase != null && !usecase.isEmpty();
      case SWVSPackage.SYSTEM__DEF_CLASS:
        return defClass != null && !defClass.isEmpty();
      case SWVSPackage.SYSTEM__STATE:
        return state != null && !state.isEmpty();
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
    result.append(" (systemType: ");
    result.append(systemType);
    result.append(')');
    return result.toString();
  }

} //SystemImpl
