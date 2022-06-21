/**
 */
package SWVS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coffee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Coffee#getCaffeine <em>Caffeine</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getCoffee()
 * @model
 * @generated
 */
public interface Coffee extends Beverage {
  /**
   * Returns the value of the '<em><b>Caffeine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caffeine</em>' attribute.
   * @see #setCaffeine(int)
   * @see SWVS.SWVSPackage#getCoffee_Caffeine()
   * @model
   * @generated
   */
  int getCaffeine();

  /**
   * Sets the value of the '{@link SWVS.Coffee#getCaffeine <em>Caffeine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caffeine</em>' attribute.
   * @see #getCaffeine()
   * @generated
   */
  void setCaffeine(int value);

} // Coffee
