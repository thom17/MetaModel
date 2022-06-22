/**
 */
package SWVS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SWVS.MObject#getId <em>Id</em>}</li>
 *   <li>{@link SWVS.MObject#getData_base_SrcName <em>Data base Src Name</em>}</li>
 *   <li>{@link SWVS.MObject#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link SWVS.MObject#getFilePath <em>File Path</em>}</li>
 *   <li>{@link SWVS.MObject#isAddedObject <em>Added Object</em>}</li>
 *   <li>{@link SWVS.MObject#getImplementName <em>Implement Name</em>}</li>
 *   <li>{@link SWVS.MObject#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link SWVS.MObject#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see SWVS.SWVSPackage#getMObject()
 * @model
 * @generated
 */
public interface MObject extends EObject {
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see SWVS.SWVSPackage#getMObject_Id()
   * @model default="" id="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link SWVS.MObject#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data base Src Name</em>' attribute.
   * @see #setData_base_SrcName(String)
   * @see SWVS.SWVSPackage#getMObject_Data_base_SrcName()
   * @model
   * @generated
   */
  String getData_base_SrcName();

  /**
   * Sets the value of the '{@link SWVS.MObject#getData_base_SrcName <em>Data base Src Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data base Src Name</em>' attribute.
   * @see #getData_base_SrcName()
   * @generated
   */
  void setData_base_SrcName(String value);

  /**
   * Returns the value of the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type</em>' attribute.
   * @see #setObjectType(String)
   * @see SWVS.SWVSPackage#getMObject_ObjectType()
   * @model
   * @generated
   */
  String getObjectType();

  /**
   * Sets the value of the '{@link SWVS.MObject#getObjectType <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type</em>' attribute.
   * @see #getObjectType()
   * @generated
   */
  void setObjectType(String value);

  /**
   * Returns the value of the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Path</em>' attribute.
   * @see #setFilePath(String)
   * @see SWVS.SWVSPackage#getMObject_FilePath()
   * @model
   * @generated
   */
  String getFilePath();

  /**
   * Sets the value of the '{@link SWVS.MObject#getFilePath <em>File Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Path</em>' attribute.
   * @see #getFilePath()
   * @generated
   */
  void setFilePath(String value);

  /**
   * Returns the value of the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Added Object</em>' attribute.
   * @see #setAddedObject(boolean)
   * @see SWVS.SWVSPackage#getMObject_AddedObject()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   * @generated
   */
  boolean isAddedObject();

  /**
   * Sets the value of the '{@link SWVS.MObject#isAddedObject <em>Added Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Added Object</em>' attribute.
   * @see #isAddedObject()
   * @generated
   */
  void setAddedObject(boolean value);

  /**
   * Returns the value of the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implement Name</em>' attribute.
   * @see #setImplementName(String)
   * @see SWVS.SWVSPackage#getMObject_ImplementName()
   * @model
   * @generated
   */
  String getImplementName();

  /**
   * Sets the value of the '{@link SWVS.MObject#getImplementName <em>Implement Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implement Name</em>' attribute.
   * @see #getImplementName()
   * @generated
   */
  void setImplementName(String value);

  /**
   * Returns the value of the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Name</em>' attribute.
   * @see #setObjectName(String)
   * @see SWVS.SWVSPackage#getMObject_ObjectName()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getObjectName();

  /**
   * Sets the value of the '{@link SWVS.MObject#getObjectName <em>Object Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Name</em>' attribute.
   * @see #getObjectName()
   * @generated
   */
  void setObjectName(String value);

  /**
   * Returns the value of the '<em><b>Requirements</b></em>' reference list.
   * The list contents are of type {@link SWVS.Requirement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements</em>' reference list.
   * @see SWVS.SWVSPackage#getMObject_Requirements()
   * @model
   * @generated
   */
  EList<Requirement> getRequirements();

} // MObject
