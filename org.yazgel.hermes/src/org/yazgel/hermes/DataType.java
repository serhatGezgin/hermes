/**
 */
package org.yazgel.hermes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.hermes.DataType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.hermes.HermesPackage#getDataType()
 * @model annotation="gmf.node label='name' figure='rounded' label.icon='true' border.color='0,0,0'"
 * @generated
 */
public interface DataType extends Feature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.yazgel.hermes.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.yazgel.hermes.DataTypes
	 * @see #setType(DataTypes)
	 * @see org.yazgel.hermes.HermesPackage#getDataType_Type()
	 * @model required="true"
	 * @generated
	 */
	DataTypes getType();

	/**
	 * Sets the value of the '{@link org.yazgel.hermes.DataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.yazgel.hermes.DataTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypes value);

} // DataType
