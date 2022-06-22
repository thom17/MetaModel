/**
 */
package SWVS.impl;

import SWVS.Field;
import SWVS.MClass;
import SWVS.MMethod;
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
 * An implementation of the model object '<em><b>MClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.MClassImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link SWVS.impl.MClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link SWVS.impl.MClassImpl#getHasClassList <em>Has Class List</em>}</li>
 *   <li>{@link SWVS.impl.MClassImpl#getSuperClassList <em>Super Class List</em>}</li>
 *   <li>{@link SWVS.impl.MClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link SWVS.impl.MClassImpl#getDefBase <em>Def Base</em>}</li>
 *   <li>{@link SWVS.impl.MClassImpl#getClassType <em>Class Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MClassImpl extends MObjectImpl implements MClass {
  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

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
   * The cached value of the '{@link #getHasClassList() <em>Has Class List</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasClassList()
   * @generated
   * @ordered
   */
  protected EList<MClass> hasClassList;

  /**
   * The cached value of the '{@link #getSuperClassList() <em>Super Class List</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperClassList()
   * @generated
   * @ordered
   */
  protected EList<MClass> superClassList;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<MMethod> methods;

  /**
   * The cached value of the '{@link #getDefBase() <em>Def Base</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefBase()
   * @generated
   * @ordered
   */
  protected EList<MObject> defBase;

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
  protected MClassImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.MCLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields() {
    if (fields == null) {
      fields = new EObjectContainmentEList<Field>(Field.class, this, SWVSPackage.MCLASS__FIELDS);
    }
    return fields;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.MCLASS__PACKAGE, oldPackage,
          package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MClass> getHasClassList() {
    if (hasClassList == null) {
      hasClassList =
          new EObjectResolvingEList<MClass>(MClass.class, this, SWVSPackage.MCLASS__HAS_CLASS_LIST);
    }
    return hasClassList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MClass> getSuperClassList() {
    if (superClassList == null) {
      superClassList = new EObjectResolvingEList<MClass>(MClass.class, this,
          SWVSPackage.MCLASS__SUPER_CLASS_LIST);
    }
    return superClassList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MMethod> getMethods() {
    if (methods == null) {
      methods =
          new EObjectContainmentEList<MMethod>(MMethod.class, this, SWVSPackage.MCLASS__METHODS);
    }
    return methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MObject> getDefBase() {
    if (defBase == null) {
      defBase =
          new EObjectResolvingEList<MObject>(MObject.class, this, SWVSPackage.MCLASS__DEF_BASE);
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
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.MCLASS__CLASS_TYPE,
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
      case SWVSPackage.MCLASS__FIELDS:
        return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
      case SWVSPackage.MCLASS__METHODS:
        return ((InternalEList<?>) getMethods()).basicRemove(otherEnd, msgs);
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
      case SWVSPackage.MCLASS__FIELDS:
        return getFields();
      case SWVSPackage.MCLASS__PACKAGE:
        return getPackage();
      case SWVSPackage.MCLASS__HAS_CLASS_LIST:
        return getHasClassList();
      case SWVSPackage.MCLASS__SUPER_CLASS_LIST:
        return getSuperClassList();
      case SWVSPackage.MCLASS__METHODS:
        return getMethods();
      case SWVSPackage.MCLASS__DEF_BASE:
        return getDefBase();
      case SWVSPackage.MCLASS__CLASS_TYPE:
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
      case SWVSPackage.MCLASS__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>) newValue);
        return;
      case SWVSPackage.MCLASS__PACKAGE:
        setPackage((String) newValue);
        return;
      case SWVSPackage.MCLASS__HAS_CLASS_LIST:
        getHasClassList().clear();
        getHasClassList().addAll((Collection<? extends MClass>) newValue);
        return;
      case SWVSPackage.MCLASS__SUPER_CLASS_LIST:
        getSuperClassList().clear();
        getSuperClassList().addAll((Collection<? extends MClass>) newValue);
        return;
      case SWVSPackage.MCLASS__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends MMethod>) newValue);
        return;
      case SWVSPackage.MCLASS__DEF_BASE:
        getDefBase().clear();
        getDefBase().addAll((Collection<? extends MObject>) newValue);
        return;
      case SWVSPackage.MCLASS__CLASS_TYPE:
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
      case SWVSPackage.MCLASS__FIELDS:
        getFields().clear();
        return;
      case SWVSPackage.MCLASS__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case SWVSPackage.MCLASS__HAS_CLASS_LIST:
        getHasClassList().clear();
        return;
      case SWVSPackage.MCLASS__SUPER_CLASS_LIST:
        getSuperClassList().clear();
        return;
      case SWVSPackage.MCLASS__METHODS:
        getMethods().clear();
        return;
      case SWVSPackage.MCLASS__DEF_BASE:
        getDefBase().clear();
        return;
      case SWVSPackage.MCLASS__CLASS_TYPE:
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
      case SWVSPackage.MCLASS__FIELDS:
        return fields != null && !fields.isEmpty();
      case SWVSPackage.MCLASS__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case SWVSPackage.MCLASS__HAS_CLASS_LIST:
        return hasClassList != null && !hasClassList.isEmpty();
      case SWVSPackage.MCLASS__SUPER_CLASS_LIST:
        return superClassList != null && !superClassList.isEmpty();
      case SWVSPackage.MCLASS__METHODS:
        return methods != null && !methods.isEmpty();
      case SWVSPackage.MCLASS__DEF_BASE:
        return defBase != null && !defBase.isEmpty();
      case SWVSPackage.MCLASS__CLASS_TYPE:
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

} //MClassImpl
