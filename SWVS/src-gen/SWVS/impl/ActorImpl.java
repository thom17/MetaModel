/**
 */
package SWVS.impl;

import SWVS.Actor;
import SWVS.SWVSPackage;
import SWVS.UseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SWVS.impl.ActorImpl#getActorType <em>Actor Type</em>}</li>
 *   <li>{@link SWVS.impl.ActorImpl#getActUsecases <em>Act Usecases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends ObjectImpl implements Actor {
	/**
	 * The default value of the '{@link #getActorType() <em>Actor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActorType() <em>Actor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorType()
	 * @generated
	 * @ordered
	 */
	protected String actorType = ACTOR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActUsecases() <em>Act Usecases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActUsecases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> actUsecases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SWVSPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorType() {
		return actorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorType(String newActorType) {
		String oldActorType = actorType;
		actorType = newActorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SWVSPackage.ACTOR__ACTOR_TYPE, oldActorType,
					actorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getActUsecases() {
		if (actUsecases == null) {
			actUsecases = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this,
					SWVSPackage.ACTOR__ACT_USECASES, SWVSPackage.USE_CASE__ACT_ACTORS);
		}
		return actUsecases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SWVSPackage.ACTOR__ACT_USECASES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActUsecases()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SWVSPackage.ACTOR__ACT_USECASES:
			return ((InternalEList<?>) getActUsecases()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SWVSPackage.ACTOR__ACTOR_TYPE:
			return getActorType();
		case SWVSPackage.ACTOR__ACT_USECASES:
			return getActUsecases();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SWVSPackage.ACTOR__ACTOR_TYPE:
			setActorType((String) newValue);
			return;
		case SWVSPackage.ACTOR__ACT_USECASES:
			getActUsecases().clear();
			getActUsecases().addAll((Collection<? extends UseCase>) newValue);
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
		case SWVSPackage.ACTOR__ACTOR_TYPE:
			setActorType(ACTOR_TYPE_EDEFAULT);
			return;
		case SWVSPackage.ACTOR__ACT_USECASES:
			getActUsecases().clear();
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
		case SWVSPackage.ACTOR__ACTOR_TYPE:
			return ACTOR_TYPE_EDEFAULT == null ? actorType != null : !ACTOR_TYPE_EDEFAULT.equals(actorType);
		case SWVSPackage.ACTOR__ACT_USECASES:
			return actUsecases != null && !actUsecases.isEmpty();
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
		result.append(" (actorType: ");
		result.append(actorType);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
