/**
 */
package gstock.tests;

import gstock.Colonnesimple;
import gstock.GstockFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colonnesimple</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColonnesimpleTest extends ColonneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColonnesimpleTest.class);
	}

	/**
	 * Constructs a new Colonnesimple test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonnesimpleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Colonnesimple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Colonnesimple getFixture() {
		return (Colonnesimple)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GstockFactory.eINSTANCE.createColonnesimple());
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

} //ColonnesimpleTest
