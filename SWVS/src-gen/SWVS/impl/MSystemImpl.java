/**
 */
package SWVS.impl;

import SWVS.MClass;
import SWVS.MSystem;
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
 * An implementation of the model object '<em><b>MSystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.MSystemImpl#getSystemType <em>System Type</em>}</li>
 *   <li>{@link SWVS.impl.MSystemImpl#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link SWVS.impl.MSystemImpl#getDefClass <em>Def Class</em>}</li>
 *   <li>{@link SWVS.impl.MSystemImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSystemImpl extends MObjectImpl implements MSystem {
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
  protected EList<MClass> defClass;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MSystemImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.MSYSTEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.MSYSTEM__SYSTEM_TYPE,
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
          new EObjectContainmentEList<UseCase>(UseCase.class, this, SWVSPackage.MSYSTEM__USECASE);
    }
    return usecase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MClass> getDefClass() {
    if (defClass == null) {
      defClass =
          new EObjectResolvingEList<MClass>(MClass.class, this, SWVSPackage.MSYSTEM__DEF_CLASS);
    }
    return defClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates() {
    if (states == null) {
      states = new EObjectContainmentEList<State>(State.class, this, SWVSPackage.MSYSTEM__STATES);
    }
    return states;
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
      case SWVSPackage.MSYSTEM__USECASE:
        return ((InternalEList<?>) getUsecase()).basicRemove(otherEnd, msgs);
      case SWVSPackage.MSYSTEM__STATES:
        return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
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
      case SWVSPackage.MSYSTEM__SYSTEM_TYPE:
        return getSystemType();
      case SWVSPackage.MSYSTEM__USECASE:
        return getUsecase();
      case SWVSPackage.MSYSTEM__DEF_CLASS:
        return getDefClass();
      case SWVSPackage.MSYSTEM__STATES:
        return getStates();
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
      case SWVSPackage.MSYSTEM__SYSTEM_TYPE:
        setSystemType((String) newValue);
        return;
      case SWVSPackage.MSYSTEM__USECASE:
        getUsecase().clear();
        getUsecase().addAll((Collection<? extends UseCase>) newValue);
        return;
      case SWVSPackage.MSYSTEM__DEF_CLASS:
        getDefClass().clear();
        getDefClass().addAll((Collection<? extends MClass>) newValue);
        return;
      case SWVSPackage.MSYSTEM__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>) newValue);
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
      case SWVSPackage.MSYSTEM__SYSTEM_TYPE:
        setSystemType(SYSTEM_TYPE_EDEFAULT);
        return;
      case SWVSPackage.MSYSTEM__USECASE:
        getUsecase().clear();
        return;
      case SWVSPackage.MSYSTEM__DEF_CLASS:
        getDefClass().clear();
        return;
      case SWVSPackage.MSYSTEM__STATES:
        getStates().clear();
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
      case SWVSPackage.MSYSTEM__SYSTEM_TYPE:
        return SYSTEM_TYPE_EDEFAULT == null ? systemType != null
            : !SYSTEM_TYPE_EDEFAULT.equals(systemType);
      case SWVSPackage.MSYSTEM__USECASE:
        return usecase != null && !usecase.isEmpty();
      case SWVSPackage.MSYSTEM__DEF_CLASS:
        return defClass != null && !defClass.isEmpty();
      case SWVSPackage.MSYSTEM__STATES:
        return states != null && !states.isEmpty();
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

} //MSystemImpl
