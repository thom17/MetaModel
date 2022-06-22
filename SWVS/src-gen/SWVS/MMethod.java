/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.MMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link SWVS.MMethod#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link SWVS.MMethod#getTestUsecase <em>Test Usecase</em>}</li>
 *   <li>{@link SWVS.MMethod#getBase <em>Base</em>}</li>
 *   <li>{@link SWVS.MMethod#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getMMethod()
 * @model
 * @generated
 */
public interface MMethod extends MObject {
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see #setReturnType(String)
   * @see SWVS.SWVSPackage#getMMethod_ReturnType()
   * @model
   * @generated
   */
  String getReturnType();

  /**
   * Sets the value of the '{@link SWVS.MMethod#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(String value);

  /**
   * Returns the value of the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Static</em>' attribute.
   * @see #setIsStatic(boolean)
   * @see SWVS.SWVSPackage#getMMethod_IsStatic()
   * @model
   * @generated
   */
  boolean isIsStatic();

  /**
   * Sets the value of the '{@link SWVS.MMethod#isIsStatic <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Static</em>' attribute.
   * @see #isIsStatic()
   * @generated
   */
  void setIsStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Test Usecase</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Usecase</em>' reference.
   * @see #setTestUsecase(UseCase)
   * @see SWVS.SWVSPackage#getMMethod_TestUsecase()
   * @model
   * @generated
   */
  UseCase getTestUsecase();

  /**
   * Sets the value of the '{@link SWVS.MMethod#getTestUsecase <em>Test Usecase</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Usecase</em>' reference.
   * @see #getTestUsecase()
   * @generated
   */
  void setTestUsecase(UseCase value);

  /**
   * Returns the value of the '<em><b>Base</b></em>' reference list.
   * The list contents are of type {@link SWVS.MObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference list.
   * @see SWVS.SWVSPackage#getMMethod_Base()
   * @model
   * @generated
   */
  EList<MObject> getBase();

  /**
   * Returns the value of the '<em><b>Argument</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' attribute list.
   * @see SWVS.SWVSPackage#getMMethod_Argument()
   * @model
   * @generated
   */
  EList<String> getArgument();

} // MMethod
