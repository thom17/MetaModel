/**
 */
package SWVS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Condition#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link SWVS.Condition#getPostCondition <em>Post Condition</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' attribute.
	 * @see #setPreCondition(String)
	 * @see SWVS.SWVSPackage#getCondition_PreCondition()
	 * @model
	 * @generated
	 */
	String getPreCondition();

	/**
	 * Sets the value of the '{@link SWVS.Condition#getPreCondition <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' attribute.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(String value);

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' attribute.
	 * @see #setPostCondition(String)
	 * @see SWVS.SWVSPackage#getCondition_PostCondition()
	 * @model
	 * @generated
	 */
	String getPostCondition();

	/**
	 * Sets the value of the '{@link SWVS.Condition#getPostCondition <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' attribute.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(String value);

} // Condition
