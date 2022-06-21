/**
 */
package SWVS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Tea#getTea_back <em>Tea back</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getTea()
 * @model
 * @generated
 */
public interface Tea extends Beverage {
  /**
   * Returns the value of the '<em><b>Tea back</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tea back</em>' containment reference.
   * @see #setTea_back(Tea_Back)
   * @see SWVS.SWVSPackage#getTea_Tea_back()
   * @model containment="true"
   * @generated
   */
  Tea_Back getTea_back();

  /**
   * Sets the value of the '{@link SWVS.Tea#getTea_back <em>Tea back</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tea back</em>' containment reference.
   * @see #getTea_back()
   * @generated
   */
  void setTea_back(Tea_Back value);

} // Tea
