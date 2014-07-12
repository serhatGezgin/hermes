/**
 */
package org.yazgel.hermes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yazgel.hermes.Entity;
import org.yazgel.hermes.HermesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.hermes.impl.PackageImpl#getOwnedEntity <em>Owned Entity</em>}</li>
 *   <li>{@link org.yazgel.hermes.impl.PackageImpl#getSubPackage <em>Sub Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements org.yazgel.hermes.Package {
	/**
	 * The cached value of the '{@link #getOwnedEntity() <em>Owned Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> ownedEntity;

	/**
	 * The cached value of the '{@link #getSubPackage() <em>Sub Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<org.yazgel.hermes.Package> subPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HermesPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getOwnedEntity() {
		if (ownedEntity == null) {
			ownedEntity = new EObjectContainmentEList<Entity>(Entity.class, this, HermesPackage.PACKAGE__OWNED_ENTITY);
		}
		return ownedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.yazgel.hermes.Package> getSubPackage() {
		if (subPackage == null) {
			subPackage = new EObjectContainmentEList<org.yazgel.hermes.Package>(org.yazgel.hermes.Package.class, this, HermesPackage.PACKAGE__SUB_PACKAGE);
		}
		return subPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HermesPackage.PACKAGE__OWNED_ENTITY:
				return ((InternalEList<?>)getOwnedEntity()).basicRemove(otherEnd, msgs);
			case HermesPackage.PACKAGE__SUB_PACKAGE:
				return ((InternalEList<?>)getSubPackage()).basicRemove(otherEnd, msgs);
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
			case HermesPackage.PACKAGE__OWNED_ENTITY:
				return getOwnedEntity();
			case HermesPackage.PACKAGE__SUB_PACKAGE:
				return getSubPackage();
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
			case HermesPackage.PACKAGE__OWNED_ENTITY:
				getOwnedEntity().clear();
				getOwnedEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case HermesPackage.PACKAGE__SUB_PACKAGE:
				getSubPackage().clear();
				getSubPackage().addAll((Collection<? extends org.yazgel.hermes.Package>)newValue);
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
			case HermesPackage.PACKAGE__OWNED_ENTITY:
				getOwnedEntity().clear();
				return;
			case HermesPackage.PACKAGE__SUB_PACKAGE:
				getSubPackage().clear();
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
			case HermesPackage.PACKAGE__OWNED_ENTITY:
				return ownedEntity != null && !ownedEntity.isEmpty();
			case HermesPackage.PACKAGE__SUB_PACKAGE:
				return subPackage != null && !subPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
