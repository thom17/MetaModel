/**
 */
package SWVS.impl;

import SWVS.SWVSPackage;
import SWVS.Tea;
import SWVS.Tea_Back;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.TeaImpl#getTea_back <em>Tea back</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeaImpl extends BeverageImpl implements Tea {
  /**
   * The cached value of the '{@link #getTea_back() <em>Tea back</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTea_back()
   * @generated
   * @ordered
   */
  protected Tea_Back tea_back;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TeaImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.TEA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tea_Back getTea_back() {
    return tea_back;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTea_back(Tea_Back newTea_back, NotificationChain msgs) {
    Tea_Back oldTea_back = tea_back;
    tea_back = newTea_back;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          SWVSPackage.TEA__TEA_BACK, oldTea_back, newTea_back);
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
  public void setTea_back(Tea_Back newTea_back) {
    if (newTea_back != tea_back) {
      NotificationChain msgs = null;
      if (tea_back != null)
        msgs = ((InternalEObject) tea_back).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - SWVSPackage.TEA__TEA_BACK, null, msgs);
      if (newTea_back != null)
        msgs = ((InternalEObject) newTea_back).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - SWVSPackage.TEA__TEA_BACK, null, msgs);
      msgs = basicSetTea_back(newTea_back, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.TEA__TEA_BACK, newTea_back,
          newTea_back));
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
      case SWVSPackage.TEA__TEA_BACK:
        return basicSetTea_back(null, msgs);
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
      case SWVSPackage.TEA__TEA_BACK:
        return getTea_back();
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
      case SWVSPackage.TEA__TEA_BACK:
        setTea_back((Tea_Back) newValue);
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
      case SWVSPackage.TEA__TEA_BACK:
        setTea_back((Tea_Back) null);
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
      case SWVSPackage.TEA__TEA_BACK:
        return tea_back != null;
    }
    return super.eIsSet(featureID);
  }

} //TeaImpl
