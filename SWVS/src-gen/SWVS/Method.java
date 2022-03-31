/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Method#getFlow <em>Flow</em>}</li>
 *   <li>{@link SWVS.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link SWVS.Method#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link SWVS.Method#getUsecase <em>Usecase</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends SWVS.Object {
	/**
	 * Returns the value of the '<em><b>Flow</b></em>' reference list.
	 * The list contents are of type {@link SWVS.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' reference list.
	 * @see SWVS.SWVSPackage#getMethod_Flow()
	 * @model
	 * @generated
	 */
	EList<Flow> getFlow();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see SWVS.SWVSPackage#getMethod_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link SWVS.Method#getReturnType <em>Return Type</em>}' attribute.
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
	 * @see SWVS.SWVSPackage#getMethod_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link SWVS.Method#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecase</em>' reference.
	 * @see #setUsecase(UseCase)
	 * @see SWVS.SWVSPackage#getMethod_Usecase()
	 * @model
	 * @generated
	 */
	UseCase getUsecase();

	/**
	 * Sets the value of the '{@link SWVS.Method#getUsecase <em>Usecase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usecase</em>' reference.
	 * @see #getUsecase()
	 * @generated
	 */
	void setUsecase(UseCase value);

} // Method
