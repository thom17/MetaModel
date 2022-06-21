/**
 */
package SWVS.impl;

import SWVS.Condition;
import SWVS.SWVSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.ConditionImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link SWVS.impl.ConditionImpl#getPostCondition <em>Post Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
  /**
   * The default value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreCondition()
   * @generated
   * @ordered
   */
  protected static final String PRE_CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreCondition()
   * @generated
   * @ordered
   */
  protected String preCondition = PRE_CONDITION_EDEFAULT;

  /**
   * The default value of the '{@link #getPostCondition() <em>Post Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostCondition()
   * @generated
   * @ordered
   */
  protected static final String POST_CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostCondition()
   * @generated
   * @ordered
   */
  protected String postCondition = POST_CONDITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPreCondition() {
    return preCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreCondition(String newPreCondition) {
    String oldPreCondition = preCondition;
    preCondition = newPreCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.CONDITION__PRE_CONDITION,
          oldPreCondition, preCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPostCondition() {
    return postCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostCondition(String newPostCondition) {
    String oldPostCondition = postCondition;
    postCondition = newPostCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.CONDITION__POST_CONDITION,
          oldPostCondition, postCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SWVSPackage.CONDITION__PRE_CONDITION:
        return getPreCondition();
      case SWVSPackage.CONDITION__POST_CONDITION:
        return getPostCondition();
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
      case SWVSPackage.CONDITION__PRE_CONDITION:
        setPreCondition((String) newValue);
        return;
      case SWVSPackage.CONDITION__POST_CONDITION:
        setPostCondition((String) newValue);
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
      case SWVSPackage.CONDITION__PRE_CONDITION:
        setPreCondition(PRE_CONDITION_EDEFAULT);
        return;
      case SWVSPackage.CONDITION__POST_CONDITION:
        setPostCondition(POST_CONDITION_EDEFAULT);
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
      case SWVSPackage.CONDITION__PRE_CONDITION:
        return PRE_CONDITION_EDEFAULT == null ? preCondition != null
            : !PRE_CONDITION_EDEFAULT.equals(preCondition);
      case SWVSPackage.CONDITION__POST_CONDITION:
        return POST_CONDITION_EDEFAULT == null ? postCondition != null
            : !POST_CONDITION_EDEFAULT.equals(postCondition);
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
    result.append(" (preCondition: ");
    result.append(preCondition);
    result.append(", postCondition: ");
    result.append(postCondition);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
