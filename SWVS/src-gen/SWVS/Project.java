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
 *   <li>{@link SWVS.Project#getSystem <em>System</em>}</li>
 *   <li>{@link SWVS.Project#getActor <em>Actor</em>}</li>
 *   <li>{@link SWVS.Project#getClass_ <em>Class</em>}</li>
 *   <li>{@link SWVS.Project#getObject <em>Object</em>}</li>
 *   <li>{@link SWVS.Project#getObjList <em>Obj List</em>}</li>
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
	 * Returns the value of the '<em><b>System</b></em>' containment reference list.
	 * The list contents are of type {@link SWVS.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference list.
	 * @see SWVS.SWVSPackage#getProject_System()
	 * @model containment="true"
	 * @generated
	 */
	EList<SWVS.System> getSystem();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link SWVS.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see SWVS.SWVSPackage#getProject_Actor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link SWVS.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see SWVS.SWVSPackage#getProject_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<SWVS.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link SWVS.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see SWVS.SWVSPackage#getProject_Object()
	 * @model containment="true"
	 * @generated
	 */
	EList<SWVS.Object> getObject();

	/**
	 * Returns the value of the '<em><b>Obj List</b></em>' reference list.
	 * The list contents are of type {@link SWVS.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj List</em>' reference list.
	 * @see SWVS.SWVSPackage#getProject_ObjList()
	 * @model
	 * @generated
	 */
	EList<SWVS.Object> getObjList();

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
