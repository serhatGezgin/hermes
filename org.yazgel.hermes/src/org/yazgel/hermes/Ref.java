/**
 */
package org.yazgel.hermes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.hermes.Ref#getSource <em>Source</em>}</li>
 *   <li>{@link org.yazgel.hermes.Ref#getRefTo <em>Ref To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.hermes.HermesPackage#getRef()
 * @model annotation="gmf.link label='name' source='source' target='refTo' target.decoration='arrow' style='solid' width='1' color='0,0,0'"
 * @generated
 */
public interface Ref extends Feature {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see org.yazgel.hermes.HermesPackage#getRef_Source()
	 * @model required="true"
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link org.yazgel.hermes.Ref#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Ref To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref To</em>' reference.
	 * @see #setRefTo(Entity)
	 * @see org.yazgel.hermes.HermesPackage#getRef_RefTo()
	 * @model required="true"
	 * @generated
	 */
	Entity getRefTo();

	/**
	 * Sets the value of the '{@link org.yazgel.hermes.Ref#getRefTo <em>Ref To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref To</em>' reference.
	 * @see #getRefTo()
	 * @generated
	 */
	void setRefTo(Entity value);

} // Ref
