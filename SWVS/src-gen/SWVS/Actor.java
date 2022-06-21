/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.Actor#getActUsecases <em>Act Usecases</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends SWVS.Object {
  /**
   * Returns the value of the '<em><b>Act Usecases</b></em>' reference list.
   * The list contents are of type {@link SWVS.UseCase}.
   * It is bidirectional and its opposite is '{@link SWVS.UseCase#getActActors <em>Act Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act Usecases</em>' reference list.
   * @see SWVS.SWVSPackage#getActor_ActUsecases()
   * @see SWVS.UseCase#getActActors
   * @model opposite="actActors"
   * @generated
   */
  EList<UseCase> getActUsecases();

} // Actor
