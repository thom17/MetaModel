/**
 */
package SWVS.impl;

import SWVS.Method;
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
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link SWVS.impl.MethodImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link SWVS.impl.MethodImpl#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link SWVS.impl.MethodImpl#getBase <em>Base</em>}</li>
 *   <li>{@link SWVS.impl.MethodImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends ObjectImpl implements Method {
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
   * The cached value of the '{@link #getUsecase() <em>Usecase</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsecase()
   * @generated
   * @ordered
   */
  protected UseCase usecase;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected EList<SWVS.Object> base;

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
  protected MethodImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.METHOD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.METHOD__RETURN_TYPE,
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
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.METHOD__IS_STATIC,
          oldIsStatic, isStatic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase getUsecase() {
    if (usecase != null && usecase.eIsProxy()) {
      InternalEObject oldUsecase = (InternalEObject) usecase;
      usecase = (UseCase) eResolveProxy(oldUsecase);
      if (usecase != oldUsecase) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SWVSPackage.METHOD__USECASE,
              oldUsecase, usecase));
      }
    }
    return usecase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase basicGetUsecase() {
    return usecase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsecase(UseCase newUsecase) {
    UseCase oldUsecase = usecase;
    usecase = newUsecase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.METHOD__USECASE, oldUsecase,
          usecase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SWVS.Object> getBase() {
    if (base == null) {
      base =
          new EObjectResolvingEList<SWVS.Object>(SWVS.Object.class, this, SWVSPackage.METHOD__BASE);
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
      argument = new EDataTypeUniqueEList<String>(String.class, this, SWVSPackage.METHOD__ARGUMENT);
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
      case SWVSPackage.METHOD__RETURN_TYPE:
        return getReturnType();
      case SWVSPackage.METHOD__IS_STATIC:
        return isIsStatic();
      case SWVSPackage.METHOD__USECASE:
        if (resolve)
          return getUsecase();
        return basicGetUsecase();
      case SWVSPackage.METHOD__BASE:
        return getBase();
      case SWVSPackage.METHOD__ARGUMENT:
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
      case SWVSPackage.METHOD__RETURN_TYPE:
        setReturnType((String) newValue);
        return;
      case SWVSPackage.METHOD__IS_STATIC:
        setIsStatic((Boolean) newValue);
        return;
      case SWVSPackage.METHOD__USECASE:
        setUsecase((UseCase) newValue);
        return;
      case SWVSPackage.METHOD__BASE:
        getBase().clear();
        getBase().addAll((Collection<? extends SWVS.Object>) newValue);
        return;
      case SWVSPackage.METHOD__ARGUMENT:
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
      case SWVSPackage.METHOD__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
        return;
      case SWVSPackage.METHOD__IS_STATIC:
        setIsStatic(IS_STATIC_EDEFAULT);
        return;
      case SWVSPackage.METHOD__USECASE:
        setUsecase((UseCase) null);
        return;
      case SWVSPackage.METHOD__BASE:
        getBase().clear();
        return;
      case SWVSPackage.METHOD__ARGUMENT:
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
      case SWVSPackage.METHOD__RETURN_TYPE:
        return RETURN_TYPE_EDEFAULT == null ? returnType != null
            : !RETURN_TYPE_EDEFAULT.equals(returnType);
      case SWVSPackage.METHOD__IS_STATIC:
        return isStatic != IS_STATIC_EDEFAULT;
      case SWVSPackage.METHOD__USECASE:
        return usecase != null;
      case SWVSPackage.METHOD__BASE:
        return base != null && !base.isEmpty();
      case SWVSPackage.METHOD__ARGUMENT:
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

} //MethodImpl
