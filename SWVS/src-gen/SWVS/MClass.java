/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.MClass#getFields <em>Fields</em>}</li>
 *   <li>{@link SWVS.MClass#getPackage <em>Package</em>}</li>
 *   <li>{@link SWVS.MClass#getHasClassList <em>Has Class List</em>}</li>
 *   <li>{@link SWVS.MClass#getSuperClassList <em>Super Class List</em>}</li>
 *   <li>{@link SWVS.MClass#getMethods <em>Methods</em>}</li>
 *   <li>{@link SWVS.MClass#getDefBase <em>Def Base</em>}</li>
 *   <li>{@link SWVS.MClass#getClassType <em>Class Type</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getMClass()
 * @model
 * @generated
 */
public interface MClass extends MObject {
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.Field}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see SWVS.SWVSPackage#getMClass_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see SWVS.SWVSPackage#getMClass_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link SWVS.MClass#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Has Class List</b></em>' reference list.
   * The list contents are of type {@link SWVS.MClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Class List</em>' reference list.
   * @see SWVS.SWVSPackage#getMClass_HasClassList()
   * @model
   * @generated
   */
  EList<MClass> getHasClassList();

  /**
   * Returns the value of the '<em><b>Super Class List</b></em>' reference list.
   * The list contents are of type {@link SWVS.MClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Class List</em>' reference list.
   * @see SWVS.SWVSPackage#getMClass_SuperClassList()
   * @model
   * @generated
   */
  EList<MClass> getSuperClassList();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.MMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see SWVS.SWVSPackage#getMClass_Methods()
   * @model containment="true"
   * @generated
   */
  EList<MMethod> getMethods();

  /**
   * Returns the value of the '<em><b>Def Base</b></em>' reference list.
   * The list contents are of type {@link SWVS.MObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def Base</em>' reference list.
   * @see SWVS.SWVSPackage#getMClass_DefBase()
   * @model
   * @generated
   */
  EList<MObject> getDefBase();

  /**
   * Returns the value of the '<em><b>Class Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Type</em>' attribute.
   * @see #setClassType(String)
   * @see SWVS.SWVSPackage#getMClass_ClassType()
   * @model
   * @generated
   */
  String getClassType();

  /**
   * Sets the value of the '{@link SWVS.MClass#getClassType <em>Class Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Type</em>' attribute.
   * @see #getClassType()
   * @generated
   */
  void setClassType(String value);

} // MClass
