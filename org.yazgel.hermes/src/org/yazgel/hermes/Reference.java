/**
 */
package org.yazgel.hermes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.hermes.Reference#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.hermes.HermesPackage#getReference()
 * @model annotation="gmf.link label='name' source='source' target='refTo' target.decoration='arrow' style='solid' width='1' color='0,0,0'"
 * @generated
 */
public interface Reference extends Feature {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Entity)
	 * @see org.yazgel.hermes.HermesPackage#getReference_Reference()
	 * @model required="true"
	 * @generated
	 */
	Entity getReference();

	/**
	 * Sets the value of the '{@link org.yazgel.hermes.Reference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Entity value);

} // Reference
