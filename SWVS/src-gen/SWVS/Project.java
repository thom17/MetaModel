/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Project#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link SWVS.Project#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link SWVS.Project#getSystems <em>Systems</em>}</li>
 *   <li>{@link SWVS.Project#getActorList <em>Actor List</em>}</li>
 *   <li>{@link SWVS.Project#getClassList <em>Class List</em>}</li>
 *   <li>{@link SWVS.Project#getMObjects <em>MObjects</em>}</li>
 *   <li>{@link SWVS.Project#getObjects <em>Objects</em>}</li>
 *   <li>{@link SWVS.Project#getFinDate <em>Fin Date</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
  /**
   * Returns the value of the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Name</em>' attribute.
   * @see #setProjectName(String)
   * @see SWVS.SWVSPackage#getProject_ProjectName()
   * @model
   * @generated
   */
  String getProjectName();

  /**
   * Sets the value of the '{@link SWVS.Project#getProjectName <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Name</em>' attribute.
   * @see #getProjectName()
   * @generated
   */
  void setProjectName(String value);

  /**
   * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.Requirement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement</em>' containment reference list.
   * @see SWVS.SWVSPackage#getProject_Requirement()
   * @model containment="true"
   * @generated
   */
  EList<Requirement> getRequirement();

  /**
   * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.MSystem}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Systems</em>' containment reference list.
   * @see SWVS.SWVSPackage#getProject_Systems()
   * @model containment="true"
   * @generated
   */
  EList<MSystem> getSystems();

  /**
   * Returns the value of the '<em><b>Actor List</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.Actor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor List</em>' containment reference list.
   * @see SWVS.SWVSPackage#getProject_ActorList()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getActorList();

  /**
   * Returns the value of the '<em><b>Class List</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.MClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class List</em>' containment reference list.
   * @see SWVS.SWVSPackage#getProject_ClassList()
   * @model containment="true"
   * @generated
   */
  EList<MClass> getClassList();

  /**
   * Returns the value of the '<em><b>MObjects</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.MObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>MObjects</em>' containment reference list.
   * @see SWVS.SWVSPackage#getProject_MObjects()
   * @model containment="true"
   * @generated
   */
  EList<MObject> getMObjects();

  /**
   * Returns the value of the '<em><b>Objects</b></em>' reference list.
   * The list contents are of type {@link SWVS.MObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' reference list.
   * @see SWVS.SWVSPackage#getProject_Objects()
   * @model
   * @generated
   */
  EList<MObject> getObjects();

  /**
   * Returns the value of the '<em><b>Fin Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fin Date</em>' attribute.
   * @see #setFinDate(String)
   * @see SWVS.SWVSPackage#getProject_FinDate()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   * @generated
   */
  String getFinDate();

  /**
   * Sets the value of the '{@link SWVS.Project#getFinDate <em>Fin Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fin Date</em>' attribute.
   * @see #getFinDate()
   * @generated
   */
  void setFinDate(String value);

} // Project
