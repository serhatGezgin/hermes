/**
 */
package org.yazgel.hermes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yazgel.hermes.Entity;
import org.yazgel.hermes.EntityAnnotation;
import org.yazgel.hermes.Feature;
import org.yazgel.hermes.HermesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.hermes.impl.EntityImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.yazgel.hermes.impl.EntityImpl#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link org.yazgel.hermes.impl.EntityImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends NamedElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getOwnedFeature() <em>Owned Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> ownedFeature;

	/**
	 * The cached value of the '{@link #getSuperEntity() <em>Super Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity superEntity;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityAnnotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HermesPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getOwnedFeature() {
		if (ownedFeature == null) {
			ownedFeature = new EObjectContainmentEList<Feature>(Feature.class, this, HermesPackage.ENTITY__OWNED_FEATURE);
		}
		return ownedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSuperEntity() {
		if (superEntity != null && superEntity.eIsProxy()) {
			InternalEObject oldSuperEntity = (InternalEObject)superEntity;
			superEntity = (Entity)eResolveProxy(oldSuperEntity);
			if (superEntity != oldSuperEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HermesPackage.ENTITY__SUPER_ENTITY, oldSuperEntity, superEntity));
			}
		}
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSuperEntity() {
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperEntity(Entity newSuperEntity) {
		Entity oldSuperEntity = superEntity;
		superEntity = newSuperEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HermesPackage.ENTITY__SUPER_ENTITY, oldSuperEntity, superEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EDataTypeUniqueEList<EntityAnnotation>(EntityAnnotation.class, this, HermesPackage.ENTITY__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HermesPackage.ENTITY__OWNED_FEATURE:
				return ((InternalEList<?>)getOwnedFeature()).basicRemove(otherEnd, msgs);
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
			case HermesPackage.ENTITY__OWNED_FEATURE:
				return getOwnedFeature();
			case HermesPackage.ENTITY__SUPER_ENTITY:
				if (resolve) return getSuperEntity();
				return basicGetSuperEntity();
			case HermesPackage.ENTITY__ANNOTATIONS:
				return getAnnotations();
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
			case HermesPackage.ENTITY__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case HermesPackage.ENTITY__SUPER_ENTITY:
				setSuperEntity((Entity)newValue);
				return;
			case HermesPackage.ENTITY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EntityAnnotation>)newValue);
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
			case HermesPackage.ENTITY__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case HermesPackage.ENTITY__SUPER_ENTITY:
				setSuperEntity((Entity)null);
				return;
			case HermesPackage.ENTITY__ANNOTATIONS:
				getAnnotations().clear();
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
			case HermesPackage.ENTITY__OWNED_FEATURE:
				return ownedFeature != null && !ownedFeature.isEmpty();
			case HermesPackage.ENTITY__SUPER_ENTITY:
				return superEntity != null;
			case HermesPackage.ENTITY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (annotations: ");
		result.append(annotations);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
