/**
 */
package org.yazgel.hermes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.hermes.Package#getOwnedEntity <em>Owned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.hermes.HermesPackage#getPackage()
 * @model annotation="gmf.diagram foo='bar'"
 *        annotation="gmf.node label='name' figure='rectangle' border.color='0,0,0' color='200,191,231' border.style='solid' label.placement='internal' label.icon='true'"
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.hermes.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entity</em>' containment reference list.
	 * @see org.yazgel.hermes.HermesPackage#getPackage_OwnedEntity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getOwnedEntity();

} // Package
