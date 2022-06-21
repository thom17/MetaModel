/**
 */
package SWVS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Requirement#getContents <em>Contents</em>}</li>
 *   <li>{@link SWVS.Requirement#getRqType <em>Rq Type</em>}</li>
 *   <li>{@link SWVS.Requirement#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends SWVS.Object {
  /**
   * Returns the value of the '<em><b>Contents</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' attribute.
   * @see #setContents(String)
   * @see SWVS.SWVSPackage#getRequirement_Contents()
   * @model
   * @generated
   */
  String getContents();

  /**
   * Sets the value of the '{@link SWVS.Requirement#getContents <em>Contents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contents</em>' attribute.
   * @see #getContents()
   * @generated
   */
  void setContents(String value);

  /**
   * Returns the value of the '<em><b>Rq Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rq Type</em>' attribute.
   * @see #setRqType(String)
   * @see SWVS.SWVSPackage#getRequirement_RqType()
   * @model
   * @generated
   */
  String getRqType();

  /**
   * Sets the value of the '{@link SWVS.Requirement#getRqType <em>Rq Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rq Type</em>' attribute.
   * @see #getRqType()
   * @generated
   */
  void setRqType(String value);

  /**
   * Returns the value of the '<em><b>Department</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Department</em>' attribute.
   * @see #setDepartment(String)
   * @see SWVS.SWVSPackage#getRequirement_Department()
   * @model
   * @generated
   */
  String getDepartment();

  /**
   * Sets the value of the '{@link SWVS.Requirement#getDepartment <em>Department</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Department</em>' attribute.
   * @see #getDepartment()
   * @generated
   */
  void setDepartment(String value);

} // Requirement
