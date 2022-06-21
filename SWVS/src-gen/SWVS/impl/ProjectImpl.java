/**
 */
package SWVS.impl;

import SWVS.Actor;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.SWVSPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.ProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getSystem <em>System</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getObject <em>Object</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getObjList <em>Obj List</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getFinDate <em>Fin Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
  /**
   * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectName()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectName()
   * @generated
   * @ordered
   */
  protected String projectName = PROJECT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirement()
   * @generated
   * @ordered
   */
  protected EList<Requirement> requirement;

  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected EList<SWVS.System> system;

  /**
   * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActor()
   * @generated
   * @ordered
   */
  protected EList<Actor> actor;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<SWVS.Class> class_;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected EList<SWVS.Object> object;

  /**
   * The cached value of the '{@link #getObjList() <em>Obj List</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjList()
   * @generated
   * @ordered
   */
  protected EList<SWVS.Object> objList;

  /**
   * The default value of the '{@link #getFinDate() <em>Fin Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinDate()
   * @generated
   * @ordered
   */
  protected static final String FIN_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFinDate() <em>Fin Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinDate()
   * @generated
   * @ordered
   */
  protected String finDate = FIN_DATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SWVSPackage.Literals.PROJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjectName() {
    return projectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectName(String newProjectName) {
    String oldProjectName = projectName;
    projectName = newProjectName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.PROJECT__PROJECT_NAME,
          oldProjectName, projectName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getRequirement() {
    if (requirement == null) {
      requirement = new EObjectContainmentEList<Requirement>(Requirement.class, this,
          SWVSPackage.PROJECT__REQUIREMENT);
    }
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SWVS.System> getSystem() {
    if (system == null) {
      system = new EObjectContainmentEList<SWVS.System>(SWVS.System.class, this,
          SWVSPackage.PROJECT__SYSTEM);
    }
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Actor> getActor() {
    if (actor == null) {
      actor = new EObjectContainmentEList<Actor>(Actor.class, this, SWVSPackage.PROJECT__ACTOR);
    }
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SWVS.Class> getClass_() {
    if (class_ == null) {
      class_ = new EObjectContainmentEList<SWVS.Class>(SWVS.Class.class, this,
          SWVSPackage.PROJECT__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SWVS.Object> getObject() {
    if (object == null) {
      object = new EObjectContainmentEList<SWVS.Object>(SWVS.Object.class, this,
          SWVSPackage.PROJECT__OBJECT);
    }
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SWVS.Object> getObjList() {
    if (objList == null) {
      objList = new EObjectResolvingEList<SWVS.Object>(SWVS.Object.class, this,
          SWVSPackage.PROJECT__OBJ_LIST);
    }
    return objList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFinDate() {
    return finDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinDate(String newFinDate) {
    String oldFinDate = finDate;
    finDate = newFinDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.PROJECT__FIN_DATE,
          oldFinDate, finDate));
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
      case SWVSPackage.PROJECT__REQUIREMENT:
        return ((InternalEList<?>) getRequirement()).basicRemove(otherEnd, msgs);
      case SWVSPackage.PROJECT__SYSTEM:
        return ((InternalEList<?>) getSystem()).basicRemove(otherEnd, msgs);
      case SWVSPackage.PROJECT__ACTOR:
        return ((InternalEList<?>) getActor()).basicRemove(otherEnd, msgs);
      case SWVSPackage.PROJECT__CLASS:
        return ((InternalEList<?>) getClass_()).basicRemove(otherEnd, msgs);
      case SWVSPackage.PROJECT__OBJECT:
        return ((InternalEList<?>) getObject()).basicRemove(otherEnd, msgs);
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
      case SWVSPackage.PROJECT__PROJECT_NAME:
        return getProjectName();
      case SWVSPackage.PROJECT__REQUIREMENT:
        return getRequirement();
      case SWVSPackage.PROJECT__SYSTEM:
        return getSystem();
      case SWVSPackage.PROJECT__ACTOR:
        return getActor();
      case SWVSPackage.PROJECT__CLASS:
        return getClass_();
      case SWVSPackage.PROJECT__OBJECT:
        return getObject();
      case SWVSPackage.PROJECT__OBJ_LIST:
        return getObjList();
      case SWVSPackage.PROJECT__FIN_DATE:
        return getFinDate();
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
      case SWVSPackage.PROJECT__PROJECT_NAME:
        setProjectName((String) newValue);
        return;
      case SWVSPackage.PROJECT__REQUIREMENT:
        getRequirement().clear();
        getRequirement().addAll((Collection<? extends Requirement>) newValue);
        return;
      case SWVSPackage.PROJECT__SYSTEM:
        getSystem().clear();
        getSystem().addAll((Collection<? extends SWVS.System>) newValue);
        return;
      case SWVSPackage.PROJECT__ACTOR:
        getActor().clear();
        getActor().addAll((Collection<? extends Actor>) newValue);
        return;
      case SWVSPackage.PROJECT__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends SWVS.Class>) newValue);
        return;
      case SWVSPackage.PROJECT__OBJECT:
        getObject().clear();
        getObject().addAll((Collection<? extends SWVS.Object>) newValue);
        return;
      case SWVSPackage.PROJECT__OBJ_LIST:
        getObjList().clear();
        getObjList().addAll((Collection<? extends SWVS.Object>) newValue);
        return;
      case SWVSPackage.PROJECT__FIN_DATE:
        setFinDate((String) newValue);
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
      case SWVSPackage.PROJECT__PROJECT_NAME:
        setProjectName(PROJECT_NAME_EDEFAULT);
        return;
      case SWVSPackage.PROJECT__REQUIREMENT:
        getRequirement().clear();
        return;
      case SWVSPackage.PROJECT__SYSTEM:
        getSystem().clear();
        return;
      case SWVSPackage.PROJECT__ACTOR:
        getActor().clear();
        return;
      case SWVSPackage.PROJECT__CLASS:
        getClass_().clear();
        return;
      case SWVSPackage.PROJECT__OBJECT:
        getObject().clear();
        return;
      case SWVSPackage.PROJECT__OBJ_LIST:
        getObjList().clear();
        return;
      case SWVSPackage.PROJECT__FIN_DATE:
        setFinDate(FIN_DATE_EDEFAULT);
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
      case SWVSPackage.PROJECT__PROJECT_NAME:
        return PROJECT_NAME_EDEFAULT == null ? projectName != null
            : !PROJECT_NAME_EDEFAULT.equals(projectName);
      case SWVSPackage.PROJECT__REQUIREMENT:
        return requirement != null && !requirement.isEmpty();
      case SWVSPackage.PROJECT__SYSTEM:
        return system != null && !system.isEmpty();
      case SWVSPackage.PROJECT__ACTOR:
        return actor != null && !actor.isEmpty();
      case SWVSPackage.PROJECT__CLASS:
        return class_ != null && !class_.isEmpty();
      case SWVSPackage.PROJECT__OBJECT:
        return object != null && !object.isEmpty();
      case SWVSPackage.PROJECT__OBJ_LIST:
        return objList != null && !objList.isEmpty();
      case SWVSPackage.PROJECT__FIN_DATE:
        return FIN_DATE_EDEFAULT == null ? finDate != null : !FIN_DATE_EDEFAULT.equals(finDate);
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
    result.append(" (projectName: ");
    result.append(projectName);
    result.append(", finDate: ");
    result.append(finDate);
    result.append(')');
    return result.toString();
  }

} //ProjectImpl
