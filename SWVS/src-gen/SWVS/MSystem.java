/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.MSystem#getSystemType <em>System Type</em>}</li>
 *   <li>{@link SWVS.MSystem#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link SWVS.MSystem#getDefClass <em>Def Class</em>}</li>
 *   <li>{@link SWVS.MSystem#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getMSystem()
 * @model
 * @generated
 */
public interface MSystem extends MObject {
  /**
   * Returns the value of the '<em><b>System Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Type</em>' attribute.
   * @see #setSystemType(String)
   * @see SWVS.SWVSPackage#getMSystem_SystemType()
   * @model
   * @generated
   */
  String getSystemType();

  /**
   * Sets the value of the '{@link SWVS.MSystem#getSystemType <em>System Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System Type</em>' attribute.
   * @see #getSystemType()
   * @generated
   */
  void setSystemType(String value);

  /**
   * Returns the value of the '<em><b>Usecase</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.UseCase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usecase</em>' containment reference list.
   * @see SWVS.SWVSPackage#getMSystem_Usecase()
   * @model containment="true"
   * @generated
   */
  EList<UseCase> getUsecase();

  /**
   * Returns the value of the '<em><b>Def Class</b></em>' reference list.
   * The list contents are of type {@link SWVS.MClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def Class</em>' reference list.
   * @see SWVS.SWVSPackage#getMSystem_DefClass()
   * @model
   * @generated
   */
  EList<MClass> getDefClass();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see SWVS.SWVSPackage#getMSystem_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // MSystem
