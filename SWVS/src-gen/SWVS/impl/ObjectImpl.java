/**
 */
package SWVS.impl;

import SWVS.SWVSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.ObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link SWVS.impl.ObjectImpl#getData_base_SrcName <em>Data base Src Name</em>}</li>
 *   <li>{@link SWVS.impl.ObjectImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link SWVS.impl.ObjectImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link SWVS.impl.ObjectImpl#isAddedObject <em>Added Object</em>}</li>
 *   <li>{@link SWVS.impl.ObjectImpl#getImplementName <em>Implement Name</em>}</li>
 *   <li>{@link SWVS.impl.ObjectImpl#getObjectName <em>Object Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements SWVS.Object {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getData_base_SrcName() <em>Data base Src Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_base_SrcName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_BASE_SRC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData_base_SrcName() <em>Data base Src Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_base_SrcName()
	 * @generated
	 * @ordered
	 */
	protected String data_base_SrcName = DATA_BASE_SRC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected String objectType = OBJECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isAddedObject() <em>Added Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddedObject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADDED_OBJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAddedObject() <em>Added Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddedObject()
	 * @generated
	 * @ordered
	 */
	protected boolean addedObject = ADDED_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementName() <em>Implement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementName() <em>Implement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementName()
	 * @generated
	 * @ordered
	 */
	protected String implementName = IMPLEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectName()
	 * @generated
	 * @ordered
	 */
	protected String objectName = OBJECT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SWVSPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData_base_SrcName() {
		return data_base_SrcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_base_SrcName(String newData_base_SrcName) {
		String oldData_base_SrcName = data_base_SrcName;
		data_base_SrcName = newData_base_SrcName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.OBJECT__DATA_BASE_SRC_NAME,
					oldData_base_SrcName, data_base_SrcName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(String newObjectType) {
		String oldObjectType = objectType;
		objectType = newObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.OBJECT__OBJECT_TYPE, oldObjectType,
					objectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.OBJECT__FILE_PATH, oldFilePath,
					filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAddedObject() {
		return addedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddedObject(boolean newAddedObject) {
		boolean oldAddedObject = addedObject;
		addedObject = newAddedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.OBJECT__ADDED_OBJECT, oldAddedObject,
					addedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementName() {
		return implementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementName(String newImplementName) {
		String oldImplementName = implementName;
		implementName = newImplementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.OBJECT__IMPLEMENT_NAME, oldImplementName,
					implementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectName(String newObjectName) {
		String oldObjectName = objectName;
		objectName = newObjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.OBJECT__OBJECT_NAME, oldObjectName,
					objectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SWVSPackage.OBJECT__ID:
			return getId();
		case SWVSPackage.OBJECT__DATA_BASE_SRC_NAME:
			return getData_base_SrcName();
		case SWVSPackage.OBJECT__OBJECT_TYPE:
			return getObjectType();
		case SWVSPackage.OBJECT__FILE_PATH:
			return getFilePath();
		case SWVSPackage.OBJECT__ADDED_OBJECT:
			return isAddedObject();
		case SWVSPackage.OBJECT__IMPLEMENT_NAME:
			return getImplementName();
		case SWVSPackage.OBJECT__OBJECT_NAME:
			return getObjectName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SWVSPackage.OBJECT__ID:
			setId((String) newValue);
			return;
		case SWVSPackage.OBJECT__DATA_BASE_SRC_NAME:
			setData_base_SrcName((String) newValue);
			return;
		case SWVSPackage.OBJECT__OBJECT_TYPE:
			setObjectType((String) newValue);
			return;
		case SWVSPackage.OBJECT__FILE_PATH:
			setFilePath((String) newValue);
			return;
		case SWVSPackage.OBJECT__ADDED_OBJECT:
			setAddedObject((Boolean) newValue);
			return;
		case SWVSPackage.OBJECT__IMPLEMENT_NAME:
			setImplementName((String) newValue);
			return;
		case SWVSPackage.OBJECT__OBJECT_NAME:
			setObjectName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SWVSPackage.OBJECT__ID:
			setId(ID_EDEFAULT);
			return;
		case SWVSPackage.OBJECT__DATA_BASE_SRC_NAME:
			setData_base_SrcName(DATA_BASE_SRC_NAME_EDEFAULT);
			return;
		case SWVSPackage.OBJECT__OBJECT_TYPE:
			setObjectType(OBJECT_TYPE_EDEFAULT);
			return;
		case SWVSPackage.OBJECT__FILE_PATH:
			setFilePath(FILE_PATH_EDEFAULT);
			return;
		case SWVSPackage.OBJECT__ADDED_OBJECT:
			setAddedObject(ADDED_OBJECT_EDEFAULT);
			return;
		case SWVSPackage.OBJECT__IMPLEMENT_NAME:
			setImplementName(IMPLEMENT_NAME_EDEFAULT);
			return;
		case SWVSPackage.OBJECT__OBJECT_NAME:
			setObjectName(OBJECT_NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SWVSPackage.OBJECT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SWVSPackage.OBJECT__DATA_BASE_SRC_NAME:
			return DATA_BASE_SRC_NAME_EDEFAULT == null ? data_base_SrcName != null
					: !DATA_BASE_SRC_NAME_EDEFAULT.equals(data_base_SrcName);
		case SWVSPackage.OBJECT__OBJECT_TYPE:
			return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
		case SWVSPackage.OBJECT__FILE_PATH:
			return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
		case SWVSPackage.OBJECT__ADDED_OBJECT:
			return addedObject != ADDED_OBJECT_EDEFAULT;
		case SWVSPackage.OBJECT__IMPLEMENT_NAME:
			return IMPLEMENT_NAME_EDEFAULT == null ? implementName != null
					: !IMPLEMENT_NAME_EDEFAULT.equals(implementName);
		case SWVSPackage.OBJECT__OBJECT_NAME:
			return OBJECT_NAME_EDEFAULT == null ? objectName != null : !OBJECT_NAME_EDEFAULT.equals(objectName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", data_base_SrcName: ");
		result.append(data_base_SrcName);
		result.append(", objectType: ");
		result.append(objectType);
		result.append(", filePath: ");
		result.append(filePath);
		result.append(", addedObject: ");
		result.append(addedObject);
		result.append(", implementName: ");
		result.append(implementName);
		result.append(", objectName: ");
		result.append(objectName);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
