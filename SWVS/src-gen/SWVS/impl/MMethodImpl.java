/**
 */
package SWVS.impl;

import SWVS.MMethod;
import SWVS.MObject;
import SWVS.SWVSPackage;
import SWVS.UseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.MMethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link SWVS.impl.MMethodImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link SWVS.impl.MMethodImpl#getTestUsecase <em>Test Usecase</em>}</li>
 *   <li>{@link SWVS.impl.MMethodImpl#getBase <em>Base</em>}</li>
 *   <li>{@link SWVS.impl.MMethodImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMethodImpl extends MObjectImpl implements MMethod {
  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final String RETURN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected String returnType = RETURN_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStatic()
   * @generated
   * @ordered
   */
  protected static final boolean IS_STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStatic()
   * @generated
   * @ordered
   */
  protected boolean isStatic = IS_STATIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getTestUsecase() <em>Test Usecase</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestUsecase()
   * @generated
   * @ordered
   */
  protected UseCase testUsecase;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected EList<MObject> base;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected EList<String> argument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MMethodImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.MMETHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnType() {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(String newReturnType) {
    String oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.MMETHOD__RETURN_TYPE,
          oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsStatic() {
    return isStatic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsStatic(boolean newIsStatic) {
    boolean oldIsStatic = isStatic;
    isStatic = newIsStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.MMETHOD__IS_STATIC,
          oldIsStatic, isStatic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase getTestUsecase() {
    if (testUsecase != null && testUsecase.eIsProxy()) {
      InternalEObject oldTestUsecase = (InternalEObject) testUsecase;
      testUsecase = (UseCase) eResolveProxy(oldTestUsecase);
      if (testUsecase != oldTestUsecase) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
              SWVSPackage.MMETHOD__TEST_USECASE, oldTestUsecase, testUsecase));
      }
    }
    return testUsecase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase basicGetTestUsecase() {
    return testUsecase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestUsecase(UseCase newTestUsecase) {
    UseCase oldTestUsecase = testUsecase;
    testUsecase = newTestUsecase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.MMETHOD__TEST_USECASE,
          oldTestUsecase, testUsecase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MObject> getBase() {
    if (base == null) {
      base = new EObjectResolvingEList<MObject>(MObject.class, this, SWVSPackage.MMETHOD__BASE);
    }
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getArgument() {
    if (argument == null) {
      argument =
          new EDataTypeUniqueEList<String>(String.class, this, SWVSPackage.MMETHOD__ARGUMENT);
    }
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SWVSPackage.MMETHOD__RETURN_TYPE:
        return getReturnType();
      case SWVSPackage.MMETHOD__IS_STATIC:
        return isIsStatic();
      case SWVSPackage.MMETHOD__TEST_USECASE:
        if (resolve)
          return getTestUsecase();
        return basicGetTestUsecase();
      case SWVSPackage.MMETHOD__BASE:
        return getBase();
      case SWVSPackage.MMETHOD__ARGUMENT:
        return getArgument();
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
      case SWVSPackage.MMETHOD__RETURN_TYPE:
        setReturnType((String) newValue);
        return;
      case SWVSPackage.MMETHOD__IS_STATIC:
        setIsStatic((Boolean) newValue);
        return;
      case SWVSPackage.MMETHOD__TEST_USECASE:
        setTestUsecase((UseCase) newValue);
        return;
      case SWVSPackage.MMETHOD__BASE:
        getBase().clear();
        getBase().addAll((Collection<? extends MObject>) newValue);
        return;
      case SWVSPackage.MMETHOD__ARGUMENT:
        getArgument().clear();
        getArgument().addAll((Collection<? extends String>) newValue);
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
      case SWVSPackage.MMETHOD__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
        return;
      case SWVSPackage.MMETHOD__IS_STATIC:
        setIsStatic(IS_STATIC_EDEFAULT);
        return;
      case SWVSPackage.MMETHOD__TEST_USECASE:
        setTestUsecase((UseCase) null);
        return;
      case SWVSPackage.MMETHOD__BASE:
        getBase().clear();
        return;
      case SWVSPackage.MMETHOD__ARGUMENT:
        getArgument().clear();
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
      case SWVSPackage.MMETHOD__RETURN_TYPE:
        return RETURN_TYPE_EDEFAULT == null ? returnType != null
            : !RETURN_TYPE_EDEFAULT.equals(returnType);
      case SWVSPackage.MMETHOD__IS_STATIC:
        return isStatic != IS_STATIC_EDEFAULT;
      case SWVSPackage.MMETHOD__TEST_USECASE:
        return testUsecase != null;
      case SWVSPackage.MMETHOD__BASE:
        return base != null && !base.isEmpty();
      case SWVSPackage.MMETHOD__ARGUMENT:
        return argument != null && !argument.isEmpty();
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
    result.append(" (returnType: ");
    result.append(returnType);
    result.append(", isStatic: ");
    result.append(isStatic);
    result.append(", argument: ");
    result.append(argument);
    result.append(')');
    return result.toString();
  }

} //MMethodImpl
