/**
 */
package SWVS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.State#getStateId <em>State Id</em>}</li>
 *   <li>{@link SWVS.State#getUseCaseStatus <em>Use Case Status</em>}</li>
 *   <li>{@link SWVS.State#getImplementationStatus <em>Implementation Status</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
  /**
   * Returns the value of the '<em><b>State Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Id</em>' attribute.
   * @see #setStateId(String)
   * @see SWVS.SWVSPackage#getState_StateId()
   * @model id="true"
   * @generated
   */
  String getStateId();

  /**
   * Sets the value of the '{@link SWVS.State#getStateId <em>State Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Id</em>' attribute.
   * @see #getStateId()
   * @generated
   */
  void setStateId(String value);

  /**
   * Returns the value of the '<em><b>Use Case Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Case Status</em>' attribute.
   * @see #setUseCaseStatus(String)
   * @see SWVS.SWVSPackage#getState_UseCaseStatus()
   * @model
   * @generated
   */
  String getUseCaseStatus();

  /**
   * Sets the value of the '{@link SWVS.State#getUseCaseStatus <em>Use Case Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Case Status</em>' attribute.
   * @see #getUseCaseStatus()
   * @generated
   */
  void setUseCaseStatus(String value);

  /**
   * Returns the value of the '<em><b>Implementation Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementation Status</em>' attribute.
   * @see #setImplementationStatus(String)
   * @see SWVS.SWVSPackage#getState_ImplementationStatus()
   * @model
   * @generated
   */
  String getImplementationStatus();

  /**
   * Sets the value of the '{@link SWVS.State#getImplementationStatus <em>Implementation Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implementation Status</em>' attribute.
   * @see #getImplementationStatus()
   * @generated
   */
  void setImplementationStatus(String value);

} // State
