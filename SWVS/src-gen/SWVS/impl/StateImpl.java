/**
 */
package SWVS.impl;

import SWVS.SWVSPackage;
import SWVS.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.StateImpl#getStateId <em>State Id</em>}</li>
 *   <li>{@link SWVS.impl.StateImpl#getUseCaseStatus <em>Use Case Status</em>}</li>
 *   <li>{@link SWVS.impl.StateImpl#getImplementationStatus <em>Implementation Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getStateId() <em>State Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateId() <em>State Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateId()
	 * @generated
	 * @ordered
	 */
	protected String stateId = STATE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseCaseStatus() <em>Use Case Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaseStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_CASE_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseCaseStatus() <em>Use Case Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaseStatus()
	 * @generated
	 * @ordered
	 */
	protected String useCaseStatus = USE_CASE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationStatus() <em>Implementation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationStatus() <em>Implementation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationStatus()
	 * @generated
	 * @ordered
	 */
	protected String implementationStatus = IMPLEMENTATION_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SWVSPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateId() {
		return stateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateId(String newStateId) {
		String oldStateId = stateId;
		stateId = newStateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.STATE__STATE_ID, oldStateId, stateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseCaseStatus() {
		return useCaseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCaseStatus(String newUseCaseStatus) {
		String oldUseCaseStatus = useCaseStatus;
		useCaseStatus = newUseCaseStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.STATE__USE_CASE_STATUS, oldUseCaseStatus,
					useCaseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationStatus() {
		return implementationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationStatus(String newImplementationStatus) {
		String oldImplementationStatus = implementationStatus;
		implementationStatus = newImplementationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.STATE__IMPLEMENTATION_STATUS,
					oldImplementationStatus, implementationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SWVSPackage.STATE__STATE_ID:
			return getStateId();
		case SWVSPackage.STATE__USE_CASE_STATUS:
			return getUseCaseStatus();
		case SWVSPackage.STATE__IMPLEMENTATION_STATUS:
			return getImplementationStatus();
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
		case SWVSPackage.STATE__STATE_ID:
			setStateId((String) newValue);
			return;
		case SWVSPackage.STATE__USE_CASE_STATUS:
			setUseCaseStatus((String) newValue);
			return;
		case SWVSPackage.STATE__IMPLEMENTATION_STATUS:
			setImplementationStatus((String) newValue);
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
		case SWVSPackage.STATE__STATE_ID:
			setStateId(STATE_ID_EDEFAULT);
			return;
		case SWVSPackage.STATE__USE_CASE_STATUS:
			setUseCaseStatus(USE_CASE_STATUS_EDEFAULT);
			return;
		case SWVSPackage.STATE__IMPLEMENTATION_STATUS:
			setImplementationStatus(IMPLEMENTATION_STATUS_EDEFAULT);
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
		case SWVSPackage.STATE__STATE_ID:
			return STATE_ID_EDEFAULT == null ? stateId != null : !STATE_ID_EDEFAULT.equals(stateId);
		case SWVSPackage.STATE__USE_CASE_STATUS:
			return USE_CASE_STATUS_EDEFAULT == null ? useCaseStatus != null
					: !USE_CASE_STATUS_EDEFAULT.equals(useCaseStatus);
		case SWVSPackage.STATE__IMPLEMENTATION_STATUS:
			return IMPLEMENTATION_STATUS_EDEFAULT == null ? implementationStatus != null
					: !IMPLEMENTATION_STATUS_EDEFAULT.equals(implementationStatus);
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
		result.append(" (stateId: ");
		result.append(stateId);
		result.append(", useCaseStatus: ");
		result.append(useCaseStatus);
		result.append(", implementationStatus: ");
		result.append(implementationStatus);
		result.append(')');
		return result.toString();
	}

} //StateImpl
