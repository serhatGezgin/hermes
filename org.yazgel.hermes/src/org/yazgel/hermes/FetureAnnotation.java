/**
 */
package org.yazgel.hermes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feture Annotation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.yazgel.hermes.HermesPackage#getFetureAnnotation()
 * @model
 * @generated
 */
public enum FetureAnnotation implements Enumerator {
	/**
	 * The '<em><b>Index</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEX_VALUE
	 * @generated
	 * @ordered
	 */
	INDEX(0, "Index", "Index"),

	/**
	 * The '<em><b>Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(1, "Id", "Id"),

	/**
	 * The '<em><b>Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD(2, "Load", "Load"),

	/**
	 * The '<em><b>Ignore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE(3, "Ignore", "Ignore");

	/**
	 * The '<em><b>Index</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Index</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDEX
	 * @model name="Index"
	 * @generated
	 * @ordered
	 */
	public static final int INDEX_VALUE = 0;

	/**
	 * The '<em><b>Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID
	 * @model name="Id"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 1;

	/**
	 * The '<em><b>Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD
	 * @model name="Load"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_VALUE = 2;

	/**
	 * The '<em><b>Ignore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ignore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGNORE
	 * @model name="Ignore"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Feture Annotation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FetureAnnotation[] VALUES_ARRAY =
		new FetureAnnotation[] {
			INDEX,
			ID,
			LOAD,
			IGNORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Feture Annotation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FetureAnnotation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feture Annotation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FetureAnnotation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FetureAnnotation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feture Annotation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FetureAnnotation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FetureAnnotation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feture Annotation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FetureAnnotation get(int value) {
		switch (value) {
			case INDEX_VALUE: return INDEX;
			case ID_VALUE: return ID;
			case LOAD_VALUE: return LOAD;
			case IGNORE_VALUE: return IGNORE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FetureAnnotation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FetureAnnotation
