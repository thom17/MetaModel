/**
 */
package SWVS.impl;

import SWVS.Field;
import SWVS.Method;
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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.ClassImpl#getField <em>Field</em>}</li>
 *   <li>{@link SWVS.impl.ClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link SWVS.impl.ClassImpl#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link SWVS.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link SWVS.impl.ClassImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link SWVS.impl.ClassImpl#getDefBase <em>Def Base</em>}</li>
 *   <li>{@link SWVS.impl.ClassImpl#getClassType <em>Class Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ObjectImpl implements SWVS.Class {
  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected EList<Field> field;

  /**
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getHasClass() <em>Has Class</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasClass()
   * @generated
   * @ordered
   */
  protected EList<SWVS.Class> hasClass;

  /**
   * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperClass()
   * @generated
   * @ordered
   */
  protected EList<SWVS.Class> superClass;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected EList<Method> method;

  /**
   * The cached value of the '{@link #getDefBase() <em>Def Base</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefBase()
   * @generated
   * @ordered
   */
  protected EList<SWVS.Object> defBase;

  /**
   * The default value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassType()
   * @generated
   * @ordered
   */
  protected static final String CLASS_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassType()
   * @generated
   * @ordered
   */
  protected String classType = CLASS_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getField() {
    if (field == null) {
      field = new EObjectContainmentEList<Field>(Field.class, this, SWVSPackage.CLASS__FIELD);
    }
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackage() {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(String newPackage) {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.CLASS__PACKAGE, oldPackage,
          package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SWVS.Class> getHasClass() {
    if (hasClass == null) {
      hasClass = new EObjectResolvingEList<SWVS.Class>(SWVS.Class.class, this,
          SWVSPackage.CLASS__HAS_CLASS);
    }
    return hasClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SWVS.Class> getSuperClass() {
    if (superClass == null) {
      superClass = new EObjectResolvingEList<SWVS.Class>(SWVS.Class.class, this,
          SWVSPackage.CLASS__SUPER_CLASS);
    }
    return superClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getMethod() {
    if (method == null) {
      method = new EObjectContainmentEList<Method>(Method.class, this, SWVSPackage.CLASS__METHOD);
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SWVS.Object> getDefBase() {
    if (defBase == null) {
      defBase = new EObjectResolvingEList<SWVS.Object>(SWVS.Object.class, this,
          SWVSPackage.CLASS__DEF_BASE);
    }
    return defBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassType() {
    return classType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassType(String newClassType) {
    String oldClassType = classType;
    classType = newClassType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.CLASS__CLASS_TYPE,
          oldClassType, classType));
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
      case SWVSPackage.CLASS__FIELD:
        return ((InternalEList<?>) getField()).basicRemove(otherEnd, msgs);
      case SWVSPackage.CLASS__METHOD:
        return ((InternalEList<?>) getMethod()).basicRemove(otherEnd, msgs);
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
      case SWVSPackage.CLASS__FIELD:
        return getField();
      case SWVSPackage.CLASS__PACKAGE:
        return getPackage();
      case SWVSPackage.CLASS__HAS_CLASS:
        return getHasClass();
      case SWVSPackage.CLASS__SUPER_CLASS:
        return getSuperClass();
      case SWVSPackage.CLASS__METHOD:
        return getMethod();
      case SWVSPackage.CLASS__DEF_BASE:
        return getDefBase();
      case SWVSPackage.CLASS__CLASS_TYPE:
        return getClassType();
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
      case SWVSPackage.CLASS__FIELD:
        getField().clear();
        getField().addAll((Collection<? extends Field>) newValue);
        return;
      case SWVSPackage.CLASS__PACKAGE:
        setPackage((String) newValue);
        return;
      case SWVSPackage.CLASS__HAS_CLASS:
        getHasClass().clear();
        getHasClass().addAll((Collection<? extends SWVS.Class>) newValue);
        return;
      case SWVSPackage.CLASS__SUPER_CLASS:
        getSuperClass().clear();
        getSuperClass().addAll((Collection<? extends SWVS.Class>) newValue);
        return;
      case SWVSPackage.CLASS__METHOD:
        getMethod().clear();
        getMethod().addAll((Collection<? extends Method>) newValue);
        return;
      case SWVSPackage.CLASS__DEF_BASE:
        getDefBase().clear();
        getDefBase().addAll((Collection<? extends SWVS.Object>) newValue);
        return;
      case SWVSPackage.CLASS__CLASS_TYPE:
        setClassType((String) newValue);
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
      case SWVSPackage.CLASS__FIELD:
        getField().clear();
        return;
      case SWVSPackage.CLASS__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case SWVSPackage.CLASS__HAS_CLASS:
        getHasClass().clear();
        return;
      case SWVSPackage.CLASS__SUPER_CLASS:
        getSuperClass().clear();
        return;
      case SWVSPackage.CLASS__METHOD:
        getMethod().clear();
        return;
      case SWVSPackage.CLASS__DEF_BASE:
        getDefBase().clear();
        return;
      case SWVSPackage.CLASS__CLASS_TYPE:
        setClassType(CLASS_TYPE_EDEFAULT);
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
      case SWVSPackage.CLASS__FIELD:
        return field != null && !field.isEmpty();
      case SWVSPackage.CLASS__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case SWVSPackage.CLASS__HAS_CLASS:
        return hasClass != null && !hasClass.isEmpty();
      case SWVSPackage.CLASS__SUPER_CLASS:
        return superClass != null && !superClass.isEmpty();
      case SWVSPackage.CLASS__METHOD:
        return method != null && !method.isEmpty();
      case SWVSPackage.CLASS__DEF_BASE:
        return defBase != null && !defBase.isEmpty();
      case SWVSPackage.CLASS__CLASS_TYPE:
        return CLASS_TYPE_EDEFAULT == null ? classType != null
            : !CLASS_TYPE_EDEFAULT.equals(classType);
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
    result.append(" (package: ");
    result.append(package_);
    result.append(", classType: ");
    result.append(classType);
    result.append(')');
    return result.toString();
  }

} //ClassImpl
