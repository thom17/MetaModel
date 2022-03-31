/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.System#getSystemType <em>System Type</em>}</li>
 *   <li>{@link SWVS.System#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link SWVS.System#getDefClass <em>Def Class</em>}</li>
 *   <li>{@link SWVS.System#getState <em>State</em>}</li>
 *   <li>{@link SWVS.System#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends SWVS.Object {
	/**
	 * Returns the value of the '<em><b>System Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' attribute.
	 * @see #setSystemType(String)
	 * @see SWVS.SWVSPackage#getSystem_SystemType()
	 * @model
	 * @generated
	 */
	String getSystemType();

	/**
	 * Sets the value of the '{@link SWVS.System#getSystemType <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' attribute.
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(String value);

	/**
	 * Returns the value of the '<em><b>Usecase</b></em>' containment reference list.
	 * The list contents are of type {@link SWVS.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecase</em>' containment reference list.
	 * @see SWVS.SWVSPackage#getSystem_Usecase()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getUsecase();

	/**
	 * Returns the value of the '<em><b>Def Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Class</em>' reference.
	 * @see #setDefClass(SWVS.Class)
	 * @see SWVS.SWVSPackage#getSystem_DefClass()
	 * @model
	 * @generated
	 */
	SWVS.Class getDefClass();

	/**
	 * Sets the value of the '{@link SWVS.System#getDefClass <em>Def Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Class</em>' reference.
	 * @see #getDefClass()
	 * @generated
	 */
	void setDefClass(SWVS.Class value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link SWVS.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see SWVS.SWVSPackage#getSystem_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference list.
	 * The list contents are of type {@link SWVS.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference list.
	 * @see SWVS.SWVSPackage#getSystem_Requirement()
	 * @model
	 * @generated
	 */
	EList<Requirement> getRequirement();

} // System
