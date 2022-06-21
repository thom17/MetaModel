/**
 */
package SWVS.impl;

import SWVS.Coffee;
import SWVS.SWVSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coffee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.CoffeeImpl#getCaffeine <em>Caffeine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoffeeImpl extends BeverageImpl implements Coffee {
  /**
   * The default value of the '{@link #getCaffeine() <em>Caffeine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaffeine()
   * @generated
   * @ordered
   */
  protected static final int CAFFEINE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCaffeine() <em>Caffeine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaffeine()
   * @generated
   * @ordered
   */
  protected int caffeine = CAFFEINE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoffeeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.COFFEE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCaffeine() {
    return caffeine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaffeine(int newCaffeine) {
    int oldCaffeine = caffeine;
    caffeine = newCaffeine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.COFFEE__CAFFEINE,
          oldCaffeine, caffeine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SWVSPackage.COFFEE__CAFFEINE:
        return getCaffeine();
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
      case SWVSPackage.COFFEE__CAFFEINE:
        setCaffeine((Integer) newValue);
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
      case SWVSPackage.COFFEE__CAFFEINE:
        setCaffeine(CAFFEINE_EDEFAULT);
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
      case SWVSPackage.COFFEE__CAFFEINE:
        return caffeine != CAFFEINE_EDEFAULT;
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
    result.append(" (caffeine: ");
    result.append(caffeine);
    result.append(')');
    return result.toString();
  }

} //CoffeeImpl
