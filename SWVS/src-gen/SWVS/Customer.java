/**
 */
package SWVS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Customer#getName <em>Name</em>}</li>
 *   <li>{@link SWVS.Customer#getBeverage <em>Beverage</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see SWVS.SWVSPackage#getCustomer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link SWVS.Customer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Beverage</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beverage</em>' reference.
   * @see #setBeverage(Beverage)
   * @see SWVS.SWVSPackage#getCustomer_Beverage()
   * @model
   * @generated
   */
  Beverage getBeverage();

  /**
   * Sets the value of the '{@link SWVS.Customer#getBeverage <em>Beverage</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beverage</em>' reference.
   * @see #getBeverage()
   * @generated
   */
  void setBeverage(Beverage value);

} // Customer
