/**
 */
package SWVS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Beverage#getPrice <em>Price</em>}</li>
 *   <li>{@link SWVS.Beverage#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getBeverage()
 * @model
 * @generated
 */
public interface Beverage extends EObject {
  /**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #setPrice(int)
   * @see SWVS.SWVSPackage#getBeverage_Price()
   * @model
   * @generated
   */
  int getPrice();

  /**
   * Sets the value of the '{@link SWVS.Beverage#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
  void setPrice(int value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see SWVS.SWVSPackage#getBeverage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link SWVS.Beverage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Beverage
