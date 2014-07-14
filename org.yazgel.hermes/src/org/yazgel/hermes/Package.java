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
 *   <li>{@link org.yazgel.hermes.Package#getEntities <em>Entities</em>}</li>
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
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.hermes.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see org.yazgel.hermes.HermesPackage#getPackage_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

} // Package
