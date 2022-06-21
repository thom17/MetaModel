/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Flow#getFlowId <em>Flow Id</em>}</li>
 *   <li>{@link SWVS.Flow#getHost <em>Host</em>}</li>
 *   <li>{@link SWVS.Flow#getClient <em>Client</em>}</li>
 *   <li>{@link SWVS.Flow#getContext <em>Context</em>}</li>
 *   <li>{@link SWVS.Flow#getDetailFlow <em>Detail Flow</em>}</li>
 *   <li>{@link SWVS.Flow#getResult <em>Result</em>}</li>
 *   <li>{@link SWVS.Flow#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends SWVS.Object {
  /**
   * Returns the value of the '<em><b>Flow Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow Id</em>' attribute.
   * @see #setFlowId(String)
   * @see SWVS.SWVSPackage#getFlow_FlowId()
   * @model
   * @generated
   */
  String getFlowId();

  /**
   * Sets the value of the '{@link SWVS.Flow#getFlowId <em>Flow Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flow Id</em>' attribute.
   * @see #getFlowId()
   * @generated
   */
  void setFlowId(String value);

  /**
   * Returns the value of the '<em><b>Host</b></em>' reference list.
   * The list contents are of type {@link SWVS.Object}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host</em>' reference list.
   * @see SWVS.SWVSPackage#getFlow_Host()
   * @model
   * @generated
   */
  EList<SWVS.Object> getHost();

  /**
   * Returns the value of the '<em><b>Client</b></em>' reference list.
   * The list contents are of type {@link SWVS.Object}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client</em>' reference list.
   * @see SWVS.SWVSPackage#getFlow_Client()
   * @model
   * @generated
   */
  EList<SWVS.Object> getClient();

  /**
   * Returns the value of the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' attribute.
   * @see #setContext(String)
   * @see SWVS.SWVSPackage#getFlow_Context()
   * @model
   * @generated
   */
  String getContext();

  /**
   * Sets the value of the '{@link SWVS.Flow#getContext <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' attribute.
   * @see #getContext()
   * @generated
   */
  void setContext(String value);

  /**
   * Returns the value of the '<em><b>Detail Flow</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.Flow}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detail Flow</em>' containment reference list.
   * @see SWVS.SWVSPackage#getFlow_DetailFlow()
   * @model containment="true"
   * @generated
   */
  EList<Flow> getDetailFlow();

  /**
   * Returns the value of the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' attribute.
   * @see #setResult(String)
   * @see SWVS.SWVSPackage#getFlow_Result()
   * @model
   * @generated
   */
  String getResult();

  /**
   * Sets the value of the '{@link SWVS.Flow#getResult <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' attribute.
   * @see #getResult()
   * @generated
   */
  void setResult(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see SWVS.SWVSPackage#getFlow_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link SWVS.Flow#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

} // Flow
