/**
 */
package org.yazgel.hermes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.hermes.Entity;
import org.yazgel.hermes.HermesPackage;
import org.yazgel.hermes.Ref;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.hermes.impl.RefImpl#getRefTo <em>Ref To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefImpl extends FeatureImpl implements Ref {
	/**
	 * The cached value of the '{@link #getRefTo() <em>Ref To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTo()
	 * @generated
	 * @ordered
	 */
	protected Entity refTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HermesPackage.Literals.REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getRefTo() {
		if (refTo != null && refTo.eIsProxy()) {
			InternalEObject oldRefTo = (InternalEObject)refTo;
			refTo = (Entity)eResolveProxy(oldRefTo);
			if (refTo != oldRefTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HermesPackage.REF__REF_TO, oldRefTo, refTo));
			}
		}
		return refTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetRefTo() {
		return refTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefTo(Entity newRefTo) {
		Entity oldRefTo = refTo;
		refTo = newRefTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HermesPackage.REF__REF_TO, oldRefTo, refTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HermesPackage.REF__REF_TO:
				if (resolve) return getRefTo();
				return basicGetRefTo();
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
			case HermesPackage.REF__REF_TO:
				setRefTo((Entity)newValue);
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
			case HermesPackage.REF__REF_TO:
				setRefTo((Entity)null);
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
			case HermesPackage.REF__REF_TO:
				return refTo != null;
		}
		return super.eIsSet(featureID);
	}

} //RefImpl
