/**
 */
package SWVS.impl;

import SWVS.Requirement;
import SWVS.SWVSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.RequirementImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link SWVS.impl.RequirementImpl#getRqType <em>Rq Type</em>}</li>
 *   <li>{@link SWVS.impl.RequirementImpl#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends ObjectImpl implements Requirement {
  /**
   * The default value of the '{@link #getContents() <em>Contents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected static final String CONTENTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected String contents = CONTENTS_EDEFAULT;

  /**
   * The default value of the '{@link #getRqType() <em>Rq Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRqType()
   * @generated
   * @ordered
   */
  protected static final String RQ_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRqType() <em>Rq Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRqType()
   * @generated
   * @ordered
   */
  protected String rqType = RQ_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDepartment() <em>Department</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepartment()
   * @generated
   * @ordered
   */
  protected static final String DEPARTMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDepartment() <em>Department</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepartment()
   * @generated
   * @ordered
   */
  protected String department = DEPARTMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequirementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.REQUIREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContents() {
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContents(String newContents) {
    String oldContents = contents;
    contents = newContents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.REQUIREMENT__CONTENTS,
          oldContents, contents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRqType() {
    return rqType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRqType(String newRqType) {
    String oldRqType = rqType;
    rqType = newRqType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.REQUIREMENT__RQ_TYPE,
          oldRqType, rqType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDepartment() {
    return department;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDepartment(String newDepartment) {
    String oldDepartment = department;
    department = newDepartment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.REQUIREMENT__DEPARTMENT,
          oldDepartment, department));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SWVSPackage.REQUIREMENT__CONTENTS:
        return getContents();
      case SWVSPackage.REQUIREMENT__RQ_TYPE:
        return getRqType();
      case SWVSPackage.REQUIREMENT__DEPARTMENT:
        return getDepartment();
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
      case SWVSPackage.REQUIREMENT__CONTENTS:
        setContents((String) newValue);
        return;
      case SWVSPackage.REQUIREMENT__RQ_TYPE:
        setRqType((String) newValue);
        return;
      case SWVSPackage.REQUIREMENT__DEPARTMENT:
        setDepartment((String) newValue);
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
      case SWVSPackage.REQUIREMENT__CONTENTS:
        setContents(CONTENTS_EDEFAULT);
        return;
      case SWVSPackage.REQUIREMENT__RQ_TYPE:
        setRqType(RQ_TYPE_EDEFAULT);
        return;
      case SWVSPackage.REQUIREMENT__DEPARTMENT:
        setDepartment(DEPARTMENT_EDEFAULT);
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
      case SWVSPackage.REQUIREMENT__CONTENTS:
        return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
      case SWVSPackage.REQUIREMENT__RQ_TYPE:
        return RQ_TYPE_EDEFAULT == null ? rqType != null : !RQ_TYPE_EDEFAULT.equals(rqType);
      case SWVSPackage.REQUIREMENT__DEPARTMENT:
        return DEPARTMENT_EDEFAULT == null ? department != null
            : !DEPARTMENT_EDEFAULT.equals(department);
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
    result.append(" (contents: ");
    result.append(contents);
    result.append(", rqType: ");
    result.append(rqType);
    result.append(", department: ");
    result.append(department);
    result.append(')');
    return result.toString();
  }

} //RequirementImpl
