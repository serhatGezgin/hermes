/**
 */
package org.yazgel.hermes.tests;

import junit.textui.TestRunner;

import org.yazgel.hermes.HermesFactory;
import org.yazgel.hermes.Ref;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefTest extends FeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RefTest.class);
	}

	/**
	 * Constructs a new Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Ref getFixture() {
		return (Ref)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HermesFactory.eINSTANCE.createRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RefTest
