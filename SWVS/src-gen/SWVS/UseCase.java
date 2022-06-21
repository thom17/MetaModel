/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.UseCase#getExtend <em>Extend</em>}</li>
 *   <li>{@link SWVS.UseCase#getInclude <em>Include</em>}</li>
 *   <li>{@link SWVS.UseCase#getFlow <em>Flow</em>}</li>
 *   <li>{@link SWVS.UseCase#getContext <em>Context</em>}</li>
 *   <li>{@link SWVS.UseCase#getActActors <em>Act Actors</em>}</li>
 *   <li>{@link SWVS.UseCase#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends SWVS.Object {
  /**
   * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.UseCase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extend</em>' containment reference list.
   * @see SWVS.SWVSPackage#getUseCase_Extend()
   * @model containment="true"
   * @generated
   */
  EList<UseCase> getExtend();

  /**
   * Returns the value of the '<em><b>Include</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.UseCase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include</em>' containment reference list.
   * @see SWVS.SWVSPackage#getUseCase_Include()
   * @model containment="true"
   * @generated
   */
  EList<UseCase> getInclude();

  /**
   * Returns the value of the '<em><b>Flow</b></em>' containment reference list.
   * The list contents are of type {@link SWVS.Flow}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow</em>' containment reference list.
   * @see SWVS.SWVSPackage#getUseCase_Flow()
   * @model containment="true"
   * @generated
   */
  EList<Flow> getFlow();

  /**
   * Returns the value of the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' attribute.
   * @see #setContext(String)
   * @see SWVS.SWVSPackage#getUseCase_Context()
   * @model
   * @generated
   */
  String getContext();

  /**
   * Sets the value of the '{@link SWVS.UseCase#getContext <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' attribute.
   * @see #getContext()
   * @generated
   */
  void setContext(String value);

  /**
   * Returns the value of the '<em><b>Act Actors</b></em>' reference list.
   * The list contents are of type {@link SWVS.Actor}.
   * It is bidirectional and its opposite is '{@link SWVS.Actor#getActUsecases <em>Act Usecases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act Actors</em>' reference list.
   * @see SWVS.SWVSPackage#getUseCase_ActActors()
   * @see SWVS.Actor#getActUsecases
   * @model opposite="actUsecases"
   * @generated
   */
  EList<Actor> getActActors();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see SWVS.SWVSPackage#getUseCase_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link SWVS.UseCase#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

} // UseCase
