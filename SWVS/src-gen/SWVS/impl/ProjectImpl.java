/**
 */
package SWVS.impl;

import SWVS.Actor;
import SWVS.MClass;
import SWVS.MObject;
import SWVS.MSystem;
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
 *   <li>{@link SWVS.impl.ProjectImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getActorList <em>Actor List</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getClassList <em>Class List</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getMObjects <em>MObjects</em>}</li>
 *   <li>{@link SWVS.impl.ProjectImpl#getObjects <em>Objects</em>}</li>
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
   * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystems()
   * @generated
   * @ordered
   */
  protected EList<MSystem> systems;

  /**
   * The cached value of the '{@link #getActorList() <em>Actor List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorList()
   * @generated
   * @ordered
   */
  protected EList<Actor> actorList;

  /**
   * The cached value of the '{@link #getClassList() <em>Class List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassList()
   * @generated
   * @ordered
   */
  protected EList<MClass> classList;

  /**
   * The cached value of the '{@link #getMObjects() <em>MObjects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMObjects()
   * @generated
   * @ordered
   */
  protected EList<MObject> mObjects;

  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList<MObject> objects;

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
  public EList<MSystem> getSystems() {
    if (systems == null) {
      systems =
          new EObjectContainmentEList<MSystem>(MSystem.class, this, SWVSPackage.PROJECT__SYSTEMS);
    }
    return systems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Actor> getActorList() {
    if (actorList == null) {
      actorList =
          new EObjectContainmentEList<Actor>(Actor.class, this, SWVSPackage.PROJECT__ACTOR_LIST);
    }
    return actorList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MClass> getClassList() {
    if (classList == null) {
      classList =
          new EObjectContainmentEList<MClass>(MClass.class, this, SWVSPackage.PROJECT__CLASS_LIST);
    }
    return classList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MObject> getMObjects() {
    if (mObjects == null) {
      mObjects =
          new EObjectContainmentEList<MObject>(MObject.class, this, SWVSPackage.PROJECT__MOBJECTS);
    }
    return mObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MObject> getObjects() {
    if (objects == null) {
      objects =
          new EObjectResolvingEList<MObject>(MObject.class, this, SWVSPackage.PROJECT__OBJECTS);
    }
    return objects;
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
      case SWVSPackage.PROJECT__SYSTEMS:
        return ((InternalEList<?>) getSystems()).basicRemove(otherEnd, msgs);
      case SWVSPackage.PROJECT__ACTOR_LIST:
        return ((InternalEList<?>) getActorList()).basicRemove(otherEnd, msgs);
      case SWVSPackage.PROJECT__CLASS_LIST:
        return ((InternalEList<?>) getClassList()).basicRemove(otherEnd, msgs);
      case SWVSPackage.PROJECT__MOBJECTS:
        return ((InternalEList<?>) getMObjects()).basicRemove(otherEnd, msgs);
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
      case SWVSPackage.PROJECT__SYSTEMS:
        return getSystems();
      case SWVSPackage.PROJECT__ACTOR_LIST:
        return getActorList();
      case SWVSPackage.PROJECT__CLASS_LIST:
        return getClassList();
      case SWVSPackage.PROJECT__MOBJECTS:
        return getMObjects();
      case SWVSPackage.PROJECT__OBJECTS:
        return getObjects();
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
      case SWVSPackage.PROJECT__SYSTEMS:
        getSystems().clear();
        getSystems().addAll((Collection<? extends MSystem>) newValue);
        return;
      case SWVSPackage.PROJECT__ACTOR_LIST:
        getActorList().clear();
        getActorList().addAll((Collection<? extends Actor>) newValue);
        return;
      case SWVSPackage.PROJECT__CLASS_LIST:
        getClassList().clear();
        getClassList().addAll((Collection<? extends MClass>) newValue);
        return;
      case SWVSPackage.PROJECT__MOBJECTS:
        getMObjects().clear();
        getMObjects().addAll((Collection<? extends MObject>) newValue);
        return;
      case SWVSPackage.PROJECT__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends MObject>) newValue);
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
      case SWVSPackage.PROJECT__SYSTEMS:
        getSystems().clear();
        return;
      case SWVSPackage.PROJECT__ACTOR_LIST:
        getActorList().clear();
        return;
      case SWVSPackage.PROJECT__CLASS_LIST:
        getClassList().clear();
        return;
      case SWVSPackage.PROJECT__MOBJECTS:
        getMObjects().clear();
        return;
      case SWVSPackage.PROJECT__OBJECTS:
        getObjects().clear();
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
      case SWVSPackage.PROJECT__SYSTEMS:
        return systems != null && !systems.isEmpty();
      case SWVSPackage.PROJECT__ACTOR_LIST:
        return actorList != null && !actorList.isEmpty();
      case SWVSPackage.PROJECT__CLASS_LIST:
        return classList != null && !classList.isEmpty();
      case SWVSPackage.PROJECT__MOBJECTS:
        return mObjects != null && !mObjects.isEmpty();
      case SWVSPackage.PROJECT__OBJECTS:
        return objects != null && !objects.isEmpty();
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
