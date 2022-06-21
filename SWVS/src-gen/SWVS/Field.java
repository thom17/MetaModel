/**
 */
package SWVS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Field#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link SWVS.Field#isIsClass <em>Is Class</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getField()
 * @model
 * @generated
 */
public interface Field extends SWVS.Object {
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' attribute.
   * @see #setTypeName(String)
   * @see SWVS.SWVSPackage#getField_TypeName()
   * @model
   * @generated
   */
  String getTypeName();

  /**
   * Sets the value of the '{@link SWVS.Field#getTypeName <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' attribute.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(String value);

  /**
   * Returns the value of the '<em><b>Is Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Class</em>' attribute.
   * @see #setIsClass(boolean)
   * @see SWVS.SWVSPackage#getField_IsClass()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   * @generated
   */
  boolean isIsClass();

  /**
   * Sets the value of the '{@link SWVS.Field#isIsClass <em>Is Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Class</em>' attribute.
   * @see #isIsClass()
   * @generated
   */
  void setIsClass(boolean value);

} // Field
