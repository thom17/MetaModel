/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Class#getField <em>Field</em>}</li>
 *   <li>{@link SWVS.Class#getPackage <em>Package</em>}</li>
 *   <li>{@link SWVS.Class#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link SWVS.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link SWVS.Class#getMethod <em>Method</em>}</li>
 *   <li>{@link SWVS.Class#getDefBase <em>Def Base</em>}</li>
 *   <li>{@link SWVS.Class#getClassType <em>Class Type</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends SWVS.Object {
  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.Field}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference list.
   * @see SWVS.SWVSPackage#getClass_Field()
   * @model containment="true"
   * @generated
   */
  EList<Field> getField();

  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see SWVS.SWVSPackage#getClass_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link SWVS.Class#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Has Class</b></em>' reference list.
   * The list contents are of type {@link SWVS.Class}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Class</em>' reference list.
   * @see SWVS.SWVSPackage#getClass_HasClass()
   * @model
   * @generated
   */
  EList<Class> getHasClass();

  /**
   * Returns the value of the '<em><b>Super Class</b></em>' reference list.
   * The list contents are of type {@link SWVS.Class}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Class</em>' reference list.
   * @see SWVS.SWVSPackage#getClass_SuperClass()
   * @model
   * @generated
   */
  EList<Class> getSuperClass();

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.Method}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference list.
   * @see SWVS.SWVSPackage#getClass_Method()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethod();

  /**
   * Returns the value of the '<em><b>Def Base</b></em>' reference list.
   * The list contents are of type {@link SWVS.Object}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def Base</em>' reference list.
   * @see SWVS.SWVSPackage#getClass_DefBase()
   * @model
   * @generated
   */
  EList<SWVS.Object> getDefBase();

  /**
   * Returns the value of the '<em><b>Class Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Type</em>' attribute.
   * @see #setClassType(String)
   * @see SWVS.SWVSPackage#getClass_ClassType()
   * @model
   * @generated
   */
  String getClassType();

  /**
   * Sets the value of the '{@link SWVS.Class#getClassType <em>Class Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Type</em>' attribute.
   * @see #getClassType()
   * @generated
   */
  void setClassType(String value);

} // Class
